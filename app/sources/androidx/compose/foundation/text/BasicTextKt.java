package androidx.compose.foundation.text;

import androidx.compose.foundation.text.modifiers.SelectableTextAnnotatedStringElement;
import androidx.compose.foundation.text.modifiers.SelectionController;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode3;
import androidx.compose.foundation.text.modifiers.TextStringSimpleElement;
import androidx.compose.foundation.text.selection.SelectionColors;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.foundation.text.selection.SelectionRegistrar2;
import androidx.compose.foundation.text.selection.TextSelectionColors2;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.graphics.Color3;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.Placeholder;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.Saver2;
import androidx.compose.runtime.saveable.Saver5;
import com.robinhood.utils.extensions.ResourceTypes;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BasicText.kt */
@Metadata(m3635d1 = {"\u0000¨\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u0086\u0001\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u009c\u0001\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00182\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\u0014\b\u0002\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u001a0\u00192\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001az\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0090\u0001\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00182\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\u0014\b\u0002\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u001a0\u00192\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010 \u001a%\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020$0#2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b%\u0010&\u001aG\u0010/\u001a\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020-\u0012\f\u0012\n\u0012\u0004\u0012\u00020.\u0018\u00010*0,\u0018\u00010'2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\f0*H\u0002¢\u0006\u0004\b/\u00100\u001aÌ\u0001\u0010>\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u00102\u001a\u0002012\u0014\u00105\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020403\u0018\u00010'2\u001c\u00107\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001060'\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\b\u00109\u001a\u0004\u0018\u0001082\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0014\u0010;\u001a\u0010\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002ø\u0001\u0000¢\u0006\u0004\b<\u0010=\u001aº\u0001\u0010B\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00182\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\u0006\u0010?\u001a\u00020\f2\u0014\b\u0002\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u00102\u001a\u0002012\b\u00109\u001a\u0004\u0018\u0001082\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0014\u0010;\u001a\u0010\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0003ø\u0001\u0000¢\u0006\u0004\b@\u0010A\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006D²\u0006\u000e\u0010C\u001a\u00020\u00188\n@\nX\u008a\u008e\u0002"}, m3636d2 = {"", "text", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/text/TextStyle;", ResourceTypes.STYLE, "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "", "onTextLayout", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "", "softWrap", "", "maxLines", "minLines", "Landroidx/compose/ui/graphics/ColorProducer;", ResourceTypes.COLOR, "Landroidx/compose/foundation/text/TextAutoSize;", "autoSize", "BasicText-RWo7tUw", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILandroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/foundation/text/TextAutoSize;Landroidx/compose/runtime/Composer;II)V", "BasicText", "Landroidx/compose/ui/text/AnnotatedString;", "", "Landroidx/compose/foundation/text/InlineTextContent;", "inlineContent", "BasicText-CL7eQgs", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILjava/util/Map;Landroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/foundation/text/TextAutoSize;Landroidx/compose/runtime/Composer;III)V", "BasicText-VhcvRP8", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILandroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILjava/util/Map;Landroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/text/selection/SelectionRegistrar;", "selectionRegistrar", "Landroidx/compose/runtime/saveable/Saver;", "", "selectionIdSaver", "(Landroidx/compose/foundation/text/selection/SelectionRegistrar;)Landroidx/compose/runtime/saveable/Saver;", "", "Landroidx/compose/ui/layout/Measurable;", "measurables", "Lkotlin/Function0;", "shouldMeasureLinks", "Lkotlin/Pair;", "Landroidx/compose/ui/layout/Placeable;", "Landroidx/compose/ui/unit/IntOffset;", "measureWithTextRangeMeasureConstraints", "(Ljava/util/List;Lkotlin/jvm/functions/Function0;)Ljava/util/List;", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "Landroidx/compose/ui/geometry/Rect;", "onPlaceholderLayout", "Landroidx/compose/foundation/text/modifiers/SelectionController;", "selectionController", "Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode$TextSubstitutionValue;", "onShowTranslation", "textModifier-CL7eQgs", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILandroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/modifiers/SelectionController;Landroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/TextAutoSize;)Landroidx/compose/ui/Modifier;", "textModifier", "hasInlineContent", "LayoutWithLinksAndInlineContent-11Od_4g", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/AnnotatedString;Lkotlin/jvm/functions/Function1;ZLjava/util/Map;Landroidx/compose/ui/text/TextStyle;IZIILandroidx/compose/ui/text/font/FontFamily$Resolver;Landroidx/compose/foundation/text/modifiers/SelectionController;Landroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/TextAutoSize;Landroidx/compose/runtime/Composer;III)V", "LayoutWithLinksAndInlineContent", "displayedText", "foundation_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class BasicTextKt {
    private static final AnnotatedString BasicText_CL7eQgs$lambda$5(SnapshotState<AnnotatedString> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011b A[PHI: r21
      0x011b: PHI (r21v15 int) = (r21v4 int), (r21v10 int), (r21v11 int) binds: [B:100:0x0119, B:110:0x0136, B:109:0x0133] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:188:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0100  */
    /* renamed from: BasicText-RWo7tUw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m5334BasicTextRWo7tUw(String str, Modifier modifier, TextStyle textStyle, Function1<? super TextLayoutResult, Unit> function1, int i, boolean z, int i2, int i3, Color3 color3, TextAutoSize textAutoSize, Composer composer, final int i4, final int i5) {
        int i6;
        Modifier modifier2;
        int i7;
        TextStyle textStyle2;
        int i8;
        Function1<? super TextLayoutResult, Unit> function12;
        int i9;
        int i10;
        int i11;
        boolean z2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        final String str2;
        final int i18;
        final TextAutoSize textAutoSize2;
        Composer composer2;
        final Modifier modifier3;
        final TextStyle textStyle3;
        final Function1<? super TextLayoutResult, Unit> function13;
        final int i19;
        final Color3 color32;
        final boolean z3;
        final int i20;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composer3;
        SelectionController selectionController;
        int i21;
        int i22;
        Modifier modifier4;
        Modifier modifierM5338textModifierCL7eQgs;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1040751001);
        if ((i5 & 1) != 0) {
            i6 = i4 | 6;
        } else if ((i4 & 6) == 0) {
            i6 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        int i23 = i5 & 2;
        if (i23 != 0) {
            i6 |= 48;
        } else {
            if ((i4 & 48) == 0) {
                modifier2 = modifier;
                i6 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i7 = i5 & 4;
            if (i7 == 0) {
                i6 |= 384;
            } else {
                if ((i4 & 384) == 0) {
                    textStyle2 = textStyle;
                    i6 |= composerStartRestartGroup.changed(textStyle2) ? 256 : 128;
                }
                i8 = i5 & 8;
                if (i8 != 0) {
                    i6 |= 3072;
                } else {
                    if ((i4 & 3072) == 0) {
                        function12 = function1;
                        i6 |= composerStartRestartGroup.changedInstance(function12) ? 2048 : 1024;
                    }
                    i9 = i5 & 16;
                    if (i9 == 0) {
                        i6 |= 24576;
                    } else {
                        if ((i4 & 24576) == 0) {
                            i10 = i;
                            i6 |= composerStartRestartGroup.changed(i10) ? 16384 : 8192;
                        }
                        i11 = i5 & 32;
                        if (i11 != 0) {
                            i6 |= 196608;
                            z2 = z;
                        } else {
                            z2 = z;
                            if ((i4 & 196608) == 0) {
                                i6 |= composerStartRestartGroup.changed(z2) ? 131072 : 65536;
                            }
                        }
                        i12 = i5 & 64;
                        if (i12 != 0) {
                            i6 |= 1572864;
                        } else if ((i4 & 1572864) == 0) {
                            i6 |= composerStartRestartGroup.changed(i2) ? 1048576 : 524288;
                        }
                        i13 = i5 & 128;
                        if (i13 != 0) {
                            i6 |= 12582912;
                        } else {
                            if ((i4 & 12582912) == 0) {
                                i14 = i13;
                                i6 |= composerStartRestartGroup.changed(i3) ? 8388608 : 4194304;
                            }
                            i15 = i5 & 256;
                            if (i15 != 0) {
                                if ((i4 & 100663296) == 0) {
                                    i16 = i15;
                                    i6 |= composerStartRestartGroup.changedInstance(color3) ? 67108864 : 33554432;
                                }
                                i17 = i5 & 512;
                                int i24 = 805306368;
                                if (i17 != 0) {
                                    i6 |= i24;
                                } else if ((i4 & 805306368) == 0) {
                                    i24 = (i4 & 1073741824) == 0 ? composerStartRestartGroup.changed(textAutoSize) : composerStartRestartGroup.changedInstance(textAutoSize) ? 536870912 : 268435456;
                                    i6 |= i24;
                                }
                                if (composerStartRestartGroup.shouldExecute((i6 & 306783379) != 306783378, i6 & 1)) {
                                    if (i23 != 0) {
                                        modifier2 = Modifier.INSTANCE;
                                    }
                                    TextStyle textStyle4 = i7 != 0 ? TextStyle.INSTANCE.getDefault() : textStyle2;
                                    Function1<? super TextLayoutResult, Unit> function14 = i8 != 0 ? null : function12;
                                    int iM7958getClipgIe3tQ8 = i9 != 0 ? TextOverflow.INSTANCE.m7958getClipgIe3tQ8() : i10;
                                    boolean z4 = i11 != 0 ? true : z2;
                                    int i25 = i12 != 0 ? Integer.MAX_VALUE : i2;
                                    int i26 = i14 != 0 ? 1 : i3;
                                    Color3 color33 = i16 != 0 ? null : color3;
                                    TextAutoSize textAutoSize3 = i17 != 0 ? null : textAutoSize;
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1040751001, i6, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:101)");
                                    }
                                    HeightInLinesModifier.validateMinMaxLines(i26, i25);
                                    final SelectionRegistrar selectionRegistrar = (SelectionRegistrar) composerStartRestartGroup.consume(SelectionRegistrar2.getLocalSelectionRegistrar());
                                    if (selectionRegistrar != null) {
                                        composerStartRestartGroup.startReplaceGroup(-1588802442);
                                        long selectionBackgroundColor = ((SelectionColors) composerStartRestartGroup.consume(TextSelectionColors2.getLocalTextSelectionColors())).getSelectionBackgroundColor();
                                        Object[] objArr = {selectionRegistrar};
                                        Saver<Long, Long> saverSelectionIdSaver = selectionIdSaver(selectionRegistrar);
                                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(selectionRegistrar);
                                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = new Function0<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectionController$selectableId$1$1
                                                {
                                                    super(0);
                                                }

                                                /* JADX WARN: Can't rename method to resolve collision */
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Long invoke() {
                                                    return Long.valueOf(selectionRegistrar.nextSelectableId());
                                                }
                                            };
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                        }
                                        Object objM6426rememberSaveable = RememberSaveable.m6426rememberSaveable(objArr, saverSelectionIdSaver, (String) null, (Function0<? extends Object>) objRememberedValue, composerStartRestartGroup, 0, 4);
                                        composer3 = composerStartRestartGroup;
                                        long jLongValue = ((Number) objM6426rememberSaveable).longValue();
                                        boolean zChanged = composer3.changed(jLongValue) | composer3.changed(selectionRegistrar) | composer3.changed(selectionBackgroundColor);
                                        Object objRememberedValue2 = composer3.rememberedValue();
                                        if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue2 = new SelectionController(jLongValue, selectionRegistrar, selectionBackgroundColor, null, 8, null);
                                            composer3.updateRememberedValue(objRememberedValue2);
                                        }
                                        composer3.endReplaceGroup();
                                        selectionController = (SelectionController) objRememberedValue2;
                                    } else {
                                        composer3 = composerStartRestartGroup;
                                        composer3.startReplaceGroup(-1588311278);
                                        composer3.endReplaceGroup();
                                        selectionController = null;
                                    }
                                    if (selectionController == null && function14 == null && textAutoSize3 == null) {
                                        composer3.startReplaceGroup(-1587511974);
                                        int i27 = i25;
                                        int i28 = i26;
                                        str2 = str;
                                        i21 = i27;
                                        i22 = i28;
                                        modifierM5338textModifierCL7eQgs = modifier2.then(new TextStringSimpleElement(str, textStyle4, (FontFamily.Resolver) composer3.consume(CompositionLocalsKt.getLocalFontFamilyResolver()), iM7958getClipgIe3tQ8, z4, i27, i28, color33, null));
                                        composer3.endReplaceGroup();
                                        modifier4 = modifier2;
                                    } else {
                                        i21 = i25;
                                        i22 = i26;
                                        str2 = str;
                                        composer3.startReplaceGroup(-1588155131);
                                        modifier4 = modifier2;
                                        modifierM5338textModifierCL7eQgs = m5338textModifierCL7eQgs(modifier4, new AnnotatedString(str2, null, 2, null), textStyle4, function14, iM7958getClipgIe3tQ8, z4, i21, i22, (FontFamily.Resolver) composer3.consume(CompositionLocalsKt.getLocalFontFamilyResolver()), null, null, selectionController, color33, null, textAutoSize3);
                                        composer3.endReplaceGroup();
                                    }
                                    EmptyMeasurePolicy emptyMeasurePolicy = EmptyMeasurePolicy.INSTANCE;
                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM5338textModifierCL7eQgs);
                                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                                    if (composer3.getApplier() == null) {
                                        Composables.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                                    Updater.m6390setimpl(composerM6388constructorimpl, emptyMeasurePolicy, companion.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    composer3.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    composer2 = composer3;
                                    modifier3 = modifier4;
                                    textStyle3 = textStyle4;
                                    function13 = function14;
                                    i20 = iM7958getClipgIe3tQ8;
                                    z3 = z4;
                                    i19 = i21;
                                    i18 = i22;
                                    color32 = color33;
                                    textAutoSize2 = textAutoSize3;
                                } else {
                                    str2 = str;
                                    composerStartRestartGroup.skipToGroupEnd();
                                    i18 = i3;
                                    textAutoSize2 = textAutoSize;
                                    composer2 = composerStartRestartGroup;
                                    modifier3 = modifier2;
                                    textStyle3 = textStyle2;
                                    function13 = function12;
                                    i19 = i2;
                                    color32 = color3;
                                    z3 = z2;
                                    i20 = i10;
                                }
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>(str2, modifier3, textStyle3, function13, i20, z3, i19, i18, color32, textAutoSize2, i4, i5) { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                                        final /* synthetic */ int $$changed;
                                        final /* synthetic */ int $$default;
                                        final /* synthetic */ Color3 $color;
                                        final /* synthetic */ int $maxLines;
                                        final /* synthetic */ int $minLines;
                                        final /* synthetic */ Modifier $modifier;
                                        final /* synthetic */ Function1<TextLayoutResult, Unit> $onTextLayout;
                                        final /* synthetic */ int $overflow;
                                        final /* synthetic */ boolean $softWrap;
                                        final /* synthetic */ TextStyle $style;
                                        final /* synthetic */ String $text;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                            this.$$changed = i4;
                                            this.$$default = i5;
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                            invoke(composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer4, int i29) {
                                            BasicTextKt.m5334BasicTextRWo7tUw(this.$text, this.$modifier, this.$style, this.$onTextLayout, this.$overflow, this.$softWrap, this.$maxLines, this.$minLines, this.$color, (TextAutoSize) null, composer4, RecomposeScopeImpl4.updateChangedFlags(this.$$changed | 1), this.$$default);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i6 |= 100663296;
                            i16 = i15;
                            i17 = i5 & 512;
                            int i242 = 805306368;
                            if (i17 != 0) {
                            }
                            if (composerStartRestartGroup.shouldExecute((i6 & 306783379) != 306783378, i6 & 1)) {
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        i14 = i13;
                        i15 = i5 & 256;
                        if (i15 != 0) {
                        }
                        i16 = i15;
                        i17 = i5 & 512;
                        int i2422 = 805306368;
                        if (i17 != 0) {
                        }
                        if (composerStartRestartGroup.shouldExecute((i6 & 306783379) != 306783378, i6 & 1)) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    i10 = i;
                    i11 = i5 & 32;
                    if (i11 != 0) {
                    }
                    i12 = i5 & 64;
                    if (i12 != 0) {
                    }
                    i13 = i5 & 128;
                    if (i13 != 0) {
                    }
                    i14 = i13;
                    i15 = i5 & 256;
                    if (i15 != 0) {
                    }
                    i16 = i15;
                    i17 = i5 & 512;
                    int i24222 = 805306368;
                    if (i17 != 0) {
                    }
                    if (composerStartRestartGroup.shouldExecute((i6 & 306783379) != 306783378, i6 & 1)) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                function12 = function1;
                i9 = i5 & 16;
                if (i9 == 0) {
                }
                i10 = i;
                i11 = i5 & 32;
                if (i11 != 0) {
                }
                i12 = i5 & 64;
                if (i12 != 0) {
                }
                i13 = i5 & 128;
                if (i13 != 0) {
                }
                i14 = i13;
                i15 = i5 & 256;
                if (i15 != 0) {
                }
                i16 = i15;
                i17 = i5 & 512;
                int i242222 = 805306368;
                if (i17 != 0) {
                }
                if (composerStartRestartGroup.shouldExecute((i6 & 306783379) != 306783378, i6 & 1)) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            textStyle2 = textStyle;
            i8 = i5 & 8;
            if (i8 != 0) {
            }
            function12 = function1;
            i9 = i5 & 16;
            if (i9 == 0) {
            }
            i10 = i;
            i11 = i5 & 32;
            if (i11 != 0) {
            }
            i12 = i5 & 64;
            if (i12 != 0) {
            }
            i13 = i5 & 128;
            if (i13 != 0) {
            }
            i14 = i13;
            i15 = i5 & 256;
            if (i15 != 0) {
            }
            i16 = i15;
            i17 = i5 & 512;
            int i2422222 = 805306368;
            if (i17 != 0) {
            }
            if (composerStartRestartGroup.shouldExecute((i6 & 306783379) != 306783378, i6 & 1)) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        textStyle2 = textStyle;
        i8 = i5 & 8;
        if (i8 != 0) {
        }
        function12 = function1;
        i9 = i5 & 16;
        if (i9 == 0) {
        }
        i10 = i;
        i11 = i5 & 32;
        if (i11 != 0) {
        }
        i12 = i5 & 64;
        if (i12 != 0) {
        }
        i13 = i5 & 128;
        if (i13 != 0) {
        }
        i14 = i13;
        i15 = i5 & 256;
        if (i15 != 0) {
        }
        i16 = i15;
        i17 = i5 & 512;
        int i24222222 = 805306368;
        if (i17 != 0) {
        }
        if (composerStartRestartGroup.shouldExecute((i6 & 306783379) != 306783378, i6 & 1)) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:223:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0100  */
    /* renamed from: BasicText-CL7eQgs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m5332BasicTextCL7eQgs(AnnotatedString annotatedString, Modifier modifier, TextStyle textStyle, Function1<? super TextLayoutResult, Unit> function1, int i, boolean z, int i2, int i3, Map<String, InlineTextContent> map, Color3 color3, TextAutoSize textAutoSize, Composer composer, final int i4, final int i5, final int i6) {
        int i7;
        int i8;
        TextStyle textStyle2;
        int i9;
        Function1<? super TextLayoutResult, Unit> function12;
        int i10;
        int iM7958getClipgIe3tQ8;
        int i11;
        int i12;
        final int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        final AnnotatedString annotatedString2;
        Composer composer2;
        Modifier modifier2;
        final int i23;
        final Map<String, InlineTextContent> map2;
        final Color3 color32;
        final int i24;
        final TextStyle textStyle3;
        final Function1<? super TextLayoutResult, Unit> function13;
        final boolean z2;
        final TextAutoSize textAutoSize2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i25;
        TextStyle textStyle4;
        Function1<? super TextLayoutResult, Unit> function14;
        Composer composer3;
        SelectionController selectionController;
        int i26;
        TextStyle textStyle5;
        boolean z3;
        long jLongValue;
        boolean zChanged;
        Object objRememberedValue;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1343466571);
        if ((i6 & 1) != 0) {
            i7 = i4 | 6;
        } else if ((i4 & 6) == 0) {
            i7 = (composerStartRestartGroup.changed(annotatedString) ? 4 : 2) | i4;
        } else {
            i7 = i4;
        }
        int i27 = i6 & 2;
        if (i27 != 0) {
            i7 |= 48;
        } else {
            if ((i4 & 48) == 0) {
                i7 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            i8 = i6 & 4;
            if (i8 == 0) {
                i7 |= 384;
            } else {
                if ((i4 & 384) == 0) {
                    textStyle2 = textStyle;
                    i7 |= composerStartRestartGroup.changed(textStyle2) ? 256 : 128;
                }
                i9 = i6 & 8;
                if (i9 != 0) {
                    i7 |= 3072;
                } else {
                    if ((i4 & 3072) == 0) {
                        function12 = function1;
                        i7 |= composerStartRestartGroup.changedInstance(function12) ? 2048 : 1024;
                    }
                    i10 = i6 & 16;
                    if (i10 == 0) {
                        i7 |= 24576;
                    } else {
                        if ((i4 & 24576) == 0) {
                            iM7958getClipgIe3tQ8 = i;
                            i7 |= composerStartRestartGroup.changed(iM7958getClipgIe3tQ8) ? 16384 : 8192;
                        }
                        i11 = i6 & 32;
                        if (i11 != 0) {
                            i7 |= 196608;
                        } else if ((i4 & 196608) == 0) {
                            i7 |= composerStartRestartGroup.changed(z) ? 131072 : 65536;
                        }
                        i12 = i6 & 64;
                        if (i12 != 0) {
                            i7 |= 1572864;
                            i13 = i2;
                        } else {
                            i13 = i2;
                            if ((i4 & 1572864) == 0) {
                                i7 |= composerStartRestartGroup.changed(i13) ? 1048576 : 524288;
                            }
                        }
                        i14 = i6 & 128;
                        if (i14 != 0) {
                            i7 |= 12582912;
                        } else {
                            if ((i4 & 12582912) == 0) {
                                i15 = i14;
                                i7 |= composerStartRestartGroup.changed(i3) ? 8388608 : 4194304;
                            }
                            i16 = i6 & 256;
                            if (i16 == 0) {
                                i7 |= 100663296;
                            } else {
                                if ((i4 & 100663296) == 0) {
                                    i17 = i16;
                                    i7 |= composerStartRestartGroup.changedInstance(map) ? 67108864 : 33554432;
                                }
                                i18 = i6 & 512;
                                if (i18 != 0) {
                                    i7 |= 805306368;
                                } else {
                                    if ((i4 & 805306368) == 0) {
                                        i19 = i18;
                                        i7 |= composerStartRestartGroup.changedInstance(color3) ? 536870912 : 268435456;
                                    }
                                    i20 = i6 & 1024;
                                    if (i20 == 0) {
                                        i22 = i5 | 6;
                                    } else {
                                        if ((i5 & 6) != 0) {
                                            i21 = i5;
                                            if (composerStartRestartGroup.shouldExecute(((i7 & 306783379) == 306783378 && (i21 & 3) == 2) ? false : true, i7 & 1)) {
                                                Modifier modifier3 = i27 != 0 ? Modifier.INSTANCE : modifier;
                                                TextStyle textStyle6 = i8 != 0 ? TextStyle.INSTANCE.getDefault() : textStyle2;
                                                Function1<? super TextLayoutResult, Unit> function15 = i9 != 0 ? null : function12;
                                                if (i10 != 0) {
                                                    iM7958getClipgIe3tQ8 = TextOverflow.INSTANCE.m7958getClipgIe3tQ8();
                                                }
                                                boolean z4 = i11 != 0 ? true : z;
                                                if (i12 != 0) {
                                                    i13 = Integer.MAX_VALUE;
                                                }
                                                int i28 = i13;
                                                int i29 = iM7958getClipgIe3tQ8;
                                                int i30 = i15 != 0 ? 1 : i3;
                                                Map<String, InlineTextContent> mapEmptyMap = i17 != 0 ? MapsKt.emptyMap() : map;
                                                Color3 color33 = i19 != 0 ? null : color3;
                                                TextAutoSize textAutoSize3 = i20 != 0 ? null : textAutoSize;
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1343466571, i7, i21, "androidx.compose.foundation.text.BasicText (BasicText.kt:194)");
                                                }
                                                HeightInLinesModifier.validateMinMaxLines(i30, i28);
                                                final SelectionRegistrar selectionRegistrar = (SelectionRegistrar) composerStartRestartGroup.consume(SelectionRegistrar2.getLocalSelectionRegistrar());
                                                if (selectionRegistrar != null) {
                                                    composerStartRestartGroup.startReplaceGroup(-1584170794);
                                                    long selectionBackgroundColor = ((SelectionColors) composerStartRestartGroup.consume(TextSelectionColors2.getLocalTextSelectionColors())).getSelectionBackgroundColor();
                                                    Object[] objArr = {selectionRegistrar};
                                                    Saver<Long, Long> saverSelectionIdSaver = selectionIdSaver(selectionRegistrar);
                                                    i25 = i21;
                                                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(selectionRegistrar);
                                                    modifier2 = modifier3;
                                                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                                    if (zChangedInstance) {
                                                        textStyle4 = textStyle6;
                                                    } else {
                                                        textStyle4 = textStyle6;
                                                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                        }
                                                        composer3 = composerStartRestartGroup;
                                                        Number number = (Number) RememberSaveable.m6426rememberSaveable(objArr, (Saver) saverSelectionIdSaver, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 0, 4);
                                                        function14 = function15;
                                                        jLongValue = number.longValue();
                                                        zChanged = composer3.changed(jLongValue) | composer3.changed(selectionRegistrar) | composer3.changed(selectionBackgroundColor);
                                                        objRememberedValue = composer3.rememberedValue();
                                                        if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                            objRememberedValue = new SelectionController(jLongValue, selectionRegistrar, selectionBackgroundColor, null, 8, null);
                                                            composer3.updateRememberedValue(objRememberedValue);
                                                        }
                                                        composer3.endReplaceGroup();
                                                        selectionController = (SelectionController) objRememberedValue;
                                                    }
                                                    objRememberedValue2 = new Function0<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectionController$selectableId$2$1
                                                        {
                                                            super(0);
                                                        }

                                                        /* JADX WARN: Can't rename method to resolve collision */
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Long invoke() {
                                                            return Long.valueOf(selectionRegistrar.nextSelectableId());
                                                        }
                                                    };
                                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                                    composer3 = composerStartRestartGroup;
                                                    Number number2 = (Number) RememberSaveable.m6426rememberSaveable(objArr, (Saver) saverSelectionIdSaver, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 0, 4);
                                                    function14 = function15;
                                                    jLongValue = number2.longValue();
                                                    zChanged = composer3.changed(jLongValue) | composer3.changed(selectionRegistrar) | composer3.changed(selectionBackgroundColor);
                                                    objRememberedValue = composer3.rememberedValue();
                                                    if (!zChanged) {
                                                        objRememberedValue = new SelectionController(jLongValue, selectionRegistrar, selectionBackgroundColor, null, 8, null);
                                                        composer3.updateRememberedValue(objRememberedValue);
                                                        composer3.endReplaceGroup();
                                                        selectionController = (SelectionController) objRememberedValue;
                                                    }
                                                } else {
                                                    i25 = i21;
                                                    modifier2 = modifier3;
                                                    textStyle4 = textStyle6;
                                                    function14 = function15;
                                                    composer3 = composerStartRestartGroup;
                                                    composer3.startReplaceGroup(-1583679630);
                                                    composer3.endReplaceGroup();
                                                    selectionController = null;
                                                }
                                                boolean zHasInlineContent = AnnotatedStringResolveInlineContent.hasInlineContent(annotatedString);
                                                boolean zHasLinks = TextAnnotatedStringNode3.hasLinks(annotatedString);
                                                if (zHasInlineContent || zHasLinks) {
                                                    annotatedString2 = annotatedString;
                                                    Composer composer4 = composer3;
                                                    boolean z5 = z4;
                                                    i26 = i29;
                                                    TextStyle textStyle7 = textStyle4;
                                                    SelectionController selectionController2 = selectionController;
                                                    composer4.startReplaceGroup(-1582650709);
                                                    boolean z6 = (i7 & 14) == 4;
                                                    Object objRememberedValue3 = composer4.rememberedValue();
                                                    if (z6 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                        objRememberedValue3 = SnapshotState3.mutableStateOf$default(annotatedString2, null, 2, null);
                                                        composer4.updateRememberedValue(objRememberedValue3);
                                                    }
                                                    final SnapshotState snapshotState = (SnapshotState) objRememberedValue3;
                                                    AnnotatedString annotatedStringBasicText_CL7eQgs$lambda$5 = BasicText_CL7eQgs$lambda$5(snapshotState);
                                                    FontFamily.Resolver resolver = (FontFamily.Resolver) composer4.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
                                                    boolean zChanged2 = composer4.changed(snapshotState);
                                                    Object objRememberedValue4 = composer4.rememberedValue();
                                                    if (zChanged2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                                        objRememberedValue4 = new Function1<TextAnnotatedStringNode.TextSubstitutionValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$2$1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(1);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function1
                                                            public /* bridge */ /* synthetic */ Unit invoke(TextAnnotatedStringNode.TextSubstitutionValue textSubstitutionValue) {
                                                                invoke2(textSubstitutionValue);
                                                                return Unit.INSTANCE;
                                                            }

                                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                            public final void invoke2(TextAnnotatedStringNode.TextSubstitutionValue textSubstitutionValue) {
                                                                AnnotatedString original;
                                                                SnapshotState<AnnotatedString> snapshotState2 = snapshotState;
                                                                if (textSubstitutionValue.getIsShowingSubstitution()) {
                                                                    original = textSubstitutionValue.getSubstitution();
                                                                } else {
                                                                    original = textSubstitutionValue.getOriginal();
                                                                }
                                                                snapshotState2.setValue(original);
                                                            }
                                                        };
                                                        composer4.updateRememberedValue(objRememberedValue4);
                                                    }
                                                    int i31 = i7 << 6;
                                                    int i32 = ((i7 >> 21) & 896) | ((i25 << 12) & 57344);
                                                    textStyle5 = textStyle7;
                                                    Modifier modifier4 = modifier2;
                                                    m5336LayoutWithLinksAndInlineContent11Od_4g(modifier4, annotatedStringBasicText_CL7eQgs$lambda$5, function14, zHasInlineContent, mapEmptyMap, textStyle5, i26, z5, i28, i30, resolver, selectionController2, color33, (Function1) objRememberedValue4, textAutoSize3, composer4, ((i7 >> 3) & 910) | ((i7 >> 12) & 57344) | ((i7 << 9) & 458752) | (3670016 & i31) | (29360128 & i31) | (234881024 & i31) | (i31 & 1879048192), i32, 0);
                                                    z3 = z5;
                                                    composer2 = composer4;
                                                    modifier2 = modifier4;
                                                    composer2.endReplaceGroup();
                                                } else {
                                                    composer3.startReplaceGroup(-1583500636);
                                                    FontFamily.Resolver resolver2 = (FontFamily.Resolver) composer3.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
                                                    boolean z7 = z4;
                                                    annotatedString2 = annotatedString;
                                                    Composer composer5 = composer3;
                                                    i26 = i29;
                                                    TextStyle textStyle8 = textStyle4;
                                                    Modifier modifierM5338textModifierCL7eQgs = m5338textModifierCL7eQgs(modifier2, annotatedString2, textStyle8, function14, i26, z7, i28, i30, resolver2, null, null, selectionController, color33, null, textAutoSize3);
                                                    EmptyMeasurePolicy emptyMeasurePolicy = EmptyMeasurePolicy.INSTANCE;
                                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer5, 0);
                                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer5, modifierM5338textModifierCL7eQgs);
                                                    CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                                                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                                                    if (composer5.getApplier() == null) {
                                                        Composables.invalidApplier();
                                                    }
                                                    composer5.startReusableNode();
                                                    if (composer5.getInserting()) {
                                                        composer5.createNode(constructor);
                                                    } else {
                                                        composer5.useNode();
                                                    }
                                                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer5);
                                                    Updater.m6390setimpl(composerM6388constructorimpl, emptyMeasurePolicy, companion.getSetMeasurePolicy());
                                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                    }
                                                    composer5.endNode();
                                                    composer5.endReplaceGroup();
                                                    textStyle5 = textStyle8;
                                                    z3 = z7;
                                                    composer2 = composer5;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                                i23 = i30;
                                                color32 = color33;
                                                textAutoSize2 = textAutoSize3;
                                                map2 = mapEmptyMap;
                                                textStyle3 = textStyle5;
                                                i13 = i28;
                                                z2 = z3;
                                                i24 = i26;
                                                function13 = function14;
                                            } else {
                                                annotatedString2 = annotatedString;
                                                composer2 = composerStartRestartGroup;
                                                composer2.skipToGroupEnd();
                                                modifier2 = modifier;
                                                i23 = i3;
                                                map2 = map;
                                                color32 = color3;
                                                i24 = iM7958getClipgIe3tQ8;
                                                textStyle3 = textStyle2;
                                                function13 = function12;
                                                z2 = z;
                                                textAutoSize2 = textAutoSize;
                                            }
                                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                            if (scopeUpdateScopeEndRestartGroup != null) {
                                                final Modifier modifier5 = modifier2;
                                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>(modifier5, textStyle3, function13, i24, z2, i13, i23, map2, color32, textAutoSize2, i4, i5, i6) { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3
                                                    final /* synthetic */ int $$changed;
                                                    final /* synthetic */ int $$changed1;
                                                    final /* synthetic */ int $$default;
                                                    final /* synthetic */ Color3 $color;
                                                    final /* synthetic */ Map<String, InlineTextContent> $inlineContent;
                                                    final /* synthetic */ int $maxLines;
                                                    final /* synthetic */ int $minLines;
                                                    final /* synthetic */ Modifier $modifier;
                                                    final /* synthetic */ Function1<TextLayoutResult, Unit> $onTextLayout;
                                                    final /* synthetic */ int $overflow;
                                                    final /* synthetic */ boolean $softWrap;
                                                    final /* synthetic */ TextStyle $style;

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(2);
                                                        this.$$changed = i4;
                                                        this.$$changed1 = i5;
                                                        this.$$default = i6;
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                                        invoke(composer6, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void invoke(Composer composer6, int i33) {
                                                        BasicTextKt.m5332BasicTextCL7eQgs(this.$text, this.$modifier, this.$style, this.$onTextLayout, this.$overflow, this.$softWrap, this.$maxLines, this.$minLines, this.$inlineContent, this.$color, null, composer6, RecomposeScopeImpl4.updateChangedFlags(this.$$changed | 1), RecomposeScopeImpl4.updateChangedFlags(this.$$changed1), this.$$default);
                                                    }
                                                });
                                                return;
                                            }
                                            return;
                                        }
                                        i22 = i5 | ((i5 & 8) == 0 ? composerStartRestartGroup.changed(textAutoSize) : composerStartRestartGroup.changedInstance(textAutoSize) ? 4 : 2);
                                    }
                                    i21 = i22;
                                    if (composerStartRestartGroup.shouldExecute(((i7 & 306783379) == 306783378 && (i21 & 3) == 2) ? false : true, i7 & 1)) {
                                    }
                                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                    if (scopeUpdateScopeEndRestartGroup != null) {
                                    }
                                }
                                i19 = i18;
                                i20 = i6 & 1024;
                                if (i20 == 0) {
                                }
                                i21 = i22;
                                if (composerStartRestartGroup.shouldExecute(((i7 & 306783379) == 306783378 && (i21 & 3) == 2) ? false : true, i7 & 1)) {
                                }
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                }
                            }
                            i17 = i16;
                            i18 = i6 & 512;
                            if (i18 != 0) {
                            }
                            i19 = i18;
                            i20 = i6 & 1024;
                            if (i20 == 0) {
                            }
                            i21 = i22;
                            if (composerStartRestartGroup.shouldExecute(((i7 & 306783379) == 306783378 && (i21 & 3) == 2) ? false : true, i7 & 1)) {
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        i15 = i14;
                        i16 = i6 & 256;
                        if (i16 == 0) {
                        }
                        i17 = i16;
                        i18 = i6 & 512;
                        if (i18 != 0) {
                        }
                        i19 = i18;
                        i20 = i6 & 1024;
                        if (i20 == 0) {
                        }
                        i21 = i22;
                        if (composerStartRestartGroup.shouldExecute(((i7 & 306783379) == 306783378 && (i21 & 3) == 2) ? false : true, i7 & 1)) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    iM7958getClipgIe3tQ8 = i;
                    i11 = i6 & 32;
                    if (i11 != 0) {
                    }
                    i12 = i6 & 64;
                    if (i12 != 0) {
                    }
                    i14 = i6 & 128;
                    if (i14 != 0) {
                    }
                    i15 = i14;
                    i16 = i6 & 256;
                    if (i16 == 0) {
                    }
                    i17 = i16;
                    i18 = i6 & 512;
                    if (i18 != 0) {
                    }
                    i19 = i18;
                    i20 = i6 & 1024;
                    if (i20 == 0) {
                    }
                    i21 = i22;
                    if (composerStartRestartGroup.shouldExecute(((i7 & 306783379) == 306783378 && (i21 & 3) == 2) ? false : true, i7 & 1)) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                function12 = function1;
                i10 = i6 & 16;
                if (i10 == 0) {
                }
                iM7958getClipgIe3tQ8 = i;
                i11 = i6 & 32;
                if (i11 != 0) {
                }
                i12 = i6 & 64;
                if (i12 != 0) {
                }
                i14 = i6 & 128;
                if (i14 != 0) {
                }
                i15 = i14;
                i16 = i6 & 256;
                if (i16 == 0) {
                }
                i17 = i16;
                i18 = i6 & 512;
                if (i18 != 0) {
                }
                i19 = i18;
                i20 = i6 & 1024;
                if (i20 == 0) {
                }
                i21 = i22;
                if (composerStartRestartGroup.shouldExecute(((i7 & 306783379) == 306783378 && (i21 & 3) == 2) ? false : true, i7 & 1)) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            textStyle2 = textStyle;
            i9 = i6 & 8;
            if (i9 != 0) {
            }
            function12 = function1;
            i10 = i6 & 16;
            if (i10 == 0) {
            }
            iM7958getClipgIe3tQ8 = i;
            i11 = i6 & 32;
            if (i11 != 0) {
            }
            i12 = i6 & 64;
            if (i12 != 0) {
            }
            i14 = i6 & 128;
            if (i14 != 0) {
            }
            i15 = i14;
            i16 = i6 & 256;
            if (i16 == 0) {
            }
            i17 = i16;
            i18 = i6 & 512;
            if (i18 != 0) {
            }
            i19 = i18;
            i20 = i6 & 1024;
            if (i20 == 0) {
            }
            i21 = i22;
            if (composerStartRestartGroup.shouldExecute(((i7 & 306783379) == 306783378 && (i21 & 3) == 2) ? false : true, i7 & 1)) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i8 = i6 & 4;
        if (i8 == 0) {
        }
        textStyle2 = textStyle;
        i9 = i6 & 8;
        if (i9 != 0) {
        }
        function12 = function1;
        i10 = i6 & 16;
        if (i10 == 0) {
        }
        iM7958getClipgIe3tQ8 = i;
        i11 = i6 & 32;
        if (i11 != 0) {
        }
        i12 = i6 & 64;
        if (i12 != 0) {
        }
        i14 = i6 & 128;
        if (i14 != 0) {
        }
        i15 = i14;
        i16 = i6 & 256;
        if (i16 == 0) {
        }
        i17 = i16;
        i18 = i6 & 512;
        if (i18 != 0) {
        }
        i19 = i18;
        i20 = i6 & 1024;
        if (i20 == 0) {
        }
        i21 = i22;
        if (composerStartRestartGroup.shouldExecute(((i7 & 306783379) == 306783378 && (i21 & 3) == 2) ? false : true, i7 & 1)) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00fd  */
    @Deprecated
    /* renamed from: BasicText-VhcvRP8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m5335BasicTextVhcvRP8(final String str, Modifier modifier, TextStyle textStyle, Function1 function1, int i, boolean z, int i2, int i3, Color3 color3, Composer composer, final int i4, final int i5) {
        String str2;
        int i6;
        Modifier modifier2;
        int i7;
        TextStyle textStyle2;
        int i8;
        Function1 function12;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Composer composer2;
        final int i16;
        final int i17;
        final Color3 color32;
        final Modifier modifier3;
        final TextStyle textStyle3;
        final Function1 function13;
        final boolean z2;
        final int i18;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i19;
        TextStyle textStyle4;
        int i20;
        int iM7958getClipgIe3tQ8;
        int i21;
        int i22;
        int i23;
        int i24;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1186827822);
        if ((i5 & 1) != 0) {
            i6 = i4 | 6;
            str2 = str;
        } else {
            str2 = str;
            if ((i4 & 6) == 0) {
                i6 = (composerStartRestartGroup.changed(str2) ? 4 : 2) | i4;
            } else {
                i6 = i4;
            }
        }
        int i25 = i5 & 2;
        if (i25 != 0) {
            i6 |= 48;
        } else {
            if ((i4 & 48) == 0) {
                modifier2 = modifier;
                i6 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i7 = i5 & 4;
            if (i7 == 0) {
                i6 |= 384;
            } else {
                if ((i4 & 384) == 0) {
                    textStyle2 = textStyle;
                    i6 |= composerStartRestartGroup.changed(textStyle2) ? 256 : 128;
                }
                i8 = i5 & 8;
                if (i8 != 0) {
                    i6 |= 3072;
                } else {
                    if ((i4 & 3072) == 0) {
                        function12 = function1;
                        i6 |= composerStartRestartGroup.changedInstance(function12) ? 2048 : 1024;
                    }
                    i9 = i5 & 16;
                    if (i9 == 0) {
                        i6 |= 24576;
                    } else {
                        if ((i4 & 24576) == 0) {
                            i6 |= composerStartRestartGroup.changed(i) ? 16384 : 8192;
                        }
                        i10 = i5 & 32;
                        if (i10 != 0) {
                            i6 |= 196608;
                        } else {
                            if ((196608 & i4) == 0) {
                                i6 |= composerStartRestartGroup.changed(z) ? 131072 : 65536;
                            }
                            i11 = i5 & 64;
                            if (i11 == 0) {
                                i6 |= 1572864;
                            } else if ((i4 & 1572864) == 0) {
                                i6 |= composerStartRestartGroup.changed(i2) ? 1048576 : 524288;
                            }
                            i12 = i5 & 128;
                            if (i12 == 0) {
                                i6 |= 12582912;
                            } else {
                                if ((i4 & 12582912) == 0) {
                                    i13 = i12;
                                    i6 |= composerStartRestartGroup.changed(i3) ? 8388608 : 4194304;
                                }
                                i14 = i5 & 256;
                                if (i14 == 0) {
                                    if ((i4 & 100663296) == 0) {
                                        i15 = i14;
                                        i6 |= composerStartRestartGroup.changedInstance(color3) ? 67108864 : 33554432;
                                    }
                                    if (!composerStartRestartGroup.shouldExecute((i6 & 38347923) == 38347922, i6 & 1)) {
                                        Modifier modifier4 = i25 != 0 ? Modifier.INSTANCE : modifier2;
                                        if (i7 != 0) {
                                            textStyle4 = TextStyle.INSTANCE.getDefault();
                                            i19 = i10;
                                        } else {
                                            i19 = i10;
                                            textStyle4 = textStyle2;
                                        }
                                        Function1 function14 = i8 != 0 ? null : function12;
                                        if (i9 != 0) {
                                            iM7958getClipgIe3tQ8 = TextOverflow.INSTANCE.m7958getClipgIe3tQ8();
                                            i20 = i11;
                                        } else {
                                            i20 = i11;
                                            iM7958getClipgIe3tQ8 = i;
                                        }
                                        boolean z3 = i19 != 0 ? true : z;
                                        if (i20 != 0) {
                                            int i26 = i13;
                                            i22 = Integer.MAX_VALUE;
                                            i21 = i26;
                                        } else {
                                            i21 = i13;
                                            i22 = i2;
                                        }
                                        if (i21 != 0) {
                                            i23 = i15;
                                            i24 = 1;
                                        } else {
                                            i23 = i15;
                                            i24 = i3;
                                        }
                                        Color3 color33 = i23 != 0 ? null : color3;
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1186827822, i6, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:301)");
                                        }
                                        composer2 = composerStartRestartGroup;
                                        m5334BasicTextRWo7tUw(str2, modifier4, textStyle4, (Function1<? super TextLayoutResult, Unit>) function14, iM7958getClipgIe3tQ8, z3, i22, i24, color33, (TextAutoSize) null, composer2, i6 & 268435454, 512);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        modifier3 = modifier4;
                                        textStyle3 = textStyle4;
                                        function13 = function14;
                                        i16 = iM7958getClipgIe3tQ8;
                                        z2 = z3;
                                        i17 = i22;
                                        i18 = i24;
                                        color32 = color33;
                                    } else {
                                        composer2 = composerStartRestartGroup;
                                        composer2.skipToGroupEnd();
                                        i16 = i;
                                        i17 = i2;
                                        color32 = color3;
                                        modifier3 = modifier2;
                                        textStyle3 = textStyle2;
                                        function13 = function12;
                                        z2 = z;
                                        i18 = i3;
                                    }
                                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                    if (scopeUpdateScopeEndRestartGroup == null) {
                                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                invoke(composer3, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer3, int i27) {
                                                BasicTextKt.m5335BasicTextVhcvRP8(str, modifier3, textStyle3, function13, i16, z2, i17, i18, color32, composer3, RecomposeScopeImpl4.updateChangedFlags(i4 | 1), i5);
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                i6 |= 100663296;
                                i15 = i14;
                                if (!composerStartRestartGroup.shouldExecute((i6 & 38347923) == 38347922, i6 & 1)) {
                                }
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup == null) {
                                }
                            }
                            i13 = i12;
                            i14 = i5 & 256;
                            if (i14 == 0) {
                            }
                            i15 = i14;
                            if (!composerStartRestartGroup.shouldExecute((i6 & 38347923) == 38347922, i6 & 1)) {
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                            }
                        }
                        i11 = i5 & 64;
                        if (i11 == 0) {
                        }
                        i12 = i5 & 128;
                        if (i12 == 0) {
                        }
                        i13 = i12;
                        i14 = i5 & 256;
                        if (i14 == 0) {
                        }
                        i15 = i14;
                        if (!composerStartRestartGroup.shouldExecute((i6 & 38347923) == 38347922, i6 & 1)) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    i10 = i5 & 32;
                    if (i10 != 0) {
                    }
                    i11 = i5 & 64;
                    if (i11 == 0) {
                    }
                    i12 = i5 & 128;
                    if (i12 == 0) {
                    }
                    i13 = i12;
                    i14 = i5 & 256;
                    if (i14 == 0) {
                    }
                    i15 = i14;
                    if (!composerStartRestartGroup.shouldExecute((i6 & 38347923) == 38347922, i6 & 1)) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                function12 = function1;
                i9 = i5 & 16;
                if (i9 == 0) {
                }
                i10 = i5 & 32;
                if (i10 != 0) {
                }
                i11 = i5 & 64;
                if (i11 == 0) {
                }
                i12 = i5 & 128;
                if (i12 == 0) {
                }
                i13 = i12;
                i14 = i5 & 256;
                if (i14 == 0) {
                }
                i15 = i14;
                if (!composerStartRestartGroup.shouldExecute((i6 & 38347923) == 38347922, i6 & 1)) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            textStyle2 = textStyle;
            i8 = i5 & 8;
            if (i8 != 0) {
            }
            function12 = function1;
            i9 = i5 & 16;
            if (i9 == 0) {
            }
            i10 = i5 & 32;
            if (i10 != 0) {
            }
            i11 = i5 & 64;
            if (i11 == 0) {
            }
            i12 = i5 & 128;
            if (i12 == 0) {
            }
            i13 = i12;
            i14 = i5 & 256;
            if (i14 == 0) {
            }
            i15 = i14;
            if (!composerStartRestartGroup.shouldExecute((i6 & 38347923) == 38347922, i6 & 1)) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        textStyle2 = textStyle;
        i8 = i5 & 8;
        if (i8 != 0) {
        }
        function12 = function1;
        i9 = i5 & 16;
        if (i9 == 0) {
        }
        i10 = i5 & 32;
        if (i10 != 0) {
        }
        i11 = i5 & 64;
        if (i11 == 0) {
        }
        i12 = i5 & 128;
        if (i12 == 0) {
        }
        i13 = i12;
        i14 = i5 & 256;
        if (i14 == 0) {
        }
        i15 = i14;
        if (!composerStartRestartGroup.shouldExecute((i6 & 38347923) == 38347922, i6 & 1)) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:158:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00fd  */
    @Deprecated
    /* renamed from: BasicText-RWo7tUw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m5333BasicTextRWo7tUw(final AnnotatedString annotatedString, Modifier modifier, TextStyle textStyle, Function1 function1, int i, boolean z, int i2, int i3, Map map, Color3 color3, Composer composer, final int i4, final int i5) {
        AnnotatedString annotatedString2;
        int i6;
        Modifier modifier2;
        int i7;
        TextStyle textStyle2;
        int i8;
        Function1 function12;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        Composer composer2;
        final int i19;
        final Map map2;
        final Modifier modifier3;
        final TextStyle textStyle3;
        final Function1 function13;
        final int i20;
        final boolean z2;
        final int i21;
        final Color3 color32;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i22;
        Modifier modifier4;
        int i23;
        boolean z3;
        int i24;
        int i25;
        int i26;
        int i27;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1064305212);
        if ((i5 & 1) != 0) {
            i6 = i4 | 6;
            annotatedString2 = annotatedString;
        } else {
            annotatedString2 = annotatedString;
            if ((i4 & 6) == 0) {
                i6 = (composerStartRestartGroup.changed(annotatedString2) ? 4 : 2) | i4;
            } else {
                i6 = i4;
            }
        }
        int i28 = i5 & 2;
        if (i28 != 0) {
            i6 |= 48;
        } else {
            if ((i4 & 48) == 0) {
                modifier2 = modifier;
                i6 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i7 = i5 & 4;
            if (i7 == 0) {
                i6 |= 384;
            } else {
                if ((i4 & 384) == 0) {
                    textStyle2 = textStyle;
                    i6 |= composerStartRestartGroup.changed(textStyle2) ? 256 : 128;
                }
                i8 = i5 & 8;
                if (i8 != 0) {
                    i6 |= 3072;
                } else {
                    if ((i4 & 3072) == 0) {
                        function12 = function1;
                        i6 |= composerStartRestartGroup.changedInstance(function12) ? 2048 : 1024;
                    }
                    i9 = i5 & 16;
                    if (i9 == 0) {
                        i6 |= 24576;
                    } else {
                        if ((i4 & 24576) == 0) {
                            i10 = i;
                            i6 |= composerStartRestartGroup.changed(i10) ? 16384 : 8192;
                        }
                        i11 = i5 & 32;
                        if (i11 != 0) {
                            i6 |= 196608;
                        } else {
                            if ((196608 & i4) == 0) {
                                i6 |= composerStartRestartGroup.changed(z) ? 131072 : 65536;
                            }
                            i12 = i5 & 64;
                            if (i12 == 0) {
                                i6 |= 1572864;
                            } else if ((i4 & 1572864) == 0) {
                                i6 |= composerStartRestartGroup.changed(i2) ? 1048576 : 524288;
                            }
                            i13 = i5 & 128;
                            if (i13 == 0) {
                                i6 |= 12582912;
                            } else {
                                if ((i4 & 12582912) == 0) {
                                    i14 = i13;
                                    i6 |= composerStartRestartGroup.changed(i3) ? 8388608 : 4194304;
                                }
                                i15 = i5 & 256;
                                if (i15 != 0) {
                                    i6 |= 100663296;
                                } else {
                                    if ((i4 & 100663296) == 0) {
                                        i16 = i15;
                                        i6 |= composerStartRestartGroup.changedInstance(map) ? 67108864 : 33554432;
                                    }
                                    i17 = i5 & 512;
                                    if (i17 != 0) {
                                        if ((i4 & 805306368) == 0) {
                                            i18 = i17;
                                            i6 |= composerStartRestartGroup.changedInstance(color3) ? 536870912 : 268435456;
                                        }
                                        if (composerStartRestartGroup.shouldExecute((i6 & 306783379) != 306783378, i6 & 1)) {
                                            if (i28 != 0) {
                                                modifier4 = Modifier.INSTANCE;
                                                i22 = i11;
                                            } else {
                                                i22 = i11;
                                                modifier4 = modifier2;
                                            }
                                            TextStyle textStyle4 = i7 != 0 ? TextStyle.INSTANCE.getDefault() : textStyle2;
                                            Function1 function14 = i8 != 0 ? null : function12;
                                            int iM7958getClipgIe3tQ8 = i9 != 0 ? TextOverflow.INSTANCE.m7958getClipgIe3tQ8() : i10;
                                            if (i22 != 0) {
                                                i23 = i14;
                                                z3 = true;
                                            } else {
                                                i23 = i14;
                                                z3 = z;
                                            }
                                            if (i12 != 0) {
                                                int i29 = i16;
                                                i25 = Integer.MAX_VALUE;
                                                i24 = i29;
                                            } else {
                                                i24 = i16;
                                                i25 = i2;
                                            }
                                            if (i23 != 0) {
                                                i26 = i18;
                                                i27 = 1;
                                            } else {
                                                i26 = i18;
                                                i27 = i3;
                                            }
                                            Map mapEmptyMap = i24 != 0 ? MapsKt.emptyMap() : map;
                                            Color3 color33 = i26 != 0 ? null : color3;
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1064305212, i6, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:343)");
                                            }
                                            composer2 = composerStartRestartGroup;
                                            m5332BasicTextCL7eQgs(annotatedString2, modifier4, textStyle4, function14, iM7958getClipgIe3tQ8, z3, i25, i27, mapEmptyMap, color33, null, composer2, i6 & 2147483646, 0, 1024);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                            modifier3 = modifier4;
                                            textStyle3 = textStyle4;
                                            function13 = function14;
                                            i20 = iM7958getClipgIe3tQ8;
                                            z2 = z3;
                                            i19 = i25;
                                            i21 = i27;
                                            map2 = mapEmptyMap;
                                            color32 = color33;
                                        } else {
                                            composer2 = composerStartRestartGroup;
                                            composer2.skipToGroupEnd();
                                            i19 = i2;
                                            map2 = map;
                                            modifier3 = modifier2;
                                            textStyle3 = textStyle2;
                                            function13 = function12;
                                            i20 = i10;
                                            z2 = z;
                                            i21 = i3;
                                            color32 = color3;
                                        }
                                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                        if (scopeUpdateScopeEndRestartGroup != null) {
                                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$5
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                    invoke(composer3, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(Composer composer3, int i30) {
                                                    BasicTextKt.m5333BasicTextRWo7tUw(annotatedString, modifier3, textStyle3, function13, i20, z2, i19, i21, map2, color32, composer3, RecomposeScopeImpl4.updateChangedFlags(i4 | 1), i5);
                                                }
                                            });
                                            return;
                                        }
                                        return;
                                    }
                                    i6 |= 805306368;
                                    i18 = i17;
                                    if (composerStartRestartGroup.shouldExecute((i6 & 306783379) != 306783378, i6 & 1)) {
                                    }
                                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                    if (scopeUpdateScopeEndRestartGroup != null) {
                                    }
                                }
                                i16 = i15;
                                i17 = i5 & 512;
                                if (i17 != 0) {
                                }
                                i18 = i17;
                                if (composerStartRestartGroup.shouldExecute((i6 & 306783379) != 306783378, i6 & 1)) {
                                }
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                }
                            }
                            i14 = i13;
                            i15 = i5 & 256;
                            if (i15 != 0) {
                            }
                            i16 = i15;
                            i17 = i5 & 512;
                            if (i17 != 0) {
                            }
                            i18 = i17;
                            if (composerStartRestartGroup.shouldExecute((i6 & 306783379) != 306783378, i6 & 1)) {
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        i12 = i5 & 64;
                        if (i12 == 0) {
                        }
                        i13 = i5 & 128;
                        if (i13 == 0) {
                        }
                        i14 = i13;
                        i15 = i5 & 256;
                        if (i15 != 0) {
                        }
                        i16 = i15;
                        i17 = i5 & 512;
                        if (i17 != 0) {
                        }
                        i18 = i17;
                        if (composerStartRestartGroup.shouldExecute((i6 & 306783379) != 306783378, i6 & 1)) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    i10 = i;
                    i11 = i5 & 32;
                    if (i11 != 0) {
                    }
                    i12 = i5 & 64;
                    if (i12 == 0) {
                    }
                    i13 = i5 & 128;
                    if (i13 == 0) {
                    }
                    i14 = i13;
                    i15 = i5 & 256;
                    if (i15 != 0) {
                    }
                    i16 = i15;
                    i17 = i5 & 512;
                    if (i17 != 0) {
                    }
                    i18 = i17;
                    if (composerStartRestartGroup.shouldExecute((i6 & 306783379) != 306783378, i6 & 1)) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                function12 = function1;
                i9 = i5 & 16;
                if (i9 == 0) {
                }
                i10 = i;
                i11 = i5 & 32;
                if (i11 != 0) {
                }
                i12 = i5 & 64;
                if (i12 == 0) {
                }
                i13 = i5 & 128;
                if (i13 == 0) {
                }
                i14 = i13;
                i15 = i5 & 256;
                if (i15 != 0) {
                }
                i16 = i15;
                i17 = i5 & 512;
                if (i17 != 0) {
                }
                i18 = i17;
                if (composerStartRestartGroup.shouldExecute((i6 & 306783379) != 306783378, i6 & 1)) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            textStyle2 = textStyle;
            i8 = i5 & 8;
            if (i8 != 0) {
            }
            function12 = function1;
            i9 = i5 & 16;
            if (i9 == 0) {
            }
            i10 = i;
            i11 = i5 & 32;
            if (i11 != 0) {
            }
            i12 = i5 & 64;
            if (i12 == 0) {
            }
            i13 = i5 & 128;
            if (i13 == 0) {
            }
            i14 = i13;
            i15 = i5 & 256;
            if (i15 != 0) {
            }
            i16 = i15;
            i17 = i5 & 512;
            if (i17 != 0) {
            }
            i18 = i17;
            if (composerStartRestartGroup.shouldExecute((i6 & 306783379) != 306783378, i6 & 1)) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        textStyle2 = textStyle;
        i8 = i5 & 8;
        if (i8 != 0) {
        }
        function12 = function1;
        i9 = i5 & 16;
        if (i9 == 0) {
        }
        i10 = i;
        i11 = i5 & 32;
        if (i11 != 0) {
        }
        i12 = i5 & 64;
        if (i12 == 0) {
        }
        i13 = i5 & 128;
        if (i13 == 0) {
        }
        i14 = i13;
        i15 = i5 & 256;
        if (i15 != 0) {
        }
        i16 = i15;
        i17 = i5 & 512;
        if (i17 != 0) {
        }
        i18 = i17;
        if (composerStartRestartGroup.shouldExecute((i6 & 306783379) != 306783378, i6 & 1)) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    private static final Saver<Long, Long> selectionIdSaver(final SelectionRegistrar selectionRegistrar) {
        return Saver2.Saver(new Function2<Saver5, Long, Long>() { // from class: androidx.compose.foundation.text.BasicTextKt.selectionIdSaver.1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Long invoke(Saver5 saver5, Long l) {
                return invoke(saver5, l.longValue());
            }

            public final Long invoke(Saver5 saver5, long j) {
                if (SelectionRegistrar2.hasSelection(selectionRegistrar, j)) {
                    return Long.valueOf(j);
                }
                return null;
            }
        }, new Function1<Long, Long>() { // from class: androidx.compose.foundation.text.BasicTextKt.selectionIdSaver.2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Long invoke(Long l) {
                return invoke(l.longValue());
            }

            public final Long invoke(long j) {
                return Long.valueOf(j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Tuples2<Placeable, Function0<IntOffset>>> measureWithTextRangeMeasureConstraints(List<? extends Measurable> list, Function0<Boolean> function0) {
        if (!function0.invoke().booleanValue()) {
            return null;
        }
        TextRangeLayoutMeasureScope textRangeLayoutMeasureScope = new TextRangeLayoutMeasureScope();
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Measurable measurable = list.get(i);
            Object parentData = measurable.getParentData();
            Intrinsics.checkNotNull(parentData, "null cannot be cast to non-null type androidx.compose.foundation.text.TextRangeLayoutModifier");
            TextRangeLayoutMeasureResult textRangeLayoutMeasureResultMeasure = ((TextRangeLayoutModifier) parentData).getMeasurePolicy().measure(textRangeLayoutMeasureScope);
            arrayList.add(new Tuples2(measurable.mo7239measureBRTryo0(Constraints.INSTANCE.m7983fitPrioritizingWidthZbe2FdA(textRangeLayoutMeasureResultMeasure.getWidth(), textRangeLayoutMeasureResultMeasure.getWidth(), textRangeLayoutMeasureResultMeasure.getHeight(), textRangeLayoutMeasureResultMeasure.getHeight())), textRangeLayoutMeasureResultMeasure.getPlace()));
        }
        return arrayList;
    }

    /* renamed from: textModifier-CL7eQgs, reason: not valid java name */
    private static final Modifier m5338textModifierCL7eQgs(Modifier modifier, AnnotatedString annotatedString, TextStyle textStyle, Function1<? super TextLayoutResult, Unit> function1, int i, boolean z, int i2, int i3, FontFamily.Resolver resolver, List<AnnotatedString.Range<Placeholder>> list, Function1<? super List<Rect>, Unit> function12, SelectionController selectionController, Color3 color3, Function1<? super TextAnnotatedStringNode.TextSubstitutionValue, Unit> function13, TextAutoSize textAutoSize) {
        if (selectionController == null) {
            return modifier.then(Modifier.INSTANCE).then(new TextAnnotatedStringElement(annotatedString, textStyle, resolver, function1, i, z, i2, i3, list, function12, null, color3, textAutoSize, function13, null));
        }
        return modifier.then(selectionController.getModifier()).then(new SelectableTextAnnotatedStringElement(annotatedString, textStyle, resolver, function1, i, z, i2, i3, list, function12, selectionController, color3, textAutoSize, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:286:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011e  */
    /* renamed from: LayoutWithLinksAndInlineContent-11Od_4g, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m5336LayoutWithLinksAndInlineContent11Od_4g(final Modifier modifier, AnnotatedString annotatedString, final Function1<? super TextLayoutResult, Unit> function1, final boolean z, Map<String, InlineTextContent> map, final TextStyle textStyle, final int i, final boolean z2, final int i2, final int i3, final FontFamily.Resolver resolver, final SelectionController selectionController, final Color3 color3, final Function1<? super TextAnnotatedStringNode.TextSubstitutionValue, Unit> function12, final TextAutoSize textAutoSize, Composer composer, final int i4, final int i5, final int i6) {
        Modifier modifier2;
        int i7;
        Map<String, InlineTextContent> map2;
        TextStyle textStyle2;
        int i8;
        boolean z3;
        int i9;
        int i10;
        int i11;
        final Map<String, InlineTextContent> map3;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final TextLinkScope textLinkScope;
        Function0 function0;
        Map<String, InlineTextContent> map4;
        final SnapshotState snapshotState;
        Object textMeasurePolicy;
        final AnnotatedString annotatedString2 = annotatedString;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2118572703);
        if ((i6 & 1) != 0) {
            i7 = i4 | 6;
            modifier2 = modifier;
        } else if ((i4 & 6) == 0) {
            modifier2 = modifier;
            i7 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i4;
        } else {
            modifier2 = modifier;
            i7 = i4;
        }
        if ((i6 & 2) != 0) {
            i7 |= 48;
        } else if ((i4 & 48) == 0) {
            i7 |= composerStartRestartGroup.changed(annotatedString2) ? 32 : 16;
        }
        if ((i6 & 4) != 0) {
            i7 |= 384;
        } else if ((i4 & 384) == 0) {
            i7 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i6 & 8) != 0) {
            i7 |= 3072;
        } else if ((i4 & 3072) == 0) {
            i7 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
        }
        int i12 = i6 & 16;
        if (i12 != 0) {
            i7 |= 24576;
        } else {
            if ((i4 & 24576) == 0) {
                map2 = map;
                i7 |= composerStartRestartGroup.changedInstance(map2) ? 16384 : 8192;
            }
            if ((i6 & 32) == 0) {
                i7 |= 196608;
                textStyle2 = textStyle;
            } else {
                textStyle2 = textStyle;
                if ((i4 & 196608) == 0) {
                    i7 |= composerStartRestartGroup.changed(textStyle2) ? 131072 : 65536;
                }
            }
            if ((i6 & 64) == 0) {
                i7 |= 1572864;
                i8 = i;
            } else {
                i8 = i;
                if ((i4 & 1572864) == 0) {
                    i7 |= composerStartRestartGroup.changed(i8) ? 1048576 : 524288;
                }
            }
            if ((i6 & 128) == 0) {
                i7 |= 12582912;
            } else {
                if ((i4 & 12582912) == 0) {
                    z3 = z2;
                    i7 |= composerStartRestartGroup.changed(z3) ? 8388608 : 4194304;
                }
                if ((i6 & 256) != 0) {
                    i7 |= 100663296;
                } else {
                    if ((i4 & 100663296) == 0) {
                        i9 = i2;
                        i7 |= composerStartRestartGroup.changed(i9) ? 67108864 : 33554432;
                    }
                    if ((i6 & 512) == 0) {
                        i7 |= 805306368;
                    } else {
                        if ((i4 & 805306368) == 0) {
                            i7 |= composerStartRestartGroup.changed(i3) ? 536870912 : 268435456;
                        }
                        if ((i6 & 1024) != 0) {
                            i10 = i5 | 6;
                        } else if ((i5 & 6) == 0) {
                            i10 = i5 | (composerStartRestartGroup.changedInstance(resolver) ? 4 : 2);
                        } else {
                            i10 = i5;
                        }
                        if ((i6 & 2048) != 0) {
                            i10 |= 48;
                        } else if ((i5 & 48) == 0) {
                            i10 |= composerStartRestartGroup.changedInstance(selectionController) ? 32 : 16;
                        }
                        i11 = i10;
                        if ((i6 & 4096) != 0) {
                            i11 |= 384;
                        } else {
                            if ((i5 & 384) == 0) {
                                i11 |= composerStartRestartGroup.changedInstance(color3) ? 256 : 128;
                            }
                            if ((i6 & 8192) != 0) {
                                if ((i5 & 3072) == 0) {
                                    i11 |= composerStartRestartGroup.changedInstance(function12) ? 2048 : 1024;
                                }
                                if ((i6 & 16384) != 0) {
                                    i11 |= 24576;
                                } else if ((i5 & 24576) == 0) {
                                    i11 |= (32768 & i5) == 0 ? composerStartRestartGroup.changed(textAutoSize) : composerStartRestartGroup.changedInstance(textAutoSize) ? 16384 : 8192;
                                }
                                if (composerStartRestartGroup.shouldExecute(((306783379 & i7) == 306783378 && (i11 & 9363) == 9362) ? false : true, i7 & 1)) {
                                    Map<String, InlineTextContent> mapEmptyMap = i12 != 0 ? MapsKt.emptyMap() : map2;
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-2118572703, i7, i11, "androidx.compose.foundation.text.LayoutWithLinksAndInlineContent (BasicText.kt:630)");
                                    }
                                    Function1 function13 = null;
                                    if (TextAnnotatedStringNode3.hasLinks(annotatedString2)) {
                                        composerStartRestartGroup.startReplaceGroup(-613484007);
                                        boolean z4 = (i7 & 112) == 32;
                                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                        if (z4 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = new TextLinkScope(annotatedString2);
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        textLinkScope = (TextLinkScope) objRememberedValue;
                                    } else {
                                        composerStartRestartGroup.startReplaceGroup(-613418350);
                                        composerStartRestartGroup.endReplaceGroup();
                                        textLinkScope = null;
                                    }
                                    if (TextAnnotatedStringNode3.hasLinks(annotatedString2)) {
                                        composerStartRestartGroup.startReplaceGroup(-613220135);
                                        boolean zChanged = ((i7 & 112) == 32) | composerStartRestartGroup.changed(textLinkScope);
                                        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                        if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue2 = new Function0<AnnotatedString>() { // from class: androidx.compose.foundation.text.BasicTextKt$LayoutWithLinksAndInlineContent$styledText$1$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                /* JADX WARN: Can't rename method to resolve collision */
                                                @Override // kotlin.jvm.functions.Function0
                                                public final AnnotatedString invoke() {
                                                    AnnotatedString annotatedStringApplyAnnotators$foundation_release;
                                                    TextLinkScope textLinkScope2 = textLinkScope;
                                                    return (textLinkScope2 == null || (annotatedStringApplyAnnotators$foundation_release = textLinkScope2.applyAnnotators$foundation_release()) == null) ? annotatedString2 : annotatedStringApplyAnnotators$foundation_release;
                                                }
                                            };
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                        }
                                        function0 = (Function0) objRememberedValue2;
                                        composerStartRestartGroup.endReplaceGroup();
                                    } else {
                                        composerStartRestartGroup.startReplaceGroup(-613122857);
                                        boolean z5 = (i7 & 112) == 32;
                                        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                        if (z5 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue3 = new Function0<AnnotatedString>() { // from class: androidx.compose.foundation.text.BasicTextKt$LayoutWithLinksAndInlineContent$styledText$2$1
                                                {
                                                    super(0);
                                                }

                                                /* JADX WARN: Can't rename method to resolve collision */
                                                @Override // kotlin.jvm.functions.Function0
                                                public final AnnotatedString invoke() {
                                                    return annotatedString2;
                                                }
                                            };
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                        }
                                        function0 = (Function0) objRememberedValue3;
                                        composerStartRestartGroup.endReplaceGroup();
                                    }
                                    Tuples2<List<AnnotatedString.Range<Placeholder>>, List<AnnotatedString.Range<Function3<String, Composer, Integer, Unit>>>> tuples2ResolveInlineContent = z ? AnnotatedStringResolveInlineContent.resolveInlineContent(annotatedString2, mapEmptyMap) : new Tuples2<>(null, null);
                                    List<AnnotatedString.Range<Placeholder>> listComponent1 = tuples2ResolveInlineContent.component1();
                                    List<AnnotatedString.Range<Function3<String, Composer, Integer, Unit>>> listComponent2 = tuples2ResolveInlineContent.component2();
                                    if (z) {
                                        composerStartRestartGroup.startReplaceGroup(-612806750);
                                        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                        map4 = mapEmptyMap;
                                        if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue4 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        snapshotState = (SnapshotState) objRememberedValue4;
                                    } else {
                                        map4 = mapEmptyMap;
                                        composerStartRestartGroup.startReplaceGroup(-612718990);
                                        composerStartRestartGroup.endReplaceGroup();
                                        snapshotState = null;
                                    }
                                    if (z) {
                                        composerStartRestartGroup.startReplaceGroup(-612625741);
                                        boolean zChanged2 = composerStartRestartGroup.changed(snapshotState);
                                        Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                        if (zChanged2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue5 = new Function1<List<? extends Rect>, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$LayoutWithLinksAndInlineContent$onPlaceholderLayout$1$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(List<? extends Rect> list) {
                                                    invoke2((List<Rect>) list);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(List<Rect> list) {
                                                    SnapshotState<List<Rect>> snapshotState2 = snapshotState;
                                                    if (snapshotState2 == null) {
                                                        return;
                                                    }
                                                    snapshotState2.setValue(list);
                                                }
                                            };
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                        }
                                        function13 = (Function1) objRememberedValue5;
                                        composerStartRestartGroup.endReplaceGroup();
                                    } else {
                                        composerStartRestartGroup.startReplaceGroup(-612554318);
                                        composerStartRestartGroup.endReplaceGroup();
                                    }
                                    AnnotatedString annotatedString3 = (AnnotatedString) function0.invoke();
                                    Function1 function14 = function13;
                                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(textLinkScope) | ((i7 & 896) == 256);
                                    Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                                    if (zChangedInstance || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue6 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$LayoutWithLinksAndInlineContent$2$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                                invoke2(textLayoutResult);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(TextLayoutResult textLayoutResult) {
                                                TextLinkScope textLinkScope2 = textLinkScope;
                                                if (textLinkScope2 != null) {
                                                    textLinkScope2.setTextLayoutResult(textLayoutResult);
                                                }
                                                Function1<TextLayoutResult, Unit> function15 = function1;
                                                if (function15 != null) {
                                                    function15.invoke(textLayoutResult);
                                                }
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                                    }
                                    Composer composer3 = composerStartRestartGroup;
                                    int i13 = i7;
                                    Modifier modifierM5338textModifierCL7eQgs = m5338textModifierCL7eQgs(modifier2, annotatedString3, textStyle2, (Function1) objRememberedValue6, i8, z3, i9, i3, resolver, listComponent1, function14, selectionController, color3, function12, textAutoSize);
                                    if (z) {
                                        composer3.startReplaceGroup(-611365560);
                                        boolean zChangedInstance2 = composer3.changedInstance(textLinkScope);
                                        Object objRememberedValue7 = composer3.rememberedValue();
                                        if (zChangedInstance2 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue7 = new Function0<Boolean>() { // from class: androidx.compose.foundation.text.BasicTextKt$LayoutWithLinksAndInlineContent$4$1
                                                {
                                                    super(0);
                                                }

                                                /* JADX WARN: Can't rename method to resolve collision */
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Boolean invoke() {
                                                    TextLinkScope textLinkScope2 = textLinkScope;
                                                    return Boolean.valueOf(textLinkScope2 != null ? textLinkScope2.getShouldMeasureLinks().invoke().booleanValue() : false);
                                                }
                                            };
                                            composer3.updateRememberedValue(objRememberedValue7);
                                        }
                                        Function0 function02 = (Function0) objRememberedValue7;
                                        boolean zChanged3 = composer3.changed(snapshotState);
                                        Object objRememberedValue8 = composer3.rememberedValue();
                                        if (zChanged3 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue8 = new Function0<List<? extends Rect>>() { // from class: androidx.compose.foundation.text.BasicTextKt$LayoutWithLinksAndInlineContent$5$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                @Override // kotlin.jvm.functions.Function0
                                                public final List<? extends Rect> invoke() {
                                                    SnapshotState<List<Rect>> snapshotState2 = snapshotState;
                                                    if (snapshotState2 != null) {
                                                        return snapshotState2.getValue();
                                                    }
                                                    return null;
                                                }
                                            };
                                            composer3.updateRememberedValue(objRememberedValue8);
                                        }
                                        textMeasurePolicy = new TextMeasurePolicy(function02, (Function0) objRememberedValue8);
                                        composer3.endReplaceGroup();
                                    } else {
                                        composer3.startReplaceGroup(-611542291);
                                        boolean zChangedInstance3 = composer3.changedInstance(textLinkScope);
                                        Object objRememberedValue9 = composer3.rememberedValue();
                                        if (zChangedInstance3 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue9 = new Function0<Boolean>() { // from class: androidx.compose.foundation.text.BasicTextKt$LayoutWithLinksAndInlineContent$3$1
                                                {
                                                    super(0);
                                                }

                                                /* JADX WARN: Can't rename method to resolve collision */
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Boolean invoke() {
                                                    TextLinkScope textLinkScope2 = textLinkScope;
                                                    return Boolean.valueOf(textLinkScope2 != null ? textLinkScope2.getShouldMeasureLinks().invoke().booleanValue() : false);
                                                }
                                            };
                                            composer3.updateRememberedValue(objRememberedValue9);
                                        }
                                        textMeasurePolicy = new LinksTextMeasurePolicy((Function0) objRememberedValue9);
                                        composer3.endReplaceGroup();
                                    }
                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM5338textModifierCL7eQgs);
                                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                                    if (composer3.getApplier() == null) {
                                        Composables.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                                    Updater.m6390setimpl(composerM6388constructorimpl, textMeasurePolicy, companion.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                                    if (textLinkScope == null) {
                                        composer3.startReplaceGroup(-509592027);
                                        composer3.endReplaceGroup();
                                    } else {
                                        composer3.startReplaceGroup(537750876);
                                        textLinkScope.LinksComposables(composer3, 0);
                                        composer3.endReplaceGroup();
                                        Unit unit = Unit.INSTANCE;
                                    }
                                    if (listComponent2 == null) {
                                        composer3.startReplaceGroup(-509541249);
                                        composer3.endReplaceGroup();
                                        annotatedString2 = annotatedString;
                                    } else {
                                        composer3.startReplaceGroup(-509541248);
                                        annotatedString2 = annotatedString;
                                        AnnotatedStringResolveInlineContent.InlineChildren(annotatedString2, listComponent2, composer3, (i13 >> 3) & 14);
                                        Unit unit2 = Unit.INSTANCE;
                                        composer3.endReplaceGroup();
                                    }
                                    composer3.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    map3 = map4;
                                    composer2 = composer3;
                                } else {
                                    Composer composer4 = composerStartRestartGroup;
                                    composer4.skipToGroupEnd();
                                    map3 = map2;
                                    composer2 = composer4;
                                }
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>(annotatedString2, function1, z, map3, textStyle, i, z2, i2, i3, resolver, selectionController, color3, function12, textAutoSize, i4, i5, i6) { // from class: androidx.compose.foundation.text.BasicTextKt$LayoutWithLinksAndInlineContent$6
                                        final /* synthetic */ int $$changed;
                                        final /* synthetic */ int $$changed1;
                                        final /* synthetic */ int $$default;
                                        final /* synthetic */ Color3 $color;
                                        final /* synthetic */ FontFamily.Resolver $fontFamilyResolver;
                                        final /* synthetic */ boolean $hasInlineContent;
                                        final /* synthetic */ Map<String, InlineTextContent> $inlineContent;
                                        final /* synthetic */ int $maxLines;
                                        final /* synthetic */ int $minLines;
                                        final /* synthetic */ Function1<TextAnnotatedStringNode.TextSubstitutionValue, Unit> $onShowTranslation;
                                        final /* synthetic */ Function1<TextLayoutResult, Unit> $onTextLayout;
                                        final /* synthetic */ int $overflow;
                                        final /* synthetic */ SelectionController $selectionController;
                                        final /* synthetic */ boolean $softWrap;
                                        final /* synthetic */ TextStyle $style;
                                        final /* synthetic */ AnnotatedString $text;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                            this.$$changed = i4;
                                            this.$$changed1 = i5;
                                            this.$$default = i6;
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                            invoke(composer5, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer5, int i14) {
                                            BasicTextKt.m5336LayoutWithLinksAndInlineContent11Od_4g(this.$modifier, this.$text, this.$onTextLayout, this.$hasInlineContent, this.$inlineContent, this.$style, this.$overflow, this.$softWrap, this.$maxLines, this.$minLines, this.$fontFamilyResolver, this.$selectionController, this.$color, this.$onShowTranslation, null, composer5, RecomposeScopeImpl4.updateChangedFlags(this.$$changed | 1), RecomposeScopeImpl4.updateChangedFlags(this.$$changed1), this.$$default);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i11 |= 3072;
                            if ((i6 & 16384) != 0) {
                            }
                            if (composerStartRestartGroup.shouldExecute(((306783379 & i7) == 306783378 && (i11 & 9363) == 9362) ? false : true, i7 & 1)) {
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        if ((i6 & 8192) != 0) {
                        }
                        if ((i6 & 16384) != 0) {
                        }
                        if (composerStartRestartGroup.shouldExecute(((306783379 & i7) == 306783378 && (i11 & 9363) == 9362) ? false : true, i7 & 1)) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    if ((i6 & 1024) != 0) {
                    }
                    if ((i6 & 2048) != 0) {
                    }
                    i11 = i10;
                    if ((i6 & 4096) != 0) {
                    }
                    if ((i6 & 8192) != 0) {
                    }
                    if ((i6 & 16384) != 0) {
                    }
                    if (composerStartRestartGroup.shouldExecute(((306783379 & i7) == 306783378 && (i11 & 9363) == 9362) ? false : true, i7 & 1)) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i9 = i2;
                if ((i6 & 512) == 0) {
                }
                if ((i6 & 1024) != 0) {
                }
                if ((i6 & 2048) != 0) {
                }
                i11 = i10;
                if ((i6 & 4096) != 0) {
                }
                if ((i6 & 8192) != 0) {
                }
                if ((i6 & 16384) != 0) {
                }
                if (composerStartRestartGroup.shouldExecute(((306783379 & i7) == 306783378 && (i11 & 9363) == 9362) ? false : true, i7 & 1)) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            z3 = z2;
            if ((i6 & 256) != 0) {
            }
            i9 = i2;
            if ((i6 & 512) == 0) {
            }
            if ((i6 & 1024) != 0) {
            }
            if ((i6 & 2048) != 0) {
            }
            i11 = i10;
            if ((i6 & 4096) != 0) {
            }
            if ((i6 & 8192) != 0) {
            }
            if ((i6 & 16384) != 0) {
            }
            if (composerStartRestartGroup.shouldExecute(((306783379 & i7) == 306783378 && (i11 & 9363) == 9362) ? false : true, i7 & 1)) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        map2 = map;
        if ((i6 & 32) == 0) {
        }
        if ((i6 & 64) == 0) {
        }
        if ((i6 & 128) == 0) {
        }
        z3 = z2;
        if ((i6 & 256) != 0) {
        }
        i9 = i2;
        if ((i6 & 512) == 0) {
        }
        if ((i6 & 1024) != 0) {
        }
        if ((i6 & 2048) != 0) {
        }
        i11 = i10;
        if ((i6 & 4096) != 0) {
        }
        if ((i6 & 8192) != 0) {
        }
        if ((i6 & 16384) != 0) {
        }
        if (composerStartRestartGroup.shouldExecute(((306783379 & i7) == 306783378 && (i11 & 9363) == 9362) ? false : true, i7 & 1)) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}
