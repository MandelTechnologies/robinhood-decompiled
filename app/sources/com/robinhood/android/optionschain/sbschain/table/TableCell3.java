package com.robinhood.android.optionschain.sbschain.table;

import androidx.compose.animation.core.AnimateAsState;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStroke2;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.CardColors;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.RippleKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.LayoutCoordinates2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.layout.OnRemeasuredModifier2;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.p011ui.unit.TextUnit;
import androidx.compose.p011ui.unit.TextUnit2;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotFloatState2;
import androidx.compose.runtime.SnapshotFloatState3;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.optionschain.sbschain.table.TableCellState;
import com.robinhood.android.optionschain.sbschain.table.gestures.DragTarget;
import com.robinhood.android.optionschain.sbschain.table.gestures.OptionLegBundleWithRowIndex;
import com.robinhood.android.plt.PltModifiers;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.p355ui.OptionLegBundle;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TableCell.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\u001aÿ\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2,\b\u0002\u0010\u000e\u001a&\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000fj\u0004\u0018\u0001`\u00132,\b\u0002\u0010\u0014\u001a&\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000fj\u0004\u0018\u0001`\u00132,\b\u0002\u0010\u0015\u001a&\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000fj\u0004\u0018\u0001`\u00132\u0018\b\u0002\u0010\u0016\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00172\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0019H\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u008b\u0002\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u001d2\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010 \u001a\u00020\u00102,\b\u0002\u0010!\u001a&\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000fj\u0004\u0018\u0001`\u00132,\b\u0002\u0010\"\u001a&\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000fj\u0004\u0018\u0001`\u00132,\b\u0002\u0010#\u001a&\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000fj\u0004\u0018\u0001`\u00132\u0018\b\u0002\u0010\u0016\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00172\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0019H\u0001¢\u0006\u0002\u0010$\u001a\u001f\u0010%\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020&2\b\b\u0002\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010'\"\u000e\u0010(\u001a\u00020\u001fX\u0082T¢\u0006\u0002\n\u0000¨\u0006)²\u0006\n\u0010*\u001a\u00020\u0010X\u008a\u008e\u0002²\u0006\n\u0010+\u001a\u00020\u001fX\u008a\u0084\u0002²\u0006\n\u0010,\u001a\u00020\u0007X\u008a\u008e\u0002²\u0006\n\u0010-\u001a\u00020\u001fX\u008a\u008e\u0002²\u0006\n\u0010.\u001a\u00020/X\u008a\u0084\u0002"}, m3636d2 = {"TableCell", "", "cellState", "Lcom/robinhood/android/optionschain/sbschain/table/TableCellState;", "cellWidth", "Landroidx/compose/ui/unit/Dp;", "rowIndex", "", "modifier", "Landroidx/compose/ui/Modifier;", "spreadSelectionState", "Lcom/robinhood/android/optionschain/sbschain/table/SpreadSelectionState;", "dragTarget", "Lcom/robinhood/android/optionschain/sbschain/table/gestures/DragTarget;", "onBidAskCellSingleTap", "Lkotlin/Function3;", "", "Lcom/robinhood/models/ui/OptionLegBundle;", "Lcom/robinhood/android/optionschain/sbschain/table/BidAskCellDisableType;", "Lcom/robinhood/android/optionschain/sbschain/OnChainTableButtonTapped;", "onBidAskCellDoubleTap", "onBidAskCellLongPress", "onSelectedLegBundleDownInitiated", "Lkotlin/Function1;", "onHighlightAnimationPlayed", "Lkotlin/Function0;", "TableCell-Yq1gxAc", "(Lcom/robinhood/android/optionschain/sbschain/table/TableCellState;FILandroidx/compose/ui/Modifier;Lcom/robinhood/android/optionschain/sbschain/table/SpreadSelectionState;Lcom/robinhood/android/optionschain/sbschain/table/gestures/DragTarget;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", "TableBidAskCell", "Lcom/robinhood/android/optionschain/sbschain/table/TableCellState$BidAsk;", "textAlphaOverride", "", "showHighlight", "onSingleTap", "onDoubleTap", "onLongPress", "(Lcom/robinhood/android/optionschain/sbschain/table/TableCellState$BidAsk;ILandroidx/compose/ui/Modifier;Lcom/robinhood/android/optionschain/sbschain/table/SpreadSelectionState;Ljava/lang/Float;Lcom/robinhood/android/optionschain/sbschain/table/gestures/DragTarget;ZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", "TableTextCell", "Lcom/robinhood/android/optionschain/sbschain/table/TableCellState$Text;", "(Lcom/robinhood/android/optionschain/sbschain/table/TableCellState$Text;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "cutoutDegree", "feature-options-chain_externalDebug", "playBackgroundAnimation", "backgroundAlpha", "xOffset", "indicatorWidth", "bidAskCellBodyShape", "Lcom/robinhood/android/optionschain/sbschain/table/TableBidAskCellBodyShape;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.optionschain.sbschain.table.TableCellKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class TableCell3 {
    private static final float cutoutDegree = 60.0f;

    /* compiled from: TableCell.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.optionschain.sbschain.table.TableCellKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[TableCellTextStyle.values().length];
            try {
                iArr[TableCellTextStyle.HEADER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TableCellTextStyle.METRIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TableCellTextStyle.STRIKE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[LoadingStyle.values().length];
            try {
                iArr2[LoadingStyle.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[LoadingStyle.NUX.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[LoadingStyle.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TableBidAskCell$lambda$28(TableCellState.BidAsk bidAsk, int i, Modifier modifier, SpreadSelectionState spreadSelectionState, Float f, DragTarget dragTarget, boolean z, Function3 function3, Function3 function32, Function3 function33, Function1 function1, Function0 function0, int i2, int i3, int i4, Composer composer, int i5) {
        TableBidAskCell(bidAsk, i, modifier, spreadSelectionState, f, dragTarget, z, function3, function32, function33, function1, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), RecomposeScopeImpl4.updateChangedFlags(i3), i4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TableCell_Yq1gxAc$lambda$1(TableCellState tableCellState, float f, int i, Modifier modifier, SpreadSelectionState spreadSelectionState, DragTarget dragTarget, Function3 function3, Function3 function32, Function3 function33, Function1 function1, Function0 function0, int i2, int i3, int i4, Composer composer, int i5) {
        m17289TableCellYq1gxAc(tableCellState, f, i, modifier, spreadSelectionState, dragTarget, function3, function32, function33, function1, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), RecomposeScopeImpl4.updateChangedFlags(i3), i4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TableTextCell$lambda$30(TableCellState.Text text, Modifier modifier, int i, int i2, Composer composer, int i3) {
        TableTextCell(text, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:183:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fc  */
    /* renamed from: TableCell-Yq1gxAc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m17289TableCellYq1gxAc(final TableCellState cellState, final float f, final int i, Modifier modifier, SpreadSelectionState spreadSelectionState, DragTarget dragTarget, Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> function3, Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> function32, Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> function33, Function1<? super DragTarget, Unit> function1, Function0<Unit> function0, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        int i7;
        Modifier modifier2;
        int i8;
        SpreadSelectionState spreadSelectionState2;
        int i9;
        DragTarget dragTarget2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> function34;
        DragTarget dragTarget3;
        final Modifier modifier3;
        final SpreadSelectionState spreadSelectionState3;
        final DragTarget dragTarget4;
        final Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> function35;
        final Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> function36;
        final Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> function37;
        final Function1<? super DragTarget, Unit> function12;
        final Function0<Unit> function02;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(cellState, "cellState");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1137312008);
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerStartRestartGroup.changedInstance(cellState) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerStartRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i4 & 4) != 0) {
            i5 |= 384;
        } else {
            if ((i2 & 384) == 0) {
                i6 = i;
                i5 |= composerStartRestartGroup.changed(i6) ? 256 : 128;
            }
            i7 = i4 & 8;
            if (i7 == 0) {
                i5 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    modifier2 = modifier;
                    i5 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
                }
                i8 = i4 & 16;
                if (i8 != 0) {
                    i5 |= 24576;
                } else {
                    if ((i2 & 24576) == 0) {
                        spreadSelectionState2 = spreadSelectionState;
                        i5 |= composerStartRestartGroup.changedInstance(spreadSelectionState2) ? 16384 : 8192;
                    }
                    i9 = i4 & 32;
                    if (i9 == 0) {
                        i5 |= 196608;
                    } else {
                        if ((196608 & i2) == 0) {
                            dragTarget2 = dragTarget;
                            i5 |= composerStartRestartGroup.changedInstance(dragTarget2) ? 131072 : 65536;
                        }
                        i10 = i4 & 64;
                        if (i10 != 0) {
                            i5 |= 1572864;
                        } else if ((i2 & 1572864) == 0) {
                            i5 |= composerStartRestartGroup.changedInstance(function3) ? 1048576 : 524288;
                        }
                        i11 = i4 & 128;
                        if (i11 != 0) {
                            i5 |= 12582912;
                        } else if ((i2 & 12582912) == 0) {
                            i5 |= composerStartRestartGroup.changedInstance(function32) ? 8388608 : 4194304;
                        }
                        i12 = i4 & 256;
                        if (i12 != 0) {
                            i5 |= 100663296;
                        } else {
                            if ((i2 & 100663296) == 0) {
                                i13 = i12;
                                i5 |= composerStartRestartGroup.changedInstance(function33) ? 67108864 : 33554432;
                            }
                            i14 = i4 & 512;
                            if (i14 != 0) {
                                if ((i2 & 805306368) == 0) {
                                    i15 = i14;
                                    i5 |= composerStartRestartGroup.changedInstance(function1) ? 536870912 : 268435456;
                                }
                                i16 = i4 & 1024;
                                if (i16 != 0) {
                                    i17 = i16;
                                    i18 = i3 | 6;
                                } else if ((i3 & 6) == 0) {
                                    i17 = i16;
                                    i18 = i3 | (composerStartRestartGroup.changedInstance(function0) ? 4 : 2);
                                } else {
                                    i17 = i16;
                                    i18 = i3;
                                }
                                if ((i5 & 306783379) != 306783378 || (i18 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
                                    Modifier modifier4 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                                    SpreadSelectionState spreadSelectionState4 = i8 == 0 ? null : spreadSelectionState2;
                                    if (i9 != 0) {
                                        dragTarget2 = null;
                                    }
                                    Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> function38 = i10 == 0 ? null : function3;
                                    Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> function39 = i11 == 0 ? null : function32;
                                    Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> function310 = i13 == 0 ? null : function33;
                                    Function1<? super DragTarget, Unit> function13 = i15 == 0 ? null : function1;
                                    Function0<Unit> function03 = i17 == 0 ? null : function0;
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1137312008, i5, i18, "com.robinhood.android.optionschain.sbschain.table.TableCell (TableCell.kt:83)");
                                    }
                                    Modifier modifierM5171sizeVpY3zN4 = SizeKt.m5171sizeVpY3zN4(modifier4, f, TableConstants.getCellHeightDp());
                                    Alignment.Companion companion = Alignment.INSTANCE;
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
                                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5171sizeVpY3zN4);
                                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                    int i19 = i18;
                                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                    setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    if (!(cellState instanceof TableCellState.BidAsk)) {
                                        composerStartRestartGroup.startReplaceGroup(1818829345);
                                        dragTarget3 = dragTarget2;
                                        TableCellState.BidAsk bidAsk = (TableCellState.BidAsk) cellState;
                                        int i20 = i5 << 3;
                                        function34 = function38;
                                        TableBidAskCell(bidAsk, i6, boxScopeInstance.align(Modifier.INSTANCE, companion.getCenter()), spreadSelectionState4, null, dragTarget3, bidAsk.getShowHighlight(), function34, function39, function310, function13, function03, composerStartRestartGroup, ((i5 >> 3) & 7280) | (458752 & i5) | (29360128 & i20) | (234881024 & i20) | (i20 & 1879048192), ((i5 >> 27) & 14) | ((i19 << 3) & 112), 16);
                                        composer2 = composerStartRestartGroup;
                                        composer2.endReplaceGroup();
                                    } else {
                                        composer2 = composerStartRestartGroup;
                                        function34 = function38;
                                        dragTarget3 = dragTarget2;
                                        if (!(cellState instanceof TableCellState.Text)) {
                                            composer2.startReplaceGroup(1818827694);
                                            composer2.endReplaceGroup();
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        composer2.startReplaceGroup(1818850686);
                                        TableTextCell((TableCellState.Text) cellState, boxScopeInstance.align(Modifier.INSTANCE, companion.getCenter()), composer2, 0, 0);
                                        composer2.endReplaceGroup();
                                    }
                                    composer2.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    modifier3 = modifier4;
                                    spreadSelectionState3 = spreadSelectionState4;
                                    dragTarget4 = dragTarget3;
                                    function35 = function34;
                                    function36 = function39;
                                    function37 = function310;
                                    function12 = function13;
                                    function02 = function03;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    function35 = function3;
                                    function36 = function32;
                                    function12 = function1;
                                    composer2 = composerStartRestartGroup;
                                    modifier3 = modifier2;
                                    spreadSelectionState3 = spreadSelectionState2;
                                    dragTarget4 = dragTarget2;
                                    function37 = function33;
                                    function02 = function0;
                                }
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionschain.sbschain.table.TableCellKt$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return TableCell3.TableCell_Yq1gxAc$lambda$1(cellState, f, i, modifier3, spreadSelectionState3, dragTarget4, function35, function36, function37, function12, function02, i2, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i5 |= 805306368;
                            i15 = i14;
                            i16 = i4 & 1024;
                            if (i16 != 0) {
                            }
                            if ((i5 & 306783379) != 306783378) {
                                if (i7 == 0) {
                                }
                                if (i8 == 0) {
                                }
                                if (i9 != 0) {
                                }
                                if (i10 == 0) {
                                }
                                if (i11 == 0) {
                                }
                                if (i13 == 0) {
                                }
                                if (i15 == 0) {
                                }
                                if (i17 == 0) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                Modifier modifierM5171sizeVpY3zN42 = SizeKt.m5171sizeVpY3zN4(modifier4, f, TableConstants.getCellHeightDp());
                                Alignment.Companion companion3 = Alignment.INSTANCE;
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5171sizeVpY3zN42);
                                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                                int i192 = i18;
                                Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (!composerStartRestartGroup.getInserting()) {
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
                                    if (!(cellState instanceof TableCellState.BidAsk)) {
                                    }
                                    composer2.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    modifier3 = modifier4;
                                    spreadSelectionState3 = spreadSelectionState4;
                                    dragTarget4 = dragTarget3;
                                    function35 = function34;
                                    function36 = function39;
                                    function37 = function310;
                                    function12 = function13;
                                    function02 = function03;
                                }
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        i13 = i12;
                        i14 = i4 & 512;
                        if (i14 != 0) {
                        }
                        i15 = i14;
                        i16 = i4 & 1024;
                        if (i16 != 0) {
                        }
                        if ((i5 & 306783379) != 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    dragTarget2 = dragTarget;
                    i10 = i4 & 64;
                    if (i10 != 0) {
                    }
                    i11 = i4 & 128;
                    if (i11 != 0) {
                    }
                    i12 = i4 & 256;
                    if (i12 != 0) {
                    }
                    i13 = i12;
                    i14 = i4 & 512;
                    if (i14 != 0) {
                    }
                    i15 = i14;
                    i16 = i4 & 1024;
                    if (i16 != 0) {
                    }
                    if ((i5 & 306783379) != 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                spreadSelectionState2 = spreadSelectionState;
                i9 = i4 & 32;
                if (i9 == 0) {
                }
                dragTarget2 = dragTarget;
                i10 = i4 & 64;
                if (i10 != 0) {
                }
                i11 = i4 & 128;
                if (i11 != 0) {
                }
                i12 = i4 & 256;
                if (i12 != 0) {
                }
                i13 = i12;
                i14 = i4 & 512;
                if (i14 != 0) {
                }
                i15 = i14;
                i16 = i4 & 1024;
                if (i16 != 0) {
                }
                if ((i5 & 306783379) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            modifier2 = modifier;
            i8 = i4 & 16;
            if (i8 != 0) {
            }
            spreadSelectionState2 = spreadSelectionState;
            i9 = i4 & 32;
            if (i9 == 0) {
            }
            dragTarget2 = dragTarget;
            i10 = i4 & 64;
            if (i10 != 0) {
            }
            i11 = i4 & 128;
            if (i11 != 0) {
            }
            i12 = i4 & 256;
            if (i12 != 0) {
            }
            i13 = i12;
            i14 = i4 & 512;
            if (i14 != 0) {
            }
            i15 = i14;
            i16 = i4 & 1024;
            if (i16 != 0) {
            }
            if ((i5 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i6 = i;
        i7 = i4 & 8;
        if (i7 == 0) {
        }
        modifier2 = modifier;
        i8 = i4 & 16;
        if (i8 != 0) {
        }
        spreadSelectionState2 = spreadSelectionState;
        i9 = i4 & 32;
        if (i9 == 0) {
        }
        dragTarget2 = dragTarget;
        i10 = i4 & 64;
        if (i10 != 0) {
        }
        i11 = i4 & 128;
        if (i11 != 0) {
        }
        i12 = i4 & 256;
        if (i12 != 0) {
        }
        i13 = i12;
        i14 = i4 & 512;
        if (i14 != 0) {
        }
        i15 = i14;
        i16 = i4 & 1024;
        if (i16 != 0) {
        }
        if ((i5 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    private static final TableCell TableBidAskCell$lambda$18(SnapshotState4<TableCell> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final boolean TableBidAskCell$lambda$5(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final float TableBidAskCell$lambda$7(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x031c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x05e3  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0621  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x067f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x069e  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x06a3  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x06bf  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x06c1  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x06cb  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x06cd  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x06e7  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0710  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0717  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0722  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0729  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0761  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x076d  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0771  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x07a0  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x07f1  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0819  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x081e  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0835  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0838  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x083c  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x083e  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0852  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0854  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x085e  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0860  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0878  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0918  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0950  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x095c  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0960  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x098d  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x09ba  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0a35  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0a46  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0a88  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0aa3  */
    /* JADX WARN: Removed duplicated region for block: B:391:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TableBidAskCell(TableCellState.BidAsk bidAsk, final int i, Modifier modifier, SpreadSelectionState spreadSelectionState, Float f, DragTarget dragTarget, boolean z, Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> function3, Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> function32, Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> function33, Function1<? super DragTarget, Unit> function1, Function0<Unit> function0, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        Modifier modifier2;
        int i7;
        SpreadSelectionState spreadSelectionState2;
        int i8;
        Float f2;
        int i9;
        int i10;
        boolean z2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        DragTarget dragTarget2;
        Object objRememberedValue;
        int i20;
        boolean z3;
        Float f3;
        boolean z4;
        BorderStroke borderStrokeM4886BorderStrokecXLIe8U;
        final long jM21456getPositive0d7_KjU;
        Object objRememberedValue2;
        Composer.Companion companion;
        DragTarget dragTarget3;
        SnapshotState snapshotState;
        boolean zChangedInstance;
        Object objRememberedValue3;
        boolean z5;
        CoroutineScope coroutineScope;
        Function0<Unit> function02;
        long jM6705copywmQWz5c$default;
        int i21;
        long jM21456getPositive0d7_KjU2;
        Object objRememberedValue4;
        final SnapshotIntState2 snapshotIntState2;
        Object objRememberedValue5;
        InteractionSource3 interactionSource3;
        Object objRememberedValue6;
        final SnapshotFloatState2 snapshotFloatState2;
        Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> function34;
        boolean zChanged;
        Object objRememberedValue7;
        Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> function35;
        Object objRememberedValue8;
        boolean zChangedInstance2;
        Object objRememberedValue9;
        Function1<? super DragTarget, Unit> function12;
        int currentCompositeKeyHash;
        Function1<? super DragTarget, Unit> function13;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean zChangedInstance3;
        Object objRememberedValue10;
        Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> function36;
        Function1<? super DragTarget, Unit> function14;
        Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> function37;
        Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> function38;
        Object objRememberedValue11;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        BentoTheme bentoTheme;
        final Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> function39;
        final Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> function310;
        Composer composer2;
        final Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> function311;
        final Function1<? super DragTarget, Unit> function15;
        final Modifier modifier3;
        final SpreadSelectionState spreadSelectionState3;
        final DragTarget dragTarget4;
        final boolean z6;
        final Function0<Unit> function03;
        final Float f4;
        ImmutableList<OptionLegBundleWithRowIndex> legBundlesWithRowIndex;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final TableCellState.BidAsk cellState = bidAsk;
        Intrinsics.checkNotNullParameter(cellState, "cellState");
        Composer composerStartRestartGroup = composer.startRestartGroup(-659405823);
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerStartRestartGroup.changedInstance(cellState) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                i5 |= composerStartRestartGroup.changed(i) ? 32 : 16;
            }
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else {
                if ((i2 & 384) == 0) {
                    modifier2 = modifier;
                    i5 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
                }
                i7 = i4 & 8;
                if (i7 != 0) {
                    i5 |= 3072;
                } else {
                    if ((i2 & 3072) == 0) {
                        spreadSelectionState2 = spreadSelectionState;
                        i5 |= composerStartRestartGroup.changedInstance(spreadSelectionState2) ? 2048 : 1024;
                    }
                    i8 = i4 & 16;
                    if (i8 != 0) {
                        if ((i2 & 24576) == 0) {
                            f2 = f;
                            i5 |= composerStartRestartGroup.changed(f2) ? 16384 : 8192;
                        }
                        i9 = i4 & 32;
                        if (i9 != 0) {
                            i5 |= 196608;
                        } else if ((i2 & 196608) == 0) {
                            i5 |= composerStartRestartGroup.changedInstance(dragTarget) ? 131072 : 65536;
                        }
                        i10 = i4 & 64;
                        if (i10 != 0) {
                            i5 |= 1572864;
                            z2 = z;
                        } else {
                            z2 = z;
                            if ((i2 & 1572864) == 0) {
                                i5 |= composerStartRestartGroup.changed(z2) ? 1048576 : 524288;
                            }
                        }
                        i11 = i4 & 128;
                        if (i11 != 0) {
                            i5 |= 12582912;
                        } else if ((i2 & 12582912) == 0) {
                            i5 |= composerStartRestartGroup.changedInstance(function3) ? 8388608 : 4194304;
                        }
                        i12 = i4 & 256;
                        if (i12 != 0) {
                            i5 |= 100663296;
                        } else if ((i2 & 100663296) == 0) {
                            i5 |= composerStartRestartGroup.changedInstance(function32) ? 67108864 : 33554432;
                        }
                        i13 = i4 & 512;
                        if (i13 != 0) {
                            i5 |= 805306368;
                        } else if ((i2 & 805306368) == 0) {
                            i5 |= composerStartRestartGroup.changedInstance(function33) ? 536870912 : 268435456;
                        }
                        i14 = i4 & 1024;
                        if (i14 != 0) {
                            i16 = i3 | 6;
                            i15 = i14;
                        } else if ((i3 & 6) == 0) {
                            i15 = i14;
                            i16 = i3 | (composerStartRestartGroup.changedInstance(function1) ? 4 : 2);
                        } else {
                            i15 = i14;
                            i16 = i3;
                        }
                        i17 = i4 & 2048;
                        if (i17 != 0) {
                            i16 |= 48;
                            i18 = i17;
                        } else if ((i3 & 48) == 0) {
                            i18 = i17;
                            i16 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
                        } else {
                            i18 = i17;
                        }
                        i19 = i16;
                        if ((i5 & 306783379) == 306783378 && (i19 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            dragTarget4 = dragTarget;
                            function310 = function32;
                            function15 = function1;
                            composer2 = composerStartRestartGroup;
                            f4 = f2;
                            z6 = z2;
                            modifier3 = modifier2;
                            spreadSelectionState3 = spreadSelectionState2;
                            function39 = function3;
                            function311 = function33;
                            function03 = function0;
                        } else {
                            Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                            if (i7 != 0) {
                                spreadSelectionState2 = null;
                            }
                            if (i8 != 0) {
                                f2 = null;
                            }
                            dragTarget2 = i9 == 0 ? null : dragTarget;
                            if (i10 != 0) {
                                z2 = false;
                            }
                            Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> function312 = i11 == 0 ? null : function3;
                            Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> function313 = i12 == 0 ? null : function32;
                            Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> function314 = i13 == 0 ? null : function33;
                            Function1<? super DragTarget, Unit> function16 = i15 == 0 ? null : function1;
                            Function0<Unit> function04 = i18 == 0 ? null : function0;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-659405823, i5, i19, "com.robinhood.android.optionschain.sbschain.table.TableBidAskCell (TableCell.kt:122)");
                            }
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            CoroutineScope coroutineScope2 = (CoroutineScope) objRememberedValue;
                            if (dragTarget2 != null || (legBundlesWithRowIndex = dragTarget2.getLegBundlesWithRowIndex()) == null) {
                                i20 = i19;
                            } else {
                                i20 = i19;
                                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(legBundlesWithRowIndex, 10));
                                Iterator<OptionLegBundleWithRowIndex> it = legBundlesWithRowIndex.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(it.next().getLegBundle());
                                }
                                OptionLegBundleWithRowIndex legBundleWithRowIndex = cellState.getLegBundleWithRowIndex();
                                boolean z7 = CollectionsKt.contains(arrayList, legBundleWithRowIndex != null ? legBundleWithRowIndex.getLegBundle() : null);
                                LoadingStyle loadingStyle = cellState.getLoadingStyle();
                                LoadingStyle loadingStyle2 = LoadingStyle.NUX;
                                float f5 = loadingStyle == loadingStyle2 ? 1.0f : !z7 ? 0.7f : 0.5f;
                                z3 = z7;
                                float fM7995constructorimpl = cellState.getLoadingStyle() == loadingStyle2 ? C2002Dp.m7995constructorimpl(2) : C2002Dp.m7995constructorimpl(1);
                                if (cellState.getIsEnabled()) {
                                    f3 = f2;
                                    z4 = z2;
                                    if (cellState.isBid()) {
                                        composerStartRestartGroup.startReplaceGroup(1966202885);
                                        borderStrokeM4886BorderStrokecXLIe8U = BorderStroke2.m4886BorderStrokecXLIe8U(fM7995constructorimpl, Color.m6705copywmQWz5c$default(BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21452getNegative0d7_KjU(), f5, 0.0f, 0.0f, 0.0f, 14, null));
                                        composerStartRestartGroup.endReplaceGroup();
                                    } else {
                                        composerStartRestartGroup.startReplaceGroup(1966206661);
                                        borderStrokeM4886BorderStrokecXLIe8U = BorderStroke2.m4886BorderStrokecXLIe8U(fM7995constructorimpl, Color.m6705copywmQWz5c$default(BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21456getPositive0d7_KjU(), f5, 0.0f, 0.0f, 0.0f, 14, null));
                                        composerStartRestartGroup.endReplaceGroup();
                                    }
                                } else {
                                    composerStartRestartGroup.startReplaceGroup(1966199583);
                                    f3 = f2;
                                    z4 = z2;
                                    borderStrokeM4886BorderStrokecXLIe8U = BorderStroke2.m4886BorderStrokecXLIe8U(fM7995constructorimpl, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21427getFg30d7_KjU());
                                    composerStartRestartGroup.endReplaceGroup();
                                }
                                if (cellState.isSelected() && !z3) {
                                    composerStartRestartGroup.startReplaceGroup(1966212899);
                                    jM21456getPositive0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU();
                                    composerStartRestartGroup.endReplaceGroup();
                                } else if (cellState.getIsEnabled()) {
                                    composerStartRestartGroup.startReplaceGroup(1966214596);
                                    jM21456getPositive0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21427getFg30d7_KjU();
                                    composerStartRestartGroup.endReplaceGroup();
                                } else if (cellState.isBid()) {
                                    composerStartRestartGroup.startReplaceGroup(1966216169);
                                    jM21456getPositive0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21452getNegative0d7_KjU();
                                    composerStartRestartGroup.endReplaceGroup();
                                } else {
                                    composerStartRestartGroup.startReplaceGroup(1966217545);
                                    jM21456getPositive0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21456getPositive0d7_KjU();
                                    composerStartRestartGroup.endReplaceGroup();
                                }
                                if (f3 == null) {
                                    jM21456getPositive0d7_KjU = Color.m6705copywmQWz5c$default(jM21456getPositive0d7_KjU, f3.floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                                } else if (z3) {
                                    jM21456getPositive0d7_KjU = Color.m6705copywmQWz5c$default(jM21456getPositive0d7_KjU, 0.5f, 0.0f, 0.0f, 0.0f, 14, null);
                                }
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                companion = Composer.INSTANCE;
                                int i22 = i5;
                                if (objRememberedValue2 != companion.getEmpty()) {
                                    dragTarget3 = dragTarget2;
                                    objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                } else {
                                    dragTarget3 = dragTarget2;
                                }
                                snapshotState = (SnapshotState) objRememberedValue2;
                                composerStartRestartGroup.endReplaceGroup();
                                SnapshotState4<Float> snapshotState4AnimateFloatAsState = AnimateAsState.animateFloatAsState(!TableBidAskCell$lambda$5(snapshotState) ? 0.2f : 0.0f, AnimationSpecKt.tween$default(400, 0, null, 6, null), 0.0f, null, null, composerStartRestartGroup, 48, 28);
                                Boolean boolValueOf = Boolean.valueOf(z4);
                                composerStartRestartGroup.startReplaceGroup(-1224400529);
                                zChangedInstance = ((i22 & 3670016) != 1048576) | composerStartRestartGroup.changedInstance(coroutineScope2) | ((i20 & 112) != 32);
                                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (!zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                                    Function0<Unit> function05 = function04;
                                    boolean z8 = z4;
                                    objRememberedValue3 = new TableCell4(z8, coroutineScope2, function05, snapshotState, null);
                                    z5 = z8;
                                    coroutineScope = coroutineScope2;
                                    function02 = function05;
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                } else {
                                    coroutineScope = coroutineScope2;
                                    function02 = function04;
                                    z5 = z4;
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                Function0<Unit> function06 = function02;
                                EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, (i22 >> 18) & 14);
                                CardDefaults cardDefaults = CardDefaults.INSTANCE;
                                Color.Companion companion2 = Color.INSTANCE;
                                long jM6725getTransparent0d7_KjU = companion2.m6725getTransparent0d7_KjU();
                                if (!z3) {
                                    composerStartRestartGroup.startReplaceGroup(1966246924);
                                    composerStartRestartGroup.endReplaceGroup();
                                    jM6705copywmQWz5c$default = companion2.m6725getTransparent0d7_KjU();
                                } else if (cellState.isSelected()) {
                                    composerStartRestartGroup.startReplaceGroup(1966248644);
                                    if (!cellState.getIsEnabled()) {
                                        composerStartRestartGroup.startReplaceGroup(1966250532);
                                        jM6705copywmQWz5c$default = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21427getFg30d7_KjU();
                                        composerStartRestartGroup.endReplaceGroup();
                                    } else if (cellState.isBid()) {
                                        composerStartRestartGroup.startReplaceGroup(1966252361);
                                        jM6705copywmQWz5c$default = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21452getNegative0d7_KjU();
                                        composerStartRestartGroup.endReplaceGroup();
                                    } else {
                                        composerStartRestartGroup.startReplaceGroup(1966253993);
                                        jM6705copywmQWz5c$default = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21456getPositive0d7_KjU();
                                        composerStartRestartGroup.endReplaceGroup();
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                } else {
                                    composerStartRestartGroup.startReplaceGroup(1966255586);
                                    if (cellState.isBid()) {
                                        composerStartRestartGroup.startReplaceGroup(1966257630);
                                        jM6705copywmQWz5c$default = Color.m6705copywmQWz5c$default(BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21452getNegative0d7_KjU(), TableBidAskCell$lambda$7(snapshotState4AnimateFloatAsState), 0.0f, 0.0f, 0.0f, 14, null);
                                        composerStartRestartGroup.endReplaceGroup();
                                    } else {
                                        composerStartRestartGroup.startReplaceGroup(1966260222);
                                        jM6705copywmQWz5c$default = Color.m6705copywmQWz5c$default(BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21456getPositive0d7_KjU(), TableBidAskCell$lambda$7(snapshotState4AnimateFloatAsState), 0.0f, 0.0f, 0.0f, 14, null);
                                        composerStartRestartGroup.endReplaceGroup();
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                }
                                long jM6725getTransparent0d7_KjU2 = companion2.m6725getTransparent0d7_KjU();
                                long jM6725getTransparent0d7_KjU3 = companion2.m6725getTransparent0d7_KjU();
                                int i23 = CardDefaults.$stable;
                                CardColors cardColorsM5729cardColorsro_MJ88 = cardDefaults.m5729cardColorsro_MJ88(jM6705copywmQWz5c$default, jM6725getTransparent0d7_KjU, jM6725getTransparent0d7_KjU3, jM6725getTransparent0d7_KjU2, composerStartRestartGroup, (i23 << 12) | 3504, 0);
                                if (cellState.getIsEnabled()) {
                                    composerStartRestartGroup.startReplaceGroup(1966268036);
                                    i21 = i23;
                                    jM21456getPositive0d7_KjU2 = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21427getFg30d7_KjU();
                                    composerStartRestartGroup.endReplaceGroup();
                                } else {
                                    i21 = i23;
                                    if (cellState.isBid()) {
                                        composerStartRestartGroup.startReplaceGroup(1966269609);
                                        jM21456getPositive0d7_KjU2 = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21452getNegative0d7_KjU();
                                        composerStartRestartGroup.endReplaceGroup();
                                    } else {
                                        composerStartRestartGroup.startReplaceGroup(1966270985);
                                        jM21456getPositive0d7_KjU2 = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21456getPositive0d7_KjU();
                                        composerStartRestartGroup.endReplaceGroup();
                                    }
                                }
                                long j = jM21456getPositive0d7_KjU2;
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue4 == companion.getEmpty()) {
                                    objRememberedValue4 = SnapshotIntState3.mutableIntStateOf(0);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                }
                                snapshotIntState2 = (SnapshotIntState2) objRememberedValue4;
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue5 == companion.getEmpty()) {
                                    objRememberedValue5 = InteractionSource2.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                }
                                interactionSource3 = (InteractionSource3) objRememberedValue5;
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                                Float f6 = f3;
                                if (objRememberedValue6 == companion.getEmpty()) {
                                    objRememberedValue6 = SnapshotFloatState3.mutableFloatStateOf(0.0f);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                                }
                                snapshotFloatState2 = (SnapshotFloatState2) objRememberedValue6;
                                composerStartRestartGroup.endReplaceGroup();
                                function34 = function312;
                                TableCell2 tableCell2 = new TableCell2(snapshotFloatState2.getFloatValue());
                                float floatValue = snapshotFloatState2.getFloatValue();
                                composerStartRestartGroup.startReplaceGroup(5004770);
                                zChanged = composerStartRestartGroup.changed(floatValue);
                                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                                if (!zChanged || objRememberedValue7 == companion.getEmpty()) {
                                    objRememberedValue7 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.optionschain.sbschain.table.TableCellKt$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return TableCell3.TableBidAskCell$lambda$17$lambda$16(snapshotFloatState2);
                                        }
                                    });
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                                }
                                SnapshotState4 snapshotState4 = (SnapshotState4) objRememberedValue7;
                                composerStartRestartGroup.endReplaceGroup();
                                function35 = function313;
                                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
                                composerStartRestartGroup.startReplaceGroup(5004770);
                                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue8 == companion.getEmpty()) {
                                    objRememberedValue8 = new Function1() { // from class: com.robinhood.android.optionschain.sbschain.table.TableCellKt$$ExternalSyntheticLambda3
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return TableCell3.TableBidAskCell$lambda$20$lambda$19(snapshotIntState2, (LayoutCoordinates) obj);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifier3.onGloballyPositioned(modifierFillMaxSize$default, (Function1) objRememberedValue8);
                                Boolean boolValueOf2 = Boolean.valueOf(cellState.isSelected());
                                OptionLegBundleWithRowIndex legBundleWithRowIndex2 = cellState.getLegBundleWithRowIndex();
                                Object[] objArr = {boolValueOf2, legBundleWithRowIndex2 == null ? legBundleWithRowIndex2.getLegBundle() : null, spreadSelectionState2, Boolean.valueOf(cellState.getIsEnabled())};
                                composerStartRestartGroup.startReplaceGroup(-1224400529);
                                int i24 = i20 & 14;
                                zChangedInstance2 = (i24 != 4) | composerStartRestartGroup.changedInstance(cellState) | ((i22 & 112) != 32) | composerStartRestartGroup.changedInstance(spreadSelectionState2);
                                objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                                if (!zChangedInstance2 || objRememberedValue9 == companion.getEmpty()) {
                                    Function1<? super DragTarget, Unit> function17 = function16;
                                    objRememberedValue9 = new TableCell5(bidAsk, function17, spreadSelectionState2, i, snapshotIntState2);
                                    cellState = bidAsk;
                                    function12 = function17;
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                                } else {
                                    cellState = bidAsk;
                                    function12 = function16;
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(SuspendingPointerInputFilterKt.pointerInput(modifierOnGloballyPositioned, objArr, (PointerInputEventHandler) objRememberedValue9), !cellState.isBid() ? TableConstants.getBidAskCellOuterPadding() : TableConstants.getBidAskCellInnerPadding(), 0.0f, !cellState.isBid() ? TableConstants.getBidAskCellInnerPadding() : TableConstants.getBidAskCellOuterPadding(), 0.0f, 10, null);
                                Alignment.Companion companion3 = Alignment.INSTANCE;
                                Modifier modifier5 = modifier4;
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
                                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                function13 = function12;
                                Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
                                SpreadSelectionState spreadSelectionState4 = spreadSelectionState2;
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                                setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                Modifier.Companion companion5 = Modifier.INSTANCE;
                                Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion5, 0.0f, 1, null);
                                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                int i25 = BentoTheme.$stable;
                                Modifier modifierBorder = BorderKt.border(Clip.clip(PaddingKt.m5143paddingVpY3zN4(modifierFillMaxSize$default2, bentoTheme2.getSpacing(composerStartRestartGroup, i25).m21597getXxsmallD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i25).m21593getSmallD9Ej5fM()), TableBidAskCell$lambda$18(snapshotState4)), borderStrokeM4886BorderStrokecXLIe8U, tableCell2);
                                if (cellState.getLoadingStyle() == LoadingStyle.NONE) {
                                    modifierBorder = IndicationKt.indication(modifierBorder, interactionSource3, RippleKt.m5937rippleH2RKhps$default(false, 0.0f, 0L, 7, null));
                                }
                                Boolean boolValueOf3 = Boolean.valueOf(cellState.isSelected());
                                Boolean boolValueOf4 = Boolean.valueOf(cellState.getWatchlistIndicator());
                                OptionLegBundleWithRowIndex legBundleWithRowIndex3 = cellState.getLegBundleWithRowIndex();
                                Object[] objArr2 = {boolValueOf3, boolValueOf4, legBundleWithRowIndex3 == null ? legBundleWithRowIndex3.getLegBundle() : null, cellState.getDisableType()};
                                composerStartRestartGroup.startReplaceGroup(-1224400529);
                                zChangedInstance3 = ((i22 & 1879048192) != 536870912) | (i24 != 4) | composerStartRestartGroup.changedInstance(cellState) | composerStartRestartGroup.changedInstance(coroutineScope) | ((i22 & 234881024) != 67108864) | ((i22 & 29360128) != 8388608);
                                objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                                if (!zChangedInstance3 || objRememberedValue10 == companion.getEmpty()) {
                                    Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> function315 = function314;
                                    objRememberedValue10 = new TableCell6(function315, function13, cellState, coroutineScope, interactionSource3, function35, function34);
                                    function36 = function315;
                                    function14 = function13;
                                    function37 = function35;
                                    function38 = function34;
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                                } else {
                                    function14 = function13;
                                    function38 = function34;
                                    function37 = function35;
                                    function36 = function314;
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                CardKt.Card(SuspendingPointerInputFilterKt.pointerInput(modifierBorder, objArr2, (PointerInputEventHandler) objRememberedValue10), TableBidAskCell$lambda$18(snapshotState4), cardColorsM5729cardColorsro_MJ88, cardDefaults.m5730cardElevationaqJV_2Y(C2002Dp.m7995constructorimpl(0), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, (i21 << 18) | 6, 62), null, ComposableLambda3.rememberComposableLambda(-2265079, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionschain.sbschain.table.TableCellKt$TableBidAskCell$4$3
                                    public final void invoke(Column5 Card, Composer composer3, int i26) {
                                        Intrinsics.checkNotNullParameter(Card, "$this$Card");
                                        if ((i26 & 17) == 16 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-2265079, i26, -1, "com.robinhood.android.optionschain.sbschain.table.TableBidAskCell.<anonymous>.<anonymous> (TableCell.kt:322)");
                                        }
                                        Modifier.Companion companion6 = Modifier.INSTANCE;
                                        Modifier modifierFillMaxSize$default3 = SizeKt.fillMaxSize$default(companion6, 0.0f, 1, null);
                                        Alignment center = Alignment.INSTANCE.getCenter();
                                        TableCellState.BidAsk bidAsk2 = cellState;
                                        long j2 = jM21456getPositive0d7_KjU;
                                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                                        int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierFillMaxSize$default3);
                                        ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor2 = companion7.getConstructor();
                                        if (composer3.getApplier() == null) {
                                            Composables.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer3.createNode(constructor2);
                                        } else {
                                            composer3.useNode();
                                        }
                                        Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer3);
                                        Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, companion7.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap2, companion7.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion7.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                            composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                            composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier2, companion7.getSetModifier());
                                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                        BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                                        int i27 = BentoTheme.$stable;
                                        long jM7662getFontSizeXSAIIZE = bentoTheme3.getTypography(composer3, i27).getTextS().m7662getFontSizeXSAIIZE();
                                        String value = bidAsk2.getContent().getValue();
                                        if (value == null) {
                                            value = "-";
                                        }
                                        TextStyle textS = bentoTheme3.getTypography(composer3, i27).getTextS();
                                        float fontScale = ((Density) composer3.consume(CompositionLocalsKt.getLocalDensity())).getFontScale();
                                        TextUnit2.m8082checkArithmeticR2X_6o(jM7662getFontSizeXSAIIZE);
                                        BentoText2.m20747BentoText38GnDrw(value, PltModifiers.recordLoadingState$default(companion6, bidAsk2.getContent().getValue() == null, null, 2, null), Color.m6701boximpl(j2), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 1, 0, null, 0, TextStyle.m7655copyp1EtxEg$default(textS, 0L, TextUnit2.pack(TextUnit.m8072getRawTypeimpl(jM7662getFontSizeXSAIIZE), TextUnit.m8074getValueimpl(jM7662getFontSizeXSAIIZE) / fontScale), FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777209, null), composer3, 805306368, 0, 7608);
                                        composer3.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer3, Integer num) {
                                        invoke(column5, composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }
                                }, composerStartRestartGroup, 54), composerStartRestartGroup, 196608, 16);
                                Modifier modifierAlign = boxScopeInstance.align(companion5, companion3.getTopEnd());
                                composerStartRestartGroup.startReplaceGroup(5004770);
                                objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue11 == companion.getEmpty()) {
                                    objRememberedValue11 = new Function1() { // from class: com.robinhood.android.optionschain.sbschain.table.TableCellKt$$ExternalSyntheticLambda4
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return TableCell3.TableBidAskCell$lambda$27$lambda$25$lambda$24(snapshotFloatState2, (IntSize) obj);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                Modifier modifierOnSizeChanged = OnRemeasuredModifier2.onSizeChanged(modifierAlign, (Function1) objRememberedValue11);
                                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion3.getCenterVertically(), composerStartRestartGroup, 48);
                                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierOnSizeChanged);
                                Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                    composerStartRestartGroup.useNode();
                                } else {
                                    composerStartRestartGroup.createNode(constructor2);
                                }
                                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                                setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                                Row6 row6 = Row6.INSTANCE;
                                Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                                composerStartRestartGroup.startReplaceGroup(-2105269227);
                                if (cellState.getPositionIndicator() == null) {
                                    bentoTheme = bentoTheme2;
                                    BentoText2.m20747BentoText38GnDrw(cellState.getPositionIndicator(), null, Color.m6701boximpl(j), null, null, null, null, 0, false, 1, 0, null, 0, TextStyle.m7655copyp1EtxEg$default(bentoTheme.getTypography(composerStartRestartGroup, i25).getTextAnnotation(), 0L, TextUnit2.getSp(11 / density.getFontScale()), FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777209, null), composerStartRestartGroup, 805306368, 0, 7674);
                                } else {
                                    bentoTheme = bentoTheme2;
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.startReplaceGroup(-2105245715);
                                if (cellState.getWatchlistIndicator()) {
                                    BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size12(ServerToBentoAssetMapper2.CHECKMARK_12), null, j, PaddingKt.m5144paddingVpY3zN4$default(companion5, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i25).m21597getXxsmallD9Ej5fM(), 1, null), null, false, composerStartRestartGroup, BentoIcon4.Size12.$stable | 48, 48);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.endNode();
                                composerStartRestartGroup.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                function39 = function38;
                                function310 = function37;
                                composer2 = composerStartRestartGroup;
                                function311 = function36;
                                function15 = function14;
                                modifier3 = modifier5;
                                spreadSelectionState3 = spreadSelectionState4;
                                dragTarget4 = dragTarget3;
                                z6 = z5;
                                function03 = function06;
                                f4 = f6;
                            }
                            LoadingStyle loadingStyle3 = cellState.getLoadingStyle();
                            LoadingStyle loadingStyle22 = LoadingStyle.NUX;
                            if (loadingStyle3 == loadingStyle22) {
                            }
                            z3 = z7;
                            if (cellState.getLoadingStyle() == loadingStyle22) {
                            }
                            if (cellState.getIsEnabled()) {
                            }
                            if (cellState.isSelected()) {
                                if (cellState.getIsEnabled()) {
                                }
                                if (f3 == null) {
                                }
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                companion = Composer.INSTANCE;
                                int i222 = i5;
                                if (objRememberedValue2 != companion.getEmpty()) {
                                }
                                snapshotState = (SnapshotState) objRememberedValue2;
                                composerStartRestartGroup.endReplaceGroup();
                                SnapshotState4<Float> snapshotState4AnimateFloatAsState2 = AnimateAsState.animateFloatAsState(!TableBidAskCell$lambda$5(snapshotState) ? 0.2f : 0.0f, AnimationSpecKt.tween$default(400, 0, null, 6, null), 0.0f, null, null, composerStartRestartGroup, 48, 28);
                                Boolean boolValueOf5 = Boolean.valueOf(z4);
                                composerStartRestartGroup.startReplaceGroup(-1224400529);
                                zChangedInstance = ((i222 & 3670016) != 1048576) | composerStartRestartGroup.changedInstance(coroutineScope2) | ((i20 & 112) != 32);
                                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (zChangedInstance) {
                                    Function0<Unit> function052 = function04;
                                    boolean z82 = z4;
                                    objRememberedValue3 = new TableCell4(z82, coroutineScope2, function052, snapshotState, null);
                                    z5 = z82;
                                    coroutineScope = coroutineScope2;
                                    function02 = function052;
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                    composerStartRestartGroup.endReplaceGroup();
                                    Function0<Unit> function062 = function02;
                                    EffectsKt.LaunchedEffect(boolValueOf5, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, (i222 >> 18) & 14);
                                    CardDefaults cardDefaults2 = CardDefaults.INSTANCE;
                                    Color.Companion companion22 = Color.INSTANCE;
                                    long jM6725getTransparent0d7_KjU4 = companion22.m6725getTransparent0d7_KjU();
                                    if (!z3) {
                                    }
                                    long jM6725getTransparent0d7_KjU22 = companion22.m6725getTransparent0d7_KjU();
                                    long jM6725getTransparent0d7_KjU32 = companion22.m6725getTransparent0d7_KjU();
                                    int i232 = CardDefaults.$stable;
                                    CardColors cardColorsM5729cardColorsro_MJ882 = cardDefaults2.m5729cardColorsro_MJ88(jM6705copywmQWz5c$default, jM6725getTransparent0d7_KjU4, jM6725getTransparent0d7_KjU32, jM6725getTransparent0d7_KjU22, composerStartRestartGroup, (i232 << 12) | 3504, 0);
                                    if (cellState.getIsEnabled()) {
                                    }
                                    long j2 = jM21456getPositive0d7_KjU2;
                                    composerStartRestartGroup.startReplaceGroup(1849434622);
                                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue4 == companion.getEmpty()) {
                                    }
                                    snapshotIntState2 = (SnapshotIntState2) objRememberedValue4;
                                    composerStartRestartGroup.endReplaceGroup();
                                    composerStartRestartGroup.startReplaceGroup(1849434622);
                                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue5 == companion.getEmpty()) {
                                    }
                                    interactionSource3 = (InteractionSource3) objRememberedValue5;
                                    composerStartRestartGroup.endReplaceGroup();
                                    composerStartRestartGroup.startReplaceGroup(1849434622);
                                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                                    Float f62 = f3;
                                    if (objRememberedValue6 == companion.getEmpty()) {
                                    }
                                    snapshotFloatState2 = (SnapshotFloatState2) objRememberedValue6;
                                    composerStartRestartGroup.endReplaceGroup();
                                    function34 = function312;
                                    TableCell2 tableCell22 = new TableCell2(snapshotFloatState2.getFloatValue());
                                    float floatValue2 = snapshotFloatState2.getFloatValue();
                                    composerStartRestartGroup.startReplaceGroup(5004770);
                                    zChanged = composerStartRestartGroup.changed(floatValue2);
                                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                                    if (!zChanged) {
                                        objRememberedValue7 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.optionschain.sbschain.table.TableCellKt$$ExternalSyntheticLambda2
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return TableCell3.TableBidAskCell$lambda$17$lambda$16(snapshotFloatState2);
                                            }
                                        });
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                                        SnapshotState4 snapshotState42 = (SnapshotState4) objRememberedValue7;
                                        composerStartRestartGroup.endReplaceGroup();
                                        function35 = function313;
                                        Modifier modifierFillMaxSize$default3 = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
                                        composerStartRestartGroup.startReplaceGroup(5004770);
                                        objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                                        if (objRememberedValue8 == companion.getEmpty()) {
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        Modifier modifierOnGloballyPositioned2 = OnGloballyPositionedModifier3.onGloballyPositioned(modifierFillMaxSize$default3, (Function1) objRememberedValue8);
                                        Boolean boolValueOf22 = Boolean.valueOf(cellState.isSelected());
                                        OptionLegBundleWithRowIndex legBundleWithRowIndex22 = cellState.getLegBundleWithRowIndex();
                                        Object[] objArr3 = {boolValueOf22, legBundleWithRowIndex22 == null ? legBundleWithRowIndex22.getLegBundle() : null, spreadSelectionState2, Boolean.valueOf(cellState.getIsEnabled())};
                                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                                        int i242 = i20 & 14;
                                        zChangedInstance2 = (i242 != 4) | composerStartRestartGroup.changedInstance(cellState) | ((i222 & 112) != 32) | composerStartRestartGroup.changedInstance(spreadSelectionState2);
                                        objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                                        if (zChangedInstance2) {
                                            Function1<? super DragTarget, Unit> function172 = function16;
                                            objRememberedValue9 = new TableCell5(bidAsk, function172, spreadSelectionState2, i, snapshotIntState2);
                                            cellState = bidAsk;
                                            function12 = function172;
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                                            composerStartRestartGroup.endReplaceGroup();
                                            Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(SuspendingPointerInputFilterKt.pointerInput(modifierOnGloballyPositioned2, objArr3, (PointerInputEventHandler) objRememberedValue9), !cellState.isBid() ? TableConstants.getBidAskCellOuterPadding() : TableConstants.getBidAskCellInnerPadding(), 0.0f, !cellState.isBid() ? TableConstants.getBidAskCellInnerPadding() : TableConstants.getBidAskCellOuterPadding(), 0.0f, 10, null);
                                            Alignment.Companion companion32 = Alignment.INSTANCE;
                                            Modifier modifier52 = modifier4;
                                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion32.getTopStart(), false);
                                            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default2);
                                            ComposeUiNode.Companion companion42 = ComposeUiNode.INSTANCE;
                                            function13 = function12;
                                            Function0<ComposeUiNode> constructor3 = companion42.getConstructor();
                                            if (composerStartRestartGroup.getApplier() == null) {
                                            }
                                            composerStartRestartGroup.startReusableNode();
                                            if (composerStartRestartGroup.getInserting()) {
                                            }
                                            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                                            SpreadSelectionState spreadSelectionState42 = spreadSelectionState2;
                                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion42.getSetMeasurePolicy());
                                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion42.getSetResolvedCompositionLocals());
                                            setCompositeKeyHash = companion42.getSetCompositeKeyHash();
                                            if (!composerM6388constructorimpl.getInserting()) {
                                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion42.getSetModifier());
                                                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                                Modifier.Companion companion52 = Modifier.INSTANCE;
                                                Modifier modifierFillMaxSize$default22 = SizeKt.fillMaxSize$default(companion52, 0.0f, 1, null);
                                                BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                                                int i252 = BentoTheme.$stable;
                                                Modifier modifierBorder2 = BorderKt.border(Clip.clip(PaddingKt.m5143paddingVpY3zN4(modifierFillMaxSize$default22, bentoTheme22.getSpacing(composerStartRestartGroup, i252).m21597getXxsmallD9Ej5fM(), bentoTheme22.getSpacing(composerStartRestartGroup, i252).m21593getSmallD9Ej5fM()), TableBidAskCell$lambda$18(snapshotState42)), borderStrokeM4886BorderStrokecXLIe8U, tableCell22);
                                                if (cellState.getLoadingStyle() == LoadingStyle.NONE) {
                                                }
                                                Boolean boolValueOf32 = Boolean.valueOf(cellState.isSelected());
                                                Boolean boolValueOf42 = Boolean.valueOf(cellState.getWatchlistIndicator());
                                                OptionLegBundleWithRowIndex legBundleWithRowIndex32 = cellState.getLegBundleWithRowIndex();
                                                Object[] objArr22 = {boolValueOf32, boolValueOf42, legBundleWithRowIndex32 == null ? legBundleWithRowIndex32.getLegBundle() : null, cellState.getDisableType()};
                                                composerStartRestartGroup.startReplaceGroup(-1224400529);
                                                zChangedInstance3 = ((i222 & 1879048192) != 536870912) | (i242 != 4) | composerStartRestartGroup.changedInstance(cellState) | composerStartRestartGroup.changedInstance(coroutineScope) | ((i222 & 234881024) != 67108864) | ((i222 & 29360128) != 8388608);
                                                objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                                                if (zChangedInstance3) {
                                                    Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> function3152 = function314;
                                                    objRememberedValue10 = new TableCell6(function3152, function13, cellState, coroutineScope, interactionSource3, function35, function34);
                                                    function36 = function3152;
                                                    function14 = function13;
                                                    function37 = function35;
                                                    function38 = function34;
                                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                                                    composerStartRestartGroup.endReplaceGroup();
                                                    CardKt.Card(SuspendingPointerInputFilterKt.pointerInput(modifierBorder2, objArr22, (PointerInputEventHandler) objRememberedValue10), TableBidAskCell$lambda$18(snapshotState42), cardColorsM5729cardColorsro_MJ882, cardDefaults2.m5730cardElevationaqJV_2Y(C2002Dp.m7995constructorimpl(0), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, (i21 << 18) | 6, 62), null, ComposableLambda3.rememberComposableLambda(-2265079, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionschain.sbschain.table.TableCellKt$TableBidAskCell$4$3
                                                        public final void invoke(Column5 Card, Composer composer3, int i26) {
                                                            Intrinsics.checkNotNullParameter(Card, "$this$Card");
                                                            if ((i26 & 17) == 16 && composer3.getSkipping()) {
                                                                composer3.skipToGroupEnd();
                                                                return;
                                                            }
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(-2265079, i26, -1, "com.robinhood.android.optionschain.sbschain.table.TableBidAskCell.<anonymous>.<anonymous> (TableCell.kt:322)");
                                                            }
                                                            Modifier.Companion companion6 = Modifier.INSTANCE;
                                                            Modifier modifierFillMaxSize$default32 = SizeKt.fillMaxSize$default(companion6, 0.0f, 1, null);
                                                            Alignment center = Alignment.INSTANCE.getCenter();
                                                            TableCellState.BidAsk bidAsk2 = cellState;
                                                            long j22 = jM21456getPositive0d7_KjU;
                                                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                                                            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                                            CompositionLocalMap currentCompositionLocalMap22 = composer3.getCurrentCompositionLocalMap();
                                                            Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composer3, modifierFillMaxSize$default32);
                                                            ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                                                            Function0<ComposeUiNode> constructor22 = companion7.getConstructor();
                                                            if (composer3.getApplier() == null) {
                                                                Composables.invalidApplier();
                                                            }
                                                            composer3.startReusableNode();
                                                            if (composer3.getInserting()) {
                                                                composer3.createNode(constructor22);
                                                            } else {
                                                                composer3.useNode();
                                                            }
                                                            Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer3);
                                                            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy22, companion7.getSetMeasurePolicy());
                                                            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap22, companion7.getSetResolvedCompositionLocals());
                                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion7.getSetCompositeKeyHash();
                                                            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                                                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                                                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                                            }
                                                            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier22, companion7.getSetModifier());
                                                            BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                                                            BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                                                            int i27 = BentoTheme.$stable;
                                                            long jM7662getFontSizeXSAIIZE = bentoTheme3.getTypography(composer3, i27).getTextS().m7662getFontSizeXSAIIZE();
                                                            String value = bidAsk2.getContent().getValue();
                                                            if (value == null) {
                                                                value = "-";
                                                            }
                                                            TextStyle textS = bentoTheme3.getTypography(composer3, i27).getTextS();
                                                            float fontScale = ((Density) composer3.consume(CompositionLocalsKt.getLocalDensity())).getFontScale();
                                                            TextUnit2.m8082checkArithmeticR2X_6o(jM7662getFontSizeXSAIIZE);
                                                            BentoText2.m20747BentoText38GnDrw(value, PltModifiers.recordLoadingState$default(companion6, bidAsk2.getContent().getValue() == null, null, 2, null), Color.m6701boximpl(j22), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 1, 0, null, 0, TextStyle.m7655copyp1EtxEg$default(textS, 0L, TextUnit2.pack(TextUnit.m8072getRawTypeimpl(jM7662getFontSizeXSAIIZE), TextUnit.m8074getValueimpl(jM7662getFontSizeXSAIIZE) / fontScale), FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777209, null), composer3, 805306368, 0, 7608);
                                                            composer3.endNode();
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                            }
                                                        }

                                                        @Override // kotlin.jvm.functions.Function3
                                                        public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer3, Integer num) {
                                                            invoke(column5, composer3, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }
                                                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 196608, 16);
                                                    Modifier modifierAlign2 = boxScopeInstance2.align(companion52, companion32.getTopEnd());
                                                    composerStartRestartGroup.startReplaceGroup(5004770);
                                                    objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                                                    if (objRememberedValue11 == companion.getEmpty()) {
                                                    }
                                                    composerStartRestartGroup.endReplaceGroup();
                                                    Modifier modifierOnSizeChanged2 = OnRemeasuredModifier2.onSizeChanged(modifierAlign2, (Function1) objRememberedValue11);
                                                    MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion32.getCenterVertically(), composerStartRestartGroup, 48);
                                                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                                    CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                                    Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierOnSizeChanged2);
                                                    Function0<ComposeUiNode> constructor22 = companion42.getConstructor();
                                                    if (composerStartRestartGroup.getApplier() == null) {
                                                    }
                                                    composerStartRestartGroup.startReusableNode();
                                                    if (composerStartRestartGroup.getInserting()) {
                                                    }
                                                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy2, companion42.getSetMeasurePolicy());
                                                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion42.getSetResolvedCompositionLocals());
                                                    setCompositeKeyHash2 = companion42.getSetCompositeKeyHash();
                                                    if (!composerM6388constructorimpl2.getInserting()) {
                                                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion42.getSetModifier());
                                                        Row6 row62 = Row6.INSTANCE;
                                                        Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                                                        composerStartRestartGroup.startReplaceGroup(-2105269227);
                                                        if (cellState.getPositionIndicator() == null) {
                                                        }
                                                        composerStartRestartGroup.endReplaceGroup();
                                                        composerStartRestartGroup.startReplaceGroup(-2105245715);
                                                        if (cellState.getWatchlistIndicator()) {
                                                        }
                                                        composerStartRestartGroup.endReplaceGroup();
                                                        composerStartRestartGroup.endNode();
                                                        composerStartRestartGroup.endNode();
                                                        if (ComposerKt.isTraceInProgress()) {
                                                        }
                                                        function39 = function38;
                                                        function310 = function37;
                                                        composer2 = composerStartRestartGroup;
                                                        function311 = function36;
                                                        function15 = function14;
                                                        modifier3 = modifier52;
                                                        spreadSelectionState3 = spreadSelectionState42;
                                                        dragTarget4 = dragTarget3;
                                                        z6 = z5;
                                                        function03 = function062;
                                                        f4 = f62;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionschain.sbschain.table.TableCellKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return TableCell3.TableBidAskCell$lambda$28(cellState, i, modifier3, spreadSelectionState3, f4, dragTarget4, z6, function39, function310, function311, function15, function03, i2, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i5 |= 24576;
                    f2 = f;
                    i9 = i4 & 32;
                    if (i9 != 0) {
                    }
                    i10 = i4 & 64;
                    if (i10 != 0) {
                    }
                    i11 = i4 & 128;
                    if (i11 != 0) {
                    }
                    i12 = i4 & 256;
                    if (i12 != 0) {
                    }
                    i13 = i4 & 512;
                    if (i13 != 0) {
                    }
                    i14 = i4 & 1024;
                    if (i14 != 0) {
                    }
                    i17 = i4 & 2048;
                    if (i17 != 0) {
                    }
                    i19 = i16;
                    if ((i5 & 306783379) == 306783378) {
                        if (i6 == 0) {
                        }
                        if (i7 != 0) {
                        }
                        if (i8 != 0) {
                        }
                        if (i9 == 0) {
                        }
                        if (i10 != 0) {
                        }
                        if (i11 == 0) {
                        }
                        if (i12 == 0) {
                        }
                        if (i13 == 0) {
                        }
                        if (i15 == 0) {
                        }
                        if (i18 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        }
                        CoroutineScope coroutineScope22 = (CoroutineScope) objRememberedValue;
                        if (dragTarget2 != null) {
                            i20 = i19;
                            LoadingStyle loadingStyle32 = cellState.getLoadingStyle();
                            LoadingStyle loadingStyle222 = LoadingStyle.NUX;
                            if (loadingStyle32 == loadingStyle222) {
                            }
                            z3 = z7;
                            if (cellState.getLoadingStyle() == loadingStyle222) {
                            }
                            if (cellState.getIsEnabled()) {
                            }
                            if (cellState.isSelected()) {
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                spreadSelectionState2 = spreadSelectionState;
                i8 = i4 & 16;
                if (i8 != 0) {
                }
                f2 = f;
                i9 = i4 & 32;
                if (i9 != 0) {
                }
                i10 = i4 & 64;
                if (i10 != 0) {
                }
                i11 = i4 & 128;
                if (i11 != 0) {
                }
                i12 = i4 & 256;
                if (i12 != 0) {
                }
                i13 = i4 & 512;
                if (i13 != 0) {
                }
                i14 = i4 & 1024;
                if (i14 != 0) {
                }
                i17 = i4 & 2048;
                if (i17 != 0) {
                }
                i19 = i16;
                if ((i5 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            modifier2 = modifier;
            i7 = i4 & 8;
            if (i7 != 0) {
            }
            spreadSelectionState2 = spreadSelectionState;
            i8 = i4 & 16;
            if (i8 != 0) {
            }
            f2 = f;
            i9 = i4 & 32;
            if (i9 != 0) {
            }
            i10 = i4 & 64;
            if (i10 != 0) {
            }
            i11 = i4 & 128;
            if (i11 != 0) {
            }
            i12 = i4 & 256;
            if (i12 != 0) {
            }
            i13 = i4 & 512;
            if (i13 != 0) {
            }
            i14 = i4 & 1024;
            if (i14 != 0) {
            }
            i17 = i4 & 2048;
            if (i17 != 0) {
            }
            i19 = i16;
            if ((i5 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        modifier2 = modifier;
        i7 = i4 & 8;
        if (i7 != 0) {
        }
        spreadSelectionState2 = spreadSelectionState;
        i8 = i4 & 16;
        if (i8 != 0) {
        }
        f2 = f;
        i9 = i4 & 32;
        if (i9 != 0) {
        }
        i10 = i4 & 64;
        if (i10 != 0) {
        }
        i11 = i4 & 128;
        if (i11 != 0) {
        }
        i12 = i4 & 256;
        if (i12 != 0) {
        }
        i13 = i4 & 512;
        if (i13 != 0) {
        }
        i14 = i4 & 1024;
        if (i14 != 0) {
        }
        i17 = i4 & 2048;
        if (i17 != 0) {
        }
        i19 = i16;
        if ((i5 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TableBidAskCell$lambda$6(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TableCell TableBidAskCell$lambda$17$lambda$16(SnapshotFloatState2 snapshotFloatState2) {
        return new TableCell(snapshotFloatState2.getFloatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TableBidAskCell$lambda$20$lambda$19(SnapshotIntState2 snapshotIntState2, LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        snapshotIntState2.setIntValue((int) Float.intBitsToFloat((int) (LayoutCoordinates2.positionInWindow(coordinates) >> 32)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TableBidAskCell$lambda$27$lambda$25$lambda$24(SnapshotFloatState2 snapshotFloatState2, IntSize intSize) {
        snapshotFloatState2.setFloatValue((int) (intSize.getPackedValue() >> 32));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void TableTextCell(final TableCellState.Text text, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        long jM21427getFg30d7_KjU;
        int i4;
        FontWeight normal;
        int i5;
        Modifier modifierM4872backgroundbw27NRU$default;
        String value;
        final Modifier modifier3;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-226228643);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(text) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-226228643, i3, -1, "com.robinhood.android.optionschain.sbschain.table.TableTextCell (TableCell.kt:377)");
                }
                if (!text.isEnabled()) {
                    composerStartRestartGroup.startReplaceGroup(-773651112);
                    int i7 = WhenMappings.$EnumSwitchMapping$0[text.getStyle().ordinal()];
                    if (i7 == 1) {
                        composerStartRestartGroup.startReplaceGroup(1637614272);
                        jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21426getFg20d7_KjU();
                        composerStartRestartGroup.endReplaceGroup();
                    } else if (i7 == 2) {
                        composerStartRestartGroup.startReplaceGroup(1637616287);
                        jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU();
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        if (i7 != 3) {
                            composerStartRestartGroup.startReplaceGroup(1637611802);
                            composerStartRestartGroup.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composerStartRestartGroup.startReplaceGroup(1637618271);
                        jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU();
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-773416256);
                    jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21427getFg30d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                }
                i4 = WhenMappings.$EnumSwitchMapping$0[text.getStyle().ordinal()];
                if (i4 == 1 || i4 == 2) {
                    normal = FontWeight.INSTANCE.getNormal();
                } else {
                    if (i4 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    normal = FontWeight.INSTANCE.getBold();
                }
                FontWeight fontWeight = normal;
                composerStartRestartGroup.startReplaceGroup(1637629159);
                i5 = WhenMappings.$EnumSwitchMapping$1[text.getLoadingStyle().ordinal()];
                if (i5 != 1) {
                    composerStartRestartGroup.startReplaceGroup(172429126);
                    modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(Clip.clip(modifier4, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(100))), BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21372getBg20d7_KjU(), null, 2, null);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (i5 == 2) {
                    composerStartRestartGroup.startReplaceGroup(1050422970);
                    TableCellTextStyle style = text.getStyle();
                    if (style == TableCellTextStyle.HEADER || style == TableCellTextStyle.STRIKE) {
                        modifierM4872backgroundbw27NRU$default = modifier4;
                    } else {
                        if (style != TableCellTextStyle.METRIC) {
                            throw new NoWhenBranchMatchedException();
                        }
                        modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(Clip.clip(modifier4, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(100))), BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21372getBg20d7_KjU(), null, 2, null);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    if (i5 != 3) {
                        composerStartRestartGroup.startReplaceGroup(172424683);
                        composerStartRestartGroup.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composerStartRestartGroup.startReplaceGroup(172443455);
                    composerStartRestartGroup.endReplaceGroup();
                    modifierM4872backgroundbw27NRU$default = modifier4;
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierRecordLoadingState$default = PltModifiers.recordLoadingState$default(modifierM4872backgroundbw27NRU$default, text.getContent().getValue() == null, null, 2, null);
                value = text.getContent().getValue();
                if (value == null) {
                    value = "-";
                }
                String str = value;
                modifier3 = modifier4;
                composer2 = composerStartRestartGroup;
                BentoText2.m20747BentoText38GnDrw(str, modifierRecordLoadingState$default, Color.m6701boximpl(jM21427getFg30d7_KjU), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 1, 0, null, 0, TextStyle.m7655copyp1EtxEg$default(BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getTextS(), 0L, 0L, fontWeight, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer2, 805306368, 0, 7608);
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionschain.sbschain.table.TableCellKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return TableCell3.TableTextCell$lambda$30(text, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i6 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (!text.isEnabled()) {
            }
            i4 = WhenMappings.$EnumSwitchMapping$0[text.getStyle().ordinal()];
            if (i4 == 1) {
                normal = FontWeight.INSTANCE.getNormal();
            } else {
                normal = FontWeight.INSTANCE.getNormal();
            }
            FontWeight fontWeight2 = normal;
            composerStartRestartGroup.startReplaceGroup(1637629159);
            i5 = WhenMappings.$EnumSwitchMapping$1[text.getLoadingStyle().ordinal()];
            if (i5 != 1) {
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierRecordLoadingState$default2 = PltModifiers.recordLoadingState$default(modifierM4872backgroundbw27NRU$default, text.getContent().getValue() == null, null, 2, null);
            value = text.getContent().getValue();
            if (value == null) {
            }
            String str2 = value;
            modifier3 = modifier4;
            composer2 = composerStartRestartGroup;
            BentoText2.m20747BentoText38GnDrw(str2, modifierRecordLoadingState$default2, Color.m6701boximpl(jM21427getFg30d7_KjU), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 1, 0, null, 0, TextStyle.m7655copyp1EtxEg$default(BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getTextS(), 0L, 0L, fontWeight2, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer2, 805306368, 0, 7608);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
