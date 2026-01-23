package com.robinhood.compose.bento.component.text;

import androidx.compose.foundation.DarkTheme;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.layout.SubcomposeLayoutKt;
import androidx.compose.p011ui.layout.SubcomposeMeasureScope;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.Constraints2;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.util.DayNightPreview;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.PrimitiveIterators6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* compiled from: BentoTextWithTrailingIcon.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aG\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\n2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\rH\u0007¢\u0006\u0002\u0010\u000e\u001a\r\u0010\u000f\u001a\u00020\u0004H\u0001¢\u0006\u0002\u0010\u0010\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011²\u0006\f\u0010\u0012\u001a\u0004\u0018\u00010\u000bX\u008a\u008e\u0002"}, m3636d2 = {"TEXT_SLOT", "", "ICON_SLOT", "BentoTextWithTrailingIcon", "", "state", "Lcom/robinhood/compose/bento/component/text/BentoTextWithTrailingIconState;", "modifier", "Landroidx/compose/ui/Modifier;", "onTextLayout", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "onIconClick", "Lkotlin/Function0;", "(Lcom/robinhood/compose/bento/component/text/BentoTextWithTrailingIconState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "PreviewTextWithTrailingIcon", "(Landroidx/compose/runtime/Composer;I)V", "lib-compose-bento_externalRelease", "textLayoutResultState"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.bento.component.text.BentoTextWithTrailingIconKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class BentoTextWithTrailingIcon {
    private static final String ICON_SLOT = "icon";
    private static final String TEXT_SLOT = "text";

    /* compiled from: BentoTextWithTrailingIcon.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.compose.bento.component.text.BentoTextWithTrailingIconKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BentoTextWithTrailingIcon7.values().length];
            try {
                iArr[BentoTextWithTrailingIcon7.FIRST_LINE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BentoTextWithTrailingIcon7.CENTER_COORDINATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BentoTextWithTrailingIcon7.LAST_LINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoTextWithTrailingIcon$lambda$11(BentoTextWithTrailingIconState bentoTextWithTrailingIconState, Modifier modifier, Function1 function1, Function0 function0, int i, int i2, Composer composer, int i3) {
        BentoTextWithTrailingIcon(bentoTextWithTrailingIconState, modifier, function1, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewTextWithTrailingIcon$lambda$12(int i, Composer composer, int i2) {
        PreviewTextWithTrailingIcon(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoTextWithTrailingIcon$lambda$1$lambda$0(TextLayoutResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0176  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BentoTextWithTrailingIcon(final BentoTextWithTrailingIconState state, Modifier modifier, Function1<? super TextLayoutResult, Unit> function1, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function1<? super TextLayoutResult, Unit> function12;
        int i5;
        Function0<Unit> function02;
        int i6;
        Modifier modifier3;
        Function1<? super TextLayoutResult, Unit> function13;
        TextStyle style;
        FontStyle fontStyleM21117getFontStyle4Lr2A7w;
        FontWeight fontWeight;
        TextDecoration textDecoration;
        final TextStyle textStyleM7655copyp1EtxEg$default;
        Function1<? super TextLayoutResult, Unit> function14;
        long jM21118getIconTint0d7_KjU;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        final float fMo5016toPx0680j_4;
        boolean zChanged;
        Object objRememberedValue2;
        final Function1<? super TextLayoutResult, Unit> function15;
        Modifier modifier4;
        final Function0<Unit> function03;
        final Function0<Unit> function04;
        final Function1<? super TextLayoutResult, Unit> function16;
        final Modifier modifier5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(2028124342);
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
                    function12 = function1;
                    i3 |= composerStartRestartGroup.changedInstance(function12) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 == 0) {
                    if ((i & 3072) == 0) {
                        function02 = function0;
                        i3 |= composerStartRestartGroup.changedInstance(function02) ? 2048 : 1024;
                    }
                    i6 = i3;
                    if ((i6 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                        modifier3 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                        if (i4 == 0) {
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = new Function1() { // from class: com.robinhood.compose.bento.component.text.BentoTextWithTrailingIconKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return BentoTextWithTrailingIcon.BentoTextWithTrailingIcon$lambda$1$lambda$0((TextLayoutResult) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            function13 = (Function1) objRememberedValue3;
                        } else {
                            function13 = function12;
                        }
                        if (i5 != 0) {
                            function02 = null;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2028124342, i6, -1, "com.robinhood.compose.bento.component.text.BentoTextWithTrailingIcon (BentoTextWithTrailingIcon.kt:82)");
                        }
                        Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        C2002Dp c2002DpM21120getSpacingAfterTextBeforeIconlTKBWiU = state.m21120getSpacingAfterTextBeforeIconlTKBWiU();
                        composerStartRestartGroup.startReplaceGroup(-887650349);
                        float fM21595getXsmallD9Ej5fM = c2002DpM21120getSpacingAfterTextBeforeIconlTKBWiU != null ? BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, 6).m21595getXsmallD9Ej5fM() : c2002DpM21120getSpacingAfterTextBeforeIconlTKBWiU.getValue();
                        composerStartRestartGroup.endReplaceGroup();
                        style = state.getStyle();
                        composerStartRestartGroup.startReplaceGroup(-887647869);
                        if (style == null) {
                            style = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getText(composerStartRestartGroup, 0).getStyle();
                        }
                        TextStyle textStyle = style;
                        composerStartRestartGroup.endReplaceGroup();
                        Color colorM21116getColorQN2ZGVo = state.m21116getColorQN2ZGVo();
                        Color.Companion companion2 = Color.INSTANCE;
                        long jM7661getColor0d7_KjU = (!(colorM21116getColorQN2ZGVo != null ? false : Color.m6707equalsimpl0(colorM21116getColorQN2ZGVo.getValue(), companion2.m6726getUnspecified0d7_KjU())) || state.m21116getColorQN2ZGVo() == null) ? textStyle.m7661getColor0d7_KjU() : state.m21116getColorQN2ZGVo().getValue();
                        fontStyleM21117getFontStyle4Lr2A7w = state.m21117getFontStyle4Lr2A7w();
                        if (fontStyleM21117getFontStyle4Lr2A7w == null) {
                            fontStyleM21117getFontStyle4Lr2A7w = textStyle.m7663getFontStyle4Lr2A7w();
                        }
                        FontStyle fontStyle = fontStyleM21117getFontStyle4Lr2A7w;
                        fontWeight = state.getFontWeight();
                        if (fontWeight == null) {
                            fontWeight = textStyle.getFontWeight();
                        }
                        FontWeight fontWeight2 = fontWeight;
                        textDecoration = state.getTextDecoration();
                        if (textDecoration == null) {
                            textDecoration = textStyle.getTextDecoration();
                        }
                        TextDecoration textDecoration2 = textDecoration;
                        TextAlign textAlignM21121getTextAlignbuA522U = state.m21121getTextAlignbuA522U();
                        textStyleM7655copyp1EtxEg$default = TextStyle.m7655copyp1EtxEg$default(textStyle, jM7661getColor0d7_KjU, 0L, fontWeight2, fontStyle, null, null, null, 0L, null, null, null, 0L, textDecoration2, null, null, textAlignM21121getTextAlignbuA522U == null ? textAlignM21121getTextAlignbuA522U.getValue() : textStyle.m7669getTextAligne0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16740338, null);
                        function14 = function13;
                        jM21118getIconTint0d7_KjU = Color.m6707equalsimpl0(state.m21118getIconTint0d7_KjU(), companion2.m6726getUnspecified0d7_KjU()) ? state.m21118getIconTint0d7_KjU() : textStyleM7655copyp1EtxEg$default.m7661getColor0d7_KjU();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        snapshotState = (SnapshotState) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        fMo5016toPx0680j_4 = density.mo5016toPx0680j_4(fM21595getXsmallD9Ej5fM);
                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                        zChanged = ((i6 & 14) != 4) | composerStartRestartGroup.changed(jM21118getIconTint0d7_KjU) | ((i6 & 7168) != 2048) | composerStartRestartGroup.changed(fMo5016toPx0680j_4) | composerStartRestartGroup.changed(textStyleM7655copyp1EtxEg$default) | ((i6 & 896) == 256);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged || objRememberedValue2 == companion.getEmpty()) {
                            final long j = jM21118getIconTint0d7_KjU;
                            function15 = function14;
                            modifier4 = modifier3;
                            function03 = function02;
                            Function2 function2 = new Function2() { // from class: com.robinhood.compose.bento.component.text.BentoTextWithTrailingIconKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return BentoTextWithTrailingIcon.BentoTextWithTrailingIcon$lambda$10$lambda$9(fMo5016toPx0680j_4, state, j, function03, textStyleM7655copyp1EtxEg$default, function15, snapshotState, (SubcomposeMeasureScope) obj, (Constraints) obj2);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(function2);
                            objRememberedValue2 = function2;
                        } else {
                            function15 = function14;
                            modifier4 = modifier3;
                            function03 = function02;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        SubcomposeLayoutKt.SubcomposeLayout(modifier4, (Function2) objRememberedValue2, composerStartRestartGroup, (i6 >> 3) & 14, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function04 = function03;
                        function16 = function15;
                        modifier5 = modifier4;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier5 = modifier2;
                        function16 = function12;
                        function04 = function02;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.text.BentoTextWithTrailingIconKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return BentoTextWithTrailingIcon.BentoTextWithTrailingIcon$lambda$11(state, modifier5, function16, function04, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 3072;
                function02 = function0;
                i6 = i3;
                if ((i6 & 1171) == 1170) {
                    if (i7 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    C2002Dp c2002DpM21120getSpacingAfterTextBeforeIconlTKBWiU2 = state.m21120getSpacingAfterTextBeforeIconlTKBWiU();
                    composerStartRestartGroup.startReplaceGroup(-887650349);
                    if (c2002DpM21120getSpacingAfterTextBeforeIconlTKBWiU2 != null) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    style = state.getStyle();
                    composerStartRestartGroup.startReplaceGroup(-887647869);
                    if (style == null) {
                    }
                    TextStyle textStyle2 = style;
                    composerStartRestartGroup.endReplaceGroup();
                    Color colorM21116getColorQN2ZGVo2 = state.m21116getColorQN2ZGVo();
                    Color.Companion companion22 = Color.INSTANCE;
                    if (colorM21116getColorQN2ZGVo2 != null ? false : Color.m6707equalsimpl0(colorM21116getColorQN2ZGVo2.getValue(), companion22.m6726getUnspecified0d7_KjU())) {
                        long jM7661getColor0d7_KjU2 = (!(colorM21116getColorQN2ZGVo2 != null ? false : Color.m6707equalsimpl0(colorM21116getColorQN2ZGVo2.getValue(), companion22.m6726getUnspecified0d7_KjU())) || state.m21116getColorQN2ZGVo() == null) ? textStyle2.m7661getColor0d7_KjU() : state.m21116getColorQN2ZGVo().getValue();
                        fontStyleM21117getFontStyle4Lr2A7w = state.m21117getFontStyle4Lr2A7w();
                        if (fontStyleM21117getFontStyle4Lr2A7w == null) {
                        }
                        FontStyle fontStyle2 = fontStyleM21117getFontStyle4Lr2A7w;
                        fontWeight = state.getFontWeight();
                        if (fontWeight == null) {
                        }
                        FontWeight fontWeight22 = fontWeight;
                        textDecoration = state.getTextDecoration();
                        if (textDecoration == null) {
                        }
                        TextDecoration textDecoration22 = textDecoration;
                        TextAlign textAlignM21121getTextAlignbuA522U2 = state.m21121getTextAlignbuA522U();
                        textStyleM7655copyp1EtxEg$default = TextStyle.m7655copyp1EtxEg$default(textStyle2, jM7661getColor0d7_KjU2, 0L, fontWeight22, fontStyle2, null, null, null, 0L, null, null, null, 0L, textDecoration22, null, null, textAlignM21121getTextAlignbuA522U2 == null ? textAlignM21121getTextAlignbuA522U2.getValue() : textStyle2.m7669getTextAligne0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16740338, null);
                        function14 = function13;
                        if (Color.m6707equalsimpl0(state.m21118getIconTint0d7_KjU(), companion22.m6726getUnspecified0d7_KjU())) {
                        }
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                        }
                        snapshotState = (SnapshotState) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        fMo5016toPx0680j_4 = density2.mo5016toPx0680j_4(fM21595getXsmallD9Ej5fM);
                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                        zChanged = ((i6 & 14) != 4) | composerStartRestartGroup.changed(jM21118getIconTint0d7_KjU) | ((i6 & 7168) != 2048) | composerStartRestartGroup.changed(fMo5016toPx0680j_4) | composerStartRestartGroup.changed(textStyleM7655copyp1EtxEg$default) | ((i6 & 896) == 256);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            final long j2 = jM21118getIconTint0d7_KjU;
                            function15 = function14;
                            modifier4 = modifier3;
                            function03 = function02;
                            Function2 function22 = new Function2() { // from class: com.robinhood.compose.bento.component.text.BentoTextWithTrailingIconKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return BentoTextWithTrailingIcon.BentoTextWithTrailingIcon$lambda$10$lambda$9(fMo5016toPx0680j_4, state, j2, function03, textStyleM7655copyp1EtxEg$default, function15, snapshotState, (SubcomposeMeasureScope) obj, (Constraints) obj2);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(function22);
                            objRememberedValue2 = function22;
                            composerStartRestartGroup.endReplaceGroup();
                            SubcomposeLayoutKt.SubcomposeLayout(modifier4, (Function2) objRememberedValue2, composerStartRestartGroup, (i6 >> 3) & 14, 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            function04 = function03;
                            function16 = function15;
                            modifier5 = modifier4;
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function12 = function1;
            i5 = i2 & 8;
            if (i5 == 0) {
            }
            function02 = function0;
            i6 = i3;
            if ((i6 & 1171) == 1170) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function12 = function1;
        i5 = i2 & 8;
        if (i5 == 0) {
        }
        function02 = function0;
        i6 = i3;
        if ((i6 & 1171) == 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final TextLayoutResult BentoTextWithTrailingIcon$lambda$4(SnapshotState<TextLayoutResult> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult BentoTextWithTrailingIcon$lambda$10$lambda$9(float f, final BentoTextWithTrailingIconState bentoTextWithTrailingIconState, final long j, final Function0 function0, TextStyle textStyle, Function1 function1, SnapshotState snapshotState, SubcomposeMeasureScope SubcomposeLayout, Constraints constraints) {
        int height;
        Integer numValueOf;
        Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
        final Placeable placeableMo7239measureBRTryo0 = ((Measurable) CollectionsKt.first((List) SubcomposeLayout.subcompose(ICON_SLOT, ComposableLambda3.composableLambdaInstance(1546540041, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.text.BentoTextWithTrailingIconKt$BentoTextWithTrailingIcon$2$1$iconPlaceables$1
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
                    ComposerKt.traceEventStart(1546540041, i, -1, "com.robinhood.compose.bento.component.text.BentoTextWithTrailingIcon.<anonymous>.<anonymous>.<anonymous> (BentoTextWithTrailingIcon.kt:104)");
                }
                BentoIcon2.m20644BentoIconFU0evQE(bentoTextWithTrailingIconState.getIcon(), bentoTextWithTrailingIconState.getIconContentDescription(), j, null, function0, bentoTextWithTrailingIconState.getUseAssetSize(), composer, 0, 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        })))).mo7239measureBRTryo0(Constraints2.Constraints$default(0, 0, 0, 0, 15, null));
        int width = placeableMo7239measureBRTryo0.getWidth();
        int height2 = placeableMo7239measureBRTryo0.getHeight();
        int iRoundToInt = 0;
        final Placeable placeableMo7239measureBRTryo02 = ((Measurable) CollectionsKt.first((List) SubcomposeLayout.subcompose("text", ComposableLambda3.composableLambdaInstance(-2098773803, true, new BentoTextWithTrailingIcon3(bentoTextWithTrailingIconState, textStyle, function1, snapshotState))))).mo7239measureBRTryo0(Constraints2.Constraints(0, MathKt.roundToInt(RangesKt.coerceAtLeast((Constraints.m7975getMaxWidthimpl(constraints.getValue()) - width) - f, 0.0f)), Constraints.m7976getMinHeightimpl(constraints.getValue()), Constraints.m7974getMaxHeightimpl(constraints.getValue())));
        if (bentoTextWithTrailingIconState.getText().length() > 0) {
            TextLayoutResult textLayoutResultBentoTextWithTrailingIcon$lambda$4 = BentoTextWithTrailingIcon$lambda$4(snapshotState);
            if (textLayoutResultBentoTextWithTrailingIcon$lambda$4 != null) {
                int i = WhenMappings.$EnumSwitchMapping$0[bentoTextWithTrailingIconState.getTrailingIconLocation().ordinal()];
                if (i == 1) {
                    numValueOf = 0;
                } else if (i == 2) {
                    numValueOf = null;
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    numValueOf = Integer.valueOf(RangesKt.coerceAtLeast(textLayoutResultBentoTextWithTrailingIcon$lambda$4.getLineCount() - 1, 0));
                }
                Iterator<Integer> it = RangesKt.until(0, textLayoutResultBentoTextWithTrailingIcon$lambda$4.getLineCount()).iterator();
                if (!it.hasNext()) {
                    throw new NoSuchElementException();
                }
                PrimitiveIterators6 primitiveIterators6 = (PrimitiveIterators6) it;
                float lineRight = textLayoutResultBentoTextWithTrailingIcon$lambda$4.getLineRight(primitiveIterators6.nextInt());
                while (it.hasNext()) {
                    lineRight = Math.max(lineRight, textLayoutResultBentoTextWithTrailingIcon$lambda$4.getLineRight(primitiveIterators6.nextInt()));
                }
                int iRoundToInt2 = MathKt.roundToInt(lineRight);
                if (numValueOf == null) {
                    iRoundToInt = MathKt.roundToInt(iRoundToInt2 + f);
                    height = (placeableMo7239measureBRTryo02.getHeight() - height2) / 2;
                } else {
                    int iRoundToInt3 = MathKt.roundToInt(textLayoutResultBentoTextWithTrailingIcon$lambda$4.getLineRight(numValueOf.intValue()));
                    if (textLayoutResultBentoTextWithTrailingIcon$lambda$4.getLineEnd(numValueOf.intValue(), true) > textLayoutResultBentoTextWithTrailingIcon$lambda$4.getLineStart(numValueOf.intValue())) {
                        if (!bentoTextWithTrailingIconState.getShouldSeparateIconAndText()) {
                            iRoundToInt2 = iRoundToInt3;
                        }
                        iRoundToInt = MathKt.roundToInt(iRoundToInt2 + f);
                    }
                    float lineTop = textLayoutResultBentoTextWithTrailingIcon$lambda$4.getLineTop(numValueOf.intValue());
                    height = MathKt.roundToInt(RangesKt.coerceAtLeast(lineTop + (((textLayoutResultBentoTextWithTrailingIcon$lambda$4.getLineBottom(numValueOf.intValue()) - lineTop) - height2) / 2.0f), 0.0f));
                }
            } else {
                iRoundToInt = MathKt.roundToInt(placeableMo7239measureBRTryo02.getWidth() + f);
                height = (placeableMo7239measureBRTryo02.getHeight() - height2) / 2;
            }
        } else {
            height = 0;
        }
        if (bentoTextWithTrailingIconState.getText().length() != 0) {
            width = Math.max(placeableMo7239measureBRTryo02.getWidth(), width + iRoundToInt);
        }
        if (bentoTextWithTrailingIconState.getText().length() != 0) {
            height2 = Math.max(placeableMo7239measureBRTryo02.getHeight(), height2 + height);
        }
        final int i2 = height;
        final int i3 = iRoundToInt;
        return MeasureScope.layout$default(SubcomposeLayout, width, height2, null, new Function1() { // from class: com.robinhood.compose.bento.component.text.BentoTextWithTrailingIconKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BentoTextWithTrailingIcon.BentoTextWithTrailingIcon$lambda$10$lambda$9$lambda$8(bentoTextWithTrailingIconState, placeableMo7239measureBRTryo02, placeableMo7239measureBRTryo0, i3, i2, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoTextWithTrailingIcon$lambda$10$lambda$9$lambda$8(BentoTextWithTrailingIconState bentoTextWithTrailingIconState, Placeable placeable, Placeable placeable2, int i, int i2, Placeable.PlacementScope layout) {
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        if (bentoTextWithTrailingIconState.getText().length() > 0) {
            Placeable.PlacementScope.placeRelative$default(layout, placeable, 0, 0, 0.0f, 4, null);
        }
        Placeable.PlacementScope.placeRelative$default(layout, placeable2, i, i2, 0.0f, 4, null);
        return Unit.INSTANCE;
    }

    @DayNightPreview
    public static final void PreviewTextWithTrailingIcon(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-554919829);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-554919829, i, -1, "com.robinhood.compose.bento.component.text.PreviewTextWithTrailingIcon (BentoTextWithTrailingIcon.kt:235)");
            }
            BentoTheme2.BentoTheme(Boolean.valueOf(!DarkTheme.isSystemInDarkTheme(composerStartRestartGroup, 0)), null, null, null, null, null, null, null, BentoTextWithTrailingIcon5.INSTANCE.getLambda$439691187$lib_compose_bento_externalRelease(), composerStartRestartGroup, 100663296, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.text.BentoTextWithTrailingIconKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoTextWithTrailingIcon.PreviewTextWithTrailingIcon$lambda$12(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
