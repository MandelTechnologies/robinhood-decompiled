package androidx.compose.foundation.text;

import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.LayoutModifier4;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.TextStyle2;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState4;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.ranges.RangesKt;

/* compiled from: TextFieldSize.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0004²\u0006\n\u0010\u0005\u001a\u00020\u0006X\u008a\u0084\u0002"}, m3636d2 = {"textFieldMinSize", "Landroidx/compose/ui/Modifier;", ResourceTypes.STYLE, "Landroidx/compose/ui/text/TextStyle;", "foundation_release", "typeface", ""}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: androidx.compose.foundation.text.TextFieldSizeKt, reason: use source file name */
/* loaded from: classes.dex */
public final class TextFieldSize2 {
    public static final Modifier textFieldMinSize(Modifier modifier, final TextStyle textStyle) {
        return ComposedModifier2.composed$default(modifier, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.text.TextFieldSizeKt.textFieldMinSize.1
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            public final Modifier invoke(Modifier modifier2, Composer composer, int i) {
                composer.startReplaceGroup(1582736677);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1582736677, i, -1, "androidx.compose.foundation.text.textFieldMinSize.<anonymous> (TextFieldSize.kt:37)");
                }
                Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
                FontFamily.Resolver resolver = (FontFamily.Resolver) composer.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
                LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
                boolean zChanged = composer.changed(textStyle) | composer.changed(layoutDirection);
                TextStyle textStyle2 = textStyle;
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = TextStyle2.resolveDefaults(textStyle2, layoutDirection);
                    composer.updateRememberedValue(objRememberedValue);
                }
                TextStyle textStyle3 = (TextStyle) objRememberedValue;
                boolean zChanged2 = composer.changed(resolver) | composer.changed(textStyle3);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    FontFamily fontFamily = textStyle3.getFontFamily();
                    FontWeight fontWeight = textStyle3.getFontWeight();
                    if (fontWeight == null) {
                        fontWeight = FontWeight.INSTANCE.getNormal();
                    }
                    FontStyle fontStyleM7663getFontStyle4Lr2A7w = textStyle3.m7663getFontStyle4Lr2A7w();
                    int value = fontStyleM7663getFontStyle4Lr2A7w != null ? fontStyleM7663getFontStyle4Lr2A7w.getValue() : FontStyle.INSTANCE.m7708getNormal_LCdwA();
                    FontSynthesis fontSynthesisM7664getFontSynthesisZQGJjVo = textStyle3.m7664getFontSynthesisZQGJjVo();
                    objRememberedValue2 = resolver.mo7689resolveDPcqOEQ(fontFamily, fontWeight, value, fontSynthesisM7664getFontSynthesisZQGJjVo != null ? fontSynthesisM7664getFontSynthesisZQGJjVo.getValue() : FontSynthesis.INSTANCE.m7718getAllGVVA2EU());
                    composer.updateRememberedValue(objRememberedValue2);
                }
                SnapshotState4 snapshotState4 = (SnapshotState4) objRememberedValue2;
                TextStyle textStyle4 = textStyle;
                Object objRememberedValue3 = composer.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new TextFieldSize(layoutDirection, density, resolver, textStyle4, snapshotState4.getValue());
                    composer.updateRememberedValue(objRememberedValue3);
                }
                final TextFieldSize textFieldSize = (TextFieldSize) objRememberedValue3;
                textFieldSize.update(layoutDirection, density, resolver, textStyle3, snapshotState4.getValue());
                Modifier.Companion companion2 = Modifier.INSTANCE;
                boolean zChangedInstance = composer.changedInstance(textFieldSize);
                Object objRememberedValue4 = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new Function3<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: androidx.compose.foundation.text.TextFieldSizeKt$textFieldMinSize$1$1$1
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                            return m5436invoke3p2s80s(measureScope, measurable, constraints.getValue());
                        }

                        /* renamed from: invoke-3p2s80s, reason: not valid java name */
                        public final MeasureResult m5436invoke3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
                            long minSize = textFieldSize.getMinSize();
                            final Placeable placeableMo7239measureBRTryo0 = measurable.mo7239measureBRTryo0(Constraints.m7967copyZbe2FdA$default(j, RangesKt.coerceIn((int) (minSize >> 32), Constraints.m7977getMinWidthimpl(j), Constraints.m7975getMaxWidthimpl(j)), 0, RangesKt.coerceIn((int) (minSize & 4294967295L), Constraints.m7976getMinHeightimpl(j), Constraints.m7974getMaxHeightimpl(j)), 0, 10, null));
                            return MeasureScope.layout$default(measureScope, placeableMo7239measureBRTryo0.getWidth(), placeableMo7239measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.text.TextFieldSizeKt$textFieldMinSize$1$1$1.1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                    invoke2(placementScope);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(Placeable.PlacementScope placementScope) {
                                    Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo7239measureBRTryo0, 0, 0, 0.0f, 4, null);
                                }
                            }, 4, null);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue4);
                }
                Modifier modifierLayout = LayoutModifier4.layout(companion2, (Function3) objRememberedValue4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return modifierLayout;
            }
        }, 1, null);
    }
}
