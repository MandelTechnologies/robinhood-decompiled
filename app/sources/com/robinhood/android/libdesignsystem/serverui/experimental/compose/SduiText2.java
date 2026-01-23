package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import android.net.Uri;
import android.os.Parcelable;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.LayoutCoordinates2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.platform.UriHandler;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsProperties_androidKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.LinkInteractionListener;
import androidx.compose.p011ui.text.PlatformSpanStyle;
import androidx.compose.p011ui.text.SpanStyle;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import com.robinhood.android.gold.sparkle.compose.GoldSparkleBrush;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.serverdriven.experimental.api.Markdown;
import com.robinhood.models.serverdriven.experimental.api.PlainText;
import com.robinhood.models.serverdriven.experimental.api.RenderableText;
import com.robinhood.models.serverdriven.experimental.api.RichText;
import com.robinhood.models.serverdriven.experimental.api.Text;
import com.robinhood.models.serverdriven.experimental.api.ThemedColor;
import com.robinhood.utils.logging.CrashReporter;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import rh_server_driven_ui.p531v1.RenderableTextDto;
import rh_server_driven_ui.p531v1.TextDto;
import rh_server_driven_ui.p531v1.ThemedColorDto;

/* compiled from: SduiText.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a/\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\t2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\n\u001a!\u0010\u000b\u001a\u00020\f\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u0007¢\u0006\u0002\u0010\r¨\u0006\u000e²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u008e\u0002²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u008e\u0002"}, m3636d2 = {"SduiText", "", "ActionT", "Landroid/os/Parcelable;", "component", "Lcom/robinhood/models/serverdriven/experimental/api/Text;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/models/serverdriven/experimental/api/Text;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lrh_server_driven_ui/v1/TextDto;", "(Lrh_server_driven_ui/v1/TextDto;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "toAnnotatedString", "Landroidx/compose/ui/text/AnnotatedString;", "(Lcom/robinhood/models/serverdriven/experimental/api/Text;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/AnnotatedString;", "lib-sdui_externalRelease", "positionInWindow", "Landroidx/compose/ui/geometry/Offset;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTextKt, reason: use source file name */
/* loaded from: classes17.dex */
public final class SduiText2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiText$lambda$14(Text text, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SduiText(text, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiText$lambda$25(TextDto textDto, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SduiText(textDto, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x022e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <ActionT extends Parcelable> void SduiText(final Text<? extends ActionT> component, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        Object obj;
        RenderableText text;
        final Modifier modifier3;
        long j;
        int i4;
        Object obj2;
        Composer composer2;
        int i5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(component, "component");
        Composer composerStartRestartGroup = composer.startRestartGroup(-590911711);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(component) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-590911711, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiText (SduiText.kt:43)");
                }
                Color composeColor = SduiColors2.toComposeColor(component.getColor(), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(-930465575);
                long jM21425getFg0d7_KjU = composeColor != null ? BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU() : composeColor.getValue();
                composerStartRestartGroup.endReplaceGroup();
                ThemedColor link_color_override = component.getLink_color_override();
                composerStartRestartGroup.startReplaceGroup(-930462159);
                Color composeColor2 = link_color_override != null ? null : SduiColors2.toComposeColor(link_color_override, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-930463092);
                long jM21368getAccent0d7_KjU = composeColor2 != null ? BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21368getAccent0d7_KjU() : composeColor2.getValue();
                composerStartRestartGroup.endReplaceGroup();
                LocalDecoratorOverride localDecoratorOverride = (LocalDecoratorOverride) composerStartRestartGroup.consume(SduiDecoratorKt.getLocalSduiDecoratorModifiers());
                boolean z = localDecoratorOverride == null && localDecoratorOverride.getLocalComponentGoldSparkle();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue != companion.getEmpty()) {
                    obj = null;
                    objRememberedValue = SnapshotState3.mutableStateOf$default(Offset.m6534boximpl(Offset.m6535constructorimpl((Float.floatToRawIntBits(0.0f) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32))), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    obj = null;
                }
                final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                text = component.getText();
                if (text instanceof PlainText) {
                    Modifier modifier5 = modifier4;
                    if (text instanceof Markdown) {
                        composerStartRestartGroup.startReplaceGroup(1221543126);
                        final UriHandler uriHandler = (UriHandler) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalUriHandler());
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier5);
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
                        String text2 = ((Markdown) text).getText();
                        MarkdownStyle markdownStyleM21100withTextStylesYhh7B2I = BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(UtilKt.getComposeTextStyle(component.getStyle(), composerStartRestartGroup, 0), UtilKt.getComposeTextAlign(component.getAlignment()), jM21425getFg0d7_KjU, jM21368getAccent0d7_KjU, false, composerStartRestartGroup, BentoMarkdownText.$stable << 15, 16);
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(uriHandler);
                        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTextKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    return SduiText2.SduiText$lambda$11$lambda$10$lambda$9(uriHandler, (String) obj3);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        BentoMarkdownText2.BentoMarkdownText(text2, (Modifier) null, markdownStyleM21100withTextStylesYhh7B2I, (Function0<Unit>) null, (Function1<? super String, Unit>) objRememberedValue2, composerStartRestartGroup, MarkdownStyle.$stable << 6, 10);
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceGroup();
                        modifier3 = modifier5;
                    } else {
                        if (!(text instanceof RichText)) {
                            composerStartRestartGroup.startReplaceGroup(-930453180);
                            composerStartRestartGroup.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composerStartRestartGroup.startReplaceGroup(1222208014);
                        final UriHandler uriHandler2 = (UriHandler) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalUriHandler());
                        RichText richText = (RichText) text;
                        TextStyle textStyleM7655copyp1EtxEg$default = TextStyle.m7655copyp1EtxEg$default(UtilKt.getComposeTextStyle(component.getStyle(), composerStartRestartGroup, 0), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, UtilKt.getComposeTextAlign(component.getAlignment()), 0, 0L, null, null, null, 0, 0, null, 16744447, null);
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(uriHandler2);
                        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTextKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    return SduiText2.SduiText$lambda$13$lambda$12(uriHandler2, (Uri) obj3);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        modifier3 = modifier5;
                        BentoRichText.m15949BentoRichText0sCZWFg(richText, modifier3, textStyleM7655copyp1EtxEg$default, jM21425getFg0d7_KjU, jM21368getAccent0d7_KjU, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (Function1<? super Uri, Unit>) objRememberedValue3, composerStartRestartGroup, i3 & 112, 480);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceGroup();
                    }
                } else {
                    composerStartRestartGroup.startReplaceGroup(1220742799);
                    PlainText plainText = (PlainText) text;
                    String text3 = plainText.getText();
                    composerStartRestartGroup.startReplaceGroup(-930449426);
                    TextStyle composeTextStyle = UtilKt.getComposeTextStyle(component.getStyle(), composerStartRestartGroup, 0);
                    if (z) {
                        j = jM21425getFg0d7_KjU;
                        i4 = 1;
                        obj2 = obj;
                        composer2 = composerStartRestartGroup;
                        i5 = 1849434622;
                        composeTextStyle = TextStyle.m7654copyNs73l9s$default(composeTextStyle, GoldSparkleBrush.m15094sparkleEPk0efs(Brush.INSTANCE, SduiText$lambda$1(snapshotState), null, composer2, 6, 2), 0.0f, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 33554430, null);
                    } else {
                        j = jM21425getFg0d7_KjU;
                        i4 = 1;
                        obj2 = obj;
                        composer2 = composerStartRestartGroup;
                        i5 = 1849434622;
                    }
                    composer2.endReplaceGroup();
                    int composeTextAlign = UtilKt.getComposeTextAlign(component.getAlignment());
                    composer2.startReplaceGroup(-930435562);
                    Modifier modifierTestTag = TestTag3.testTag(modifier4, plainText.getText());
                    composer2.startReplaceGroup(i5);
                    Object objRememberedValue4 = composer2.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTextKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                return SduiText2.SduiText$lambda$5$lambda$4((SemanticsPropertyReceiver) obj3);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue4);
                    }
                    composer2.endReplaceGroup();
                    Modifier modifierSemantics$default = SemanticsModifier6.semantics$default(modifierTestTag, false, (Function1) objRememberedValue4, i4, obj2);
                    if (z) {
                        composer2.startReplaceGroup(5004770);
                        Object objRememberedValue5 = composer2.rememberedValue();
                        if (objRememberedValue5 == companion.getEmpty()) {
                            objRememberedValue5 = new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTextKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    return SduiText2.SduiText$lambda$8$lambda$7$lambda$6(snapshotState, (LayoutCoordinates) obj3);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue5);
                        }
                        composer2.endReplaceGroup();
                        modifierSemantics$default = OnGloballyPositionedModifier3.onGloballyPositioned(modifierSemantics$default, (Function1) objRememberedValue5);
                    }
                    composer2.endReplaceGroup();
                    Composer composer3 = composer2;
                    modifier3 = modifier4;
                    BentoText2.m20747BentoText38GnDrw(text3, modifierSemantics$default, Color.m6701boximpl(j), null, null, null, TextAlign.m7912boximpl(composeTextAlign), 0, false, 0, 0, null, 0, composeTextStyle, composer3, 0, 0, 8120);
                    composerStartRestartGroup = composer3;
                    composerStartRestartGroup.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTextKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        return SduiText2.SduiText$lambda$14(component, modifier3, i, i2, (Composer) obj3, ((Integer) obj4).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i6 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Color composeColor3 = SduiColors2.toComposeColor(component.getColor(), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(-930465575);
            long jM21425getFg0d7_KjU2 = composeColor3 != null ? BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU() : composeColor3.getValue();
            composerStartRestartGroup.endReplaceGroup();
            ThemedColor link_color_override2 = component.getLink_color_override();
            composerStartRestartGroup.startReplaceGroup(-930462159);
            if (link_color_override2 != null) {
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-930463092);
            long jM21368getAccent0d7_KjU2 = composeColor2 != null ? BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21368getAccent0d7_KjU() : composeColor2.getValue();
            composerStartRestartGroup.endReplaceGroup();
            LocalDecoratorOverride localDecoratorOverride2 = (LocalDecoratorOverride) composerStartRestartGroup.consume(SduiDecoratorKt.getLocalSduiDecoratorModifiers());
            if (localDecoratorOverride2 == null) {
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue != companion.getEmpty()) {
                }
                final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                text = component.getText();
                if (text instanceof PlainText) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void SduiText$lambda$2(SnapshotState<Offset> snapshotState, long j) {
        snapshotState.setValue(Offset.m6534boximpl(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiText$lambda$5$lambda$4(SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsProperties_androidKt.setTestTagsAsResourceId(semantics, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiText$lambda$8$lambda$7$lambda$6(SnapshotState snapshotState, LayoutCoordinates layoutCoords) {
        Intrinsics.checkNotNullParameter(layoutCoords, "layoutCoords");
        SduiText$lambda$2(snapshotState, LayoutCoordinates2.positionInWindow(layoutCoords));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiText$lambda$11$lambda$10$lambda$9(UriHandler uriHandler, String uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        uriHandler.openUri(uri);
        return Unit.INSTANCE;
    }

    private static final long SduiText$lambda$1(SnapshotState<Offset> snapshotState) {
        return snapshotState.getValue().getPackedValue();
    }

    private static final long SduiText$lambda$16(SnapshotState<Offset> snapshotState) {
        return snapshotState.getValue().getPackedValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiText$lambda$13$lambda$12(UriHandler uriHandler, Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        String string2 = uri.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        uriHandler.openUri(string2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0221  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SduiText(final TextDto component, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        RenderableTextDto.ConcreteDto concreteDto;
        RenderableTextDto.ConcreteDto concrete;
        Modifier modifier3;
        final SnapshotState snapshotState;
        Composer composer2;
        long j;
        int i4;
        Modifier modifierOnGloballyPositioned;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(component, "component");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1406390644);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(component) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1406390644, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiText (SduiText.kt:109)");
                }
                ThemedColorDto color = component.getColor();
                composerStartRestartGroup.startReplaceGroup(1373293276);
                Color composeColor = color != null ? null : SduiColors2.toComposeColor(color, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1373292773);
                long jM21425getFg0d7_KjU = composeColor != null ? BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU() : composeColor.getValue();
                composerStartRestartGroup.endReplaceGroup();
                ThemedColorDto link_color_override = component.getLink_color_override();
                composerStartRestartGroup.startReplaceGroup(1373296220);
                Color composeColor2 = link_color_override != null ? null : SduiColors2.toComposeColor(link_color_override, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1373295287);
                long jM21368getAccent0d7_KjU = composeColor2 != null ? BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21368getAccent0d7_KjU() : composeColor2.getValue();
                composerStartRestartGroup.endReplaceGroup();
                LocalDecoratorOverride localDecoratorOverride = (LocalDecoratorOverride) composerStartRestartGroup.consume(SduiDecoratorKt.getLocalSduiDecoratorModifiers());
                boolean z = localDecoratorOverride == null && localDecoratorOverride.getLocalComponentGoldSparkle();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue != companion.getEmpty()) {
                    concreteDto = null;
                    objRememberedValue = SnapshotState3.mutableStateOf$default(Offset.m6534boximpl(Offset.m6535constructorimpl((Float.floatToRawIntBits(0.0f) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32))), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    concreteDto = null;
                }
                SnapshotState snapshotState2 = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                RenderableTextDto text = component.getText();
                concrete = text == null ? text.getConcrete() : concreteDto;
                if (!(concrete instanceof RenderableTextDto.ConcreteDto.PlainText)) {
                    composerStartRestartGroup.startReplaceGroup(-377155214);
                    String text2 = ((RenderableTextDto.ConcreteDto.PlainText) concrete).getValue().getText();
                    composerStartRestartGroup.startReplaceGroup(1373311193);
                    TextStyle textStyleComposeTextStyleWithFont = UtilKt.composeTextStyleWithFont(component.getStyle(), component.getFont(), composerStartRestartGroup, 0);
                    if (z) {
                        Brush.Companion companion2 = Brush.INSTANCE;
                        long jSduiText$lambda$16 = SduiText$lambda$16(snapshotState2);
                        snapshotState = snapshotState2;
                        composer2 = composerStartRestartGroup;
                        j = jM21425getFg0d7_KjU;
                        i4 = 5004770;
                        textStyleComposeTextStyleWithFont = TextStyle.m7654copyNs73l9s$default(textStyleComposeTextStyleWithFont, GoldSparkleBrush.m15094sparkleEPk0efs(companion2, jSduiText$lambda$16, null, composer2, 6, 2), 0.0f, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 33554430, null);
                    } else {
                        snapshotState = snapshotState2;
                        composer2 = composerStartRestartGroup;
                        j = jM21425getFg0d7_KjU;
                        i4 = 5004770;
                    }
                    composer2.endReplaceGroup();
                    int composeTextAlign = UtilKt.getComposeTextAlign(component.getAlignment());
                    composer2.startReplaceGroup(1373321073);
                    if (z) {
                        composer2.startReplaceGroup(i4);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTextKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return SduiText2.SduiText$lambda$21$lambda$20$lambda$19(snapshotState, (LayoutCoordinates) obj);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceGroup();
                        modifierOnGloballyPositioned = OnGloballyPositionedModifier3.onGloballyPositioned(modifier4, (Function1) objRememberedValue2);
                    } else {
                        modifierOnGloballyPositioned = modifier4;
                    }
                    composer2.endReplaceGroup();
                    Composer composer3 = composer2;
                    BentoText2.m20747BentoText38GnDrw(text2, modifierOnGloballyPositioned, Color.m6701boximpl(j), null, null, null, TextAlign.m7912boximpl(composeTextAlign), 0, false, 0, 0, null, 0, textStyleComposeTextStyleWithFont, composer3, 0, 0, 8120);
                    composerStartRestartGroup = composer3;
                    composerStartRestartGroup.endReplaceGroup();
                    modifier3 = modifier4;
                } else {
                    Modifier modifier5 = modifier4;
                    if (concrete instanceof RenderableTextDto.ConcreteDto.MarkdownText) {
                        composerStartRestartGroup.startReplaceGroup(-376423769);
                        final UriHandler uriHandler = (UriHandler) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalUriHandler());
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), UtilKt.getComposeHorizontalAlignment(component.getAlignment()), composerStartRestartGroup, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier5);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                        modifier3 = modifier5;
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        String text3 = ((RenderableTextDto.ConcreteDto.MarkdownText) concrete).getValue().getText();
                        MarkdownStyle markdownStyleM21100withTextStylesYhh7B2I = BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(UtilKt.composeTextStyleWithFont(component.getStyle(), component.getFont(), composerStartRestartGroup, 0), UtilKt.getComposeTextAlign(component.getAlignment()), jM21425getFg0d7_KjU, jM21368getAccent0d7_KjU, false, composerStartRestartGroup, BentoMarkdownText.$stable << 15, 16);
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(uriHandler);
                        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTextKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return SduiText2.SduiText$lambda$24$lambda$23$lambda$22(uriHandler, (String) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        BentoMarkdownText2.BentoMarkdownText(text3, (Modifier) null, markdownStyleM21100withTextStylesYhh7B2I, (Function0<Unit>) null, (Function1<? super String, Unit>) objRememberedValue3, composerStartRestartGroup, MarkdownStyle.$stable << 6, 10);
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        modifier3 = modifier5;
                        if (concrete != null) {
                            composerStartRestartGroup.startReplaceGroup(1373304793);
                            composerStartRestartGroup.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composerStartRestartGroup.startReplaceGroup(1373354480);
                        composerStartRestartGroup.endReplaceGroup();
                    }
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTextKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SduiText2.SduiText$lambda$25(component, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            ThemedColorDto color2 = component.getColor();
            composerStartRestartGroup.startReplaceGroup(1373293276);
            if (color2 != null) {
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1373292773);
            long jM21425getFg0d7_KjU2 = composeColor != null ? BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU() : composeColor.getValue();
            composerStartRestartGroup.endReplaceGroup();
            ThemedColorDto link_color_override2 = component.getLink_color_override();
            composerStartRestartGroup.startReplaceGroup(1373296220);
            if (link_color_override2 != null) {
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1373295287);
            long jM21368getAccent0d7_KjU2 = composeColor2 != null ? BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21368getAccent0d7_KjU() : composeColor2.getValue();
            composerStartRestartGroup.endReplaceGroup();
            LocalDecoratorOverride localDecoratorOverride2 = (LocalDecoratorOverride) composerStartRestartGroup.consume(SduiDecoratorKt.getLocalSduiDecoratorModifiers());
            if (localDecoratorOverride2 == null) {
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue != companion.getEmpty()) {
                }
                SnapshotState snapshotState22 = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                RenderableTextDto text4 = component.getText();
                if (text4 == null) {
                }
                if (!(concrete instanceof RenderableTextDto.ConcreteDto.PlainText)) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier3;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void SduiText$lambda$17(SnapshotState<Offset> snapshotState, long j) {
        snapshotState.setValue(Offset.m6534boximpl(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiText$lambda$21$lambda$20$lambda$19(SnapshotState snapshotState, LayoutCoordinates layoutCoords) {
        Intrinsics.checkNotNullParameter(layoutCoords, "layoutCoords");
        SduiText$lambda$17(snapshotState, LayoutCoordinates2.positionInWindow(layoutCoords));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiText$lambda$24$lambda$23$lambda$22(UriHandler uriHandler, String uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        uriHandler.openUri(uri);
        return Unit.INSTANCE;
    }

    public static final <ActionT extends Parcelable> AnnotatedString toAnnotatedString(Text<? extends ActionT> text, Composer composer, int i) {
        int length;
        Intrinsics.checkNotNullParameter(text, "<this>");
        composer.startReplaceGroup(1035173651);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1035173651, i, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.toAnnotatedString (SduiText.kt:157)");
        }
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        RenderableText text2 = text.getText();
        composer.startReplaceGroup(-1630528644);
        if (text2 instanceof Markdown) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new RuntimeException("Text<ActionT>.toAnnotatedString doesn't support markdown yet."), true, null, 4, null);
            String text3 = ((Markdown) text2).getText();
            builder.append(text3);
            length = text3.length();
        } else if (text2 instanceof PlainText) {
            String text4 = ((PlainText) text2).getText();
            builder.append(text4);
            length = text4.length();
        } else {
            if (!(text2 instanceof RichText)) {
                throw new NoWhenBranchMatchedException();
            }
            RichText richText = (RichText) text2;
            builder.append(RichTexts2.m15959toAnnotatedStringV23IgeMak(richText, 0L, (LinkInteractionListener) null, composer, 0, 3));
            length = richText.getText().length();
        }
        composer.endReplaceGroup();
        long fontSize = TextStyles.toFontSize(text.getStyle(), composer, 0);
        FontWeight fontWeight = TextStyles.toFontWeight(text.getStyle());
        Color composeColor = SduiColors2.toComposeColor(text.getColor(), composer, 0);
        builder.addStyle(new SpanStyle(composeColor != null ? composeColor.getValue() : Color.INSTANCE.m6726getUnspecified0d7_KjU(), fontSize, fontWeight, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65528, (DefaultConstructorMarker) null), 0, length);
        AnnotatedString annotatedString = builder.toAnnotatedString();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return annotatedString;
    }
}
