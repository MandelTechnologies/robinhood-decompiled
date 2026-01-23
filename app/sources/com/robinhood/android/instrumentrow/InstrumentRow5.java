package com.robinhood.android.instrumentrow;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material.Divider2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Alpha;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Shape;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p011ui.semantics.SemanticsProperties_androidKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.charts.Placeholders2;
import com.robinhood.android.charts.segmented.ScrubLineType;
import com.robinhood.android.charts.segmented.SegmentedLine;
import com.robinhood.android.charts.segmented.SegmentedLineChart;
import com.robinhood.android.futures.charts.sparkline.FuturesSparkline;
import com.robinhood.android.instrumentrow.InstrumentRow5;
import com.robinhood.android.instrumentrow.models.BackgroundColor;
import com.robinhood.android.instrumentrow.models.Text;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.onedaycharts.OneDayMiniChart;
import com.robinhood.android.onedaycharts.OneDayMiniChartDetails;
import com.robinhood.android.redesigninvesting.badges.p230ui.InvestingBadgeComposable;
import com.robinhood.android.ticker.TickerTextState;
import com.robinhood.android.ticker.WrappedTickerKt;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout8;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.util.ModifiersKt;
import com.robinhood.models.serverdriven.experimental.api.Direction;
import com.robinhood.models.serverdriven.experimental.api.InstrumentType;
import java.util.List;
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
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: InstrumentRow.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0013\u001a;\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\t\u0010\n\u001a4\u0010\u000e\u001a\u0015\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000b¢\u0006\u0002\b\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a_\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u001aU\u0010&\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u00102\b\u0010\u001f\u001a\u0004\u0018\u00010\u00102\u0006\u0010 \u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020!2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$H\u0003¢\u0006\u0004\b&\u0010'\u001a#\u0010)\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010(\u001a\u00020\u001aH\u0007¢\u0006\u0004\b)\u0010*\u001a\u000f\u0010+\u001a\u00020\u0007H\u0003¢\u0006\u0004\b+\u0010,\u001a\u000f\u0010-\u001a\u00020\u0007H\u0003¢\u0006\u0004\b-\u0010,\"\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100\"\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00100\"\u0014\u00102\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00100\"\u0014\u00103\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00100\"\u0014\u00104\u001a\u00020\u00048\u0000X\u0081T¢\u0006\u0006\n\u0004\b4\u00105\"\u0014\u00106\u001a\u00020\u00048\u0000X\u0081T¢\u0006\u0006\n\u0004\b6\u00105\"\u0014\u00107\u001a\u00020\u00048\u0000X\u0081T¢\u0006\u0006\n\u0004\b7\u00105\"\u0014\u00108\u001a\u00020\u00048\u0000X\u0081T¢\u0006\u0006\n\u0004\b8\u00105\"\u0014\u00109\u001a\u00020\u00048\u0000X\u0081T¢\u0006\u0006\n\u0004\b9\u00105\"\u001a\u0010:\u001a\u00020\u00048\u0002X\u0082T¢\u0006\f\n\u0004\b:\u00105\u0012\u0004\b;\u0010<\"\u001a\u0010=\u001a\u00020\u00048\u0002X\u0082T¢\u0006\f\n\u0004\b=\u00105\u0012\u0004\b>\u0010<\"\u001a\u0010?\u001a\u00020\u00048\u0002X\u0082T¢\u0006\f\n\u0004\b?\u00105\u0012\u0004\b@\u0010<¨\u0006A"}, m3636d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lcom/robinhood/android/instrumentrow/InstrumentRowState;", "state", "", "identifier", "Lkotlin/Function0;", "", "onTrailingTextClicked", "InstrumentRow", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/instrumentrow/InstrumentRowState;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Lkotlin/ExtensionFunctionType;", "getChartComposableCreator", "(Lcom/robinhood/android/instrumentrow/InstrumentRowState;Ljava/lang/String;)Lkotlin/jvm/functions/Function3;", "Lcom/robinhood/android/instrumentrow/models/Text;", "primaryText", "secondaryText", "", "secondaryTextMaxLines", "accountNumber", "Lcom/robinhood/models/serverdriven/experimental/api/InstrumentType;", "instrumentType", "Ljava/util/UUID;", "metadataId", "", "showPlaceHolder", InstrumentRow5.InstrumentRowStartTag, "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/instrumentrow/models/Text;Lcom/robinhood/android/instrumentrow/models/Text;ILjava/lang/String;Lcom/robinhood/models/serverdriven/experimental/api/InstrumentType;Ljava/util/UUID;ZLandroidx/compose/runtime/Composer;II)V", "trailingText", "trailingSecondaryText", "showTrailingTextInContainer", "Lcom/robinhood/android/instrumentrow/models/BackgroundColor;", "trailingTextBackgroundColor", "onClick", "Lcom/robinhood/models/serverdriven/experimental/api/Direction;", "iconDirection", InstrumentRow5.InstrumentRowEndTag, "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/instrumentrow/models/Text;Lcom/robinhood/android/instrumentrow/models/Text;ZLcom/robinhood/android/instrumentrow/models/BackgroundColor;Lkotlin/jvm/functions/Function0;Lcom/robinhood/models/serverdriven/experimental/api/Direction;Landroidx/compose/runtime/Composer;II)V", "showChartPlaceHolder", "LoadingInstrumentRow", "(Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "Loading", "(Landroidx/compose/runtime/Composer;I)V", "InstrumentRowDirectionIcons", "Landroidx/compose/ui/unit/Dp;", "InstrumentChartHeight", "F", "InstrumentRowFillCornerRadius", "InstrumentRowFillMinWidth", "InstrumentRowBorderWidth", "InstrumentRowStartTag", "Ljava/lang/String;", "InstrumentRowEndTag", "SegmentedLineChartTag", "OneDayMiniChartTag", "TrailingTextTag", "PlaceholderPrimaryText", "getPlaceholderPrimaryText$annotations", "()V", "PlaceholderSecondaryText", "getPlaceholderSecondaryText$annotations", "PlaceholderMetaText", "getPlaceholderMetaText$annotations", "lib-instrument-row_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.instrumentrow.InstrumentRowKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class InstrumentRow5 {
    public static final String InstrumentRowEndTag = "InstrumentRowEnd";
    public static final String InstrumentRowStartTag = "InstrumentRowStart";
    public static final String OneDayMiniChartTag = "OneDayMiniChart";
    private static final String PlaceholderMetaText = "$XXX.XX";
    private static final String PlaceholderPrimaryText = "XXXXX";
    private static final String PlaceholderSecondaryText = "XXX shares";
    public static final String SegmentedLineChartTag = "SegmentedLineChart";
    public static final String TrailingTextTag = "TrailingText";
    private static final float InstrumentChartHeight = C2002Dp.m7995constructorimpl(48);
    private static final float InstrumentRowFillCornerRadius = C2002Dp.m7995constructorimpl(6);
    private static final float InstrumentRowFillMinWidth = C2002Dp.m7995constructorimpl(88);
    private static final float InstrumentRowBorderWidth = C2002Dp.m7995constructorimpl(1);

    /* compiled from: InstrumentRow.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.instrumentrow.InstrumentRowKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[InstrumentType.values().length];
            try {
                iArr[InstrumentType.FUTURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InstrumentType.CRYPTO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InstrumentType.CRYPTO_PERPETUALS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InstrumentType.CRYPTO_TOKENIZED_STOCKS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[InstrumentType.EQUITY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[InstrumentType.INDEX.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Direction.values().length];
            try {
                iArr2[Direction.f5855UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[Direction.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstrumentRow$lambda$8(Modifier modifier, InstrumentRowState instrumentRowState, String str, Function0 function0, int i, int i2, Composer composer, int i3) {
        InstrumentRow(modifier, instrumentRowState, str, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstrumentRowDirectionIcons$lambda$27(int i, Composer composer, int i2) {
        InstrumentRowDirectionIcons(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstrumentRowEnd$lambda$20(Modifier modifier, Text text, Text text2, boolean z, BackgroundColor backgroundColor, Function0 function0, Direction direction, int i, int i2, Composer composer, int i3) {
        InstrumentRowEnd(modifier, text, text2, z, backgroundColor, function0, direction, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstrumentRowStart$lambda$11(Modifier modifier, Text text, Text text2, int i, String str, InstrumentType instrumentType, UUID uuid, boolean z, int i2, int i3, Composer composer, int i4) {
        InstrumentRowStart(modifier, text, text2, i, str, instrumentType, uuid, z, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Loading$lambda$26(int i, Composer composer, int i2) {
        Loading(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadingInstrumentRow$lambda$25(Modifier modifier, boolean z, int i, int i2, Composer composer, int i3) {
        LoadingInstrumentRow(modifier, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    private static /* synthetic */ void getPlaceholderMetaText$annotations() {
    }

    private static /* synthetic */ void getPlaceholderPrimaryText$annotations() {
    }

    private static /* synthetic */ void getPlaceholderSecondaryText$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InstrumentRow(Modifier modifier, final InstrumentRowState state, String str, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        String str2;
        int i4;
        Function0<Unit> function02;
        Function0<Unit> function03;
        Object objRememberedValue;
        Composer.Companion companion;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Function3<Row5, Composer, Integer, Unit> chartComposableCreator;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        Object objRememberedValue2;
        Modifier.Companion companion2;
        BentoTheme bentoTheme;
        int i5;
        Function0<Unit> function04;
        Modifier.Companion companion3;
        final Modifier modifier3;
        final String str3;
        final Function0<Unit> function05;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(1792308265);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(state) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                str2 = str;
                i3 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    function02 = function0;
                    i3 |= composerStartRestartGroup.changedInstance(function02) ? 2048 : 1024;
                }
                if ((i3 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    str3 = str2;
                    function05 = function02;
                } else {
                    Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                    String str4 = i7 == 0 ? "" : str2;
                    if (i4 == 0) {
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function0() { // from class: com.robinhood.android.instrumentrow.InstrumentRowKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        function03 = (Function0) objRememberedValue3;
                    } else {
                        function03 = function02;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1792308265, i3, -1, "com.robinhood.android.instrumentrow.InstrumentRow (InstrumentRow.kt:108)");
                    }
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: com.robinhood.android.instrumentrow.InstrumentRowKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return InstrumentRow5.InstrumentRow$lambda$3$lambda$2((SemanticsPropertyReceiver) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierSemantics$default = SemanticsModifier6.semantics$default(modifier4, false, (Function1) objRememberedValue, 1, null);
                    Alignment.Companion companion4 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierSemantics$default);
                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion5.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion5.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion5.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion5.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    chartComposableCreator = getChartComposableCreator(state, str4);
                    Alignment.Vertical centerVertically = companion4.getCenterVertically();
                    Modifier.Companion companion6 = Modifier.INSTANCE;
                    Modifier modifierAlign = boxScopeInstance.align(PaddingKt.m5143paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), state.getRemoveHorizontalPadding() ? BentoBaseRowLayout8.INSTANCE.m21050getPaddingHorizontalD9Ej5fM() : C2002Dp.m7995constructorimpl(0), state.getRemoveVerticalPadding() ? BentoBaseRowLayout8.INSTANCE.m21051getPaddingVerticalD9Ej5fM() : C2002Dp.m7995constructorimpl(0)), companion4.getCenterStart());
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composerStartRestartGroup, 48);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAlign);
                    Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion5.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion5.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    Modifier modifierTestTag = TestTag3.testTag(Row5.weight$default(row6, companion6, 1.0f, false, 2, null), InstrumentRowStartTag);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new Function1() { // from class: com.robinhood.android.instrumentrow.InstrumentRowKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return InstrumentRow5.InstrumentRow$lambda$7$lambda$6$lambda$5$lambda$4((SemanticsPropertyReceiver) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierSemantics$default2 = SemanticsModifier6.semantics$default(modifierTestTag, false, (Function1) objRememberedValue2, 1, null);
                    int i8 = i3;
                    Modifier modifier5 = modifier4;
                    String str5 = str4;
                    InstrumentRowStart(modifierSemantics$default2, state.getPrimaryText(), state.getSecondaryText(), state.getSecondaryTextMaxLines(), state.getAccountNumber(), state.getInstrumentType(), state.getMetadataId(), false, composerStartRestartGroup, 0, 128);
                    composerStartRestartGroup = composerStartRestartGroup;
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i9 = BentoTheme.$stable;
                    Spacer2.Spacer(SizeKt.m5169size3ABfNKs(companion6, bentoTheme2.getSpacing(composerStartRestartGroup, i9).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                    if (chartComposableCreator == null) {
                        composerStartRestartGroup.startReplaceGroup(1412991521);
                        chartComposableCreator.invoke(row6, composerStartRestartGroup, 6);
                        if (state.getTrailingText().getValue().length() > 0) {
                            Spacer2.Spacer(SizeKt.m5169size3ABfNKs(companion6, bentoTheme2.getSpacing(composerStartRestartGroup, i9).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                            companion2 = companion6;
                            Spacer2.Spacer(Row5.weight$default(row6, companion6, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                        } else {
                            companion2 = companion6;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        bentoTheme = bentoTheme2;
                        i5 = i9;
                        function04 = function03;
                    } else {
                        companion2 = companion6;
                        if (state.getTrailingText().getValue().length() > 0) {
                            composerStartRestartGroup.startReplaceGroup(1413662640);
                            i5 = i9;
                            bentoTheme = bentoTheme2;
                            function04 = function03;
                            InstrumentRowEnd(ModifiersKt.bentoPlaceholder$default(companion2, state.isDisplayTypeLoading(), null, 2, null), state.getTrailingText(), state.getTrailingSecondaryText(), state.getShowTrailingTextInContainer(), state.getTrailingTextBackgroundColor(), function04, state.getIconDirection(), composerStartRestartGroup, (i8 << 6) & 458752, 0);
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            bentoTheme = bentoTheme2;
                            i5 = i9;
                            function04 = function03;
                            composerStartRestartGroup.startReplaceGroup(1414430479);
                            composerStartRestartGroup.endReplaceGroup();
                        }
                    }
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.startReplaceGroup(1459896684);
                    if (chartComposableCreator != null || state.getTrailingText().getValue().length() <= 0) {
                        companion3 = companion2;
                    } else {
                        Modifier.Companion companion7 = companion2;
                        companion3 = companion7;
                        InstrumentRowEnd(boxScopeInstance.align(ModifiersKt.bentoPlaceholder$default(PaddingKt.m5146paddingqDBjuR0$default(companion7, 0.0f, 0.0f, BentoBaseRowLayout8.INSTANCE.m21050getPaddingHorizontalD9Ej5fM(), 0.0f, 11, null), state.isDisplayTypeLoading(), null, 2, null), companion4.getCenterEnd()), state.getTrailingText(), state.getTrailingSecondaryText(), state.getShowTrailingTextInContainer(), state.getTrailingTextBackgroundColor(), function04, state.getIconDirection(), composerStartRestartGroup, (i8 << 6) & 458752, 0);
                    }
                    Function0<Unit> function06 = function04;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1459920069);
                    if (state.getShowDivider()) {
                        Divider2.m5581DivideroMI9zvI(boxScopeInstance.align(PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 0.0f, 2, null), companion4.getBottomStart()), bentoTheme.getColors(composerStartRestartGroup, i5).m21373getBg30d7_KjU(), C2002Dp.m7995constructorimpl(1), 0.0f, composerStartRestartGroup, 384, 8);
                        composerStartRestartGroup = composerStartRestartGroup;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                    str3 = str5;
                    function05 = function06;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.instrumentrow.InstrumentRowKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return InstrumentRow5.InstrumentRow$lambda$8(modifier3, state, str3, function05, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            function02 = function0;
            if ((i3 & 1171) == 1170) {
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierSemantics$default3 = SemanticsModifier6.semantics$default(modifier4, false, (Function1) objRememberedValue, 1, null);
                Alignment.Companion companion42 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion42.getTopStart(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierSemantics$default3);
                ComposeUiNode.Companion companion52 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor3 = companion52.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion52.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion52.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion52.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion52.getSetModifier());
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    chartComposableCreator = getChartComposableCreator(state, str4);
                    Alignment.Vertical centerVertically2 = companion42.getCenterVertically();
                    Modifier.Companion companion62 = Modifier.INSTANCE;
                    Modifier modifierAlign2 = boxScopeInstance2.align(PaddingKt.m5143paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion62, 0.0f, 1, null), state.getRemoveHorizontalPadding() ? BentoBaseRowLayout8.INSTANCE.m21050getPaddingHorizontalD9Ej5fM() : C2002Dp.m7995constructorimpl(0), state.getRemoveVerticalPadding() ? BentoBaseRowLayout8.INSTANCE.m21051getPaddingVerticalD9Ej5fM() : C2002Dp.m7995constructorimpl(0)), companion42.getCenterStart());
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composerStartRestartGroup, 48);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAlign2);
                    Function0<ComposeUiNode> constructor22 = companion52.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy2, companion52.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion52.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion52.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting()) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion52.getSetModifier());
                        Row6 row62 = Row6.INSTANCE;
                        Modifier modifierTestTag2 = TestTag3.testTag(Row5.weight$default(row62, companion62, 1.0f, false, 2, null), InstrumentRowStartTag);
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierSemantics$default22 = SemanticsModifier6.semantics$default(modifierTestTag2, false, (Function1) objRememberedValue2, 1, null);
                        int i82 = i3;
                        Modifier modifier52 = modifier4;
                        String str52 = str4;
                        InstrumentRowStart(modifierSemantics$default22, state.getPrimaryText(), state.getSecondaryText(), state.getSecondaryTextMaxLines(), state.getAccountNumber(), state.getInstrumentType(), state.getMetadataId(), false, composerStartRestartGroup, 0, 128);
                        composerStartRestartGroup = composerStartRestartGroup;
                        BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                        int i92 = BentoTheme.$stable;
                        Spacer2.Spacer(SizeKt.m5169size3ABfNKs(companion62, bentoTheme22.getSpacing(composerStartRestartGroup, i92).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                        if (chartComposableCreator == null) {
                        }
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.startReplaceGroup(1459896684);
                        if (chartComposableCreator != null) {
                            companion3 = companion2;
                            Function0<Unit> function062 = function04;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(1459920069);
                            if (state.getShowDivider()) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier52;
                            str3 = str52;
                            function05 = function062;
                        }
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        str2 = str;
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        function02 = function0;
        if ((i3 & 1171) == 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstrumentRow$lambda$3$lambda$2(SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.selectableGroup(semantics);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstrumentRow$lambda$7$lambda$6$lambda$5$lambda$4(SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsProperties_androidKt.setTestTagsAsResourceId(semantics, true);
        return Unit.INSTANCE;
    }

    static /* synthetic */ Function3 getChartComposableCreator$default(InstrumentRowState instrumentRowState, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        return getChartComposableCreator(instrumentRowState, str);
    }

    private static final Function3<Row5, Composer, Integer, Unit> getChartComposableCreator(final InstrumentRowState instrumentRowState, String str) {
        if (instrumentRowState.getMetadataId() != null && instrumentRowState.getInstrumentType() != null) {
            InstrumentType instrumentType = instrumentRowState.getInstrumentType();
            switch (instrumentType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[instrumentType.ordinal()]) {
                case 1:
                    return ComposableLambda3.composableLambdaInstance(-353792298, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.instrumentrow.InstrumentRowKt.getChartComposableCreator.1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) {
                            invoke(row5, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Row5 row5, Composer composer, int i) {
                            Intrinsics.checkNotNullParameter(row5, "<this>");
                            if ((i & 6) == 0) {
                                i |= composer.changed(row5) ? 4 : 2;
                            }
                            if ((i & 19) == 18 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-353792298, i, -1, "com.robinhood.android.instrumentrow.getChartComposableCreator.<anonymous> (InstrumentRow.kt:200)");
                            }
                            FuturesSparkline.FuturesSparkline(instrumentRowState.getMetadataId(), ModifiersKt.isInvisible(PaddingKt.m5144paddingVpY3zN4$default(SizeKt.m5156height3ABfNKs(Row5.weight$default(row5, Clip.clipToBounds(Modifier.INSTANCE), 1.0f, false, 2, null), InstrumentRow5.InstrumentChartHeight), 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 1, null), instrumentRowState.isDisplayTypeLoading()), composer, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    });
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    return ComposableLambda3.composableLambdaInstance(2106418495, true, new C189512(instrumentRowState, str));
            }
        }
        List<SegmentedLine> chartLines = instrumentRowState.getChartLines();
        if (chartLines == null || chartLines.isEmpty()) {
            return null;
        }
        return ComposableLambda3.composableLambdaInstance(1841493781, true, new C189523(instrumentRowState));
    }

    /* compiled from: InstrumentRow.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.instrumentrow.InstrumentRowKt$getChartComposableCreator$2 */
    static final class C189512 implements Function3<Row5, Composer, Integer, Unit> {
        final /* synthetic */ String $identifier;
        final /* synthetic */ InstrumentRowState $state;

        /* compiled from: InstrumentRow.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.instrumentrow.InstrumentRowKt$getChartComposableCreator$2$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[InstrumentType.values().length];
                try {
                    iArr[InstrumentType.CRYPTO.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[InstrumentType.CRYPTO_PERPETUALS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[InstrumentType.CRYPTO_TOKENIZED_STOCKS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[InstrumentType.EQUITY.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[InstrumentType.INDEX.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        C189512(InstrumentRowState instrumentRowState, String str) {
            this.$state = instrumentRowState;
            this.$identifier = str;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) {
            invoke(row5, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Row5 row5, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(row5, "<this>");
            if ((i & 6) == 0) {
                i2 = (composer.changed(row5) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2106418495, i2, -1, "com.robinhood.android.instrumentrow.getChartComposableCreator.<anonymous> (InstrumentRow.kt:217)");
            }
            UUID metadataId = this.$state.getMetadataId();
            InstrumentType instrumentType = this.$state.getInstrumentType();
            int i3 = instrumentType != null ? WhenMappings.$EnumSwitchMapping$0[instrumentType.ordinal()] : -1;
            OneDayMiniChartDetails oneDayMiniChartDetails = new OneDayMiniChartDetails(metadataId, i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? i3 != 5 ? com.robinhood.models.onedaycharts.api.InstrumentType.UNKNOWN : com.robinhood.models.onedaycharts.api.InstrumentType.INDEX : com.robinhood.models.onedaycharts.api.InstrumentType.EQUITY : com.robinhood.models.onedaycharts.api.InstrumentType.CRYPTO_TOKENIZED_STOCKS : com.robinhood.models.onedaycharts.api.InstrumentType.CRYPTO_PERPETUALS : com.robinhood.models.onedaycharts.api.InstrumentType.CRYPTO);
            Modifier modifierTestTag = TestTag3.testTag(ModifiersKt.isInvisible(PaddingKt.m5144paddingVpY3zN4$default(SizeKt.m5156height3ABfNKs(Row5.weight$default(row5, Clip.clipToBounds(Modifier.INSTANCE), 1.0f, false, 2, null), InstrumentRow5.InstrumentChartHeight), 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 1, null), this.$state.isDisplayTypeLoading()), InstrumentRow5.OneDayMiniChartTag);
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.instrumentrow.InstrumentRowKt$getChartComposableCreator$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return InstrumentRow5.C189512.invoke$lambda$1$lambda$0((SemanticsPropertyReceiver) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            OneDayMiniChart.OneDayMiniChart(oneDayMiniChartDetails, SemanticsModifier6.semantics$default(modifierTestTag, false, (Function1) objRememberedValue, 1, null), this.$identifier, null, false, composer, OneDayMiniChartDetails.$stable | 24576, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(SemanticsPropertyReceiver semantics) {
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            SemanticsProperties_androidKt.setTestTagsAsResourceId(semantics, true);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: InstrumentRow.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.instrumentrow.InstrumentRowKt$getChartComposableCreator$3 */
    static final class C189523 implements Function3<Row5, Composer, Integer, Unit> {
        final /* synthetic */ InstrumentRowState $state;

        C189523(InstrumentRowState instrumentRowState) {
            this.$state = instrumentRowState;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) {
            invoke(row5, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Row5 row5, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(row5, "<this>");
            if ((i & 6) == 0) {
                i2 = i | (composer.changed(row5) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1841493781, i2, -1, "com.robinhood.android.instrumentrow.getChartComposableCreator.<anonymous> (InstrumentRow.kt:252)");
            }
            ImmutableList3 persistentList = extensions2.toPersistentList(this.$state.getChartLines());
            ScrubLineType scrubLineType = ScrubLineType.SCRUBBING_DISABLED;
            Modifier modifierTestTag = TestTag3.testTag(ModifiersKt.isInvisible(PaddingKt.m5144paddingVpY3zN4$default(SizeKt.m5156height3ABfNKs(Row5.weight$default(row5, Clip.clipToBounds(Modifier.INSTANCE), 1.0f, false, 2, null), InstrumentRow5.InstrumentChartHeight), 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 1, null), this.$state.isDisplayTypeLoading()), InstrumentRow5.SegmentedLineChartTag);
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.instrumentrow.InstrumentRowKt$getChartComposableCreator$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return InstrumentRow5.C189523.invoke$lambda$1$lambda$0((SemanticsPropertyReceiver) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            SegmentedLineChart.SegmentedLineChart(persistentList, SemanticsModifier6.semantics$default(modifierTestTag, false, (Function1) objRememberedValue, 1, null), null, null, null, null, null, null, scrubLineType, false, null, composer, SegmentedLine.$stable | 100663296, 0, 1788);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(SemanticsPropertyReceiver semantics) {
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            SemanticsProperties_androidKt.setTestTagsAsResourceId(semantics, true);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d A[PHI: r15
      0x009d: PHI (r15v20 int) = (r15v0 int), (r15v5 int), (r15v6 int) binds: [B:58:0x009b, B:68:0x00b3, B:67:0x00b0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void InstrumentRowStart(Modifier modifier, final Text text, final Text text2, final int i, String str, InstrumentType instrumentType, UUID uuid, boolean z, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        Text text3;
        int i5;
        String str2;
        int i6;
        int i7;
        UUID uuid2;
        int i8;
        boolean z2;
        InstrumentType instrumentType2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Modifier.Companion companion;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        boolean z3;
        int i9;
        int i10;
        Shape shape;
        UUID uuid3;
        Composer composer2;
        InstrumentType instrumentType3;
        final boolean z4;
        Modifier.Companion companion2;
        final InstrumentType instrumentType4;
        final UUID uuid4;
        Composer composer3;
        final String str3;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(684250388);
        int i11 = i3 & 1;
        if (i11 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i4 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                text3 = text;
                i4 |= composerStartRestartGroup.changed(text3) ? 32 : 16;
            }
            if ((i3 & 4) == 0) {
                i4 |= 384;
            } else {
                if ((i2 & 384) == 0) {
                    i4 |= composerStartRestartGroup.changed(text2) ? 256 : 128;
                }
                if ((i3 & 8) != 0) {
                    i4 |= 3072;
                } else {
                    if ((i2 & 3072) == 0) {
                        i4 |= composerStartRestartGroup.changed(i) ? 2048 : 1024;
                    }
                    i5 = i3 & 16;
                    if (i5 != 0) {
                        if ((i2 & 24576) == 0) {
                            str2 = str;
                            i4 |= composerStartRestartGroup.changed(str2) ? 16384 : 8192;
                        }
                        i6 = i3 & 32;
                        int i12 = 196608;
                        if (i6 != 0) {
                            i4 |= i12;
                        } else if ((196608 & i2) == 0) {
                            i12 = composerStartRestartGroup.changed(instrumentType == null ? -1 : instrumentType.ordinal()) ? 131072 : 65536;
                            i4 |= i12;
                        }
                        i7 = i3 & 64;
                        if (i7 != 0) {
                            i4 |= 1572864;
                            uuid2 = uuid;
                        } else {
                            uuid2 = uuid;
                            if ((i2 & 1572864) == 0) {
                                i4 |= composerStartRestartGroup.changedInstance(uuid2) ? 1048576 : 524288;
                            }
                        }
                        i8 = i3 & 128;
                        if (i8 != 0) {
                            i4 |= 12582912;
                            z2 = z;
                        } else {
                            z2 = z;
                            if ((i2 & 12582912) == 0) {
                                i4 |= composerStartRestartGroup.changed(z2) ? 8388608 : 4194304;
                            }
                        }
                        if ((i4 & 4793491) == 4793490 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            instrumentType4 = instrumentType;
                            modifier3 = modifier2;
                            composer3 = composerStartRestartGroup;
                            uuid4 = uuid2;
                            str3 = str2;
                            z4 = z2;
                        } else {
                            Modifier modifier4 = i11 == 0 ? Modifier.INSTANCE : modifier2;
                            String str4 = i5 == 0 ? null : str2;
                            instrumentType2 = i6 == 0 ? null : instrumentType;
                            if (i7 != 0) {
                                uuid2 = null;
                            }
                            boolean z5 = i8 == 0 ? false : z2;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(684250388, i4, -1, "com.robinhood.android.instrumentrow.InstrumentRowStart (InstrumentRow.kt:280)");
                            }
                            Arrangement arrangement = Arrangement.INSTANCE;
                            Arrangement.Vertical top = arrangement.getTop();
                            Alignment.Companion companion3 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion3.getStart(), composerStartRestartGroup, 0);
                            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            String str5 = str4;
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                            Modifier modifier5 = modifier4;
                            Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
                            int i13 = i4;
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                            setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            Alignment.Vertical centerVertically = companion3.getCenterVertically();
                            companion = Modifier.INSTANCE;
                            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
                            currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion);
                            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (!composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor2);
                            } else {
                                composerStartRestartGroup.useNode();
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
                            z3 = z5;
                            Modifier modifierBentoPlaceholder$default = ModifiersKt.bentoPlaceholder$default(companion, z3, null, 2, null);
                            String value = text3.getValue();
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            i9 = BentoTheme.$stable;
                            TextStyle textM = bentoTheme.getTypography(composerStartRestartGroup, i9).getTextM();
                            long jM15355getColor0d7_KjU = text3.m15355getColor0d7_KjU();
                            TextOverflow.Companion companion5 = TextOverflow.INSTANCE;
                            BentoText2.m20747BentoText38GnDrw(value, modifierBentoPlaceholder$default, Color.m6701boximpl(jM15355getColor0d7_KjU), null, null, null, null, companion5.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, textM, composerStartRestartGroup, 817889280, 0, 7544);
                            composerStartRestartGroup.startReplaceGroup(-1817764027);
                            if (instrumentType2 != null || uuid2 == null || str5 == null) {
                                i10 = i9;
                                shape = null;
                                uuid3 = uuid2;
                                composer2 = composerStartRestartGroup;
                                instrumentType3 = instrumentType2;
                                z4 = z3;
                                companion2 = companion;
                            } else {
                                Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i9).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                                i10 = i9;
                                shape = null;
                                uuid3 = uuid2;
                                composer2 = composerStartRestartGroup;
                                instrumentType3 = instrumentType2;
                                z4 = z3;
                                companion2 = companion;
                                InvestingBadgeComposable.InvestingBadgeComposable(str5, instrumentType3, uuid3, null, composer2, (i13 >> 12) & 1022, 8);
                            }
                            composer2.endReplaceGroup();
                            composer2.endNode();
                            BentoText2.m20747BentoText38GnDrw(text2.getValue(), ModifiersKt.bentoPlaceholder$default(companion2, z4, shape, 2, shape), Color.m6701boximpl(text2.m15355getColor0d7_KjU()), null, null, null, null, companion5.m7959getEllipsisgIe3tQ8(), false, i, 0, null, 0, bentoTheme.getTypography(composer2, i10).getTextS(), composer2, ((i13 << 18) & 1879048192) | 12582912, 0, 7544);
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            instrumentType4 = instrumentType3;
                            uuid4 = uuid3;
                            composer3 = composer2;
                            str3 = str5;
                            modifier3 = modifier5;
                        }
                        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.instrumentrow.InstrumentRowKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return InstrumentRow5.InstrumentRowStart$lambda$11(modifier3, text, text2, i, str3, instrumentType4, uuid4, z4, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i4 |= 24576;
                    str2 = str;
                    i6 = i3 & 32;
                    int i122 = 196608;
                    if (i6 != 0) {
                    }
                    i7 = i3 & 64;
                    if (i7 != 0) {
                    }
                    i8 = i3 & 128;
                    if (i8 != 0) {
                    }
                    if ((i4 & 4793491) == 4793490) {
                        if (i11 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i7 != 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        Arrangement arrangement2 = Arrangement.INSTANCE;
                        Arrangement.Vertical top2 = arrangement2.getTop();
                        Alignment.Companion companion32 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top2, companion32.getStart(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        String str52 = str4;
                        Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                        ComposeUiNode.Companion companion42 = ComposeUiNode.INSTANCE;
                        Modifier modifier52 = modifier4;
                        Function0<ComposeUiNode> constructor3 = companion42.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        int i132 = i4;
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion42.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion42.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion42.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting()) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion42.getSetModifier());
                            Column6 column62 = Column6.INSTANCE;
                            Alignment.Vertical centerVertically2 = companion32.getCenterVertically();
                            companion = Modifier.INSTANCE;
                            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement2.getStart(), centerVertically2, composerStartRestartGroup, 48);
                            currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion);
                            Function0<ComposeUiNode> constructor22 = companion42.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (!composerStartRestartGroup.getInserting()) {
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
                                z3 = z5;
                                Modifier modifierBentoPlaceholder$default2 = ModifiersKt.bentoPlaceholder$default(companion, z3, null, 2, null);
                                String value2 = text3.getValue();
                                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                i9 = BentoTheme.$stable;
                                TextStyle textM2 = bentoTheme2.getTypography(composerStartRestartGroup, i9).getTextM();
                                long jM15355getColor0d7_KjU2 = text3.m15355getColor0d7_KjU();
                                TextOverflow.Companion companion52 = TextOverflow.INSTANCE;
                                BentoText2.m20747BentoText38GnDrw(value2, modifierBentoPlaceholder$default2, Color.m6701boximpl(jM15355getColor0d7_KjU2), null, null, null, null, companion52.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, textM2, composerStartRestartGroup, 817889280, 0, 7544);
                                composerStartRestartGroup.startReplaceGroup(-1817764027);
                                if (instrumentType2 != null) {
                                    i10 = i9;
                                    shape = null;
                                    uuid3 = uuid2;
                                    composer2 = composerStartRestartGroup;
                                    instrumentType3 = instrumentType2;
                                    z4 = z3;
                                    companion2 = companion;
                                    composer2.endReplaceGroup();
                                    composer2.endNode();
                                    BentoText2.m20747BentoText38GnDrw(text2.getValue(), ModifiersKt.bentoPlaceholder$default(companion2, z4, shape, 2, shape), Color.m6701boximpl(text2.m15355getColor0d7_KjU()), null, null, null, null, companion52.m7959getEllipsisgIe3tQ8(), false, i, 0, null, 0, bentoTheme2.getTypography(composer2, i10).getTextS(), composer2, ((i132 << 18) & 1879048192) | 12582912, 0, 7544);
                                    composer2.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    instrumentType4 = instrumentType3;
                                    uuid4 = uuid3;
                                    composer3 = composer2;
                                    str3 = str52;
                                    modifier3 = modifier52;
                                }
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i5 = i3 & 16;
                if (i5 != 0) {
                }
                str2 = str;
                i6 = i3 & 32;
                int i1222 = 196608;
                if (i6 != 0) {
                }
                i7 = i3 & 64;
                if (i7 != 0) {
                }
                i8 = i3 & 128;
                if (i8 != 0) {
                }
                if ((i4 & 4793491) == 4793490) {
                }
                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            if ((i3 & 8) != 0) {
            }
            i5 = i3 & 16;
            if (i5 != 0) {
            }
            str2 = str;
            i6 = i3 & 32;
            int i12222 = 196608;
            if (i6 != 0) {
            }
            i7 = i3 & 64;
            if (i7 != 0) {
            }
            i8 = i3 & 128;
            if (i8 != 0) {
            }
            if ((i4 & 4793491) == 4793490) {
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        text3 = text;
        if ((i3 & 4) == 0) {
        }
        if ((i3 & 8) != 0) {
        }
        i5 = i3 & 16;
        if (i5 != 0) {
        }
        str2 = str;
        i6 = i3 & 32;
        int i122222 = 196608;
        if (i6 != 0) {
        }
        i7 = i3 & 64;
        if (i7 != 0) {
        }
        i8 = i3 & 128;
        if (i8 != 0) {
        }
        if ((i4 & 4793491) == 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:204:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void InstrumentRowEnd(Modifier modifier, final Text text, final Text text2, final boolean z, final BackgroundColor backgroundColor, final Function0<Unit> function0, Direction direction, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        BackgroundColor backgroundColor2;
        Function0<Unit> function02;
        int i4;
        boolean z2;
        Object objRememberedValue;
        Direction direction2;
        Composer composer2;
        ServerToBentoAssetMapper2 serverToBentoAssetMapper2;
        long jM21456getPositive0d7_KjU;
        final Direction direction3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1346579243);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(text) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(text2) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else {
            if ((i & 24576) == 0) {
                backgroundColor2 = backgroundColor;
                i3 |= composerStartRestartGroup.changed(backgroundColor2) ? 16384 : 8192;
            }
            if ((i2 & 32) != 0) {
                if ((i & 196608) == 0) {
                    function02 = function0;
                    i3 |= composerStartRestartGroup.changedInstance(function02) ? 131072 : 65536;
                }
                i4 = i2 & 64;
                if (i4 != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i3 |= composerStartRestartGroup.changed(direction == null ? -1 : direction.ordinal()) ? 1048576 : 524288;
                }
                if ((599187 & i3) == 599186 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    direction3 = direction;
                    composer2 = composerStartRestartGroup;
                } else {
                    if (i5 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    Direction direction4 = i4 == 0 ? null : direction;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1346579243, i3, -1, "com.robinhood.android.instrumentrow.InstrumentRowEnd (InstrumentRow.kt:323)");
                    }
                    Modifier modifierTestTag = TestTag3.testTag(modifier2, InstrumentRowEndTag);
                    if (z) {
                        modifierTestTag = ClickableKt.m4893clickableXHw0xAI$default(modifierTestTag, false, null, null, function02, 7, null);
                    }
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    z2 = ((i3 & 112) != 32) | ((i3 & 896) != 256);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: com.robinhood.android.instrumentrow.InstrumentRowKt$$ExternalSyntheticLambda9
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return InstrumentRow5.InstrumentRowEnd$lambda$14$lambda$13(text, text2, (SemanticsPropertyReceiver) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierClearAndSetSemantics = SemanticsModifier6.clearAndSetSemantics(modifierTestTag, (Function1) objRememberedValue);
                    if (!z) {
                        composerStartRestartGroup.startReplaceGroup(-946839627);
                        Alignment.Companion companion = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierClearAndSetSemantics);
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
                        Modifier modifierM5176widthInVpY3zN4$default = SizeKt.m5176widthInVpY3zN4$default(BoxScopeInstance.INSTANCE.align(Modifier.INSTANCE, companion.getCenterEnd()), InstrumentRowFillMinWidth, 0.0f, 2, null);
                        float f = InstrumentRowFillCornerRadius;
                        Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(BorderKt.m4876borderxT4_qwU(Clip.clip(modifierM5176widthInVpY3zN4$default, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(f)), InstrumentRowBorderWidth, backgroundColor2.m15350getBorderColor0d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(f)), backgroundColor2.m15351getFillColor0d7_KjU(), null, 2, null);
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i6 = BentoTheme.$stable;
                        WrappedTickerKt.m19244TickerTextFNF3uiM(PaddingKt.m5143paddingVpY3zN4(modifierM4872backgroundbw27NRU$default, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21593getSmallD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i6).m21593getSmallD9Ej5fM()), text.getValue(), text.m15355getColor0d7_KjU(), TickerTextState.Style.REGULAR_MEDIUM, composerStartRestartGroup, 3072);
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceGroup();
                    } else if (text2 == null) {
                        composerStartRestartGroup.startReplaceGroup(-945873884);
                        Alignment.Companion companion3 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierClearAndSetSemantics);
                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor2);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, companion4.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                        WrappedTickerKt.m19244TickerTextFNF3uiM(BoxScopeInstance.INSTANCE.align(Modifier.INSTANCE, companion3.getCenterEnd()), text.getValue(), text.m15355getColor0d7_KjU(), TickerTextState.Style.REGULAR_MEDIUM_LARGER, composerStartRestartGroup, 3072);
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-945481269);
                        Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                        Alignment.Companion companion5 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion5.getStart(), composerStartRestartGroup, 0);
                        int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierClearAndSetSemantics);
                        ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor3 = companion6.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor3);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy, companion6.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion6.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion6.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion6.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        Modifier.Companion companion7 = Modifier.INSTANCE;
                        Modifier modifierAlign = column6.align(companion7, companion5.getEnd());
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion5.getTopStart(), false);
                        int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAlign);
                        Function0<ComposeUiNode> constructor4 = companion6.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor4);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy3, companion6.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion6.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion6.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                            composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                            composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion6.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        Modifier modifierAlpha = Alpha.alpha(companion7, 0.0f);
                        String value = text.getValue();
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i7 = BentoTheme.$stable;
                        TextStyle textM = bentoTheme2.getTypography(composerStartRestartGroup, i7).getTextM();
                        long jM15355getColor0d7_KjU = text.m15355getColor0d7_KjU();
                        TextOverflow.Companion companion8 = TextOverflow.INSTANCE;
                        direction2 = direction4;
                        BentoText2.m20747BentoText38GnDrw(value, modifierAlpha, Color.m6701boximpl(jM15355getColor0d7_KjU), null, null, null, null, companion8.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, textM, composerStartRestartGroup, 817889328, 0, 7544);
                        Modifier modifierTestTag2 = TestTag3.testTag(boxScopeInstance.align(companion7, companion5.getBottomEnd()), TrailingTextTag);
                        BentoText2.m20747BentoText38GnDrw(text.getValue(), modifierTestTag2, Color.m6701boximpl(text.m15355getColor0d7_KjU()), null, null, null, null, companion8.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i7).getTextS(), composerStartRestartGroup, 817889280, 0, 7544);
                        Composer composer3 = composerStartRestartGroup;
                        composer3.endNode();
                        Arrangement.HorizontalOrVertical horizontalOrVerticalM5092spacedBy0680j_4 = Arrangement.Absolute.INSTANCE.m5092spacedBy0680j_4(bentoTheme2.getSpacing(composer3, i7).m21595getXsmallD9Ej5fM());
                        Alignment.Vertical centerVertically = companion5.getCenterVertically();
                        Modifier modifierAlign2 = column6.align(companion7, companion5.getEnd());
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(horizontalOrVerticalM5092spacedBy0680j_4, centerVertically, composer3, 48);
                        int currentCompositeKeyHash5 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap5 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier5 = ComposedModifier2.materializeModifier(composer3, modifierAlign2);
                        Function0<ComposeUiNode> constructor5 = companion6.getConstructor();
                        if (composer3.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor5);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM6388constructorimpl5 = Updater.m6388constructorimpl(composer3);
                        Updater.m6390setimpl(composerM6388constructorimpl5, measurePolicyRowMeasurePolicy, companion6.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl5, currentCompositionLocalMap5, companion6.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion6.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                            composerM6388constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                            composerM6388constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl5, modifierMaterializeModifier5, companion6.getSetModifier());
                        Row6 row6 = Row6.INSTANCE;
                        composer3.startReplaceGroup(99475525);
                        if (direction2 != null) {
                            int[] iArr = WhenMappings.$EnumSwitchMapping$1;
                            int i8 = iArr[direction2.ordinal()];
                            if (i8 == 1) {
                                serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.STOCK_UP_12;
                            } else {
                                if (i8 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.STOCK_DOWN_12;
                            }
                            BentoIcon4.Size12 size12 = new BentoIcon4.Size12(serverToBentoAssetMapper2);
                            int i9 = iArr[direction2.ordinal()];
                            if (i9 == 1) {
                                composer3.startReplaceGroup(99492063);
                                jM21456getPositive0d7_KjU = bentoTheme2.getColors(composer3, i7).m21456getPositive0d7_KjU();
                                composer3.endReplaceGroup();
                            } else {
                                if (i9 != 2) {
                                    composer3.startReplaceGroup(99489527);
                                    composer3.endReplaceGroup();
                                    throw new NoWhenBranchMatchedException();
                                }
                                composer3.startReplaceGroup(99494399);
                                jM21456getPositive0d7_KjU = bentoTheme2.getColors(composer3, i7).m21452getNegative0d7_KjU();
                                composer3.endReplaceGroup();
                            }
                            BentoIcon2.m20644BentoIconFU0evQE(size12, null, jM21456getPositive0d7_KjU, null, null, false, composer3, BentoIcon4.Size12.$stable | 48, 56);
                            composer3 = composer3;
                        }
                        composer3.endReplaceGroup();
                        composer2 = composer3;
                        BentoText2.m20747BentoText38GnDrw(text2.getValue(), null, Color.m6701boximpl(text2.m15355getColor0d7_KjU()), null, null, null, null, companion8.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, bentoTheme2.getTypography(composer3, i7).getTextS(), composer2, 817889280, 0, 7546);
                        composer2.endNode();
                        composer2.endNode();
                        composer2.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        direction3 = direction2;
                    }
                    direction2 = direction4;
                    composer2 = composerStartRestartGroup;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    direction3 = direction2;
                }
                final Modifier modifier3 = modifier2;
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.instrumentrow.InstrumentRowKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return InstrumentRow5.InstrumentRowEnd$lambda$20(modifier3, text, text2, z, backgroundColor, function0, direction3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 196608;
            function02 = function0;
            i4 = i2 & 64;
            if (i4 != 0) {
            }
            if ((599187 & i3) == 599186) {
                if (i5 != 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifierTestTag3 = TestTag3.testTag(modifier2, InstrumentRowEndTag);
                if (z) {
                }
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                z2 = ((i3 & 112) != 32) | ((i3 & 896) != 256);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z2) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.instrumentrow.InstrumentRowKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return InstrumentRow5.InstrumentRowEnd$lambda$14$lambda$13(text, text2, (SemanticsPropertyReceiver) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierClearAndSetSemantics2 = SemanticsModifier6.clearAndSetSemantics(modifierTestTag3, (Function1) objRememberedValue);
                    if (!z) {
                    }
                    direction2 = direction4;
                    composer2 = composerStartRestartGroup;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    direction3 = direction2;
                }
            }
            final Modifier modifier32 = modifier2;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        backgroundColor2 = backgroundColor;
        if ((i2 & 32) != 0) {
        }
        function02 = function0;
        i4 = i2 & 64;
        if (i4 != 0) {
        }
        if ((599187 & i3) == 599186) {
        }
        final Modifier modifier322 = modifier2;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstrumentRowEnd$lambda$14$lambda$13(Text text, Text text2, SemanticsPropertyReceiver clearAndSetSemantics) {
        String str;
        Intrinsics.checkNotNullParameter(clearAndSetSemantics, "$this$clearAndSetSemantics");
        String value = text.getValue();
        if (text2 != null) {
            str = ", " + text2.getValue();
        } else {
            str = "";
        }
        SemanticsPropertiesKt.setContentDescription(clearAndSetSemantics, value + str);
        SemanticsProperties_androidKt.setTestTagsAsResourceId(clearAndSetSemantics, true);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LoadingInstrumentRow(Modifier modifier, boolean z, Composer composer, final int i, final int i2) {
        final Modifier modifier2;
        int i3;
        final boolean z2;
        boolean z3;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        Object objRememberedValue;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1560716588);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = i | (composerStartRestartGroup.changed(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                z2 = z;
                i3 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
            }
            if ((i3 & 19) != 18 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
            } else {
                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                z3 = i5 == 0 ? true : z2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1560716588, i3, -1, "com.robinhood.android.instrumentrow.LoadingInstrumentRow (InstrumentRow.kt:433)");
                }
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
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
                Alignment.Vertical centerVertically = companion.getCenterVertically();
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
                BentoBaseRowLayout8 bentoBaseRowLayout8 = BentoBaseRowLayout8.INSTANCE;
                Modifier modifierAlign = boxScopeInstance.align(PaddingKt.m5143paddingVpY3zN4(modifierFillMaxWidth$default, bentoBaseRowLayout8.m21050getPaddingHorizontalD9Ej5fM(), bentoBaseRowLayout8.m21051getPaddingVerticalD9Ej5fM()), companion.getCenterStart());
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composerStartRestartGroup, 48);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAlign);
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                Modifier modifierWeight$default = Row5.weight$default(row6, companion3, 1.0f, false, 2, null);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                Modifier modifier4 = modifier3;
                InstrumentRowStart(modifierWeight$default, new Text("XXXXX", bentoTheme.getColors(composerStartRestartGroup, i6).m21425getFg0d7_KjU(), null), new Text("XXX shares", bentoTheme.getColors(composerStartRestartGroup, i6).m21425getFg0d7_KjU(), null), 1, null, null, null, true, composerStartRestartGroup, 12585984, 112);
                Spacer2.Spacer(SizeKt.m5169size3ABfNKs(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.m5156height3ABfNKs(Row5.weight$default(row6, Clip.clipToBounds(companion3), 1.0f, false, 2, null), InstrumentChartHeight), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21593getSmallD9Ej5fM(), 1, null);
                if (!z3) {
                    composerStartRestartGroup.startReplaceGroup(1474969462);
                    Placeholders2.ChartPlaceholder(modifierM5144paddingVpY3zN4$default, false, composerStartRestartGroup, 0, 2);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(1475048419);
                    BoxKt.Box(modifierM5144paddingVpY3zN4$default, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                }
                Spacer2.Spacer(SizeKt.m5169size3ABfNKs(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                Spacer2.Spacer(Row5.weight$default(row6, companion3, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                composerStartRestartGroup.endNode();
                Modifier modifierAlign2 = boxScopeInstance.align(ModifiersKt.bentoPlaceholder$default(PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, 0.0f, bentoBaseRowLayout8.m21050getPaddingHorizontalD9Ej5fM(), 0.0f, 11, null), true, null, 2, null), companion.getCenterEnd());
                Text text = new Text("$XXX.XX", bentoTheme.getColors(composerStartRestartGroup, i6).m21425getFg0d7_KjU(), null);
                BackgroundColor backgroundColor = new BackgroundColor(bentoTheme.getColors(composerStartRestartGroup, i6).m21373getBg30d7_KjU(), bentoTheme.getColors(composerStartRestartGroup, i6).m21373getBg30d7_KjU(), null);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.instrumentrow.InstrumentRowKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                InstrumentRowEnd(modifierAlign2, text, null, true, backgroundColor, (Function0) objRememberedValue, null, composerStartRestartGroup, 200064, 64);
                composerStartRestartGroup = composerStartRestartGroup;
                Divider2.m5581DivideroMI9zvI(boxScopeInstance.align(PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), bentoTheme.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM(), 0.0f, 2, null), companion.getBottomStart()), bentoTheme.getColors(composerStartRestartGroup, i6).m21373getBg30d7_KjU(), C2002Dp.m7995constructorimpl(1), 0.0f, composerStartRestartGroup, 384, 8);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z2 = z3;
                modifier2 = modifier4;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.instrumentrow.InstrumentRowKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return InstrumentRow5.LoadingInstrumentRow$lambda$25(modifier2, z2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        z2 = z;
        if ((i3 & 19) != 18) {
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Alignment.Companion companion4 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor3 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion22.getSetModifier());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                Alignment.Vertical centerVertically2 = companion4.getCenterVertically();
                Modifier.Companion companion32 = Modifier.INSTANCE;
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion32, 0.0f, 1, null);
                BentoBaseRowLayout8 bentoBaseRowLayout82 = BentoBaseRowLayout8.INSTANCE;
                Modifier modifierAlign3 = boxScopeInstance2.align(PaddingKt.m5143paddingVpY3zN4(modifierFillMaxWidth$default2, bentoBaseRowLayout82.m21050getPaddingHorizontalD9Ej5fM(), bentoBaseRowLayout82.m21051getPaddingVerticalD9Ej5fM()), companion4.getCenterStart());
                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composerStartRestartGroup, 48);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAlign3);
                Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy2, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting()) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                    Row6 row62 = Row6.INSTANCE;
                    Modifier modifierWeight$default2 = Row5.weight$default(row62, companion32, 1.0f, false, 2, null);
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i62 = BentoTheme.$stable;
                    Modifier modifier42 = modifier3;
                    InstrumentRowStart(modifierWeight$default2, new Text("XXXXX", bentoTheme2.getColors(composerStartRestartGroup, i62).m21425getFg0d7_KjU(), null), new Text("XXX shares", bentoTheme2.getColors(composerStartRestartGroup, i62).m21425getFg0d7_KjU(), null), 1, null, null, null, true, composerStartRestartGroup, 12585984, 112);
                    Spacer2.Spacer(SizeKt.m5169size3ABfNKs(companion32, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                    Modifier modifierM5144paddingVpY3zN4$default2 = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.m5156height3ABfNKs(Row5.weight$default(row62, Clip.clipToBounds(companion32), 1.0f, false, 2, null), InstrumentChartHeight), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21593getSmallD9Ej5fM(), 1, null);
                    if (!z3) {
                    }
                    Spacer2.Spacer(SizeKt.m5169size3ABfNKs(companion32, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                    Spacer2.Spacer(Row5.weight$default(row62, companion32, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                    composerStartRestartGroup.endNode();
                    Modifier modifierAlign22 = boxScopeInstance2.align(ModifiersKt.bentoPlaceholder$default(PaddingKt.m5146paddingqDBjuR0$default(companion32, 0.0f, 0.0f, bentoBaseRowLayout82.m21050getPaddingHorizontalD9Ej5fM(), 0.0f, 11, null), true, null, 2, null), companion4.getCenterEnd());
                    Text text2 = new Text("$XXX.XX", bentoTheme2.getColors(composerStartRestartGroup, i62).m21425getFg0d7_KjU(), null);
                    BackgroundColor backgroundColor2 = new BackgroundColor(bentoTheme2.getColors(composerStartRestartGroup, i62).m21373getBg30d7_KjU(), bentoTheme2.getColors(composerStartRestartGroup, i62).m21373getBg30d7_KjU(), null);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    InstrumentRowEnd(modifierAlign22, text2, null, true, backgroundColor2, (Function0) objRememberedValue, null, composerStartRestartGroup, 200064, 64);
                    composerStartRestartGroup = composerStartRestartGroup;
                    Divider2.m5581DivideroMI9zvI(boxScopeInstance2.align(PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion32, 0.0f, 1, null), bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21592getMediumD9Ej5fM(), 0.0f, 2, null), companion4.getBottomStart()), bentoTheme2.getColors(composerStartRestartGroup, i62).m21373getBg30d7_KjU(), C2002Dp.m7995constructorimpl(1), 0.0f, composerStartRestartGroup, 384, 8);
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    z2 = z3;
                    modifier2 = modifier42;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void Loading(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-917948312);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-917948312, i, -1, "com.robinhood.android.instrumentrow.Loading (InstrumentRow.kt:507)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, InstrumentRow2.INSTANCE.m15331getLambda$872895968$lib_instrument_row_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.instrumentrow.InstrumentRowKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InstrumentRow5.Loading$lambda$26(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void InstrumentRowDirectionIcons(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-449397926);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-449397926, i, -1, "com.robinhood.android.instrumentrow.InstrumentRowDirectionIcons (InstrumentRow.kt:515)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, Boolean.TRUE, null, null, InstrumentRow2.INSTANCE.getLambda$1286873362$lib_instrument_row_externalDebug(), composerStartRestartGroup, 100859904, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.instrumentrow.InstrumentRowKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InstrumentRow5.InstrumentRowDirectionIcons$lambda$27(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
