package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import android.net.Uri;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.semantics.CustomAccessibilityAction;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.LinkAnnotation;
import androidx.compose.p011ui.text.LinkInteractionListener;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.util.extensions.IconExtensions;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.models.serverdriven.p347db.RichText;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.utils.extensions.ResourceTypes;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BentoRichText.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0089\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u00122\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u0012H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0089\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00182\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u00122\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u0012H\u0007¢\u0006\u0004\b\u0016\u0010\u0019\u001a\r\u0010\u001a\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u001b\u001a\r\u0010\u001c\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u001b¨\u0006\u001d"}, m3636d2 = {"BentoRichText", "", "text", "Lcom/robinhood/models/serverdriven/experimental/api/RichText;", "modifier", "Landroidx/compose/ui/Modifier;", ResourceTypes.STYLE, "Landroidx/compose/ui/text/TextStyle;", ResourceTypes.COLOR, "Landroidx/compose/ui/graphics/Color;", "linkColor", "softWrap", "", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "maxLines", "", "onTextLayout", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "onClickLink", "Landroid/net/Uri;", "BentoRichText-0sCZWFg", "(Lcom/robinhood/models/serverdriven/experimental/api/RichText;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;JJZIILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lcom/robinhood/models/serverdriven/db/RichText;", "(Lcom/robinhood/models/serverdriven/db/RichText;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;JJZIILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "BentoRichTextWithLinkPreview", "(Landroidx/compose/runtime/Composer;I)V", "BentoRichTextNoLinkPreview", "lib-sdui_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.BentoRichTextKt, reason: use source file name */
/* loaded from: classes17.dex */
public final class BentoRichText {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoRichTextNoLinkPreview$lambda$17(int i, Composer composer, int i2) {
        BentoRichTextNoLinkPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoRichTextWithLinkPreview$lambda$16(int i, Composer composer, int i2) {
        BentoRichTextWithLinkPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoRichText_0sCZWFg$lambda$15(RichText richText, Modifier modifier, TextStyle textStyle, long j, long j2, boolean z, int i, int i2, Function1 function1, Function1 function12, int i3, int i4, Composer composer, int i5) {
        m15948BentoRichText0sCZWFg(richText, modifier, textStyle, j, j2, z, i, i2, (Function1<? super TextLayoutResult, Unit>) function1, (Function1<? super Uri, Unit>) function12, composer, RecomposeScopeImpl4.updateChangedFlags(i3 | 1), i4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoRichText_0sCZWFg$lambda$4(com.robinhood.models.serverdriven.experimental.api.RichText richText, Modifier modifier, TextStyle textStyle, long j, long j2, boolean z, int i, int i2, Function1 function1, Function1 function12, int i3, int i4, Composer composer, int i5) {
        m15949BentoRichText0sCZWFg(richText, modifier, textStyle, j, j2, z, i, i2, (Function1<? super TextLayoutResult, Unit>) function1, (Function1<? super Uri, Unit>) function12, composer, RecomposeScopeImpl4.updateChangedFlags(i3 | 1), i4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoRichText_0sCZWFg$lambda$1$lambda$0(TextLayoutResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoRichText_0sCZWFg$lambda$3$lambda$2(Uri it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:173:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0101  */
    /* renamed from: BentoRichText-0sCZWFg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m15949BentoRichText0sCZWFg(final com.robinhood.models.serverdriven.experimental.api.RichText text, Modifier modifier, TextStyle textStyle, long j, long j2, boolean z, int i, int i2, Function1<? super TextLayoutResult, Unit> function1, Function1<? super Uri, Unit> function12, Composer composer, final int i3, final int i4) {
        int i5;
        Modifier modifier2;
        int i6;
        TextStyle textStyle2;
        long jM21425getFg0d7_KjU;
        long jM21368getAccent0d7_KjU;
        int i7;
        boolean z2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Function1<? super TextLayoutResult, Unit> function13;
        Function1<? super Uri, Unit> function14;
        int i15;
        int i16;
        Modifier modifier3;
        Function1<? super TextLayoutResult, Unit> function15;
        Composer composer2;
        final Modifier modifier4;
        final TextStyle textStyle3;
        final long j3;
        final long j4;
        final boolean z3;
        final int i17;
        final int i18;
        final Function1<? super TextLayoutResult, Unit> function16;
        final Function1<? super Uri, Unit> function17;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(1650251511);
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = (composerStartRestartGroup.changedInstance(text) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i19 = i4 & 2;
        if (i19 != 0) {
            i5 |= 48;
        } else {
            if ((i3 & 48) == 0) {
                modifier2 = modifier;
                i5 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else {
                if ((i3 & 384) == 0) {
                    textStyle2 = textStyle;
                    i5 |= composerStartRestartGroup.changed(textStyle2) ? 256 : 128;
                }
                if ((i3 & 3072) == 0) {
                    if ((i4 & 8) == 0) {
                        jM21425getFg0d7_KjU = j;
                        int i20 = composerStartRestartGroup.changed(jM21425getFg0d7_KjU) ? 2048 : 1024;
                        i5 |= i20;
                    } else {
                        jM21425getFg0d7_KjU = j;
                    }
                    i5 |= i20;
                } else {
                    jM21425getFg0d7_KjU = j;
                }
                if ((i3 & 24576) == 0) {
                    if ((i4 & 16) == 0) {
                        jM21368getAccent0d7_KjU = j2;
                        int i21 = composerStartRestartGroup.changed(jM21368getAccent0d7_KjU) ? 16384 : 8192;
                        i5 |= i21;
                    } else {
                        jM21368getAccent0d7_KjU = j2;
                    }
                    i5 |= i21;
                } else {
                    jM21368getAccent0d7_KjU = j2;
                }
                i7 = i4 & 32;
                if (i7 != 0) {
                    i5 |= 196608;
                } else {
                    if ((196608 & i3) == 0) {
                        z2 = z;
                        i5 |= composerStartRestartGroup.changed(z2) ? 131072 : 65536;
                    }
                    i8 = i4 & 64;
                    if (i8 == 0) {
                        i5 |= 1572864;
                    } else if ((i3 & 1572864) == 0) {
                        i5 |= composerStartRestartGroup.changed(i) ? 1048576 : 524288;
                    }
                    i9 = i4 & 128;
                    if (i9 == 0) {
                        i5 |= 12582912;
                    } else {
                        if ((i3 & 12582912) == 0) {
                            i10 = i9;
                            i5 |= composerStartRestartGroup.changed(i2) ? 8388608 : 4194304;
                        }
                        i11 = i4 & 256;
                        if (i11 != 0) {
                            i5 |= 100663296;
                        } else {
                            if ((i3 & 100663296) == 0) {
                                i12 = i11;
                                i5 |= composerStartRestartGroup.changedInstance(function1) ? 67108864 : 33554432;
                            }
                            i13 = i4 & 512;
                            if (i13 != 0) {
                                if ((i3 & 805306368) == 0) {
                                    i14 = i13;
                                    i5 |= composerStartRestartGroup.changedInstance(function12) ? 536870912 : 268435456;
                                }
                                if ((i5 & 306783379) != 306783378 || !composerStartRestartGroup.getSkipping()) {
                                    composerStartRestartGroup.startDefaults();
                                    if ((i3 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                        if (i19 != 0) {
                                            modifier2 = Modifier.INSTANCE;
                                        }
                                        if (i6 != 0) {
                                            textStyle2 = TextStyle.INSTANCE.getDefault();
                                        }
                                        if ((i4 & 8) != 0) {
                                            jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU();
                                            i5 &= -7169;
                                        }
                                        if ((i4 & 16) != 0) {
                                            jM21368getAccent0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21368getAccent0d7_KjU();
                                            i5 &= -57345;
                                        }
                                        if (i7 != 0) {
                                            z2 = true;
                                        }
                                        int iM7958getClipgIe3tQ8 = i8 == 0 ? TextOverflow.INSTANCE.m7958getClipgIe3tQ8() : i;
                                        int i22 = i10 == 0 ? Integer.MAX_VALUE : i2;
                                        if (i12 == 0) {
                                            composerStartRestartGroup.startReplaceGroup(1849434622);
                                            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue = new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.BentoRichTextKt$$ExternalSyntheticLambda4
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        return BentoRichText.BentoRichText_0sCZWFg$lambda$1$lambda$0((TextLayoutResult) obj);
                                                    }
                                                };
                                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                            }
                                            function13 = (Function1) objRememberedValue;
                                            composerStartRestartGroup.endReplaceGroup();
                                        } else {
                                            function13 = function1;
                                        }
                                        if (i14 == 0) {
                                            composerStartRestartGroup.startReplaceGroup(1849434622);
                                            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.BentoRichTextKt$$ExternalSyntheticLambda5
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        return BentoRichText.BentoRichText_0sCZWFg$lambda$3$lambda$2((Uri) obj);
                                                    }
                                                };
                                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                            }
                                            composerStartRestartGroup.endReplaceGroup();
                                            i15 = iM7958getClipgIe3tQ8;
                                            i16 = i22;
                                            function14 = (Function1) objRememberedValue2;
                                        } else {
                                            function14 = function12;
                                            i15 = iM7958getClipgIe3tQ8;
                                            i16 = i22;
                                        }
                                        modifier3 = modifier2;
                                        function15 = function13;
                                    } else {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        if ((i4 & 8) != 0) {
                                            i5 &= -7169;
                                        }
                                        if ((i4 & 16) != 0) {
                                            i5 &= -57345;
                                        }
                                        i15 = i;
                                        i16 = i2;
                                        function15 = function1;
                                        function14 = function12;
                                        modifier3 = modifier2;
                                    }
                                    TextStyle textStyle4 = textStyle2;
                                    long j5 = jM21425getFg0d7_KjU;
                                    long j6 = jM21368getAccent0d7_KjU;
                                    boolean z4 = z2;
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1650251511, i5, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.BentoRichText (BentoRichText.kt:42)");
                                    }
                                    composer2 = composerStartRestartGroup;
                                    m15948BentoRichText0sCZWFg(IconExtensions.toDbRichText(text), modifier3, textStyle4, j5, j6, z4, i15, i16, function15, function14, composer2, i5 & 2147483632, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    modifier4 = modifier3;
                                    textStyle3 = textStyle4;
                                    j3 = j5;
                                    j4 = j6;
                                    z3 = z4;
                                    i17 = i15;
                                    i18 = i16;
                                    function16 = function15;
                                    function17 = function14;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    function17 = function12;
                                    composer2 = composerStartRestartGroup;
                                    modifier4 = modifier2;
                                    textStyle3 = textStyle2;
                                    j3 = jM21425getFg0d7_KjU;
                                    j4 = jM21368getAccent0d7_KjU;
                                    z3 = z2;
                                    i17 = i;
                                    i18 = i2;
                                    function16 = function1;
                                }
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.BentoRichTextKt$$ExternalSyntheticLambda6
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return BentoRichText.BentoRichText_0sCZWFg$lambda$4(text, modifier4, textStyle3, j3, j4, z3, i17, i18, function16, function17, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i5 |= 805306368;
                            i14 = i13;
                            if ((i5 & 306783379) != 306783378) {
                                composerStartRestartGroup.startDefaults();
                                if ((i3 & 1) != 0) {
                                    if (i19 != 0) {
                                    }
                                    if (i6 != 0) {
                                    }
                                    if ((i4 & 8) != 0) {
                                    }
                                    if ((i4 & 16) != 0) {
                                    }
                                    if (i7 != 0) {
                                    }
                                    if (i8 == 0) {
                                    }
                                    if (i10 == 0) {
                                    }
                                    if (i12 == 0) {
                                    }
                                    if (i14 == 0) {
                                    }
                                    modifier3 = modifier2;
                                    function15 = function13;
                                    TextStyle textStyle42 = textStyle2;
                                    long j52 = jM21425getFg0d7_KjU;
                                    long j62 = jM21368getAccent0d7_KjU;
                                    boolean z42 = z2;
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    composer2 = composerStartRestartGroup;
                                    m15948BentoRichText0sCZWFg(IconExtensions.toDbRichText(text), modifier3, textStyle42, j52, j62, z42, i15, i16, function15, function14, composer2, i5 & 2147483632, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    modifier4 = modifier3;
                                    textStyle3 = textStyle42;
                                    j3 = j52;
                                    j4 = j62;
                                    z3 = z42;
                                    i17 = i15;
                                    i18 = i16;
                                    function16 = function15;
                                    function17 = function14;
                                }
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        i12 = i11;
                        i13 = i4 & 512;
                        if (i13 != 0) {
                        }
                        i14 = i13;
                        if ((i5 & 306783379) != 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    i10 = i9;
                    i11 = i4 & 256;
                    if (i11 != 0) {
                    }
                    i12 = i11;
                    i13 = i4 & 512;
                    if (i13 != 0) {
                    }
                    i14 = i13;
                    if ((i5 & 306783379) != 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                z2 = z;
                i8 = i4 & 64;
                if (i8 == 0) {
                }
                i9 = i4 & 128;
                if (i9 == 0) {
                }
                i10 = i9;
                i11 = i4 & 256;
                if (i11 != 0) {
                }
                i12 = i11;
                i13 = i4 & 512;
                if (i13 != 0) {
                }
                i14 = i13;
                if ((i5 & 306783379) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            textStyle2 = textStyle;
            if ((i3 & 3072) == 0) {
            }
            if ((i3 & 24576) == 0) {
            }
            i7 = i4 & 32;
            if (i7 != 0) {
            }
            z2 = z;
            i8 = i4 & 64;
            if (i8 == 0) {
            }
            i9 = i4 & 128;
            if (i9 == 0) {
            }
            i10 = i9;
            i11 = i4 & 256;
            if (i11 != 0) {
            }
            i12 = i11;
            i13 = i4 & 512;
            if (i13 != 0) {
            }
            i14 = i13;
            if ((i5 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        textStyle2 = textStyle;
        if ((i3 & 3072) == 0) {
        }
        if ((i3 & 24576) == 0) {
        }
        i7 = i4 & 32;
        if (i7 != 0) {
        }
        z2 = z;
        i8 = i4 & 64;
        if (i8 == 0) {
        }
        i9 = i4 & 128;
        if (i9 == 0) {
        }
        i10 = i9;
        i11 = i4 & 256;
        if (i11 != 0) {
        }
        i12 = i11;
        i13 = i4 & 512;
        if (i13 != 0) {
        }
        i14 = i13;
        if ((i5 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoRichText_0sCZWFg$lambda$6$lambda$5(TextLayoutResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoRichText_0sCZWFg$lambda$8$lambda$7(Uri it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:201:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fb  */
    /* renamed from: BentoRichText-0sCZWFg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m15948BentoRichText0sCZWFg(RichText text, Modifier modifier, TextStyle textStyle, long j, long j2, boolean z, int i, int i2, Function1<? super TextLayoutResult, Unit> function1, Function1<? super Uri, Unit> function12, Composer composer, final int i3, final int i4) {
        int i5;
        int i6;
        long j3;
        int i7;
        boolean z2;
        int i8;
        int i9;
        int i10;
        int i11;
        Modifier modifier2;
        long jM21425getFg0d7_KjU;
        long jM21368getAccent0d7_KjU;
        Function1<? super TextLayoutResult, Unit> function13;
        final Function1<? super Uri, Unit> function14;
        int i12;
        Function1<? super TextLayoutResult, Unit> function15;
        TextStyle textStyle2;
        int i13;
        boolean z3;
        long j4;
        boolean z4;
        Object objRememberedValue;
        final RichText richText;
        Modifier modifier3;
        final Function1<? super Uri, Unit> function16;
        Composer composer2;
        final int i14;
        final boolean z5;
        final int i15;
        final Function1<? super TextLayoutResult, Unit> function17;
        final TextStyle textStyle3;
        final long j5;
        final long j6;
        Context contextCopy$default;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(1650251511);
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = (composerStartRestartGroup.changedInstance(text) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i16 = i4 & 2;
        if (i16 != 0) {
            i5 |= 48;
        } else {
            if ((i3 & 48) == 0) {
                i5 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else {
                if ((i3 & 384) == 0) {
                    i5 |= composerStartRestartGroup.changed(textStyle) ? 256 : 128;
                }
                if ((i3 & 3072) == 0) {
                    i5 |= ((i4 & 8) == 0 && composerStartRestartGroup.changed(j)) ? 2048 : 1024;
                }
                if ((i3 & 24576) == 0) {
                    if ((i4 & 16) == 0) {
                        j3 = j2;
                        int i17 = composerStartRestartGroup.changed(j3) ? 16384 : 8192;
                        i5 |= i17;
                    } else {
                        j3 = j2;
                    }
                    i5 |= i17;
                } else {
                    j3 = j2;
                }
                i7 = i4 & 32;
                if (i7 == 0) {
                    if ((196608 & i3) == 0) {
                        z2 = z;
                        i5 |= composerStartRestartGroup.changed(z2) ? 131072 : 65536;
                    }
                    i8 = i4 & 64;
                    if (i8 == 0) {
                        i5 |= 1572864;
                    } else if ((i3 & 1572864) == 0) {
                        i5 |= composerStartRestartGroup.changed(i) ? 1048576 : 524288;
                    }
                    i9 = i4 & 128;
                    if (i9 == 0) {
                        i5 |= 12582912;
                    } else if ((i3 & 12582912) == 0) {
                        i5 |= composerStartRestartGroup.changed(i2) ? 8388608 : 4194304;
                    }
                    i10 = i4 & 256;
                    if (i10 == 0) {
                        i5 |= 100663296;
                    } else if ((i3 & 100663296) == 0) {
                        i5 |= composerStartRestartGroup.changedInstance(function1) ? 67108864 : 33554432;
                    }
                    i11 = i4 & 512;
                    if (i11 == 0) {
                        i5 |= 805306368;
                    } else if ((i3 & 805306368) == 0) {
                        i5 |= composerStartRestartGroup.changedInstance(function12) ? 536870912 : 268435456;
                    }
                    if ((i5 & 306783379) == 306783378 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i3 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            modifier2 = i16 == 0 ? Modifier.INSTANCE : modifier;
                            TextStyle textStyle4 = i6 == 0 ? TextStyle.INSTANCE.getDefault() : textStyle;
                            if ((i4 & 8) == 0) {
                                jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU();
                                i5 &= -7169;
                            } else {
                                jM21425getFg0d7_KjU = j;
                            }
                            if ((i4 & 16) == 0) {
                                jM21368getAccent0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21368getAccent0d7_KjU();
                                i5 &= -57345;
                            } else {
                                jM21368getAccent0d7_KjU = j3;
                            }
                            if (i7 != 0) {
                                z2 = true;
                            }
                            int iM7958getClipgIe3tQ8 = i8 == 0 ? TextOverflow.INSTANCE.m7958getClipgIe3tQ8() : i;
                            int i18 = i9 == 0 ? Integer.MAX_VALUE : i2;
                            if (i10 == 0) {
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.BentoRichTextKt$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return BentoRichText.BentoRichText_0sCZWFg$lambda$6$lambda$5((TextLayoutResult) obj);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                function13 = (Function1) objRememberedValue2;
                                composerStartRestartGroup.endReplaceGroup();
                            } else {
                                function13 = function1;
                            }
                            if (i11 == 0) {
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue3 = new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.BentoRichTextKt$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return BentoRichText.BentoRichText_0sCZWFg$lambda$8$lambda$7((Uri) obj);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                }
                                function14 = (Function1) objRememberedValue3;
                                composerStartRestartGroup.endReplaceGroup();
                            } else {
                                function14 = function12;
                            }
                            i12 = i18;
                            function15 = function13;
                            textStyle2 = textStyle4;
                            i13 = iM7958getClipgIe3tQ8;
                            z3 = z2;
                            j4 = jM21425getFg0d7_KjU;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i4 & 8) != 0) {
                                i5 &= -7169;
                            }
                            if ((i4 & 16) != 0) {
                                i5 &= -57345;
                            }
                            modifier2 = modifier;
                            textStyle2 = textStyle;
                            j4 = j;
                            i13 = i;
                            i12 = i2;
                            function15 = function1;
                            function14 = function12;
                            jM21368getAccent0d7_KjU = j3;
                            z3 = z2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1650251511, i5, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.BentoRichText (BentoRichText.kt:69)");
                        }
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        int i19 = i5 & 1879048192;
                        z4 = i19 != 536870912;
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!z4 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new LinkInteractionListener() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.BentoRichTextKt$BentoRichText$annotatedString$1$1
                                @Override // androidx.compose.p011ui.text.LinkInteractionListener
                                public final void onClick(LinkAnnotation link) {
                                    Intrinsics.checkNotNullParameter(link, "link");
                                    function14.invoke(Uri.parse(((LinkAnnotation.Url) link).getUrl()));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        long j7 = jM21368getAccent0d7_KjU;
                        AnnotatedString annotatedStringM15958toAnnotatedStringV23IgeMak = RichTexts2.m15958toAnnotatedStringV23IgeMak(text, j7, (LinkInteractionListener) objRememberedValue, composerStartRestartGroup, (i5 & 14) | ((i5 >> 9) & 112), 0);
                        richText = text;
                        if (RichTexts2.hasLink(richText)) {
                            composerStartRestartGroup.startReplaceGroup(-1845491968);
                            int i20 = i5 << 3;
                            modifier3 = modifier2;
                            BentoText2.m20748BentoTextQnj7Zds(annotatedStringM15958toAnnotatedStringV23IgeMak, modifier3, Color.m6701boximpl(j4), null, null, null, null, i13, z3, i12, 0, null, function15, textStyle2, composerStartRestartGroup, (i5 & 112) | ((i5 >> 3) & 896) | (29360128 & i20) | (234881024 & (i5 << 9)) | (1879048192 & (i5 << 6)), ((i5 >> 18) & 896) | (i20 & 7168), 3192);
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            composerStartRestartGroup.startReplaceGroup(-1847151460);
                            composerStartRestartGroup.startReplaceGroup(-1633490746);
                            boolean zChangedInstance = (i19 == 536870912) | composerStartRestartGroup.changedInstance(richText);
                            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (zChangedInstance || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue4 = new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.BentoRichTextKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return BentoRichText.BentoRichText_0sCZWFg$lambda$14$lambda$13(richText, function14, (SemanticsPropertyReceiver) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifierSemantics$default = SemanticsModifier6.semantics$default(modifier2, false, (Function1) objRememberedValue4, 1, null);
                            UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                            Component component = new Component(Component.ComponentType.LINK_BUTTON, null, null, 6, null);
                            Context context = ((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor())).getContext();
                            if (context != null) {
                                String strFirstClickableLinkText = RichTexts2.firstClickableLinkText(richText);
                                if (strFirstClickableLinkText == null) {
                                    strFirstClickableLinkText = "";
                                }
                                contextCopy$default = Context.copy$default(context, 0, 0, 0, strFirstClickableLinkText, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -9, -1, -1, -1, -1, -1, 16383, null);
                            } else {
                                contextCopy$default = null;
                            }
                            int i21 = i5 << 3;
                            BentoText2.m20748BentoTextQnj7Zds(annotatedStringM15958toAnnotatedStringV23IgeMak, ModifiersKt.autoLogEvents$default(modifierSemantics$default, UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor, new UserInteractionEventDescriptor(null, null, null, contextCopy$default, component, null, 39, null)), true, false, false, true, false, null, 108, null), Color.m6701boximpl(j4), null, null, null, null, i13, z3, i12, 0, null, function15, textStyle2, composerStartRestartGroup, ((i5 >> 3) & 896) | (29360128 & i21) | ((i5 << 9) & 234881024) | (1879048192 & (i5 << 6)), ((i5 >> 18) & 896) | (i21 & 7168), 3192);
                            composerStartRestartGroup.endReplaceGroup();
                            modifier3 = modifier2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function16 = function14;
                        composer2 = composerStartRestartGroup;
                        i14 = i13;
                        z5 = z3;
                        i15 = i12;
                        function17 = function15;
                        textStyle3 = textStyle2;
                        j5 = j7;
                        j6 = j4;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier;
                        textStyle3 = textStyle;
                        j6 = j;
                        i14 = i;
                        function16 = function12;
                        composer2 = composerStartRestartGroup;
                        j5 = j3;
                        z5 = z2;
                        richText = text;
                        i15 = i2;
                        function17 = function1;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        final RichText richText2 = richText;
                        final Modifier modifier4 = modifier3;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.BentoRichTextKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return BentoRichText.BentoRichText_0sCZWFg$lambda$15(richText2, modifier4, textStyle3, j6, j5, z5, i14, i15, function17, function16, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i5 |= 196608;
                z2 = z;
                i8 = i4 & 64;
                if (i8 == 0) {
                }
                i9 = i4 & 128;
                if (i9 == 0) {
                }
                i10 = i4 & 256;
                if (i10 == 0) {
                }
                i11 = i4 & 512;
                if (i11 == 0) {
                }
                if ((i5 & 306783379) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                        if (i16 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if ((i4 & 8) == 0) {
                        }
                        if ((i4 & 16) == 0) {
                        }
                        if (i7 != 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i9 == 0) {
                        }
                        if (i10 == 0) {
                        }
                        if (i11 == 0) {
                        }
                        i12 = i18;
                        function15 = function13;
                        textStyle2 = textStyle4;
                        i13 = iM7958getClipgIe3tQ8;
                        z3 = z2;
                        j4 = jM21425getFg0d7_KjU;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        int i192 = i5 & 1879048192;
                        if (i192 != 536870912) {
                        }
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!z4) {
                            objRememberedValue = new LinkInteractionListener() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.BentoRichTextKt$BentoRichText$annotatedString$1$1
                                @Override // androidx.compose.p011ui.text.LinkInteractionListener
                                public final void onClick(LinkAnnotation link) {
                                    Intrinsics.checkNotNullParameter(link, "link");
                                    function14.invoke(Uri.parse(((LinkAnnotation.Url) link).getUrl()));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            composerStartRestartGroup.endReplaceGroup();
                            long j72 = jM21368getAccent0d7_KjU;
                            AnnotatedString annotatedStringM15958toAnnotatedStringV23IgeMak2 = RichTexts2.m15958toAnnotatedStringV23IgeMak(text, j72, (LinkInteractionListener) objRememberedValue, composerStartRestartGroup, (i5 & 14) | ((i5 >> 9) & 112), 0);
                            richText = text;
                            if (RichTexts2.hasLink(richText)) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            function16 = function14;
                            composer2 = composerStartRestartGroup;
                            i14 = i13;
                            z5 = z3;
                            i15 = i12;
                            function17 = function15;
                            textStyle3 = textStyle2;
                            j5 = j72;
                            j6 = j4;
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            if ((i3 & 3072) == 0) {
            }
            if ((i3 & 24576) == 0) {
            }
            i7 = i4 & 32;
            if (i7 == 0) {
            }
            z2 = z;
            i8 = i4 & 64;
            if (i8 == 0) {
            }
            i9 = i4 & 128;
            if (i9 == 0) {
            }
            i10 = i4 & 256;
            if (i10 == 0) {
            }
            i11 = i4 & 512;
            if (i11 == 0) {
            }
            if ((i5 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        if ((i3 & 3072) == 0) {
        }
        if ((i3 & 24576) == 0) {
        }
        i7 = i4 & 32;
        if (i7 == 0) {
        }
        z2 = z;
        i8 = i4 & 64;
        if (i8 == 0) {
        }
        i9 = i4 & 128;
        if (i9 == 0) {
        }
        i10 = i4 & 256;
        if (i10 == 0) {
        }
        i11 = i4 & 512;
        if (i11 == 0) {
        }
        if ((i5 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoRichText_0sCZWFg$lambda$14$lambda$13(RichText richText, final Function1 function1, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        List<RichText.Attribute> attributes = richText.getAttributes();
        ArrayList<RichText.Attribute> arrayList = new ArrayList();
        for (Object obj : attributes) {
            if (((RichText.Attribute) obj).getLink() != null) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return Unit.INSTANCE;
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (final RichText.Attribute attribute : arrayList) {
            String strSubstring = richText.getText().substring(attribute.getLocation(), attribute.getLocation() + attribute.getLength());
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            arrayList2.add(new CustomAccessibilityAction(strSubstring, new Function0() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.BentoRichTextKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(BentoRichText.BentoRichText_0sCZWFg$lambda$14$lambda$13$lambda$12$lambda$11(attribute, function1));
                }
            }));
        }
        SemanticsPropertiesKt.setCustomActions(semantics, arrayList2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean BentoRichText_0sCZWFg$lambda$14$lambda$13$lambda$12$lambda$11(RichText.Attribute attribute, Function1 function1) {
        Uri link = attribute.getLink();
        if (link == null) {
            return false;
        }
        function1.invoke(link);
        return true;
    }

    public static final void BentoRichTextWithLinkPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(820188505);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(820188505, i, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.BentoRichTextWithLinkPreview (BentoRichText.kt:132)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, BentoRichText3.INSTANCE.m15951getLambda$465877343$lib_sdui_externalRelease(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.BentoRichTextKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoRichText.BentoRichTextWithLinkPreview$lambda$16(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void BentoRichTextNoLinkPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-909860162);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-909860162, i, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.BentoRichTextNoLinkPreview (BentoRichText.kt:187)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, BentoRichText3.INSTANCE.m15950getLambda$1635219962$lib_sdui_externalRelease(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.BentoRichTextKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoRichText.BentoRichTextNoLinkPreview$lambda$17(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
