package com.robinhood.shared.tradeladder.p398ui.ladder.shared.pill;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.BorderKt;
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
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.shared.tradeladder.p398ui.ladder.extensions.StringResources5;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.Side;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.style.LadderStyle;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.style.LadderStyleKt;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.style.PillStyle;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.style.PreviewLadderBentoTheme2;
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
@Metadata(m3635d1 = {"\u0000V\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\u001a\u0012\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000\u001a\u0087\u0001\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0002\u0010\u0018\u001a\u0081\u0001\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010#\u001a\u00020\u0013H\u0001¢\u0006\u0004\b$\u0010%\u001ao\u0010&\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0003¢\u0006\u0004\b'\u0010(\u001a\r\u0010+\u001a\u00020\u0004H\u0001¢\u0006\u0002\u0010,\u001a\r\u0010-\u001a\u00020\u0004H\u0001¢\u0006\u0002\u0010,\u001a\r\u0010.\u001a\u00020\u0004H\u0001¢\u0006\u0002\u0010,\u001a\r\u0010/\u001a\u00020\u0004H\u0001¢\u0006\u0002\u0010,\u001a\r\u00100\u001a\u00020\u0004H\u0001¢\u0006\u0002\u0010,\"\u0010\u0010)\u001a\u00020\"X\u0082\u0004¢\u0006\u0004\n\u0002\u0010*¨\u00061²\u0006\n\u0010#\u001a\u00020\u0013X\u008a\u008e\u0002"}, m3636d2 = {"getBottomPillLabelAlignment", "Landroidx/compose/ui/Alignment;", "parentAlignment", "PendingOrderPill", "", "Landroidx/compose/foundation/layout/BoxScope;", "side", "Lcom/robinhood/shared/tradeladder/ui/ladder/models/Side;", "topLabel", "Lcom/robinhood/utils/resource/StringResource;", "bottomLabel", "modifier", "Landroidx/compose/ui/Modifier;", "onClick", "Lkotlin/Function0;", "alignment", "icon", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "showLoadingShimmerForTop", "", "showLoadingShimmerForBottom", "topVisualState", "Lcom/robinhood/shared/tradeladder/ui/ladder/shared/style/PillStyle$PillVisualState;", "bottomVisualState", "(Landroidx/compose/foundation/layout/BoxScope;Lcom/robinhood/shared/tradeladder/ui/ladder/models/Side;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Alignment;Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;ZZLcom/robinhood/shared/tradeladder/ui/ladder/shared/style/PillStyle$PillVisualState;Lcom/robinhood/shared/tradeladder/ui/ladder/shared/style/PillStyle$PillVisualState;Landroidx/compose/runtime/Composer;III)V", "Pill", "visualState", AnnotatedPrivateKey.LABEL, ResourceTypes.COLOR, "Landroidx/compose/ui/graphics/Color;", "loadingBackgroundColor", "textColor", "borderColor", "borderWidth", "Landroidx/compose/ui/unit/Dp;", "showLoadingShimmer", "Pill-0nlq0H8", "(Lcom/robinhood/shared/tradeladder/ui/ladder/models/Side;Lcom/robinhood/shared/tradeladder/ui/ladder/shared/style/PillStyle$PillVisualState;Lcom/robinhood/utils/resource/StringResource;JJJJFLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;ZLandroidx/compose/runtime/Composer;III)V", "TextPill", "TextPill-6F9F6e8", "(Lcom/robinhood/shared/tradeladder/ui/ladder/models/Side;Lcom/robinhood/shared/tradeladder/ui/ladder/shared/style/PillStyle$PillVisualState;Lcom/robinhood/utils/resource/StringResource;JJJFLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;Landroidx/compose/runtime/Composer;II)V", "TextPillWidth", "F", "PreviewPill_loading", "(Landroidx/compose/runtime/Composer;I)V", "PreviewPill_loaded", "PreviewPill_loaded_border", "PreviewPill_withIcon", "PreviewPill_withIcon_outlined", "lib-trade-ladder_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class PendingOrderPillKt {
    private static final float TextPillWidth = C2002Dp.m7995constructorimpl(60);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PendingOrderPill$lambda$6(BoxScope boxScope, Side side, StringResource stringResource, StringResource stringResource2, Modifier modifier, Function0 function0, Alignment alignment, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, boolean z, boolean z2, PillStyle.PillVisualState pillVisualState, PillStyle.PillVisualState pillVisualState2, int i, int i2, int i3, Composer composer, int i4) {
        PendingOrderPill(boxScope, side, stringResource, stringResource2, modifier, function0, alignment, serverToBentoAssetMapper2, z, z2, pillVisualState, pillVisualState2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Pill_0nlq0H8$lambda$7(Side side, PillStyle.PillVisualState pillVisualState, StringResource stringResource, long j, long j2, long j3, long j4, float f, Modifier modifier, Function0 function0, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, boolean z, int i, int i2, int i3, Composer composer, int i4) {
        m26159Pill0nlq0H8(side, pillVisualState, stringResource, j, j2, j3, j4, f, modifier, function0, serverToBentoAssetMapper2, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewPill_loaded$lambda$19(int i, Composer composer, int i2) {
        PreviewPill_loaded(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewPill_loaded_border$lambda$20(int i, Composer composer, int i2) {
        PreviewPill_loaded_border(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewPill_loading$lambda$18(int i, Composer composer, int i2) {
        PreviewPill_loading(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewPill_withIcon$lambda$21(int i, Composer composer, int i2) {
        PreviewPill_withIcon(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewPill_withIcon_outlined$lambda$22(int i, Composer composer, int i2) {
        PreviewPill_withIcon_outlined(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextPill_6F9F6e8$lambda$13(Side side, PillStyle.PillVisualState pillVisualState, StringResource stringResource, long j, long j2, long j3, float f, Modifier modifier, Function0 function0, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, int i, int i2, Composer composer, int i3) {
        m26160TextPill6F9F6e8(side, pillVisualState, stringResource, j, j2, j3, f, modifier, function0, serverToBentoAssetMapper2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final Alignment getBottomPillLabelAlignment(Alignment alignment) {
        Alignment.Companion companion = Alignment.INSTANCE;
        if (Intrinsics.areEqual(alignment, companion.getEnd()) || Intrinsics.areEqual(alignment, companion.getTopEnd()) || Intrinsics.areEqual(alignment, companion.getCenterEnd()) || Intrinsics.areEqual(alignment, companion.getBottomEnd())) {
            return companion.getCenterStart();
        }
        return companion.getCenterEnd();
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:216:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PendingOrderPill(final BoxScope boxScope, final Side side, final StringResource stringResource, final StringResource stringResource2, Modifier modifier, Function0<Unit> function0, Alignment alignment, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, boolean z, boolean z2, PillStyle.PillVisualState pillVisualState, PillStyle.PillVisualState pillVisualState2, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        Function0<Unit> function02;
        int i6;
        Alignment alignment2;
        int i7;
        int i8;
        boolean z3;
        int i9;
        int i10;
        int i11;
        int i12;
        int iOrdinal;
        int i13;
        int i14;
        int iOrdinal2;
        Modifier modifier3;
        Function0<Unit> function03;
        Alignment alignment3;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Alignment alignment4;
        Modifier modifier4;
        BoxScopeInstance boxScopeInstance;
        int i15;
        PillStyle.PillVisualState pillVisualState3;
        PillStyle.PillVisualState pillVisualState4;
        Function0<Unit> function04;
        boolean z4;
        Composer composer2;
        Composer composer3;
        PillStyle.PillVisualState pillVisualState5;
        boolean z5;
        final PillStyle.PillVisualState pillVisualState6;
        final ServerToBentoAssetMapper2 serverToBentoAssetMapper22;
        final boolean z6;
        final Modifier modifier5;
        final Function0<Unit> function05;
        final boolean z7;
        final Alignment alignment5;
        final PillStyle.PillVisualState pillVisualState7;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(boxScope, "<this>");
        Intrinsics.checkNotNullParameter(side, "side");
        Composer composerStartRestartGroup = composer.startRestartGroup(251228805);
        if ((Integer.MIN_VALUE & i3) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 1) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(side.ordinal()) ? 32 : 16;
        }
        if ((i3 & 2) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= (i & 512) == 0 ? composerStartRestartGroup.changed(stringResource) : composerStartRestartGroup.changedInstance(stringResource) ? 256 : 128;
        }
        if ((i3 & 4) != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            i4 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(stringResource2) : composerStartRestartGroup.changedInstance(stringResource2) ? 2048 : 1024;
        }
        int i16 = i3 & 8;
        if (i16 != 0) {
            i4 |= 24576;
        } else {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 196608;
                function02 = function0;
            } else {
                function02 = function0;
                if ((i & 196608) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(function02) ? 131072 : 65536;
                }
            }
            i6 = i3 & 32;
            if (i6 == 0) {
                i4 |= 1572864;
                alignment2 = alignment;
            } else {
                alignment2 = alignment;
                if ((i & 1572864) == 0) {
                    i4 |= composerStartRestartGroup.changed(alignment2) ? 1048576 : 524288;
                }
            }
            i7 = i3 & 64;
            if (i7 == 0) {
                i4 |= 12582912;
            } else if ((i & 12582912) == 0) {
                i4 |= composerStartRestartGroup.changed(serverToBentoAssetMapper2 == null ? -1 : serverToBentoAssetMapper2.ordinal()) ? 8388608 : 4194304;
            }
            i8 = i3 & 128;
            if (i8 == 0) {
                i4 |= 100663296;
                z3 = z;
            } else {
                z3 = z;
                if ((i & 100663296) == 0) {
                    i4 |= composerStartRestartGroup.changed(z3) ? 67108864 : 33554432;
                }
            }
            i9 = i3 & 256;
            if (i9 == 0) {
                i4 |= 805306368;
            } else if ((i & 805306368) == 0) {
                i4 |= composerStartRestartGroup.changed(z2) ? 536870912 : 268435456;
            }
            i10 = i3 & 512;
            if (i10 == 0) {
                i12 = i2 | 6;
                i11 = i10;
            } else if ((i2 & 6) == 0) {
                if (pillVisualState == null) {
                    i11 = i10;
                    iOrdinal = -1;
                } else {
                    i11 = i10;
                    iOrdinal = pillVisualState.ordinal();
                }
                i12 = i2 | (composerStartRestartGroup.changed(iOrdinal) ? 4 : 2);
            } else {
                i11 = i10;
                i12 = i2;
            }
            i13 = i3 & 1024;
            if (i13 != 0) {
                if ((i2 & 48) == 0) {
                    if (pillVisualState2 == null) {
                        i14 = i13;
                        iOrdinal2 = -1;
                    } else {
                        i14 = i13;
                        iOrdinal2 = pillVisualState2.ordinal();
                    }
                    i12 |= composerStartRestartGroup.changed(iOrdinal2) ? 32 : 16;
                }
                int i17 = i12;
                if ((i4 & 306783379) != 306783378 || (i17 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
                    modifier3 = i16 == 0 ? Modifier.INSTANCE : modifier2;
                    if (i5 == 0) {
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.pill.PendingOrderPillKt$$ExternalSyntheticLambda0
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
                    alignment3 = i6 == 0 ? null : alignment2;
                    ServerToBentoAssetMapper2 serverToBentoAssetMapper23 = i7 == 0 ? null : serverToBentoAssetMapper2;
                    if (i8 != 0) {
                        z3 = false;
                    }
                    boolean z8 = i9 == 0 ? false : z2;
                    PillStyle.PillVisualState pillVisualState8 = i11 == 0 ? PillStyle.PillVisualState.ACTIVE : pillVisualState;
                    PillStyle.PillVisualState pillVisualState9 = i14 == 0 ? PillStyle.PillVisualState.ACTIVE : pillVisualState2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(251228805, i4, i17, "com.robinhood.shared.tradeladder.ui.ladder.shared.pill.PendingOrderPill (PendingOrderPill.kt:66)");
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
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    PillStyle orderPill = ((LadderStyle) composerStartRestartGroup.consume(LadderStyleKt.getLocalLadderStyle())).getOrderPill();
                    composerStartRestartGroup.startReplaceGroup(1960929135);
                    if (stringResource != null) {
                        boxScopeInstance = boxScopeInstance2;
                        modifier4 = modifier3;
                        pillVisualState4 = pillVisualState8;
                        composer2 = composerStartRestartGroup;
                        i15 = i4;
                        alignment4 = alignment3;
                        pillVisualState3 = pillVisualState9;
                        z4 = z3;
                        function04 = function03;
                    } else {
                        int i18 = i4;
                        boolean z9 = z3;
                        alignment4 = alignment3;
                        modifier4 = modifier3;
                        PillStyle.PillVisualState pillVisualState10 = pillVisualState8;
                        boxScopeInstance = boxScopeInstance2;
                        i15 = i18;
                        pillVisualState3 = pillVisualState9;
                        m26159Pill0nlq0H8(side, pillVisualState10, stringResource, orderPill.m26270topBackgroundColorWaAFU9c(side, pillVisualState8), orderPill.m26267getTopLoadingBackgroundColor0d7_KjU(), orderPill.m26269textColorWaAFU9c(side, pillVisualState8), orderPill.m26269textColorWaAFU9c(side, pillVisualState8), orderPill.m26260borderWidthu2uoSUM(pillVisualState8), null, function03, serverToBentoAssetMapper23, z9, composerStartRestartGroup, ((i18 >> 3) & 14) | ((i17 << 3) & 112) | (StringResource.$stable << 6) | ((i18 << 12) & 1879048192), (i18 >> 21) & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 256);
                        pillVisualState4 = pillVisualState10;
                        function04 = function03;
                        z4 = z9;
                        composer2 = composerStartRestartGroup;
                        Unit unit = Unit.INSTANCE;
                    }
                    composer2.endReplaceGroup();
                    composer2.startReplaceGroup(1960951229);
                    if (stringResource2 != null) {
                        composer3 = composer2;
                        z5 = z8;
                        pillVisualState5 = pillVisualState3;
                    } else {
                        Alignment bottomPillLabelAlignment = getBottomPillLabelAlignment(alignment4);
                        composer3 = composer2;
                        pillVisualState5 = pillVisualState3;
                        z5 = z8;
                        m26159Pill0nlq0H8(side, pillVisualState5, stringResource2, orderPill.m26261bottomBackgroundColorWaAFU9c(side, pillVisualState3), ((LadderStyle) composer2.consume(LadderStyleKt.getLocalLadderStyle())).getOrderPill().m26266getBottomLoadingBackgroundColor0d7_KjU(), orderPill.m26269textColorWaAFU9c(side, pillVisualState3), orderPill.m26269textColorWaAFU9c(side, pillVisualState3), orderPill.m26260borderWidthu2uoSUM(pillVisualState3), ZIndexModifier2.zIndex(OffsetKt.m5125offsetVpY3zN4$default(boxScopeInstance.align(Modifier.INSTANCE, bottomPillLabelAlignment), C2002Dp.m7995constructorimpl((Intrinsics.areEqual(bottomPillLabelAlignment, companion.getCenterStart()) ? -1 : 1) * BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21593getSmallD9Ej5fM()), 0.0f, 2, null), -1.0f), null, serverToBentoAssetMapper23, z5, composer3, ((i15 >> 3) & 14) | (i17 & 112) | (StringResource.$stable << 6), ((i15 >> 21) & 14) | ((i15 >> 24) & 112), 512);
                        Unit unit2 = Unit.INSTANCE;
                    }
                    composer3.endReplaceGroup();
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    pillVisualState6 = pillVisualState5;
                    serverToBentoAssetMapper22 = serverToBentoAssetMapper23;
                    z6 = z5;
                    modifier5 = modifier4;
                    function05 = function04;
                    z7 = z4;
                    alignment5 = alignment4;
                    pillVisualState7 = pillVisualState4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    serverToBentoAssetMapper22 = serverToBentoAssetMapper2;
                    pillVisualState7 = pillVisualState;
                    pillVisualState6 = pillVisualState2;
                    composer3 = composerStartRestartGroup;
                    function05 = function02;
                    alignment5 = alignment2;
                    z7 = z3;
                    modifier5 = modifier2;
                    z6 = z2;
                }
                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.pill.PendingOrderPillKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return PendingOrderPillKt.PendingOrderPill$lambda$6(boxScope, side, stringResource, stringResource2, modifier5, function05, alignment5, serverToBentoAssetMapper22, z7, z6, pillVisualState7, pillVisualState6, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i12 |= 48;
            i14 = i13;
            int i172 = i12;
            if ((i4 & 306783379) != 306783378) {
                if (i16 == 0) {
                }
                if (i5 == 0) {
                }
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                if (i8 != 0) {
                }
                if (i9 == 0) {
                }
                if (i11 == 0) {
                }
                if (i14 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
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
                        BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                        PillStyle orderPill2 = ((LadderStyle) composerStartRestartGroup.consume(LadderStyleKt.getLocalLadderStyle())).getOrderPill();
                        composerStartRestartGroup.startReplaceGroup(1960929135);
                        if (stringResource != null) {
                        }
                        composer2.endReplaceGroup();
                        composer2.startReplaceGroup(1960951229);
                        if (stringResource2 != null) {
                        }
                        composer3.endReplaceGroup();
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        pillVisualState6 = pillVisualState5;
                        serverToBentoAssetMapper22 = serverToBentoAssetMapper23;
                        z6 = z5;
                        modifier5 = modifier4;
                        function05 = function04;
                        z7 = z4;
                        alignment5 = alignment4;
                        pillVisualState7 = pillVisualState4;
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        i6 = i3 & 32;
        if (i6 == 0) {
        }
        i7 = i3 & 64;
        if (i7 == 0) {
        }
        i8 = i3 & 128;
        if (i8 == 0) {
        }
        i9 = i3 & 256;
        if (i9 == 0) {
        }
        i10 = i3 & 512;
        if (i10 == 0) {
        }
        i13 = i3 & 1024;
        if (i13 != 0) {
        }
        i14 = i13;
        int i1722 = i12;
        if ((i4 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean PreviewPill_loading$lambda$15(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:166:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012c  */
    /* renamed from: Pill-0nlq0H8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m26159Pill0nlq0H8(final Side side, final PillStyle.PillVisualState visualState, final StringResource label, final long j, final long j2, final long j3, final long j4, final float f, Modifier modifier, Function0<Unit> function0, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, boolean z, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        long j5;
        long j6;
        long j7;
        float f2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        final ServerToBentoAssetMapper2 serverToBentoAssetMapper22;
        final boolean z2;
        Composer composer2;
        final Modifier modifier2;
        final Function0<Unit> function02;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(visualState, "visualState");
        Intrinsics.checkNotNullParameter(label, "label");
        Composer composerStartRestartGroup = composer.startRestartGroup(73577261);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(side.ordinal()) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(visualState.ordinal()) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= (i & 512) == 0 ? composerStartRestartGroup.changed(label) : composerStartRestartGroup.changedInstance(label) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
            j5 = j;
        } else {
            j5 = j;
            if ((i & 3072) == 0) {
                i4 |= composerStartRestartGroup.changed(j5) ? 2048 : 1024;
            }
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            i4 |= composerStartRestartGroup.changed(j2) ? 16384 : 8192;
        }
        if ((i3 & 32) != 0) {
            i4 |= 196608;
            j6 = j3;
        } else {
            j6 = j3;
            if ((i & 196608) == 0) {
                i4 |= composerStartRestartGroup.changed(j6) ? 131072 : 65536;
            }
        }
        if ((i3 & 64) != 0) {
            i4 |= 1572864;
            j7 = j4;
        } else {
            j7 = j4;
            if ((i & 1572864) == 0) {
                i4 |= composerStartRestartGroup.changed(j7) ? 1048576 : 524288;
            }
        }
        if ((i3 & 128) == 0) {
            if ((i & 12582912) == 0) {
                f2 = f;
                i4 |= composerStartRestartGroup.changed(f2) ? 8388608 : 4194304;
            }
            i5 = i3 & 256;
            if (i5 == 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                i4 |= composerStartRestartGroup.changed(modifier) ? 67108864 : 33554432;
            }
            i6 = i3 & 512;
            if (i6 == 0) {
                i4 |= 805306368;
            } else if ((i & 805306368) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(function0) ? 536870912 : 268435456;
            }
            i7 = i3 & 1024;
            if (i7 == 0) {
                i9 = i2 | 6;
                i8 = i7;
            } else if ((i2 & 6) == 0) {
                i8 = i7;
                i9 = i2 | (composerStartRestartGroup.changed(serverToBentoAssetMapper2 == null ? -1 : serverToBentoAssetMapper2.ordinal()) ? 4 : 2);
            } else {
                i8 = i7;
                i9 = i2;
            }
            i10 = i3 & 2048;
            if (i10 == 0) {
                i11 = i10;
                i12 = i9 | 48;
            } else {
                if ((i2 & 48) == 0) {
                    i11 = i10;
                    i9 |= composerStartRestartGroup.changed(z) ? 32 : 16;
                } else {
                    i11 = i10;
                }
                i12 = i9;
            }
            if ((i4 & 306783379) == 306783378 || (i12 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier;
                Function0<Unit> function03 = i6 == 0 ? null : function0;
                ServerToBentoAssetMapper2 serverToBentoAssetMapper23 = i8 == 0 ? serverToBentoAssetMapper2 : null;
                boolean z3 = i11 == 0 ? false : z;
                final ServerToBentoAssetMapper2 serverToBentoAssetMapper24 = serverToBentoAssetMapper23;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(73577261, i4, i12, "com.robinhood.shared.tradeladder.ui.ladder.shared.pill.Pill (PendingOrderPill.kt:127)");
                }
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i13 = BentoTheme.$stable;
                Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(modifier3, bentoTheme.getSpacing(composerStartRestartGroup, i13).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i13).m21595getXsmallD9Ej5fM());
                Modifier modifier4 = modifier3;
                final Function0<Unit> function04 = function03;
                final boolean z4 = z3;
                final long j8 = j5;
                final float f3 = f2;
                final long j9 = j7;
                final long j10 = j6;
                AnimatedPill4.m26149AnimatedPillT042LqI(z4, AnimatedPill4.getPillShape(), j2, ComposableLambda3.rememberComposableLambda(2092240595, true, new Function3<Float, Composer, Integer, Unit>() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.pill.PendingOrderPillKt$Pill$1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Float f4, Composer composer3, Integer num) {
                        invoke(f4.floatValue(), composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(float f4, Composer composer3, int i14) {
                        Composer composer4;
                        int i15;
                        if ((i14 & 6) == 0) {
                            composer4 = composer3;
                            i15 = i14 | (composer4.changed(f4) ? 4 : 2);
                        } else {
                            composer4 = composer3;
                            i15 = i14;
                        }
                        if ((i15 & 19) == 18 && composer4.getSkipping()) {
                            composer4.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2092240595, i15, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.pill.Pill.<anonymous> (PendingOrderPill.kt:137)");
                        }
                        Modifier modifierAlpha = Alpha.alpha(Modifier.INSTANCE, f4);
                        Function0<Unit> function05 = function04;
                        if (z4) {
                            function05 = null;
                        }
                        PendingOrderPillKt.m26160TextPill6F9F6e8(side, visualState, label, j8, j10, j9, f3, modifierAlpha, function05, serverToBentoAssetMapper24, composer4, StringResource.$stable << 6, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), modifierM5143paddingVpY3zN4, composerStartRestartGroup, ((i12 >> 3) & 14) | 3120 | ((i4 >> 6) & 896), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                serverToBentoAssetMapper22 = serverToBentoAssetMapper24;
                z2 = z4;
                composer2 = composerStartRestartGroup;
                modifier2 = modifier4;
                function02 = function04;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier2 = modifier;
                function02 = function0;
                serverToBentoAssetMapper22 = serverToBentoAssetMapper2;
                z2 = z;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.pill.PendingOrderPillKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return PendingOrderPillKt.Pill_0nlq0H8$lambda$7(side, visualState, label, j, j2, j3, j4, f, modifier2, function02, serverToBentoAssetMapper22, z2, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i4 |= 12582912;
        f2 = f;
        i5 = i3 & 256;
        if (i5 == 0) {
        }
        i6 = i3 & 512;
        if (i6 == 0) {
        }
        i7 = i3 & 1024;
        if (i7 == 0) {
        }
        i10 = i3 & 2048;
        if (i10 == 0) {
        }
        if ((i4 & 306783379) == 306783378) {
            if (i5 == 0) {
            }
            if (i6 == 0) {
            }
            if (i8 == 0) {
            }
            if (i11 == 0) {
            }
            final ServerToBentoAssetMapper2 serverToBentoAssetMapper242 = serverToBentoAssetMapper23;
            if (ComposerKt.isTraceInProgress()) {
            }
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i132 = BentoTheme.$stable;
            Modifier modifierM5143paddingVpY3zN42 = PaddingKt.m5143paddingVpY3zN4(modifier3, bentoTheme2.getSpacing(composerStartRestartGroup, i132).m21590getDefaultD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i132).m21595getXsmallD9Ej5fM());
            Modifier modifier42 = modifier3;
            final Function0<Unit> function042 = function03;
            final boolean z42 = z3;
            final long j82 = j5;
            final float f32 = f2;
            final long j92 = j7;
            final long j102 = j6;
            AnimatedPill4.m26149AnimatedPillT042LqI(z42, AnimatedPill4.getPillShape(), j2, ComposableLambda3.rememberComposableLambda(2092240595, true, new Function3<Float, Composer, Integer, Unit>() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.pill.PendingOrderPillKt$Pill$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Float f4, Composer composer3, Integer num) {
                    invoke(f4.floatValue(), composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(float f4, Composer composer3, int i14) {
                    Composer composer4;
                    int i15;
                    if ((i14 & 6) == 0) {
                        composer4 = composer3;
                        i15 = i14 | (composer4.changed(f4) ? 4 : 2);
                    } else {
                        composer4 = composer3;
                        i15 = i14;
                    }
                    if ((i15 & 19) == 18 && composer4.getSkipping()) {
                        composer4.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2092240595, i15, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.pill.Pill.<anonymous> (PendingOrderPill.kt:137)");
                    }
                    Modifier modifierAlpha = Alpha.alpha(Modifier.INSTANCE, f4);
                    Function0<Unit> function05 = function042;
                    if (z42) {
                        function05 = null;
                    }
                    PendingOrderPillKt.m26160TextPill6F9F6e8(side, visualState, label, j82, j102, j92, f32, modifierAlpha, function05, serverToBentoAssetMapper242, composer4, StringResource.$stable << 6, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), modifierM5143paddingVpY3zN42, composerStartRestartGroup, ((i12 >> 3) & 14) | 3120 | ((i4 >> 6) & 896), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            serverToBentoAssetMapper22 = serverToBentoAssetMapper242;
            z2 = z42;
            composer2 = composerStartRestartGroup;
            modifier2 = modifier42;
            function02 = function042;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f3  */
    /* renamed from: TextPill-6F9F6e8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m26160TextPill6F9F6e8(Side side, PillStyle.PillVisualState pillVisualState, final StringResource stringResource, final long j, final long j2, final long j3, final float f, Modifier modifier, Function0<Unit> function0, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Modifier modifier2;
        int i5;
        int i6;
        final Function0<Unit> function02;
        Side side2;
        final PillStyle.PillVisualState pillVisualState2;
        final Modifier modifier3;
        final ServerToBentoAssetMapper2 serverToBentoAssetMapper22;
        final Function0<Unit> function03;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1733970771);
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
            i3 |= composerStartRestartGroup.changed(pillVisualState.ordinal()) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(stringResource) : composerStartRestartGroup.changedInstance(stringResource) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(j) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else {
            if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changed(j2) ? 16384 : 8192;
            }
            if ((i2 & 32) == 0) {
                i3 |= 196608;
            } else if ((i & 196608) == 0) {
                i3 |= composerStartRestartGroup.changed(j3) ? 131072 : 65536;
            }
            if ((i2 & 64) == 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                i3 |= composerStartRestartGroup.changed(f) ? 1048576 : 524288;
            }
            i4 = i2 & 128;
            if (i4 != 0) {
                if ((12582912 & i) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 8388608 : 4194304;
                }
                i5 = i2 & 256;
                if (i5 != 0) {
                    i3 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(function0) ? 67108864 : 33554432;
                }
                i6 = i2 & 512;
                if (i6 != 0) {
                    i3 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    i3 |= composerStartRestartGroup.changed(serverToBentoAssetMapper2 == null ? -1 : serverToBentoAssetMapper2.ordinal()) ? 536870912 : 268435456;
                }
                if ((306783379 & i3) == 306783378 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    side2 = side;
                    pillVisualState2 = pillVisualState;
                    serverToBentoAssetMapper22 = serverToBentoAssetMapper2;
                    modifier3 = modifier2;
                    function03 = function0;
                } else {
                    Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    function02 = i5 == 0 ? null : function0;
                    ServerToBentoAssetMapper2 serverToBentoAssetMapper23 = i6 == 0 ? serverToBentoAssetMapper2 : null;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1733970771, i3, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.pill.TextPill (PendingOrderPill.kt:165)");
                    }
                    Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    composerStartRestartGroup.startReplaceGroup(-101375655);
                    Modifier modifierClip = Clip.clip(modifier4, AnimatedPill4.getPillShape());
                    Modifier modifier5 = modifier4;
                    int i7 = i3;
                    if (!C2002Dp.m7997equalsimpl0(f, C2002Dp.m7995constructorimpl(0))) {
                        modifierClip = BorderKt.m4876borderxT4_qwU(modifierClip, f, j3, AnimatedPill4.getPillShape());
                    }
                    Modifier modifierM4871backgroundbw27NRU = Background3.m4871backgroundbw27NRU(modifierClip, j, AnimatedPill4.getPillShape());
                    if (function02 == null) {
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        boolean zChanged = composerStartRestartGroup.changed(function02);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.pill.PendingOrderPillKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return PendingOrderPillKt.TextPill_6F9F6e8$lambda$11$lambda$10$lambda$9(function02);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifierM4871backgroundbw27NRU, false, null, null, (Function0) objRememberedValue, 7, null);
                        if (modifierM4893clickableXHw0xAI$default == null) {
                            modifierM4893clickableXHw0xAI$default = modifierM4871backgroundbw27NRU;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i8 = BentoTheme.$stable;
                        Modifier modifierM5174width3ABfNKs = SizeKt.m5174width3ABfNKs(PaddingKt.m5143paddingVpY3zN4(modifierM4893clickableXHw0xAI$default, bentoTheme.getSpacing(composerStartRestartGroup, i8).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i8).m21593getSmallD9Ej5fM()), TextPillWidth);
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(center, centerVertically, composerStartRestartGroup, 54);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5174width3ABfNKs);
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
                        Function0<Unit> function04 = function02;
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                        Row6 row6 = Row6.INSTANCE;
                        composerStartRestartGroup.startReplaceGroup(-1491842183);
                        if (serverToBentoAssetMapper23 != null) {
                            side2 = side;
                            pillVisualState2 = pillVisualState;
                            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(serverToBentoAssetMapper23), null, ((LadderStyle) composerStartRestartGroup.consume(LadderStyleKt.getLocalLadderStyle())).getOrderPill().m26268iconTintWaAFU9c(side2, pillVisualState2), PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i8).m21595getXsmallD9Ej5fM(), 0.0f, 11, null), null, false, composerStartRestartGroup, BentoIcon4.Size16.$stable | 48, 48);
                        } else {
                            side2 = side;
                            pillVisualState2 = pillVisualState;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        int i9 = i7 >> 6;
                        BentoText2.m20747BentoText38GnDrw(StringResources5.getText(stringResource, composerStartRestartGroup, StringResource.$stable | (i9 & 14)), Modifier.INSTANCE, Color.m6701boximpl(j2), null, FontWeight.INSTANCE.getBold(), null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i8).getTextS(), composerStartRestartGroup, (i9 & 896) | 817913904, 0, 7464);
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier5;
                        serverToBentoAssetMapper22 = serverToBentoAssetMapper23;
                        function03 = function04;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Side side3 = side2;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.pill.PendingOrderPillKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return PendingOrderPillKt.TextPill_6F9F6e8$lambda$13(side3, pillVisualState2, stringResource, j, j2, j3, f, modifier3, function03, serverToBentoAssetMapper22, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 12582912;
            modifier2 = modifier;
            i5 = i2 & 256;
            if (i5 != 0) {
            }
            i6 = i2 & 512;
            if (i6 != 0) {
            }
            if ((306783379 & i3) == 306783378) {
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if (i6 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Arrangement.HorizontalOrVertical center2 = Arrangement.INSTANCE.getCenter();
                Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                composerStartRestartGroup.startReplaceGroup(-101375655);
                Modifier modifierClip2 = Clip.clip(modifier4, AnimatedPill4.getPillShape());
                Modifier modifier52 = modifier4;
                int i72 = i3;
                if (!C2002Dp.m7997equalsimpl0(f, C2002Dp.m7995constructorimpl(0))) {
                }
                Modifier modifierM4871backgroundbw27NRU2 = Background3.m4871backgroundbw27NRU(modifierClip2, j, AnimatedPill4.getPillShape());
                if (function02 == null) {
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i2 & 32) == 0) {
        }
        if ((i2 & 64) == 0) {
        }
        i4 = i2 & 128;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        i5 = i2 & 256;
        if (i5 != 0) {
        }
        i6 = i2 & 512;
        if (i6 != 0) {
        }
        if ((306783379 & i3) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextPill_6F9F6e8$lambda$11$lambda$10$lambda$9(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final void PreviewPill_loading(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1723278550);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1723278550, i, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.pill.PreviewPill_loading (PendingOrderPill.kt:208)");
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
            PreviewLadderBentoTheme2.PreviewLadderBentoTheme(false, ComposableLambda3.rememberComposableLambda(-2000400937, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.pill.PendingOrderPillKt.PreviewPill_loading.2
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
                        ComposerKt.traceEventStart(-2000400937, i2, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.pill.PreviewPill_loading.<anonymous> (PendingOrderPill.kt:218)");
                    }
                    final PillStyle orderPill = ((LadderStyle) composer2.consume(LadderStyleKt.getLocalLadderStyle())).getOrderPill();
                    long jM21371getBg0d7_KjU = BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21371getBg0d7_KjU();
                    final SnapshotState<Boolean> snapshotState2 = snapshotState;
                    SurfaceKt.m5967SurfaceT9BRK9s(null, null, jM21371getBg0d7_KjU, 0L, 0.0f, 0.0f, null, ComposableLambda3.rememberComposableLambda(-275392996, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.pill.PendingOrderPillKt.PreviewPill_loading.2.1
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
                                ComposerKt.traceEventStart(-275392996, i3, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.pill.PreviewPill_loading.<anonymous>.<anonymous> (PendingOrderPill.kt:220)");
                            }
                            Side side = Side.START;
                            PillStyle.PillVisualState pillVisualState = PillStyle.PillVisualState.ACTIVE;
                            StringResource stringResourceInvoke = StringResource.INSTANCE.invoke("+500 LMT");
                            boolean zPreviewPill_loading$lambda$15 = PendingOrderPillKt.PreviewPill_loading$lambda$15(snapshotState2);
                            PendingOrderPillKt.m26159Pill0nlq0H8(side, pillVisualState, stringResourceInvoke, orderPill.m26270topBackgroundColorWaAFU9c(side, pillVisualState), orderPill.m26267getTopLoadingBackgroundColor0d7_KjU(), orderPill.m26269textColorWaAFU9c(side, pillVisualState), orderPill.m26269textColorWaAFU9c(side, pillVisualState), orderPill.m26260borderWidthu2uoSUM(pillVisualState), null, null, null, zPreviewPill_loading$lambda$15, composer3, (StringResource.$stable << 6) | 54, 0, 1792);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.pill.PendingOrderPillKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PendingOrderPillKt.PreviewPill_loading$lambda$18(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PreviewPill_loading$lambda$16(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    public static final void PreviewPill_loaded(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-270789897);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-270789897, i, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.pill.PreviewPill_loaded (PendingOrderPill.kt:237)");
            }
            PreviewLadderBentoTheme2.PreviewLadderBentoTheme(false, ComposableSingletons$PendingOrderPillKt.INSTANCE.m26153getLambda$252361258$lib_trade_ladder_externalDebug(), composerStartRestartGroup, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.pill.PendingOrderPillKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PendingOrderPillKt.PreviewPill_loaded$lambda$19(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void PreviewPill_loaded_border(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-870785600);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-870785600, i, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.pill.PreviewPill_loaded_border (PendingOrderPill.kt:256)");
            }
            PreviewLadderBentoTheme2.PreviewLadderBentoTheme(false, ComposableSingletons$PendingOrderPillKt.INSTANCE.m26152getLambda$2067168767$lib_trade_ladder_externalDebug(), composerStartRestartGroup, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.pill.PendingOrderPillKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PendingOrderPillKt.PreviewPill_loaded_border$lambda$20(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void PreviewPill_withIcon(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-2038304303);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2038304303, i, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.pill.PreviewPill_withIcon (PendingOrderPill.kt:275)");
            }
            PreviewLadderBentoTheme2.PreviewLadderBentoTheme(false, ComposableSingletons$PendingOrderPillKt.INSTANCE.m26151getLambda$1508251408$lib_trade_ladder_externalDebug(), composerStartRestartGroup, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.pill.PendingOrderPillKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PendingOrderPillKt.PreviewPill_withIcon$lambda$21(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void PreviewPill_withIcon_outlined(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(631149916);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(631149916, i, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.pill.PreviewPill_withIcon_outlined (PendingOrderPill.kt:295)");
            }
            PreviewLadderBentoTheme2.PreviewLadderBentoTheme(false, ComposableSingletons$PendingOrderPillKt.INSTANCE.getLambda$284242205$lib_trade_ladder_externalDebug(), composerStartRestartGroup, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.pill.PendingOrderPillKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PendingOrderPillKt.PreviewPill_withIcon_outlined$lambda$22(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
