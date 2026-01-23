package com.robinhood.android.equitydetail.p123ui.component;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.ZIndexModifier2;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.StrokeCap;
import androidx.compose.p011ui.graphics.drawscope.Stroke;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntSize;
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
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.charts.PieChart2;
import com.robinhood.android.charts.model.Pie;
import com.robinhood.android.educationtour.compose.ModifiersKt;
import com.robinhood.android.equitydetail.p123ui.analystoverview.StarRatingBarComposable;
import com.robinhood.android.equitydetail.p123ui.component.SdpDataRow;
import com.robinhood.android.equitydetail.p123ui.component.SdpDataRow3;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.shoestring.StringsKt;
import com.robinhood.android.shoestring.TagHandlers;
import com.robinhood.android.shoestring.handlers.Bold;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.tooltips.popup.PopupPositioning;
import com.robinhood.tooltips.popup.PopupTooltipKt;
import com.robinhood.utils.resource.StringResource;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableMap;
import kotlinx.collections.immutable.extensions2;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: SdpDataRow.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a5\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\t\u001a)\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\n\u001aC\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00050\u000fH\u0007¢\u0006\u0004\b\u0007\u0010\u0011\u001ad\u0010\u001d\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00122\b\b\u0002\u0010\u0014\u001a\u00020\r2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152%\b\u0002\u0010\u001a\u001a\u001f\u0012\u0004\u0012\u00020\u0018\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u000f¢\u0006\u0002\b\u00190\u0017H\u0007¢\u0006\u0004\b\u001b\u0010\u001c\"\u0014\u0010\u001e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\"\u0014\u0010 \u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006%²\u0006\u000e\u0010#\u001a\u00020\"8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010$\u001a\u0004\u0018\u00010\r8\n@\nX\u008a\u008e\u0002"}, m3636d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "", AnnotatedPrivateKey.LABEL, "Lkotlin/Function0;", "", "value", "SdpDataRow", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "Lcom/robinhood/android/equitydetail/ui/component/SdpDataRowState;", "state", "", "activeTooltip", "Lkotlin/Function1;", "onTooltipClicked", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/equitydetail/ui/component/SdpDataRowState;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "items", "columnWidth", "Landroidx/compose/ui/unit/Dp;", "spacing", "Lkotlinx/collections/immutable/ImmutableMap;", "Lcom/robinhood/android/equitydetail/ui/component/SdpDataRowType;", "Lkotlin/ExtensionFunctionType;", "tooltips", "EvenlyWeightedSdpDataGrid-oilTxCY", "(Landroidx/compose/ui/Modifier;Ljava/util/List;ILandroidx/compose/ui/unit/Dp;Lkotlinx/collections/immutable/ImmutableMap;Landroidx/compose/runtime/Composer;II)V", "EvenlyWeightedSdpDataGrid", "SdpDataRowMaxLines", "I", "SdpDataRowMinHeight", "F", "Landroidx/compose/ui/unit/IntSize;", "textSize", "visibleTooltip", "feature-equity-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equitydetail.ui.component.SdpDataRowKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class SdpDataRow {
    private static final int SdpDataRowMaxLines = 2;
    private static final float SdpDataRowMinHeight = C2002Dp.m7995constructorimpl(60);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EvenlyWeightedSdpDataGrid_oilTxCY$lambda$26(Modifier modifier, List list, int i, C2002Dp c2002Dp, ImmutableMap immutableMap, int i2, int i3, Composer composer, int i4) {
        m13861EvenlyWeightedSdpDataGridoilTxCY(modifier, list, i, c2002Dp, immutableMap, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SdpDataRow$lambda$1(Modifier modifier, String str, Function2 function2, int i, int i2, Composer composer, int i3) {
        SdpDataRow(modifier, str, (Function2<? super Composer, ? super Integer, Unit>) function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SdpDataRow$lambda$14(Modifier modifier, SdpDataRow3 sdpDataRow3, Integer num, Function1 function1, int i, int i2, Composer composer, int i3) {
        SdpDataRow(modifier, sdpDataRow3, num, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SdpDataRow$lambda$3(Modifier modifier, Function2 function2, Function2 function22, int i, int i2, Composer composer, int i3) {
        SdpDataRow(modifier, (Function2<? super Composer, ? super Integer, Unit>) function2, (Function2<? super Composer, ? super Integer, Unit>) function22, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SdpDataRow$lambda$4(Modifier modifier, String str, String str2, int i, int i2, Composer composer, int i3) {
        SdpDataRow(modifier, str, str2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    private static final Integer EvenlyWeightedSdpDataGrid_oilTxCY$lambda$16(SnapshotState<Integer> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long SdpDataRow$lambda$10(SnapshotState<IntSize> snapshotState) {
        return snapshotState.getValue().getPackedValue();
    }

    public static final void SdpDataRow(Modifier modifier, final String label, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        Function2<? super Composer, ? super Integer, Unit> value = function2;
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(value, "value");
        Composer composerStartRestartGroup = composer.startRestartGroup(1379488924);
        int i4 = i2 & 1;
        if (i4 != 0) {
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
            i3 |= composerStartRestartGroup.changed(label) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(value) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1379488924, i3, -1, "com.robinhood.android.equitydetail.ui.component.SdpDataRow (SdpDataRow.kt:94)");
            }
            Modifier modifierM5155defaultMinSizeVpY3zN4$default = SizeKt.m5155defaultMinSizeVpY3zN4$default(modifier4, 0.0f, SdpDataRowMinHeight, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 6);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5155defaultMinSizeVpY3zN4$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i5 = BentoTheme.$stable;
            modifier3 = modifier4;
            BentoText2.m20747BentoText38GnDrw(label, null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 2, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS(), composerStartRestartGroup, ((i3 >> 3) & 14) | 805306368, 0, 7674);
            value = function2;
            value.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 6) & 14));
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Function2<? super Composer, ? super Integer, Unit> function22 = value;
            final Modifier modifier5 = modifier3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitydetail.ui.component.SdpDataRowKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SdpDataRow.SdpDataRow$lambda$1(modifier5, label, function22, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: SdpDataRow.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equitydetail.ui.component.SdpDataRowKt$SdpDataRow$16 */
    static final class C1546816 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SdpDataRow3 $state;
        final /* synthetic */ SnapshotState<IntSize> $textSize$delegate;

        C1546816(SdpDataRow3 sdpDataRow3, SnapshotState<IntSize> snapshotState) {
            this.$state = sdpDataRow3;
            this.$textSize$delegate = snapshotState;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(662384324, i, -1, "com.robinhood.android.equitydetail.ui.component.SdpDataRow.<anonymous> (SdpDataRow.kt:278)");
            }
            SdpDataRow3 sdpDataRow3 = this.$state;
            final SnapshotState<IntSize> snapshotState = this.$textSize$delegate;
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            composer.startReplaceGroup(5004770);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.equitydetail.ui.component.SdpDataRowKt$SdpDataRow$16$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SdpDataRow.C1546816.invoke$lambda$3$lambda$1$lambda$0(snapshotState, (LayoutCoordinates) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoText2.m20747BentoText38GnDrw("", OnGloballyPositionedModifier3.onGloballyPositioned(companion, (Function1) objRememberedValue), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 54, 0, 16380);
            StarRatingBarComposable.m13836StarRatingBarComposableww6aTOc(SizeKt.m5156height3ABfNKs(companion, C2002Dp.m7993boximpl(((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM((int) (SdpDataRow.SdpDataRow$lambda$10(snapshotState) & 4294967295L))).getValue()), ((SdpDataRow3.StarRating) sdpDataRow3).getFilledStars(), 0, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU(), composer, 0, 4);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$1$lambda$0(SnapshotState snapshotState, LayoutCoordinates it) {
            Intrinsics.checkNotNullParameter(it, "it");
            SdpDataRow.SdpDataRow$lambda$11(snapshotState, it.mo7241getSizeYbymL2g());
            return Unit.INSTANCE;
        }
    }

    /* compiled from: SdpDataRow.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equitydetail.ui.component.SdpDataRowKt$SdpDataRow$9 */
    static final class C154709 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Integer $activeTooltip;
        final /* synthetic */ Context $context;
        final /* synthetic */ Function1<Integer, Unit> $onTooltipClicked;
        final /* synthetic */ SdpDataRow3 $state;

        /* JADX WARN: Multi-variable type inference failed */
        C154709(SdpDataRow3 sdpDataRow3, Integer num, Function1<? super Integer, Unit> function1, Context context) {
            this.$state = sdpDataRow3;
            this.$activeTooltip = num;
            this.$onTooltipClicked = function1;
            this.$context = context;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(704996411, i, -1, "com.robinhood.android.equitydetail.ui.component.SdpDataRow.<anonymous> (SdpDataRow.kt:172)");
            }
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            SdpDataRow3 sdpDataRow3 = this.$state;
            Integer num = this.$activeTooltip;
            final Function1<Integer, Unit> function1 = this.$onTooltipClicked;
            final Context context = this.$context;
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            SdpDataRow3.Default r19 = (SdpDataRow3.Default) sdpDataRow3;
            String strStringResource = StringResources_androidKt.stringResource(r19.getType().getLabelRes(), composer, 0);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw(strStringResource, null, Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 2, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextS(), composer, 805306368, 0, 7674);
            composer.startReplaceGroup(-376225485);
            if (r19.getIcon() != null) {
                Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21595getXsmallD9Ej5fM()), composer, 0);
                final SdpDataRow3.Tooltip infoIconTooltip = r19.getInfoIconTooltip();
                BentoIcon4 icon = r19.getIcon();
                String iconContentDescription = r19.getIconContentDescription();
                long jM21426getFg20d7_KjU = bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU();
                boolean zAreEqual = Intrinsics.areEqual(num, infoIconTooltip != null ? Integer.valueOf(infoIconTooltip.getId()) : null);
                float fM21593getSmallD9Ej5fM = bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM();
                Boolean boolValueOf = Boolean.valueOf(zAreEqual);
                composer.startReplaceGroup(5004770);
                boolean zChanged = composer.changed(function1);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.equitydetail.ui.component.SdpDataRowKt$SdpDataRow$9$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SdpDataRow.C154709.invoke$lambda$5$lambda$1$lambda$0(function1);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                Modifier modifierM26519popupTooltipBgaGok8 = PopupTooltipKt.m26519popupTooltipBgaGok8(companion, (16232 & 1) != 0 ? Boolean.TRUE : boolValueOf, (16232 & 2) != 0 ? new Function0() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                } : (Function0) objRememberedValue, (16232 & 4) != 0 ? new Function0() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                } : null, (16232 & 8) != 0 ? new Function0() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                } : null, (16232 & 16) != 0 ? PopupPositioning.FREE : null, (16232 & 32) != 0 ? null : null, (16232 & 64) != 0 ? null : null, (16232 & 128) != 0 ? C2002Dp.m7995constructorimpl(0) : fM21593getSmallD9Ej5fM, (16232 & 256) != 0, (16232 & 512) != 0 ? C2002Dp.m7995constructorimpl(0) : 0.0f, (16232 & 1024) != 0 ? C2002Dp.m7995constructorimpl(0) : 0.0f, (16232 & 2048) != 0 ? null : null, (16232 & 4096) != 0 ? EnterTransition.INSTANCE.getNone() : null, (16232 & 8192) != 0 ? ExitTransition.INSTANCE.getNone() : null, ComposableLambda3.rememberComposableLambda(1438262423, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equitydetail.ui.component.SdpDataRowKt$SdpDataRow$9$1$2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num2) {
                        invoke(composer2, num2.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i3) {
                        if ((i3 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1438262423, i3, -1, "com.robinhood.android.equitydetail.ui.component.SdpDataRow.<anonymous>.<anonymous>.<anonymous> (SdpDataRow.kt:201)");
                        }
                        SdpDataRow3.Tooltip tooltip = infoIconTooltip;
                        StringResource text = tooltip != null ? tooltip.getText() : null;
                        if (text != null) {
                            Resources resources = context.getResources();
                            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                            BentoText2.m20747BentoText38GnDrw(text.getText(resources).toString(), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer2, 0, 0, 16382);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54));
                composer.startReplaceGroup(-1633490746);
                boolean zChangedInstance = composer.changedInstance(infoIconTooltip) | composer.changed(function1);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.equitydetail.ui.component.SdpDataRowKt$SdpDataRow$9$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SdpDataRow.C154709.invoke$lambda$5$lambda$4$lambda$3(infoIconTooltip, function1);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                BentoIcon2.m20644BentoIconFU0evQE(icon, iconContentDescription, jM21426getFg20d7_KjU, modifierM26519popupTooltipBgaGok8, (Function0) objRememberedValue2, false, composer, BentoIcon4.$stable, 32);
            }
            composer.endReplaceGroup();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4$lambda$3(SdpDataRow3.Tooltip tooltip, Function1 function1) {
            if (tooltip != null) {
                function1.invoke(Integer.valueOf(tooltip.getId()));
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$1$lambda$0(Function1 function1) {
            function1.invoke(null);
            return Unit.INSTANCE;
        }
    }

    public static final void SdpDataRow(Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> label, final Function2<? super Composer, ? super Integer, Unit> value, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(value, "value");
        Composer composerStartRestartGroup = composer.startRestartGroup(667588286);
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
            i3 |= composerStartRestartGroup.changedInstance(label) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(value) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(667588286, i3, -1, "com.robinhood.android.equitydetail.ui.component.SdpDataRow (SdpDataRow.kt:119)");
            }
            Modifier modifierM5155defaultMinSizeVpY3zN4$default = SizeKt.m5155defaultMinSizeVpY3zN4$default(modifier, 0.0f, SdpDataRowMinHeight, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 6);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5155defaultMinSizeVpY3zN4$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            label.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 3) & 14));
            value.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 6) & 14));
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitydetail.ui.component.SdpDataRowKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SdpDataRow.SdpDataRow$lambda$3(modifier2, label, value, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void SdpDataRow(Modifier modifier, final String label, final String value, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(value, "value");
        Composer composerStartRestartGroup = composer.startRestartGroup(-275702624);
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
            i3 |= composerStartRestartGroup.changed(label) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(value) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-275702624, i3, -1, "com.robinhood.android.equitydetail.ui.component.SdpDataRow (SdpDataRow.kt:135)");
            }
            Modifier modifier4 = modifier3;
            SdpDataRow(modifier4, label, ComposableLambda3.rememberComposableLambda(1503196608, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equitydetail.ui.component.SdpDataRowKt.SdpDataRow.5
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    if ((i5 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1503196608, i5, -1, "com.robinhood.android.equitydetail.ui.component.SdpDataRow.<anonymous> (SdpDataRow.kt:140)");
                    }
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    BentoText2.m20747BentoText38GnDrw(value, null, Color.m6701boximpl(bentoTheme.getColors(composer2, i6).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 2, 0, null, 0, bentoTheme.getTypography(composer2, i6).getTextM(), composer2, 805306368, 0, 7674);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i3 & 14) | 384 | (i3 & 112), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitydetail.ui.component.SdpDataRowKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SdpDataRow.SdpDataRow$lambda$4(modifier2, label, value, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void SdpDataRow(Modifier modifier, final SdpDataRow3 state, final Integer num, final Function1<? super Integer, Unit> onTooltipClicked, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final Modifier modifier3;
        Modifier modifierTestTag;
        Modifier modifier4;
        Modifier modifierEducationTourId$default;
        Modifier modifierTestTag2;
        int i4;
        Modifier modifierEducationTourId$default2;
        Modifier modifierTestTag3;
        Modifier modifierEducationTourId$default3;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onTooltipClicked, "onTooltipClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-247896092);
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
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(num) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onTooltipClicked) ? 2048 : 1024;
        }
        if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            modifier3 = i5 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-247896092, i3, -1, "com.robinhood.android.equitydetail.ui.component.SdpDataRow (SdpDataRow.kt:156)");
            }
            String educationTourId = state.getType().getEducationTourId();
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            if (state instanceof SdpDataRow3.Default) {
                composerStartRestartGroup.startReplaceGroup(-2023307880);
                String testTag = ((SdpDataRow3.Default) state).getTestTag();
                if (testTag == null || (modifierTestTag3 = TestTag3.testTag(Modifier.INSTANCE, testTag)) == null) {
                    modifierTestTag3 = Modifier.INSTANCE;
                }
                Modifier modifierThen = modifier3.then(modifierTestTag3);
                if (educationTourId == null || (modifierEducationTourId$default3 = ModifiersKt.educationTourId$default(Modifier.INSTANCE, educationTourId, null, null, false, false, 30, null)) == null) {
                    modifierEducationTourId$default3 = Modifier.INSTANCE;
                }
                SdpDataRow(modifierThen.then(modifierEducationTourId$default3), ComposableLambda3.rememberComposableLambda(704996411, true, new C154709(state, num, onTooltipClicked, context), composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-1108796292, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equitydetail.ui.component.SdpDataRowKt.SdpDataRow.10
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num2) {
                        invoke(composer2, num2.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i6) {
                        if ((i6 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1108796292, i6, -1, "com.robinhood.android.equitydetail.ui.component.SdpDataRow.<anonymous> (SdpDataRow.kt:212)");
                        }
                        AnnotatedString annotatedString = StringsKt.toShoeString(((SdpDataRow3.Default) state).getValue(), new TagHandlers(new Bold()), composer2, StringResource.$stable | (TagHandlers.$stable << 3)).getAnnotatedString();
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i7 = BentoTheme.$stable;
                        BentoText2.m20748BentoTextQnj7Zds(annotatedString, null, Color.m6701boximpl(bentoTheme.getColors(composer2, i7).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 2, 0, null, null, bentoTheme.getTypography(composer2, i7).getTextM(), composer2, 805306368, 0, 7674);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 432, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else if (state instanceof SdpDataRow3.PieChart) {
                composerStartRestartGroup.startReplaceGroup(-2020598635);
                SdpDataRow3.PieChart pieChart = (SdpDataRow3.PieChart) state;
                String testTag2 = pieChart.getTestTag();
                if (testTag2 == null || (modifierTestTag2 = TestTag3.testTag(Modifier.INSTANCE, testTag2)) == null) {
                    modifierTestTag2 = Modifier.INSTANCE;
                }
                Modifier modifierThen2 = modifier3.then(modifierTestTag2);
                if (educationTourId != null) {
                    i4 = 0;
                    modifierEducationTourId$default2 = ModifiersKt.educationTourId$default(Modifier.INSTANCE, educationTourId, null, null, false, false, 30, null);
                    if (modifierEducationTourId$default2 == null) {
                    }
                    SdpDataRow(modifierThen2.then(modifierEducationTourId$default2), StringResources_androidKt.stringResource(pieChart.getType().getLabelRes(), composerStartRestartGroup, i4), ComposableLambda3.rememberComposableLambda(-1694043675, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equitydetail.ui.component.SdpDataRowKt.SdpDataRow.13
                        public final void invoke(Composer composer2, int i6) {
                            if ((i6 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1694043675, i6, -1, "com.robinhood.android.equitydetail.ui.component.SdpDataRow.<anonymous> (SdpDataRow.kt:235)");
                            }
                            float fMo5016toPx0680j_4 = ((Density) composer2.consume(CompositionLocalsKt.getLocalDensity())).mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(2));
                            float percent = ((SdpDataRow3.PieChart) state).getPercent();
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i7 = BentoTheme.$stable;
                            Pie.Slice slice = new Pie.Slice(percent, bentoTheme.getColors(composer2, i7).m21368getAccent0d7_KjU(), null, 4, null);
                            Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = Arrangement.INSTANCE.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer2, i7).m21593getSmallD9Ej5fM());
                            SdpDataRow3 sdpDataRow3 = state;
                            Modifier.Companion companion = Modifier.INSTANCE;
                            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, Alignment.INSTANCE.getTop(), composer2, 0);
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
                            BentoText2.m20747BentoText38GnDrw(Formats.getPercentFormat().format(Double.valueOf(((SdpDataRow3.PieChart) sdpDataRow3).getPercent())), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer2, 0, 0, 16382);
                            float f = 20;
                            PieChart2.m11980PieChartcEmTA8(SizeKt.m5156height3ABfNKs(SizeKt.m5174width3ABfNKs(companion, C2002Dp.m7995constructorimpl(f)), C2002Dp.m7995constructorimpl(f)), CollectionsKt.listOf(slice), new Stroke(fMo5016toPx0680j_4, 0.0f, StrokeCap.INSTANCE.m6849getRoundKaPHkGw(), 0, null, 26, null), false, false, Color.m6701boximpl(bentoTheme.getColors(composer2, i7).m21373getBg30d7_KjU()), 0.0f, 0.0f, composer2, (Pie.Slice.$stable << 3) | 6, EnumC7081g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE);
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num2) {
                            invoke(composer2, num2.intValue());
                            return Unit.INSTANCE;
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 384, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    i4 = 0;
                }
                modifierEducationTourId$default2 = Modifier.INSTANCE;
                SdpDataRow(modifierThen2.then(modifierEducationTourId$default2), StringResources_androidKt.stringResource(pieChart.getType().getLabelRes(), composerStartRestartGroup, i4), ComposableLambda3.rememberComposableLambda(-1694043675, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equitydetail.ui.component.SdpDataRowKt.SdpDataRow.13
                    public final void invoke(Composer composer2, int i6) {
                        if ((i6 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1694043675, i6, -1, "com.robinhood.android.equitydetail.ui.component.SdpDataRow.<anonymous> (SdpDataRow.kt:235)");
                        }
                        float fMo5016toPx0680j_4 = ((Density) composer2.consume(CompositionLocalsKt.getLocalDensity())).mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(2));
                        float percent = ((SdpDataRow3.PieChart) state).getPercent();
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i7 = BentoTheme.$stable;
                        Pie.Slice slice = new Pie.Slice(percent, bentoTheme.getColors(composer2, i7).m21368getAccent0d7_KjU(), null, 4, null);
                        Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = Arrangement.INSTANCE.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer2, i7).m21593getSmallD9Ej5fM());
                        SdpDataRow3 sdpDataRow3 = state;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, Alignment.INSTANCE.getTop(), composer2, 0);
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
                        BentoText2.m20747BentoText38GnDrw(Formats.getPercentFormat().format(Double.valueOf(((SdpDataRow3.PieChart) sdpDataRow3).getPercent())), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer2, 0, 0, 16382);
                        float f = 20;
                        PieChart2.m11980PieChartcEmTA8(SizeKt.m5156height3ABfNKs(SizeKt.m5174width3ABfNKs(companion, C2002Dp.m7995constructorimpl(f)), C2002Dp.m7995constructorimpl(f)), CollectionsKt.listOf(slice), new Stroke(fMo5016toPx0680j_4, 0.0f, StrokeCap.INSTANCE.m6849getRoundKaPHkGw(), 0, null, 26, null), false, false, Color.m6701boximpl(bentoTheme.getColors(composer2, i7).m21373getBg30d7_KjU()), 0.0f, 0.0f, composer2, (Pie.Slice.$stable << 3) | 6, EnumC7081g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num2) {
                        invoke(composer2, num2.intValue());
                        return Unit.INSTANCE;
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 384, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(state instanceof SdpDataRow3.StarRating)) {
                    composerStartRestartGroup.startReplaceGroup(-2004929273);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(-2018998663);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(IntSize.m8055boximpl(IntSize.INSTANCE.m8064getZeroYbymL2g()), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                SdpDataRow3.StarRating starRating = (SdpDataRow3.StarRating) state;
                String testTag3 = starRating.getTestTag();
                if (testTag3 == null || (modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, testTag3)) == null) {
                    modifierTestTag = Modifier.INSTANCE;
                }
                Modifier modifierThen3 = modifier3.then(modifierTestTag);
                if (educationTourId != null) {
                    modifier4 = modifierThen3;
                    modifierEducationTourId$default = ModifiersKt.educationTourId$default(Modifier.INSTANCE, educationTourId, null, null, false, false, 30, null);
                    if (modifierEducationTourId$default == null) {
                    }
                    SdpDataRow(modifier4.then(modifierEducationTourId$default), StringResources_androidKt.stringResource(starRating.getType().getLabelRes(), composerStartRestartGroup, 0), ComposableLambda3.rememberComposableLambda(662384324, true, new C1546816(state, snapshotState), composerStartRestartGroup, 54), composerStartRestartGroup, 384, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    modifier4 = modifierThen3;
                }
                modifierEducationTourId$default = Modifier.INSTANCE;
                SdpDataRow(modifier4.then(modifierEducationTourId$default), StringResources_androidKt.stringResource(starRating.getType().getLabelRes(), composerStartRestartGroup, 0), ComposableLambda3.rememberComposableLambda(662384324, true, new C1546816(state, snapshotState), composerStartRestartGroup, 54), composerStartRestartGroup, 384, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitydetail.ui.component.SdpDataRowKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SdpDataRow.SdpDataRow$lambda$14(modifier3, state, num, onTooltipClicked, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SdpDataRow$lambda$11(SnapshotState<IntSize> snapshotState, long j) {
        snapshotState.setValue(IntSize.m8055boximpl(j));
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0189  */
    /* renamed from: EvenlyWeightedSdpDataGrid-oilTxCY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m13861EvenlyWeightedSdpDataGridoilTxCY(Modifier modifier, final List<? extends SdpDataRow3> items, int i, C2002Dp c2002Dp, ImmutableMap<SdpDataRowType, ? extends Function3<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier>> immutableMap, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        int i5;
        int i6;
        C2002Dp c2002Dp2;
        int i7;
        ImmutableMap<SdpDataRowType, ? extends Function3<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier>> immutableMap2;
        Object objRememberedValue;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final int i8;
        final C2002Dp c2002Dp3;
        final ImmutableMap<SdpDataRowType, ? extends Function3<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier>> immutableMap3;
        final Modifier modifier3;
        Arrangement.Horizontal start;
        int i9;
        boolean z;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(items, "items");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1544820545);
        int i10 = i3 & 1;
        if (i10 != 0) {
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
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(items) ? 32 : 16;
        }
        int i11 = i3 & 4;
        if (i11 != 0) {
            i4 |= 384;
        } else {
            if ((i2 & 384) == 0) {
                i5 = i;
                i4 |= composerStartRestartGroup.changed(i5) ? 256 : 128;
            }
            i6 = i3 & 8;
            if (i6 == 0) {
                i4 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    c2002Dp2 = c2002Dp;
                    i4 |= composerStartRestartGroup.changed(c2002Dp2) ? 2048 : 1024;
                }
                i7 = i3 & 16;
                if (i7 == 0) {
                    if ((i2 & 24576) == 0) {
                        immutableMap2 = immutableMap;
                        i4 |= composerStartRestartGroup.changed(immutableMap2) ? 16384 : 8192;
                    }
                    if ((i4 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier4 = i10 == 0 ? Modifier.INSTANCE : modifier2;
                        int i12 = i11 == 0 ? 2 : i5;
                        C2002Dp c2002Dp4 = i6 == 0 ? null : c2002Dp2;
                        ImmutableMap<SdpDataRowType, ? extends Function3<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier>> immutableMapPersistentMapOf = i7 == 0 ? extensions2.persistentMapOf() : immutableMap2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1544820545, i4, -1, "com.robinhood.android.equitydetail.ui.component.EvenlyWeightedSdpDataGrid (SdpDataRow.kt:306)");
                        }
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        int i13 = 0;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        composerStartRestartGroup.startReplaceGroup(1963825349);
                        for (List list : CollectionsKt.chunked(items, i12)) {
                            if (c2002Dp4 != null) {
                                start = Arrangement.INSTANCE.m5089spacedBy0680j_4(c2002Dp4.getValue());
                                if (start == null) {
                                    start = Arrangement.INSTANCE.getStart();
                                }
                            }
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(start, Alignment.INSTANCE.getTop(), composerStartRestartGroup, i13);
                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, i13);
                            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion2);
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
                            Modifier modifier5 = modifier4;
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                            Row6 row6 = Row6.INSTANCE;
                            composerStartRestartGroup.startReplaceGroup(1064659256);
                            int i14 = 0;
                            while (i14 < i12) {
                                SdpDataRow3 sdpDataRow3 = (SdpDataRow3) CollectionsKt.getOrNull(list, i14);
                                if (sdpDataRow3 != null) {
                                    composerStartRestartGroup.startReplaceGroup(-1355187257);
                                    Modifier.Companion companion4 = Modifier.INSTANCE;
                                    Modifier modifierWeight$default = Row5.weight$default(row6, companion4, 1.0f, false, 2, null);
                                    MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
                                    int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default);
                                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                    i9 = i14;
                                    Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
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
                                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy2, companion5.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion5.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion5.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion5.getSetModifier());
                                    Row6 row62 = Row6.INSTANCE;
                                    composerStartRestartGroup.startReplaceGroup(-1399574329);
                                    Modifier modifierZIndex = ZIndexModifier2.zIndex(companion4, 1.0f);
                                    if (immutableMapPersistentMapOf.containsKey(sdpDataRow3.getType())) {
                                        z = false;
                                        modifierZIndex = (Modifier) ((Function3) MapsKt.getValue(immutableMapPersistentMapOf, sdpDataRow3.getType())).invoke(modifierZIndex, composerStartRestartGroup, 0);
                                    } else {
                                        z = false;
                                    }
                                    Modifier modifier6 = modifierZIndex;
                                    composerStartRestartGroup.endReplaceGroup();
                                    Integer numEvenlyWeightedSdpDataGrid_oilTxCY$lambda$16 = EvenlyWeightedSdpDataGrid_oilTxCY$lambda$16(snapshotState);
                                    composerStartRestartGroup.startReplaceGroup(5004770);
                                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = new Function1() { // from class: com.robinhood.android.equitydetail.ui.component.SdpDataRowKt$$ExternalSyntheticLambda3
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return SdpDataRow.m1974x4b02157(snapshotState, (Integer) obj);
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    SdpDataRow(modifier6, sdpDataRow3, numEvenlyWeightedSdpDataGrid_oilTxCY$lambda$16, (Function1) objRememberedValue2, composerStartRestartGroup, 3072, 0);
                                    composerStartRestartGroup.endNode();
                                    composerStartRestartGroup.endReplaceGroup();
                                } else {
                                    i9 = i14;
                                    composerStartRestartGroup.startReplaceGroup(-1354397687);
                                    Spacer2.Spacer(Row5.weight$default(row6, Modifier.INSTANCE, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                                    composerStartRestartGroup.endReplaceGroup();
                                }
                                i14 = i9 + 1;
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.endNode();
                            i13 = 0;
                            modifier4 = modifier5;
                        }
                        Modifier modifier7 = modifier4;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        i8 = i12;
                        c2002Dp3 = c2002Dp4;
                        immutableMap3 = immutableMapPersistentMapOf;
                        modifier3 = modifier7;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        i8 = i5;
                        c2002Dp3 = c2002Dp2;
                        immutableMap3 = immutableMap2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitydetail.ui.component.SdpDataRowKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return SdpDataRow.EvenlyWeightedSdpDataGrid_oilTxCY$lambda$26(modifier3, items, i8, c2002Dp3, immutableMap3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i4 |= 24576;
                immutableMap2 = immutableMap;
                if ((i4 & 9363) == 9362) {
                    if (i10 == 0) {
                    }
                    if (i11 == 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    }
                    final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    int i132 = 0;
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                    ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor4 = companion6.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion6.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap4, companion6.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion6.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier4, companion6.getSetModifier());
                        Column6 column62 = Column6.INSTANCE;
                        composerStartRestartGroup.startReplaceGroup(1963825349);
                        while (r3.hasNext()) {
                        }
                        Modifier modifier72 = modifier4;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        i8 = i12;
                        c2002Dp3 = c2002Dp4;
                        immutableMap3 = immutableMapPersistentMapOf;
                        modifier3 = modifier72;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            c2002Dp2 = c2002Dp;
            i7 = i3 & 16;
            if (i7 == 0) {
            }
            immutableMap2 = immutableMap;
            if ((i4 & 9363) == 9362) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        i5 = i;
        i6 = i3 & 8;
        if (i6 == 0) {
        }
        c2002Dp2 = c2002Dp;
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        immutableMap2 = immutableMap;
        if ((i4 & 9363) == 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: EvenlyWeightedSdpDataGrid_oilTxCY$lambda$25$lambda$24$lambda$23$lambda$22$lambda$21$lambda$20 */
    public static final Unit m1974x4b02157(SnapshotState snapshotState, Integer num) {
        snapshotState.setValue(num);
        return Unit.INSTANCE;
    }
}
