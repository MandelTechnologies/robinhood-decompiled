package com.robinhood.compose.bento.component;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStroke2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.interaction.PressInteraction2;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.InteractiveComponentSizeKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import coil.compose.AsyncImagePainter;
import coil.compose.SingletonAsyncImagePainter;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoChip2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: BentoChip.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\u001aQ\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0002\u0010\r\u001aG\u0010\u000e\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0002\u0010\u0010\u001aC\u0010\u0011\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000b\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\u0013\u001aW\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00162\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00172\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0001¢\u0006\u0002\u0010\u0018\u001a/\u0010\u0019\u001a\u00020\u00012\b\u0010\t\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001dH\u0001¢\u0006\u0002\u0010\u001e\u001a-\u0010\u001f\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001dH\u0001¢\u0006\u0002\u0010\u001e\u001aA\u0010 \u001a\u00020\u00012\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\f2\u0006\u0010$\u001a\u00020%2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001dH\u0001¢\u0006\u0004\b&\u0010'\u001a7\u0010(\u001a\u00020\u00012\u0006\u0010)\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010*\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010+\u001a\r\u0010,\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010-\u001a\r\u0010.\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010-\u001a\r\u0010/\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010-\u001a\u0015\u00100\u001a\u00020\u00012\u0006\u00101\u001a\u00020\u0007H\u0003¢\u0006\u0002\u00102\u001a\r\u00103\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010-\u001a\r\u00104\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010-\u001a\r\u00105\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010-\u001a5\u00106\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0017H\u0003¢\u0006\u0002\u00107¨\u00068²\u0006\n\u00109\u001a\u00020\u0007X\u008a\u0084\u0002"}, m3636d2 = {"BentoSelectionChip", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "selected", "accessory", "Lcom/robinhood/compose/bento/component/BentoChips$Accessory$Selection;", "text", "", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZZLcom/robinhood/compose/bento/component/BentoChips$Accessory$Selection;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "BentoActionChip", "Lcom/robinhood/compose/bento/component/BentoChips$Accessory$Action;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLcom/robinhood/compose/bento/component/BentoChips$Accessory$Action;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "BentoDropdownChip", "Lcom/robinhood/compose/bento/component/BentoChips$Accessory$Dropdown;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLcom/robinhood/compose/bento/component/BentoChips$Accessory$Dropdown;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "BentoBaseChip", "type", "Lcom/robinhood/compose/bento/component/BentoChips$Type;", "Lcom/robinhood/compose/bento/component/BentoChips$Accessory;", "(Lcom/robinhood/compose/bento/component/BentoChips$Type;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZZLcom/robinhood/compose/bento/component/BentoChips$Accessory;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "LeadingAccessory", "state", "Lcom/robinhood/compose/bento/component/BentoChips$State;", "colors", "Lcom/robinhood/compose/bento/component/BentoChips$StatefulColors;", "(Lcom/robinhood/compose/bento/component/BentoChips$Accessory;Lcom/robinhood/compose/bento/component/BentoChips$State;ZLcom/robinhood/compose/bento/component/BentoChips$StatefulColors;Landroidx/compose/runtime/Composer;I)V", "TrailingAccessory", "TrailingIcon", "icon", "", "contentDescription", "iconSize", "Landroidx/compose/ui/unit/Dp;", "TrailingIcon-TN_CM5M", "(ILjava/lang/String;FLcom/robinhood/compose/bento/component/BentoChips$State;ZLcom/robinhood/compose/bento/component/BentoChips$StatefulColors;Landroidx/compose/runtime/Composer;I)V", "ChipCount", "count", "invertColorTheme", "(ILcom/robinhood/compose/bento/component/BentoChips$State;ZLcom/robinhood/compose/bento/component/BentoChips$StatefulColors;ZLandroidx/compose/runtime/Composer;II)V", "BentoChipPreviewDay", "(Landroidx/compose/runtime/Composer;I)V", "BentoChipPreviewDayDisabled", "BentoChipPreviewNight", "BentoChipDefault", "isDay", "(ZLandroidx/compose/runtime/Composer;I)V", "BentoSelectionChipAccessories", "BentoActionChipAccessories", "BentoDropdownChipAccessories", "BentoChipStates", "(Lcom/robinhood/compose/bento/component/BentoChips$Type;Landroidx/compose/ui/Modifier;ZLcom/robinhood/compose/bento/component/BentoChips$Accessory;Landroidx/compose/runtime/Composer;II)V", "lib-compose-bento_externalRelease", "pressed"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.bento.component.BentoChipKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class BentoChip {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoActionChip$lambda$1(Function0 function0, Modifier modifier, boolean z, BentoChip2.Accessory.Action action, String str, int i, int i2, Composer composer, int i3) {
        BentoActionChip(function0, modifier, z, action, str, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoActionChipAccessories$lambda$15(int i, Composer composer, int i2) {
        BentoActionChipAccessories(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoBaseChip$lambda$5(BentoChip2.Type type2, Function0 function0, Modifier modifier, boolean z, boolean z2, BentoChip2.Accessory accessory, String str, int i, int i2, Composer composer, int i3) {
        BentoBaseChip(type2, function0, modifier, z, z2, accessory, str, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoChipDefault$lambda$13(boolean z, int i, Composer composer, int i2) {
        BentoChipDefault(z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoChipPreviewDay$lambda$10(int i, Composer composer, int i2) {
        BentoChipPreviewDay(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoChipPreviewDayDisabled$lambda$11(int i, Composer composer, int i2) {
        BentoChipPreviewDayDisabled(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoChipPreviewNight$lambda$12(int i, Composer composer, int i2) {
        BentoChipPreviewNight(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoChipStates$lambda$22(BentoChip2.Type type2, Modifier modifier, boolean z, BentoChip2.Accessory accessory, int i, int i2, Composer composer, int i3) {
        BentoChipStates(type2, modifier, z, accessory, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoDropdownChip$lambda$2(Function0 function0, Modifier modifier, boolean z, BentoChip2.Accessory.Dropdown dropdown, String str, int i, int i2, Composer composer, int i3) {
        BentoDropdownChip(function0, modifier, z, dropdown, str, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoDropdownChipAccessories$lambda$16(int i, Composer composer, int i2) {
        BentoDropdownChipAccessories(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoSelectionChip$lambda$0(Function0 function0, Modifier modifier, boolean z, boolean z2, BentoChip2.Accessory.Selection selection, String str, int i, int i2, Composer composer, int i3) {
        BentoSelectionChip(function0, modifier, z, z2, selection, str, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoSelectionChipAccessories$lambda$14(int i, Composer composer, int i2) {
        BentoSelectionChipAccessories(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChipCount$lambda$9(int i, BentoChip2.State state, boolean z, BentoChip2.StatefulColors statefulColors, boolean z2, int i2, int i3, Composer composer, int i4) {
        ChipCount(i, state, z, statefulColors, z2, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LeadingAccessory$lambda$6(BentoChip2.Accessory accessory, BentoChip2.State state, boolean z, BentoChip2.StatefulColors statefulColors, int i, Composer composer, int i2) {
        LeadingAccessory(accessory, state, z, statefulColors, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TrailingAccessory$lambda$7(BentoChip2.Accessory accessory, BentoChip2.State state, boolean z, BentoChip2.StatefulColors statefulColors, int i, Composer composer, int i2) {
        TrailingAccessory(accessory, state, z, statefulColors, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TrailingIcon_TN_CM5M$lambda$8(int i, String str, float f, BentoChip2.State state, boolean z, BentoChip2.StatefulColors statefulColors, int i2, Composer composer, int i3) {
        m20606TrailingIconTN_CM5M(i, str, f, state, z, statefulColors, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BentoSelectionChip(final Function0<Unit> onClick, Modifier modifier, boolean z, boolean z2, BentoChip2.Accessory.Selection selection, String str, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z3;
        int i5;
        boolean z4;
        int i6;
        BentoChip2.Accessory.Selection selection2;
        int i7;
        String str2;
        final boolean z5;
        final boolean z6;
        final String str3;
        final Modifier modifier3;
        final BentoChip2.Accessory.Selection selection3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1262344938);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    z3 = z;
                    i3 |= composerStartRestartGroup.changed(z3) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        z4 = z2;
                        i3 |= composerStartRestartGroup.changed(z4) ? 2048 : 1024;
                    }
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else {
                        if ((i & 24576) == 0) {
                            selection2 = selection;
                            i3 |= composerStartRestartGroup.changed(selection2) ? 16384 : 8192;
                        }
                        i7 = i2 & 32;
                        if (i7 == 0) {
                            if ((196608 & i) == 0) {
                                str2 = str;
                                i3 |= composerStartRestartGroup.changed(str2) ? 131072 : 65536;
                            }
                            if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                                Modifier modifier4 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                                z5 = i4 == 0 ? true : z3;
                                z6 = i5 == 0 ? false : z4;
                                if (i6 != 0) {
                                    selection2 = null;
                                }
                                str3 = i7 == 0 ? null : str2;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1262344938, i3, -1, "com.robinhood.compose.bento.component.BentoSelectionChip (BentoChip.kt:57)");
                                }
                                int i9 = i3;
                                modifier3 = modifier4;
                                int i10 = i9 << 3;
                                int i11 = (i10 & 112) | 6 | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (i10 & 3670016);
                                selection3 = selection2;
                                BentoBaseChip(BentoChip2.Type.Selection, onClick, modifier3, z5, z6, selection3, str3, composerStartRestartGroup, i11, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                modifier3 = modifier2;
                                z5 = z3;
                                z6 = z4;
                                selection3 = selection2;
                                str3 = str2;
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoChipKt$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return BentoChip.BentoSelectionChip$lambda$0(onClick, modifier3, z5, z6, selection3, str3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i3 |= 196608;
                        str2 = str;
                        if ((74899 & i3) == 74898) {
                            if (i8 == 0) {
                            }
                            if (i4 == 0) {
                            }
                            if (i5 == 0) {
                            }
                            if (i6 != 0) {
                            }
                            if (i7 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            int i92 = i3;
                            modifier3 = modifier4;
                            int i102 = i92 << 3;
                            int i112 = (i102 & 112) | 6 | (i102 & 896) | (i102 & 7168) | (57344 & i102) | (458752 & i102) | (i102 & 3670016);
                            selection3 = selection2;
                            BentoBaseChip(BentoChip2.Type.Selection, onClick, modifier3, z5, z6, selection3, str3, composerStartRestartGroup, i112, 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    selection2 = selection;
                    i7 = i2 & 32;
                    if (i7 == 0) {
                    }
                    str2 = str;
                    if ((74899 & i3) == 74898) {
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                z4 = z2;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                selection2 = selection;
                i7 = i2 & 32;
                if (i7 == 0) {
                }
                str2 = str;
                if ((74899 & i3) == 74898) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z3 = z;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            z4 = z2;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            selection2 = selection;
            i7 = i2 & 32;
            if (i7 == 0) {
            }
            str2 = str;
            if ((74899 & i3) == 74898) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z3 = z;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        z4 = z2;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        selection2 = selection;
        i7 = i2 & 32;
        if (i7 == 0) {
        }
        str2 = str;
        if ((74899 & i3) == 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BentoActionChip(final Function0<Unit> onClick, Modifier modifier, boolean z, BentoChip2.Accessory.Action action, String str, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        BentoChip2.Accessory.Action action2;
        int i6;
        String str2;
        final Modifier modifier3;
        final boolean z3;
        final BentoChip2.Accessory.Action action3;
        final String str3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(437635736);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        action2 = action;
                        i3 |= composerStartRestartGroup.changed(action2) ? 2048 : 1024;
                    }
                    i6 = i2 & 16;
                    if (i6 != 0) {
                        if ((i & 24576) == 0) {
                            str2 = str;
                            i3 |= composerStartRestartGroup.changed(str2) ? 16384 : 8192;
                        }
                        if ((i3 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
                            Modifier modifier4 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                            boolean z4 = i4 == 0 ? true : z2;
                            if (i5 != 0) {
                                action2 = null;
                            }
                            String str4 = i6 == 0 ? null : str2;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(437635736, i3, -1, "com.robinhood.compose.bento.component.BentoActionChip (BentoChip.kt:76)");
                            }
                            int i8 = i3 << 3;
                            int i9 = i3 << 6;
                            int i10 = (i8 & 7168) | (i8 & 112) | 24582 | (i8 & 896) | (458752 & i9) | (i9 & 3670016);
                            BentoChip2.Accessory.Action action4 = action2;
                            modifier3 = modifier4;
                            z3 = z4;
                            BentoBaseChip(BentoChip2.Type.Action, onClick, modifier3, z3, false, action4, str4, composerStartRestartGroup, i10, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            action3 = action4;
                            str3 = str4;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                            z3 = z2;
                            action3 = action2;
                            str3 = str2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoChipKt$$ExternalSyntheticLambda9
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return BentoChip.BentoActionChip$lambda$1(onClick, modifier3, z3, action3, str3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 24576;
                    str2 = str;
                    if ((i3 & 9363) != 9362) {
                        if (i7 == 0) {
                        }
                        if (i4 == 0) {
                        }
                        if (i5 != 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i82 = i3 << 3;
                        int i92 = i3 << 6;
                        int i102 = (i82 & 7168) | (i82 & 112) | 24582 | (i82 & 896) | (458752 & i92) | (i92 & 3670016);
                        BentoChip2.Accessory.Action action42 = action2;
                        modifier3 = modifier4;
                        z3 = z4;
                        BentoBaseChip(BentoChip2.Type.Action, onClick, modifier3, z3, false, action42, str4, composerStartRestartGroup, i102, 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        action3 = action42;
                        str3 = str4;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                action2 = action;
                i6 = i2 & 16;
                if (i6 != 0) {
                }
                str2 = str;
                if ((i3 & 9363) != 9362) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            z2 = z;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            action2 = action;
            i6 = i2 & 16;
            if (i6 != 0) {
            }
            str2 = str;
            if ((i3 & 9363) != 9362) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        action2 = action;
        i6 = i2 & 16;
        if (i6 != 0) {
        }
        str2 = str;
        if ((i3 & 9363) != 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    private static final boolean BentoBaseChip$lambda$4(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    public static final void BentoDropdownChip(final Function0<Unit> onClick, Modifier modifier, boolean z, BentoChip2.Accessory.Dropdown dropdown, final String text, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        final boolean z2;
        final BentoChip2.Accessory.Dropdown dropdown2;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1551707762);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(dropdown) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(text) ? 16384 : 8192;
        }
        if ((i3 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            modifier2 = modifier;
            z2 = i5 != 0 ? true : z;
            BentoChip2.Accessory.Dropdown dropdown3 = i6 != 0 ? null : dropdown;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1551707762, i3, -1, "com.robinhood.compose.bento.component.BentoDropdownChip (BentoChip.kt:95)");
            }
            int i7 = i3 << 3;
            int i8 = i3 << 6;
            BentoChip2.Accessory.Dropdown dropdown4 = dropdown3;
            BentoBaseChip(BentoChip2.Type.Dropdown, onClick, modifier2, z2, false, dropdown4, text, composerStartRestartGroup, (i7 & 7168) | (i7 & 112) | 24582 | (i7 & 896) | (458752 & i8) | (i8 & 3670016), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            dropdown2 = dropdown4;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            z2 = z;
            dropdown2 = dropdown;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoChipKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoChip.BentoDropdownChip$lambda$2(onClick, modifier2, z2, dropdown2, text, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BentoBaseChip(final BentoChip2.Type type2, final Function0<Unit> onClick, Modifier modifier, boolean z, boolean z2, BentoChip2.Accessory accessory, final String str, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z3;
        int i5;
        boolean z4;
        int i6;
        BentoChip2.Accessory accessory2;
        String str2;
        final boolean z5;
        final BentoChip2.Accessory accessory3;
        Object objRememberedValue;
        BentoChip2.State state;
        final boolean z6;
        final boolean z7;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(623225299);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(type2.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    z3 = z;
                    i3 |= composerStartRestartGroup.changed(z3) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        z4 = z2;
                        i3 |= composerStartRestartGroup.changed(z4) ? 16384 : 8192;
                    }
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= 196608;
                    } else {
                        if ((196608 & i) == 0) {
                            accessory2 = accessory;
                            i3 |= composerStartRestartGroup.changed(accessory2) ? 131072 : 65536;
                        }
                        if ((i2 & 64) == 0) {
                            if ((i & 1572864) == 0) {
                                str2 = str;
                                i3 |= composerStartRestartGroup.changed(str2) ? 1048576 : 524288;
                            }
                            if ((599187 & i3) == 599186 || !composerStartRestartGroup.getSkipping()) {
                                Modifier modifier4 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                                z5 = i4 == 0 ? true : z3;
                                final boolean z8 = i5 == 0 ? false : z4;
                                accessory3 = i6 == 0 ? null : accessory2;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(623225299, i3, -1, "com.robinhood.compose.bento.component.BentoBaseChip (BentoChip.kt:117)");
                                }
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSource2.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                SnapshotState4<Boolean> snapshotState4CollectIsPressedAsState = PressInteraction2.collectIsPressedAsState((InteractionSource3) objRememberedValue, composerStartRestartGroup, 6);
                                if (z5) {
                                    state = BentoChip2.State.Disabled;
                                } else {
                                    state = BentoBaseChip$lambda$4(snapshotState4CollectIsPressedAsState) ? BentoChip2.State.Pressed : BentoChip2.State.Default;
                                }
                                final Modifier modifier5 = modifier4;
                                final BentoChip2.State state2 = state;
                                final String str3 = str2;
                                BentoThemeOverlays.ElevatedThemeOverlay(ComposableLambda3.rememberComposableLambda(-1863107215, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.BentoChipKt.BentoBaseChip.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i8) {
                                        if ((i8 & 3) == 2 && composer2.getSkipping()) {
                                            composer2.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1863107215, i8, -1, "com.robinhood.compose.bento.component.BentoBaseChip.<anonymous> (BentoChip.kt:128)");
                                        }
                                        ProvidedValue<C2002Dp> providedValueProvides = InteractiveComponentSizeKt.getLocalMinimumInteractiveComponentSize().provides(C2002Dp.m7993boximpl(C2002Dp.INSTANCE.m8004getUnspecifiedD9Ej5fM()));
                                        final Modifier modifier6 = modifier5;
                                        final BentoChip2.State state3 = state2;
                                        final boolean z9 = z8;
                                        final Function0<Unit> function0 = onClick;
                                        final boolean z10 = z5;
                                        final BentoChip2.Accessory accessory4 = accessory3;
                                        final String str4 = str3;
                                        final BentoChip2.Type type3 = type2;
                                        CompositionLocal3.CompositionLocalProvider(providedValueProvides, ComposableLambda3.rememberComposableLambda(-1623363023, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.BentoChipKt.BentoBaseChip.1.1
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                invoke(composer3, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer3, int i9) {
                                                if ((i9 & 3) == 2 && composer3.getSkipping()) {
                                                    composer3.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1623363023, i9, -1, "com.robinhood.compose.bento.component.BentoBaseChip.<anonymous>.<anonymous> (BentoChip.kt:129)");
                                                }
                                                BentoChip3 bentoChip3 = BentoChip3.INSTANCE;
                                                final BentoChip2.StatefulColors colors = bentoChip3.getColors(composer3, 6);
                                                Modifier modifierWithBentoPillPlaceholder$default = LocalShowPlaceholder.withBentoPillPlaceholder$default(modifier6, false, 1, null);
                                                RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_4 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoChip3.m20632getShapeRadiusD9Ej5fM$lib_compose_bento_externalRelease());
                                                long value = colors.backgroundColor$lib_compose_bento_externalRelease(state3, z9, composer3, 0).getValue().getValue();
                                                long value2 = colors.foregroundColor$lib_compose_bento_externalRelease(state3, z9, composer3, 0).getValue().getValue();
                                                BorderStroke borderStrokeM4886BorderStrokecXLIe8U = BorderStroke2.m4886BorderStrokecXLIe8U(bentoChip3.m20627getOutlinedBorderSizeD9Ej5fM$lib_compose_bento_externalRelease(), colors.outlineColor$lib_compose_bento_externalRelease(state3, z9, composer3, 0).getValue().getValue());
                                                Function0<Unit> function02 = function0;
                                                boolean z11 = z10;
                                                final BentoChip2.Accessory accessory5 = accessory4;
                                                final BentoChip2.State state4 = state3;
                                                final boolean z12 = z9;
                                                final String str5 = str4;
                                                final BentoChip2.Type type4 = type3;
                                                SurfaceKt.m5969Surfaceo_FOJdg(function02, modifierWithBentoPillPlaceholder$default, z11, roundedCornerShapeM5327RoundedCornerShape0680j_4, value, value2, 0.0f, 0.0f, borderStrokeM4886BorderStrokecXLIe8U, null, ComposableLambda3.rememberComposableLambda(118677052, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.BentoChipKt.BentoBaseChip.1.1.1

                                                    /* compiled from: BentoChip.kt */
                                                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                                    /* renamed from: com.robinhood.compose.bento.component.BentoChipKt$BentoBaseChip$1$1$1$WhenMappings */
                                                    public /* synthetic */ class WhenMappings {
                                                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                                        static {
                                                            int[] iArr = new int[BentoChip2.Type.values().length];
                                                            try {
                                                                iArr[BentoChip2.Type.Dropdown.ordinal()] = 1;
                                                            } catch (NoSuchFieldError unused) {
                                                            }
                                                            $EnumSwitchMapping$0 = iArr;
                                                        }
                                                    }

                                                    /* JADX WARN: Removed duplicated region for block: B:50:0x0115  */
                                                    /* JADX WARN: Removed duplicated region for block: B:85:0x0203  */
                                                    /*
                                                        Code decompiled incorrectly, please refer to instructions dump.
                                                    */
                                                    public final void invoke(Composer composer4, int i10) {
                                                        boolean z13;
                                                        boolean z14;
                                                        BentoChip2.StatefulColors statefulColors;
                                                        BentoChip2.Accessory accessory6;
                                                        BentoChip2.State state5;
                                                        BentoChip2.State state6;
                                                        boolean z15;
                                                        BentoChip2.StatefulColors statefulColors2;
                                                        Modifier.Companion companion;
                                                        BentoChip2.Type type5;
                                                        boolean z16;
                                                        BentoChip2.AccessoryPosition accessoryPosition;
                                                        boolean z17;
                                                        Composer composer5 = composer4;
                                                        if ((i10 & 3) == 2 && composer5.getSkipping()) {
                                                            composer5.skipToGroupEnd();
                                                            return;
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(118677052, i10, -1, "com.robinhood.compose.bento.component.BentoBaseChip.<anonymous>.<anonymous>.<anonymous> (BentoChip.kt:142)");
                                                        }
                                                        float fM2573x307f99b4 = accessory5 instanceof BentoChip2.Accessory.Action.Thumbnail ? BentoChip3.INSTANCE.m2573x307f99b4() : BentoChip3.INSTANCE.m20630getPaddingStartD9Ej5fM$lib_compose_bento_externalRelease();
                                                        BentoChip2.Accessory accessory7 = accessory5;
                                                        float fM20629getPaddingEndWithCountD9Ej5fM$lib_compose_bento_externalRelease = ((accessory7 instanceof BentoChip2.Accessory.Action.Count) || (accessory7 instanceof BentoChip2.Accessory.Selection.Count)) ? BentoChip3.INSTANCE.m20629getPaddingEndWithCountD9Ej5fM$lib_compose_bento_externalRelease() : BentoChip3.INSTANCE.m20628getPaddingEndD9Ej5fM$lib_compose_bento_externalRelease();
                                                        Modifier.Companion companion2 = Modifier.INSTANCE;
                                                        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion2, fM2573x307f99b4, 0.0f, fM20629getPaddingEndWithCountD9Ej5fM$lib_compose_bento_externalRelease, 0.0f, 10, null);
                                                        BentoChip3 bentoChip32 = BentoChip3.INSTANCE;
                                                        Modifier modifierM5155defaultMinSizeVpY3zN4$default = SizeKt.m5155defaultMinSizeVpY3zN4$default(modifierM5146paddingqDBjuR0$default, 0.0f, bentoChip32.m20622getChipHeightD9Ej5fM$lib_compose_bento_externalRelease(), 1, null);
                                                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                                        BentoChip2.Accessory accessory8 = accessory5;
                                                        BentoChip2.State state7 = state4;
                                                        boolean z18 = z12;
                                                        BentoChip2.StatefulColors statefulColors3 = colors;
                                                        String str6 = str5;
                                                        BentoChip2.Type type6 = type4;
                                                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer5, 48);
                                                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer5, 0);
                                                        CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer5, modifierM5155defaultMinSizeVpY3zN4$default);
                                                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                                                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                                                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                        }
                                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                                        Row6 row6 = Row6.INSTANCE;
                                                        if ((accessory8 != null ? accessory8.getPosition$lib_compose_bento_externalRelease() : null) == BentoChip2.AccessoryPosition.Leading) {
                                                            z13 = true;
                                                        } else {
                                                            if ((accessory8 != null ? accessory8.getPosition$lib_compose_bento_externalRelease() : null) != BentoChip2.AccessoryPosition.Dual) {
                                                                z13 = false;
                                                            }
                                                        }
                                                        composer5.startReplaceGroup(1908311912);
                                                        if (z13) {
                                                            BentoChip.LeadingAccessory(accessory8, state7, z18, statefulColors3, composer5, 0);
                                                            accessory6 = accessory8;
                                                            state5 = state7;
                                                            z14 = z18;
                                                            statefulColors = statefulColors3;
                                                            if (str6 != null && !StringsKt.isBlank(str6)) {
                                                                Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion2, bentoChip32.m20633getSpacingD9Ej5fM$lib_compose_bento_externalRelease()), composer5, 6);
                                                            }
                                                        } else {
                                                            z14 = z18;
                                                            statefulColors = statefulColors3;
                                                            accessory6 = accessory8;
                                                            state5 = state7;
                                                        }
                                                        composer5.endReplaceGroup();
                                                        composer5.startReplaceGroup(1908321453);
                                                        if (str6 == null || StringsKt.isBlank(str6)) {
                                                            state6 = state5;
                                                            z15 = z14;
                                                            statefulColors2 = statefulColors;
                                                            companion = companion2;
                                                            type5 = type6;
                                                            z16 = false;
                                                            accessoryPosition = null;
                                                        } else {
                                                            long value3 = statefulColors.foregroundColor$lib_compose_bento_externalRelease(state5, z14, composer5, 0).getValue().getValue();
                                                            TextStyle textM = BentoTheme.INSTANCE.getTypography(composer5, 6).getTextM();
                                                            FontWeight.Companion companion4 = FontWeight.INSTANCE;
                                                            z16 = false;
                                                            type5 = type6;
                                                            statefulColors2 = statefulColors;
                                                            z15 = z14;
                                                            companion = companion2;
                                                            state6 = state5;
                                                            accessoryPosition = null;
                                                            BentoText2.m20747BentoText38GnDrw(str6, PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, bentoChip32.m20631getPaddingVerticalD9Ej5fM$lib_compose_bento_externalRelease(), 0.0f, bentoChip32.m20631getPaddingVerticalD9Ej5fM$lib_compose_bento_externalRelease(), 5, null), Color.m6701boximpl(value3), null, z14 ? companion4.getBold() : companion4.getNormal(), null, null, 0, false, 0, 0, null, 0, textM, composer4, 48, 0, 8168);
                                                            composer5 = composer4;
                                                        }
                                                        composer5.endReplaceGroup();
                                                        BentoChip2.Type type7 = type5;
                                                        if (type7 == BentoChip2.Type.Dropdown) {
                                                            z17 = true;
                                                        } else {
                                                            if ((accessory6 != null ? accessory6.getPosition$lib_compose_bento_externalRelease() : accessoryPosition) != BentoChip2.AccessoryPosition.Trailing) {
                                                                if ((accessory6 != null ? accessory6.getPosition$lib_compose_bento_externalRelease() : accessoryPosition) != BentoChip2.AccessoryPosition.Dual) {
                                                                    z17 = z16;
                                                                }
                                                            }
                                                        }
                                                        composer5.startReplaceGroup(1908351340);
                                                        if (z17) {
                                                            Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion, bentoChip32.m20633getSpacingD9Ej5fM$lib_compose_bento_externalRelease()), composer5, 6);
                                                            if (WhenMappings.$EnumSwitchMapping$0[type7.ordinal()] == 1) {
                                                                composer5.startReplaceGroup(1908357014);
                                                                Composer composer6 = composer5;
                                                                BentoChip.m20606TrailingIconTN_CM5M(ServerToBentoAssetMapper2.CARET_DOWN_16.getResourceId(), null, bentoChip32.m20626getIconDropdownSizeD9Ej5fM$lib_compose_bento_externalRelease(), state6, z15, statefulColors2, composer6, 432);
                                                                composer6.endReplaceGroup();
                                                            } else {
                                                                composer5.startReplaceGroup(1908371070);
                                                                Intrinsics.checkNotNull(accessory6);
                                                                BentoChip.TrailingAccessory(accessory6, state6, z15, statefulColors2, composer5, 0);
                                                                composer4.endReplaceGroup();
                                                            }
                                                        }
                                                        composer4.endReplaceGroup();
                                                        composer4.endNode();
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                        invoke(composer4, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }
                                                }, composer3, 54), composer3, 0, 6, 704);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composer2, 54), composer2, ProvidedValue.$stable | 48);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                z6 = z5;
                                z7 = z8;
                                modifier3 = modifier5;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                modifier3 = modifier2;
                                z6 = z3;
                                z7 = z4;
                                accessory3 = accessory2;
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoChipKt$$ExternalSyntheticLambda8
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return BentoChip.BentoBaseChip$lambda$5(type2, onClick, modifier3, z6, z7, accessory3, str, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i3 |= 1572864;
                        str2 = str;
                        if ((599187 & i3) == 599186) {
                            if (i7 == 0) {
                            }
                            if (i4 == 0) {
                            }
                            if (i5 == 0) {
                            }
                            if (i6 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            SnapshotState4<Boolean> snapshotState4CollectIsPressedAsState2 = PressInteraction2.collectIsPressedAsState((InteractionSource3) objRememberedValue, composerStartRestartGroup, 6);
                            if (z5) {
                            }
                            final Modifier modifier52 = modifier4;
                            final BentoChip2.State state22 = state;
                            final String str32 = str2;
                            BentoThemeOverlays.ElevatedThemeOverlay(ComposableLambda3.rememberComposableLambda(-1863107215, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.BentoChipKt.BentoBaseChip.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i8) {
                                    if ((i8 & 3) == 2 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1863107215, i8, -1, "com.robinhood.compose.bento.component.BentoBaseChip.<anonymous> (BentoChip.kt:128)");
                                    }
                                    ProvidedValue<C2002Dp> providedValueProvides = InteractiveComponentSizeKt.getLocalMinimumInteractiveComponentSize().provides(C2002Dp.m7993boximpl(C2002Dp.INSTANCE.m8004getUnspecifiedD9Ej5fM()));
                                    final Modifier modifier6 = modifier52;
                                    final BentoChip2.State state3 = state22;
                                    final boolean z9 = z8;
                                    final Function0<Unit> function0 = onClick;
                                    final boolean z10 = z5;
                                    final BentoChip2.Accessory accessory4 = accessory3;
                                    final String str4 = str32;
                                    final BentoChip2.Type type3 = type2;
                                    CompositionLocal3.CompositionLocalProvider(providedValueProvides, ComposableLambda3.rememberComposableLambda(-1623363023, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.BentoChipKt.BentoBaseChip.1.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            invoke(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer3, int i9) {
                                            if ((i9 & 3) == 2 && composer3.getSkipping()) {
                                                composer3.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1623363023, i9, -1, "com.robinhood.compose.bento.component.BentoBaseChip.<anonymous>.<anonymous> (BentoChip.kt:129)");
                                            }
                                            BentoChip3 bentoChip3 = BentoChip3.INSTANCE;
                                            final BentoChip2.StatefulColors colors = bentoChip3.getColors(composer3, 6);
                                            Modifier modifierWithBentoPillPlaceholder$default = LocalShowPlaceholder.withBentoPillPlaceholder$default(modifier6, false, 1, null);
                                            RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_4 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoChip3.m20632getShapeRadiusD9Ej5fM$lib_compose_bento_externalRelease());
                                            long value = colors.backgroundColor$lib_compose_bento_externalRelease(state3, z9, composer3, 0).getValue().getValue();
                                            long value2 = colors.foregroundColor$lib_compose_bento_externalRelease(state3, z9, composer3, 0).getValue().getValue();
                                            BorderStroke borderStrokeM4886BorderStrokecXLIe8U = BorderStroke2.m4886BorderStrokecXLIe8U(bentoChip3.m20627getOutlinedBorderSizeD9Ej5fM$lib_compose_bento_externalRelease(), colors.outlineColor$lib_compose_bento_externalRelease(state3, z9, composer3, 0).getValue().getValue());
                                            Function0<Unit> function02 = function0;
                                            boolean z11 = z10;
                                            final BentoChip2.Accessory accessory5 = accessory4;
                                            final BentoChip2.State state4 = state3;
                                            final boolean z12 = z9;
                                            final String str5 = str4;
                                            final BentoChip2.Type type4 = type3;
                                            SurfaceKt.m5969Surfaceo_FOJdg(function02, modifierWithBentoPillPlaceholder$default, z11, roundedCornerShapeM5327RoundedCornerShape0680j_4, value, value2, 0.0f, 0.0f, borderStrokeM4886BorderStrokecXLIe8U, null, ComposableLambda3.rememberComposableLambda(118677052, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.BentoChipKt.BentoBaseChip.1.1.1

                                                /* compiled from: BentoChip.kt */
                                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                                /* renamed from: com.robinhood.compose.bento.component.BentoChipKt$BentoBaseChip$1$1$1$WhenMappings */
                                                public /* synthetic */ class WhenMappings {
                                                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                                    static {
                                                        int[] iArr = new int[BentoChip2.Type.values().length];
                                                        try {
                                                            iArr[BentoChip2.Type.Dropdown.ordinal()] = 1;
                                                        } catch (NoSuchFieldError unused) {
                                                        }
                                                        $EnumSwitchMapping$0 = iArr;
                                                    }
                                                }

                                                /* JADX WARN: Removed duplicated region for block: B:50:0x0115  */
                                                /* JADX WARN: Removed duplicated region for block: B:85:0x0203  */
                                                /*
                                                    Code decompiled incorrectly, please refer to instructions dump.
                                                */
                                                public final void invoke(Composer composer4, int i10) {
                                                    boolean z13;
                                                    boolean z14;
                                                    BentoChip2.StatefulColors statefulColors;
                                                    BentoChip2.Accessory accessory6;
                                                    BentoChip2.State state5;
                                                    BentoChip2.State state6;
                                                    boolean z15;
                                                    BentoChip2.StatefulColors statefulColors2;
                                                    Modifier.Companion companion;
                                                    BentoChip2.Type type5;
                                                    boolean z16;
                                                    BentoChip2.AccessoryPosition accessoryPosition;
                                                    boolean z17;
                                                    Composer composer5 = composer4;
                                                    if ((i10 & 3) == 2 && composer5.getSkipping()) {
                                                        composer5.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(118677052, i10, -1, "com.robinhood.compose.bento.component.BentoBaseChip.<anonymous>.<anonymous>.<anonymous> (BentoChip.kt:142)");
                                                    }
                                                    float fM2573x307f99b4 = accessory5 instanceof BentoChip2.Accessory.Action.Thumbnail ? BentoChip3.INSTANCE.m2573x307f99b4() : BentoChip3.INSTANCE.m20630getPaddingStartD9Ej5fM$lib_compose_bento_externalRelease();
                                                    BentoChip2.Accessory accessory7 = accessory5;
                                                    float fM20629getPaddingEndWithCountD9Ej5fM$lib_compose_bento_externalRelease = ((accessory7 instanceof BentoChip2.Accessory.Action.Count) || (accessory7 instanceof BentoChip2.Accessory.Selection.Count)) ? BentoChip3.INSTANCE.m20629getPaddingEndWithCountD9Ej5fM$lib_compose_bento_externalRelease() : BentoChip3.INSTANCE.m20628getPaddingEndD9Ej5fM$lib_compose_bento_externalRelease();
                                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion2, fM2573x307f99b4, 0.0f, fM20629getPaddingEndWithCountD9Ej5fM$lib_compose_bento_externalRelease, 0.0f, 10, null);
                                                    BentoChip3 bentoChip32 = BentoChip3.INSTANCE;
                                                    Modifier modifierM5155defaultMinSizeVpY3zN4$default = SizeKt.m5155defaultMinSizeVpY3zN4$default(modifierM5146paddingqDBjuR0$default, 0.0f, bentoChip32.m20622getChipHeightD9Ej5fM$lib_compose_bento_externalRelease(), 1, null);
                                                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                                    BentoChip2.Accessory accessory8 = accessory5;
                                                    BentoChip2.State state7 = state4;
                                                    boolean z18 = z12;
                                                    BentoChip2.StatefulColors statefulColors3 = colors;
                                                    String str6 = str5;
                                                    BentoChip2.Type type6 = type4;
                                                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer5, 48);
                                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer5, 0);
                                                    CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer5, modifierM5155defaultMinSizeVpY3zN4$default);
                                                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                    }
                                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                                    Row6 row6 = Row6.INSTANCE;
                                                    if ((accessory8 != null ? accessory8.getPosition$lib_compose_bento_externalRelease() : null) == BentoChip2.AccessoryPosition.Leading) {
                                                        z13 = true;
                                                    } else {
                                                        if ((accessory8 != null ? accessory8.getPosition$lib_compose_bento_externalRelease() : null) != BentoChip2.AccessoryPosition.Dual) {
                                                            z13 = false;
                                                        }
                                                    }
                                                    composer5.startReplaceGroup(1908311912);
                                                    if (z13) {
                                                        BentoChip.LeadingAccessory(accessory8, state7, z18, statefulColors3, composer5, 0);
                                                        accessory6 = accessory8;
                                                        state5 = state7;
                                                        z14 = z18;
                                                        statefulColors = statefulColors3;
                                                        if (str6 != null && !StringsKt.isBlank(str6)) {
                                                            Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion2, bentoChip32.m20633getSpacingD9Ej5fM$lib_compose_bento_externalRelease()), composer5, 6);
                                                        }
                                                    } else {
                                                        z14 = z18;
                                                        statefulColors = statefulColors3;
                                                        accessory6 = accessory8;
                                                        state5 = state7;
                                                    }
                                                    composer5.endReplaceGroup();
                                                    composer5.startReplaceGroup(1908321453);
                                                    if (str6 == null || StringsKt.isBlank(str6)) {
                                                        state6 = state5;
                                                        z15 = z14;
                                                        statefulColors2 = statefulColors;
                                                        companion = companion2;
                                                        type5 = type6;
                                                        z16 = false;
                                                        accessoryPosition = null;
                                                    } else {
                                                        long value3 = statefulColors.foregroundColor$lib_compose_bento_externalRelease(state5, z14, composer5, 0).getValue().getValue();
                                                        TextStyle textM = BentoTheme.INSTANCE.getTypography(composer5, 6).getTextM();
                                                        FontWeight.Companion companion4 = FontWeight.INSTANCE;
                                                        z16 = false;
                                                        type5 = type6;
                                                        statefulColors2 = statefulColors;
                                                        z15 = z14;
                                                        companion = companion2;
                                                        state6 = state5;
                                                        accessoryPosition = null;
                                                        BentoText2.m20747BentoText38GnDrw(str6, PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, bentoChip32.m20631getPaddingVerticalD9Ej5fM$lib_compose_bento_externalRelease(), 0.0f, bentoChip32.m20631getPaddingVerticalD9Ej5fM$lib_compose_bento_externalRelease(), 5, null), Color.m6701boximpl(value3), null, z14 ? companion4.getBold() : companion4.getNormal(), null, null, 0, false, 0, 0, null, 0, textM, composer4, 48, 0, 8168);
                                                        composer5 = composer4;
                                                    }
                                                    composer5.endReplaceGroup();
                                                    BentoChip2.Type type7 = type5;
                                                    if (type7 == BentoChip2.Type.Dropdown) {
                                                        z17 = true;
                                                    } else {
                                                        if ((accessory6 != null ? accessory6.getPosition$lib_compose_bento_externalRelease() : accessoryPosition) != BentoChip2.AccessoryPosition.Trailing) {
                                                            if ((accessory6 != null ? accessory6.getPosition$lib_compose_bento_externalRelease() : accessoryPosition) != BentoChip2.AccessoryPosition.Dual) {
                                                                z17 = z16;
                                                            }
                                                        }
                                                    }
                                                    composer5.startReplaceGroup(1908351340);
                                                    if (z17) {
                                                        Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion, bentoChip32.m20633getSpacingD9Ej5fM$lib_compose_bento_externalRelease()), composer5, 6);
                                                        if (WhenMappings.$EnumSwitchMapping$0[type7.ordinal()] == 1) {
                                                            composer5.startReplaceGroup(1908357014);
                                                            Composer composer6 = composer5;
                                                            BentoChip.m20606TrailingIconTN_CM5M(ServerToBentoAssetMapper2.CARET_DOWN_16.getResourceId(), null, bentoChip32.m20626getIconDropdownSizeD9Ej5fM$lib_compose_bento_externalRelease(), state6, z15, statefulColors2, composer6, 432);
                                                            composer6.endReplaceGroup();
                                                        } else {
                                                            composer5.startReplaceGroup(1908371070);
                                                            Intrinsics.checkNotNull(accessory6);
                                                            BentoChip.TrailingAccessory(accessory6, state6, z15, statefulColors2, composer5, 0);
                                                            composer4.endReplaceGroup();
                                                        }
                                                    }
                                                    composer4.endReplaceGroup();
                                                    composer4.endNode();
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                    invoke(composer4, num.intValue());
                                                    return Unit.INSTANCE;
                                                }
                                            }, composer3, 54), composer3, 0, 6, 704);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer2, 54), composer2, ProvidedValue.$stable | 48);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            z6 = z5;
                            z7 = z8;
                            modifier3 = modifier52;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    accessory2 = accessory;
                    if ((i2 & 64) == 0) {
                    }
                    str2 = str;
                    if ((599187 & i3) == 599186) {
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                z4 = z2;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                accessory2 = accessory;
                if ((i2 & 64) == 0) {
                }
                str2 = str;
                if ((599187 & i3) == 599186) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z3 = z;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            z4 = z2;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            accessory2 = accessory;
            if ((i2 & 64) == 0) {
            }
            str2 = str;
            if ((599187 & i3) == 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z3 = z;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        z4 = z2;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        accessory2 = accessory;
        if ((i2 & 64) == 0) {
        }
        str2 = str;
        if ((599187 & i3) == 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final void LeadingAccessory(final BentoChip2.Accessory accessory, final BentoChip2.State state, final boolean z, final BentoChip2.StatefulColors colors, Composer composer, final int i) {
        int i2;
        ServerToBentoAssetMapper2 leadingAsset;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(colors, "colors");
        Composer composerStartRestartGroup = composer.startRestartGroup(-84997595);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(accessory) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(state.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(colors) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-84997595, i2, -1, "com.robinhood.compose.bento.component.LeadingAccessory (BentoChip.kt:225)");
            }
            if (accessory instanceof BentoChip2.Accessory.Action.Thumbnail) {
                composerStartRestartGroup.startReplaceGroup(1867598292);
                BentoChip2.Accessory.Action.Thumbnail thumbnail = (BentoChip2.Accessory.Action.Thumbnail) accessory;
                ImageKt.Image(thumbnail.getPainter(), thumbnail.getContentDescription(), SizeKt.m5169size3ABfNKs(Modifier.INSTANCE, thumbnail.mo20607getSizeD9Ej5fM()), (Alignment) null, (ContentScale) null, state == BentoChip2.State.Disabled ? 0.4f : 1.0f, (ColorFilter) null, composerStartRestartGroup, 0, 88);
                composerStartRestartGroup.endReplaceGroup();
            } else if (accessory instanceof BentoChip2.Accessory.Dropdown.LeadingUrlIcon) {
                composerStartRestartGroup.startReplaceGroup(1868053310);
                BentoChip2.Accessory.Dropdown.LeadingUrlIcon leadingUrlIcon = (BentoChip2.Accessory.Dropdown.LeadingUrlIcon) accessory;
                Modifier modifierM5169size3ABfNKs = SizeKt.m5169size3ABfNKs(Modifier.INSTANCE, leadingUrlIcon.mo20607getSizeD9Ej5fM());
                AsyncImagePainter asyncImagePainterM9120rememberAsyncImagePainterEHKIwbg = SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(leadingUrlIcon.getAssetUrl(), null, null, null, 0, null, composerStartRestartGroup, 0, 62);
                composerStartRestartGroup = composerStartRestartGroup;
                ImageKt.Image(asyncImagePainterM9120rememberAsyncImagePainterEHKIwbg, leadingUrlIcon.getContentDescription(), modifierM5169size3ABfNKs, (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24576, 104);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1868368115);
                if (accessory instanceof BentoChip2.Accessory.Action.LeadingIcon) {
                    leadingAsset = ((BentoChip2.Accessory.Action.LeadingIcon) accessory).getAsset();
                } else if (accessory instanceof BentoChip2.Accessory.Selection.LeadingIcon) {
                    leadingAsset = ((BentoChip2.Accessory.Selection.LeadingIcon) accessory).getAsset();
                } else if (accessory instanceof BentoChip2.Accessory.Dropdown.LeadingIcon) {
                    leadingAsset = ((BentoChip2.Accessory.Dropdown.LeadingIcon) accessory).getAsset();
                } else if (accessory instanceof BentoChip2.Accessory.Selection.Dual.TrailingCount) {
                    leadingAsset = ((BentoChip2.Accessory.Selection.Dual.TrailingCount) accessory).getLeadingAsset();
                } else if (accessory instanceof BentoChip2.Accessory.Selection.Dual.TrailingIcon) {
                    leadingAsset = ((BentoChip2.Accessory.Selection.Dual.TrailingIcon) accessory).getLeadingAsset();
                } else if (accessory instanceof BentoChip2.Accessory.Action.Dual.TrailingCount) {
                    leadingAsset = ((BentoChip2.Accessory.Action.Dual.TrailingCount) accessory).getLeadingAsset();
                } else {
                    if (!(accessory instanceof BentoChip2.Accessory.Action.Dual.TrailingIcon)) {
                        throw new IllegalStateException("Invalid accessory class type");
                    }
                    leadingAsset = ((BentoChip2.Accessory.Action.Dual.TrailingIcon) accessory).getLeadingAsset();
                }
                IconKt.m5871Iconww6aTOc(PainterResources_androidKt.painterResource(leadingAsset.getResourceId(), composerStartRestartGroup, 0), accessory.getContentDescription(), LocalShowPlaceholder.withBentoCirclePlaceholder$default(SizeKt.m5169size3ABfNKs(Modifier.INSTANCE, accessory.mo20607getSizeD9Ej5fM()), false, 1, null), colors.foregroundColor$lib_compose_bento_externalRelease(state, z, composerStartRestartGroup, (i2 >> 3) & 1022).getValue().getValue(), composerStartRestartGroup, 0, 0);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoChipKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoChip.LeadingAccessory$lambda$6(accessory, state, z, colors, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void TrailingAccessory(final BentoChip2.Accessory accessory, BentoChip2.State state, boolean z, BentoChip2.StatefulColors colors, Composer composer, final int i) {
        int i2;
        BentoChip2.State state2;
        boolean z2;
        BentoChip2.StatefulColors statefulColors;
        Intrinsics.checkNotNullParameter(accessory, "accessory");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(colors, "colors");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1218389965);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(accessory) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(state.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(colors) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1218389965, i2, -1, "com.robinhood.compose.bento.component.TrailingAccessory (BentoChip.kt:275)");
            }
            if (accessory instanceof BentoChip2.Accessory.Selection.Count) {
                composerStartRestartGroup.startReplaceGroup(1653323495);
                state2 = state;
                z2 = z;
                statefulColors = colors;
                ChipCount(((BentoChip2.Accessory.Selection.Count) accessory).getNumber(), state2, z2, statefulColors, false, composerStartRestartGroup, i2 & 8176, 16);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                state2 = state;
                z2 = z;
                statefulColors = colors;
                if (accessory instanceof BentoChip2.Accessory.Action.Count) {
                    composerStartRestartGroup.startReplaceGroup(1653326727);
                    ChipCount(((BentoChip2.Accessory.Action.Count) accessory).getNumber(), state2, z2, statefulColors, false, composerStartRestartGroup, i2 & 8176, 16);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (accessory instanceof BentoChip2.Accessory.Selection.Dual.TrailingCount) {
                    composerStartRestartGroup.startReplaceGroup(-286361182);
                    BentoChip2.Accessory.Selection.Dual.TrailingCount trailingCount = (BentoChip2.Accessory.Selection.Dual.TrailingCount) accessory;
                    ChipCount(trailingCount.getNumber(), state2, z2, statefulColors, trailingCount.getInvertCountColorTheme(), composerStartRestartGroup, i2 & 8176, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (accessory instanceof BentoChip2.Accessory.Action.Dual.TrailingCount) {
                    composerStartRestartGroup.startReplaceGroup(-286190558);
                    BentoChip2.Accessory.Action.Dual.TrailingCount trailingCount2 = (BentoChip2.Accessory.Action.Dual.TrailingCount) accessory;
                    ChipCount(trailingCount2.getNumber(), state2, z2, statefulColors, trailingCount2.getInvertCountColorTheme(), composerStartRestartGroup, i2 & 8176, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (accessory instanceof BentoChip2.Accessory.Selection.Dual.TrailingIcon) {
                    composerStartRestartGroup.startReplaceGroup(1653341693);
                    BentoChip2.Accessory.Selection.Dual.TrailingIcon trailingIcon = (BentoChip2.Accessory.Selection.Dual.TrailingIcon) accessory;
                    m20606TrailingIconTN_CM5M(trailingIcon.getTrailingAsset().getResourceId(), trailingIcon.getContentDescription(), trailingIcon.mo20607getSizeD9Ej5fM(), state2, z2, statefulColors, composerStartRestartGroup, (i2 << 6) & 523264);
                    state2 = state2;
                    z2 = z2;
                    statefulColors = statefulColors;
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceGroup();
                } else if (accessory instanceof BentoChip2.Accessory.Action.Dual.TrailingIcon) {
                    composerStartRestartGroup.startReplaceGroup(1653350141);
                    BentoChip2.Accessory.Action.Dual.TrailingIcon trailingIcon2 = (BentoChip2.Accessory.Action.Dual.TrailingIcon) accessory;
                    m20606TrailingIconTN_CM5M(trailingIcon2.getTrailingAsset().getResourceId(), trailingIcon2.getContentDescription(), trailingIcon2.mo20607getSizeD9Ej5fM(), state2, z2, statefulColors, composerStartRestartGroup, (i2 << 6) & 523264);
                    state2 = state2;
                    z2 = z2;
                    statefulColors = statefulColors;
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceGroup();
                } else if (accessory instanceof BentoChip2.Accessory.Action.TrailingIcon) {
                    composerStartRestartGroup.startReplaceGroup(1653358421);
                    BentoChip2.Accessory.Action.TrailingIcon trailingIcon3 = (BentoChip2.Accessory.Action.TrailingIcon) accessory;
                    m20606TrailingIconTN_CM5M(trailingIcon3.getAsset().getResourceId(), trailingIcon3.getContentDescription(), trailingIcon3.mo20607getSizeD9Ej5fM(), state2, z2, statefulColors, composerStartRestartGroup, (i2 << 6) & 523264);
                    state2 = state2;
                    z2 = z2;
                    statefulColors = statefulColors;
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    if (!(accessory instanceof BentoChip2.Accessory.Selection.TrailingIcon)) {
                        composerStartRestartGroup.startReplaceGroup(1653373176);
                        composerStartRestartGroup.endReplaceGroup();
                        throw new IllegalStateException("Invalid accessory class type");
                    }
                    composerStartRestartGroup.startReplaceGroup(1653366549);
                    BentoChip2.Accessory.Selection.TrailingIcon trailingIcon4 = (BentoChip2.Accessory.Selection.TrailingIcon) accessory;
                    m20606TrailingIconTN_CM5M(trailingIcon4.getAsset().getResourceId(), trailingIcon4.getContentDescription(), trailingIcon4.mo20607getSizeD9Ej5fM(), state2, z2, statefulColors, composerStartRestartGroup, (i2 << 6) & 523264);
                    state2 = state2;
                    z2 = z2;
                    statefulColors = statefulColors;
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceGroup();
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            state2 = state;
            z2 = z;
            statefulColors = colors;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final BentoChip2.State state3 = state2;
            final boolean z3 = z2;
            final BentoChip2.StatefulColors statefulColors2 = statefulColors;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoChipKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoChip.TrailingAccessory$lambda$7(accessory, state3, z3, statefulColors2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: TrailingIcon-TN_CM5M, reason: not valid java name */
    public static final void m20606TrailingIconTN_CM5M(final int i, final String str, final float f, final BentoChip2.State state, final boolean z, final BentoChip2.StatefulColors colors, Composer composer, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(colors, "colors");
        Composer composerStartRestartGroup = composer.startRestartGroup(1221853222);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(f) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(state.ordinal()) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(colors) ? 131072 : 65536;
        }
        if ((74899 & i3) != 74898 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1221853222, i3, -1, "com.robinhood.compose.bento.component.TrailingIcon (BentoChip.kt:335)");
            }
            IconKt.m5871Iconww6aTOc(PainterResources_androidKt.painterResource(i, composerStartRestartGroup, i3 & 14), str, LocalShowPlaceholder.withBentoCirclePlaceholder$default(SizeKt.m5169size3ABfNKs(Modifier.INSTANCE, f), false, 1, null), colors.foregroundColor$lib_compose_bento_externalRelease(state, z, composerStartRestartGroup, (i3 >> 9) & 1022).getValue().getValue(), composerStartRestartGroup, i3 & 112, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoChipKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoChip.TrailingIcon_TN_CM5M$lambda$8(i, str, f, state, z, colors, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ChipCount(final int i, final BentoChip2.State state, final boolean z, final BentoChip2.StatefulColors colors, boolean z2, Composer composer, final int i2, final int i3) {
        int i4;
        boolean z3;
        boolean z4;
        SnapshotState4<Color> snapshotState4CountBackgroundColor$lib_compose_bento_externalRelease;
        final SnapshotState4<Color> snapshotState4ForegroundColor$lib_compose_bento_externalRelease;
        Composer composer2;
        final boolean z5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(colors, "colors");
        Composer composerStartRestartGroup = composer.startRestartGroup(1085964545);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(state.ordinal()) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(colors) ? 2048 : 1024;
        }
        int i5 = i3 & 16;
        if (i5 == 0) {
            if ((i2 & 24576) == 0) {
                z3 = z2;
                i4 |= composerStartRestartGroup.changed(z3) ? 16384 : 8192;
            }
            if ((i4 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                z4 = i5 == 0 ? false : z3;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1085964545, i4, -1, "com.robinhood.compose.bento.component.ChipCount (BentoChip.kt:353)");
                }
                if (z4) {
                    composerStartRestartGroup.startReplaceGroup(-65115578);
                    snapshotState4CountBackgroundColor$lib_compose_bento_externalRelease = colors.countBackgroundColor$lib_compose_bento_externalRelease(state, z, composerStartRestartGroup, (i4 >> 3) & 1022);
                } else {
                    composerStartRestartGroup.startReplaceGroup(-65117023);
                    snapshotState4CountBackgroundColor$lib_compose_bento_externalRelease = colors.foregroundColor$lib_compose_bento_externalRelease(state, z, composerStartRestartGroup, (i4 >> 3) & 1022);
                }
                composerStartRestartGroup.endReplaceGroup();
                if (z4) {
                    composerStartRestartGroup.startReplaceGroup(-65110943);
                    snapshotState4ForegroundColor$lib_compose_bento_externalRelease = colors.foregroundColor$lib_compose_bento_externalRelease(state, z, composerStartRestartGroup, (i4 >> 3) & 1022);
                } else {
                    composerStartRestartGroup.startReplaceGroup(-65112383);
                    snapshotState4ForegroundColor$lib_compose_bento_externalRelease = colors.backgroundColor$lib_compose_bento_externalRelease(state, z, composerStartRestartGroup, (i4 >> 3) & 1022);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-65109157);
                BorderStroke borderStrokeM4886BorderStrokecXLIe8U = !z4 ? null : BorderStroke2.m4886BorderStrokecXLIe8U(BentoChip3.INSTANCE.m20627getOutlinedBorderSizeD9Ej5fM$lib_compose_bento_externalRelease(), colors.countOutlineColor$lib_compose_bento_externalRelease(state, z, composerStartRestartGroup, (i4 >> 3) & 1022).getValue().getValue());
                composerStartRestartGroup.endReplaceGroup();
                BentoChip3 bentoChip3 = BentoChip3.INSTANCE;
                composer2 = composerStartRestartGroup;
                SurfaceKt.m5967SurfaceT9BRK9s(SizeKt.m5154defaultMinSizeVpY3zN4(Modifier.INSTANCE, bentoChip3.m20623getCountMinSizeD9Ej5fM$lib_compose_bento_externalRelease(), bentoChip3.m20623getCountMinSizeD9Ej5fM$lib_compose_bento_externalRelease()), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoChip3.m20624getCountRadiusD9Ej5fM$lib_compose_bento_externalRelease()), snapshotState4CountBackgroundColor$lib_compose_bento_externalRelease.getValue().getValue(), 0L, 0.0f, 0.0f, borderStrokeM4886BorderStrokecXLIe8U, ComposableLambda3.rememberComposableLambda(-1285969700, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.BentoChipKt.ChipCount.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i6) {
                        if ((i6 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1285969700, i6, -1, "com.robinhood.compose.bento.component.ChipCount.<anonymous> (BentoChip.kt:373)");
                        }
                        String strValueOf = String.valueOf(i);
                        long value = snapshotState4ForegroundColor$lib_compose_bento_externalRelease.getValue().getValue();
                        BentoText2.m20747BentoText38GnDrw(strValueOf, PaddingKt.m5144paddingVpY3zN4$default(SizeKt.wrapContentHeight$default(Modifier.INSTANCE, null, false, 3, null), BentoChip3.INSTANCE.m20625getCountTextPaddingD9Ej5fM$lib_compose_bento_externalRelease(), 0.0f, 2, null), Color.m6701boximpl(value), null, FontWeight.INSTANCE.getBold(), null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer3, 6).getTextS(), composer3, 24624, 0, 8104);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composer2, 12582918, 56);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z5 = z4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                z5 = z3;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoChipKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return BentoChip.ChipCount$lambda$9(i, state, z, colors, z5, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i4 |= 24576;
        z3 = z2;
        if ((i4 & 9363) == 9362) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (z4) {
            }
            composerStartRestartGroup.endReplaceGroup();
            if (z4) {
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-65109157);
            BorderStroke borderStrokeM4886BorderStrokecXLIe8U2 = !z4 ? null : BorderStroke2.m4886BorderStrokecXLIe8U(BentoChip3.INSTANCE.m20627getOutlinedBorderSizeD9Ej5fM$lib_compose_bento_externalRelease(), colors.countOutlineColor$lib_compose_bento_externalRelease(state, z, composerStartRestartGroup, (i4 >> 3) & 1022).getValue().getValue());
            composerStartRestartGroup.endReplaceGroup();
            BentoChip3 bentoChip32 = BentoChip3.INSTANCE;
            composer2 = composerStartRestartGroup;
            SurfaceKt.m5967SurfaceT9BRK9s(SizeKt.m5154defaultMinSizeVpY3zN4(Modifier.INSTANCE, bentoChip32.m20623getCountMinSizeD9Ej5fM$lib_compose_bento_externalRelease(), bentoChip32.m20623getCountMinSizeD9Ej5fM$lib_compose_bento_externalRelease()), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoChip32.m20624getCountRadiusD9Ej5fM$lib_compose_bento_externalRelease()), snapshotState4CountBackgroundColor$lib_compose_bento_externalRelease.getValue().getValue(), 0L, 0.0f, 0.0f, borderStrokeM4886BorderStrokecXLIe8U2, ComposableLambda3.rememberComposableLambda(-1285969700, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.BentoChipKt.ChipCount.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i6) {
                    if ((i6 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1285969700, i6, -1, "com.robinhood.compose.bento.component.ChipCount.<anonymous> (BentoChip.kt:373)");
                    }
                    String strValueOf = String.valueOf(i);
                    long value = snapshotState4ForegroundColor$lib_compose_bento_externalRelease.getValue().getValue();
                    BentoText2.m20747BentoText38GnDrw(strValueOf, PaddingKt.m5144paddingVpY3zN4$default(SizeKt.wrapContentHeight$default(Modifier.INSTANCE, null, false, 3, null), BentoChip3.INSTANCE.m20625getCountTextPaddingD9Ej5fM$lib_compose_bento_externalRelease(), 0.0f, 2, null), Color.m6701boximpl(value), null, FontWeight.INSTANCE.getBold(), null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer3, 6).getTextS(), composer3, 24624, 0, 8104);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composer2, 12582918, 56);
            if (ComposerKt.isTraceInProgress()) {
            }
            z5 = z4;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final void BentoChipPreviewDay(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1212947192);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1212947192, i, -1, "com.robinhood.compose.bento.component.BentoChipPreviewDay (BentoChip.kt:699)");
            }
            BentoChipDefault(true, composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoChipKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoChip.BentoChipPreviewDay$lambda$10(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void BentoChipPreviewDayDisabled(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1487702676);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1487702676, i, -1, "com.robinhood.compose.bento.component.BentoChipPreviewDayDisabled (BentoChip.kt:705)");
            }
            LocalShowPlaceholder.Loadable(true, null, null, BentoChip4.INSTANCE.getLambda$756242468$lib_compose_bento_externalRelease(), composerStartRestartGroup, 3078, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoChipKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoChip.BentoChipPreviewDayDisabled$lambda$11(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void BentoChipPreviewNight(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-812491404);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-812491404, i, -1, "com.robinhood.compose.bento.component.BentoChipPreviewNight (BentoChip.kt:713)");
            }
            BentoChipDefault(false, composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoChipKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoChip.BentoChipPreviewNight$lambda$12(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BentoChipDefault(final boolean z, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(43519595);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(43519595, i2, -1, "com.robinhood.compose.bento.component.BentoChipDefault (BentoChip.kt:718)");
            }
            BentoTheme2.BentoTheme(Boolean.valueOf(z), null, null, null, null, null, null, null, BentoChip4.INSTANCE.m20782getLambda$1767760349$lib_compose_bento_externalRelease(), composerStartRestartGroup, (i2 & 14) | 100663296, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoChipKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoChip.BentoChipDefault$lambda$13(z, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void BentoSelectionChipAccessories(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-403530000);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-403530000, i, -1, "com.robinhood.compose.bento.component.BentoSelectionChipAccessories (BentoChip.kt:731)");
            }
            BentoChip2.Type type2 = BentoChip2.Type.Selection;
            BentoChipStates(type2, null, false, null, composerStartRestartGroup, 6, 14);
            ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.PLUS_16;
            int i2 = 2;
            BentoChipStates(type2, null, false, new BentoChip2.Accessory.Selection.LeadingIcon(serverToBentoAssetMapper2, null, i2, 0 == true ? 1 : 0), composerStartRestartGroup, 6, 6);
            BentoChipStates(type2, null, false, new BentoChip2.Accessory.Selection.TrailingIcon(serverToBentoAssetMapper2, 0 == true ? 1 : 0, i2, 0 == true ? 1 : 0), composerStartRestartGroup, 6, 6);
            BentoChipStates(type2, null, false, new BentoChip2.Accessory.Selection.Count(2), composerStartRestartGroup, 6, 6);
            BentoChipStates(type2, null, true, null, composerStartRestartGroup, 390, 10);
            BentoChipStates(type2, null, true, new BentoChip2.Accessory.Selection.LeadingIcon(serverToBentoAssetMapper2, 0 == true ? 1 : 0, i2, 0 == true ? 1 : 0), composerStartRestartGroup, 390, 2);
            BentoChipStates(type2, null, true, new BentoChip2.Accessory.Selection.TrailingIcon(serverToBentoAssetMapper2, 0 == true ? 1 : 0, i2, 0 == true ? 1 : 0), composerStartRestartGroup, 390, 2);
            BentoChipStates(type2, null, true, new BentoChip2.Accessory.Selection.Count(2), composerStartRestartGroup, 390, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoChipKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoChip.BentoSelectionChipAccessories$lambda$14(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void BentoActionChipAccessories(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1219818090);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1219818090, i, -1, "com.robinhood.compose.bento.component.BentoActionChipAccessories (BentoChip.kt:775)");
            }
            BentoChip2.Type type2 = BentoChip2.Type.Action;
            BentoChipStates(type2, null, false, null, composerStartRestartGroup, 6, 14);
            ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.RECURRING_16;
            int i2 = 2;
            BentoChipStates(type2, null, false, new BentoChip2.Accessory.Action.LeadingIcon(serverToBentoAssetMapper2, null, i2, 0 == true ? 1 : 0), composerStartRestartGroup, 6, 6);
            BentoChipStates(type2, null, false, new BentoChip2.Accessory.Action.TrailingIcon(serverToBentoAssetMapper2, 0 == true ? 1 : 0, i2, 0 == true ? 1 : 0), composerStartRestartGroup, 6, 6);
            BentoChipStates(type2, null, false, new BentoChip2.Accessory.Action.Count(2), composerStartRestartGroup, 6, 6);
            BentoChipStates(type2, null, false, new BentoChip2.Accessory.Action.Thumbnail(PainterResources_androidKt.painterResource(C20690R.drawable.ic_rds_circle_check_12dp, composerStartRestartGroup, 0), 0 == true ? 1 : 0, i2, 0 == true ? 1 : 0), composerStartRestartGroup, 6, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoChipKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoChip.BentoActionChipAccessories$lambda$15(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void BentoDropdownChipAccessories(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(315830043);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(315830043, i, -1, "com.robinhood.compose.bento.component.BentoDropdownChipAccessories (BentoChip.kt:801)");
            }
            BentoChip2.Type type2 = BentoChip2.Type.Dropdown;
            BentoChipStates(type2, null, false, null, composerStartRestartGroup, 6, 14);
            BentoChipStates(type2, null, false, new BentoChip2.Accessory.Dropdown.LeadingIcon(ServerToBentoAssetMapper2.RECURRING_16, null, 2, 0 == true ? 1 : 0), composerStartRestartGroup, 6, 6);
            BentoChipStates(type2, null, false, new BentoChip2.Accessory.Dropdown.LeadingUrlIcon("https://brokerage-static.s3.us-east-1.amazonaws.com/app_assets/crypto/network_logos/Ethereum16.png", null, null, 6, null), composerStartRestartGroup, 6, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoChipKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoChip.BentoDropdownChipAccessories$lambda$16(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void BentoChipStates(final BentoChip2.Type type2, Modifier modifier, boolean z, BentoChip2.Accessory accessory, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        BentoChip2.Accessory accessory2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        final Modifier modifier3;
        final boolean z3;
        final BentoChip2.Accessory accessory3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-408439937);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(type2.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 == 0) {
                    if ((i & 3072) == 0) {
                        accessory2 = accessory;
                        i3 |= composerStartRestartGroup.changed(accessory2) ? 2048 : 1024;
                    }
                    if ((i3 & 1171) != 1170 && composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        z3 = z2;
                        accessory3 = accessory2;
                    } else {
                        Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                        boolean z4 = i4 == 0 ? false : z2;
                        BentoChip2.Accessory accessory4 = i5 == 0 ? null : accessory2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-408439937, i3, -1, "com.robinhood.compose.bento.component.BentoChipStates (BentoChip.kt:826)");
                        }
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion2);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                        Row6 row6 = Row6.INSTANCE;
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.compose.bento.component.BentoChipKt$$ExternalSyntheticLambda15
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        Function0 function0 = (Function0) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        int i7 = (i3 & 14) | 1575984 | ((i3 << 3) & 896);
                        int i8 = i3 << 6;
                        int i9 = i7 | (57344 & i8) | (i8 & 458752);
                        Modifier modifier5 = modifier4;
                        BentoBaseChip(type2, function0, modifier5, true, z4, accessory4, "Chip label", composerStartRestartGroup, i9, 0);
                        Spacer2.Spacer(SizeKt.m5169size3ABfNKs(companion2, C2002Dp.m7995constructorimpl(8)), composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.compose.bento.component.BentoChipKt$$ExternalSyntheticLambda16
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        BentoBaseChip(type2, (Function0) objRememberedValue2, modifier5, false, z4, accessory4, "Chip label", composerStartRestartGroup, i9, 0);
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier5;
                        z3 = z4;
                        accessory3 = accessory4;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoChipKt$$ExternalSyntheticLambda17
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return BentoChip.BentoChipStates$lambda$22(type2, modifier3, z3, accessory3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 3072;
                accessory2 = accessory;
                if ((i3 & 1171) != 1170) {
                    if (i6 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Modifier.Companion companion22 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion22);
                    ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion32.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion32.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion32.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion32.getSetModifier());
                        Row6 row62 = Row6.INSTANCE;
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                        }
                        Function0 function02 = (Function0) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        int i72 = (i3 & 14) | 1575984 | ((i3 << 3) & 896);
                        int i82 = i3 << 6;
                        int i92 = i72 | (57344 & i82) | (i82 & 458752);
                        Modifier modifier52 = modifier4;
                        BentoBaseChip(type2, function02, modifier52, true, z4, accessory4, "Chip label", composerStartRestartGroup, i92, 0);
                        Spacer2.Spacer(SizeKt.m5169size3ABfNKs(companion22, C2002Dp.m7995constructorimpl(8)), composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        BentoBaseChip(type2, (Function0) objRememberedValue2, modifier52, false, z4, accessory4, "Chip label", composerStartRestartGroup, i92, 0);
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier52;
                        z3 = z4;
                        accessory3 = accessory4;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z2 = z;
            i5 = i2 & 8;
            if (i5 == 0) {
            }
            accessory2 = accessory;
            if ((i3 & 1171) != 1170) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 8;
        if (i5 == 0) {
        }
        accessory2 = accessory;
        if ((i3 & 1171) != 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
