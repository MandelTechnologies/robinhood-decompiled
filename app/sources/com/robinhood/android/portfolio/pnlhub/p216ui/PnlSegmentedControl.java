package com.robinhood.android.portfolio.pnlhub.p216ui;

import android.view.View;
import androidx.compose.animation.core.AnimateAsState;
import androidx.compose.animation.core.AnimationVectors3;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.Selectable3;
import androidx.compose.foundation.selection.SelectableGroup;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.BiasAlignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnRemeasuredModifier2;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.semantics.Role;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextOverflow;
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
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoSegmentedControl2;
import com.robinhood.compose.bento.component.BentoSegmentedControl3;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.Segment;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.ModifiersKt;
import com.robinhood.compose.theme.style.SegmentedControlStyle;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: PnlSegmentedControl.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aa\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0007¢\u0006\u0002\u0010\u0013\u001aK\u0010\u0014\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\n2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0007¢\u0006\u0002\u0010\u0015\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0016²\u0006\n\u0010\u0017\u001a\u00020\u0018X\u008a\u008e\u0002²\u0006\n\u0010\u0019\u001a\u00020\u0018X\u008a\u008e\u0002²\u0006\n\u0010\u001a\u001a\u00020\u001bX\u008a\u0084\u0002²\u0006\n\u0010\u001c\u001a\u00020\u001bX\u008a\u0084\u0002²\u0006\n\u0010\u001d\u001a\u00020\bX\u008a\u0084\u0002"}, m3636d2 = {"PNL_HUB_SEGMENT_CONTROL_TRAILING_ICON", "", "PnlSegmentedControlWithTrailingIcon", "", "segments", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/compose/bento/component/Segment;", "selectedIndex", "", "onIndexSelected", "Lkotlin/Function1;", "trailingIcon", "Lcom/robinhood/compose/bento/component/BentoIcons;", "onTrailingIconSelected", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "showPlaceholder", "", "(Lkotlinx/collections/immutable/ImmutableList;ILkotlin/jvm/functions/Function1;Lcom/robinhood/compose/bento/component/BentoIcons;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "PnlSegmentedControl", "(Lkotlinx/collections/immutable/ImmutableList;ILkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "feature-profit-and-loss-hub_externalDebug", "segmentBackgroundWidth", "Landroidx/compose/ui/unit/Dp;", "segmentBackgroundHeight", "horizontalBias", "Landroidx/compose/ui/BiasAlignment;", "alignment", "fontWeight"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.portfolio.pnlhub.ui.PnlSegmentedControlKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class PnlSegmentedControl {
    public static final String PNL_HUB_SEGMENT_CONTROL_TRAILING_ICON = "pnl_hub_segment_control_trailing_icon";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PnlSegmentedControl$lambda$29(ImmutableList immutableList, int i, Function1 function1, Modifier modifier, boolean z, int i2, int i3, Composer composer, int i4) {
        PnlSegmentedControl(immutableList, i, function1, modifier, z, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PnlSegmentedControlWithTrailingIcon$lambda$4(ImmutableList immutableList, int i, Function1 function1, BentoIcon4 bentoIcon4, Function0 function0, Modifier modifier, boolean z, int i2, int i3, Composer composer, int i4) {
        PnlSegmentedControlWithTrailingIcon(immutableList, i, function1, bentoIcon4, function0, modifier, z, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PnlSegmentedControlWithTrailingIcon(final ImmutableList<Segment> segments, final int i, final Function1<? super Integer, Unit> onIndexSelected, final BentoIcon4 trailingIcon, final Function0<Unit> onTrailingIconSelected, Modifier modifier, boolean z, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        final Modifier modifier2;
        int i7;
        boolean z2;
        int i8;
        final View view;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        boolean zChangedInstance;
        Object objRememberedValue;
        Composer composer2;
        final boolean z3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(segments, "segments");
        Intrinsics.checkNotNullParameter(onIndexSelected, "onIndexSelected");
        Intrinsics.checkNotNullParameter(trailingIcon, "trailingIcon");
        Intrinsics.checkNotNullParameter(onTrailingIconSelected, "onTrailingIconSelected");
        Composer composerStartRestartGroup = composer.startRestartGroup(178192733);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = ((i2 & 8) == 0 ? composerStartRestartGroup.changed(segments) : composerStartRestartGroup.changedInstance(segments) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                i5 = i;
                i4 |= composerStartRestartGroup.changed(i5) ? 32 : 16;
            }
            if ((i3 & 4) == 0) {
                i4 |= 384;
            } else if ((i2 & 384) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(onIndexSelected) ? 256 : 128;
            }
            if ((i3 & 8) == 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                i4 |= (i2 & 4096) == 0 ? composerStartRestartGroup.changed(trailingIcon) : composerStartRestartGroup.changedInstance(trailingIcon) ? 2048 : 1024;
            }
            if ((i3 & 16) == 0) {
                i4 |= 24576;
            } else if ((i2 & 24576) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(onTrailingIconSelected) ? 16384 : 8192;
            }
            i6 = i3 & 32;
            if (i6 == 0) {
                i4 |= 196608;
            } else {
                if ((196608 & i2) == 0) {
                    modifier2 = modifier;
                    i4 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
                }
                i7 = i3 & 64;
                if (i7 == 0) {
                    if ((1572864 & i2) == 0) {
                        z2 = z;
                        i4 |= composerStartRestartGroup.changed(z2) ? 1048576 : 524288;
                    }
                    i8 = i4;
                    if ((599187 & i8) == 599186 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier3 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                        if (i7 != 0) {
                            z2 = false;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(178192733, i8, -1, "com.robinhood.android.portfolio.pnlhub.ui.PnlSegmentedControlWithTrailingIcon (PnlSegmentedControl.kt:57)");
                        }
                        SegmentedControlStyle segmentedControlStyle = (SegmentedControlStyle) composerStartRestartGroup.consume(BentoSegmentedControl2.getLocalSegmentedControlStyle());
                        view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
                        Alignment.Companion companion = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getCenter(), companion.getCenterVertically(), composerStartRestartGroup, 54);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                        Row6 row6 = Row6.INSTANCE;
                        Modifier.Companion companion3 = Modifier.INSTANCE;
                        Modifier modifierWeight$default = Row5.weight$default(row6, companion3, 0.9f, false, 2, null);
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i9 = BentoTheme.$stable;
                        int i10 = i5;
                        boolean z4 = z2;
                        PnlSegmentedControl(segments, i10, onIndexSelected, PaddingKt.m5146paddingqDBjuR0$default(modifierWeight$default, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i9).m21593getSmallD9Ej5fM(), 0.0f, 11, null), z4, composerStartRestartGroup, Segment.$stable | (i8 & 14) | (i8 & 112) | (i8 & 896) | ((i8 >> 6) & 57344), 0);
                        Modifier modifierM4871backgroundbw27NRU = Background3.m4871backgroundbw27NRU(SizeKt.m5169size3ABfNKs(Row5.weight$default(row6, companion3, 0.1f, false, 2, null), C2002Dp.m7995constructorimpl(36)), segmentedControlStyle.getColors(composerStartRestartGroup, 0).m21937getContainerBackgroundColor0d7_KjU(), RoundedCornerShape2.RoundedCornerShape(50));
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getCenter(), false);
                        currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4871backgroundbw27NRU);
                        Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
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
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                        setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        Modifier modifierTestTag = TestTag3.testTag(companion3, PNL_HUB_SEGMENT_CONTROL_TRAILING_ICON);
                        String strStringResource = StringResources_androidKt.stringResource(C25819R.string.pnl_hub_trade_detail_settings_button_description, composerStartRestartGroup, 0);
                        long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i9).m21425getFg0d7_KjU();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        zChangedInstance = composerStartRestartGroup.changedInstance(view) | ((i8 & 57344) != 16384);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.portfolio.pnlhub.ui.PnlSegmentedControlKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return PnlSegmentedControl.m2384x1c1152(view, onTrailingIconSelected);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        BentoIcon2.m20644BentoIconFU0evQE(trailingIcon, strStringResource, jM21425getFg0d7_KjU, modifierTestTag, (Function0) objRememberedValue, false, composerStartRestartGroup, BentoIcon4.$stable | 3072 | ((i8 >> 9) & 14), 32);
                        composer2 = composerStartRestartGroup;
                        composer2.endNode();
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier3;
                        z3 = z4;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        composer2 = composerStartRestartGroup;
                        z3 = z2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.portfolio.pnlhub.ui.PnlSegmentedControlKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return PnlSegmentedControl.PnlSegmentedControlWithTrailingIcon$lambda$4(segments, i, onIndexSelected, trailingIcon, onTrailingIconSelected, modifier2, z3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i4 |= 1572864;
                z2 = z;
                i8 = i4;
                if ((599187 & i8) == 599186) {
                    if (i6 == 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    SegmentedControlStyle segmentedControlStyle2 = (SegmentedControlStyle) composerStartRestartGroup.consume(BentoSegmentedControl2.getLocalSegmentedControlStyle());
                    view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
                    Alignment.Companion companion4 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getCenter(), companion4.getCenterVertically(), composerStartRestartGroup, 54);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
                    ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor3 = companion22.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion22.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion22.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion22.getSetModifier());
                        Row6 row62 = Row6.INSTANCE;
                        Modifier.Companion companion32 = Modifier.INSTANCE;
                        Modifier modifierWeight$default2 = Row5.weight$default(row62, companion32, 0.9f, false, 2, null);
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i92 = BentoTheme.$stable;
                        int i102 = i5;
                        boolean z42 = z2;
                        PnlSegmentedControl(segments, i102, onIndexSelected, PaddingKt.m5146paddingqDBjuR0$default(modifierWeight$default2, 0.0f, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i92).m21593getSmallD9Ej5fM(), 0.0f, 11, null), z42, composerStartRestartGroup, Segment.$stable | (i8 & 14) | (i8 & 112) | (i8 & 896) | ((i8 >> 6) & 57344), 0);
                        Modifier modifierM4871backgroundbw27NRU2 = Background3.m4871backgroundbw27NRU(SizeKt.m5169size3ABfNKs(Row5.weight$default(row62, companion32, 0.1f, false, 2, null), C2002Dp.m7995constructorimpl(36)), segmentedControlStyle2.getColors(composerStartRestartGroup, 0).m21937getContainerBackgroundColor0d7_KjU(), RoundedCornerShape2.RoundedCornerShape(50));
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getCenter(), false);
                        currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4871backgroundbw27NRU2);
                        Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                        setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl2.getInserting()) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                            Modifier modifierTestTag2 = TestTag3.testTag(companion32, PNL_HUB_SEGMENT_CONTROL_TRAILING_ICON);
                            String strStringResource2 = StringResources_androidKt.stringResource(C25819R.string.pnl_hub_trade_detail_settings_button_description, composerStartRestartGroup, 0);
                            long jM21425getFg0d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i92).m21425getFg0d7_KjU();
                            composerStartRestartGroup.startReplaceGroup(-1633490746);
                            zChangedInstance = composerStartRestartGroup.changedInstance(view) | ((i8 & 57344) != 16384);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!zChangedInstance) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.portfolio.pnlhub.ui.PnlSegmentedControlKt$$ExternalSyntheticLambda5
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return PnlSegmentedControl.m2384x1c1152(view, onTrailingIconSelected);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                composerStartRestartGroup.endReplaceGroup();
                                BentoIcon2.m20644BentoIconFU0evQE(trailingIcon, strStringResource2, jM21425getFg0d7_KjU2, modifierTestTag2, (Function0) objRememberedValue, false, composerStartRestartGroup, BentoIcon4.$stable | 3072 | ((i8 >> 9) & 14), 32);
                                composer2 = composerStartRestartGroup;
                                composer2.endNode();
                                composer2.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier2 = modifier3;
                                z3 = z42;
                            }
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            modifier2 = modifier;
            i7 = i3 & 64;
            if (i7 == 0) {
            }
            z2 = z;
            i8 = i4;
            if ((599187 & i8) == 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        i5 = i;
        if ((i3 & 4) == 0) {
        }
        if ((i3 & 8) == 0) {
        }
        if ((i3 & 16) == 0) {
        }
        i6 = i3 & 32;
        if (i6 == 0) {
        }
        modifier2 = modifier;
        i7 = i3 & 64;
        if (i7 == 0) {
        }
        z2 = z;
        i8 = i4;
        if ((599187 & i8) == 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final BiasAlignment PnlSegmentedControl$lambda$28$lambda$12(SnapshotState<BiasAlignment> snapshotState) {
        return snapshotState.getValue();
    }

    private static final BiasAlignment PnlSegmentedControl$lambda$28$lambda$17(SnapshotState4<BiasAlignment> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final int PnlSegmentedControl$lambda$28$lambda$27$lambda$26$lambda$18(SnapshotState4<Integer> snapshotState4) {
        return snapshotState4.getValue().intValue();
    }

    private static final float PnlSegmentedControl$lambda$28$lambda$6(SnapshotState<C2002Dp> snapshotState) {
        return snapshotState.getValue().getValue();
    }

    private static final float PnlSegmentedControl$lambda$28$lambda$9(SnapshotState<C2002Dp> snapshotState) {
        return snapshotState.getValue().getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PnlSegmentedControlWithTrailingIcon$lambda$3$lambda$2$lambda$1$lambda$0 */
    public static final Unit m2384x1c1152(View view, Function0 function0) {
        view.performHapticFeedback(6);
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x05d0  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:197:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0209  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PnlSegmentedControl(final ImmutableList<Segment> segments, final int i, final Function1<? super Integer, Unit> onIndexSelected, Modifier modifier, boolean z, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        boolean z2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        boolean zChanged;
        Object objRememberedValue3;
        Object objRememberedValue4;
        Object objRememberedValue5;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        final Modifier modifier3;
        final boolean z3;
        Density density;
        View view;
        boolean z4;
        Composer composer2;
        int i6;
        Composer composer3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(segments, "segments");
        Intrinsics.checkNotNullParameter(onIndexSelected, "onIndexSelected");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1976326926);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = ((i2 & 8) == 0 ? composerStartRestartGroup.changed(segments) : composerStartRestartGroup.changedInstance(segments) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onIndexSelected) ? 256 : 128;
        }
        int i7 = i3 & 8;
        if (i7 != 0) {
            i4 |= 3072;
        } else {
            if ((i2 & 3072) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i5 = i3 & 16;
            if (i5 != 0) {
                if ((i2 & 24576) == 0) {
                    z2 = z;
                    i4 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
                }
                if ((i4 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    z3 = z2;
                    composer3 = composerStartRestartGroup;
                } else {
                    Modifier modifier4 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                    boolean z5 = i5 == 0 ? false : z2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1976326926, i4, -1, "com.robinhood.android.portfolio.pnlhub.ui.PnlSegmentedControl (PnlSegmentedControl.kt:105)");
                    }
                    List listListOf = !segments.isEmpty() ? CollectionsKt.listOf(new Segment(null, "", null, 5, null)) : segments;
                    SegmentedControlStyle segmentedControlStyle = (SegmentedControlStyle) composerStartRestartGroup.consume(BentoSegmentedControl2.getLocalSegmentedControlStyle());
                    View view2 = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
                    Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    Modifier modifierPadding = PaddingKt.padding(Clip.clip(Background3.m4871backgroundbw27NRU(ModifiersKt.bentoPillPlaceholder(modifier4, z5), segmentedControlStyle.getColors(composerStartRestartGroup, 0).m21937getContainerBackgroundColor0d7_KjU(), RoundedCornerShape2.RoundedCornerShape(50)), RoundedCornerShape2.RoundedCornerShape(50)), segmentedControlStyle.getSpacing(composerStartRestartGroup, 0).getContainerPadding());
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierPadding);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    List list = listListOf;
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    boolean z6 = z5;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotState3.mutableStateOf$default(C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(0.0f)), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        Object objMutableStateOf$default = SnapshotState3.mutableStateOf$default(C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(0.0f)), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objMutableStateOf$default);
                        objRememberedValue2 = objMutableStateOf$default;
                    }
                    final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    int size = segments.size();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    zChanged = composerStartRestartGroup.changed(size) | ((i4 & 112) != 32);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged || objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = SnapshotState3.mutableStateOf$default(segments.size() != 1 ? new BiasAlignment(0.0f, 0.0f) : new BiasAlignment((((i * 2) - segments.size()) + 1) / (segments.size() - 1), 0.0f), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BiasAlignment biasAlignmentPnlSegmentedControl$lambda$28$lambda$12 = PnlSegmentedControl$lambda$28$lambda$12((SnapshotState) objRememberedValue3);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new Function1() { // from class: com.robinhood.android.portfolio.pnlhub.ui.PnlSegmentedControlKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return PnlSegmentedControl.PnlSegmentedControl$lambda$28$lambda$14$lambda$13((BiasAlignment) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    Function1 function1 = (Function1) objRememberedValue4;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = new Function1() { // from class: com.robinhood.android.portfolio.pnlhub.ui.PnlSegmentedControlKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return PnlSegmentedControl.PnlSegmentedControl$lambda$28$lambda$16$lambda$15((AnimationVectors3) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifier5 = modifier4;
                    View view3 = view2;
                    Density density3 = density2;
                    int i8 = 0;
                    SnapshotState4 snapshotState4AnimateValueAsState = AnimateAsState.animateValueAsState(biasAlignmentPnlSegmentedControl$lambda$28$lambda$12, VectorConvertersKt.TwoWayConverter(function1, (Function1) objRememberedValue5), null, null, null, null, composerStartRestartGroup, 0, 60);
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    BoxKt.Box(boxScopeInstance.align(Clip.clip(Background3.m4871backgroundbw27NRU(SizeKt.m5171sizeVpY3zN4(companion4, PnlSegmentedControl$lambda$28$lambda$6(snapshotState), PnlSegmentedControl$lambda$28$lambda$9(snapshotState2)), segmentedControlStyle.getColors(composerStartRestartGroup, 0).m21939getSegmentBackgroundColor0d7_KjU(), RoundedCornerShape2.RoundedCornerShape(50)), RoundedCornerShape2.RoundedCornerShape(50)), PnlSegmentedControl$lambda$28$lambda$17(snapshotState4AnimateValueAsState)), composerStartRestartGroup, 0);
                    Modifier modifierSelectableGroup = SelectableGroup.selectableGroup(companion4);
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion2.getTop(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierSelectableGroup);
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
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(-1573967266);
                    final int i9 = 0;
                    Composer composer4 = composerStartRestartGroup;
                    for (Object obj : list) {
                        int i10 = i9 + 1;
                        if (i9 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        Segment segment = (Segment) obj;
                        final boolean z7 = i9 == i ? 1 : i8;
                        SnapshotState4<Integer> fontWeight = segmentedControlStyle.getTypography(composer4, i8).getFontWeight(z7, composer4, SegmentedControlStyle.Typography.$stable << 3);
                        Modifier modifier6 = segment.getModifier();
                        composer4.startReplaceGroup(-1746271574);
                        final Density density4 = density3;
                        boolean zChanged2 = composer4.changed(density4);
                        Object objRememberedValue6 = composer4.rememberedValue();
                        if (zChanged2 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue6 = new Function1() { // from class: com.robinhood.android.portfolio.pnlhub.ui.PnlSegmentedControlKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    return PnlSegmentedControl.m2382x143a3ce2(density4, snapshotState, snapshotState2, (IntSize) obj2);
                                }
                            };
                            composer4.updateRememberedValue(objRememberedValue6);
                        }
                        composer4.endReplaceGroup();
                        Row6 row62 = row6;
                        Modifier modifierM5155defaultMinSizeVpY3zN4$default = SizeKt.m5155defaultMinSizeVpY3zN4$default(Row5.weight$default(row6, OnRemeasuredModifier2.onSizeChanged(modifier6, (Function1) objRememberedValue6), 1.0f, false, 2, null), 0.0f, segmentedControlStyle.getSizing(composer4, i8).m21945getSegmentMinHeightD9Ej5fM(), 1, null);
                        composer4.startReplaceGroup(1849434622);
                        Object objRememberedValue7 = composer4.rememberedValue();
                        Composer.Companion companion5 = Composer.INSTANCE;
                        if (objRememberedValue7 == companion5.getEmpty()) {
                            objRememberedValue7 = InteractionSource2.MutableInteractionSource();
                            composer4.updateRememberedValue(objRememberedValue7);
                        }
                        InteractionSource3 interactionSource3 = (InteractionSource3) objRememberedValue7;
                        composer4.endReplaceGroup();
                        Role roleM7472boximpl = Role.m7472boximpl(Role.INSTANCE.m7486getTabo7Vup1c());
                        composer4.startReplaceGroup(-1224400529);
                        final View view4 = view3;
                        int i11 = (composer4.changed(z7) ? 1 : 0) | (composer4.changedInstance(view4) ? 1 : 0) | ((i4 & 896) == 256 ? 1 : i8) | (composer4.changed(i9) ? 1 : 0);
                        Object objRememberedValue8 = composer4.rememberedValue();
                        if (i11 != 0 || objRememberedValue8 == companion5.getEmpty()) {
                            objRememberedValue8 = new Function0() { // from class: com.robinhood.android.portfolio.pnlhub.ui.PnlSegmentedControlKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return PnlSegmentedControl.m2383xd2e85528(z7, view4, onIndexSelected, i9);
                                }
                            };
                            composer4.updateRememberedValue(objRememberedValue8);
                        }
                        composer4.endReplaceGroup();
                        Modifier modifierM5314selectableO2vRcR0$default = Selectable3.m5314selectableO2vRcR0$default(modifierM5155defaultMinSizeVpY3zN4$default, z7, interactionSource3, null, false, roleM7472boximpl, (Function0) objRememberedValue8, 8, null);
                        Arrangement arrangement = Arrangement.INSTANCE;
                        float fM21595getXsmallD9Ej5fM = BentoTheme.INSTANCE.getSpacing(composer4, BentoTheme.$stable).m21595getXsmallD9Ej5fM();
                        Alignment.Companion companion6 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement.m5090spacedByD5KLDUw(fM21595getXsmallD9Ej5fM, companion6.getCenterHorizontally()), companion6.getCenterVertically(), composer4, 48);
                        int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer4, i8);
                        CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer4, modifierM5314selectableO2vRcR0$default);
                        ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor3 = companion7.getConstructor();
                        if (composer4.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer4.startReusableNode();
                        if (composer4.getInserting()) {
                            composer4.createNode(constructor3);
                        } else {
                            composer4.useNode();
                        }
                        Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer4);
                        Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy2, companion7.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion7.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion7.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion7.getSetModifier());
                        Row6 row63 = Row6.INSTANCE;
                        composer4.startReplaceGroup(1544284121);
                        if (segment.getIcon() != null) {
                            BentoSegmentedControl3.Icon.Size16 icon = segment.getIcon();
                            Intrinsics.checkNotNull(icon, "null cannot be cast to non-null type com.robinhood.compose.bento.component.BentoSegmentedControls.Icon.Size16");
                            Composer composer5 = composer4;
                            view = view4;
                            density = density4;
                            z4 = true;
                            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(icon.getAsset()), null, segmentedControlStyle.getColors(composer4, 0).m21941getSegmentForegroundEnabledColor0d7_KjU(), null, null, false, composer5, BentoIcon4.Size16.$stable | 48, 56);
                            composer2 = composer5;
                        } else {
                            density = density4;
                            view = view4;
                            z4 = true;
                            composer2 = composer4;
                        }
                        composer2.endReplaceGroup();
                        composer2.startReplaceGroup(1544298615);
                        String text = segment.getText();
                        if ((text == null || StringsKt.isBlank(text)) ? z4 : false) {
                            i6 = 0;
                        } else {
                            String text2 = segment.getText();
                            Intrinsics.checkNotNull(text2, "null cannot be cast to non-null type kotlin.String");
                            long jM21941getSegmentForegroundEnabledColor0d7_KjU = segmentedControlStyle.getColors(composer2, 0).m21941getSegmentForegroundEnabledColor0d7_KjU();
                            int iM7959getEllipsisgIe3tQ8 = TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8();
                            TextStyle textStyle = segmentedControlStyle.getTypography(composer2, 0).getTextStyle();
                            FontWeight fontWeight2 = new FontWeight(PnlSegmentedControl$lambda$28$lambda$27$lambda$26$lambda$18(fontWeight));
                            i6 = 0;
                            Composer composer6 = composer2;
                            BentoText2.m20747BentoText38GnDrw(text2, null, Color.m6701boximpl(jM21941getSegmentForegroundEnabledColor0d7_KjU), null, fontWeight2, null, null, iM7959getEllipsisgIe3tQ8, false, 1, 0, null, 0, textStyle, composer6, 817889280, 0, 7530);
                            composer2 = composer6;
                        }
                        composer2.endReplaceGroup();
                        composer2.endNode();
                        int i12 = i6;
                        view3 = view;
                        i8 = i12;
                        i9 = i10;
                        row6 = row62;
                        density3 = density;
                        composer4 = composer2;
                    }
                    composer4.endReplaceGroup();
                    composer4.endNode();
                    composer4.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                    z3 = z6;
                    composer3 = composer4;
                }
                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.portfolio.pnlhub.ui.PnlSegmentedControlKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return PnlSegmentedControl.PnlSegmentedControl$lambda$29(segments, i, onIndexSelected, modifier3, z3, i2, i3, (Composer) obj2, ((Integer) obj3).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i4 |= 24576;
            z2 = z;
            if ((i4 & 9363) == 9362) {
                if (i7 == 0) {
                }
                if (i5 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                if (!segments.isEmpty()) {
                }
                SegmentedControlStyle segmentedControlStyle2 = (SegmentedControlStyle) composerStartRestartGroup.consume(BentoSegmentedControl2.getLocalSegmentedControlStyle());
                View view22 = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
                Density density22 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                Modifier modifierPadding2 = PaddingKt.padding(Clip.clip(Background3.m4871backgroundbw27NRU(ModifiersKt.bentoPillPlaceholder(modifier4, z5), segmentedControlStyle2.getColors(composerStartRestartGroup, 0).m21937getContainerBackgroundColor0d7_KjU(), RoundedCornerShape2.RoundedCornerShape(50)), RoundedCornerShape2.RoundedCornerShape(50)), segmentedControlStyle2.getSpacing(composerStartRestartGroup, 0).getContainerPadding());
                Alignment.Companion companion22 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion22.getTopStart(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierPadding2);
                ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                List list2 = listListOf;
                Function0<ComposeUiNode> constructor4 = companion32.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion32.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap4, companion32.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier4, companion32.getSetModifier());
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    boolean z62 = z5;
                    if (objRememberedValue == companion.getEmpty()) {
                    }
                    final SnapshotState snapshotState3 = (SnapshotState) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                    }
                    final SnapshotState snapshotState22 = (SnapshotState) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    int size2 = segments.size();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    zChanged = composerStartRestartGroup.changed(size2) | ((i4 & 112) != 32);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue3 = SnapshotState3.mutableStateOf$default(segments.size() != 1 ? new BiasAlignment(0.0f, 0.0f) : new BiasAlignment((((i * 2) - segments.size()) + 1) / (segments.size() - 1), 0.0f), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        composerStartRestartGroup.endReplaceGroup();
                        BiasAlignment biasAlignmentPnlSegmentedControl$lambda$28$lambda$122 = PnlSegmentedControl$lambda$28$lambda$12((SnapshotState) objRememberedValue3);
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue4 == companion.getEmpty()) {
                        }
                        Function1 function12 = (Function1) objRememberedValue4;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue5 == companion.getEmpty()) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifier52 = modifier4;
                        View view32 = view22;
                        Density density32 = density22;
                        int i82 = 0;
                        SnapshotState4 snapshotState4AnimateValueAsState2 = AnimateAsState.animateValueAsState(biasAlignmentPnlSegmentedControl$lambda$28$lambda$122, VectorConvertersKt.TwoWayConverter(function12, (Function1) objRememberedValue5), null, null, null, null, composerStartRestartGroup, 0, 60);
                        Modifier.Companion companion42 = Modifier.INSTANCE;
                        BoxKt.Box(boxScopeInstance2.align(Clip.clip(Background3.m4871backgroundbw27NRU(SizeKt.m5171sizeVpY3zN4(companion42, PnlSegmentedControl$lambda$28$lambda$6(snapshotState3), PnlSegmentedControl$lambda$28$lambda$9(snapshotState22)), segmentedControlStyle2.getColors(composerStartRestartGroup, 0).m21939getSegmentBackgroundColor0d7_KjU(), RoundedCornerShape2.RoundedCornerShape(50)), RoundedCornerShape2.RoundedCornerShape(50)), PnlSegmentedControl$lambda$28$lambda$17(snapshotState4AnimateValueAsState2)), composerStartRestartGroup, 0);
                        Modifier modifierSelectableGroup2 = SelectableGroup.selectableGroup(companion42);
                        MeasurePolicy measurePolicyRowMeasurePolicy3 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion22.getTop(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierSelectableGroup2);
                        Function0<ComposeUiNode> constructor22 = companion32.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy3, companion32.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion32.getSetResolvedCompositionLocals());
                        setCompositeKeyHash2 = companion32.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl2.getInserting()) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion32.getSetModifier());
                            Row6 row64 = Row6.INSTANCE;
                            composerStartRestartGroup.startReplaceGroup(-1573967266);
                            final int i92 = 0;
                            Composer composer42 = composerStartRestartGroup;
                            while (r0.hasNext()) {
                            }
                            composer42.endReplaceGroup();
                            composer42.endNode();
                            composer42.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier52;
                            z3 = z62;
                            composer3 = composer42;
                        }
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 16;
        if (i5 != 0) {
        }
        z2 = z;
        if ((i4 & 9363) == 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    private static final void PnlSegmentedControl$lambda$28$lambda$7(SnapshotState<C2002Dp> snapshotState, float f) {
        snapshotState.setValue(C2002Dp.m7993boximpl(f));
    }

    private static final void PnlSegmentedControl$lambda$28$lambda$10(SnapshotState<C2002Dp> snapshotState, float f) {
        snapshotState.setValue(C2002Dp.m7993boximpl(f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnimationVectors3 PnlSegmentedControl$lambda$28$lambda$14$lambda$13(BiasAlignment it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new AnimationVectors3(it.getHorizontalBias(), it.getVerticalBias());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BiasAlignment PnlSegmentedControl$lambda$28$lambda$16$lambda$15(AnimationVectors3 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new BiasAlignment(it.getV1(), it.getV2());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PnlSegmentedControl$lambda$28$lambda$27$lambda$26$lambda$21$lambda$20 */
    public static final Unit m2382x143a3ce2(Density density, SnapshotState snapshotState, SnapshotState snapshotState2, IntSize intSize) {
        PnlSegmentedControl$lambda$28$lambda$7(snapshotState, density.mo5013toDpu2uoSUM((int) (intSize.getPackedValue() >> 32)));
        PnlSegmentedControl$lambda$28$lambda$10(snapshotState2, density.mo5013toDpu2uoSUM((int) (intSize.getPackedValue() & 4294967295L)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PnlSegmentedControl$lambda$28$lambda$27$lambda$26$lambda$24$lambda$23 */
    public static final Unit m2383xd2e85528(boolean z, View view, Function1 function1, int i) {
        if (!z) {
            view.performHapticFeedback(6);
        }
        function1.invoke(Integer.valueOf(i));
        return Unit.INSTANCE;
    }
}
