package com.robinhood.compose.bento.component;

import androidx.compose.foundation.ImageKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.painter.Painter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BentoImage.kt */
@Metadata(m3635d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aS\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0002\u0010\u0010\u001a\r\u0010\u0011\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"BentoImage", "", PlaceTypes.PAINTER, "Landroidx/compose/ui/graphics/painter/Painter;", "contentDescription", "", "modifier", "Landroidx/compose/ui/Modifier;", "alignment", "Landroidx/compose/ui/Alignment;", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "alpha", "", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V", "BentoImagePreview", "(Landroidx/compose/runtime/Composer;I)V", "lib-compose-bento_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.compose.bento.component.BentoImageKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class BentoImage {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoImage$lambda$0(Painter painter, String str, Modifier modifier, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, int i, int i2, Composer composer, int i3) {
        BentoImage(painter, str, modifier, alignment, contentScale, f, colorFilter, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoImagePreview$lambda$1(int i, Composer composer, int i2) {
        BentoImagePreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BentoImage(final Painter painter, final String str, Modifier modifier, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, Composer composer, final int i, final int i2) {
        int i3;
        String str2;
        int i4;
        Modifier modifier2;
        int i5;
        Alignment center;
        int i6;
        ContentScale contentScale2;
        int i7;
        float f2;
        int i8;
        ColorFilter colorFilter2;
        Composer composer2;
        final ColorFilter colorFilter3;
        final float f3;
        final ContentScale contentScale3;
        final Alignment alignment2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(painter, "painter");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1494154536);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(painter) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                str2 = str;
                i3 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        center = alignment;
                        i3 |= composerStartRestartGroup.changed(center) ? 2048 : 1024;
                    }
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else {
                        if ((i & 24576) == 0) {
                            contentScale2 = contentScale;
                            i3 |= composerStartRestartGroup.changed(contentScale2) ? 16384 : 8192;
                        }
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= 196608;
                        } else {
                            if ((196608 & i) == 0) {
                                f2 = f;
                                i3 |= composerStartRestartGroup.changed(f2) ? 131072 : 65536;
                            }
                            i8 = i2 & 64;
                            if (i8 != 0) {
                                if ((1572864 & i) == 0) {
                                    colorFilter2 = colorFilter;
                                    i3 |= composerStartRestartGroup.changed(colorFilter2) ? 1048576 : 524288;
                                }
                                if ((i3 & 599187) != 599186 || !composerStartRestartGroup.getSkipping()) {
                                    Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                                    if (i5 != 0) {
                                        center = Alignment.INSTANCE.getCenter();
                                    }
                                    ContentScale fit = i6 == 0 ? ContentScale.INSTANCE.getFit() : contentScale2;
                                    float f4 = i7 == 0 ? 1.0f : f2;
                                    ColorFilter colorFilter4 = i8 == 0 ? null : colorFilter2;
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1494154536, i3, -1, "com.robinhood.compose.bento.component.BentoImage (BentoImage.kt:34)");
                                    }
                                    String str3 = str2;
                                    Alignment alignment3 = center;
                                    Modifier modifier5 = modifier4;
                                    ImageKt.Image(painter, str3, LocalShowPlaceholder.withBentoPlaceholder$default(modifier4, false, null, 3, null), alignment3, fit, f4, colorFilter4, composerStartRestartGroup, i3 & 4193406, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    composer2 = composerStartRestartGroup;
                                    colorFilter3 = colorFilter4;
                                    f3 = f4;
                                    contentScale3 = fit;
                                    alignment2 = alignment3;
                                    modifier3 = modifier5;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    modifier3 = modifier2;
                                    composer2 = composerStartRestartGroup;
                                    alignment2 = center;
                                    contentScale3 = contentScale2;
                                    f3 = f2;
                                    colorFilter3 = colorFilter2;
                                }
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoImageKt$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return BentoImage.BentoImage$lambda$0(painter, str, modifier3, alignment2, contentScale3, f3, colorFilter3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i3 |= 1572864;
                            colorFilter2 = colorFilter;
                            if ((i3 & 599187) != 599186) {
                                if (i4 == 0) {
                                }
                                if (i5 != 0) {
                                }
                                if (i6 == 0) {
                                }
                                if (i7 == 0) {
                                }
                                if (i8 == 0) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                String str32 = str2;
                                Alignment alignment32 = center;
                                Modifier modifier52 = modifier4;
                                ImageKt.Image(painter, str32, LocalShowPlaceholder.withBentoPlaceholder$default(modifier4, false, null, 3, null), alignment32, fit, f4, colorFilter4, composerStartRestartGroup, i3 & 4193406, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                composer2 = composerStartRestartGroup;
                                colorFilter3 = colorFilter4;
                                f3 = f4;
                                contentScale3 = fit;
                                alignment2 = alignment32;
                                modifier3 = modifier52;
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        f2 = f;
                        i8 = i2 & 64;
                        if (i8 != 0) {
                        }
                        colorFilter2 = colorFilter;
                        if ((i3 & 599187) != 599186) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    contentScale2 = contentScale;
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    f2 = f;
                    i8 = i2 & 64;
                    if (i8 != 0) {
                    }
                    colorFilter2 = colorFilter;
                    if ((i3 & 599187) != 599186) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                center = alignment;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                contentScale2 = contentScale;
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                f2 = f;
                i8 = i2 & 64;
                if (i8 != 0) {
                }
                colorFilter2 = colorFilter;
                if ((i3 & 599187) != 599186) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            modifier2 = modifier;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            center = alignment;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            contentScale2 = contentScale;
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            f2 = f;
            i8 = i2 & 64;
            if (i8 != 0) {
            }
            colorFilter2 = colorFilter;
            if ((i3 & 599187) != 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        str2 = str;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        center = alignment;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        contentScale2 = contentScale;
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        f2 = f;
        i8 = i2 & 64;
        if (i8 != 0) {
        }
        colorFilter2 = colorFilter;
        if ((i3 & 599187) != 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    private static final void BentoImagePreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-998046494);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-998046494, i, -1, "com.robinhood.compose.bento.component.BentoImagePreview (BentoImage.kt:48)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, BentoImage2.INSTANCE.getLambda$1449919018$lib_compose_bento_externalRelease(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoImageKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoImage.BentoImagePreview$lambda$1(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
