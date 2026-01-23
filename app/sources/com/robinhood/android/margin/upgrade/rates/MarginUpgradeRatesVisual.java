package com.robinhood.android.margin.upgrade.rates;

import android.os.Parcelable;
import androidx.compose.animation.SingleValueAnimation;
import androidx.compose.animation.core.AnimateAsState;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.Easing3;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.ZIndexModifier2;
import androidx.compose.p011ui.draw.DrawModifierKt;
import androidx.compose.p011ui.geometry.CornerRadius;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.graphics.drawscope.Stroke;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.LayoutCoordinates2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.InspectionMode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.gold.sparkle.compose.GoldSparkleBrush;
import com.robinhood.android.lib.margin.p167db.models.MarginTieredRates;
import com.robinhood.android.margin.upgrade.C21137R;
import com.robinhood.android.margin.upgrade.rates.MarginUpgradeRatesVisualState;
import com.robinhood.android.sdui.annotations.SduiComposable;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.models.serverdriven.experimental.api.MarginRateRow;
import com.robinhood.models.serverdriven.experimental.api.MarginTieredInterestRates;
import com.robinhood.models.serverdriven.experimental.api.MarginTieredRateTableCallout;
import com.robinhood.models.serverdriven.experimental.api.ThemedColor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;
import rh_server_driven_ui.p531v1.FontWeightDto;
import rh_server_driven_ui.p531v1.MarginRateHeaderDto;
import rh_server_driven_ui.p531v1.MarginRateRowDto;
import rh_server_driven_ui.p531v1.MarginTieredHighlightRowStyleDto;
import rh_server_driven_ui.p531v1.MarginTieredInterestRatesDto;
import rh_server_driven_ui.p531v1.MarginTieredRateTableCalloutDto;
import rh_server_driven_ui.p531v1.OpacityReduceBackgroundWithBorderDto;
import rh_server_driven_ui.p531v1.ThemedColorDto;
import rh_server_driven_ui.p531v1.UIComponentDto;

/* compiled from: MarginUpgradeRatesVisual.kt */
@Metadata(m3635d1 = {"\u0000t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a5\u0010\u0000\u001a\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u000e\u001a/\u0010\u000f\u001a\u00020\u0001\"\b\b\u0000\u0010\u0010*\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00100\u00132\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0014\u001a)\u0010\u0015\u001a\u00020\u0001\"\b\b\u0000\u0010\u0010*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00162\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0017\u001a\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019*\u00020\u001aH\u0003¢\u0006\u0002\u0010\u001b\u001a\r\u0010\u001c\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001d\"\u000e\u0010\u001e\u001a\u00020\u001fX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010 \u001a\u00020!X\u0082T¢\u0006\u0002\n\u0000¨\u0006\"²\u0006\n\u0010#\u001a\u00020$X\u008a\u008e\u0002²\u0006\n\u0010%\u001a\u00020!X\u008a\u008e\u0002²\u0006\n\u0010&\u001a\u00020!X\u008a\u0084\u0002²\u0006\n\u0010'\u001a\u00020(X\u008a\u0084\u0002²\u0006\n\u0010)\u001a\u00020*X\u008a\u0084\u0002²\u0006\n\u0010+\u001a\u00020*X\u008a\u0084\u0002²\u0006\n\u0010,\u001a\u00020!X\u008a\u0084\u0002"}, m3636d2 = {"MarginUpgradeRatesVisual", "", "state", "Lcom/robinhood/android/margin/upgrade/rates/MarginUpgradeRatesVisualState;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/margin/upgrade/rates/MarginUpgradeRatesVisualState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "rates", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/lib/margin/db/models/MarginTieredRates$MarginTieredRate;", "isGold", "", "goldFooter", "", "(Lkotlinx/collections/immutable/ImmutableList;ZLjava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SduiMarginTieredInterestRates", "ActionT", "Landroid/os/Parcelable;", "component", "Lcom/robinhood/models/serverdriven/experimental/api/MarginTieredInterestRates;", "(Lcom/robinhood/models/serverdriven/experimental/api/MarginTieredInterestRates;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ProtoSduiMarginTieredInterestRates", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$MarginTieredInterestRates;", "(Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$MarginTieredInterestRates;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "toHighlightRowStyle", "Lcom/robinhood/android/margin/upgrade/rates/MarginUpgradeRatesVisualState$HighlightRowStyle;", "Lrh_server_driven_ui/v1/MarginTieredHighlightRowStyleDto$HighlightRowStyleDto;", "(Lrh_server_driven_ui/v1/MarginTieredHighlightRowStyleDto$HighlightRowStyleDto;Landroidx/compose/runtime/Composer;I)Lcom/robinhood/android/margin/upgrade/rates/MarginUpgradeRatesVisualState$HighlightRowStyle;", "MarginUpgradeRatesVisualPreview", "(Landroidx/compose/runtime/Composer;I)V", "HighlightRowAnimDuration", "", "HighlightRowPropertyAnimDuration", "", "feature-margin-upgrade_externalDebug", "footerPositionInWindow", "Landroidx/compose/ui/geometry/Offset;", "currentHighlightRow", "highlightRowPropertyAnimDuration", "textColor", "Landroidx/compose/ui/graphics/Color;", "highlightRowXOffsetDp", "", "borderAlpha", "fontWeight"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.margin.upgrade.rates.MarginUpgradeRatesVisualKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class MarginUpgradeRatesVisual {
    private static final long HighlightRowAnimDuration = 1500;
    private static final int HighlightRowPropertyAnimDuration = 300;

    /* compiled from: MarginUpgradeRatesVisual.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.margin.upgrade.rates.MarginUpgradeRatesVisualKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FontWeightDto.values().length];
            try {
                iArr[FontWeightDto.FONT_WEIGHT_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FontWeightDto.FONT_WEIGHT_BOLD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FontWeightDto.FONT_WEIGHT_UNSPECIFIED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarginUpgradeRatesVisual$lambda$30(MarginUpgradeRatesVisualState marginUpgradeRatesVisualState, Modifier modifier, int i, int i2, Composer composer, int i3) {
        MarginUpgradeRatesVisual(marginUpgradeRatesVisualState, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarginUpgradeRatesVisual$lambda$32(ImmutableList immutableList, boolean z, String str, Modifier modifier, int i, int i2, Composer composer, int i3) {
        MarginUpgradeRatesVisual(immutableList, z, str, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarginUpgradeRatesVisualPreview$lambda$43(int i, Composer composer, int i2) {
        MarginUpgradeRatesVisualPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProtoSduiMarginTieredInterestRates$lambda$41(UIComponentDto.ConcreteDto.MarginTieredInterestRates marginTieredInterestRates, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ProtoSduiMarginTieredInterestRates(marginTieredInterestRates, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiMarginTieredInterestRates$lambda$36(MarginTieredInterestRates marginTieredInterestRates, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SduiMarginTieredInterestRates(marginTieredInterestRates, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x07df  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0909  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0914  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x034c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:255:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x038f  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MarginUpgradeRatesVisual(final MarginUpgradeRatesVisualState marginUpgradeRatesVisualState, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        final long jM21373getBg30d7_KjU;
        final float fM7995constructorimpl;
        Object objRememberedValue;
        Composer.Companion companion;
        float f;
        int i4;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean zChanged;
        Object objRememberedValue2;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        Composer composer2;
        int currentCompositeKeyHash3;
        Composer composerM6388constructorimpl3;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3;
        Iterator<MarginUpgradeRatesVisualState.Row> it;
        final int i5;
        boolean zChanged2;
        Object objRememberedValue3;
        SnapshotIntState2 snapshotIntState2;
        MarginUpgradeRatesVisualState.HighlightRowStyle.OpacityReducedBackgroundWithBorder.HighlightAnimation highlightAnimation;
        boolean zChangedInstance;
        Object objRememberedValue4;
        Continuation continuation;
        Object objRememberedValue5;
        final SnapshotState snapshotState;
        long jM21426getFg20d7_KjU;
        char c;
        Modifier modifierDrawBehind;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final MarginUpgradeRatesVisualState state = marginUpgradeRatesVisualState;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1029084116);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (composerStartRestartGroup.changedInstance(state) ? 4 : 2);
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
                Modifier modifier3 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1029084116, i3, -1, "com.robinhood.android.margin.upgrade.rates.MarginUpgradeRatesVisual (MarginUpgradeRatesVisual.kt:67)");
                }
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i7 = BentoTheme.$stable;
                jM21373getBg30d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i7).m21373getBg30d7_KjU();
                fM7995constructorimpl = C2002Dp.m7995constructorimpl(24);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue != companion.getEmpty()) {
                    f = 0.0f;
                    i4 = i7;
                    objRememberedValue = SnapshotState3.mutableStateOf$default(Offset.m6534boximpl(Offset.m6535constructorimpl((Float.floatToRawIntBits(0.0f) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32))), null, 2, null);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    f = 0.0f;
                    i4 = i7;
                }
                SnapshotState snapshotState2 = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Modifier.Companion companion4 = Modifier.INSTANCE;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(ZIndexModifier2.zIndex(companion4, 1.0f), f, 1, null);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChanged = composerStartRestartGroup.changed(jM21373getBg30d7_KjU) | composerStartRestartGroup.changedInstance(state);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.margin.upgrade.rates.MarginUpgradeRatesVisualKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return MarginUpgradeRatesVisual.MarginUpgradeRatesVisual$lambda$29$lambda$4$lambda$3(fM7995constructorimpl, jM21373getBg30d7_KjU, state, (DrawScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierDrawBehind2 = DrawModifierKt.drawBehind(modifierFillMaxWidth$default, (Function1) objRememberedValue2);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierDrawBehind2);
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                float f2 = 12;
                composer2 = composerStartRestartGroup;
                Modifier modifier4 = modifier3;
                Modifier modifierM21622defaultHorizontalPaddingWMci_g0 = PaddingKt.m21622defaultHorizontalPaddingWMci_g0(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), C2002Dp.m7995constructorimpl(22), C2002Dp.m7995constructorimpl(f2), composer2, 438, 0);
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composer2, 0);
                currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer2, modifierM21622defaultHorizontalPaddingWMci_g0);
                Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                if (composer2.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.useNode();
                } else {
                    composer2.createNode(constructor3);
                }
                composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer2);
                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                int i8 = i4;
                ?? r2 = 0;
                BentoText2.m20747BentoText38GnDrw(state.getHeader().getTitle(), null, Color.m6701boximpl(bentoTheme.getColors(composer2, i8).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i8).getTextS(), composer2, 0, 0, 8186);
                Spacer2.Spacer(Row5.weight$default(row6, companion4, 1.0f, false, 2, null), composer2, 0);
                BentoText2.m20747BentoText38GnDrw(state.getHeader().getValue(), null, Color.m6701boximpl(bentoTheme.getColors(composer2, i8).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i8).getTextS(), composer2, 0, 0, 8186);
                composerStartRestartGroup = composer2;
                composerStartRestartGroup.endNode();
                it = state.getRows().iterator();
                i5 = 0;
                while (true) {
                    if (it.hasNext()) {
                        i5 = -1;
                        break;
                    } else if (it.next().isHighlighted()) {
                        break;
                    } else {
                        i5++;
                    }
                }
                Object[] objArr = new Object[0];
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged2 = composerStartRestartGroup.changed(i5);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.margin.upgrade.rates.MarginUpgradeRatesVisualKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SnapshotIntState3.mutableIntStateOf(i5);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                snapshotIntState2 = (SnapshotIntState2) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue3, composerStartRestartGroup, 0, 6);
                MarginUpgradeRatesVisualState.HighlightRowStyle highlightRowStyle = state.getHighlightRowStyle();
                MarginUpgradeRatesVisualState.HighlightRowStyle.OpacityReducedBackgroundWithBorder opacityReducedBackgroundWithBorder = !(highlightRowStyle instanceof MarginUpgradeRatesVisualState.HighlightRowStyle.OpacityReducedBackgroundWithBorder) ? (MarginUpgradeRatesVisualState.HighlightRowStyle.OpacityReducedBackgroundWithBorder) highlightRowStyle : null;
                highlightAnimation = opacityReducedBackgroundWithBorder == null ? opacityReducedBackgroundWithBorder.getHighlightAnimation() : null;
                Integer numValueOf = Integer.valueOf(i5);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance = composerStartRestartGroup.changedInstance(highlightAnimation) | composerStartRestartGroup.changed(snapshotIntState2) | composerStartRestartGroup.changed(i5);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    continuation = null;
                    objRememberedValue4 = new MarginUpgradeRatesVisual2(highlightAnimation, i5, snapshotIntState2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                } else {
                    continuation = null;
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(numValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, 0);
                if (!Intrinsics.areEqual(highlightAnimation, MarginUpgradeRatesVisualState.HighlightRowStyle.OpacityReducedBackgroundWithBorder.HighlightAnimation.MoveUpward.INSTANCE)) {
                    composerStartRestartGroup.startReplaceGroup(1020223323);
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChanged3 = composerStartRestartGroup.changed(snapshotIntState2) | composerStartRestartGroup.changedInstance(state);
                    Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue6 = new MarginUpgradeRatesVisual3(state, snapshotIntState2, continuation);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(highlightAnimation, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (Intrinsics.areEqual(highlightAnimation, MarginUpgradeRatesVisualState.HighlightRowStyle.OpacityReducedBackgroundWithBorder.HighlightAnimation.MoveDownward.INSTANCE)) {
                    composerStartRestartGroup.startReplaceGroup(1020242968);
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChanged4 = composerStartRestartGroup.changed(snapshotIntState2) | composerStartRestartGroup.changedInstance(state);
                    Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (zChanged4 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue7 = new MarginUpgradeRatesVisual4(state, snapshotIntState2, continuation);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(highlightAnimation, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue7, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    if (highlightAnimation != null) {
                        composerStartRestartGroup.startReplaceGroup(1020219892);
                        composerStartRestartGroup.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composerStartRestartGroup.startReplaceGroup(1563270144);
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue5 = SnapshotIntState3.mutableIntStateOf(highlightAnimation != null ? 300 : 0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                SnapshotIntState2 snapshotIntState22 = (SnapshotIntState2) objRememberedValue5;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1020279326);
                int i9 = 0;
                for (Object obj : state.getRows()) {
                    int i10 = i9 + 1;
                    if (i9 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    MarginUpgradeRatesVisualState.Row row = (MarginUpgradeRatesVisualState.Row) obj;
                    boolean z = i9 == snapshotIntState2.getIntValue() ? true : r2;
                    TweenSpec tweenSpecTween = AnimationSpecKt.tween(snapshotIntState22.getIntValue(), r2, Easing3.getLinearEasing());
                    if (z) {
                        composerStartRestartGroup.startReplaceGroup(961632979);
                        MarginUpgradeRatesVisualState.HighlightRowStyle highlightRowStyle2 = state.getHighlightRowStyle();
                        if (highlightRowStyle2 instanceof MarginUpgradeRatesVisualState.HighlightRowStyle.SolidColorBackground) {
                            jM21426getFg20d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU();
                        } else {
                            if (!(highlightRowStyle2 instanceof MarginUpgradeRatesVisualState.HighlightRowStyle.OpacityReducedBackgroundWithBorder)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            jM21426getFg20d7_KjU = ((MarginUpgradeRatesVisualState.HighlightRowStyle.OpacityReducedBackgroundWithBorder) highlightRowStyle2).m16246getHighlightColor0d7_KjU();
                        }
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(961914521);
                        Color colorM16254getTextColorQN2ZGVo = row.m16254getTextColorQN2ZGVo();
                        jM21426getFg20d7_KjU = colorM16254getTextColorQN2ZGVo == null ? BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21426getFg20d7_KjU() : colorM16254getTextColorQN2ZGVo.getValue();
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    Composer composer3 = composerStartRestartGroup;
                    SnapshotState4<Color> snapshotState4M4805animateColorAsStateeuL9pac = SingleValueAnimation.m4805animateColorAsStateeuL9pac(jM21426getFg20d7_KjU, tweenSpecTween, "textColor", null, composer3, 384, 8);
                    final SnapshotState4<Float> snapshotState4AnimateFloatAsState = AnimateAsState.animateFloatAsState(z ? 35.0f : 0.0f, AnimationSpecKt.tween(snapshotIntState22.getIntValue(), r2, Easing3.getLinearEasing()), 0.0f, "highlightRowXOffset", null, composer3, 3072, 20);
                    final SnapshotState4<Float> snapshotState4AnimateFloatAsState2 = AnimateAsState.animateFloatAsState(z ? 1.0f : 0.0f, AnimationSpecKt.tween(snapshotIntState22.getIntValue(), r2, Easing3.getLinearEasing()), 0.0f, "borderAlpha", null, composer3, 3072, 20);
                    SnapshotState4<Integer> snapshotState4AnimateIntAsState = AnimateAsState.animateIntAsState((z ? FontWeight.INSTANCE.getBold() : row.getUnselectedRowFontWeight()).getWeight(), AnimationSpecKt.tween(snapshotIntState22.getIntValue() > 0 ? z ? snapshotIntState22.getIntValue() + 200 : snapshotIntState22.getIntValue() - 200 : r2, r2, Easing3.getLinearEasing()), "fontWeight", null, composer3, 384, 8);
                    Modifier.Companion companion5 = Modifier.INSTANCE;
                    Alignment.Companion companion6 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion6.getTopStart(), r2);
                    int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer3, r2);
                    CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composer3, companion5);
                    ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor4 = companion7.getConstructor();
                    if (composer3.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor4);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composer3);
                    Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy, companion7.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion7.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion7.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                        composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                        composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion7.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, continuation), C2002Dp.m7995constructorimpl(14), composer3, 54, 0);
                    composer3.startReplaceGroup(500629951);
                    if (highlightAnimation != null || z) {
                        Modifier modifierZIndex = ZIndexModifier2.zIndex(companion5, 2.0f);
                        c = 682;
                        composer3.startReplaceGroup(-1746271574);
                        boolean zChanged5 = composer3.changed(snapshotState4AnimateFloatAsState) | composer3.changedInstance(state) | composer3.changed(snapshotState4AnimateFloatAsState2);
                        Object objRememberedValue8 = composer3.rememberedValue();
                        if (zChanged5 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue8 = new Function1() { // from class: com.robinhood.android.margin.upgrade.rates.MarginUpgradeRatesVisualKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    return MarginUpgradeRatesVisual.m2162xdbf80545(state, snapshotState4AnimateFloatAsState, snapshotState4AnimateFloatAsState2, (DrawScope) obj2);
                                }
                            };
                            composer3.updateRememberedValue(objRememberedValue8);
                        }
                        composer3.endReplaceGroup();
                        modifierDrawBehind = DrawModifierKt.drawBehind(modifierZIndex, (Function1) objRememberedValue8);
                    } else {
                        modifierDrawBehind = companion5;
                        c = 682;
                    }
                    composer3.endReplaceGroup();
                    Modifier modifierThen = modifierM21623defaultHorizontalPaddingrAjV9yQ.then(modifierDrawBehind);
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion6.getTop(), composer3, 0);
                    int currentCompositeKeyHash5 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap5 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier5 = ComposedModifier2.materializeModifier(composer3, modifierThen);
                    Function0<ComposeUiNode> constructor5 = companion7.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl5, measurePolicyRowMeasurePolicy2, companion7.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl5, currentCompositionLocalMap5, companion7.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion7.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                        composerM6388constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                        composerM6388constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl5, modifierMaterializeModifier5, companion7.getSetModifier());
                    Row6 row62 = Row6.INSTANCE;
                    MarginUpgradeRatesVisualState.HighlightRowStyle.OpacityReducedBackgroundWithBorder.HighlightAnimation highlightAnimation2 = highlightAnimation;
                    int i11 = i9;
                    SnapshotIntState2 snapshotIntState23 = snapshotIntState2;
                    BentoText2.m20747BentoText38GnDrw(row.getTitle(), null, Color.m6701boximpl(MarginUpgradeRatesVisual$lambda$29$lambda$25$lambda$24$lambda$16(snapshotState4M4805animateColorAsStateeuL9pac)), null, new FontWeight(MarginUpgradeRatesVisual$lambda$29$lambda$25$lambda$24$lambda$19(snapshotState4AnimateIntAsState)), null, null, 0, false, 0, 0, null, 0, null, composer3, 0, 0, 16362);
                    Spacer2.Spacer(Row5.weight$default(row62, companion5, 1.0f, false, 2, null), composer3, 0);
                    BentoText2.m20747BentoText38GnDrw(row.getValue(), null, Color.m6701boximpl(MarginUpgradeRatesVisual$lambda$29$lambda$25$lambda$24$lambda$16(snapshotState4M4805animateColorAsStateeuL9pac)), null, new FontWeight(MarginUpgradeRatesVisual$lambda$29$lambda$25$lambda$24$lambda$19(snapshotState4AnimateIntAsState)), null, null, 0, false, 0, 0, null, 0, null, composer3, 0, 0, 16362);
                    composerStartRestartGroup = composer3;
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.startReplaceGroup(500785170);
                    if (!z && i11 != CollectionsKt.getLastIndex(marginUpgradeRatesVisualState.getRows())) {
                        BentoDivider.m20635BentoHorizontalDivideraMcp0Q(boxScopeInstance.align(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion5, 0.0f, composerStartRestartGroup, 6, 1), companion6.getBottomCenter()), BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21373getBg30d7_KjU(), 0.0f, composerStartRestartGroup, 0, 4);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    i9 = i10;
                    snapshotIntState2 = snapshotIntState23;
                    highlightAnimation = highlightAnimation2;
                    r2 = 0;
                    continuation = null;
                    state = marginUpgradeRatesVisualState;
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.startReplaceGroup(-1636082340);
                if (marginUpgradeRatesVisualState.getFooter() != null) {
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                        snapshotState = snapshotState2;
                        objRememberedValue9 = new Function1() { // from class: com.robinhood.android.margin.upgrade.rates.MarginUpgradeRatesVisualKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return MarginUpgradeRatesVisual.MarginUpgradeRatesVisual$lambda$29$lambda$27$lambda$26(snapshotState, (LayoutCoordinates) obj2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                    } else {
                        snapshotState = snapshotState2;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    float f3 = 0;
                    Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ2 = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Background3.background$default(OnGloballyPositionedModifier3.onGloballyPositioned(modifierFillMaxWidth$default2, (Function1) objRememberedValue9), GoldSparkleBrush.m15094sparkleEPk0efs(Brush.INSTANCE, MarginUpgradeRatesVisual$lambda$1(snapshotState), null, composerStartRestartGroup, 6, 2), RoundedCornerShape2.m5328RoundedCornerShapea9UjIt4(C2002Dp.m7995constructorimpl(f3), C2002Dp.m7995constructorimpl(f3), fM7995constructorimpl, fM7995constructorimpl), 0.0f, 4, null), C2002Dp.m7995constructorimpl(f2), composerStartRestartGroup, 48, 0);
                    MeasurePolicy measurePolicyRowMeasurePolicy3 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 6);
                    int currentCompositeKeyHash6 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier6 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21623defaultHorizontalPaddingrAjV9yQ2);
                    ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor6 = companion8.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor6);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM6388constructorimpl6 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl6, measurePolicyRowMeasurePolicy3, companion8.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl6, currentCompositionLocalMap6, companion8.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = companion8.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                        composerM6388constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                        composerM6388constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl6, modifierMaterializeModifier6, companion8.getSetModifier());
                    Row6 row63 = Row6.INSTANCE;
                    String title = marginUpgradeRatesVisualState.getFooter().getTitle();
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i12 = BentoTheme.$stable;
                    Composer composer4 = composerStartRestartGroup;
                    BentoText2.m20747BentoText38GnDrw(title, null, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i12).getJet()), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i12).getTextS(), composer4, 24576, 0, 8170);
                    composerStartRestartGroup = composer4;
                    composerStartRestartGroup.endNode();
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.margin.upgrade.rates.MarginUpgradeRatesVisualKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return MarginUpgradeRatesVisual.MarginUpgradeRatesVisual$lambda$30(marginUpgradeRatesVisualState, modifier2, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
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
            BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
            int i72 = BentoTheme.$stable;
            jM21373getBg30d7_KjU = bentoTheme3.getColors(composerStartRestartGroup, i72).m21373getBg30d7_KjU();
            fM7995constructorimpl = C2002Dp.m7995constructorimpl(24);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue != companion.getEmpty()) {
            }
            SnapshotState snapshotState22 = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            Arrangement arrangement2 = Arrangement.INSTANCE;
            Arrangement.Vertical top2 = arrangement2.getTop();
            Alignment.Companion companion22 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(top2, companion22.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier7 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
            ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor7 = companion32.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy3, companion32.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap7, companion32.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion32.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier7, companion32.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                Modifier.Companion companion42 = Modifier.INSTANCE;
                Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(ZIndexModifier2.zIndex(companion42, 1.0f), f, 1, null);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChanged = composerStartRestartGroup.changed(jM21373getBg30d7_KjU) | composerStartRestartGroup.changedInstance(state);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.margin.upgrade.rates.MarginUpgradeRatesVisualKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return MarginUpgradeRatesVisual.MarginUpgradeRatesVisual$lambda$29$lambda$4$lambda$3(fM7995constructorimpl, jM21373getBg30d7_KjU, state, (DrawScope) obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierDrawBehind22 = DrawModifierKt.drawBehind(modifierFillMaxWidth$default3, (Function1) objRememberedValue2);
                    MeasurePolicy measurePolicyColumnMeasurePolicy22 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion22.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierDrawBehind22);
                    Function0<ComposeUiNode> constructor22 = companion32.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy22, companion32.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion32.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion32.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting()) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion32.getSetModifier());
                        float f22 = 12;
                        composer2 = composerStartRestartGroup;
                        Modifier modifier42 = modifier3;
                        Modifier modifierM21622defaultHorizontalPaddingWMci_g02 = PaddingKt.m21622defaultHorizontalPaddingWMci_g0(SizeKt.fillMaxWidth$default(companion42, 0.0f, 1, null), C2002Dp.m7995constructorimpl(22), C2002Dp.m7995constructorimpl(f22), composer2, 438, 0);
                        MeasurePolicy measurePolicyRowMeasurePolicy4 = Row2.rowMeasurePolicy(arrangement2.getStart(), companion22.getTop(), composer2, 0);
                        currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap32 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier32 = ComposedModifier2.materializeModifier(composer2, modifierM21622defaultHorizontalPaddingWMci_g02);
                        Function0<ComposeUiNode> constructor32 = companion32.getConstructor();
                        if (composer2.getApplier() == null) {
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                        }
                        composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer2);
                        Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy4, companion32.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap32, companion32.getSetResolvedCompositionLocals());
                        setCompositeKeyHash3 = companion32.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl3.getInserting()) {
                            composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier32, companion32.getSetModifier());
                            Row6 row64 = Row6.INSTANCE;
                            int i82 = i4;
                            ?? r22 = 0;
                            BentoText2.m20747BentoText38GnDrw(state.getHeader().getTitle(), null, Color.m6701boximpl(bentoTheme3.getColors(composer2, i82).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme3.getTypography(composer2, i82).getTextS(), composer2, 0, 0, 8186);
                            Spacer2.Spacer(Row5.weight$default(row64, companion42, 1.0f, false, 2, null), composer2, 0);
                            BentoText2.m20747BentoText38GnDrw(state.getHeader().getValue(), null, Color.m6701boximpl(bentoTheme3.getColors(composer2, i82).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme3.getTypography(composer2, i82).getTextS(), composer2, 0, 0, 8186);
                            composerStartRestartGroup = composer2;
                            composerStartRestartGroup.endNode();
                            it = state.getRows().iterator();
                            i5 = 0;
                            while (true) {
                                if (it.hasNext()) {
                                }
                                i5++;
                            }
                            Object[] objArr2 = new Object[0];
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            zChanged2 = composerStartRestartGroup.changed(i5);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged2) {
                                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.margin.upgrade.rates.MarginUpgradeRatesVisualKt$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return SnapshotIntState3.mutableIntStateOf(i5);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                composerStartRestartGroup.endReplaceGroup();
                                snapshotIntState2 = (SnapshotIntState2) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue3, composerStartRestartGroup, 0, 6);
                                MarginUpgradeRatesVisualState.HighlightRowStyle highlightRowStyle3 = state.getHighlightRowStyle();
                                if (!(highlightRowStyle3 instanceof MarginUpgradeRatesVisualState.HighlightRowStyle.OpacityReducedBackgroundWithBorder)) {
                                }
                                if (opacityReducedBackgroundWithBorder == null) {
                                }
                                Integer numValueOf2 = Integer.valueOf(i5);
                                composerStartRestartGroup.startReplaceGroup(-1746271574);
                                zChangedInstance = composerStartRestartGroup.changedInstance(highlightAnimation) | composerStartRestartGroup.changed(snapshotIntState2) | composerStartRestartGroup.changed(i5);
                                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                if (zChangedInstance) {
                                    continuation = null;
                                    objRememberedValue4 = new MarginUpgradeRatesVisual2(highlightAnimation, i5, snapshotIntState2, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                    composerStartRestartGroup.endReplaceGroup();
                                    EffectsKt.LaunchedEffect(numValueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, 0);
                                    if (!Intrinsics.areEqual(highlightAnimation, MarginUpgradeRatesVisualState.HighlightRowStyle.OpacityReducedBackgroundWithBorder.HighlightAnimation.MoveUpward.INSTANCE)) {
                                    }
                                    composerStartRestartGroup.startReplaceGroup(1849434622);
                                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                    }
                                    SnapshotIntState2 snapshotIntState222 = (SnapshotIntState2) objRememberedValue5;
                                    composerStartRestartGroup.endReplaceGroup();
                                    composerStartRestartGroup.startReplaceGroup(1020279326);
                                    int i92 = 0;
                                    while (r24.hasNext()) {
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    composerStartRestartGroup.endNode();
                                    composerStartRestartGroup.startReplaceGroup(-1636082340);
                                    if (marginUpgradeRatesVisualState.getFooter() != null) {
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    composerStartRestartGroup.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    modifier2 = modifier42;
                                }
                            }
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void MarginUpgradeRatesVisual$lambda$2(SnapshotState<Offset> snapshotState, long j) {
        snapshotState.setValue(Offset.m6534boximpl(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarginUpgradeRatesVisual$lambda$29$lambda$4$lambda$3(float f, long j, MarginUpgradeRatesVisualState marginUpgradeRatesVisualState, DrawScope drawBehind) {
        Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
        float fMo5010roundToPx0680j_4 = drawBehind.mo5010roundToPx0680j_4(f);
        float f2 = fMo5010roundToPx0680j_4 * 2;
        float fMo5016toPx0680j_4 = drawBehind.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(1));
        float fMo5016toPx0680j_42 = drawBehind.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(12));
        long jM6535constructorimpl = Offset.m6535constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(fMo5010roundToPx0680j_4) & 4294967295L));
        float fIntBitsToFloat = (Float.intBitsToFloat((int) (drawBehind.mo6963getSizeNHjbRc() & 4294967295L)) - fMo5010roundToPx0680j_4) + fMo5016toPx0680j_42;
        DrawScope.m6951drawLineNGM6Ib0$default(drawBehind, j, jM6535constructorimpl, Offset.m6535constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32)), fMo5016toPx0680j_4, 0, null, 0.0f, null, 0, 496, null);
        DrawScope.m6945drawArcyD3GUKo$default(drawBehind, j, 180.0f, 90.0f, false, Offset.m6535constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L)), Size.m6575constructorimpl((Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L)), 0.0f, new Stroke(fMo5016toPx0680j_4, 0.0f, 0, 0, null, 30, null), null, 0, 832, null);
        DrawScope.m6951drawLineNGM6Ib0$default(drawBehind, j, Offset.m6535constructorimpl((Float.floatToRawIntBits(fMo5010roundToPx0680j_4) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L)), Offset.m6535constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind.mo6963getSizeNHjbRc() >> 32)) - fMo5010roundToPx0680j_4) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L)), fMo5016toPx0680j_4, 0, null, 0.0f, null, 0, 496, null);
        DrawScope.m6945drawArcyD3GUKo$default(drawBehind, j, 270.0f, 90.0f, false, Offset.m6535constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind.mo6963getSizeNHjbRc() >> 32)) - f2) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L)), Size.m6575constructorimpl((Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L)), 0.0f, new Stroke(fMo5016toPx0680j_4, 0.0f, 0, 0, null, 30, null), null, 0, 832, null);
        long jM6535constructorimpl2 = Offset.m6535constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind.mo6963getSizeNHjbRc() >> 32))) << 32) | (Float.floatToRawIntBits(fMo5010roundToPx0680j_4) & 4294967295L));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawBehind.mo6963getSizeNHjbRc() >> 32));
        float fIntBitsToFloat3 = (Float.intBitsToFloat((int) (drawBehind.mo6963getSizeNHjbRc() & 4294967295L)) - fMo5010roundToPx0680j_4) + fMo5016toPx0680j_42;
        DrawScope.m6951drawLineNGM6Ib0$default(drawBehind, j, jM6535constructorimpl2, Offset.m6535constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat3) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat2) << 32)), fMo5016toPx0680j_4, 0, null, 0.0f, null, 0, 496, null);
        if (marginUpgradeRatesVisualState.getFooter() == null) {
            float fIntBitsToFloat4 = Float.intBitsToFloat((int) (drawBehind.mo6963getSizeNHjbRc() >> 32)) - f2;
            float fIntBitsToFloat5 = (Float.intBitsToFloat((int) (drawBehind.mo6963getSizeNHjbRc() & 4294967295L)) - f2) + fMo5016toPx0680j_42;
            DrawScope.m6945drawArcyD3GUKo$default(drawBehind, j, 0.0f, 90.0f, false, Offset.m6535constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat5) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat4) << 32)), Size.m6575constructorimpl((Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L)), 0.0f, new Stroke(fMo5016toPx0680j_4, 0.0f, 0, 0, null, 30, null), null, 0, 832, null);
            float fIntBitsToFloat6 = Float.intBitsToFloat((int) (drawBehind.mo6963getSizeNHjbRc() & 4294967295L)) + fMo5016toPx0680j_42;
            long jM6535constructorimpl3 = Offset.m6535constructorimpl((Float.floatToRawIntBits(fMo5010roundToPx0680j_4) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat6) & 4294967295L));
            float fIntBitsToFloat7 = Float.intBitsToFloat((int) (drawBehind.mo6963getSizeNHjbRc() >> 32)) - fMo5010roundToPx0680j_4;
            float fIntBitsToFloat8 = Float.intBitsToFloat((int) (drawBehind.mo6963getSizeNHjbRc() & 4294967295L)) + fMo5016toPx0680j_42;
            DrawScope.m6951drawLineNGM6Ib0$default(drawBehind, j, jM6535constructorimpl3, Offset.m6535constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat8) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat7) << 32)), fMo5016toPx0680j_4, 0, null, 0.0f, null, 0, 496, null);
            float fIntBitsToFloat9 = (Float.intBitsToFloat((int) (drawBehind.mo6963getSizeNHjbRc() & 4294967295L)) - f2) + fMo5016toPx0680j_42;
            DrawScope.m6945drawArcyD3GUKo$default(drawBehind, j, 90.0f, 90.0f, false, Offset.m6535constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat9) & 4294967295L)), Size.m6575constructorimpl((Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L)), 0.0f, new Stroke(fMo5016toPx0680j_4, 0.0f, 0, 0, null, 30, null), null, 0, 832, null);
        } else {
            float fIntBitsToFloat10 = Float.intBitsToFloat((int) (drawBehind.mo6963getSizeNHjbRc() & 4294967295L)) - fMo5010roundToPx0680j_4;
            long jM6535constructorimpl4 = Offset.m6535constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat10) & 4294967295L));
            float fIntBitsToFloat11 = Float.intBitsToFloat((int) (drawBehind.mo6963getSizeNHjbRc() & 4294967295L));
            DrawScope.m6951drawLineNGM6Ib0$default(drawBehind, j, jM6535constructorimpl4, Offset.m6535constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat11) & 4294967295L)), fMo5016toPx0680j_4, 0, null, 0.0f, null, 0, 496, null);
            float fIntBitsToFloat12 = Float.intBitsToFloat((int) (drawBehind.mo6963getSizeNHjbRc() >> 32));
            float fIntBitsToFloat13 = Float.intBitsToFloat((int) (drawBehind.mo6963getSizeNHjbRc() & 4294967295L)) - fMo5010roundToPx0680j_4;
            long jM6535constructorimpl5 = Offset.m6535constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat13) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat12) << 32));
            float fIntBitsToFloat14 = Float.intBitsToFloat((int) (drawBehind.mo6963getSizeNHjbRc() >> 32));
            float fIntBitsToFloat15 = Float.intBitsToFloat((int) (drawBehind.mo6963getSizeNHjbRc() & 4294967295L));
            DrawScope.m6951drawLineNGM6Ib0$default(drawBehind, j, jM6535constructorimpl5, Offset.m6535constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat15) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat14) << 32)), fMo5016toPx0680j_4, 0, null, 0.0f, null, 0, 496, null);
        }
        return Unit.INSTANCE;
    }

    private static final long MarginUpgradeRatesVisual$lambda$1(SnapshotState<Offset> snapshotState) {
        return snapshotState.getValue().getPackedValue();
    }

    private static final long MarginUpgradeRatesVisual$lambda$29$lambda$25$lambda$24$lambda$16(SnapshotState4<Color> snapshotState4) {
        return snapshotState4.getValue().getValue();
    }

    private static final float MarginUpgradeRatesVisual$lambda$29$lambda$25$lambda$24$lambda$17(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    private static final float MarginUpgradeRatesVisual$lambda$29$lambda$25$lambda$24$lambda$18(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    private static final int MarginUpgradeRatesVisual$lambda$29$lambda$25$lambda$24$lambda$19(SnapshotState4<Integer> snapshotState4) {
        return snapshotState4.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: MarginUpgradeRatesVisual$lambda$29$lambda$25$lambda$24$lambda$23$lambda$21$lambda$20 */
    public static final Unit m2162xdbf80545(MarginUpgradeRatesVisualState marginUpgradeRatesVisualState, SnapshotState4 snapshotState4, SnapshotState4 snapshotState42, DrawScope drawBehind) {
        Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
        float fMo5016toPx0680j_4 = drawBehind.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(MarginUpgradeRatesVisual$lambda$29$lambda$25$lambda$24$lambda$17(snapshotState4)));
        float fMo5016toPx0680j_42 = drawBehind.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(18));
        float fMo5016toPx0680j_43 = drawBehind.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(8));
        MarginUpgradeRatesVisualState.HighlightRowStyle highlightRowStyle = marginUpgradeRatesVisualState.getHighlightRowStyle();
        if (highlightRowStyle instanceof MarginUpgradeRatesVisualState.HighlightRowStyle.SolidColorBackground) {
            long jM6705copywmQWz5c$default = Color.m6705copywmQWz5c$default(((MarginUpgradeRatesVisualState.HighlightRowStyle.SolidColorBackground) highlightRowStyle).m16250getBackgroundColor0d7_KjU(), MarginUpgradeRatesVisual$lambda$29$lambda$25$lambda$24$lambda$18(snapshotState42), 0.0f, 0.0f, 0.0f, 14, null);
            long jM6535constructorimpl = Offset.m6535constructorimpl((Float.floatToRawIntBits(-fMo5016toPx0680j_42) & 4294967295L) | (Float.floatToRawIntBits(-fMo5016toPx0680j_4) << 32));
            float f = 2;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (drawBehind.mo6963getSizeNHjbRc() >> 32)) + (fMo5016toPx0680j_4 * f);
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawBehind.mo6963getSizeNHjbRc() & 4294967295L)) + (fMo5016toPx0680j_42 * f);
            DrawScope.m6960drawRoundRectuAw5IA$default(drawBehind, jM6705copywmQWz5c$default, jM6535constructorimpl, Size.m6575constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32)), CornerRadius.m6528constructorimpl((Float.floatToRawIntBits(fMo5016toPx0680j_43) << 32) | (Float.floatToRawIntBits(fMo5016toPx0680j_43) & 4294967295L)), null, 0.0f, null, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, null);
        } else {
            if (!(highlightRowStyle instanceof MarginUpgradeRatesVisualState.HighlightRowStyle.OpacityReducedBackgroundWithBorder)) {
                throw new NoWhenBranchMatchedException();
            }
            MarginUpgradeRatesVisualState.HighlightRowStyle.OpacityReducedBackgroundWithBorder opacityReducedBackgroundWithBorder = (MarginUpgradeRatesVisualState.HighlightRowStyle.OpacityReducedBackgroundWithBorder) highlightRowStyle;
            long jM6705copywmQWz5c$default2 = Color.m6705copywmQWz5c$default(opacityReducedBackgroundWithBorder.m16245getBackgroundColor0d7_KjU(), MarginUpgradeRatesVisual$lambda$29$lambda$25$lambda$24$lambda$18(snapshotState42), 0.0f, 0.0f, 0.0f, 14, null);
            float f2 = -fMo5016toPx0680j_4;
            float f3 = -fMo5016toPx0680j_42;
            long jM6535constructorimpl2 = Offset.m6535constructorimpl((Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L));
            float f4 = 2;
            float f5 = fMo5016toPx0680j_4 * f4;
            float fIntBitsToFloat3 = Float.intBitsToFloat((int) (drawBehind.mo6963getSizeNHjbRc() >> 32)) + f5;
            float f6 = fMo5016toPx0680j_42 * f4;
            float fIntBitsToFloat4 = Float.intBitsToFloat((int) (drawBehind.mo6963getSizeNHjbRc() & 4294967295L)) + f6;
            DrawScope.m6960drawRoundRectuAw5IA$default(drawBehind, jM6705copywmQWz5c$default2, jM6535constructorimpl2, Size.m6575constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat4) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat3) << 32)), CornerRadius.m6528constructorimpl((Float.floatToRawIntBits(fMo5016toPx0680j_43) << 32) | (Float.floatToRawIntBits(fMo5016toPx0680j_43) & 4294967295L)), null, 0.0f, null, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, null);
            long jM6705copywmQWz5c$default3 = Color.m6705copywmQWz5c$default(opacityReducedBackgroundWithBorder.m16246getHighlightColor0d7_KjU(), 0.1f * MarginUpgradeRatesVisual$lambda$29$lambda$25$lambda$24$lambda$18(snapshotState42), 0.0f, 0.0f, 0.0f, 14, null);
            long jM6535constructorimpl3 = Offset.m6535constructorimpl((Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L));
            float fIntBitsToFloat5 = Float.intBitsToFloat((int) (drawBehind.mo6963getSizeNHjbRc() >> 32)) + f5;
            float fIntBitsToFloat6 = Float.intBitsToFloat((int) (drawBehind.mo6963getSizeNHjbRc() & 4294967295L)) + f6;
            DrawScope.m6960drawRoundRectuAw5IA$default(drawBehind, jM6705copywmQWz5c$default3, jM6535constructorimpl3, Size.m6575constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat5) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat6) & 4294967295L)), CornerRadius.m6528constructorimpl((Float.floatToRawIntBits(fMo5016toPx0680j_43) << 32) | (Float.floatToRawIntBits(fMo5016toPx0680j_43) & 4294967295L)), null, 0.0f, null, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, null);
            float fMo5016toPx0680j_44 = drawBehind.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(1));
            long jM6705copywmQWz5c$default4 = Color.m6705copywmQWz5c$default(opacityReducedBackgroundWithBorder.m16246getHighlightColor0d7_KjU(), MarginUpgradeRatesVisual$lambda$29$lambda$25$lambda$24$lambda$18(snapshotState42), 0.0f, 0.0f, 0.0f, 14, null);
            long jM6535constructorimpl4 = Offset.m6535constructorimpl((Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L));
            float fIntBitsToFloat7 = Float.intBitsToFloat((int) (drawBehind.mo6963getSizeNHjbRc() >> 32)) + f5;
            float fIntBitsToFloat8 = Float.intBitsToFloat((int) (drawBehind.mo6963getSizeNHjbRc() & 4294967295L)) + f6;
            DrawScope.m6960drawRoundRectuAw5IA$default(drawBehind, jM6705copywmQWz5c$default4, jM6535constructorimpl4, Size.m6575constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat8) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat7) << 32)), CornerRadius.m6528constructorimpl((Float.floatToRawIntBits(fMo5016toPx0680j_43) << 32) | (Float.floatToRawIntBits(fMo5016toPx0680j_43) & 4294967295L)), new Stroke(fMo5016toPx0680j_44, 0.0f, 0, 0, null, 30, null), 0.0f, null, 0, 224, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarginUpgradeRatesVisual$lambda$29$lambda$27$lambda$26(SnapshotState snapshotState, LayoutCoordinates layoutCoordinates) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "layoutCoordinates");
        MarginUpgradeRatesVisual$lambda$2(snapshotState, LayoutCoordinates2.positionInWindow(layoutCoordinates));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ce A[LOOP:0: B:57:0x00c8->B:59:0x00ce, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MarginUpgradeRatesVisual(final ImmutableList<MarginTieredRates.MarginTieredRate> rates, final boolean z, final String goldFooter, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Modifier modifier3;
        long jM21456getPositive0d7_KjU;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(rates, "rates");
        Intrinsics.checkNotNullParameter(goldFooter, "goldFooter");
        Composer composerStartRestartGroup = composer.startRestartGroup(833876907);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(rates) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(goldFooter) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(833876907, i3, -1, "com.robinhood.android.margin.upgrade.rates.MarginUpgradeRatesVisual (MarginUpgradeRatesVisual.kt:411)");
                }
                MarginUpgradeRatesVisualState.Row row = new MarginUpgradeRatesVisualState.Row(StringResources_androidKt.stringResource(C21137R.string.margin_upgrade_rates_table_header_left, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(C21137R.string.margin_upgrade_rates_table_header_right, composerStartRestartGroup, 0), false, null, null, 28, null);
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(rates, 10));
                for (MarginTieredRates.MarginTieredRate marginTieredRate : rates) {
                    arrayList.add(new MarginUpgradeRatesVisualState.Row(marginTieredRate.getMarginBalanceRange(), marginTieredRate.getInterestRateDisplay(), marginTieredRate.isHighlighted(), null, null, 24, null));
                }
                if (z) {
                    composerStartRestartGroup.startReplaceGroup(-1803150221);
                    jM21456getPositive0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21456getPositive0d7_KjU();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1803151059);
                    jM21456getPositive0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU();
                }
                composerStartRestartGroup.endReplaceGroup();
                MarginUpgradeRatesVisual(new MarginUpgradeRatesVisualState(row, arrayList, z ? new MarginUpgradeRatesVisualState.Footer(goldFooter, true) : null, new MarginUpgradeRatesVisualState.HighlightRowStyle.SolidColorBackground(jM21456getPositive0d7_KjU, 0 == true ? 1 : 0)), modifier3, composerStartRestartGroup, (i3 >> 6) & 112, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Modifier modifier4 = modifier3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.margin.upgrade.rates.MarginUpgradeRatesVisualKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return MarginUpgradeRatesVisual.MarginUpgradeRatesVisual$lambda$32(rates, z, goldFooter, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            MarginUpgradeRatesVisualState.Row row2 = new MarginUpgradeRatesVisualState.Row(StringResources_androidKt.stringResource(C21137R.string.margin_upgrade_rates_table_header_left, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(C21137R.string.margin_upgrade_rates_table_header_right, composerStartRestartGroup, 0), false, null, null, 28, null);
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(rates, 10));
            while (r10.hasNext()) {
            }
            if (z) {
            }
            composerStartRestartGroup.endReplaceGroup();
            MarginUpgradeRatesVisual(new MarginUpgradeRatesVisualState(row2, arrayList2, z ? new MarginUpgradeRatesVisualState.Footer(goldFooter, true) : null, new MarginUpgradeRatesVisualState.HighlightRowStyle.SolidColorBackground(jM21456getPositive0d7_KjU, 0 == true ? 1 : 0)), modifier3, composerStartRestartGroup, (i3 >> 6) & 112, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    @SduiComposable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <ActionT extends Parcelable> void SduiMarginTieredInterestRates(final MarginTieredInterestRates<? extends ActionT> component, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(component, "component");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1727211826);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(component) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1727211826, i3, -1, "com.robinhood.android.margin.upgrade.rates.SduiMarginTieredInterestRates (MarginUpgradeRatesVisual.kt:452)");
                }
                String title = component.getHeader().getTitle();
                String value = component.getHeader().getValue();
                ThemedColor text_color = component.getHeader().getText_color();
                composerStartRestartGroup.startReplaceGroup(-1993177474);
                Color composeColor = text_color != null ? null : SduiColors2.toComposeColor(text_color, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
                MarginUpgradeRatesVisualState.Row row = new MarginUpgradeRatesVisualState.Row(title, value, false, composeColor, null, 20, null);
                composerStartRestartGroup.startReplaceGroup(-1993175781);
                List<MarginRateRow> rates = component.getRates();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(rates, 10));
                int i5 = 0;
                for (Object obj : rates) {
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    MarginRateRow marginRateRow = (MarginRateRow) obj;
                    String title2 = marginRateRow.getTitle();
                    String value2 = marginRateRow.getValue();
                    Integer highlighted_row_index = component.getHighlighted_row_index();
                    boolean z = highlighted_row_index != null && i5 == highlighted_row_index.intValue();
                    ThemedColor text_color2 = marginRateRow.getText_color();
                    composerStartRestartGroup.startReplaceGroup(-1993168482);
                    Color composeColor2 = text_color2 == null ? null : SduiColors2.toComposeColor(text_color2, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    arrayList.add(new MarginUpgradeRatesVisualState.Row(title2, value2, z, composeColor2, null, 16, null));
                    i5 = i6;
                }
                composerStartRestartGroup.endReplaceGroup();
                ThemedColor highlighted_background_color = component.getHighlighted_background_color();
                composerStartRestartGroup.startReplaceGroup(-1993164002);
                Color composeColor3 = highlighted_background_color != null ? null : SduiColors2.toComposeColor(highlighted_background_color, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1993164902);
                long jM21456getPositive0d7_KjU = composeColor3 != null ? BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21456getPositive0d7_KjU() : composeColor3.getValue();
                composerStartRestartGroup.endReplaceGroup();
                MarginUpgradeRatesVisualState.HighlightRowStyle.SolidColorBackground solidColorBackground = new MarginUpgradeRatesVisualState.HighlightRowStyle.SolidColorBackground(jM21456getPositive0d7_KjU, 0 == true ? 1 : 0);
                MarginTieredRateTableCallout callout = component.getCallout();
                MarginUpgradeRatesVisual(new MarginUpgradeRatesVisualState(row, arrayList, callout != null ? new MarginUpgradeRatesVisualState.Footer(callout.getTitle(), callout.is_gold()) : null, solidColorBackground), modifier3, composerStartRestartGroup, i3 & 112, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.margin.upgrade.rates.MarginUpgradeRatesVisualKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return MarginUpgradeRatesVisual.SduiMarginTieredInterestRates$lambda$36(component, modifier3, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            String title3 = component.getHeader().getTitle();
            String value3 = component.getHeader().getValue();
            ThemedColor text_color3 = component.getHeader().getText_color();
            composerStartRestartGroup.startReplaceGroup(-1993177474);
            if (text_color3 != null) {
            }
            composerStartRestartGroup.endReplaceGroup();
            MarginUpgradeRatesVisualState.Row row2 = new MarginUpgradeRatesVisualState.Row(title3, value3, false, composeColor, null, 20, null);
            composerStartRestartGroup.startReplaceGroup(-1993175781);
            List<MarginRateRow> rates2 = component.getRates();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(rates2, 10));
            int i52 = 0;
            while (r3.hasNext()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            ThemedColor highlighted_background_color2 = component.getHighlighted_background_color();
            composerStartRestartGroup.startReplaceGroup(-1993164002);
            if (highlighted_background_color2 != null) {
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1993164902);
            if (composeColor3 != null) {
            }
            composerStartRestartGroup.endReplaceGroup();
            MarginUpgradeRatesVisualState.HighlightRowStyle.SolidColorBackground solidColorBackground2 = new MarginUpgradeRatesVisualState.HighlightRowStyle.SolidColorBackground(jM21456getPositive0d7_KjU, 0 == true ? 1 : 0);
            MarginTieredRateTableCallout callout2 = component.getCallout();
            MarginUpgradeRatesVisual(new MarginUpgradeRatesVisualState(row2, arrayList2, callout2 != null ? new MarginUpgradeRatesVisualState.Footer(callout2.getTitle(), callout2.is_gold()) : null, solidColorBackground2), modifier3, composerStartRestartGroup, i3 & 112, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01b4  */
    @SduiComposable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <ActionT extends Parcelable> void ProtoSduiMarginTieredInterestRates(final UIComponentDto.ConcreteDto.MarginTieredInterestRates component, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        MarginRateHeaderDto header;
        MarginUpgradeRatesVisualState.Row row;
        MarginUpgradeRatesVisualState.HighlightRowStyle highlightRowStyle;
        DefaultConstructorMarker defaultConstructorMarker;
        FontWeight normal;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(component, "component");
        Composer composerStartRestartGroup = composer.startRestartGroup(1967158498);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(component) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1967158498, i3, -1, "com.robinhood.android.margin.upgrade.rates.ProtoSduiMarginTieredInterestRates (MarginUpgradeRatesVisual.kt:491)");
                }
                MarginTieredInterestRatesDto value = component.getValue();
                header = value.getHeader();
                composerStartRestartGroup.startReplaceGroup(653714455);
                if (header != null) {
                    row = null;
                } else {
                    String title = header.getTitle();
                    String value2 = header.getValue();
                    ThemedColorDto text_color = header.getText_color();
                    composerStartRestartGroup.startReplaceGroup(-844490517);
                    Color composeColor = text_color == null ? null : SduiColors2.toComposeColor(text_color, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    row = new MarginUpgradeRatesVisualState.Row(title, value2, false, composeColor, null, 20, null);
                }
                composerStartRestartGroup.endReplaceGroup();
                if (row == null) {
                    row = new MarginUpgradeRatesVisualState.Row("", "", false, null, null, 28, null);
                }
                composerStartRestartGroup.startReplaceGroup(653724018);
                List<MarginRateRowDto> rates = value.getRates();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(rates, 10));
                int i5 = 0;
                for (Object obj : rates) {
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    MarginRateRowDto marginRateRowDto = (MarginRateRowDto) obj;
                    String title2 = marginRateRowDto.getTitle();
                    String value3 = marginRateRowDto.getValue();
                    Integer highlighted_row_index = value.getHighlighted_row_index();
                    boolean z = highlighted_row_index != null && i5 == highlighted_row_index.intValue();
                    ThemedColorDto text_color2 = marginRateRowDto.getText_color();
                    composerStartRestartGroup.startReplaceGroup(653731026);
                    Color composeColor2 = text_color2 == null ? null : SduiColors2.toComposeColor(text_color2, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    int i7 = WhenMappings.$EnumSwitchMapping$0[marginRateRowDto.getFont_weight().ordinal()];
                    if (i7 == 1) {
                        normal = FontWeight.INSTANCE.getNormal();
                    } else {
                        if (i7 != 2 && i7 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        normal = FontWeight.INSTANCE.getBold();
                    }
                    arrayList.add(new MarginUpgradeRatesVisualState.Row(title2, value3, z, composeColor2, normal, null));
                    i5 = i6;
                }
                composerStartRestartGroup.endReplaceGroup();
                MarginTieredHighlightRowStyleDto highlighted_row_style = value.getHighlighted_row_style();
                MarginTieredHighlightRowStyleDto.HighlightRowStyleDto highlight_row_style = highlighted_row_style == null ? highlighted_row_style.getHighlight_row_style() : null;
                composerStartRestartGroup.startReplaceGroup(653743735);
                highlightRowStyle = highlight_row_style != null ? null : toHighlightRowStyle(highlight_row_style, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(653742522);
                if (highlightRowStyle != null) {
                    ThemedColorDto highlighted_background_color = value.getHighlighted_background_color();
                    composerStartRestartGroup.startReplaceGroup(-844462133);
                    Color composeColor3 = highlighted_background_color == null ? null : SduiColors2.toComposeColor(highlighted_background_color, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    long jM21456getPositive0d7_KjU = composeColor3 == null ? BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21456getPositive0d7_KjU() : composeColor3.getValue();
                    defaultConstructorMarker = null;
                    highlightRowStyle = new MarginUpgradeRatesVisualState.HighlightRowStyle.SolidColorBackground(jM21456getPositive0d7_KjU, defaultConstructorMarker);
                } else {
                    defaultConstructorMarker = null;
                }
                composerStartRestartGroup.endReplaceGroup();
                MarginTieredRateTableCalloutDto callout = value.getCallout();
                MarginUpgradeRatesVisual(new MarginUpgradeRatesVisualState(row, arrayList, callout == null ? new MarginUpgradeRatesVisualState.Footer(callout.getTitle(), callout.is_gold()) : defaultConstructorMarker, highlightRowStyle), modifier3, composerStartRestartGroup, i3 & 112, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.margin.upgrade.rates.MarginUpgradeRatesVisualKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return MarginUpgradeRatesVisual.ProtoSduiMarginTieredInterestRates$lambda$41(component, modifier3, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            MarginTieredInterestRatesDto value4 = component.getValue();
            header = value4.getHeader();
            composerStartRestartGroup.startReplaceGroup(653714455);
            if (header != null) {
            }
            composerStartRestartGroup.endReplaceGroup();
            if (row == null) {
            }
            composerStartRestartGroup.startReplaceGroup(653724018);
            List<MarginRateRowDto> rates2 = value4.getRates();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(rates2, 10));
            int i52 = 0;
            while (r8.hasNext()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            MarginTieredHighlightRowStyleDto highlighted_row_style2 = value4.getHighlighted_row_style();
            if (highlighted_row_style2 == null) {
            }
            composerStartRestartGroup.startReplaceGroup(653743735);
            if (highlight_row_style != null) {
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(653742522);
            if (highlightRowStyle != null) {
            }
            composerStartRestartGroup.endReplaceGroup();
            MarginTieredRateTableCalloutDto callout2 = value4.getCallout();
            MarginUpgradeRatesVisual(new MarginUpgradeRatesVisualState(row, arrayList2, callout2 == null ? new MarginUpgradeRatesVisualState.Footer(callout2.getTitle(), callout2.is_gold()) : defaultConstructorMarker, highlightRowStyle), modifier3, composerStartRestartGroup, i3 & 112, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.robinhood.android.margin.upgrade.rates.MarginUpgradeRatesVisualState$HighlightRowStyle$OpacityReducedBackgroundWithBorder$HighlightAnimation$MoveDownward] */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.robinhood.android.margin.upgrade.rates.MarginUpgradeRatesVisualState$HighlightRowStyle$OpacityReducedBackgroundWithBorder$HighlightAnimation$MoveUpward] */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.robinhood.android.margin.upgrade.rates.MarginUpgradeRatesVisualState$HighlightRowStyle$OpacityReducedBackgroundWithBorder$HighlightAnimation] */
    private static final MarginUpgradeRatesVisualState.HighlightRowStyle toHighlightRowStyle(MarginTieredHighlightRowStyleDto.HighlightRowStyleDto highlightRowStyleDto, Composer composer, int i) {
        composer.startReplaceGroup(-2041943151);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2041943151, i, -1, "com.robinhood.android.margin.upgrade.rates.toHighlightRowStyle (MarginUpgradeRatesVisual.kt:538)");
        }
        DefaultConstructorMarker defaultConstructorMarker = null;
        MarginUpgradeRatesVisualState.HighlightRowStyle solidColorBackground = null;
        if (highlightRowStyleDto instanceof MarginTieredHighlightRowStyleDto.HighlightRowStyleDto.Unspecified) {
            composer.startReplaceGroup(-1906438356);
            composer.endReplaceGroup();
        } else if (highlightRowStyleDto instanceof MarginTieredHighlightRowStyleDto.HighlightRowStyleDto.SolidColorBackground) {
            composer.startReplaceGroup(-1906333172);
            ThemedColorDto background_color = ((MarginTieredHighlightRowStyleDto.HighlightRowStyleDto.SolidColorBackground) highlightRowStyleDto).getValue().getBackground_color();
            Color composeColor = background_color == null ? null : SduiColors2.toComposeColor(background_color, composer, 0);
            solidColorBackground = composeColor != null ? new MarginUpgradeRatesVisualState.HighlightRowStyle.SolidColorBackground(composeColor.getValue(), defaultConstructorMarker) : null;
            composer.endReplaceGroup();
        } else {
            if (!(highlightRowStyleDto instanceof MarginTieredHighlightRowStyleDto.HighlightRowStyleDto.OpacityReducedBackgroundWithBorder)) {
                composer.startReplaceGroup(492690551);
                composer.endReplaceGroup();
                throw new NoWhenBranchMatchedException();
            }
            composer.startReplaceGroup(-1906139391);
            MarginTieredHighlightRowStyleDto.HighlightRowStyleDto.OpacityReducedBackgroundWithBorder opacityReducedBackgroundWithBorder = (MarginTieredHighlightRowStyleDto.HighlightRowStyleDto.OpacityReducedBackgroundWithBorder) highlightRowStyleDto;
            ThemedColorDto background_color2 = opacityReducedBackgroundWithBorder.getValue().getBackground_color();
            composer.startReplaceGroup(492702049);
            Color composeColor2 = background_color2 == null ? null : SduiColors2.toComposeColor(background_color2, composer, 0);
            composer.endReplaceGroup();
            if (composeColor2 == null) {
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return null;
            }
            long value = composeColor2.getValue();
            ThemedColorDto highlight_color = opacityReducedBackgroundWithBorder.getValue().getHighlight_color();
            Color composeColor3 = highlight_color == null ? null : SduiColors2.toComposeColor(highlight_color, composer, 0);
            if (composeColor3 == null) {
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return null;
            }
            long value2 = composeColor3.getValue();
            OpacityReduceBackgroundWithBorderDto.HighlightAnimationDto highlight_animation = opacityReducedBackgroundWithBorder.getValue().getHighlight_animation();
            if (highlight_animation instanceof OpacityReduceBackgroundWithBorderDto.HighlightAnimationDto.MoveUpward) {
                defaultConstructorMarker = MarginUpgradeRatesVisualState.HighlightRowStyle.OpacityReducedBackgroundWithBorder.HighlightAnimation.MoveUpward.INSTANCE;
            } else if (highlight_animation instanceof OpacityReduceBackgroundWithBorderDto.HighlightAnimationDto.MoveDownward) {
                defaultConstructorMarker = MarginUpgradeRatesVisualState.HighlightRowStyle.OpacityReducedBackgroundWithBorder.HighlightAnimation.MoveDownward.INSTANCE;
            } else if (highlight_animation != null) {
                throw new NoWhenBranchMatchedException();
            }
            MarginUpgradeRatesVisualState.HighlightRowStyle opacityReducedBackgroundWithBorder2 = new MarginUpgradeRatesVisualState.HighlightRowStyle.OpacityReducedBackgroundWithBorder(value, value2, defaultConstructorMarker, null);
            composer.endReplaceGroup();
            solidColorBackground = opacityReducedBackgroundWithBorder2;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return solidColorBackground;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void MarginUpgradeRatesVisualPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1122832229);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1122832229, i, -1, "com.robinhood.android.margin.upgrade.rates.MarginUpgradeRatesVisualPreview (MarginUpgradeRatesVisual.kt:566)");
            }
            MarginUpgradeRatesVisualState.Row row = new MarginUpgradeRatesVisualState.Row("$5M+", "5.70%", false, null, null, 24, null);
            Object[] objArr = 0 == true ? 1 : 0;
            MarginUpgradeRatesVisualState.Row row2 = new MarginUpgradeRatesVisualState.Row("$500K up to $5M", "5.95%", false, objArr, null, 24, null);
            Object[] objArr2 = 0 == true ? 1 : 0;
            Object[] objArr3 = 0 == true ? 1 : 0;
            final List listListOf = CollectionsKt.listOf((Object[]) new MarginUpgradeRatesVisualState.Row[]{row, row2, new MarginUpgradeRatesVisualState.Row("$50K up to $100K", "6.55%", true, objArr2, null, 24, null), new MarginUpgradeRatesVisualState.Row("Less than $50K", "6.75%", false, objArr3, null, 24, null)});
            CompositionLocal3.CompositionLocalProvider(InspectionMode.getLocalInspectionMode().provides(Boolean.TRUE), ComposableLambda3.rememberComposableLambda(1612579877, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.margin.upgrade.rates.MarginUpgradeRatesVisualKt.MarginUpgradeRatesVisualPreview.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    if ((i2 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1612579877, i2, -1, "com.robinhood.android.margin.upgrade.rates.MarginUpgradeRatesVisualPreview.<anonymous> (MarginUpgradeRatesVisual.kt:590)");
                    }
                    final List<MarginUpgradeRatesVisualState.Row> list = listListOf;
                    BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-71353891, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.margin.upgrade.rates.MarginUpgradeRatesVisualKt.MarginUpgradeRatesVisualPreview.1.1
                        public final void invoke(Composer composer3, int i3) {
                            if ((i3 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-71353891, i3, -1, "com.robinhood.android.margin.upgrade.rates.MarginUpgradeRatesVisualPreview.<anonymous>.<anonymous> (MarginUpgradeRatesVisual.kt:591)");
                            }
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i4 = BentoTheme.$stable;
                            MarginUpgradeRatesVisualState.HighlightRowStyle.SolidColorBackground solidColorBackground = new MarginUpgradeRatesVisualState.HighlightRowStyle.SolidColorBackground(bentoTheme.getColors(composer3, i4).m21456getPositive0d7_KjU(), null);
                            Modifier modifierM5142padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m5142padding3ABfNKs(Background3.m4872backgroundbw27NRU$default(SizeKt.m5174width3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(500)), bentoTheme.getColors(composer3, i4).m21372getBg20d7_KjU(), null, 2, null), C2002Dp.m7995constructorimpl(32));
                            List<MarginUpgradeRatesVisualState.Row> list2 = list;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM5142padding3ABfNKs);
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            MarginUpgradeRatesVisual.MarginUpgradeRatesVisual(new MarginUpgradeRatesVisualState(new MarginUpgradeRatesVisualState.Row("30d volume", "Fee", false, null, null, 28, null), list2, null, solidColorBackground), null, composer3, 0, 2);
                            composer3.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }
                    }, composer2, 54), composer2, 100663296, 255);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.margin.upgrade.rates.MarginUpgradeRatesVisualKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MarginUpgradeRatesVisual.MarginUpgradeRatesVisualPreview$lambda$43(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
