package com.robinhood.compose.bento.component.text;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BentoTextWithTrailingIcon.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.compose.bento.component.text.ComposableSingletons$BentoTextWithTrailingIconKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class BentoTextWithTrailingIcon5 {
    public static final BentoTextWithTrailingIcon5 INSTANCE = new BentoTextWithTrailingIcon5();
    private static Function2<Composer, Integer, Unit> lambda$439691187 = ComposableLambda3.composableLambdaInstance(439691187, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.text.ComposableSingletons$BentoTextWithTrailingIconKt$lambda$439691187$1
        /* JADX WARN: Multi-variable type inference failed */
        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(439691187, i, -1, "com.robinhood.compose.bento.component.text.ComposableSingletons$BentoTextWithTrailingIconKt.lambda$439691187.<anonymous> (BentoTextWithTrailingIcon.kt:237)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(companion, ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer, 6).m21590getDefaultD9Ej5fM());
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, companion2.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierVerticalScroll$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(SizeKt.m5174width3ABfNKs(companion, C2002Dp.m7995constructorimpl(300)), bentoTheme.getColors(composer, 6).m21371getBg0d7_KjU(), null, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer, 6).m21593getSmallD9Ej5fM()), companion2.getStart(), composer, 0);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierM4872backgroundbw27NRU$default);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.INFO_24;
            BentoIcon4.Size24 size24 = new BentoIcon4.Size24(serverToBentoAssetMapper2);
            long jM21425getFg0d7_KjU = bentoTheme.getColors(composer, 6).m21425getFg0d7_KjU();
            BentoTextWithTrailingIcon7 bentoTextWithTrailingIcon7 = BentoTextWithTrailingIcon7.FIRST_LINE;
            int i2 = 196592;
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str = null;
            Color color = null;
            FontStyle fontStyle = null;
            FontWeight fontWeight = null;
            TextAlign textAlign = null;
            int i3 = 0;
            boolean z = false;
            int i4 = 0;
            int i5 = 0;
            boolean z2 = false;
            C2002Dp c2002Dp = null;
            BentoTextWithTrailingIcon.BentoTextWithTrailingIcon(new BentoTextWithTrailingIcon4("Hi", size24, str, jM21425getFg0d7_KjU, color, fontStyle, fontWeight, null, textAlign, i3, z, i4, i5, null, z2, c2002Dp, bentoTextWithTrailingIcon7, false, i2, defaultConstructorMarker), null, null, null, composer, 0, 14);
            BentoIcon4.Size24 size242 = new BentoIcon4.Size24(serverToBentoAssetMapper2);
            long jM21425getFg0d7_KjU2 = bentoTheme.getColors(composer, 6).m21425getFg0d7_KjU();
            BentoTextWithTrailingIcon7 bentoTextWithTrailingIcon72 = BentoTextWithTrailingIcon7.LAST_LINE;
            BentoTextWithTrailingIcon.BentoTextWithTrailingIcon(new BentoTextWithTrailingIcon4("Hi", size242, str, jM21425getFg0d7_KjU2, color, fontStyle, fontWeight, 0 == true ? 1 : 0, textAlign, i3, z, i4, i5, 0 == true ? 1 : 0, z2, c2002Dp, bentoTextWithTrailingIcon72, 0 == true ? 1 : 0, i2, defaultConstructorMarker), null, null, null, composer, 0, 14);
            BentoTextWithTrailingIcon7 bentoTextWithTrailingIcon73 = null;
            BentoTextWithTrailingIcon.BentoTextWithTrailingIcon(new BentoTextWithTrailingIcon4("Hi", new BentoIcon4.Size24(ServerToBentoAssetMapper2.INFO_12), str, bentoTheme.getColors(composer, 6).m21425getFg0d7_KjU(), color, fontStyle, fontWeight, 0 == true ? 1 : 0, textAlign, i3, z, i4, i5, 0 == true ? 1 : 0, true, c2002Dp, bentoTextWithTrailingIcon73, 0 == true ? 1 : 0, 245744, defaultConstructorMarker), null, null, null, composer, 0, 14);
            ServerToBentoAssetMapper2 serverToBentoAssetMapper22 = ServerToBentoAssetMapper2.INFO_16;
            BentoTextWithTrailingIcon.BentoTextWithTrailingIcon(new BentoTextWithTrailingIcon4("", new BentoIcon4.Size16(serverToBentoAssetMapper22), str, bentoTheme.getColors(composer, 6).m21425getFg0d7_KjU(), color, fontStyle, fontWeight, 0 == true ? 1 : 0, textAlign, i3, z, i4, i5, 0 == true ? 1 : 0, false, c2002Dp, bentoTextWithTrailingIcon73, 0 == true ? 1 : 0, 262128, defaultConstructorMarker), null, null, null, composer, 0, 14);
            int i6 = 57328;
            DefaultConstructorMarker defaultConstructorMarker2 = null;
            Color color2 = null;
            FontStyle fontStyle2 = null;
            FontWeight fontWeight2 = null;
            TextAlign textAlign2 = null;
            int i7 = 0;
            boolean z3 = false;
            int i8 = 0;
            boolean z4 = false;
            BentoTextWithTrailingIcon.BentoTextWithTrailingIcon(new BentoTextWithTrailingIcon4("Hello 2nd-line-wrap", new BentoIcon4.Size24(serverToBentoAssetMapper2), 0 == true ? 1 : 0, bentoTheme.getColors(composer, 6).m21425getFg0d7_KjU(), color2, fontStyle2, fontWeight2, 0 == true ? 1 : 0, textAlign2, i7, z3, 0 == true ? 1 : 0, i8, bentoTheme.getTypography(composer, 6).getDisplayCapsuleLarge(), z4, null, bentoTextWithTrailingIcon7, false, i6, defaultConstructorMarker2), null, null, null, composer, 0, 14);
            BentoTextWithTrailingIcon.BentoTextWithTrailingIcon(new BentoTextWithTrailingIcon4("Hello 2nd-line-wrap", new BentoIcon4.Size24(serverToBentoAssetMapper2), 0 == true ? 1 : 0, bentoTheme.getColors(composer, 6).m21425getFg0d7_KjU(), color2, fontStyle2, fontWeight2, 0 == true ? 1 : 0, textAlign2, i7, z3, 0 == true ? 1 : 0, i8, bentoTheme.getTypography(composer, 6).getDisplayCapsuleLarge(), z4, 0 == true ? 1 : 0, bentoTextWithTrailingIcon7, true, i6, defaultConstructorMarker2), null, null, null, composer, 0, 14);
            TextStyle displayCapsuleLarge = bentoTheme.getTypography(composer, 6).getDisplayCapsuleLarge();
            BentoIcon4.Size24 size243 = new BentoIcon4.Size24(serverToBentoAssetMapper2);
            long jM21425getFg0d7_KjU3 = bentoTheme.getColors(composer, 6).m21425getFg0d7_KjU();
            BentoTextWithTrailingIcon7 bentoTextWithTrailingIcon74 = BentoTextWithTrailingIcon7.CENTER_COORDINATE;
            BentoTextWithTrailingIcon.BentoTextWithTrailingIcon(new BentoTextWithTrailingIcon4("Hello 2nd-line-wrap", size243, str, jM21425getFg0d7_KjU3, null, null, null, 0 == true ? 1 : 0, null, 0, false, 0, 0, displayCapsuleLarge, false, null, bentoTextWithTrailingIcon74, 0 == true ? 1 : 0, 188400, null), null, null, null, composer, 0, 14);
            ServerToBentoAssetMapper2 serverToBentoAssetMapper23 = ServerToBentoAssetMapper2.QUESTION_16;
            BentoIcon4.Size16 size16 = new BentoIcon4.Size16(serverToBentoAssetMapper23);
            Color.Companion companion4 = Color.INSTANCE;
            boolean z5 = false;
            Object[] objArr = 0 == true ? 1 : 0;
            Object[] objArr2 = 0 == true ? 1 : 0;
            Object[] objArr3 = 0 == true ? 1 : 0;
            BentoTextWithTrailingIcon.BentoTextWithTrailingIcon(new BentoTextWithTrailingIcon4("This is a very long text that should definitely wrap to multiple lines and the icon should be placed after the first line", size16, objArr, companion4.m6717getBlue0d7_KjU(), null, null, null, null, null, 0, z5, objArr2, 0, 0 == true ? 1 : 0, z4, objArr3, bentoTextWithTrailingIcon7, false, 196592, defaultConstructorMarker2), null, null, null, composer, 0, 14);
            BentoTextWithTrailingIcon.BentoTextWithTrailingIcon(new BentoTextWithTrailingIcon4("This is a very long text that should definitely wrap to multiple lines and the icon should be placed after the last line", new BentoIcon4.Size16(serverToBentoAssetMapper23), null, companion4.m6724getRed0d7_KjU(), null, null, null, null, null, 0, false, 0, 0, null, false, null, bentoTextWithTrailingIcon72, false, 196592, null), null, null, null, composer, 0, 14);
            int i9 = 65520;
            DefaultConstructorMarker defaultConstructorMarker3 = null;
            String str2 = null;
            Color color3 = null;
            FontStyle fontStyle3 = null;
            FontWeight fontWeight3 = null;
            TextDecoration textDecoration = null;
            TextAlign textAlign3 = null;
            int i10 = 0;
            boolean z6 = false;
            int i11 = 0;
            int i12 = 0;
            TextStyle textStyle = null;
            boolean z7 = false;
            C2002Dp c2002Dp2 = null;
            boolean z8 = true;
            BentoTextWithTrailingIcon.BentoTextWithTrailingIcon(new BentoTextWithTrailingIcon4("This is a very long text that should definitely wrap to multiple lines and the icon should be placed on the center", new BentoIcon4.Size16(serverToBentoAssetMapper23), str2, companion4.m6721getGreen0d7_KjU(), color3, fontStyle3, fontWeight3, textDecoration, textAlign3, i10, z6, i11, i12, textStyle, z7, c2002Dp2, bentoTextWithTrailingIcon74, z8, i9, defaultConstructorMarker3), null, null, null, composer, 0, 14);
            BentoTextWithTrailingIcon.BentoTextWithTrailingIcon(new BentoTextWithTrailingIcon4("This is a very long text that should definitely wrap to multiple lines and the icon should be placed on the center. Testing even number of lines.", new BentoIcon4.Size16(serverToBentoAssetMapper23), str2, companion4.m6718getCyan0d7_KjU(), color3, fontStyle3, fontWeight3, textDecoration, textAlign3, i10, z6, i11, i12, textStyle, z7, c2002Dp2, bentoTextWithTrailingIcon74, z8, i9, defaultConstructorMarker3), null, null, null, composer, 0, 14);
            Object[] objArr4 = 0 == true ? 1 : 0;
            Object[] objArr5 = 0 == true ? 1 : 0;
            BentoTextWithTrailingIcon.BentoTextWithTrailingIcon(new BentoTextWithTrailingIcon4("Perfect fit text", new BentoIcon4.Size16(serverToBentoAssetMapper22), null, bentoTheme.getColors(composer, 6).m21425getFg0d7_KjU(), null, objArr4, null, null, 0 == true ? 1 : 0, 0, false, 0, 0, null, z5, null, null, false, 262128, objArr5), null, null, null, composer, 0, 14);
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composer, 0);
            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer, companion);
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor3);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            BentoTextWithTrailingIcon.BentoTextWithTrailingIcon(new BentoTextWithTrailingIcon4("In a row", new BentoIcon4.Size24(serverToBentoAssetMapper2), null, bentoTheme.getColors(composer, 6).m21425getFg0d7_KjU(), null, null, null, null, null, 0, false, 0, 0, null, false, null, null, false, 262128, null), SizeKt.wrapContentWidth$default(Row5.weight$default(row6, companion, 25.0f, false, 2, null), companion2.getStart(), false, 2, null), null, null, composer, 0, 12);
            Spacer2.Spacer(Row5.weight$default(row6, companion, 1.0f, false, 2, null), composer, 0);
            BentoText2.m20747BentoText38GnDrw("End", null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 6, 0, 16382);
            composer.endNode();
            composer.endNode();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$439691187$lib_compose_bento_externalRelease() {
        return lambda$439691187;
    }
}
