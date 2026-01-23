package com.robinhood.android.sdui.chartgroup;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.android.charts.cursor.ChartCursorDataHeaderKt;
import com.robinhood.android.charts.cursor.ChartLabelTrack;
import com.robinhood.android.charts.cursor.CursorData;
import com.robinhood.android.charts.cursor.CursorDataConfig;
import com.robinhood.android.charts.cursor.CursorRowModifiers;
import com.robinhood.android.charts.models.p080db.ChartCursorData;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.UtilKt;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.models.serverdriven.experimental.api.CursorData;
import com.robinhood.models.serverdriven.experimental.api.DeeplinkAction;
import com.robinhood.models.serverdriven.experimental.api.DisplayText;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.Icon;
import com.robinhood.models.serverdriven.experimental.api.IconDisplayText;
import com.robinhood.models.serverdriven.experimental.api.LinearGradientColor;
import com.robinhood.models.serverdriven.experimental.api.Money;
import com.robinhood.models.serverdriven.experimental.api.Point;
import com.robinhood.models.serverdriven.experimental.api.PriceChartData;
import com.robinhood.models.serverdriven.experimental.api.SubDisplayText;
import com.robinhood.models.serverdriven.experimental.api.TextStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SduiCursorData.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\u0006\u001a\u00020\u0001*\u00020\fH\u0007¢\u0006\u0004\b\u0006\u0010\r\u001a\u0013\u0010\u0006\u001a\u00020\u000f*\u00020\u000eH\u0007¢\u0006\u0004\b\u0006\u0010\u0010\u001a\u008f\u0001\u0010!\u001a\u00020\u00182\b\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u001b\b\u0002\u0010\u001a\u001a\u0015\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0016¢\u0006\u0002\b\u00192\u001b\b\u0002\u0010\u001b\u001a\u0015\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0016¢\u0006\u0002\b\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001c2\b\b\u0002\u0010 \u001a\u00020\u001cH\u0007¢\u0006\u0004\b!\u0010\"\u001a#\u0010%\u001a\u00020\u00182\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\u0010$\u001a\u0004\u0018\u00010#H\u0007¢\u0006\u0004\b%\u0010&¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/charts/models/db/ChartCursorData$DisplayText;", "Lcom/robinhood/android/charts/cursor/CursorData$DisplayText;", "composableModel", "(Lcom/robinhood/android/charts/models/db/ChartCursorData$DisplayText;Landroidx/compose/runtime/Composer;I)Lcom/robinhood/android/charts/cursor/CursorData$DisplayText;", "Lcom/robinhood/models/serverdriven/experimental/api/IconDisplayText;", "Lcom/robinhood/android/charts/cursor/CursorData$IconDisplayText;", "toComposableModel", "(Lcom/robinhood/models/serverdriven/experimental/api/IconDisplayText;Landroidx/compose/runtime/Composer;I)Lcom/robinhood/android/charts/cursor/CursorData$IconDisplayText;", "Lcom/robinhood/models/serverdriven/experimental/api/SubDisplayText;", "Lcom/robinhood/android/charts/cursor/CursorData$SubDisplayText;", "toChartSubDisplayText", "(Lcom/robinhood/models/serverdriven/experimental/api/SubDisplayText;Landroidx/compose/runtime/Composer;I)Lcom/robinhood/android/charts/cursor/CursorData$SubDisplayText;", "Lcom/robinhood/models/serverdriven/experimental/api/DisplayText;", "(Lcom/robinhood/models/serverdriven/experimental/api/DisplayText;Landroidx/compose/runtime/Composer;I)Lcom/robinhood/android/charts/cursor/CursorData$DisplayText;", "Lcom/robinhood/models/serverdriven/experimental/api/CursorData;", "Lcom/robinhood/android/charts/cursor/CursorData;", "(Lcom/robinhood/models/serverdriven/experimental/api/CursorData;Landroidx/compose/runtime/Composer;I)Lcom/robinhood/android/charts/cursor/CursorData;", "state", "Landroidx/compose/ui/Modifier;", "modifier", "Lcom/robinhood/android/charts/cursor/CursorRowModifiers;", "rowModifiers", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "", "Lkotlin/ExtensionFunctionType;", "primaryRowTrailing", "secondaryRowTrailing", "", "alwaysAllowTertiary", "showPlaceholder", "shouldAddScrimOverlayToSubheader", "showDisplayCurrencyLabel", "SduiCursorDataHeader", "(Lcom/robinhood/models/serverdriven/experimental/api/CursorData;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/charts/cursor/CursorRowModifiers;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;ZZZZLandroidx/compose/runtime/Composer;II)V", "Lcom/robinhood/models/serverdriven/experimental/api/Point;", "point", "SduiLabelTrack", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/models/serverdriven/experimental/api/Point;Landroidx/compose/runtime/Composer;II)V", "lib-sdui-charts_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.sdui.chartgroup.SduiCursorDataKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class SduiCursorData2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiCursorDataHeader$lambda$4(CursorData cursorData, Modifier modifier, CursorRowModifiers cursorRowModifiers, Function3 function3, Function3 function32, boolean z, boolean z2, boolean z3, boolean z4, int i, int i2, Composer composer, int i3) {
        SduiCursorDataHeader(cursorData, modifier, cursorRowModifiers, function3, function32, z, z2, z3, z4, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiLabelTrack$lambda$5(Modifier modifier, Point point, int i, int i2, Composer composer, int i3) {
        SduiLabelTrack(modifier, point, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final CursorData.DisplayText composableModel(ChartCursorData.DisplayText displayText, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(displayText, "<this>");
        composer.startReplaceGroup(-1963920277);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1963920277, i, -1, "com.robinhood.android.sdui.chartgroup.composableModel (SduiCursorData.kt:27)");
        }
        CursorData.DisplayText displayText2 = new CursorData.DisplayText(displayText.getValue(), SduiColors2.m18896toComposeColorDefaultediJQMabo(displayText.getColor(), 0L, composer, 0, 1), null, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return displayText2;
    }

    private static final CursorData.IconDisplayText toComposableModel(IconDisplayText iconDisplayText, Composer composer, int i) {
        composer.startReplaceGroup(-1334691632);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1334691632, i, -1, "com.robinhood.android.sdui.chartgroup.toComposableModel (SduiCursorData.kt:36)");
        }
        String value = iconDisplayText.getValue();
        long jM18896toComposeColorDefaultediJQMabo = SduiColors2.m18896toComposeColorDefaultediJQMabo(iconDisplayText.getColor(), 0L, composer, 0, 1);
        Icon icon = iconDisplayText.getIcon();
        LinearGradientColor gradient_color = iconDisplayText.getGradient_color();
        com.robinhood.shared.compose.color.LinearGradientColor linearGradientColor = gradient_color == null ? null : SduiColors2.toLinearGradientColor(gradient_color, 0.0f, composer, 0, 1);
        CursorData.IconDisplayText iconDisplayText2 = new CursorData.IconDisplayText(value, jM18896toComposeColorDefaultediJQMabo, linearGradientColor != null ? com.robinhood.shared.compose.color.LinearGradientColor.getBrush$default(linearGradientColor, null, 1, null) : null, icon, null, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return iconDisplayText2;
    }

    private static final CursorData.SubDisplayText toChartSubDisplayText(SubDisplayText subDisplayText, Composer composer, int i) {
        composer.startReplaceGroup(-1861115111);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1861115111, i, -1, "com.robinhood.android.sdui.chartgroup.toChartSubDisplayText (SduiCursorData.kt:45)");
        }
        CursorData.IconDisplayText composableModel = toComposableModel(subDisplayText.getMain(), composer, 0);
        DisplayText description = subDisplayText.getDescription();
        CursorData.SubDisplayText subDisplayText2 = new CursorData.SubDisplayText(composableModel, description == null ? null : toComposableModel(description, composer, 0), subDisplayText.getTrailing_icon());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return subDisplayText2;
    }

    public static final CursorData.DisplayText toComposableModel(DisplayText displayText, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(displayText, "<this>");
        composer.startReplaceGroup(164532976);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(164532976, i, -1, "com.robinhood.android.sdui.chartgroup.toComposableModel (SduiCursorData.kt:52)");
        }
        String value = displayText.getValue();
        long jM18896toComposeColorDefaultediJQMabo = SduiColors2.m18896toComposeColorDefaultediJQMabo(displayText.getColor(), 0L, composer, 0, 1);
        TextStyle text_style = displayText.getText_style();
        CursorData.DisplayText displayText2 = new CursorData.DisplayText(value, jM18896toComposeColorDefaultediJQMabo, text_style == null ? null : UtilKt.getComposeTextStyle(text_style, composer, 0), null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return displayText2;
    }

    public static final com.robinhood.android.charts.cursor.CursorData toComposableModel(com.robinhood.models.serverdriven.experimental.api.CursorData cursorData, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(cursorData, "<this>");
        composer.startReplaceGroup(-349054296);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-349054296, i, -1, "com.robinhood.android.sdui.chartgroup.toComposableModel (SduiCursorData.kt:59)");
        }
        DisplayText label = cursorData.getLabel();
        composer.startReplaceGroup(-433726277);
        CursorData.DisplayText composableModel = label == null ? null : toComposableModel(label, composer, 0);
        composer.endReplaceGroup();
        DisplayText primary_value = cursorData.getPrimary_value();
        composer.startReplaceGroup(-433724517);
        CursorData.DisplayText composableModel2 = primary_value == null ? null : toComposableModel(primary_value, composer, 0);
        composer.endReplaceGroup();
        SubDisplayText secondary_value = cursorData.getSecondary_value();
        composer.startReplaceGroup(-433722625);
        CursorData.SubDisplayText chartSubDisplayText = secondary_value == null ? null : toChartSubDisplayText(secondary_value, composer, 0);
        composer.endReplaceGroup();
        SubDisplayText tertiary_value = cursorData.getTertiary_value();
        composer.startReplaceGroup(-433720673);
        CursorData.SubDisplayText chartSubDisplayText2 = tertiary_value == null ? null : toChartSubDisplayText(tertiary_value, composer, 0);
        composer.endReplaceGroup();
        SubDisplayText quaternary_value = cursorData.getQuaternary_value();
        com.robinhood.android.charts.cursor.CursorData cursorData2 = new com.robinhood.android.charts.cursor.CursorData(composableModel, composableModel2, chartSubDisplayText, chartSubDisplayText2, quaternary_value != null ? toChartSubDisplayText(quaternary_value, composer, 0) : null, cursorData.getAction());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return cursorData2;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:178:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SduiCursorDataHeader(final com.robinhood.models.serverdriven.experimental.api.CursorData cursorData, Modifier modifier, CursorRowModifiers cursorRowModifiers, Function3<? super Row5, ? super Composer, ? super Integer, Unit> function3, Function3<? super Row5, ? super Composer, ? super Integer, Unit> function32, boolean z, boolean z2, boolean z3, boolean z4, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        CursorRowModifiers cursorRowModifiers2;
        int i4;
        Function3<? super Row5, ? super Composer, ? super Integer, Unit> function33;
        int i5;
        Function3<? super Row5, ? super Composer, ? super Integer, Unit> function34;
        int i6;
        boolean z5;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z6;
        boolean z7;
        boolean z8;
        CursorRowModifiers cursorRowModifiers3;
        int i12;
        boolean z9;
        Function3<? super Row5, ? super Composer, ? super Integer, Unit> function35;
        Function3<? super Row5, ? super Composer, ? super Integer, Unit> function36;
        int i13;
        final DeeplinkAction action;
        boolean z10;
        Modifier modifier3;
        Modifier modifier4;
        Composer composer2;
        final Modifier modifier5;
        final boolean z11;
        final boolean z12;
        final CursorRowModifiers cursorRowModifiers4;
        final Function3<? super Row5, ? super Composer, ? super Integer, Unit> function37;
        final boolean z13;
        final boolean z14;
        final Function3<? super Row5, ? super Composer, ? super Integer, Unit> function38;
        PriceChartData price_chart_data;
        Money dollar_value;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1389927190);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(cursorData) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i14 = i2 & 2;
        if (i14 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    cursorRowModifiers2 = cursorRowModifiers;
                    int i15 = composerStartRestartGroup.changedInstance(cursorRowModifiers2) ? 256 : 128;
                    i3 |= i15;
                } else {
                    cursorRowModifiers2 = cursorRowModifiers;
                }
                i3 |= i15;
            } else {
                cursorRowModifiers2 = cursorRowModifiers;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    function33 = function3;
                    i3 |= composerStartRestartGroup.changedInstance(function33) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        function34 = function32;
                        i3 |= composerStartRestartGroup.changedInstance(function34) ? 16384 : 8192;
                    }
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= 196608;
                    } else {
                        if ((196608 & i) == 0) {
                            z5 = z;
                            i3 |= composerStartRestartGroup.changed(z5) ? 131072 : 65536;
                        }
                        i7 = i2 & 64;
                        if (i7 != 0) {
                            i3 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            i3 |= composerStartRestartGroup.changed(z2) ? 1048576 : 524288;
                        }
                        i8 = i2 & 128;
                        if (i8 != 0) {
                            i3 |= 12582912;
                        } else {
                            if ((i & 12582912) == 0) {
                                i9 = i8;
                                i3 |= composerStartRestartGroup.changed(z3) ? 8388608 : 4194304;
                            }
                            i10 = i2 & 256;
                            if (i10 != 0) {
                                if ((i & 100663296) == 0) {
                                    i11 = i10;
                                    i3 |= composerStartRestartGroup.changed(z4) ? 67108864 : 33554432;
                                }
                                if ((i3 & 38347923) != 38347922 || !composerStartRestartGroup.getSkipping()) {
                                    composerStartRestartGroup.startDefaults();
                                    String currency_code = null;
                                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                        if (i14 != 0) {
                                            modifier2 = Modifier.INSTANCE;
                                        }
                                        if ((i2 & 4) != 0) {
                                            i3 &= -897;
                                            cursorRowModifiers2 = CursorRowModifiers.Default.INSTANCE;
                                        }
                                        if (i4 != 0) {
                                            function33 = null;
                                        }
                                        if (i5 != 0) {
                                            function34 = null;
                                        }
                                        if (i6 != 0) {
                                            z5 = true;
                                        }
                                        boolean z15 = i7 == 0 ? false : z2;
                                        z6 = i9 == 0 ? false : z3;
                                        int i16 = i3;
                                        z7 = z15;
                                        z8 = z5;
                                        cursorRowModifiers3 = cursorRowModifiers2;
                                        i12 = i16;
                                        z9 = i11 == 0 ? false : z4;
                                        function35 = function33;
                                        function36 = function34;
                                        i13 = 1389927190;
                                    } else {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        if ((i2 & 4) != 0) {
                                            i3 &= -897;
                                        }
                                        z6 = z3;
                                        z9 = z4;
                                        function35 = function33;
                                        function36 = function34;
                                        z8 = z5;
                                        i13 = 1389927190;
                                        cursorRowModifiers3 = cursorRowModifiers2;
                                        i12 = i3;
                                        z7 = z2;
                                    }
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(i13, i12, -1, "com.robinhood.android.sdui.chartgroup.SduiCursorDataHeader (SduiCursorData.kt:79)");
                                    }
                                    final SduiActionHandler sduiActionHandlerCurrentActionHandler = SduiActionHandler3.currentActionHandler(composerStartRestartGroup, 0);
                                    composerStartRestartGroup.startReplaceGroup(-14779588);
                                    action = cursorData == null ? cursorData.getAction() : null;
                                    if (action == null) {
                                        composerStartRestartGroup.startReplaceGroup(1849434622);
                                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                        Composer.Companion companion = Composer.INSTANCE;
                                        if (objRememberedValue == companion.getEmpty()) {
                                            objRememberedValue = InteractionSource2.MutableInteractionSource();
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                        }
                                        InteractionSource3 interactionSource3 = (InteractionSource3) objRememberedValue;
                                        composerStartRestartGroup.endReplaceGroup();
                                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(sduiActionHandlerCurrentActionHandler) | composerStartRestartGroup.changedInstance(action);
                                        z10 = z8;
                                        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                        if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.sdui.chartgroup.SduiCursorDataKt$$ExternalSyntheticLambda0
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return SduiCursorData2.SduiCursorDataHeader$lambda$3$lambda$2$lambda$1(sduiActionHandlerCurrentActionHandler, action);
                                                }
                                            };
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        Modifier modifier6 = modifier2;
                                        Modifier modifierM4891clickableO2vRcR0$default = ClickableKt.m4891clickableO2vRcR0$default(modifier6, interactionSource3, null, false, null, null, (Function0) objRememberedValue2, 28, null);
                                        modifier3 = modifier6;
                                        if (modifierM4891clickableO2vRcR0$default != null) {
                                            modifier4 = modifierM4891clickableO2vRcR0$default;
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        composerStartRestartGroup.startReplaceGroup(-14769463);
                                        com.robinhood.android.charts.cursor.CursorData composableModel = cursorData == null ? null : toComposableModel(cursorData, composerStartRestartGroup, i12 & 14);
                                        composerStartRestartGroup.endReplaceGroup();
                                        boolean z16 = z7;
                                        boolean z17 = z10;
                                        CursorDataConfig cursorDataConfig = new CursorDataConfig(z17, z16, false, false, false, z6, 28, null);
                                        if (cursorData != null && (price_chart_data = cursorData.getPrice_chart_data()) != null && (dollar_value = price_chart_data.getDollar_value()) != null) {
                                            currency_code = dollar_value.getCurrency_code();
                                        }
                                        composer2 = composerStartRestartGroup;
                                        ChartCursorDataHeaderKt.ChartCursorDataHeaderSection(composableModel, modifier4, cursorRowModifiers3, function35, function36, null, cursorDataConfig, currency_code, z9, composer2, com.robinhood.android.charts.cursor.CursorData.$stable | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (CursorDataConfig.$stable << 18) | (i12 & 234881024), 32);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        modifier5 = modifier3;
                                        z11 = z17;
                                        z12 = z6;
                                        cursorRowModifiers4 = cursorRowModifiers3;
                                        function37 = function36;
                                        z13 = z9;
                                        z14 = z16;
                                        function38 = function35;
                                    } else {
                                        z10 = z8;
                                        modifier3 = modifier2;
                                    }
                                    modifier4 = modifier3;
                                    composerStartRestartGroup.endReplaceGroup();
                                    composerStartRestartGroup.startReplaceGroup(-14769463);
                                    if (cursorData == null) {
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    boolean z162 = z7;
                                    boolean z172 = z10;
                                    CursorDataConfig cursorDataConfig2 = new CursorDataConfig(z172, z162, false, false, false, z6, 28, null);
                                    if (cursorData != null) {
                                        currency_code = dollar_value.getCurrency_code();
                                    }
                                    composer2 = composerStartRestartGroup;
                                    ChartCursorDataHeaderKt.ChartCursorDataHeaderSection(composableModel, modifier4, cursorRowModifiers3, function35, function36, null, cursorDataConfig2, currency_code, z9, composer2, com.robinhood.android.charts.cursor.CursorData.$stable | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (CursorDataConfig.$stable << 18) | (i12 & 234881024), 32);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    modifier5 = modifier3;
                                    z11 = z172;
                                    z12 = z6;
                                    cursorRowModifiers4 = cursorRowModifiers3;
                                    function37 = function36;
                                    z13 = z9;
                                    z14 = z162;
                                    function38 = function35;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    z14 = z2;
                                    z13 = z4;
                                    composer2 = composerStartRestartGroup;
                                    modifier5 = modifier2;
                                    cursorRowModifiers4 = cursorRowModifiers2;
                                    function38 = function33;
                                    function37 = function34;
                                    z11 = z5;
                                    z12 = z3;
                                }
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.sdui.chartgroup.SduiCursorDataKt$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return SduiCursorData2.SduiCursorDataHeader$lambda$4(cursorData, modifier5, cursorRowModifiers4, function38, function37, z11, z14, z12, z13, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i3 |= 100663296;
                            i11 = i10;
                            if ((i3 & 38347923) != 38347922) {
                                composerStartRestartGroup.startDefaults();
                                String currency_code2 = null;
                                if ((i & 1) != 0) {
                                    if (i14 != 0) {
                                    }
                                    if ((i2 & 4) != 0) {
                                    }
                                    if (i4 != 0) {
                                    }
                                    if (i5 != 0) {
                                    }
                                    if (i6 != 0) {
                                    }
                                    if (i7 == 0) {
                                    }
                                    if (i9 == 0) {
                                    }
                                    int i162 = i3;
                                    z7 = z15;
                                    z8 = z5;
                                    cursorRowModifiers3 = cursorRowModifiers2;
                                    i12 = i162;
                                    if (i11 == 0) {
                                    }
                                    function35 = function33;
                                    function36 = function34;
                                    i13 = 1389927190;
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    final SduiActionHandler sduiActionHandlerCurrentActionHandler2 = SduiActionHandler3.currentActionHandler(composerStartRestartGroup, 0);
                                    composerStartRestartGroup.startReplaceGroup(-14779588);
                                    if (cursorData == null) {
                                    }
                                    if (action == null) {
                                    }
                                    modifier4 = modifier3;
                                    composerStartRestartGroup.endReplaceGroup();
                                    composerStartRestartGroup.startReplaceGroup(-14769463);
                                    if (cursorData == null) {
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    boolean z1622 = z7;
                                    boolean z1722 = z10;
                                    CursorDataConfig cursorDataConfig22 = new CursorDataConfig(z1722, z1622, false, false, false, z6, 28, null);
                                    if (cursorData != null) {
                                    }
                                    composer2 = composerStartRestartGroup;
                                    ChartCursorDataHeaderKt.ChartCursorDataHeaderSection(composableModel, modifier4, cursorRowModifiers3, function35, function36, null, cursorDataConfig22, currency_code2, z9, composer2, com.robinhood.android.charts.cursor.CursorData.$stable | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (CursorDataConfig.$stable << 18) | (i12 & 234881024), 32);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    modifier5 = modifier3;
                                    z11 = z1722;
                                    z12 = z6;
                                    cursorRowModifiers4 = cursorRowModifiers3;
                                    function37 = function36;
                                    z13 = z9;
                                    z14 = z1622;
                                    function38 = function35;
                                }
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        i9 = i8;
                        i10 = i2 & 256;
                        if (i10 != 0) {
                        }
                        i11 = i10;
                        if ((i3 & 38347923) != 38347922) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    z5 = z;
                    i7 = i2 & 64;
                    if (i7 != 0) {
                    }
                    i8 = i2 & 128;
                    if (i8 != 0) {
                    }
                    i9 = i8;
                    i10 = i2 & 256;
                    if (i10 != 0) {
                    }
                    i11 = i10;
                    if ((i3 & 38347923) != 38347922) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                function34 = function32;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                z5 = z;
                i7 = i2 & 64;
                if (i7 != 0) {
                }
                i8 = i2 & 128;
                if (i8 != 0) {
                }
                i9 = i8;
                i10 = i2 & 256;
                if (i10 != 0) {
                }
                i11 = i10;
                if ((i3 & 38347923) != 38347922) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            function33 = function3;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            function34 = function32;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            z5 = z;
            i7 = i2 & 64;
            if (i7 != 0) {
            }
            i8 = i2 & 128;
            if (i8 != 0) {
            }
            i9 = i8;
            i10 = i2 & 256;
            if (i10 != 0) {
            }
            i11 = i10;
            if ((i3 & 38347923) != 38347922) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        function33 = function3;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        function34 = function32;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        z5 = z;
        i7 = i2 & 64;
        if (i7 != 0) {
        }
        i8 = i2 & 128;
        if (i8 != 0) {
        }
        i9 = i8;
        i10 = i2 & 256;
        if (i10 != 0) {
        }
        i11 = i10;
        if ((i3 & 38347923) != 38347922) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiCursorDataHeader$lambda$3$lambda$2$lambda$1(SduiActionHandler sduiActionHandler, DeeplinkAction deeplinkAction) {
        sduiActionHandler.mo15941handle(new GenericAction.Deeplink(deeplinkAction));
        return Unit.INSTANCE;
    }

    public static final void SduiLabelTrack(final Modifier modifier, final Point point, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1995968502);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(point) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1995968502, i3, -1, "com.robinhood.android.sdui.chartgroup.SduiLabelTrack (SduiCursorData.kt:108)");
            }
            com.robinhood.models.serverdriven.experimental.api.CursorData cursor_data = point != null ? point.getCursor_data() : null;
            composerStartRestartGroup.startReplaceGroup(-1724645239);
            com.robinhood.android.charts.cursor.CursorData composableModel = cursor_data == null ? null : toComposableModel(cursor_data, composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceGroup();
            CursorData.DisplayText label = composableModel != null ? composableModel.getLabel() : null;
            Float fValueOf = point != null ? Float.valueOf(point.getX()) : null;
            int i5 = (i3 & 14) | (CursorData.DisplayText.$stable << 3);
            Modifier modifier2 = modifier;
            ChartLabelTrack.ChartLabelTrack(modifier2, label, fValueOf, composerStartRestartGroup, i5, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.sdui.chartgroup.SduiCursorDataKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiCursorData2.SduiLabelTrack$lambda$5(modifier, point, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
