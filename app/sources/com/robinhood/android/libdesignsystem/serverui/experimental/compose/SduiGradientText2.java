package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import android.os.Parcelable;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.models.serverdriven.experimental.api.GradientDirection;
import com.robinhood.models.serverdriven.experimental.api.GradientText;
import com.robinhood.models.serverdriven.experimental.api.ThemedColor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SduiGradientText.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a/\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"SduiGradientText", "", "ActionT", "Landroid/os/Parcelable;", "component", "Lcom/robinhood/models/serverdriven/experimental/api/GradientText;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/models/serverdriven/experimental/api/GradientText;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-sdui_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiGradientTextKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class SduiGradientText2 {

    /* compiled from: SduiGradientText.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiGradientTextKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GradientDirection.values().length];
            try {
                iArr[GradientDirection.HORIZONTAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GradientDirection.VERTICAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiGradientText$lambda$1(GradientText gradientText, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SduiGradientText(gradientText, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <ActionT extends Parcelable> void SduiGradientText(final GradientText<? extends ActionT> component, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Iterator<T> it;
        int i4;
        Brush brushM6676horizontalGradient8A3gB4$default;
        final Modifier modifier3;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(component, "component");
        Composer composerStartRestartGroup = composer.startRestartGroup(-7557679);
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
                    ComposerKt.traceEventStart(-7557679, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiGradientText (SduiGradientText.kt:15)");
                }
                composerStartRestartGroup.startReplaceGroup(1327011059);
                List<ThemedColor> colors = component.getGradient().getColors();
                ArrayList arrayList = new ArrayList();
                it = colors.iterator();
                while (it.hasNext()) {
                    Color composeColor = SduiColors2.toComposeColor((ThemedColor) it.next(), composerStartRestartGroup, 0);
                    if (composeColor != null) {
                        arrayList.add(composeColor);
                    }
                }
                composerStartRestartGroup.endReplaceGroup();
                i4 = WhenMappings.$EnumSwitchMapping$0[component.getGradient().getDirection().ordinal()];
                if (i4 != 1) {
                    brushM6676horizontalGradient8A3gB4$default = Brush.Companion.m6676horizontalGradient8A3gB4$default(Brush.INSTANCE, arrayList, 0.0f, 0.0f, 0, 14, (Object) null);
                } else {
                    if (i4 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    brushM6676horizontalGradient8A3gB4$default = Brush.Companion.m6682verticalGradient8A3gB4$default(Brush.INSTANCE, arrayList, 0.0f, 0.0f, 0, 14, (Object) null);
                }
                int i6 = i3 & 112;
                modifier3 = modifier4;
                composer2 = composerStartRestartGroup;
                BentoText2.m20747BentoText38GnDrw(component.getText(), modifier3, null, null, null, null, TextAlign.m7912boximpl(UtilKt.getComposeTextAlign(component.getAlignment())), 0, false, 0, 0, null, 0, TextStyle.m7654copyNs73l9s$default(UtilKt.getComposeTextStyle(component.getStyle(), composerStartRestartGroup, 0), brushM6676horizontalGradient8A3gB4$default, 0.0f, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 33554430, null), composer2, i6, 0, 8124);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiGradientTextKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SduiGradientText2.SduiGradientText$lambda$1(component, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            composerStartRestartGroup.startReplaceGroup(1327011059);
            List<ThemedColor> colors2 = component.getGradient().getColors();
            ArrayList arrayList2 = new ArrayList();
            it = colors2.iterator();
            while (it.hasNext()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            i4 = WhenMappings.$EnumSwitchMapping$0[component.getGradient().getDirection().ordinal()];
            if (i4 != 1) {
            }
            int i62 = i3 & 112;
            modifier3 = modifier4;
            composer2 = composerStartRestartGroup;
            BentoText2.m20747BentoText38GnDrw(component.getText(), modifier3, null, null, null, null, TextAlign.m7912boximpl(UtilKt.getComposeTextAlign(component.getAlignment())), 0, false, 0, 0, null, 0, TextStyle.m7654copyNs73l9s$default(UtilKt.getComposeTextStyle(component.getStyle(), composerStartRestartGroup, 0), brushM6676horizontalGradient8A3gB4$default, 0.0f, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 33554430, null), composer2, i62, 0, 8124);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
