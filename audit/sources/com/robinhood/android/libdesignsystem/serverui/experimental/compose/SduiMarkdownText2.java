package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import android.os.Parcelable;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.compose.bento.component.text.BentoMarkdownSpannedText2;
import com.robinhood.models.serverdriven.experimental.api.MarkdownText;
import com.robinhood.models.serverdriven.experimental.api.ThemedColor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SduiMarkdownText.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u001aO\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\f¨\u0006\r"}, m3636d2 = {"SduiMarkdownText", "", "ActionT", "Landroid/os/Parcelable;", "component", "Lcom/robinhood/models/serverdriven/experimental/api/MarkdownText;", "modifier", "Landroidx/compose/ui/Modifier;", "textGravity", "", "maxLines", "autoSizeTextType", "(Lcom/robinhood/models/serverdriven/experimental/api/MarkdownText;Landroidx/compose/ui/Modifier;Ljava/lang/Integer;IILandroidx/compose/runtime/Composer;II)V", "lib-sdui_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiMarkdownTextKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class SduiMarkdownText2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiMarkdownText$lambda$0(MarkdownText markdownText, Modifier modifier, Integer num, int i, int i2, int i3, int i4, Composer composer, int i5) {
        SduiMarkdownText(markdownText, modifier, num, i, i2, composer, RecomposeScopeImpl4.updateChangedFlags(i3 | 1), i4);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <ActionT extends Parcelable> void SduiMarkdownText(final MarkdownText<? extends ActionT> component, Modifier modifier, Integer num, int i, int i2, Composer composer, final int i3, final int i4) {
        int i5;
        Modifier modifier2;
        int i6;
        Integer num2;
        int i7;
        int i8;
        int i9;
        int i10;
        Composer composer2;
        final Modifier modifier3;
        final int i11;
        final int i12;
        final Integer num3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(component, "component");
        Composer composerStartRestartGroup = composer.startRestartGroup(1916795131);
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = (composerStartRestartGroup.changedInstance(component) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i13 = i4 & 2;
        if (i13 != 0) {
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
                    num2 = num;
                    i5 |= composerStartRestartGroup.changed(num2) ? 256 : 128;
                }
                i7 = i4 & 8;
                if (i7 != 0) {
                    i5 |= 3072;
                } else {
                    if ((i3 & 3072) == 0) {
                        i8 = i;
                        i5 |= composerStartRestartGroup.changed(i8) ? 2048 : 1024;
                    }
                    i9 = i4 & 16;
                    if (i9 != 0) {
                        if ((i3 & 24576) == 0) {
                            i10 = i2;
                            i5 |= composerStartRestartGroup.changed(i10) ? 16384 : 8192;
                        }
                        if ((i5 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
                            Modifier modifier4 = i13 == 0 ? Modifier.INSTANCE : modifier2;
                            Integer num4 = i6 == 0 ? null : num2;
                            int i14 = i7 == 0 ? Integer.MAX_VALUE : i8;
                            int i15 = i9 == 0 ? 0 : i10;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1916795131, i5, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiMarkdownText (SduiMarkdownText.kt:17)");
                            }
                            String text = component.getText();
                            int resourceId = UtilKt.toResourceId(component.getStyle());
                            Color composeColor = SduiColors2.toComposeColor(component.getColor(), composerStartRestartGroup, 0);
                            ThemedColor link_color_override = component.getLink_color_override();
                            composerStartRestartGroup.startReplaceGroup(-500830485);
                            Color composeColor2 = link_color_override != null ? SduiColors2.toComposeColor(link_color_override, composerStartRestartGroup, 0) : null;
                            composerStartRestartGroup.endReplaceGroup();
                            int i16 = i5 & 112;
                            int i17 = i5 << 9;
                            composer2 = composerStartRestartGroup;
                            Modifier modifier5 = modifier4;
                            BentoMarkdownSpannedText2.m21101BentoMarkdownSpannedTextTHkziT8(text, modifier5, composeColor, composeColor2, resourceId, num4 != null ? UtilKt.getGravity(component.getAlignment()) : num4, i14, i15, null, composer2, i16 | (3670016 & i17) | (i17 & 29360128), 256);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier5;
                            i11 = i14;
                            i12 = i15;
                            num3 = num4;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            composer2 = composerStartRestartGroup;
                            modifier3 = modifier2;
                            num3 = num2;
                            i11 = i8;
                            i12 = i10;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiMarkdownTextKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return SduiMarkdownText2.SduiMarkdownText$lambda$0(component, modifier3, num3, i11, i12, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i5 |= 24576;
                    i10 = i2;
                    if ((i5 & 9363) != 9362) {
                        if (i13 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i7 == 0) {
                        }
                        if (i9 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        String text2 = component.getText();
                        int resourceId2 = UtilKt.toResourceId(component.getStyle());
                        Color composeColor3 = SduiColors2.toComposeColor(component.getColor(), composerStartRestartGroup, 0);
                        ThemedColor link_color_override2 = component.getLink_color_override();
                        composerStartRestartGroup.startReplaceGroup(-500830485);
                        Color composeColor22 = link_color_override2 != null ? SduiColors2.toComposeColor(link_color_override2, composerStartRestartGroup, 0) : null;
                        composerStartRestartGroup.endReplaceGroup();
                        int i162 = i5 & 112;
                        int i172 = i5 << 9;
                        composer2 = composerStartRestartGroup;
                        Modifier modifier52 = modifier4;
                        BentoMarkdownSpannedText2.m21101BentoMarkdownSpannedTextTHkziT8(text2, modifier52, composeColor3, composeColor22, resourceId2, num4 != null ? UtilKt.getGravity(component.getAlignment()) : num4, i14, i15, null, composer2, i162 | (3670016 & i172) | (i172 & 29360128), 256);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier52;
                        i11 = i14;
                        i12 = i15;
                        num3 = num4;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i8 = i;
                i9 = i4 & 16;
                if (i9 != 0) {
                }
                i10 = i2;
                if ((i5 & 9363) != 9362) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            num2 = num;
            i7 = i4 & 8;
            if (i7 != 0) {
            }
            i8 = i;
            i9 = i4 & 16;
            if (i9 != 0) {
            }
            i10 = i2;
            if ((i5 & 9363) != 9362) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        num2 = num;
        i7 = i4 & 8;
        if (i7 != 0) {
        }
        i8 = i;
        i9 = i4 & 16;
        if (i9 != 0) {
        }
        i10 = i2;
        if ((i5 & 9363) != 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}
