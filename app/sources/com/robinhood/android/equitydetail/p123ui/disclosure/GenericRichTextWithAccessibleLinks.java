package com.robinhood.android.equitydetail.p123ui.disclosure;

import android.net.Uri;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.focus.FocusProperties;
import androidx.compose.p011ui.focus.FocusPropertiesKt;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.PlatformSpanStyle;
import androidx.compose.p011ui.text.PlatformTextStyle;
import androidx.compose.p011ui.text.SpanStyle;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.serverdriven.p347db.RichText;
import com.robinhood.models.serverdriven.p347db.ThemedColor;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: GenericRichTextWithAccessibleLinks.kt */
@Metadata(m3635d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\u001a[\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012²\u0006\f\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u008a\u008e\u0002"}, m3636d2 = {"GenericRichTextWithAccessibleLinks", "", "rich", "Lcom/robinhood/models/serverdriven/db/RichText;", "onOpenLink", "Lkotlin/Function1;", "Landroid/net/Uri;", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "modifier", "Landroidx/compose/ui/Modifier;", "textColor", "Landroidx/compose/ui/graphics/Color;", "linkColor", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "GenericRichTextWithAccessibleLinks-ZVMq8gA", "(Lcom/robinhood/models/serverdriven/db/RichText;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/Modifier;JJILandroidx/compose/runtime/Composer;II)V", "feature-equity-detail_externalDebug", "layout", "Landroidx/compose/ui/text/TextLayoutResult;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equitydetail.ui.disclosure.GenericRichTextWithAccessibleLinksKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class GenericRichTextWithAccessibleLinks {

    /* compiled from: GenericRichTextWithAccessibleLinks.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.equitydetail.ui.disclosure.GenericRichTextWithAccessibleLinksKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RichText.TextStyle.values().length];
            try {
                iArr[RichText.TextStyle.BOLD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RichText.TextStyle.ITALIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RichText.TextStyle.UNDERLINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RichText.TextStyle.HIGHLIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GenericRichTextWithAccessibleLinks_ZVMq8gA$lambda$23(RichText richText, Function1 function1, TextStyle textStyle, Modifier modifier, long j, long j2, int i, int i2, int i3, Composer composer, int i4) {
        m13865GenericRichTextWithAccessibleLinksZVMq8gA(richText, function1, textStyle, modifier, j, j2, i, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0628  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0638  */
    /* JADX WARN: Removed duplicated region for block: B:220:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0126  */
    /* renamed from: GenericRichTextWithAccessibleLinks-ZVMq8gA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m13865GenericRichTextWithAccessibleLinksZVMq8gA(final RichText rich, final Function1<? super Uri, Unit> onOpenLink, final TextStyle textStyle, Modifier modifier, long j, long j2, int i, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        long j3;
        long j4;
        int i5;
        int i6;
        long jM21426getFg20d7_KjU;
        long prime;
        int i7;
        Modifier modifier3;
        int iM7958getClipgIe3tQ8;
        long j5;
        long j6;
        AnnotatedString annotatedString;
        Object objRememberedValue;
        Composer.Companion companion;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        Object objRememberedValue2;
        TextLayoutResult textLayoutResultGenericRichTextWithAccessibleLinks_ZVMq8gA$lambda$5;
        final long j7;
        final int i8;
        final long j8;
        final Modifier modifier4;
        Iterator<T> it;
        Density density;
        final Function1<? super Uri, Unit> function1;
        boolean z;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(rich, "rich");
        Intrinsics.checkNotNullParameter(onOpenLink, "onOpenLink");
        Intrinsics.checkNotNullParameter(textStyle, "textStyle");
        Composer composerStartRestartGroup = composer.startRestartGroup(28166365);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(rich) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onOpenLink) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(textStyle) ? 256 : 128;
        }
        int i9 = i3 & 8;
        if (i9 == 0) {
            if ((i2 & 3072) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i2 & 24576) != 0) {
                if ((i3 & 16) == 0) {
                    j3 = j;
                    int i10 = composerStartRestartGroup.changed(j3) ? 16384 : 8192;
                    i4 |= i10;
                } else {
                    j3 = j;
                }
                i4 |= i10;
            } else {
                j3 = j;
            }
            if ((196608 & i2) != 0) {
                if ((i3 & 32) == 0) {
                    j4 = j2;
                    int i11 = composerStartRestartGroup.changed(j4) ? 131072 : 65536;
                    i4 |= i11;
                } else {
                    j4 = j2;
                }
                i4 |= i11;
            } else {
                j4 = j2;
            }
            i5 = i3 & 64;
            if (i5 == 0) {
                i4 |= 1572864;
                i6 = i;
            } else {
                i6 = i;
                if ((i2 & 1572864) == 0) {
                    i4 |= composerStartRestartGroup.changed(i6) ? 1048576 : 524288;
                }
            }
            if ((i4 & 599187) == 599186 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier5 = i9 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i3 & 16) == 0) {
                        jM21426getFg20d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21426getFg20d7_KjU();
                        i4 &= -57345;
                    } else {
                        jM21426getFg20d7_KjU = j3;
                    }
                    if ((i3 & 32) == 0) {
                        prime = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getPrime();
                        i4 &= -458753;
                    } else {
                        prime = j4;
                    }
                    if (i5 == 0) {
                        Modifier modifier6 = modifier5;
                        i7 = i4;
                        modifier3 = modifier6;
                        iM7958getClipgIe3tQ8 = TextOverflow.INSTANCE.m7958getClipgIe3tQ8();
                    } else {
                        Modifier modifier7 = modifier5;
                        i7 = i4;
                        modifier3 = modifier7;
                        iM7958getClipgIe3tQ8 = i6;
                    }
                    j5 = jM21426getFg20d7_KjU;
                    j6 = prime;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i3 & 16) != 0) {
                        i4 &= -57345;
                    }
                    if ((i3 & 32) != 0) {
                        i4 &= -458753;
                    }
                    i7 = i4;
                    iM7958getClipgIe3tQ8 = i6;
                    modifier3 = modifier2;
                    j5 = j3;
                    j6 = j4;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(28166365, i7, -1, "com.robinhood.android.equitydetail.ui.disclosure.GenericRichTextWithAccessibleLinks (GenericRichTextWithAccessibleLinks.kt:59)");
                }
                Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                composerStartRestartGroup.startReplaceGroup(1298091738);
                boolean z2 = true;
                AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                builder.append(rich.getText());
                composerStartRestartGroup.startReplaceGroup(1298097529);
                for (RichText.Attribute attribute : rich.getAttributes()) {
                    int location = attribute.getLocation();
                    int iCoerceAtMost = RangesKt.coerceAtMost(attribute.getLocation() + attribute.getLength(), rich.getText().length());
                    ThemedColor highlight_color = attribute.getHighlight_color();
                    composerStartRestartGroup.startReplaceGroup(1298104237);
                    Color composeColor = highlight_color == null ? null : SduiColors2.toComposeColor(highlight_color, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    Uri link = attribute.getLink();
                    if (link != null) {
                        builder.addStyle(new SpanStyle(j6, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 61438, (DefaultConstructorMarker) null), location, iCoerceAtMost);
                        String string2 = link.toString();
                        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                        builder.addStringAnnotation("<LINK>", string2, location, iCoerceAtMost);
                        Unit unit = Unit.INSTANCE;
                    }
                    RichText.TextStyle style = attribute.getStyle();
                    if (style != null) {
                        int i12 = WhenMappings.$EnumSwitchMapping$0[style.ordinal()];
                        z = true;
                        if (i12 == 1) {
                            builder.addStyle(new SpanStyle(0L, 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65531, (DefaultConstructorMarker) null), location, iCoerceAtMost);
                            Unit unit2 = Unit.INSTANCE;
                        } else if (i12 == 2) {
                            builder.addStyle(new SpanStyle(0L, 0L, (FontWeight) null, FontStyle.m7700boximpl(FontStyle.INSTANCE.m7707getItalic_LCdwA()), (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65527, (DefaultConstructorMarker) null), location, iCoerceAtMost);
                            Unit unit3 = Unit.INSTANCE;
                        } else if (i12 == 3) {
                            builder.addStyle(new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 61439, (DefaultConstructorMarker) null), location, iCoerceAtMost);
                            Unit unit4 = Unit.INSTANCE;
                        } else {
                            if (i12 != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            builder.addStyle(new SpanStyle(composeColor != null ? composeColor.getValue() : Color.INSTANCE.m6726getUnspecified0d7_KjU(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null), location, iCoerceAtMost);
                            Unit unit5 = Unit.INSTANCE;
                        }
                    } else {
                        z = true;
                    }
                    z2 = z;
                }
                composerStartRestartGroup.endReplaceGroup();
                annotatedString = builder.toAnnotatedString();
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue != companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                Modifier modifier8 = modifier3;
                int i13 = i7;
                Density density3 = density2;
                composer2 = composerStartRestartGroup;
                TextStyle textStyleM7655copyp1EtxEg$default = TextStyle.m7655copyp1EtxEg$default(textStyle, 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, new PlatformTextStyle(false), null, 0, 0, null, 16252927, null);
                Modifier.Companion companion3 = Modifier.INSTANCE;
                composer2.startReplaceGroup(5004770);
                objRememberedValue2 = composer2.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.equitydetail.ui.disclosure.GenericRichTextWithAccessibleLinksKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return GenericRichTextWithAccessibleLinks.m1979xd70632c8(snapshotState, (TextLayoutResult) obj);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceGroup();
                long j9 = j5;
                int i14 = iM7958getClipgIe3tQ8;
                TextKt.m6029TextIbK3jfQ(annotatedString, companion3, j9, 0L, null, null, null, 0L, null, null, 0L, i14, false, 0, 0, null, (Function1) objRememberedValue2, textStyleM7655copyp1EtxEg$default, composer2, ((i13 >> 6) & 896) | 48, ((i13 >> 15) & 112) | 1572864, 63480);
                textLayoutResultGenericRichTextWithAccessibleLinks_ZVMq8gA$lambda$5 = GenericRichTextWithAccessibleLinks_ZVMq8gA$lambda$5(snapshotState);
                composer2.startReplaceGroup(1838054195);
                if (textLayoutResultGenericRichTextWithAccessibleLinks_ZVMq8gA$lambda$5 != null && annotatedString.length() > 0) {
                    it = annotatedString.getStringAnnotations("<LINK>", 0, annotatedString.length()).iterator();
                    while (it.hasNext()) {
                        AnnotatedString.Range range = (AnnotatedString.Range) it.next();
                        int start = range.getStart();
                        int end = range.getEnd();
                        final Uri uri = Uri.parse((String) range.getItem());
                        final String strSubstring = annotatedString.getText().substring(start, end);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                        Rect bounds = textLayoutResultGenericRichTextWithAccessibleLinks_ZVMq8gA$lambda$5.getPathForRange(start, end).getBounds();
                        composer2.startReplaceGroup(1838077421);
                        if (bounds.isEmpty()) {
                            density = density3;
                        } else {
                            density = density3;
                            Modifier modifierM5171sizeVpY3zN4 = SizeKt.m5171sizeVpY3zN4(OffsetKt.m5124offsetVpY3zN4(Modifier.INSTANCE, density.mo5012toDpu2uoSUM(RangesKt.coerceAtLeast(bounds.getLeft(), 0.0f)), density.mo5012toDpu2uoSUM(RangesKt.coerceAtLeast(bounds.getTop(), 0.0f))), density.mo5012toDpu2uoSUM(RangesKt.coerceAtLeast(bounds.getRight() - bounds.getLeft(), 1.0f)), density.mo5012toDpu2uoSUM(RangesKt.coerceAtLeast(bounds.getBottom() - bounds.getTop(), 1.0f)));
                            composer2.startReplaceGroup(-1746271574);
                            int i15 = i13 & 112;
                            boolean zChanged = composer2.changed(strSubstring) | (i15 == 32) | composer2.changedInstance(uri);
                            Object objRememberedValue3 = composer2.rememberedValue();
                            if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                function1 = onOpenLink;
                                objRememberedValue3 = new Function1() { // from class: com.robinhood.android.equitydetail.ui.disclosure.GenericRichTextWithAccessibleLinksKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return GenericRichTextWithAccessibleLinks.m1975x4eaabba(strSubstring, function1, uri, (SemanticsPropertyReceiver) obj);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue3);
                            } else {
                                function1 = onOpenLink;
                            }
                            composer2.endReplaceGroup();
                            Modifier modifierSemantics$default = SemanticsModifier6.semantics$default(modifierM5171sizeVpY3zN4, false, (Function1) objRememberedValue3, 1, null);
                            composer2.startReplaceGroup(1849434622);
                            Object objRememberedValue4 = composer2.rememberedValue();
                            Composer.Companion companion4 = Composer.INSTANCE;
                            if (objRememberedValue4 == companion4.getEmpty()) {
                                objRememberedValue4 = InteractionSource2.MutableInteractionSource();
                                composer2.updateRememberedValue(objRememberedValue4);
                            }
                            InteractionSource3 interactionSource3 = (InteractionSource3) objRememberedValue4;
                            composer2.endReplaceGroup();
                            composer2.startReplaceGroup(-1633490746);
                            boolean zChangedInstance = (i15 == 32) | composer2.changedInstance(uri);
                            Object objRememberedValue5 = composer2.rememberedValue();
                            if (zChangedInstance || objRememberedValue5 == companion4.getEmpty()) {
                                objRememberedValue5 = new Function0() { // from class: com.robinhood.android.equitydetail.ui.disclosure.GenericRichTextWithAccessibleLinksKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return GenericRichTextWithAccessibleLinks.m1977xc398c400(function1, uri);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue5);
                            }
                            composer2.endReplaceGroup();
                            Modifier modifierM4891clickableO2vRcR0$default = ClickableKt.m4891clickableO2vRcR0$default(modifierSemantics$default, interactionSource3, null, false, null, null, (Function0) objRememberedValue5, 28, null);
                            composer2.startReplaceGroup(1849434622);
                            Object objRememberedValue6 = composer2.rememberedValue();
                            if (objRememberedValue6 == companion4.getEmpty()) {
                                objRememberedValue6 = new Function1() { // from class: com.robinhood.android.equitydetail.ui.disclosure.GenericRichTextWithAccessibleLinksKt$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return GenericRichTextWithAccessibleLinks.m1978x2424d359((FocusProperties) obj);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue6);
                            }
                            composer2.endReplaceGroup();
                            BoxKt.Box(FocusPropertiesKt.focusProperties(modifierM4891clickableO2vRcR0$default, (Function1) objRememberedValue6), composer2, 0);
                        }
                        composer2.endReplaceGroup();
                        density3 = density;
                    }
                }
                composer2.endReplaceGroup();
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j7 = j9;
                i8 = i14;
                j8 = j6;
                modifier4 = modifier8;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                i8 = i6;
                modifier4 = modifier2;
                j7 = j3;
                j8 = j4;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitydetail.ui.disclosure.GenericRichTextWithAccessibleLinksKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return GenericRichTextWithAccessibleLinks.GenericRichTextWithAccessibleLinks_ZVMq8gA$lambda$23(rich, onOpenLink, textStyle, modifier4, j7, j8, i8, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i4 |= 3072;
        modifier2 = modifier;
        if ((i2 & 24576) != 0) {
        }
        if ((196608 & i2) != 0) {
        }
        i5 = i3 & 64;
        if (i5 == 0) {
        }
        if ((i4 & 599187) == 599186) {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
                if (i9 == 0) {
                }
                if ((i3 & 16) == 0) {
                }
                if ((i3 & 32) == 0) {
                }
                if (i5 == 0) {
                }
                j5 = jM21426getFg20d7_KjU;
                j6 = prime;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Density density22 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                composerStartRestartGroup.startReplaceGroup(1298091738);
                boolean z22 = true;
                AnnotatedString.Builder builder2 = new AnnotatedString.Builder(0, 1, null);
                builder2.append(rich.getText());
                composerStartRestartGroup.startReplaceGroup(1298097529);
                while (r12.hasNext()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                annotatedString = builder2.toAnnotatedString();
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue != companion.getEmpty()) {
                }
                final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    Modifier modifier82 = modifier3;
                    int i132 = i7;
                    Density density32 = density22;
                    composer2 = composerStartRestartGroup;
                    TextStyle textStyleM7655copyp1EtxEg$default2 = TextStyle.m7655copyp1EtxEg$default(textStyle, 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, new PlatformTextStyle(false), null, 0, 0, null, 16252927, null);
                    Modifier.Companion companion32 = Modifier.INSTANCE;
                    composer2.startReplaceGroup(5004770);
                    objRememberedValue2 = composer2.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                    }
                    composer2.endReplaceGroup();
                    long j92 = j5;
                    int i142 = iM7958getClipgIe3tQ8;
                    TextKt.m6029TextIbK3jfQ(annotatedString, companion32, j92, 0L, null, null, null, 0L, null, null, 0L, i142, false, 0, 0, null, (Function1) objRememberedValue2, textStyleM7655copyp1EtxEg$default2, composer2, ((i132 >> 6) & 896) | 48, ((i132 >> 15) & 112) | 1572864, 63480);
                    textLayoutResultGenericRichTextWithAccessibleLinks_ZVMq8gA$lambda$5 = GenericRichTextWithAccessibleLinks_ZVMq8gA$lambda$5(snapshotState2);
                    composer2.startReplaceGroup(1838054195);
                    if (textLayoutResultGenericRichTextWithAccessibleLinks_ZVMq8gA$lambda$5 != null) {
                        it = annotatedString.getStringAnnotations("<LINK>", 0, annotatedString.length()).iterator();
                        while (it.hasNext()) {
                        }
                    }
                    composer2.endReplaceGroup();
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    j7 = j92;
                    i8 = i142;
                    j8 = j6;
                    modifier4 = modifier82;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final TextLayoutResult GenericRichTextWithAccessibleLinks_ZVMq8gA$lambda$5(SnapshotState<TextLayoutResult> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: GenericRichTextWithAccessibleLinks_ZVMq8gA$lambda$22$lambda$8$lambda$7 */
    public static final Unit m1979xd70632c8(SnapshotState snapshotState, TextLayoutResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        snapshotState.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: GenericRichTextWithAccessibleLinks_ZVMq8gA$lambda$22$lambda$21$lambda$15$lambda$14 */
    public static final Unit m1975x4eaabba(String str, final Function1 function1, final Uri uri, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setContentDescription(semantics, str);
        SemanticsPropertiesKt.onClick$default(semantics, null, new Function0() { // from class: com.robinhood.android.equitydetail.ui.disclosure.GenericRichTextWithAccessibleLinksKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(GenericRichTextWithAccessibleLinks.m1976xd06f83b5(function1, uri));
            }
        }, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: GenericRichTextWithAccessibleLinks_ZVMq8gA$lambda$22$lambda$21$lambda$15$lambda$14$lambda$13 */
    public static final boolean m1976xd06f83b5(Function1 function1, Uri uri) {
        function1.invoke(uri);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: GenericRichTextWithAccessibleLinks_ZVMq8gA$lambda$22$lambda$21$lambda$18$lambda$17 */
    public static final Unit m1977xc398c400(Function1 function1, Uri uri) {
        function1.invoke(uri);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: GenericRichTextWithAccessibleLinks_ZVMq8gA$lambda$22$lambda$21$lambda$20$lambda$19 */
    public static final Unit m1978x2424d359(FocusProperties focusProperties) {
        Intrinsics.checkNotNullParameter(focusProperties, "$this$focusProperties");
        focusProperties.setCanFocus(true);
        return Unit.INSTANCE;
    }
}
