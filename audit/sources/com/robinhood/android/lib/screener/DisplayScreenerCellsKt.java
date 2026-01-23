package com.robinhood.android.lib.screener;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.draw.Rotate;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.LayoutModifier4;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.TextUnit;
import androidx.compose.p011ui.unit.TextUnit2;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import bonfire.proto.idl.margin.p036v1.MaintenanceTableAction;
import bonfire.proto.idl.margin.p036v1.MaintenanceTableActionDto;
import com.robinhood.android.generic.table.DisplayDetails;
import com.robinhood.android.lib.screener.ScreenTableCells;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiComponent3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiComponentIdl;
import com.robinhood.android.onedaycharts.OneDayMiniChart;
import com.robinhood.android.onedaycharts.OneDayMiniChartDetails;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.onedaycharts.api.InstrumentType;
import com.robinhood.models.serverdriven.experimental.api.TableColumnHeader;
import com.robinhood.models.serverdriven.experimental.api.TableInstrumentName;
import com.robinhood.models.serverdriven.experimental.api.TableSparklineItem;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.utils.extensions.StringsKt;
import com.squareup.wire.AnyMessage;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import rh_server_driven_ui.p531v1.ActionDto;
import rh_server_driven_ui.p531v1.UIComponentDto;

/* compiled from: DisplayScreenerCells.kt */
@Metadata(m3635d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0087\u0001\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u000526\u0010\u000f\u001a2\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001aq\u0010\u0019\u001a\u00020\u000e2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u001626\u0010\u000f\u001a2\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a5\u0010\u001f\u001a\u00020\u000e2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u001bH\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001a#\u0010\"\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u001bH\u0003¢\u0006\u0004\b \u0010!\u001a+\u0010&\u001a\u00020\u000e2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020#H\u0003¢\u0006\u0004\b$\u0010%\u001a+\u0010(\u001a\u00020\u000e2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020#H\u0003¢\u0006\u0004\b'\u0010%\u001a7\u0010-\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010*\u001a\u0006\u0012\u0002\b\u00030)2\b\b\u0002\u0010\u001c\u001a\u00020\u001bH\u0003¢\u0006\u0004\b+\u0010,\u001a9\u00100\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00102\b\b\u0002\u0010\u001c\u001a\u00020\u001bH\u0003¢\u0006\u0004\b.\u0010/\u001a\u001b\u00102\u001a\u00020\u000e2\n\u00101\u001a\u0006\u0012\u0002\b\u00030)H\u0003¢\u0006\u0004\b2\u00103\u001a+\u00106\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020#2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u001bH\u0003¢\u0006\u0004\b4\u00105\u001a\u007f\u0010B\u001a\u00020\u000e2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u00107\u001a\u00020\b2\b\b\u0002\u00108\u001a\u00020\b2\b\b\u0002\u0010:\u001a\u0002092\u0019\b\u0002\u0010>\u001a\u0013\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020\u000e0;¢\u0006\u0002\b=2\u0017\u0010?\u001a\u0013\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020\u000e0;¢\u0006\u0002\b=H\u0003¢\u0006\u0004\b@\u0010A\u001a+\u0010(\u001a\u00020\u000e2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020CH\u0003¢\u0006\u0004\b'\u0010D\u001a+\u0010&\u001a\u00020\u000e2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020CH\u0003¢\u0006\u0004\b$\u0010D\u001a\u0017\u0010E\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020CH\u0003¢\u0006\u0004\bE\u0010F\u001a+\u0010J\u001a\u00020\u000e2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020GH\u0003¢\u0006\u0004\bH\u0010I\"\u0014\u0010K\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010L¨\u0006O²\u0006\u000e\u0010N\u001a\u00020M8\n@\nX\u008a\u008e\u0002"}, m3636d2 = {"Lcom/robinhood/android/lib/screener/ScreenerTableCells;", "cell", "Landroidx/compose/ui/unit/Dp;", "height", "width", "Lcom/robinhood/android/generic/table/DisplayDetails;", "displayDetails", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "isInstrumentInUserLists", "Ljava/util/UUID;", "id", "", "onWatchlistToggled", "Lkotlin/Function0;", "onDataDisplayClicked", "onScrollToStart", "DisplayScreenerCell-wYrrvMY", "(Lcom/robinhood/android/lib/screener/ScreenerTableCells;Landroidx/compose/ui/unit/Dp;Landroidx/compose/ui/unit/Dp;Lcom/robinhood/android/generic/table/DisplayDetails;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "DisplayScreenerCell", "Lcom/robinhood/android/lib/screener/ScreenerTableCells$Icon;", "IconCell-MR7ei9I", "(Landroidx/compose/ui/unit/Dp;Landroidx/compose/ui/unit/Dp;Lcom/robinhood/android/lib/screener/ScreenerTableCells$Icon;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "IconCell", "Lcom/robinhood/android/lib/screener/ScreenerTableCells$Index;", "Landroidx/compose/ui/Modifier;", "modifier", "IndexCell-MR7ei9I", "(Landroidx/compose/ui/unit/Dp;Landroidx/compose/ui/unit/Dp;Lcom/robinhood/android/lib/screener/ScreenerTableCells$Index;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "IndexCell", "EmptyCell-B-JOX-Q", "(Landroidx/compose/ui/unit/Dp;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "EmptyCell", "Lcom/robinhood/android/lib/screener/ScreenerTableCells$Sdui;", "SduiCell-4Mhb2_g", "(Landroidx/compose/ui/unit/Dp;Landroidx/compose/ui/unit/Dp;Lcom/robinhood/android/lib/screener/ScreenerTableCells$Sdui;Landroidx/compose/runtime/Composer;I)V", "SduiCell", "ColumnHeader-4Mhb2_g", "ColumnHeader", "Lcom/robinhood/models/serverdriven/experimental/api/TableInstrumentName;", "component", "StickyColumnCell-ckAXlIo", "(FLandroidx/compose/ui/unit/Dp;Lcom/robinhood/models/serverdriven/experimental/api/TableInstrumentName;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "StickyColumnCell", "StickyColumnHeader-ckAXlIo", "(FLandroidx/compose/ui/unit/Dp;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "StickyColumnHeader", "it", "StickyPill", "(Lcom/robinhood/models/serverdriven/experimental/api/TableInstrumentName;Landroidx/compose/runtime/Composer;I)V", "DisplaySduiCells-q2EtPuw", "(Lcom/robinhood/android/lib/screener/ScreenerTableCells$Sdui;Landroidx/compose/ui/unit/Dp;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "DisplaySduiCells", "selected", "showBackground", "Landroidx/compose/ui/Alignment;", "contentAlignment", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/BoxScope;", "Lkotlin/ExtensionFunctionType;", "bottomDivider", "content", "ScreenerBaseCell-YSa8QY0", "(Landroidx/compose/ui/unit/Dp;Landroidx/compose/ui/unit/Dp;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "ScreenerBaseCell", "Lcom/robinhood/android/lib/screener/ScreenerTableCells$SduiDto;", "(Landroidx/compose/ui/unit/Dp;Landroidx/compose/ui/unit/Dp;Lcom/robinhood/android/lib/screener/ScreenerTableCells$SduiDto;Landroidx/compose/runtime/Composer;I)V", "DisplaySduiDtoCells", "(Lcom/robinhood/android/lib/screener/ScreenerTableCells$SduiDto;Landroidx/compose/runtime/Composer;I)V", "Lcom/robinhood/android/lib/screener/ScreenerTableCells$RowStart;", "RowStart-4Mhb2_g", "(Landroidx/compose/ui/unit/Dp;Landroidx/compose/ui/unit/Dp;Lcom/robinhood/android/lib/screener/ScreenerTableCells$RowStart;Landroidx/compose/runtime/Composer;I)V", "RowStart", "stickyPillSize", "F", "Landroidx/compose/ui/text/TextStyle;", "pillTextStyle", "feature-lib-screener_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class DisplayScreenerCellsKt {
    private static final float stickyPillSize = C2002Dp.m7995constructorimpl(52);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ColumnHeader_4Mhb2_g$lambda$28(C2002Dp c2002Dp, C2002Dp c2002Dp2, ScreenTableCells.SduiDto sduiDto, int i, Composer composer, int i2) {
        m15869ColumnHeader4Mhb2_g(c2002Dp, c2002Dp2, sduiDto, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ColumnHeader_4Mhb2_g$lambda$5(C2002Dp c2002Dp, C2002Dp c2002Dp2, ScreenTableCells.Sdui sdui, int i, Composer composer, int i2) {
        m15868ColumnHeader4Mhb2_g(c2002Dp, c2002Dp2, sdui, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DisplayScreenerCell_wYrrvMY$lambda$0(ScreenTableCells screenTableCells, C2002Dp c2002Dp, C2002Dp c2002Dp2, DisplayDetails displayDetails, Function2 function2, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        m15870DisplayScreenerCellwYrrvMY(screenTableCells, c2002Dp, c2002Dp2, displayDetails, function2, function0, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DisplaySduiCells_q2EtPuw$lambda$23(ScreenTableCells.Sdui sdui, C2002Dp c2002Dp, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m15871DisplaySduiCellsq2EtPuw(sdui, c2002Dp, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DisplaySduiDtoCells$lambda$33(ScreenTableCells.SduiDto sduiDto, int i, Composer composer, int i2) {
        DisplaySduiDtoCells(sduiDto, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EmptyCell_B_JOX_Q$lambda$3(C2002Dp c2002Dp, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m15872EmptyCellBJOXQ(c2002Dp, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IconCell_MR7ei9I$lambda$1(C2002Dp c2002Dp, C2002Dp c2002Dp2, ScreenTableCells.Icon icon, Function2 function2, Function0 function0, int i, Composer composer, int i2) {
        m15873IconCellMR7ei9I(c2002Dp, c2002Dp2, icon, function2, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IndexCell_MR7ei9I$lambda$2(C2002Dp c2002Dp, C2002Dp c2002Dp2, ScreenTableCells.Index index, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m15874IndexCellMR7ei9I(c2002Dp, c2002Dp2, index, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RowStart_4Mhb2_g$lambda$34(C2002Dp c2002Dp, C2002Dp c2002Dp2, ScreenTableCells.RowStart rowStart, int i, Composer composer, int i2) {
        m15875RowStart4Mhb2_g(c2002Dp, c2002Dp2, rowStart, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScreenerBaseCell_YSa8QY0$lambda$27(C2002Dp c2002Dp, C2002Dp c2002Dp2, Modifier modifier, boolean z, boolean z2, Alignment alignment, Function3 function3, Function3 function32, int i, int i2, Composer composer, int i3) {
        m15876ScreenerBaseCellYSa8QY0(c2002Dp, c2002Dp2, modifier, z, z2, alignment, function3, function32, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiCell_4Mhb2_g$lambda$29(C2002Dp c2002Dp, C2002Dp c2002Dp2, ScreenTableCells.SduiDto sduiDto, int i, Composer composer, int i2) {
        m15878SduiCell4Mhb2_g(c2002Dp, c2002Dp2, sduiDto, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiCell_4Mhb2_g$lambda$4(C2002Dp c2002Dp, C2002Dp c2002Dp2, ScreenTableCells.Sdui sdui, int i, Composer composer, int i2) {
        m15877SduiCell4Mhb2_g(c2002Dp, c2002Dp2, sdui, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StickyColumnCell_ckAXlIo$lambda$7(float f, C2002Dp c2002Dp, TableInstrumentName tableInstrumentName, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m15879StickyColumnCellckAXlIo(f, c2002Dp, tableInstrumentName, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StickyColumnHeader_ckAXlIo$lambda$9(float f, C2002Dp c2002Dp, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m15880StickyColumnHeaderckAXlIo(f, c2002Dp, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StickyPill$lambda$20(TableInstrumentName tableInstrumentName, int i, Composer composer, int i2) {
        StickyPill(tableInstrumentName, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x031f  */
    /* renamed from: DisplayScreenerCell-wYrrvMY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m15870DisplayScreenerCellwYrrvMY(final ScreenTableCells cell, C2002Dp c2002Dp, C2002Dp c2002Dp2, final DisplayDetails displayDetails, final Function2<? super Boolean, ? super UUID, Unit> onWatchlistToggled, final Function0<Unit> onDataDisplayClicked, final Function0<Unit> onScrollToStart, Composer composer, final int i) {
        int i2;
        C2002Dp c2002Dp3;
        C2002Dp c2002Dp4 = c2002Dp;
        Intrinsics.checkNotNullParameter(cell, "cell");
        Intrinsics.checkNotNullParameter(displayDetails, "displayDetails");
        Intrinsics.checkNotNullParameter(onWatchlistToggled, "onWatchlistToggled");
        Intrinsics.checkNotNullParameter(onDataDisplayClicked, "onDataDisplayClicked");
        Intrinsics.checkNotNullParameter(onScrollToStart, "onScrollToStart");
        Composer composerStartRestartGroup = composer.startRestartGroup(1411775465);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(cell) : composerStartRestartGroup.changedInstance(cell) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(c2002Dp4) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(c2002Dp2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(displayDetails) : composerStartRestartGroup.changedInstance(displayDetails) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onWatchlistToggled) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onDataDisplayClicked) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onScrollToStart) ? 1048576 : 524288;
        }
        if ((599187 & i2) == 599186 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            c2002Dp3 = c2002Dp2;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1411775465, i2, -1, "com.robinhood.android.lib.screener.DisplayScreenerCell (DisplayScreenerCells.kt:64)");
            }
            if (cell instanceof ScreenTableCells.Sdui) {
                composerStartRestartGroup.startReplaceGroup(1883486858);
                composerStartRestartGroup.startReplaceGroup(1883499754);
                ScreenTableCells.Sdui sdui = (ScreenTableCells.Sdui) cell;
                boolean z = (sdui.getComponent() instanceof TableColumnHeader) && displayDetails.getColumnIndex() == 1 && c2002Dp2 != null && C2002Dp.m7994compareTo0680j_4(c2002Dp2.getValue(), C2002Dp.m7995constructorimpl(stickyPillSize + C2002Dp.m7995constructorimpl(BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM() + C2002Dp.m7995constructorimpl((float) 1)))) <= 0;
                composerStartRestartGroup.endReplaceGroup();
                if (z) {
                    composerStartRestartGroup.startReplaceGroup(-493424899);
                    m15880StickyColumnHeaderckAXlIo(c2002Dp2.getValue(), c2002Dp4, onScrollToStart, null, composerStartRestartGroup, ((i2 >> 6) & 14) | (i2 & 112) | ((i2 >> 12) & 896), 8);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (sdui.getComponent() instanceof TableColumnHeader) {
                    composerStartRestartGroup.startReplaceGroup(-493417366);
                    m15868ColumnHeader4Mhb2_g(c2002Dp2, c2002Dp4, sdui, composerStartRestartGroup, ((i2 >> 6) & 14) | (i2 & 112));
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(1883984811);
                    boolean z2 = (sdui.getComponent() instanceof TableInstrumentName) && c2002Dp2 != null && C2002Dp.m7994compareTo0680j_4(c2002Dp2.getValue(), C2002Dp.m7995constructorimpl(stickyPillSize + C2002Dp.m7995constructorimpl(BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM() + C2002Dp.m7995constructorimpl((float) 1)))) <= 0;
                    composerStartRestartGroup.endReplaceGroup();
                    if (z2) {
                        composerStartRestartGroup.startReplaceGroup(-493410284);
                        m15879StickyColumnCellckAXlIo(c2002Dp2.getValue(), c2002Dp4, (TableInstrumentName) sdui.getComponent(), null, composerStartRestartGroup, ((i2 >> 6) & 14) | (i2 & 112), 8);
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-493404122);
                        m15877SduiCell4Mhb2_g(c2002Dp2, c2002Dp4, sdui, composerStartRestartGroup, ((i2 >> 6) & 14) | (i2 & 112));
                        composerStartRestartGroup.endReplaceGroup();
                    }
                }
                composerStartRestartGroup.endReplaceGroup();
            } else if (cell instanceof ScreenTableCells.SduiDto) {
                composerStartRestartGroup.startReplaceGroup(1884459700);
                composerStartRestartGroup.startReplaceGroup(-493398952);
                ScreenTableCells.SduiDto sduiDto = (ScreenTableCells.SduiDto) cell;
                boolean z3 = (sduiDto.getComponent() instanceof UIComponentDto.ConcreteDto.TableColumnHeader) && displayDetails.getColumnIndex() == 1 && c2002Dp2 != null && C2002Dp.m7994compareTo0680j_4(c2002Dp2.getValue(), C2002Dp.m7995constructorimpl(stickyPillSize + C2002Dp.m7995constructorimpl(BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM() + C2002Dp.m7995constructorimpl((float) 1)))) <= 0;
                composerStartRestartGroup.endReplaceGroup();
                if (z3) {
                    composerStartRestartGroup.startReplaceGroup(-493390675);
                    m15880StickyColumnHeaderckAXlIo(c2002Dp2.getValue(), c2002Dp4, onScrollToStart, null, composerStartRestartGroup, ((i2 >> 6) & 14) | (i2 & 112) | ((i2 >> 12) & 896), 8);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (sduiDto.getComponent() instanceof UIComponentDto.ConcreteDto.TableColumnHeader) {
                    composerStartRestartGroup.startReplaceGroup(-493382198);
                    m15869ColumnHeader4Mhb2_g(c2002Dp2, c2002Dp4, sduiDto, composerStartRestartGroup, ((i2 >> 6) & 14) | (i2 & 112));
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-493378010);
                    m15878SduiCell4Mhb2_g(c2002Dp2, c2002Dp4, sduiDto, composerStartRestartGroup, ((i2 >> 6) & 14) | (i2 & 112));
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (cell instanceof ScreenTableCells.Index) {
                    composerStartRestartGroup.startReplaceGroup(-493375001);
                    m15874IndexCellMR7ei9I(c2002Dp2, c2002Dp4, (ScreenTableCells.Index) cell, null, composerStartRestartGroup, ((i2 >> 6) & 14) | (i2 & 112), 8);
                    composerStartRestartGroup.endReplaceGroup();
                    c2002Dp4 = c2002Dp;
                    c2002Dp3 = c2002Dp2;
                } else if (cell instanceof ScreenTableCells.Icon) {
                    composerStartRestartGroup.startReplaceGroup(-493372581);
                    int i3 = i2 >> 3;
                    int i4 = ((i2 >> 6) & 14) | (i2 & 112) | (BentoIcon4.$stable << 6) | (i3 & 7168) | (i3 & 57344);
                    c2002Dp4 = c2002Dp;
                    c2002Dp3 = c2002Dp2;
                    m15873IconCellMR7ei9I(c2002Dp3, c2002Dp4, (ScreenTableCells.Icon) cell, onWatchlistToggled, onDataDisplayClicked, composerStartRestartGroup, i4);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    c2002Dp4 = c2002Dp;
                    c2002Dp3 = c2002Dp2;
                    if (cell instanceof ScreenTableCells.Empty) {
                        composerStartRestartGroup.startReplaceGroup(-493364742);
                        m15872EmptyCellBJOXQ(c2002Dp4, null, composerStartRestartGroup, (i2 >> 3) & 14, 2);
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        if (!(cell instanceof ScreenTableCells.RowStart)) {
                            composerStartRestartGroup.startReplaceGroup(-493432026);
                            composerStartRestartGroup.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composerStartRestartGroup.startReplaceGroup(-493362778);
                        m15875RowStart4Mhb2_g(c2002Dp3, c2002Dp4, (ScreenTableCells.RowStart) cell, composerStartRestartGroup, ((i2 >> 6) & 14) | (i2 & 112));
                        composerStartRestartGroup.endReplaceGroup();
                    }
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            c2002Dp3 = c2002Dp2;
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final C2002Dp c2002Dp5 = c2002Dp4;
            final C2002Dp c2002Dp6 = c2002Dp3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.lib.screener.DisplayScreenerCellsKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DisplayScreenerCellsKt.DisplayScreenerCell_wYrrvMY$lambda$0(cell, c2002Dp5, c2002Dp6, displayDetails, onWatchlistToggled, onDataDisplayClicked, onScrollToStart, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final TextStyle StickyPill$lambda$11(SnapshotState<TextStyle> snapshotState) {
        return snapshotState.getValue();
    }

    /* renamed from: IconCell-MR7ei9I, reason: not valid java name */
    private static final void m15873IconCellMR7ei9I(final C2002Dp c2002Dp, final C2002Dp c2002Dp2, final ScreenTableCells.Icon icon, final Function2<? super Boolean, ? super UUID, Unit> function2, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1850850164);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(c2002Dp) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(c2002Dp2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? composerStartRestartGroup.changed(icon) : composerStartRestartGroup.changedInstance(icon) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if ((i2 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1850850164, i2, -1, "com.robinhood.android.lib.screener.IconCell (DisplayScreenerCells.kt:135)");
            }
            m15876ScreenerBaseCellYSa8QY0(c2002Dp, c2002Dp2, null, false, false, Alignment.INSTANCE.getCenter(), null, ComposableLambda3.rememberComposableLambda(-1389539235, true, new DisplayScreenerCellsKt$IconCell$1(c2002Dp, icon, function2, function0), composerStartRestartGroup, 54), composerStartRestartGroup, (i2 & 14) | 12779520 | (i2 & 112), 92);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.lib.screener.DisplayScreenerCellsKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DisplayScreenerCellsKt.IconCell_MR7ei9I$lambda$1(c2002Dp, c2002Dp2, icon, function2, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* renamed from: IndexCell-MR7ei9I, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m15874IndexCellMR7ei9I(final C2002Dp c2002Dp, final C2002Dp c2002Dp2, final ScreenTableCells.Index index, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-459282189);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(c2002Dp) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(c2002Dp2) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(index) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                final Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-459282189, i3, -1, "com.robinhood.android.lib.screener.IndexCell (DisplayScreenerCells.kt:180)");
                }
                m15876ScreenerBaseCellYSa8QY0(c2002Dp, c2002Dp2, null, false, false, Alignment.INSTANCE.getCenter(), null, ComposableLambda3.rememberComposableLambda(-1501398550, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.lib.screener.DisplayScreenerCellsKt$IndexCell$1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer2, Integer num) {
                        invoke(boxScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BoxScope ScreenerBaseCell, Composer composer2, int i5) {
                        Intrinsics.checkNotNullParameter(ScreenerBaseCell, "$this$ScreenerBaseCell");
                        if ((i5 & 17) == 16 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1501398550, i5, -1, "com.robinhood.android.lib.screener.IndexCell.<anonymous> (DisplayScreenerCells.kt:186)");
                        }
                        composer2.startReplaceGroup(265006690);
                        Modifier modifierM5142padding3ABfNKs = modifier4;
                        if (c2002Dp == null) {
                            modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(modifierM5142padding3ABfNKs, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21590getDefaultD9Ej5fM());
                        }
                        composer2.endReplaceGroup();
                        BentoText2.m20747BentoText38GnDrw(String.valueOf(index.getIndex() + 1), modifierM5142padding3ABfNKs, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer2, 0, 0, 16380);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, (i3 & 14) | 12779520 | (i3 & 112), 92);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.lib.screener.DisplayScreenerCellsKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return DisplayScreenerCellsKt.IndexCell_MR7ei9I$lambda$2(c2002Dp, c2002Dp2, index, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            m15876ScreenerBaseCellYSa8QY0(c2002Dp, c2002Dp2, null, false, false, Alignment.INSTANCE.getCenter(), null, ComposableLambda3.rememberComposableLambda(-1501398550, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.lib.screener.DisplayScreenerCellsKt$IndexCell$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer2, Integer num) {
                    invoke(boxScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BoxScope ScreenerBaseCell, Composer composer2, int i5) {
                    Intrinsics.checkNotNullParameter(ScreenerBaseCell, "$this$ScreenerBaseCell");
                    if ((i5 & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1501398550, i5, -1, "com.robinhood.android.lib.screener.IndexCell.<anonymous> (DisplayScreenerCells.kt:186)");
                    }
                    composer2.startReplaceGroup(265006690);
                    Modifier modifierM5142padding3ABfNKs = modifier4;
                    if (c2002Dp == null) {
                        modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(modifierM5142padding3ABfNKs, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21590getDefaultD9Ej5fM());
                    }
                    composer2.endReplaceGroup();
                    BentoText2.m20747BentoText38GnDrw(String.valueOf(index.getIndex() + 1), modifierM5142padding3ABfNKs, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer2, 0, 0, 16380);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i3 & 14) | 12779520 | (i3 & 112), 92);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier4;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* renamed from: EmptyCell-B-JOX-Q, reason: not valid java name */
    private static final void m15872EmptyCellBJOXQ(final C2002Dp c2002Dp, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-938224874);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(c2002Dp) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-938224874, i3, -1, "com.robinhood.android.lib.screener.EmptyCell (DisplayScreenerCells.kt:199)");
            }
            int i5 = i3 << 3;
            int i6 = (i5 & 112) | 12607494 | (i5 & 896);
            modifier2 = modifier3;
            m15876ScreenerBaseCellYSa8QY0(C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(12)), c2002Dp, modifier2, false, false, null, null, ComposableSingletons$DisplayScreenerCellsKt.INSTANCE.getLambda$1178009663$feature_lib_screener_externalDebug(), composerStartRestartGroup, i6, 104);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.lib.screener.DisplayScreenerCellsKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DisplayScreenerCellsKt.EmptyCell_B_JOX_Q$lambda$3(c2002Dp, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: SduiCell-4Mhb2_g, reason: not valid java name */
    private static final void m15877SduiCell4Mhb2_g(final C2002Dp c2002Dp, final C2002Dp c2002Dp2, final ScreenTableCells.Sdui sdui, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-744204466);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(c2002Dp) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(c2002Dp2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(sdui) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-744204466, i2, -1, "com.robinhood.android.lib.screener.SduiCell (DisplayScreenerCells.kt:213)");
            }
            m15876ScreenerBaseCellYSa8QY0(c2002Dp, c2002Dp2, null, false, false, ColumnAlignment2.toBoxAlignment(sdui.getAlignment()), null, ComposableLambda3.rememberComposableLambda(-1546470729, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.lib.screener.DisplayScreenerCellsKt$SduiCell$1
                public final void invoke(BoxScope ScreenerBaseCell, Composer composer2, int i3) {
                    Intrinsics.checkNotNullParameter(ScreenerBaseCell, "$this$ScreenerBaseCell");
                    if ((i3 & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1546470729, i3, -1, "com.robinhood.android.lib.screener.SduiCell.<anonymous> (DisplayScreenerCells.kt:219)");
                    }
                    composer2.startReplaceGroup(-99675773);
                    Modifier.Companion companion = Modifier.INSTANCE;
                    C2002Dp c2002DpM15890getMaxWidthlTKBWiU = sdui.m15890getMaxWidthlTKBWiU();
                    Modifier modifierM5173sizeInqDBjuR0$default = SizeKt.m5173sizeInqDBjuR0$default(companion, 0.0f, 0.0f, c2002DpM15890getMaxWidthlTKBWiU != null ? c2002DpM15890getMaxWidthlTKBWiU.getValue() : C2002Dp.INSTANCE.m8003getInfinityD9Ej5fM(), 0.0f, 11, null);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i4 = BentoTheme.$stable;
                    Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(modifierM5173sizeInqDBjuR0$default, bentoTheme.getSpacing(composer2, i4).m21593getSmallD9Ej5fM());
                    if (c2002Dp == null) {
                        modifierM5142padding3ABfNKs = PaddingKt.m5144paddingVpY3zN4$default(modifierM5142padding3ABfNKs, bentoTheme.getSpacing(composer2, i4).m21595getXsmallD9Ej5fM(), 0.0f, 2, null);
                    }
                    composer2.endReplaceGroup();
                    Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                    ScreenTableCells.Sdui sdui2 = sdui;
                    C2002Dp c2002Dp3 = c2002Dp;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(center, Alignment.INSTANCE.getStart(), composer2, 6);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM5142padding3ABfNKs);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    DisplayScreenerCellsKt.m15871DisplaySduiCellsq2EtPuw(sdui2, c2002Dp3, null, composer2, 0, 4);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer2, Integer num) {
                    invoke(boxScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i2 & 14) | 12582912 | (i2 & 112), 92);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.lib.screener.DisplayScreenerCellsKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DisplayScreenerCellsKt.SduiCell_4Mhb2_g$lambda$4(c2002Dp, c2002Dp2, sdui, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: ColumnHeader-4Mhb2_g, reason: not valid java name */
    private static final void m15868ColumnHeader4Mhb2_g(final C2002Dp c2002Dp, final C2002Dp c2002Dp2, final ScreenTableCells.Sdui sdui, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1678689322);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(c2002Dp) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(c2002Dp2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(sdui) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1678689322, i2, -1, "com.robinhood.android.lib.screener.ColumnHeader (DisplayScreenerCells.kt:241)");
            }
            Alignment boxAlignment = ColumnAlignment2.toBoxAlignment(sdui.getAlignment());
            UIComponent<?> component = sdui.getComponent();
            Intrinsics.checkNotNull(component, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.TableColumnHeader<*>");
            m15876ScreenerBaseCellYSa8QY0(c2002Dp, c2002Dp2, null, ((TableColumnHeader) component).getActive(), false, boxAlignment, null, ComposableLambda3.rememberComposableLambda(-434418925, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.lib.screener.DisplayScreenerCellsKt$ColumnHeader$1
                public final void invoke(BoxScope ScreenerBaseCell, Composer composer2, int i3) {
                    int i4;
                    Composer composer3 = composer2;
                    Intrinsics.checkNotNullParameter(ScreenerBaseCell, "$this$ScreenerBaseCell");
                    if ((i3 & 6) == 0) {
                        i4 = i3 | (composer3.changed(ScreenerBaseCell) ? 4 : 2);
                    } else {
                        i4 = i3;
                    }
                    if ((i4 & 19) == 18 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-434418925, i4, -1, "com.robinhood.android.lib.screener.ColumnHeader.<anonymous> (DisplayScreenerCells.kt:248)");
                    }
                    composer3.startReplaceGroup(-864758702);
                    if (c2002Dp != null) {
                        BentoDivider.m20635BentoHorizontalDivideraMcp0Q(ScreenerBaseCell.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopCenter()), BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21373getBg30d7_KjU(), 0.0f, composer2, 0, 4);
                        composer3 = composer2;
                    }
                    composer3.endReplaceGroup();
                    Modifier.Companion companion = Modifier.INSTANCE;
                    C2002Dp c2002DpM15890getMaxWidthlTKBWiU = sdui.m15890getMaxWidthlTKBWiU();
                    Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.m5173sizeInqDBjuR0$default(companion, 0.0f, 0.0f, c2002DpM15890getMaxWidthlTKBWiU != null ? c2002DpM15890getMaxWidthlTKBWiU.getValue() : C2002Dp.INSTANCE.m8003getInfinityD9Ej5fM(), 0.0f, 11, null), BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 0.0f, 2, null);
                    Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                    ScreenTableCells.Sdui sdui2 = sdui;
                    C2002Dp c2002Dp3 = c2002Dp;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(center, Alignment.INSTANCE.getStart(), composer3, 6);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM5144paddingVpY3zN4$default);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    DisplayScreenerCellsKt.m15871DisplaySduiCellsq2EtPuw(sdui2, c2002Dp3, null, composer3, 0, 4);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer2, Integer num) {
                    invoke(boxScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i2 & 14) | 12582912 | (i2 & 112), 84);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.lib.screener.DisplayScreenerCellsKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DisplayScreenerCellsKt.ColumnHeader_4Mhb2_g$lambda$5(c2002Dp, c2002Dp2, sdui, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* renamed from: StickyColumnCell-ckAXlIo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m15879StickyColumnCellckAXlIo(final float f, final C2002Dp c2002Dp, final TableInstrumentName<?> tableInstrumentName, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        C2002Dp c2002Dp2;
        Modifier modifier2;
        float f2;
        Modifier modifier3;
        Modifier modifierM5125offsetVpY3zN4$default;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1250920950);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            c2002Dp2 = c2002Dp;
        } else {
            c2002Dp2 = c2002Dp;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(c2002Dp2) ? 32 : 16;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(tableInstrumentName) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier5 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1250920950, i3, -1, "com.robinhood.android.lib.screener.StickyColumnCell (DisplayScreenerCells.kt:273)");
                }
                f2 = stickyPillSize;
                if (C2002Dp.m7994compareTo0680j_4(f, f2) >= 0) {
                    modifier3 = modifier5;
                    modifierM5125offsetVpY3zN4$default = modifier3;
                } else {
                    modifierM5125offsetVpY3zN4$default = OffsetKt.m5125offsetVpY3zN4$default(modifier5, C2002Dp.m7995constructorimpl(-C2002Dp.m7995constructorimpl(f2 - f)), 0.0f, 2, null);
                    modifier3 = modifier5;
                }
                m15876ScreenerBaseCellYSa8QY0(C2002Dp.m7993boximpl(f), c2002Dp2, modifierM5125offsetVpY3zN4$default, false, false, null, null, ComposableLambda3.rememberComposableLambda(1489958259, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.lib.screener.DisplayScreenerCellsKt$StickyColumnCell$2
                    public final void invoke(BoxScope ScreenerBaseCell, Composer composer2, int i5) {
                        Intrinsics.checkNotNullParameter(ScreenerBaseCell, "$this$ScreenerBaseCell");
                        if ((i5 & 17) == 16 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1489958259, i5, -1, "com.robinhood.android.lib.screener.StickyColumnCell.<anonymous> (DisplayScreenerCells.kt:282)");
                        }
                        Modifier modifierM5166requiredWidth3ABfNKs = SizeKt.m5166requiredWidth3ABfNKs(Modifier.INSTANCE, DisplayScreenerCellsKt.stickyPillSize);
                        Alignment centerEnd = Alignment.INSTANCE.getCenterEnd();
                        TableInstrumentName<?> tableInstrumentName2 = tableInstrumentName;
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(centerEnd, false);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM5166requiredWidth3ABfNKs);
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                        if (composer2.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        DisplayScreenerCellsKt.StickyPill(tableInstrumentName2, composer2, 0);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer2, Integer num) {
                        invoke(boxScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, (i3 & 14) | 12582912 | (i3 & 112), 120);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.lib.screener.DisplayScreenerCellsKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return DisplayScreenerCellsKt.StickyColumnCell_ckAXlIo$lambda$7(f, c2002Dp, tableInstrumentName, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            f2 = stickyPillSize;
            if (C2002Dp.m7994compareTo0680j_4(f, f2) >= 0) {
            }
            m15876ScreenerBaseCellYSa8QY0(C2002Dp.m7993boximpl(f), c2002Dp2, modifierM5125offsetVpY3zN4$default, false, false, null, null, ComposableLambda3.rememberComposableLambda(1489958259, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.lib.screener.DisplayScreenerCellsKt$StickyColumnCell$2
                public final void invoke(BoxScope ScreenerBaseCell, Composer composer2, int i5) {
                    Intrinsics.checkNotNullParameter(ScreenerBaseCell, "$this$ScreenerBaseCell");
                    if ((i5 & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1489958259, i5, -1, "com.robinhood.android.lib.screener.StickyColumnCell.<anonymous> (DisplayScreenerCells.kt:282)");
                    }
                    Modifier modifierM5166requiredWidth3ABfNKs = SizeKt.m5166requiredWidth3ABfNKs(Modifier.INSTANCE, DisplayScreenerCellsKt.stickyPillSize);
                    Alignment centerEnd = Alignment.INSTANCE.getCenterEnd();
                    TableInstrumentName<?> tableInstrumentName2 = tableInstrumentName;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(centerEnd, false);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM5166requiredWidth3ABfNKs);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    DisplayScreenerCellsKt.StickyPill(tableInstrumentName2, composer2, 0);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer2, Integer num) {
                    invoke(boxScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i3 & 14) | 12582912 | (i3 & 112), 120);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier4 = modifier3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* renamed from: StickyColumnHeader-ckAXlIo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m15880StickyColumnHeaderckAXlIo(final float f, final C2002Dp c2002Dp, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        C2002Dp c2002Dp2;
        Modifier modifier2;
        float f2;
        Modifier modifier3;
        Modifier modifierM5125offsetVpY3zN4$default;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-304229171);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            c2002Dp2 = c2002Dp;
        } else {
            c2002Dp2 = c2002Dp;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(c2002Dp2) ? 32 : 16;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier5 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-304229171, i3, -1, "com.robinhood.android.lib.screener.StickyColumnHeader (DisplayScreenerCells.kt:298)");
                }
                f2 = stickyPillSize;
                if (C2002Dp.m7994compareTo0680j_4(f, f2) >= 0) {
                    modifier3 = modifier5;
                    modifierM5125offsetVpY3zN4$default = modifier3;
                } else {
                    modifierM5125offsetVpY3zN4$default = OffsetKt.m5125offsetVpY3zN4$default(modifier5, C2002Dp.m7995constructorimpl(-C2002Dp.m7995constructorimpl(f2 - f)), 0.0f, 2, null);
                    modifier3 = modifier5;
                }
                m15876ScreenerBaseCellYSa8QY0(C2002Dp.m7993boximpl(f), c2002Dp2, modifierM5125offsetVpY3zN4$default, false, false, null, null, ComposableLambda3.rememberComposableLambda(2040712502, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.lib.screener.DisplayScreenerCellsKt$StickyColumnHeader$2
                    public final void invoke(BoxScope ScreenerBaseCell, Composer composer2, int i5) {
                        int i6;
                        Intrinsics.checkNotNullParameter(ScreenerBaseCell, "$this$ScreenerBaseCell");
                        if ((i5 & 6) == 0) {
                            i6 = i5 | (composer2.changed(ScreenerBaseCell) ? 4 : 2);
                        } else {
                            i6 = i5;
                        }
                        if ((i6 & 19) == 18 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2040712502, i6, -1, "com.robinhood.android.lib.screener.StickyColumnHeader.<anonymous> (DisplayScreenerCells.kt:307)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        Modifier modifierAlign = ScreenerBaseCell.align(companion, companion2.getTopCenter());
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i7 = BentoTheme.$stable;
                        BentoDivider.m20635BentoHorizontalDivideraMcp0Q(modifierAlign, bentoTheme.getColors(composer2, i7).m21373getBg30d7_KjU(), 0.0f, composer2, 0, 4);
                        Modifier modifierM5166requiredWidth3ABfNKs = SizeKt.m5166requiredWidth3ABfNKs(companion, DisplayScreenerCellsKt.stickyPillSize);
                        Alignment.Horizontal end = companion2.getEnd();
                        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                        Function0<Unit> function02 = function0;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(center, end, composer2, 54);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM5166requiredWidth3ABfNKs);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                        if (composer2.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size12(ServerToBentoAssetMapper2.ARROW_LEFT_12), null, bentoTheme.getColors(composer2, i7).m21425getFg0d7_KjU(), PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, bentoTheme.getSpacing(composer2, i7).m21593getSmallD9Ej5fM(), 0.0f, 11, null), function02, false, composer2, BentoIcon4.Size12.$stable | 48, 32);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer2, Integer num) {
                        invoke(boxScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, (i3 & 14) | 12582912 | (i3 & 112), 120);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.lib.screener.DisplayScreenerCellsKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return DisplayScreenerCellsKt.StickyColumnHeader_ckAXlIo$lambda$9(f, c2002Dp, function0, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            f2 = stickyPillSize;
            if (C2002Dp.m7994compareTo0680j_4(f, f2) >= 0) {
            }
            m15876ScreenerBaseCellYSa8QY0(C2002Dp.m7993boximpl(f), c2002Dp2, modifierM5125offsetVpY3zN4$default, false, false, null, null, ComposableLambda3.rememberComposableLambda(2040712502, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.lib.screener.DisplayScreenerCellsKt$StickyColumnHeader$2
                public final void invoke(BoxScope ScreenerBaseCell, Composer composer2, int i5) {
                    int i6;
                    Intrinsics.checkNotNullParameter(ScreenerBaseCell, "$this$ScreenerBaseCell");
                    if ((i5 & 6) == 0) {
                        i6 = i5 | (composer2.changed(ScreenerBaseCell) ? 4 : 2);
                    } else {
                        i6 = i5;
                    }
                    if ((i6 & 19) == 18 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2040712502, i6, -1, "com.robinhood.android.lib.screener.StickyColumnHeader.<anonymous> (DisplayScreenerCells.kt:307)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    Modifier modifierAlign = ScreenerBaseCell.align(companion, companion2.getTopCenter());
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i7 = BentoTheme.$stable;
                    BentoDivider.m20635BentoHorizontalDivideraMcp0Q(modifierAlign, bentoTheme.getColors(composer2, i7).m21373getBg30d7_KjU(), 0.0f, composer2, 0, 4);
                    Modifier modifierM5166requiredWidth3ABfNKs = SizeKt.m5166requiredWidth3ABfNKs(companion, DisplayScreenerCellsKt.stickyPillSize);
                    Alignment.Horizontal end = companion2.getEnd();
                    Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                    Function0<Unit> function02 = function0;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(center, end, composer2, 54);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM5166requiredWidth3ABfNKs);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size12(ServerToBentoAssetMapper2.ARROW_LEFT_12), null, bentoTheme.getColors(composer2, i7).m21425getFg0d7_KjU(), PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, bentoTheme.getSpacing(composer2, i7).m21593getSmallD9Ej5fM(), 0.0f, 11, null), function02, false, composer2, BentoIcon4.Size12.$stable | 48, 32);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer2, Integer num) {
                    invoke(boxScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i3 & 14) | 12582912 | (i3 & 112), 120);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier4 = modifier3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void StickyPill(final TableInstrumentName<?> tableInstrumentName, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1348059234);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(tableInstrumentName) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1348059234, i2, -1, "com.robinhood.android.lib.screener.StickyPill (DisplayScreenerCells.kt:330)");
            }
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            TextStyle textS = bentoTheme.getTypography(composerStartRestartGroup, i3).getTextS();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(textS, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(5004770);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.lib.screener.DisplayScreenerCellsKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return DisplayScreenerCellsKt.StickyPill$lambda$14$lambda$13(snapshotState, ((Boolean) obj).booleanValue());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final Function1 function1 = (Function1) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierRotate = Rotate.rotate(Modifier.INSTANCE, -90.0f);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new Function3() { // from class: com.robinhood.android.lib.screener.DisplayScreenerCellsKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return DisplayScreenerCellsKt.StickyPill$lambda$17$lambda$16((MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(Background3.m4871backgroundbw27NRU(PaddingKt.m5146paddingqDBjuR0$default(LayoutModifier4.layout(modifierRotate, (Function3) objRememberedValue3), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21595getXsmallD9Ej5fM(), 7, null), bentoTheme.getColors(composerStartRestartGroup, i3).m21373getBg30d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(100))), bentoTheme.getSpacing(composerStartRestartGroup, i3).m21593getSmallD9Ej5fM(), 0.0f, 2, null);
            String symbol = tableInstrumentName.getSymbol();
            FontWeight bold = FontWeight.INSTANCE.getBold();
            long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i3).m21425getFg0d7_KjU();
            TextStyle textStyleStickyPill$lambda$11 = StickyPill$lambda$11(snapshotState);
            Color colorM6701boximpl = Color.m6701boximpl(jM21425getFg0d7_KjU);
            composerStartRestartGroup.startReplaceGroup(5004770);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new Function1() { // from class: com.robinhood.android.lib.screener.DisplayScreenerCellsKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return DisplayScreenerCellsKt.StickyPill$lambda$19$lambda$18(function1, (TextLayoutResult) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            BentoText2.m20747BentoText38GnDrw(symbol, modifierM5144paddingVpY3zN4$default, colorM6701boximpl, null, bold, null, null, 0, false, 0, 0, (Function1) objRememberedValue4, 0, textStyleStickyPill$lambda$11, composer2, 100687872, 48, 5864);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.lib.screener.DisplayScreenerCellsKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DisplayScreenerCellsKt.StickyPill$lambda$20(tableInstrumentName, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StickyPill$lambda$14$lambda$13(SnapshotState snapshotState, boolean z) {
        if (z) {
            TextStyle textStyleStickyPill$lambda$11 = StickyPill$lambda$11(snapshotState);
            long jM7662getFontSizeXSAIIZE = StickyPill$lambda$11(snapshotState).m7662getFontSizeXSAIIZE();
            TextUnit2.m8082checkArithmeticR2X_6o(jM7662getFontSizeXSAIIZE);
            snapshotState.setValue(TextStyle.m7655copyp1EtxEg$default(textStyleStickyPill$lambda$11, 0L, TextUnit2.pack(TextUnit.m8072getRawTypeimpl(jM7662getFontSizeXSAIIZE), TextUnit.m8074getValueimpl(jM7662getFontSizeXSAIIZE) * 0.95f), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777213, null));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult StickyPill$lambda$17$lambda$16(MeasureScope layout, Measurable measurable, Constraints constraints) {
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        final Placeable placeableMo7239measureBRTryo0 = measurable.mo7239measureBRTryo0(constraints.getValue());
        return MeasureScope.layout$default(layout, placeableMo7239measureBRTryo0.getHeight(), placeableMo7239measureBRTryo0.getWidth(), null, new Function1() { // from class: com.robinhood.android.lib.screener.DisplayScreenerCellsKt$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DisplayScreenerCellsKt.StickyPill$lambda$17$lambda$16$lambda$15(placeableMo7239measureBRTryo0, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StickyPill$lambda$17$lambda$16$lambda$15(Placeable placeable, Placeable.PlacementScope layout) {
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        int iAbs = Math.abs(placeable.getWidth() - placeable.getHeight()) / 2;
        Placeable.PlacementScope.place$default(layout, placeable, -iAbs, iAbs, 0.0f, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StickyPill$lambda$19$lambda$18(Function1 function1, TextLayoutResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        function1.invoke(Boolean.valueOf(result.getDidOverflowWidth()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DisplaySduiCells-q2EtPuw, reason: not valid java name */
    public static final void m15871DisplaySduiCellsq2EtPuw(final ScreenTableCells.Sdui sdui, final C2002Dp c2002Dp, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1482860346);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(sdui) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(c2002Dp) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1482860346, i3, -1, "com.robinhood.android.lib.screener.DisplaySduiCells (DisplayScreenerCells.kt:373)");
            }
            Alignment center = Alignment.INSTANCE.getCenter();
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (sdui.getComponent() instanceof TableSparklineItem) {
                composerStartRestartGroup.startReplaceGroup(1146652422);
                if (c2002Dp == null) {
                    composerStartRestartGroup.startReplaceGroup(1186488700);
                    BoxKt.Box(SizeKt.m5174width3ABfNKs(modifier, C2002Dp.m7995constructorimpl(100)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    composer2 = composerStartRestartGroup;
                } else {
                    composerStartRestartGroup.startReplaceGroup(1186639515);
                    composer2 = composerStartRestartGroup;
                    OneDayMiniChart.OneDayMiniChart(new OneDayMiniChartDetails(StringsKt.toUuid(((TableSparklineItem) sdui.getComponent()).getInstrument_id()), InstrumentType.EQUITY), PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxHeight$default(Clip.clipToBounds(modifier), 0.0f, 1, null), 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 1, null), null, null, false, composer2, OneDayMiniChartDetails.$stable | 24576, 12);
                    composer2.endReplaceGroup();
                }
                composer2.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1187168468);
                composerStartRestartGroup.startReplaceGroup(1146676596);
                Modifier modifierM5144paddingVpY3zN4$default = c2002Dp == null ? PaddingKt.m5144paddingVpY3zN4$default(modifier, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21595getXsmallD9Ej5fM(), 0.0f, 2, null) : modifier;
                composerStartRestartGroup.endReplaceGroup();
                SduiComponent3.SduiComponent(sdui.getComponent(), modifierM5144paddingVpY3zN4$default, null, composerStartRestartGroup, 0, 4);
                composer2 = composerStartRestartGroup;
                composer2.endReplaceGroup();
            }
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.lib.screener.DisplayScreenerCellsKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DisplayScreenerCellsKt.DisplaySduiCells_q2EtPuw$lambda$23(sdui, c2002Dp, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0106  */
    /* renamed from: ScreenerBaseCell-YSa8QY0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m15876ScreenerBaseCellYSa8QY0(final C2002Dp c2002Dp, final C2002Dp c2002Dp2, Modifier modifier, boolean z, boolean z2, Alignment alignment, Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function3, final Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function32, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        final boolean z3;
        int i5;
        boolean z4;
        int i6;
        Alignment alignment2;
        int i7;
        Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function3RememberComposableLambda;
        Modifier modifierM4872backgroundbw27NRU$default;
        Modifier modifierThen;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        BoxScopeInstance boxScopeInstance;
        final Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function33;
        Modifier modifierM5156height3ABfNKs;
        Modifier modifierM5174width3ABfNKs;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(756254866);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(c2002Dp) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(c2002Dp2) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
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
                    if (i6 != 0) {
                        if ((196608 & i) == 0) {
                            alignment2 = alignment;
                            i3 |= composerStartRestartGroup.changed(alignment2) ? 131072 : 65536;
                        }
                        i7 = i2 & 64;
                        if (i7 != 0) {
                            i3 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            i3 |= composerStartRestartGroup.changedInstance(function3) ? 1048576 : 524288;
                        }
                        if ((i2 & 128) != 0) {
                            i3 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i3 |= composerStartRestartGroup.changedInstance(function32) ? 8388608 : 4194304;
                        }
                        if ((4793491 & i3) == 4793490 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            function33 = function3;
                        } else {
                            if (i8 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                z3 = false;
                            }
                            if (i5 != 0) {
                                z4 = true;
                            }
                            Alignment centerStart = i6 == 0 ? Alignment.INSTANCE.getCenterStart() : alignment2;
                            function3RememberComposableLambda = i7 == 0 ? ComposableLambda3.rememberComposableLambda(1510944569, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.lib.screener.DisplayScreenerCellsKt$ScreenerBaseCell$1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer2, Integer num) {
                                    invoke(boxScope, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(BoxScope boxScope, Composer composer2, int i9) {
                                    long jM21373getBg30d7_KjU;
                                    Intrinsics.checkNotNullParameter(boxScope, "<this>");
                                    if ((i9 & 6) == 0) {
                                        i9 |= composer2.changed(boxScope) ? 4 : 2;
                                    }
                                    if ((i9 & 19) == 18 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1510944569, i9, -1, "com.robinhood.android.lib.screener.ScreenerBaseCell.<anonymous> (DisplayScreenerCells.kt:416)");
                                    }
                                    Modifier modifierAlign = boxScope.align(Modifier.INSTANCE, Alignment.INSTANCE.getBottomCenter());
                                    if (z3) {
                                        composer2.startReplaceGroup(1292524565);
                                        jM21373getBg30d7_KjU = BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21425getFg0d7_KjU();
                                        composer2.endReplaceGroup();
                                    } else {
                                        composer2.startReplaceGroup(1292582132);
                                        jM21373getBg30d7_KjU = BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21373getBg30d7_KjU();
                                        composer2.endReplaceGroup();
                                    }
                                    BentoDivider.m20635BentoHorizontalDivideraMcp0Q(modifierAlign, jM21373getBg30d7_KjU, 0.0f, composer2, 0, 4);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composerStartRestartGroup, 54) : function3;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(756254866, i3, -1, "com.robinhood.android.lib.screener.ScreenerBaseCell (DisplayScreenerCells.kt:426)");
                            }
                            composerStartRestartGroup.startReplaceGroup(911474797);
                            if (!z4) {
                                modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null);
                            } else {
                                modifierM4872backgroundbw27NRU$default = Modifier.INSTANCE;
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            modifierThen = modifier2.then(modifierM4872backgroundbw27NRU$default);
                            if (c2002Dp != null && (modifierM5174width3ABfNKs = SizeKt.m5174width3ABfNKs(modifierThen, c2002Dp.getValue())) != null) {
                                modifierThen = modifierM5174width3ABfNKs;
                            }
                            if (c2002Dp2 != null && (modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(modifierThen, c2002Dp2.getValue())) != null) {
                                modifierThen = modifierM5156height3ABfNKs;
                            }
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(centerStart, false);
                            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierThen);
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                            setCompositeKeyHash = companion.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                            boxScopeInstance = BoxScopeInstance.INSTANCE;
                            function32.invoke(boxScopeInstance, composerStartRestartGroup, Integer.valueOf(((i3 >> 18) & 112) | 6));
                            composerStartRestartGroup.startReplaceGroup(1384324120);
                            if (c2002Dp != null && c2002Dp2 != null) {
                                function3RememberComposableLambda.invoke(boxScopeInstance, composerStartRestartGroup, Integer.valueOf(((i3 >> 15) & 112) | 6));
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function33 = function3RememberComposableLambda;
                            alignment2 = centerStart;
                        }
                        final boolean z5 = z3;
                        final boolean z6 = z4;
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            final Modifier modifier3 = modifier2;
                            final Alignment alignment3 = alignment2;
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.lib.screener.DisplayScreenerCellsKt$$ExternalSyntheticLambda19
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return DisplayScreenerCellsKt.ScreenerBaseCell_YSa8QY0$lambda$27(c2002Dp, c2002Dp2, modifier3, z5, z6, alignment3, function33, function32, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 196608;
                    alignment2 = alignment;
                    i7 = i2 & 64;
                    if (i7 != 0) {
                    }
                    if ((i2 & 128) != 0) {
                    }
                    if ((4793491 & i3) == 4793490) {
                        if (i8 != 0) {
                        }
                        if (i4 != 0) {
                        }
                        if (i5 != 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i7 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composerStartRestartGroup.startReplaceGroup(911474797);
                        if (!z4) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        modifierThen = modifier2.then(modifierM4872backgroundbw27NRU$default);
                        if (c2002Dp != null) {
                            modifierThen = modifierM5174width3ABfNKs;
                        }
                        if (c2002Dp2 != null) {
                            modifierThen = modifierM5156height3ABfNKs;
                        }
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(centerStart, false);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierThen);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting()) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                            boxScopeInstance = BoxScopeInstance.INSTANCE;
                            function32.invoke(boxScopeInstance, composerStartRestartGroup, Integer.valueOf(((i3 >> 18) & 112) | 6));
                            composerStartRestartGroup.startReplaceGroup(1384324120);
                            if (c2002Dp != null) {
                                function3RememberComposableLambda.invoke(boxScopeInstance, composerStartRestartGroup, Integer.valueOf(((i3 >> 15) & 112) | 6));
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            function33 = function3RememberComposableLambda;
                            alignment2 = centerStart;
                        }
                    }
                    final boolean z52 = z3;
                    final boolean z62 = z4;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                z4 = z2;
                i6 = i2 & 32;
                if (i6 != 0) {
                }
                alignment2 = alignment;
                i7 = i2 & 64;
                if (i7 != 0) {
                }
                if ((i2 & 128) != 0) {
                }
                if ((4793491 & i3) == 4793490) {
                }
                final boolean z522 = z3;
                final boolean z622 = z4;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            z3 = z;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            z4 = z2;
            i6 = i2 & 32;
            if (i6 != 0) {
            }
            alignment2 = alignment;
            i7 = i2 & 64;
            if (i7 != 0) {
            }
            if ((i2 & 128) != 0) {
            }
            if ((4793491 & i3) == 4793490) {
            }
            final boolean z5222 = z3;
            final boolean z6222 = z4;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
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
        if (i6 != 0) {
        }
        alignment2 = alignment;
        i7 = i2 & 64;
        if (i7 != 0) {
        }
        if ((i2 & 128) != 0) {
        }
        if ((4793491 & i3) == 4793490) {
        }
        final boolean z52222 = z3;
        final boolean z62222 = z4;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* renamed from: ColumnHeader-4Mhb2_g, reason: not valid java name */
    private static final void m15869ColumnHeader4Mhb2_g(final C2002Dp c2002Dp, final C2002Dp c2002Dp2, final ScreenTableCells.SduiDto sduiDto, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1111432701);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(c2002Dp) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(c2002Dp2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(sduiDto) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1111432701, i2, -1, "com.robinhood.android.lib.screener.ColumnHeader (DisplayScreenerCells.kt:456)");
            }
            Alignment boxAlignment = ColumnAlignment2.toBoxAlignment(sduiDto.getAlignment());
            UIComponentDto.ConcreteDto component = sduiDto.getComponent();
            Intrinsics.checkNotNull(component, "null cannot be cast to non-null type rh_server_driven_ui.v1.UIComponentDto.ConcreteDto.TableColumnHeader");
            m15876ScreenerBaseCellYSa8QY0(c2002Dp, c2002Dp2, null, ((UIComponentDto.ConcreteDto.TableColumnHeader) component).getValue().getActive(), false, boxAlignment, null, ComposableLambda3.rememberComposableLambda(-1383561606, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.lib.screener.DisplayScreenerCellsKt$ColumnHeader$3
                public final void invoke(BoxScope ScreenerBaseCell, Composer composer2, int i3) {
                    int i4;
                    Intrinsics.checkNotNullParameter(ScreenerBaseCell, "$this$ScreenerBaseCell");
                    if ((i3 & 6) == 0) {
                        i4 = i3 | (composer2.changed(ScreenerBaseCell) ? 4 : 2);
                    } else {
                        i4 = i3;
                    }
                    if ((i4 & 19) == 18 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1383561606, i4, -1, "com.robinhood.android.lib.screener.ColumnHeader.<anonymous> (DisplayScreenerCells.kt:464)");
                    }
                    composer2.startReplaceGroup(1837158905);
                    if (c2002Dp != null) {
                        BentoDivider.m20635BentoHorizontalDivideraMcp0Q(ScreenerBaseCell.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopCenter()), BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21373getBg30d7_KjU(), 0.0f, composer2, 0, 4);
                    }
                    composer2.endReplaceGroup();
                    Modifier.Companion companion = Modifier.INSTANCE;
                    C2002Dp c2002DpM15894getMaxWidthlTKBWiU = sduiDto.m15894getMaxWidthlTKBWiU();
                    Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.m5173sizeInqDBjuR0$default(companion, 0.0f, 0.0f, c2002DpM15894getMaxWidthlTKBWiU != null ? c2002DpM15894getMaxWidthlTKBWiU.getValue() : C2002Dp.INSTANCE.m8003getInfinityD9Ej5fM(), 0.0f, 11, null), C2002Dp.m7995constructorimpl(12), 0.0f, 2, null);
                    Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                    ScreenTableCells.SduiDto sduiDto2 = sduiDto;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(center, Alignment.INSTANCE.getStart(), composer2, 6);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM5144paddingVpY3zN4$default);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    DisplayScreenerCellsKt.DisplaySduiDtoCells(sduiDto2, composer2, 0);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer2, Integer num) {
                    invoke(boxScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i2 & 14) | 12607488 | (i2 & 112), 68);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.lib.screener.DisplayScreenerCellsKt$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DisplayScreenerCellsKt.ColumnHeader_4Mhb2_g$lambda$28(c2002Dp, c2002Dp2, sduiDto, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: SduiCell-4Mhb2_g, reason: not valid java name */
    private static final void m15878SduiCell4Mhb2_g(final C2002Dp c2002Dp, final C2002Dp c2002Dp2, final ScreenTableCells.SduiDto sduiDto, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-319894433);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(c2002Dp) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(c2002Dp2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(sduiDto) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-319894433, i2, -1, "com.robinhood.android.lib.screener.SduiCell (DisplayScreenerCells.kt:488)");
            }
            m15876ScreenerBaseCellYSa8QY0(c2002Dp, c2002Dp2, null, false, false, ColumnAlignment2.toBoxAlignment(sduiDto.getAlignment()), null, ComposableLambda3.rememberComposableLambda(858866774, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.lib.screener.DisplayScreenerCellsKt$SduiCell$3
                public final void invoke(BoxScope ScreenerBaseCell, Composer composer2, int i3) {
                    Intrinsics.checkNotNullParameter(ScreenerBaseCell, "$this$ScreenerBaseCell");
                    if ((i3 & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(858866774, i3, -1, "com.robinhood.android.lib.screener.SduiCell.<anonymous> (DisplayScreenerCells.kt:495)");
                    }
                    composer2.startReplaceGroup(737259106);
                    Modifier.Companion companion = Modifier.INSTANCE;
                    C2002Dp c2002DpM15894getMaxWidthlTKBWiU = sduiDto.m15894getMaxWidthlTKBWiU();
                    Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.m5173sizeInqDBjuR0$default(companion, 0.0f, 0.0f, c2002DpM15894getMaxWidthlTKBWiU != null ? c2002DpM15894getMaxWidthlTKBWiU.getValue() : C2002Dp.INSTANCE.m8003getInfinityD9Ej5fM(), 0.0f, 11, null), 0.0f, C2002Dp.m7995constructorimpl(12), 1, null);
                    if (c2002Dp == null) {
                        modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(modifierM5144paddingVpY3zN4$default, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21595getXsmallD9Ej5fM(), 0.0f, 2, null);
                    }
                    composer2.endReplaceGroup();
                    Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                    ScreenTableCells.SduiDto sduiDto2 = sduiDto;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(center, Alignment.INSTANCE.getStart(), composer2, 6);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM5144paddingVpY3zN4$default);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    DisplayScreenerCellsKt.DisplaySduiDtoCells(sduiDto2, composer2, 0);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer2, Integer num) {
                    invoke(boxScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i2 & 14) | 12607488 | (i2 & 112), 76);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.lib.screener.DisplayScreenerCellsKt$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DisplayScreenerCellsKt.SduiCell_4Mhb2_g$lambda$29(c2002Dp, c2002Dp2, sduiDto, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DisplaySduiDtoCells(final ScreenTableCells.SduiDto sduiDto, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(466919625);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(sduiDto) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(466919625, i2, -1, "com.robinhood.android.lib.screener.DisplaySduiDtoCells (DisplayScreenerCells.kt:515)");
            }
            Alignment center = Alignment.INSTANCE.getCenter();
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            UIComponentDto.ConcreteDto component = sduiDto.getComponent();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.lib.screener.DisplayScreenerCellsKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return DisplayScreenerCellsKt.DisplaySduiDtoCells$lambda$32$lambda$31$lambda$30((ActionDto) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            SduiComponentIdl.SduiComponent(component, (Function1) objRememberedValue, (Modifier) null, (HorizontalPadding) null, composerStartRestartGroup, 48, 12);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.lib.screener.DisplayScreenerCellsKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DisplayScreenerCellsKt.DisplaySduiDtoCells$lambda$33(sduiDto, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MaintenanceTableAction DisplaySduiDtoCells$lambda$32$lambda$31$lambda$30(ActionDto actionDto) {
        AnyMessage concrete;
        if (actionDto == null || (concrete = actionDto.getConcrete()) == null) {
            return null;
        }
        return (MaintenanceTableAction) concrete.unpack(MaintenanceTableActionDto.INSTANCE.getProtoAdapter());
    }

    /* renamed from: RowStart-4Mhb2_g, reason: not valid java name */
    private static final void m15875RowStart4Mhb2_g(final C2002Dp c2002Dp, final C2002Dp c2002Dp2, final ScreenTableCells.RowStart rowStart, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1822135852);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(c2002Dp) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(c2002Dp2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(rowStart) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1822135852, i2, -1, "com.robinhood.android.lib.screener.RowStart (DisplayScreenerCells.kt:529)");
            }
            m15876ScreenerBaseCellYSa8QY0(c2002Dp, c2002Dp2, null, false, false, null, null, ComposableLambda3.rememberComposableLambda(-290972395, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.lib.screener.DisplayScreenerCellsKt$RowStart$1
                public final void invoke(BoxScope ScreenerBaseCell, Composer composer2, int i3) {
                    int i4;
                    C2002Dp c2002Dp3;
                    Intrinsics.checkNotNullParameter(ScreenerBaseCell, "$this$ScreenerBaseCell");
                    if ((i3 & 6) == 0) {
                        i4 = i3 | (composer2.changed(ScreenerBaseCell) ? 4 : 2);
                    } else {
                        i4 = i3;
                    }
                    if ((i4 & 19) == 18 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-290972395, i4, -1, "com.robinhood.android.lib.screener.RowStart.<anonymous> (DisplayScreenerCells.kt:535)");
                    }
                    composer2.startReplaceGroup(-451596772);
                    if (rowStart.isHeader() && (c2002Dp3 = c2002Dp) != null) {
                        BentoDivider.m20635BentoHorizontalDivideraMcp0Q(ScreenerBaseCell.align(SizeKt.m5174width3ABfNKs(Modifier.INSTANCE, c2002Dp3.getValue()), Alignment.INSTANCE.getTopCenter()), BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21373getBg30d7_KjU(), 0.0f, composer2, 0, 4);
                    }
                    composer2.endReplaceGroup();
                    ScreenTableCells.RowStart rowStart2 = rowStart;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer2, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, companion);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    composer2.startReplaceGroup(-1169329150);
                    if (rowStart2.isExpanded() != null) {
                        Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion, C2002Dp.m7995constructorimpl(24)), composer2, 6);
                        BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size12(rowStart2.isExpanded().booleanValue() ? ServerToBentoAssetMapper2.CARET_DOWN_12 : ServerToBentoAssetMapper2.CARET_RIGHT_12), null, BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21426getFg20d7_KjU(), null, null, false, composer2, BentoIcon4.Size12.$stable | 48, 56);
                    }
                    composer2.endReplaceGroup();
                    composer2.startReplaceGroup(-1169312498);
                    if (rowStart2.isSpacerLarge()) {
                        Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion, C2002Dp.m7995constructorimpl(36)), composer2, 6);
                    }
                    composer2.endReplaceGroup();
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer2, Integer num) {
                    invoke(boxScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i2 & 14) | 12607488 | (i2 & 112), 108);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.lib.screener.DisplayScreenerCellsKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DisplayScreenerCellsKt.RowStart_4Mhb2_g$lambda$34(c2002Dp, c2002Dp2, rowStart, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
