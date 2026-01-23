package com.robinhood.compose.bento.component;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.LinkAnnotation;
import androidx.compose.p011ui.text.LinkInteractionListener;
import androidx.compose.p011ui.text.PlatformSpanStyle;
import androidx.compose.p011ui.text.PlatformTextStyle;
import androidx.compose.p011ui.text.SpanStyle;
import androidx.compose.p011ui.text.TextLinkStyles;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.LineHeightStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import androidx.compose.p011ui.text.style.TextIndent;
import androidx.compose.p011ui.text.style.TextMotion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: BentoTextWithLink.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a[\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001aQ\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a[\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00032\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0018\u0010\u0011\u001a1\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u001b\u0010\u001c\u001a%\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0002¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, m3636d2 = {"BentoTextWithLink", "", "text", "", "inlineLinkText", "inlineLinkTextOnClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", ResourceTypes.COLOR, "Landroidx/compose/ui/graphics/Color;", "linkColor", ResourceTypes.STYLE, "Landroidx/compose/ui/text/TextStyle;", "textAlign", "Landroidx/compose/ui/text/style/TextAlign;", "BentoTextWithLink-XkG1Q0A", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/TextStyle;ILandroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/text/AnnotatedString;", "BentoTextWithLink-IgVrAbQ", "(Landroidx/compose/ui/text/AnnotatedString;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/text/TextStyle;ILandroidx/compose/runtime/Composer;II)V", "BentoTextWithSubstringLink", "substringLinkText", "substringLinkTextOnClick", "BentoTextWithSubstringLink-XkG1Q0A", "TextWithLinkFromAnnotatedString", "annotatedString", "TextWithLinkFromAnnotatedString-xkNWiIY", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;ILandroidx/compose/runtime/Composer;II)V", "clickableLinkAnnotation", "Landroidx/compose/ui/text/LinkAnnotation$Clickable;", "clickableLinkAnnotation-DxMtmZc", "(JLkotlin/jvm/functions/Function0;)Landroidx/compose/ui/text/LinkAnnotation$Clickable;", "lib-compose-bento_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.bento.component.BentoTextWithLinkKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class BentoTextWithLink {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoTextWithLink_IgVrAbQ$lambda$7(AnnotatedString annotatedString, String str, Function0 function0, Modifier modifier, long j, TextStyle textStyle, int i, int i2, int i3, Composer composer, int i4) {
        m20751BentoTextWithLinkIgVrAbQ(annotatedString, str, function0, modifier, j, textStyle, i, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoTextWithLink_XkG1Q0A$lambda$3(String str, String str2, Function0 function0, Modifier modifier, long j, long j2, TextStyle textStyle, int i, int i2, int i3, Composer composer, int i4) {
        m20752BentoTextWithLinkXkG1Q0A(str, str2, function0, modifier, j, j2, textStyle, i, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoTextWithSubstringLink_XkG1Q0A$lambda$12(String str, String str2, Function0 function0, Modifier modifier, long j, long j2, TextStyle textStyle, int i, int i2, int i3, Composer composer, int i4) {
        m20753BentoTextWithSubstringLinkXkG1Q0A(str, str2, function0, modifier, j, j2, textStyle, i, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextWithLinkFromAnnotatedString_xkNWiIY$lambda$13(Modifier modifier, AnnotatedString annotatedString, TextStyle textStyle, int i, int i2, int i3, Composer composer, int i4) {
        m20754TextWithLinkFromAnnotatedStringxkNWiIY(modifier, annotatedString, textStyle, i, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0113  */
    /* renamed from: BentoTextWithLink-XkG1Q0A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m20752BentoTextWithLinkXkG1Q0A(String text, final String inlineLinkText, final Function0<Unit> inlineLinkTextOnClick, Modifier modifier, final long j, long j2, final TextStyle style, int i, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        long j3;
        long j4;
        int i5;
        int i6;
        Modifier modifier3;
        int iM7925getUnspecifiede0LSkKk;
        AnnotatedString.Builder builder;
        int iPushStyle;
        String str;
        int iPushLink;
        final Modifier modifier4;
        final int i7;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(inlineLinkText, "inlineLinkText");
        Intrinsics.checkNotNullParameter(inlineLinkTextOnClick, "inlineLinkTextOnClick");
        Intrinsics.checkNotNullParameter(style, "style");
        Composer composerStartRestartGroup = composer.startRestartGroup(-257411417);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(text) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(inlineLinkText) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(inlineLinkTextOnClick) ? 256 : 128;
        }
        int i8 = i3 & 8;
        if (i8 == 0) {
            if ((i2 & 3072) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 16) == 0) {
                i4 |= 24576;
                j3 = j;
            } else {
                j3 = j;
                if ((i2 & 24576) == 0) {
                    i4 |= composerStartRestartGroup.changed(j3) ? 16384 : 8192;
                }
            }
            if ((196608 & i2) != 0) {
                j4 = j2;
                i4 |= ((i3 & 32) == 0 && composerStartRestartGroup.changed(j4)) ? 131072 : 65536;
            } else {
                j4 = j2;
            }
            if ((i3 & 64) == 0) {
                i4 |= 1572864;
            } else if ((i2 & 1572864) == 0) {
                i4 |= composerStartRestartGroup.changed(style) ? 1048576 : 524288;
            }
            if ((12582912 & i2) != 0) {
                if ((i3 & 128) == 0) {
                    i5 = i;
                    int i9 = composerStartRestartGroup.changed(i5) ? 8388608 : 4194304;
                    i4 |= i9;
                } else {
                    i5 = i;
                }
                i4 |= i9;
            } else {
                i5 = i;
            }
            if ((i4 & 4793491) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                try {
                    try {
                        if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            Modifier modifier5 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                            if ((i3 & 32) != 0) {
                                i4 &= -458753;
                                j4 = j3;
                            }
                            if ((i3 & 128) == 0) {
                                iM7925getUnspecifiede0LSkKk = TextAlign.INSTANCE.m7925getUnspecifiede0LSkKk();
                                Modifier modifier6 = modifier5;
                                i6 = i4 & (-29360129);
                                modifier3 = modifier6;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-257411417, i6, -1, "com.robinhood.compose.bento.component.BentoTextWithLink (BentoTextWithLink.kt:30)");
                                }
                                Modifier modifier7 = modifier3;
                                builder = new AnnotatedString.Builder(0, 1, null);
                                iPushStyle = builder.pushStyle(new SpanStyle(j3, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null));
                                str = text;
                                builder.append(str);
                                Unit unit = Unit.INSTANCE;
                                builder.pop(iPushStyle);
                                builder.append(' ');
                                iPushLink = builder.pushLink(m20755clickableLinkAnnotationDxMtmZc(j4, inlineLinkTextOnClick));
                                builder.append(inlineLinkText);
                                builder.pop(iPushLink);
                                int i10 = i6;
                                AnnotatedString annotatedString = builder.toAnnotatedString();
                                int i11 = (i10 >> 9) & 14;
                                int i12 = i10 >> 12;
                                int i13 = i11 | (i12 & 896) | (i12 & 7168);
                                modifier4 = modifier7;
                                m20754TextWithLinkFromAnnotatedStringxkNWiIY(modifier4, annotatedString, style, iM7925getUnspecifiede0LSkKk, composerStartRestartGroup, i13, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                i7 = iM7925getUnspecifiede0LSkKk;
                            } else {
                                Modifier modifier8 = modifier5;
                                i6 = i4;
                                modifier3 = modifier8;
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i3 & 32) != 0) {
                                i4 &= -458753;
                            }
                            if ((i3 & 128) != 0) {
                                i4 &= -29360129;
                            }
                            i6 = i4;
                            modifier3 = modifier2;
                        }
                        builder.append(inlineLinkText);
                        builder.pop(iPushLink);
                        int i102 = i6;
                        AnnotatedString annotatedString2 = builder.toAnnotatedString();
                        int i112 = (i102 >> 9) & 14;
                        int i122 = i102 >> 12;
                        int i132 = i112 | (i122 & 896) | (i122 & 7168);
                        modifier4 = modifier7;
                        m20754TextWithLinkFromAnnotatedStringxkNWiIY(modifier4, annotatedString2, style, iM7925getUnspecifiede0LSkKk, composerStartRestartGroup, i132, 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        i7 = iM7925getUnspecifiede0LSkKk;
                    } catch (Throwable th) {
                        builder.pop(iPushLink);
                        throw th;
                    }
                    builder.append(str);
                    Unit unit2 = Unit.INSTANCE;
                    builder.pop(iPushStyle);
                    builder.append(' ');
                    iPushLink = builder.pushLink(m20755clickableLinkAnnotationDxMtmZc(j4, inlineLinkTextOnClick));
                } catch (Throwable th2) {
                    builder.pop(iPushStyle);
                    throw th2;
                }
                iM7925getUnspecifiede0LSkKk = i5;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifier72 = modifier3;
                builder = new AnnotatedString.Builder(0, 1, null);
                iPushStyle = builder.pushStyle(new SpanStyle(j3, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null));
                str = text;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                i7 = i5;
                str = text;
            }
            final long j5 = j4;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final String str2 = str;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoTextWithLinkKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return BentoTextWithLink.BentoTextWithLink_XkG1Q0A$lambda$3(str2, inlineLinkText, inlineLinkTextOnClick, modifier4, j, j5, style, i7, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i4 |= 3072;
        modifier2 = modifier;
        if ((i3 & 16) == 0) {
        }
        if ((196608 & i2) != 0) {
        }
        if ((i3 & 64) == 0) {
        }
        if ((12582912 & i2) != 0) {
        }
        if ((i4 & 4793491) == 4793490) {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
                if (i8 == 0) {
                }
                if ((i3 & 32) != 0) {
                }
                if ((i3 & 128) == 0) {
                }
            }
        }
        final long j52 = j4;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0124  */
    /* renamed from: BentoTextWithLink-IgVrAbQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m20751BentoTextWithLinkIgVrAbQ(final AnnotatedString text, final String inlineLinkText, final Function0<Unit> inlineLinkTextOnClick, Modifier modifier, long j, final TextStyle style, int i, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        Modifier modifier3;
        int iM7925getUnspecifiede0LSkKk;
        AnnotatedString.Builder builder;
        Composer composer2;
        long j2;
        int iPushStyle;
        int iPushLink;
        final Modifier modifier4;
        final int i6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(inlineLinkText, "inlineLinkText");
        Intrinsics.checkNotNullParameter(inlineLinkTextOnClick, "inlineLinkTextOnClick");
        Intrinsics.checkNotNullParameter(style, "style");
        Composer composerStartRestartGroup = composer.startRestartGroup(1144902988);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(text) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(inlineLinkText) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(inlineLinkTextOnClick) ? 256 : 128;
        }
        int i7 = i3 & 8;
        if (i7 == 0) {
            if ((i2 & 3072) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 16) == 0) {
                i4 |= 24576;
            } else if ((i2 & 24576) == 0) {
                i4 |= composerStartRestartGroup.changed(j) ? 16384 : 8192;
            }
            if ((i3 & 32) == 0) {
                i4 |= 196608;
            } else if ((i2 & 196608) == 0) {
                i4 |= composerStartRestartGroup.changed(style) ? 131072 : 65536;
            }
            if ((1572864 & i2) != 0) {
                if ((i3 & 64) == 0) {
                    i5 = i;
                    int i8 = composerStartRestartGroup.changed(i5) ? 1048576 : 524288;
                    i4 |= i8;
                } else {
                    i5 = i;
                }
                i4 |= i8;
            } else {
                i5 = i;
            }
            if ((599187 & i4) == 599186 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                try {
                    try {
                        if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            Modifier modifier5 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                            if ((i3 & 64) == 0) {
                                i4 &= -3670017;
                                modifier3 = modifier5;
                                iM7925getUnspecifiede0LSkKk = TextAlign.INSTANCE.m7925getUnspecifiede0LSkKk();
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1144902988, i4, -1, "com.robinhood.compose.bento.component.BentoTextWithLink (BentoTextWithLink.kt:60)");
                                }
                                builder = new AnnotatedString.Builder(0, 1, null);
                                int i9 = i4;
                                composer2 = composerStartRestartGroup;
                                j2 = j;
                                iPushStyle = builder.pushStyle(new SpanStyle(j, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null));
                                builder.append(text);
                                Unit unit = Unit.INSTANCE;
                                builder.pop(iPushStyle);
                                builder.append(' ');
                                iPushLink = builder.pushLink(m20755clickableLinkAnnotationDxMtmZc(j2, inlineLinkTextOnClick));
                                builder.append(inlineLinkText);
                                builder.pop(iPushLink);
                                modifier4 = modifier3;
                                int i10 = iM7925getUnspecifiede0LSkKk;
                                m20754TextWithLinkFromAnnotatedStringxkNWiIY(modifier4, builder.toAnnotatedString(), style, i10, composer2, (i9 >> 9) & 8078, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                i6 = i10;
                            } else {
                                modifier3 = modifier5;
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                            }
                            modifier3 = modifier2;
                        }
                        builder.append(inlineLinkText);
                        builder.pop(iPushLink);
                        modifier4 = modifier3;
                        int i102 = iM7925getUnspecifiede0LSkKk;
                        m20754TextWithLinkFromAnnotatedStringxkNWiIY(modifier4, builder.toAnnotatedString(), style, i102, composer2, (i9 >> 9) & 8078, 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        i6 = i102;
                    } catch (Throwable th) {
                        builder.pop(iPushLink);
                        throw th;
                    }
                    builder.append(text);
                    Unit unit2 = Unit.INSTANCE;
                    builder.pop(iPushStyle);
                    builder.append(' ');
                    iPushLink = builder.pushLink(m20755clickableLinkAnnotationDxMtmZc(j2, inlineLinkTextOnClick));
                } catch (Throwable th2) {
                    builder.pop(iPushStyle);
                    throw th2;
                }
                iM7925getUnspecifiede0LSkKk = i5;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                builder = new AnnotatedString.Builder(0, 1, null);
                int i92 = i4;
                composer2 = composerStartRestartGroup;
                j2 = j;
                iPushStyle = builder.pushStyle(new SpanStyle(j, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null));
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier4 = modifier2;
                i6 = i5;
                j2 = j;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final long j3 = j2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoTextWithLinkKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return BentoTextWithLink.BentoTextWithLink_IgVrAbQ$lambda$7(text, inlineLinkText, inlineLinkTextOnClick, modifier4, j3, style, i6, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i4 |= 3072;
        modifier2 = modifier;
        if ((i3 & 16) == 0) {
        }
        if ((i3 & 32) == 0) {
        }
        if ((1572864 & i2) != 0) {
        }
        if ((599187 & i4) == 599186) {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
                if (i7 == 0) {
                }
                if ((i3 & 64) == 0) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010c  */
    /* renamed from: BentoTextWithSubstringLink-XkG1Q0A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m20753BentoTextWithSubstringLinkXkG1Q0A(final String text, final String substringLinkText, final Function0<Unit> substringLinkTextOnClick, Modifier modifier, final long j, long j2, final TextStyle style, int i, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        long j3;
        long j4;
        final int i5;
        int iM7925getUnspecifiede0LSkKk;
        int i6;
        int iIndexOf$default;
        final Modifier modifier3;
        final long j5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(substringLinkText, "substringLinkText");
        Intrinsics.checkNotNullParameter(substringLinkTextOnClick, "substringLinkTextOnClick");
        Intrinsics.checkNotNullParameter(style, "style");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2130855454);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(text) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(substringLinkText) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(substringLinkTextOnClick) ? 256 : 128;
        }
        int i7 = i3 & 8;
        if (i7 != 0) {
            i4 |= 3072;
        } else {
            if ((i2 & 3072) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 16) != 0) {
                if ((i2 & 24576) == 0) {
                    j3 = j;
                    i4 |= composerStartRestartGroup.changed(j3) ? 16384 : 8192;
                }
                if ((196608 & i2) == 0) {
                    j4 = j2;
                    i4 |= ((i3 & 32) == 0 && composerStartRestartGroup.changed(j4)) ? 131072 : 65536;
                } else {
                    j4 = j2;
                }
                if ((i3 & 64) != 0) {
                    i4 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    i4 |= composerStartRestartGroup.changed(style) ? 1048576 : 524288;
                }
                if ((12582912 & i2) == 0) {
                    if ((i3 & 128) == 0) {
                        i5 = i;
                        int i8 = composerStartRestartGroup.changed(i5) ? 8388608 : 4194304;
                        i4 |= i8;
                    } else {
                        i5 = i;
                    }
                    i4 |= i8;
                } else {
                    i5 = i;
                }
                if ((i4 & 4793491) == 4793490 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    j5 = j4;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i7 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i3 & 32) != 0) {
                            i4 &= -458753;
                            j4 = j3;
                        }
                        if ((i3 & 128) == 0) {
                            iM7925getUnspecifiede0LSkKk = TextAlign.INSTANCE.m7925getUnspecifiede0LSkKk();
                            i6 = i4 & (-29360129);
                        }
                        Modifier modifier4 = modifier2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2130855454, i6, -1, "com.robinhood.compose.bento.component.BentoTextWithSubstringLink (BentoTextWithLink.kt:91)");
                        }
                        int i9 = i6;
                        iIndexOf$default = StringsKt.indexOf$default((CharSequence) text, substringLinkText, 0, false, 6, (Object) null);
                        if (iIndexOf$default < 0) {
                            throw new IllegalStateException("Substring is not in main text");
                        }
                        String string2 = text.subSequence(0, iIndexOf$default).toString();
                        String string3 = text.subSequence(iIndexOf$default + substringLinkText.length(), text.length()).toString();
                        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                        int iPushStyle = builder.pushStyle(new SpanStyle(j, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null));
                        try {
                            builder.append(string2);
                            Unit unit = Unit.INSTANCE;
                            builder.pop(iPushStyle);
                            int iPushLink = builder.pushLink(m20755clickableLinkAnnotationDxMtmZc(j4, substringLinkTextOnClick));
                            try {
                                builder.append(substringLinkText);
                                builder.pop(iPushLink);
                                iPushStyle = builder.pushStyle(new SpanStyle(j, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null));
                                try {
                                    builder.append(string3);
                                    builder.pop(iPushStyle);
                                    int i10 = i9 >> 12;
                                    int i11 = ((i9 >> 9) & 14) | (i10 & 896) | (i10 & 7168);
                                    long j6 = j4;
                                    i5 = iM7925getUnspecifiede0LSkKk;
                                    m20754TextWithLinkFromAnnotatedStringxkNWiIY(modifier4, builder.toAnnotatedString(), style, i5, composerStartRestartGroup, i11, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    modifier3 = modifier4;
                                    j5 = j6;
                                } finally {
                                }
                            } catch (Throwable th) {
                                builder.pop(iPushLink);
                                throw th;
                            }
                        } finally {
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i3 & 32) != 0) {
                            i4 &= -458753;
                        }
                        if ((i3 & 128) != 0) {
                            i4 &= -29360129;
                        }
                    }
                    i6 = i4;
                    iM7925getUnspecifiede0LSkKk = i5;
                    Modifier modifier42 = modifier2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i92 = i6;
                    iIndexOf$default = StringsKt.indexOf$default((CharSequence) text, substringLinkText, 0, false, 6, (Object) null);
                    if (iIndexOf$default < 0) {
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoTextWithLinkKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return BentoTextWithLink.BentoTextWithSubstringLink_XkG1Q0A$lambda$12(text, substringLinkText, substringLinkTextOnClick, modifier3, j, j5, style, i5, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i4 |= 24576;
            j3 = j;
            if ((196608 & i2) == 0) {
            }
            if ((i3 & 64) != 0) {
            }
            if ((12582912 & i2) == 0) {
            }
            if ((i4 & 4793491) == 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i7 != 0) {
                    }
                    if ((i3 & 32) != 0) {
                    }
                    if ((i3 & 128) == 0) {
                        i6 = i4;
                        iM7925getUnspecifiede0LSkKk = i5;
                    }
                    Modifier modifier422 = modifier2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i922 = i6;
                    iIndexOf$default = StringsKt.indexOf$default((CharSequence) text, substringLinkText, 0, false, 6, (Object) null);
                    if (iIndexOf$default < 0) {
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i3 & 16) != 0) {
        }
        j3 = j;
        if ((196608 & i2) == 0) {
        }
        if ((i3 & 64) != 0) {
        }
        if ((12582912 & i2) == 0) {
        }
        if ((i4 & 4793491) == 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* renamed from: TextWithLinkFromAnnotatedString-xkNWiIY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m20754TextWithLinkFromAnnotatedStringxkNWiIY(final Modifier modifier, final AnnotatedString annotatedString, final TextStyle textStyle, int i, Composer composer, final int i2, final int i3) {
        int i4;
        AnnotatedString annotatedString2;
        int iM7925getUnspecifiede0LSkKk;
        Composer composer2;
        final int i5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1707510517);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) == 0) {
            if ((i2 & 48) == 0) {
                annotatedString2 = annotatedString;
                i4 |= composerStartRestartGroup.changed(annotatedString2) ? 32 : 16;
            }
            if ((i3 & 4) == 0) {
                i4 |= 384;
            } else if ((i2 & 384) == 0) {
                i4 |= composerStartRestartGroup.changed(textStyle) ? 256 : 128;
            }
            if ((i2 & 3072) != 0) {
                if ((i3 & 8) == 0) {
                    iM7925getUnspecifiede0LSkKk = i;
                    int i6 = composerStartRestartGroup.changed(iM7925getUnspecifiede0LSkKk) ? 2048 : 1024;
                    i4 |= i6;
                } else {
                    iM7925getUnspecifiede0LSkKk = i;
                }
                i4 |= i6;
            } else {
                iM7925getUnspecifiede0LSkKk = i;
            }
            if ((i4 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) == 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i3 & 8) != 0) {
                        i4 &= -7169;
                    }
                    int i7 = iM7925getUnspecifiede0LSkKk;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composer2 = composerStartRestartGroup;
                    BentoText2.m20748BentoTextQnj7Zds(annotatedString2, LocalShowPlaceholder.withBentoPlaceholder$default(modifier, false, null, 3, null), null, null, null, null, null, 0, false, 0, 0, null, null, TextStyle.m7655copyp1EtxEg$default(textStyle.merge(new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, i7, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744447, (DefaultConstructorMarker) null)), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, new PlatformTextStyle(false), new LineHeightStyle(LineHeightStyle.Alignment.INSTANCE.m7890getProportionalPIaL0Z0(), LineHeightStyle.Trim.INSTANCE.m7911getNoneEVpEnUU(), (DefaultConstructorMarker) null), 0, 0, null, 15204351, null), composer2, (i4 >> 3) & 14, 0, 8188);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    i5 = i7;
                } else {
                    if ((i3 & 8) != 0) {
                        iM7925getUnspecifiede0LSkKk = TextAlign.INSTANCE.m7925getUnspecifiede0LSkKk();
                        i4 &= -7169;
                    }
                    int i72 = iM7925getUnspecifiede0LSkKk;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1707510517, i4, -1, "com.robinhood.compose.bento.component.TextWithLinkFromAnnotatedString (BentoTextWithLink.kt:124)");
                    }
                    composer2 = composerStartRestartGroup;
                    BentoText2.m20748BentoTextQnj7Zds(annotatedString2, LocalShowPlaceholder.withBentoPlaceholder$default(modifier, false, null, 3, null), null, null, null, null, null, 0, false, 0, 0, null, null, TextStyle.m7655copyp1EtxEg$default(textStyle.merge(new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, i72, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744447, (DefaultConstructorMarker) null)), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, new PlatformTextStyle(false), new LineHeightStyle(LineHeightStyle.Alignment.INSTANCE.m7890getProportionalPIaL0Z0(), LineHeightStyle.Trim.INSTANCE.m7911getNoneEVpEnUU(), (DefaultConstructorMarker) null), 0, 0, null, 15204351, null), composer2, (i4 >> 3) & 14, 0, 8188);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i5 = i72;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                i5 = iM7925getUnspecifiede0LSkKk;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoTextWithLinkKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return BentoTextWithLink.TextWithLinkFromAnnotatedString_xkNWiIY$lambda$13(modifier, annotatedString, textStyle, i5, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i4 |= 48;
        annotatedString2 = annotatedString;
        if ((i3 & 4) == 0) {
        }
        if ((i2 & 3072) != 0) {
        }
        if ((i4 & 1171) == 1170) {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) == 0) {
                if ((i3 & 8) != 0) {
                }
                int i722 = iM7925getUnspecifiede0LSkKk;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                composer2 = composerStartRestartGroup;
                BentoText2.m20748BentoTextQnj7Zds(annotatedString2, LocalShowPlaceholder.withBentoPlaceholder$default(modifier, false, null, 3, null), null, null, null, null, null, 0, false, 0, 0, null, null, TextStyle.m7655copyp1EtxEg$default(textStyle.merge(new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, i722, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744447, (DefaultConstructorMarker) null)), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, new PlatformTextStyle(false), new LineHeightStyle(LineHeightStyle.Alignment.INSTANCE.m7890getProportionalPIaL0Z0(), LineHeightStyle.Trim.INSTANCE.m7911getNoneEVpEnUU(), (DefaultConstructorMarker) null), 0, 0, null, 15204351, null), composer2, (i4 >> 3) & 14, 0, 8188);
                if (ComposerKt.isTraceInProgress()) {
                }
                i5 = i722;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* renamed from: clickableLinkAnnotation-DxMtmZc, reason: not valid java name */
    private static final LinkAnnotation.Clickable m20755clickableLinkAnnotationDxMtmZc(long j, final Function0<Unit> function0) {
        return new LinkAnnotation.Clickable("deeplink", new TextLinkStyles(new SpanStyle(j, 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 61434, (DefaultConstructorMarker) null), null, null, null, 14, null), new LinkInteractionListener() { // from class: com.robinhood.compose.bento.component.BentoTextWithLinkKt$clickableLinkAnnotation$1
            @Override // androidx.compose.p011ui.text.LinkInteractionListener
            public final void onClick(LinkAnnotation it) {
                Intrinsics.checkNotNullParameter(it, "it");
                function0.invoke();
            }
        });
    }
}
