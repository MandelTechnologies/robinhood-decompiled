package com.robinhood.android.futures.trade.p147ui.ladder;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.ZIndexModifier2;
import androidx.compose.p011ui.draw.Alpha;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.futures.trade.extensions.StringResources4;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.models.futures.api.order.FuturesOrderSide;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.utils.extensions.ResourceTypes;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: PendingOrderPill.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0012\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000\u001as\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0002\u0010\u0015\u001aa\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u001b\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001aO\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0003¢\u0006\u0004\b\u001f\u0010 \u001a\r\u0010$\u001a\u00020\u0004H\u0001¢\u0006\u0002\u0010%\u001a\r\u0010&\u001a\u00020\u0004H\u0001¢\u0006\u0002\u0010%\u001a\r\u0010'\u001a\u00020\u0004H\u0001¢\u0006\u0002\u0010%\"\u0010\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0004\n\u0002\u0010#¨\u0006(²\u0006\n\u0010\u001b\u001a\u00020\u0013X\u008a\u008e\u0002"}, m3636d2 = {"getBottomPillLabelAlignment", "Landroidx/compose/ui/Alignment;", "parentAlignment", "PendingOrderPill", "", "Landroidx/compose/foundation/layout/BoxScope;", "side", "Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;", "topLabel", "Lcom/robinhood/utils/resource/StringResource;", "bottomLabel", "modifier", "Landroidx/compose/ui/Modifier;", "onClick", "Lkotlin/Function0;", "alignment", "icon", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "showLoadingShimmerForTop", "", "showLoadingShimmerForBottom", "(Landroidx/compose/foundation/layout/BoxScope;Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Alignment;Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;ZZLandroidx/compose/runtime/Composer;II)V", "Pill", AnnotatedPrivateKey.LABEL, ResourceTypes.COLOR, "Landroidx/compose/ui/graphics/Color;", "loadingBackgroundColor", "showLoadingShimmer", "Pill-njYn8yo", "(Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;Lcom/robinhood/utils/resource/StringResource;JJLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;ZLandroidx/compose/runtime/Composer;II)V", "TextPill", "TextPill-FU0evQE", "(Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;Lcom/robinhood/utils/resource/StringResource;JLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;Landroidx/compose/runtime/Composer;II)V", "TextPillWidth", "Landroidx/compose/ui/unit/Dp;", "F", "PreviewPill_loading", "(Landroidx/compose/runtime/Composer;I)V", "PreviewPill_loaded", "PreviewPill_withIcon", "feature-futures-trade_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class PendingOrderPillKt {
    private static final float TextPillWidth = C2002Dp.m7995constructorimpl(60);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PendingOrderPill$lambda$6(BoxScope boxScope, FuturesOrderSide futuresOrderSide, StringResource stringResource, StringResource stringResource2, Modifier modifier, Function0 function0, Alignment alignment, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, boolean z, boolean z2, int i, int i2, Composer composer, int i3) {
        PendingOrderPill(boxScope, futuresOrderSide, stringResource, stringResource2, modifier, function0, alignment, serverToBentoAssetMapper2, z, z2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Pill_njYn8yo$lambda$7(FuturesOrderSide futuresOrderSide, StringResource stringResource, long j, long j2, Modifier modifier, Function0 function0, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, boolean z, int i, int i2, Composer composer, int i3) {
        m14856PillnjYn8yo(futuresOrderSide, stringResource, j, j2, modifier, function0, serverToBentoAssetMapper2, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewPill_loaded$lambda$17(int i, Composer composer, int i2) {
        PreviewPill_loaded(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewPill_loading$lambda$16(int i, Composer composer, int i2) {
        PreviewPill_loading(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewPill_withIcon$lambda$18(int i, Composer composer, int i2) {
        PreviewPill_withIcon(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextPill_FU0evQE$lambda$11(FuturesOrderSide futuresOrderSide, StringResource stringResource, long j, Modifier modifier, Function0 function0, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, int i, int i2, Composer composer, int i3) {
        m14857TextPillFU0evQE(futuresOrderSide, stringResource, j, modifier, function0, serverToBentoAssetMapper2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final Alignment getBottomPillLabelAlignment(Alignment alignment) {
        Alignment.Companion companion = Alignment.INSTANCE;
        if (Intrinsics.areEqual(alignment, companion.getEnd()) || Intrinsics.areEqual(alignment, companion.getTopEnd()) || Intrinsics.areEqual(alignment, companion.getCenterEnd()) || Intrinsics.areEqual(alignment, companion.getBottomEnd())) {
            return companion.getCenterStart();
        }
        return companion.getCenterEnd();
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:182:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PendingOrderPill(final BoxScope boxScope, final FuturesOrderSide side, final StringResource stringResource, final StringResource stringResource2, Modifier modifier, Function0<Unit> function0, Alignment alignment, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, boolean z, boolean z2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function0<Unit> function02;
        int i5;
        Alignment alignment2;
        int i6;
        int i7;
        boolean z3;
        int i8;
        Modifier modifier3;
        Function0<Unit> function03;
        Alignment alignment3;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        ServerToBentoAssetMapper2 serverToBentoAssetMapper22;
        int i9;
        Alignment alignment4;
        Object obj;
        int i10;
        int i11;
        Function0<Unit> function04;
        boolean z4;
        boolean z5;
        final ServerToBentoAssetMapper2 serverToBentoAssetMapper23;
        final boolean z6;
        final Alignment alignment5;
        final Modifier modifier4;
        final Function0<Unit> function05;
        final boolean z7;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(boxScope, "<this>");
        Intrinsics.checkNotNullParameter(side, "side");
        Composer composerStartRestartGroup = composer.startRestartGroup(1908893371);
        if ((Integer.MIN_VALUE & i2) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 1) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(side.ordinal()) ? 32 : 16;
        }
        if ((i2 & 2) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(stringResource) : composerStartRestartGroup.changedInstance(stringResource) ? 256 : 128;
        }
        if ((i2 & 4) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(stringResource2) : composerStartRestartGroup.changedInstance(stringResource2) ? 2048 : 1024;
        }
        int i12 = i2 & 8;
        if (i12 != 0) {
            i3 |= 24576;
        } else {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 196608;
            } else {
                if ((196608 & i) == 0) {
                    function02 = function0;
                    i3 |= composerStartRestartGroup.changedInstance(function02) ? 131072 : 65536;
                }
                i5 = i2 & 32;
                if (i5 == 0) {
                    if ((1572864 & i) == 0) {
                        alignment2 = alignment;
                        i3 |= composerStartRestartGroup.changed(alignment2) ? 1048576 : 524288;
                    }
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i3 |= composerStartRestartGroup.changed(serverToBentoAssetMapper2 == null ? -1 : serverToBentoAssetMapper2.ordinal()) ? 8388608 : 4194304;
                    }
                    i7 = i2 & 128;
                    if (i7 == 0) {
                        i3 |= 100663296;
                        z3 = z;
                    } else {
                        z3 = z;
                        if ((i & 100663296) == 0) {
                            i3 |= composerStartRestartGroup.changed(z3) ? 67108864 : 33554432;
                        }
                    }
                    i8 = i2 & 256;
                    if (i8 == 0) {
                        i3 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        i3 |= composerStartRestartGroup.changed(z2) ? 536870912 : 268435456;
                    }
                    if ((i3 & 306783379) == 306783378 || !composerStartRestartGroup.getSkipping()) {
                        modifier3 = i12 == 0 ? Modifier.INSTANCE : modifier2;
                        if (i4 == 0) {
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.futures.trade.ui.ladder.PendingOrderPillKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            function03 = (Function0) objRememberedValue;
                        } else {
                            function03 = function02;
                        }
                        alignment3 = i5 == 0 ? null : alignment2;
                        ServerToBentoAssetMapper2 serverToBentoAssetMapper24 = i6 == 0 ? null : serverToBentoAssetMapper2;
                        if (i7 != 0) {
                            z3 = false;
                        }
                        boolean z8 = i8 == 0 ? false : z2;
                        if (!ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1908893371, i3, -1, "com.robinhood.android.futures.trade.ui.ladder.PendingOrderPill (PendingOrderPill.kt:58)");
                        }
                        if (alignment3 != null || (modifierAlign = boxScope.align(modifier3, alignment3)) == null) {
                            Modifier modifierAlign = modifier3;
                        }
                        Alignment.Companion companion = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAlign);
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
                        Modifier modifier5 = modifier3;
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        composerStartRestartGroup.startReplaceGroup(696530992);
                        if (stringResource != null) {
                            z4 = z3;
                            i9 = i3;
                            function04 = function03;
                            alignment4 = alignment3;
                            serverToBentoAssetMapper22 = serverToBentoAssetMapper24;
                            obj = null;
                            i10 = 2;
                            i11 = -1;
                        } else {
                            int i13 = i3 >> 3;
                            ServerToBentoAssetMapper2 serverToBentoAssetMapper25 = serverToBentoAssetMapper24;
                            boolean z9 = z3;
                            Alignment alignment6 = alignment3;
                            serverToBentoAssetMapper22 = serverToBentoAssetMapper25;
                            i9 = i3;
                            alignment4 = alignment6;
                            obj = null;
                            i10 = 2;
                            i11 = -1;
                            m14856PillnjYn8yo(side, stringResource, ((LadderStyle) composerStartRestartGroup.consume(LadderStyleKt.getLocalLadderStyle())).getOrderPill().m14884topBackgroundColorvNxB06k(side), ((LadderStyle) composerStartRestartGroup.consume(LadderStyleKt.getLocalLadderStyle())).getOrderPill().m14882getTopLoadingBackgroundColor0d7_KjU(), null, function03, serverToBentoAssetMapper22, z9, composerStartRestartGroup, (i13 & 14) | (StringResource.$stable << 3) | (i3 & 458752) | (i13 & 3670016) | (i13 & 29360128), 16);
                            function04 = function03;
                            z4 = z9;
                            Unit unit = Unit.INSTANCE;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(696545847);
                        if (stringResource2 != null) {
                            z5 = z8;
                        } else {
                            Alignment bottomPillLabelAlignment = getBottomPillLabelAlignment(alignment4);
                            int i14 = Intrinsics.areEqual(bottomPillLabelAlignment, companion.getCenterStart()) ? i11 : 1;
                            long jM14881getBottomLoadingBackgroundColor0d7_KjU = ((LadderStyle) composerStartRestartGroup.consume(LadderStyleKt.getLocalLadderStyle())).getOrderPill().m14881getBottomLoadingBackgroundColor0d7_KjU();
                            long jM14877bottomBackgroundColorvNxB06k = ((LadderStyle) composerStartRestartGroup.consume(LadderStyleKt.getLocalLadderStyle())).getOrderPill().m14877bottomBackgroundColorvNxB06k(side);
                            Modifier modifierZIndex = ZIndexModifier2.zIndex(OffsetKt.m5125offsetVpY3zN4$default(boxScopeInstance.align(Modifier.INSTANCE, bottomPillLabelAlignment), C2002Dp.m7995constructorimpl(i14 * BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21593getSmallD9Ej5fM()), 0.0f, i10, obj), -1.0f);
                            int i15 = i9 >> 3;
                            z5 = z8;
                            m14856PillnjYn8yo(side, stringResource2, jM14877bottomBackgroundColorvNxB06k, jM14881getBottomLoadingBackgroundColor0d7_KjU, modifierZIndex, null, serverToBentoAssetMapper22, z5, composerStartRestartGroup, (i15 & 3670016) | (i15 & 14) | (StringResource.$stable << 3) | ((i9 >> 6) & 29360128), 32);
                            Unit unit2 = Unit.INSTANCE;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        serverToBentoAssetMapper23 = serverToBentoAssetMapper22;
                        z6 = z5;
                        alignment5 = alignment4;
                        modifier4 = modifier5;
                        function05 = function04;
                        z7 = z4;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        Modifier modifier6 = modifier2;
                        z7 = z3;
                        modifier4 = modifier6;
                        serverToBentoAssetMapper23 = serverToBentoAssetMapper2;
                        z6 = z2;
                        function05 = function02;
                        alignment5 = alignment2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.trade.ui.ladder.PendingOrderPillKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                return PendingOrderPillKt.PendingOrderPill$lambda$6(boxScope, side, stringResource, stringResource2, modifier4, function05, alignment5, serverToBentoAssetMapper23, z7, z6, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 1572864;
                alignment2 = alignment;
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                i7 = i2 & 128;
                if (i7 == 0) {
                }
                i8 = i2 & 256;
                if (i8 == 0) {
                }
                if ((i3 & 306783379) == 306783378) {
                    if (i12 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (!ComposerKt.isTraceInProgress()) {
                    }
                    if (alignment3 != null) {
                        Modifier modifierAlign2 = modifier3;
                        Alignment.Companion companion3 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAlign2);
                        ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Modifier modifier52 = modifier3;
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting()) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                            composerStartRestartGroup.startReplaceGroup(696530992);
                            if (stringResource != null) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(696545847);
                            if (stringResource2 != null) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            serverToBentoAssetMapper23 = serverToBentoAssetMapper22;
                            z6 = z5;
                            alignment5 = alignment4;
                            modifier4 = modifier52;
                            function05 = function04;
                            z7 = z4;
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function02 = function0;
            i5 = i2 & 32;
            if (i5 == 0) {
            }
            alignment2 = alignment;
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            i7 = i2 & 128;
            if (i7 == 0) {
            }
            i8 = i2 & 256;
            if (i8 == 0) {
            }
            if ((i3 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        function02 = function0;
        i5 = i2 & 32;
        if (i5 == 0) {
        }
        alignment2 = alignment;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        i7 = i2 & 128;
        if (i7 == 0) {
        }
        i8 = i2 & 256;
        if (i8 == 0) {
        }
        if ((i3 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean PreviewPill_loading$lambda$13(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0125  */
    /* renamed from: Pill-njYn8yo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m14856PillnjYn8yo(final FuturesOrderSide side, final StringResource label, final long j, final long j2, Modifier modifier, Function0<Unit> function0, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        final long j3;
        int i4;
        Modifier modifier2;
        int i5;
        Function0<Unit> function02;
        int i6;
        int i7;
        int i8;
        Modifier modifier3;
        Composer composer2;
        final Function0<Unit> function03;
        final boolean z2;
        final ServerToBentoAssetMapper2 serverToBentoAssetMapper22;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(label, "label");
        Composer composerStartRestartGroup = composer.startRestartGroup(19932379);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(side.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(label) : composerStartRestartGroup.changedInstance(label) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                j3 = j;
                i3 |= composerStartRestartGroup.changed(j3) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changed(j2) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else {
                    if ((196608 & i) == 0) {
                        function02 = function0;
                        i3 |= composerStartRestartGroup.changedInstance(function02) ? 131072 : 65536;
                    }
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i3 |= composerStartRestartGroup.changed(serverToBentoAssetMapper2 == null ? -1 : serverToBentoAssetMapper2.ordinal()) ? 1048576 : 524288;
                    }
                    i7 = i2 & 128;
                    if (i7 != 0) {
                        if ((i & 12582912) == 0) {
                            i8 = i7;
                            i3 |= composerStartRestartGroup.changed(z) ? 8388608 : 4194304;
                        }
                        if ((i3 & 4793491) != 4793490 || !composerStartRestartGroup.getSkipping()) {
                            Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                            if (i5 != 0) {
                                function02 = null;
                            }
                            final ServerToBentoAssetMapper2 serverToBentoAssetMapper23 = i6 == 0 ? null : serverToBentoAssetMapper2;
                            final boolean z3 = i8 == 0 ? false : z;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(19932379, i3, -1, "com.robinhood.android.futures.trade.ui.ladder.Pill (PendingOrderPill.kt:107)");
                            }
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i9 = BentoTheme.$stable;
                            Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(modifier4, bentoTheme.getSpacing(composerStartRestartGroup, i9).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i9).m21595getXsmallD9Ej5fM());
                            modifier3 = modifier4;
                            final Function0<Unit> function04 = function02;
                            int i10 = i3;
                            ServerToBentoAssetMapper2 serverToBentoAssetMapper24 = serverToBentoAssetMapper23;
                            boolean z4 = z3;
                            composer2 = composerStartRestartGroup;
                            AnimatedPill.m14758AnimatedPillT042LqI(z4, AnimatedPill.getPillShape(), j2, ComposableLambda3.rememberComposableLambda(-1361291903, true, new Function3<Float, Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.trade.ui.ladder.PendingOrderPillKt$Pill$1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(Float f, Composer composer3, Integer num) {
                                    invoke(f.floatValue(), composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(float f, Composer composer3, int i11) {
                                    if ((i11 & 6) == 0) {
                                        i11 |= composer3.changed(f) ? 4 : 2;
                                    }
                                    if ((i11 & 19) == 18 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1361291903, i11, -1, "com.robinhood.android.futures.trade.ui.ladder.Pill.<anonymous> (PendingOrderPill.kt:114)");
                                    }
                                    Modifier modifierAlpha = Alpha.alpha(Modifier.INSTANCE, f);
                                    Function0<Unit> function05 = function04;
                                    if (z3) {
                                        function05 = null;
                                    }
                                    PendingOrderPillKt.m14857TextPillFU0evQE(side, label, j3, modifierAlpha, function05, serverToBentoAssetMapper23, composer3, StringResource.$stable << 3, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composerStartRestartGroup, 54), modifierM5143paddingVpY3zN4, composer2, ((i10 >> 21) & 14) | 3120 | ((i10 >> 3) & 896), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function03 = function04;
                            z2 = z4;
                            serverToBentoAssetMapper22 = serverToBentoAssetMapper24;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            serverToBentoAssetMapper22 = serverToBentoAssetMapper2;
                            z2 = z;
                            modifier3 = modifier2;
                            composer2 = composerStartRestartGroup;
                            function03 = function02;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            final Modifier modifier5 = modifier3;
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.trade.ui.ladder.PendingOrderPillKt$$ExternalSyntheticLambda7
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return PendingOrderPillKt.Pill_njYn8yo$lambda$7(side, label, j, j2, modifier5, function03, serverToBentoAssetMapper22, z2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 12582912;
                    i8 = i7;
                    if ((i3 & 4793491) != 4793490) {
                        if (i4 == 0) {
                        }
                        if (i5 != 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i92 = BentoTheme.$stable;
                        Modifier modifierM5143paddingVpY3zN42 = PaddingKt.m5143paddingVpY3zN4(modifier4, bentoTheme2.getSpacing(composerStartRestartGroup, i92).m21590getDefaultD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i92).m21595getXsmallD9Ej5fM());
                        modifier3 = modifier4;
                        final Function0<Unit> function042 = function02;
                        int i102 = i3;
                        ServerToBentoAssetMapper2 serverToBentoAssetMapper242 = serverToBentoAssetMapper23;
                        boolean z42 = z3;
                        composer2 = composerStartRestartGroup;
                        AnimatedPill.m14758AnimatedPillT042LqI(z42, AnimatedPill.getPillShape(), j2, ComposableLambda3.rememberComposableLambda(-1361291903, true, new Function3<Float, Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.trade.ui.ladder.PendingOrderPillKt$Pill$1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Float f, Composer composer3, Integer num) {
                                invoke(f.floatValue(), composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(float f, Composer composer3, int i11) {
                                if ((i11 & 6) == 0) {
                                    i11 |= composer3.changed(f) ? 4 : 2;
                                }
                                if ((i11 & 19) == 18 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1361291903, i11, -1, "com.robinhood.android.futures.trade.ui.ladder.Pill.<anonymous> (PendingOrderPill.kt:114)");
                                }
                                Modifier modifierAlpha = Alpha.alpha(Modifier.INSTANCE, f);
                                Function0<Unit> function05 = function042;
                                if (z3) {
                                    function05 = null;
                                }
                                PendingOrderPillKt.m14857TextPillFU0evQE(side, label, j3, modifierAlpha, function05, serverToBentoAssetMapper23, composer3, StringResource.$stable << 3, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), modifierM5143paddingVpY3zN42, composer2, ((i102 >> 21) & 14) | 3120 | ((i102 >> 3) & 896), 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        function03 = function042;
                        z2 = z42;
                        serverToBentoAssetMapper22 = serverToBentoAssetMapper242;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                function02 = function0;
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                i7 = i2 & 128;
                if (i7 != 0) {
                }
                i8 = i7;
                if ((i3 & 4793491) != 4793490) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            modifier2 = modifier;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            function02 = function0;
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            i7 = i2 & 128;
            if (i7 != 0) {
            }
            i8 = i7;
            if ((i3 & 4793491) != 4793490) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        j3 = j;
        if ((i2 & 8) == 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        function02 = function0;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        i7 = i2 & 128;
        if (i7 != 0) {
        }
        i8 = i7;
        if ((i3 & 4793491) != 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a0 A[PHI: r15
      0x00a0: PHI (r15v21 int) = (r15v0 int), (r15v5 int), (r15v6 int) binds: [B:59:0x009e, B:69:0x00b6, B:68:0x00b3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0121  */
    /* renamed from: TextPill-FU0evQE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m14857TextPillFU0evQE(final FuturesOrderSide futuresOrderSide, final StringResource stringResource, final long j, Modifier modifier, Function0<Unit> function0, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function0<Unit> function02;
        int i5;
        final Function0<Unit> function03;
        ServerToBentoAssetMapper2 serverToBentoAssetMapper22;
        boolean z;
        Object objRememberedValue;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        ServerToBentoAssetMapper2 serverToBentoAssetMapper23;
        Function0<Unit> function04;
        BentoTheme bentoTheme;
        Composer composer2;
        int i6;
        Composer composer3;
        final Function0<Unit> function05;
        final Modifier modifier3;
        final ServerToBentoAssetMapper2 serverToBentoAssetMapper24;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(244261065);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(futuresOrderSide.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(stringResource) : composerStartRestartGroup.changedInstance(stringResource) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(j) ? 256 : 128;
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    function02 = function0;
                    i3 |= composerStartRestartGroup.changedInstance(function02) ? 16384 : 8192;
                }
                i5 = i2 & 32;
                int i8 = 196608;
                if (i5 != 0) {
                    i3 |= i8;
                } else if ((196608 & i) == 0) {
                    i8 = composerStartRestartGroup.changed(serverToBentoAssetMapper2 == null ? -1 : serverToBentoAssetMapper2.ordinal()) ? 131072 : 65536;
                    i3 |= i8;
                }
                if ((74899 & i3) == 74898 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    serverToBentoAssetMapper24 = serverToBentoAssetMapper2;
                    composer3 = composerStartRestartGroup;
                    modifier3 = modifier2;
                    function05 = function02;
                } else {
                    Modifier modifier4 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                    function03 = i4 == 0 ? null : function02;
                    serverToBentoAssetMapper22 = i5 == 0 ? serverToBentoAssetMapper2 : null;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(244261065, i3, -1, "com.robinhood.android.futures.trade.ui.ladder.TextPill (PendingOrderPill.kt:134)");
                    }
                    Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    Modifier modifierClip = Clip.clip(Background3.m4871backgroundbw27NRU(modifier4, j, AnimatedPill.getPillShape()), AnimatedPill.getPillShape());
                    boolean z2 = function03 == null;
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    z = (57344 & i3) != 16384;
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.futures.trade.ui.ladder.PendingOrderPillKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return PendingOrderPillKt.TextPill_FU0evQE$lambda$9$lambda$8(function03);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifierClip, z2, null, null, (Function0) objRememberedValue, 6, null);
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i9 = BentoTheme.$stable;
                    Modifier modifierM5174width3ABfNKs = SizeKt.m5174width3ABfNKs(PaddingKt.m5143paddingVpY3zN4(modifierM4893clickableXHw0xAI$default, bentoTheme2.getSpacing(composerStartRestartGroup, i9).m21590getDefaultD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i9).m21593getSmallD9Ej5fM()), TextPillWidth);
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(center, centerVertically, composerStartRestartGroup, 54);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5174width3ABfNKs);
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(2088917347);
                    if (serverToBentoAssetMapper22 == null) {
                        function04 = function03;
                        serverToBentoAssetMapper23 = serverToBentoAssetMapper22;
                        bentoTheme = bentoTheme2;
                        i6 = i9;
                        BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(serverToBentoAssetMapper22), null, ((LadderStyle) composerStartRestartGroup.consume(LadderStyleKt.getLocalLadderStyle())).getOrderPill().m14883textColorvNxB06k(futuresOrderSide), PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i9).m21595getXsmallD9Ej5fM(), 0.0f, 11, null), null, false, composerStartRestartGroup, BentoIcon4.Size16.$stable | 48, 48);
                        composer2 = composerStartRestartGroup;
                    } else {
                        serverToBentoAssetMapper23 = serverToBentoAssetMapper22;
                        function04 = function03;
                        bentoTheme = bentoTheme2;
                        composer2 = composerStartRestartGroup;
                        i6 = i9;
                    }
                    composer2.endReplaceGroup();
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    long jM14883textColorvNxB06k = ((LadderStyle) composer2.consume(LadderStyleKt.getLocalLadderStyle())).getOrderPill().m14883textColorvNxB06k(futuresOrderSide);
                    composer3 = composer2;
                    BentoText2.m20747BentoText38GnDrw(StringResources4.getText(stringResource, composer2, StringResource.$stable | ((i3 >> 3) & 14)), companion2, Color.m6701boximpl(jM14883textColorvNxB06k), null, FontWeight.INSTANCE.getBold(), null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, bentoTheme.getTypography(composer2, i6).getTextS(), composer3, 817913904, 0, 7464);
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function05 = function04;
                    modifier3 = modifier4;
                    serverToBentoAssetMapper24 = serverToBentoAssetMapper23;
                }
                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.trade.ui.ladder.PendingOrderPillKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return PendingOrderPillKt.TextPill_FU0evQE$lambda$11(futuresOrderSide, stringResource, j, modifier3, function05, serverToBentoAssetMapper24, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 24576;
            function02 = function0;
            i5 = i2 & 32;
            int i82 = 196608;
            if (i5 != 0) {
            }
            if ((74899 & i3) == 74898) {
                if (i7 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Arrangement.HorizontalOrVertical center2 = Arrangement.INSTANCE.getCenter();
                Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                Modifier modifierClip2 = Clip.clip(Background3.m4871backgroundbw27NRU(modifier4, j, AnimatedPill.getPillShape()), AnimatedPill.getPillShape());
                if (function03 == null) {
                }
                composerStartRestartGroup.startReplaceGroup(5004770);
                if ((57344 & i3) != 16384) {
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.futures.trade.ui.ladder.PendingOrderPillKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PendingOrderPillKt.TextPill_FU0evQE$lambda$9$lambda$8(function03);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierM4893clickableXHw0xAI$default2 = ClickableKt.m4893clickableXHw0xAI$default(modifierClip2, z2, null, null, (Function0) objRememberedValue, 6, null);
                    BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                    int i92 = BentoTheme.$stable;
                    Modifier modifierM5174width3ABfNKs2 = SizeKt.m5174width3ABfNKs(PaddingKt.m5143paddingVpY3zN4(modifierM4893clickableXHw0xAI$default2, bentoTheme22.getSpacing(composerStartRestartGroup, i92).m21590getDefaultD9Ej5fM(), bentoTheme22.getSpacing(composerStartRestartGroup, i92).m21593getSmallD9Ej5fM()), TextPillWidth);
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(center2, centerVertically2, composerStartRestartGroup, 54);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5174width3ABfNKs2);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion3.getSetModifier());
                        Row6 row62 = Row6.INSTANCE;
                        composerStartRestartGroup.startReplaceGroup(2088917347);
                        if (serverToBentoAssetMapper22 == null) {
                        }
                        composer2.endReplaceGroup();
                        Modifier.Companion companion22 = Modifier.INSTANCE;
                        long jM14883textColorvNxB06k2 = ((LadderStyle) composer2.consume(LadderStyleKt.getLocalLadderStyle())).getOrderPill().m14883textColorvNxB06k(futuresOrderSide);
                        composer3 = composer2;
                        BentoText2.m20747BentoText38GnDrw(StringResources4.getText(stringResource, composer2, StringResource.$stable | ((i3 >> 3) & 14)), companion22, Color.m6701boximpl(jM14883textColorvNxB06k2), null, FontWeight.INSTANCE.getBold(), null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, bentoTheme.getTypography(composer2, i6).getTextS(), composer3, 817913904, 0, 7464);
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        function05 = function04;
                        modifier3 = modifier4;
                        serverToBentoAssetMapper24 = serverToBentoAssetMapper23;
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        function02 = function0;
        i5 = i2 & 32;
        int i822 = 196608;
        if (i5 != 0) {
        }
        if ((74899 & i3) == 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextPill_FU0evQE$lambda$9$lambda$8(Function0 function0) {
        Intrinsics.checkNotNull(function0);
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final void PreviewPill_loading(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-2120856288);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2120856288, i, -1, "com.robinhood.android.futures.trade.ui.ladder.PreviewPill_loading (PendingOrderPill.kt:171)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            Unit unit = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(5004770);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new PendingOrderPillKt$PreviewPill_loading$1$1(snapshotState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 6);
            PreviewLadderBentoTheme.PreviewLadderBentoTheme(false, ComposableLambda3.rememberComposableLambda(-1138503937, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.trade.ui.ladder.PendingOrderPillKt.PreviewPill_loading.2
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
                        ComposerKt.traceEventStart(-1138503937, i2, -1, "com.robinhood.android.futures.trade.ui.ladder.PreviewPill_loading.<anonymous> (PendingOrderPill.kt:181)");
                    }
                    long jM21371getBg0d7_KjU = BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21371getBg0d7_KjU();
                    final SnapshotState<Boolean> snapshotState2 = snapshotState;
                    SurfaceKt.m5967SurfaceT9BRK9s(null, null, jM21371getBg0d7_KjU, 0L, 0.0f, 0.0f, null, ComposableLambda3.rememberComposableLambda(-1898187494, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.trade.ui.ladder.PendingOrderPillKt.PreviewPill_loading.2.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i3) {
                            if ((i3 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1898187494, i3, -1, "com.robinhood.android.futures.trade.ui.ladder.PreviewPill_loading.<anonymous>.<anonymous> (PendingOrderPill.kt:182)");
                            }
                            FuturesOrderSide futuresOrderSide = FuturesOrderSide.BUY;
                            StringResource stringResourceInvoke = StringResource.INSTANCE.invoke("+500 LMT");
                            boolean zPreviewPill_loading$lambda$13 = PendingOrderPillKt.PreviewPill_loading$lambda$13(snapshotState2);
                            PendingOrderPillKt.m14856PillnjYn8yo(futuresOrderSide, stringResourceInvoke, ((LadderStyle) composer3.consume(LadderStyleKt.getLocalLadderStyle())).getOrderPill().m14884topBackgroundColorvNxB06k(futuresOrderSide), ((LadderStyle) composer3.consume(LadderStyleKt.getLocalLadderStyle())).getOrderPill().m14882getTopLoadingBackgroundColor0d7_KjU(), null, null, null, zPreviewPill_loading$lambda$13, composer3, (StringResource.$stable << 3) | 6, 112);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 12582912, 123);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.trade.ui.ladder.PendingOrderPillKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PendingOrderPillKt.PreviewPill_loading$lambda$16(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PreviewPill_loading$lambda$14(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    public static final void PreviewPill_loaded(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1323550175);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1323550175, i, -1, "com.robinhood.android.futures.trade.ui.ladder.PreviewPill_loaded (PendingOrderPill.kt:195)");
            }
            PreviewLadderBentoTheme.PreviewLadderBentoTheme(false, ComposableSingletons$PendingOrderPillKt.INSTANCE.getLambda$801049632$feature_futures_trade_externalDebug(), composerStartRestartGroup, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.trade.ui.ladder.PendingOrderPillKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PendingOrderPillKt.PreviewPill_loaded$lambda$17(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void PreviewPill_withIcon(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1733355973);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1733355973, i, -1, "com.robinhood.android.futures.trade.ui.ladder.PreviewPill_withIcon (PendingOrderPill.kt:209)");
            }
            PreviewLadderBentoTheme.PreviewLadderBentoTheme(false, ComposableSingletons$PendingOrderPillKt.INSTANCE.getLambda$2121507782$feature_futures_trade_externalDebug(), composerStartRestartGroup, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.trade.ui.ladder.PendingOrderPillKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PendingOrderPillKt.PreviewPill_withIcon$lambda$18(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
