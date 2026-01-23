package com.robinhood.android.crypto.p094ui.detail.position;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.DrawModifierKt;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.crypto.C12757R;
import com.robinhood.android.crypto.p094ui.detail.position.CryptoPositionState;
import com.robinhood.android.crypto.p094ui.detail.position.views.CryptoPositionRow3;
import com.robinhood.android.crypto.p094ui.detail.position.views.CryptoPositionRowState;
import com.robinhood.android.crypto.p094ui.detail.position.views.PositionBanner;
import com.robinhood.android.crypto.p094ui.view.CryptoDetailTransferActionState;
import com.robinhood.android.crypto.p094ui.view.CryptoDetailTransferActionsComposable2;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoTheme4;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.serverdriven.GenericButtonType;
import com.robinhood.models.serverdriven.p347db.BannerComponent;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.models.serverdriven.p347db.GenericButton;
import com.robinhood.models.serverdriven.p347db.RichText;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;

/* compiled from: CryptoPositionComposable.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a¹\u0001\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\u00072\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00030\u00072\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00030\u00072\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00030\u00072\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u0001¢\u0006\u0002\u0010\u0016\u001a\u0010\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0019H\u0002\u001a\r\u0010\u001a\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u001b\u001a\r\u0010\u001c\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u001b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m3636d2 = {CryptoPositionComposable6.TestTagCryptoBalanceIcon, "", "CryptoPositionComposable", "", "state", "Lcom/robinhood/android/crypto/ui/detail/position/CryptoPositionState;", "onTransferBannerAction", "Lkotlin/Function1;", "Lcom/robinhood/models/serverdriven/db/GenericAction;", "onTransferButtonAction", "onViewCryptoBalance", "Lkotlin/Function0;", "onPositionRowLabelClicked", "Lcom/robinhood/android/crypto/ui/detail/position/CryptoPositionLabelType;", "onPositionBannerClicked", "Lcom/robinhood/android/crypto/ui/detail/position/CryptoPositionState$PositionBannerType;", "onPositionBannerDismissClicked", "onTooltipClicked", "Lcom/robinhood/android/crypto/ui/detail/position/views/CryptoPositionRowState$TooltipType;", "onTooltipAppear", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/crypto/ui/detail/position/CryptoPositionState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "createPositionForPreview", "isGrid", "", "PreviewPositionGrid", "(Landroidx/compose/runtime/Composer;I)V", "PreviewPosition", "feature-crypto_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.crypto.ui.detail.position.CryptoPositionComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CryptoPositionComposable6 {
    public static final String TestTagCryptoBalanceIcon = "TestTagCryptoBalanceIcon";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoPositionComposable$lambda$26(CryptoPositionState cryptoPositionState, Function1 function1, Function1 function12, Function0 function0, Function1 function13, Function1 function14, Function1 function15, Function1 function16, Function1 function17, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CryptoPositionComposable(cryptoPositionState, function1, function12, function0, function13, function14, function15, function16, function17, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewPosition$lambda$28(int i, Composer composer, int i2) {
        PreviewPosition(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewPositionGrid$lambda$27(int i, Composer composer, int i2) {
        PreviewPositionGrid(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17, types: [int] */
    /* JADX WARN: Type inference failed for: r14v18 */
    public static final void CryptoPositionComposable(final CryptoPositionState state, Function1<? super GenericAction, Unit> onTransferBannerAction, final Function1<? super GenericAction, Unit> function1, final Function0<Unit> onViewCryptoBalance, final Function1<? super CryptoPositionLabelType, Unit> onPositionRowLabelClicked, Function1<? super CryptoPositionState.PositionBannerType, Unit> onPositionBannerClicked, Function1<? super CryptoPositionState.PositionBannerType, Unit> onPositionBannerDismissClicked, final Function1<? super CryptoPositionRowState.TooltipType, Unit> onTooltipClicked, final Function1<? super CryptoPositionRowState.TooltipType, Unit> onTooltipAppear, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Modifier modifier2;
        final Function1<? super CryptoPositionState.PositionBannerType, Unit> function12;
        int i5;
        final Function1<? super CryptoPositionState.PositionBannerType, Unit> function13;
        final Function1<? super GenericAction, Unit> function14;
        final Modifier modifier3;
        ?? r14;
        BentoTheme bentoTheme;
        int i6;
        Modifier.Companion companion;
        int i7;
        int i8;
        final Function1<? super CryptoPositionState.PositionBannerType, Unit> function15;
        float f;
        int i9;
        final Function1<? super GenericAction, Unit> onTransferButtonAction = function1;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onTransferBannerAction, "onTransferBannerAction");
        Intrinsics.checkNotNullParameter(onTransferButtonAction, "onTransferButtonAction");
        Intrinsics.checkNotNullParameter(onViewCryptoBalance, "onViewCryptoBalance");
        Intrinsics.checkNotNullParameter(onPositionRowLabelClicked, "onPositionRowLabelClicked");
        Intrinsics.checkNotNullParameter(onPositionBannerClicked, "onPositionBannerClicked");
        Intrinsics.checkNotNullParameter(onPositionBannerDismissClicked, "onPositionBannerDismissClicked");
        Intrinsics.checkNotNullParameter(onTooltipClicked, "onTooltipClicked");
        Intrinsics.checkNotNullParameter(onTooltipAppear, "onTooltipAppear");
        Composer composerStartRestartGroup = composer.startRestartGroup(132630164);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onTransferBannerAction) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onTransferButtonAction) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onViewCryptoBalance) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onPositionRowLabelClicked) ? 16384 : 8192;
        }
        int i10 = i3;
        if ((i2 & 32) != 0) {
            i4 = i10 | 196608;
        } else if ((i & 196608) == 0) {
            i4 = i10 | (composerStartRestartGroup.changedInstance(onPositionBannerClicked) ? 131072 : 65536);
        } else {
            i4 = i10;
        }
        if ((i2 & 64) != 0) {
            i4 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onPositionBannerDismissClicked) ? 1048576 : 524288;
        }
        if ((i2 & 128) != 0) {
            i4 |= 12582912;
        } else if ((i & 12582912) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onTooltipClicked) ? 8388608 : 4194304;
        }
        if ((i2 & 256) != 0) {
            i4 |= 100663296;
        } else if ((i & 100663296) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onTooltipAppear) ? 67108864 : 33554432;
        }
        int i11 = i2 & 512;
        if (i11 != 0) {
            i4 |= 805306368;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            if ((i & 805306368) == 0) {
                i4 |= composerStartRestartGroup.changed(modifier2) ? 536870912 : 268435456;
            }
        }
        if ((i4 & 306783379) == 306783378 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            function14 = onTransferBannerAction;
            modifier3 = modifier2;
            function12 = onPositionBannerClicked;
            function13 = onPositionBannerDismissClicked;
        } else {
            Modifier modifier4 = i11 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(132630164, i4, -1, "com.robinhood.android.crypto.ui.detail.position.CryptoPositionComposable (CryptoPositionComposable.kt:66)");
            }
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i12 = BentoTheme.$stable;
            final long jM21427getFg30d7_KjU = bentoTheme2.getColors(composerStartRestartGroup, i12).m21427getFg30d7_KjU();
            composerStartRestartGroup.startReplaceGroup(-1391408043);
            int i13 = i4;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
            if (state.getAreTopAndBottomBordersVisible()) {
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChanged = composerStartRestartGroup.changed(jM21427getFg30d7_KjU);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.crypto.ui.detail.position.CryptoPositionComposableKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CryptoPositionComposable6.CryptoPositionComposable$lambda$2$lambda$1$lambda$0(jM21427getFg30d7_KjU, (DrawScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                modifierFillMaxWidth$default = DrawModifierKt.drawBehind(modifierFillMaxWidth$default, (Function1) objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(Background3.m4872backgroundbw27NRU$default(modifierFillMaxWidth$default, bentoTheme2.getColors(composerStartRestartGroup, i12).m21371getBg0d7_KjU(), null, 2, null), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i12).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i12).m21590getDefaultD9Ej5fM(), 5, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Modifier modifier5 = modifier4;
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            if (state.isGrid()) {
                composerStartRestartGroup.startReplaceGroup(-215637909);
                Modifier.Companion companion4 = Modifier.INSTANCE;
                Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion4, 0.0f, 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.m5089spacedBy0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i12).m21595getXsmallD9Ej5fM()), companion2.getCenterVertically(), composerStartRestartGroup, 48);
                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default);
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
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C12757R.string.crypto_detail_positions_label, composerStartRestartGroup, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i12).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8190);
                composerStartRestartGroup.startReplaceGroup(1749733704);
                if (state.isCryptoBalanceIconVisible()) {
                    bentoTheme = bentoTheme2;
                    i6 = i12;
                    r14 = 0;
                    BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(ServerToBentoAssetMapper2.INFO_24), null, bentoTheme2.getColors(composerStartRestartGroup, i12).m21426getFg20d7_KjU(), TestTag3.testTag(companion4, TestTagCryptoBalanceIcon), onViewCryptoBalance, false, composerStartRestartGroup, BentoIcon4.Size24.$stable | 3120 | ((i13 << 3) & 57344), 32);
                } else {
                    r14 = 0;
                    bentoTheme = bentoTheme2;
                    i6 = i12;
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion4, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21593getSmallD9Ej5fM()), composerStartRestartGroup, r14);
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composerStartRestartGroup, r14);
                int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, r14);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
                Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
                Modifier modifierWeight$default = Row5.weight$default(row6, companion4, 1.0f, false, 2, null);
                CryptoPositionRowState quantityRowState = state.getQuantityRowState();
                int i14 = StringResource.$stable;
                CryptoPositionRow3.m13110CryptoPositionRowFU0evQE(quantityRowState, modifierWeight$default, 0L, null, null, null, composerStartRestartGroup, i14, 60);
                CryptoPositionRow3.m13110CryptoPositionRowFU0evQE(state.getValueRowState(), Row5.weight$default(row6, companion4, 1.0f, false, 2, null), 0L, null, null, null, composerStartRestartGroup, i14, 60);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.startReplaceGroup(685821032);
                if (state.getAreHoldingRowsVisible()) {
                    Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy3 = Row2.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composerStartRestartGroup, r14);
                    int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, r14);
                    CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default3);
                    Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyRowMeasurePolicy3, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion3.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                        composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                        composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion3.getSetModifier());
                    Modifier modifierWeight$default2 = Row5.weight$default(row6, companion4, 1.0f, false, 2, null);
                    CryptoPositionRowState averageCostRowState = state.getAverageCostRowState();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    int i15 = i13 & 57344;
                    boolean z = i15 == 16384 ? true : r14;
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (z || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.crypto.ui.detail.position.CryptoPositionComposableKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoPositionComposable6.CryptoPositionComposable$lambda$25$lambda$9$lambda$6$lambda$5(onPositionRowLabelClicked);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    Function0 function0 = (Function0) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    int i16 = i13 >> 9;
                    CryptoPositionRow3.m13110CryptoPositionRowFU0evQE(averageCostRowState, modifierWeight$default2, 0L, function0, onTooltipClicked, onTooltipAppear, composerStartRestartGroup, i14 | (i16 & 57344) | (i16 & 458752), 4);
                    Modifier modifierWeight$default3 = Row5.weight$default(row6, companion4, 1.0f, false, 2, null);
                    companion = companion4;
                    CryptoPositionRowState portfolioDiversityRowState = state.getPortfolioDiversityRowState();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    boolean z2 = i15 == 16384 ? true : r14;
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (z2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new Function0() { // from class: com.robinhood.android.crypto.ui.detail.position.CryptoPositionComposableKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoPositionComposable6.CryptoPositionComposable$lambda$25$lambda$9$lambda$8$lambda$7(onPositionRowLabelClicked);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    CryptoPositionRow3.m13110CryptoPositionRowFU0evQE(portfolioDiversityRowState, modifierWeight$default3, 0L, (Function0) objRememberedValue3, null, null, composerStartRestartGroup, i14, 52);
                    i7 = i14;
                    composerStartRestartGroup.endNode();
                } else {
                    companion = companion4;
                    i7 = i14;
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(685848288);
                if (state.getAreHoldingRowsVisible()) {
                    Modifier modifierFillMaxWidth$default4 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    CryptoPositionRowState todayReturnRowState = state.getTodayReturnRowState();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    int i17 = i13 & 57344;
                    boolean z3 = i17 == 16384 ? true : r14;
                    Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (z3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new Function0() { // from class: com.robinhood.android.crypto.ui.detail.position.CryptoPositionComposableKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoPositionComposable6.CryptoPositionComposable$lambda$25$lambda$11$lambda$10(onPositionRowLabelClicked);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    CryptoPositionRow3.m13110CryptoPositionRowFU0evQE(todayReturnRowState, modifierFillMaxWidth$default4, 0L, (Function0) objRememberedValue4, null, null, composerStartRestartGroup, i7 | 48, 52);
                    composerStartRestartGroup.startReplaceGroup(685857539);
                    if (state.getAreDataRowDividersVisible()) {
                        f = 0.0f;
                        i8 = 6;
                        i9 = 1;
                        BentoDivider.m20635BentoHorizontalDivideraMcp0Q(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composerStartRestartGroup, 6, 1), bentoTheme.getColors(composerStartRestartGroup, i6).m21427getFg30d7_KjU(), 0.0f, composerStartRestartGroup, 0, 4);
                    } else {
                        f = 0.0f;
                        i8 = 6;
                        i9 = 1;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierFillMaxWidth$default5 = SizeKt.fillMaxWidth$default(companion, f, i9, null);
                    CryptoPositionRowState totalReturnRowState = state.getTotalReturnRowState();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    boolean z4 = i17 == 16384 ? true : r14;
                    Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (z4 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue5 = new Function0() { // from class: com.robinhood.android.crypto.ui.detail.position.CryptoPositionComposableKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoPositionComposable6.CryptoPositionComposable$lambda$25$lambda$13$lambda$12(onPositionRowLabelClicked);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    CryptoPositionRow3.m13110CryptoPositionRowFU0evQE(totalReturnRowState, modifierFillMaxWidth$default5, 0L, (Function0) objRememberedValue5, null, null, composerStartRestartGroup, i7 | 48, 52);
                    if (state.getAreDataRowDividersVisible()) {
                        BentoDivider.m20635BentoHorizontalDivideraMcp0Q(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composerStartRestartGroup, i8, 1), bentoTheme.getColors(composerStartRestartGroup, i6).m21427getFg30d7_KjU(), 0.0f, composerStartRestartGroup, 0, 4);
                    }
                } else {
                    i8 = 6;
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(685883547);
                if (state.getPositionBannerType() != null) {
                    Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
                    CryptoPositionState.PositionBannerType positionBannerType = state.getPositionBannerType();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(state) | ((i13 & 458752) == 131072 ? true : r14);
                    Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        function12 = onPositionBannerClicked;
                        objRememberedValue6 = new Function0() { // from class: com.robinhood.android.crypto.ui.detail.position.CryptoPositionComposableKt$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoPositionComposable6.CryptoPositionComposable$lambda$25$lambda$15$lambda$14(function12, state);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        function12 = onPositionBannerClicked;
                    }
                    Function0 function02 = (Function0) objRememberedValue6;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(state) | ((i13 & 3670016) == 1048576 ? true : r14);
                    Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                        function15 = onPositionBannerDismissClicked;
                        objRememberedValue7 = new Function0() { // from class: com.robinhood.android.crypto.ui.detail.position.CryptoPositionComposableKt$$ExternalSyntheticLambda8
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoPositionComposable6.CryptoPositionComposable$lambda$25$lambda$17$lambda$16(function15, state);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    } else {
                        function15 = onPositionBannerDismissClicked;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    PositionBanner.PositionBanner(positionBannerType, function02, (Function0) objRememberedValue7, modifierM5146paddingqDBjuR0$default2, composerStartRestartGroup, 0, 0);
                } else {
                    function12 = onPositionBannerClicked;
                    function15 = onPositionBannerDismissClicked;
                }
                composerStartRestartGroup.endReplaceGroup();
                function14 = onTransferBannerAction;
                BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-598720272, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.position.CryptoPositionComposableKt$CryptoPositionComposable$2$8
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i18) {
                        if ((i18 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-598720272, i18, -1, "com.robinhood.android.crypto.ui.detail.position.CryptoPositionComposable.<anonymous>.<anonymous> (CryptoPositionComposable.kt:175)");
                        }
                        if (state.getTransferActionState() != null && state.getTransferActionState().getIsVisible()) {
                            CryptoDetailTransferActionsComposable2.CryptoDetailTransferActionsComposable(state.getTransferActionState(), function14, function1, PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), composer2, 0, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, i8);
                composerStartRestartGroup.endReplaceGroup();
                function13 = function15;
                onTransferButtonAction = function1;
            } else {
                function12 = onPositionBannerClicked;
                composerStartRestartGroup.startReplaceGroup(-211338581);
                Modifier.Companion companion5 = Modifier.INSTANCE;
                Modifier modifierM5146paddingqDBjuR0$default3 = PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i12).m21593getSmallD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i12).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i12).m21593getSmallD9Ej5fM(), 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy4 = Row2.rowMeasurePolicy(arrangement.m5089spacedBy0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i12).m21593getSmallD9Ej5fM()), companion2.getCenterVertically(), composerStartRestartGroup, 48);
                int currentCompositeKeyHash5 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier5 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default3);
                Function0<ComposeUiNode> constructor5 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor5);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM6388constructorimpl5 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl5, measurePolicyRowMeasurePolicy4, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl5, currentCompositionLocalMap5, companion3.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion3.getSetCompositeKeyHash();
                if (composerM6388constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                    composerM6388constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                    composerM6388constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                }
                Updater.m6390setimpl(composerM6388constructorimpl5, modifierMaterializeModifier5, companion3.getSetModifier());
                Modifier modifierM5146paddingqDBjuR0$default4 = PaddingKt.m5146paddingqDBjuR0$default(Row5.weight$default(Row6.INSTANCE, companion5, 1.0f, false, 2, null), bentoTheme2.getSpacing(composerStartRestartGroup, i12).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i12).m21593getSmallD9Ej5fM(), 0.0f, 10, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
                int currentCompositeKeyHash6 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier6 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default4);
                Function0<ComposeUiNode> constructor6 = companion3.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl6, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl6, currentCompositionLocalMap6, companion3.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = companion3.getSetCompositeKeyHash();
                if (composerM6388constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                    composerM6388constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                    composerM6388constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                }
                Updater.m6390setimpl(composerM6388constructorimpl6, modifierMaterializeModifier6, companion3.getSetModifier());
                Modifier modifierFillMaxWidth$default6 = SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy5 = Row2.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composerStartRestartGroup, 0);
                int currentCompositeKeyHash7 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier7 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default6);
                Function0<ComposeUiNode> constructor7 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor7);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM6388constructorimpl7 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl7, measurePolicyRowMeasurePolicy5, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl7, currentCompositionLocalMap7, companion3.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash7 = companion3.getSetCompositeKeyHash();
                if (composerM6388constructorimpl7.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                    composerM6388constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
                    composerM6388constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
                }
                Updater.m6390setimpl(composerM6388constructorimpl7, modifierMaterializeModifier7, companion3.getSetModifier());
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C12757R.string.crypto_detail_positions_label_new, composerStartRestartGroup, 0), null, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i12).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i12).getTextS(), composerStartRestartGroup, 0, 0, 8186);
                composerStartRestartGroup.startReplaceGroup(-1266398733);
                if (state.isCryptoBalanceIconVisible()) {
                    i5 = 1048576;
                    BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.QUESTION_FILLED_16), null, bentoTheme2.getColors(composerStartRestartGroup, i12).m21426getFg20d7_KjU(), TestTag3.testTag(PaddingKt.m5144paddingVpY3zN4$default(companion5, bentoTheme2.getSpacing(composerStartRestartGroup, i12).m21595getXsmallD9Ej5fM(), 0.0f, 2, null), TestTagCryptoBalanceIcon), onViewCryptoBalance, false, composerStartRestartGroup, ((i13 << 3) & 57344) | BentoIcon4.Size16.$stable | 48, 32);
                } else {
                    i5 = 1048576;
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                BentoText2.m20748BentoTextQnj7Zds(state.getEquity(), null, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i12).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 1, 0, null, null, bentoTheme2.getTypography(composerStartRestartGroup, i12).getDisplayCapsuleMedium(), composerStartRestartGroup, 805306368, 0, 7674);
                BentoText2.m20748BentoTextQnj7Zds(state.getQuantity(), null, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i12).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 1, 0, null, null, bentoTheme2.getTypography(composerStartRestartGroup, i12).getTextS(), composerStartRestartGroup, 805306368, 0, 7674);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.startReplaceGroup(685987999);
                if (state.getAreHoldingRowsVisible()) {
                    Modifier modifierFillMaxWidth$default7 = SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null);
                    CryptoPositionRowState averageCostRowState2 = state.getAverageCostRowState();
                    int i18 = StringResource.$stable;
                    int i19 = i13 >> 9;
                    CryptoPositionRow3.m13110CryptoPositionRowFU0evQE(averageCostRowState2, modifierFillMaxWidth$default7, 0L, null, onTooltipClicked, onTooltipAppear, composerStartRestartGroup, i18 | 48 | (i19 & 57344) | (i19 & 458752), 12);
                    composerStartRestartGroup.startReplaceGroup(685997794);
                    if (state.isPortfolioDiversityRowVisible()) {
                        CryptoPositionRow3.m13110CryptoPositionRowFU0evQE(state.getPortfolioDiversityRowState(), SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null), 0L, null, null, null, composerStartRestartGroup, i18 | 48, 60);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    CryptoPositionRow3.m13110CryptoPositionRowFU0evQE(state.getTodayReturnRowState(), SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null), 0L, null, null, null, composerStartRestartGroup, i18 | 48, 60);
                    CryptoPositionRow3.m13110CryptoPositionRowFU0evQE(state.getTotalReturnRowState(), SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null), 0L, null, null, null, composerStartRestartGroup, i18 | 48, 60);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(686017275);
                if (state.getPositionBannerType() != null) {
                    Modifier modifierM5146paddingqDBjuR0$default5 = PaddingKt.m5146paddingqDBjuR0$default(companion5, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i12).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
                    CryptoPositionState.PositionBannerType positionBannerType2 = state.getPositionBannerType();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(state) | ((i13 & 458752) == 131072);
                    Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance3 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue8 = new Function0() { // from class: com.robinhood.android.crypto.ui.detail.position.CryptoPositionComposableKt$$ExternalSyntheticLambda9
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoPositionComposable6.CryptoPositionComposable$lambda$25$lambda$22$lambda$21(function12, state);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                    }
                    Function0 function03 = (Function0) objRememberedValue8;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(state) | ((i13 & 3670016) == i5);
                    Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance4 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                        function13 = onPositionBannerDismissClicked;
                        objRememberedValue9 = new Function0() { // from class: com.robinhood.android.crypto.ui.detail.position.CryptoPositionComposableKt$$ExternalSyntheticLambda10
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoPositionComposable6.CryptoPositionComposable$lambda$25$lambda$24$lambda$23(function13, state);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                    } else {
                        function13 = onPositionBannerDismissClicked;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    PositionBanner.PositionBanner(positionBannerType2, function03, (Function0) objRememberedValue9, modifierM5146paddingqDBjuR0$default5, composerStartRestartGroup, 0, 0);
                } else {
                    function13 = onPositionBannerDismissClicked;
                }
                composerStartRestartGroup.endReplaceGroup();
                function14 = onTransferBannerAction;
                onTransferButtonAction = function1;
                BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1351882311, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.position.CryptoPositionComposableKt$CryptoPositionComposable$2$12
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i20) {
                        if ((i20 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1351882311, i20, -1, "com.robinhood.android.crypto.ui.detail.position.CryptoPositionComposable.<anonymous>.<anonymous> (CryptoPositionComposable.kt:265)");
                        }
                        if (state.getTransferActionState() != null && state.getTransferActionState().getIsVisible()) {
                            CryptoDetailTransferActionsComposable2.CryptoDetailTransferActionsComposable(state.getTransferActionState(), function14, onTransferButtonAction, PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), composer2, 0, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier5;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Function1<? super CryptoPositionState.PositionBannerType, Unit> function16 = function12;
            final Function1<? super GenericAction, Unit> function17 = function14;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.ui.detail.position.CryptoPositionComposableKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoPositionComposable6.CryptoPositionComposable$lambda$26(state, function17, onTransferButtonAction, onViewCryptoBalance, onPositionRowLabelClicked, function16, function13, onTooltipClicked, onTooltipAppear, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoPositionComposable$lambda$2$lambda$1$lambda$0(long j, DrawScope drawBehind) {
        Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
        float fMo5016toPx0680j_4 = drawBehind.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(1));
        DrawScope.m6951drawLineNGM6Ib0$default(drawBehind, j, Offset.m6535constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L)), Offset.m6535constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind.mo6963getSizeNHjbRc() >> 32))) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L)), fMo5016toPx0680j_4, 0, null, 0.0f, null, 0, 496, null);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawBehind.mo6963getSizeNHjbRc() & 4294967295L));
        long jM6535constructorimpl = Offset.m6535constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawBehind.mo6963getSizeNHjbRc() >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (drawBehind.mo6963getSizeNHjbRc() & 4294967295L));
        DrawScope.m6951drawLineNGM6Ib0$default(drawBehind, j, jM6535constructorimpl, Offset.m6535constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat3) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat2) << 32)), fMo5016toPx0680j_4, 0, null, 0.0f, null, 0, 496, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoPositionComposable$lambda$25$lambda$9$lambda$6$lambda$5(Function1 function1) {
        function1.invoke(CryptoPositionLabelType.AVERAGE_COST);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoPositionComposable$lambda$25$lambda$9$lambda$8$lambda$7(Function1 function1) {
        function1.invoke(CryptoPositionLabelType.PORTFOLIO_DIVERSITY);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoPositionComposable$lambda$25$lambda$11$lambda$10(Function1 function1) {
        function1.invoke(CryptoPositionLabelType.RETURNS);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoPositionComposable$lambda$25$lambda$13$lambda$12(Function1 function1) {
        function1.invoke(CryptoPositionLabelType.RETURNS);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoPositionComposable$lambda$25$lambda$15$lambda$14(Function1 function1, CryptoPositionState cryptoPositionState) {
        function1.invoke(cryptoPositionState.getPositionBannerType());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoPositionComposable$lambda$25$lambda$17$lambda$16(Function1 function1, CryptoPositionState cryptoPositionState) {
        function1.invoke(cryptoPositionState.getPositionBannerType());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoPositionComposable$lambda$25$lambda$22$lambda$21(Function1 function1, CryptoPositionState cryptoPositionState) {
        function1.invoke(cryptoPositionState.getPositionBannerType());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoPositionComposable$lambda$25$lambda$24$lambda$23(Function1 function1, CryptoPositionState cryptoPositionState) {
        function1.invoke(cryptoPositionState.getPositionBannerType());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoPositionState createPositionForPreview(boolean z) {
        AnnotatedString annotatedString = new AnnotatedString("$4,983.67", null, 2, null);
        AnnotatedString annotatedString2 = new AnnotatedString("128.99 SOL", null, 2, null);
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
        BannerComponent bannerComponent = new BannerComponent(ServerToBentoAssetMapper2.INFO_12, new RichText("Info", CollectionsKt.emptyList()), null);
        GenericButtonType genericButtonType = GenericButtonType.SECONDARY;
        CryptoDetailTransferActionState cryptoDetailTransferActionState = new CryptoDetailTransferActionState(uuidRandomUUID, bannerComponent, null, extensions2.persistentListOf(new GenericButton("Send", genericButtonType, false, "", null, ServerToBentoAssetMapper2.MESSAGE_SEND_16, 20, null), new GenericButton("Receive", genericButtonType, false, "", null, ServerToBentoAssetMapper2.QR_16, 20, null)), null);
        StringResource.Companion companion = StringResource.INSTANCE;
        return new CryptoPositionState(true, true, false, annotatedString, true, true, annotatedString2, cryptoDetailTransferActionState, z, new CryptoPositionRowState(false, companion.invoke("Quantity"), false, new AnnotatedString("128.99 SOL", null, 2, null), null, null, "", 52, null), new CryptoPositionRowState(false, companion.invoke("Value"), false, new AnnotatedString("$4,983.67", null, 2, null), null, null, "", 52, null), new CryptoPositionRowState(!z, companion.invoke("Average cost"), false, new AnnotatedString("$0.27", null, 2, null), null, null, "", 52, null), new CryptoPositionRowState(!z, companion.invoke("Portfolio diversity"), false, new AnnotatedString("47%", null, 2, null), new CryptoPositionRowState.TextTrailingContent.PieChart(0.47f), null, "", 36, null), new CryptoPositionRowState(true, companion.invoke("Today's return"), false, new AnnotatedString("-$0.4448 (-0.60%)", null, 2, null), null, null, "", 52, null), new CryptoPositionRowState(true, companion.invoke("Total return"), false, new AnnotatedString("+$57.32 (+331.23%)", null, 2, null), null, null, "", 52, null), null);
    }

    public static final void PreviewPositionGrid(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1780382469);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1780382469, i, -1, "com.robinhood.android.crypto.ui.detail.position.PreviewPositionGrid (CryptoPositionComposable.kt:357)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, Boolean.FALSE, null, BentoTheme4.POSITIVE, CryptoPositionComposable.INSTANCE.getLambda$1378154563$feature_crypto_externalDebug(), composerStartRestartGroup, 113442816, 95);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.ui.detail.position.CryptoPositionComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoPositionComposable6.PreviewPositionGrid$lambda$27(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void PreviewPosition(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(618711713);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(618711713, i, -1, "com.robinhood.android.crypto.ui.detail.position.PreviewPosition (CryptoPositionComposable.kt:387)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, Boolean.FALSE, null, BentoTheme4.POSITIVE, CryptoPositionComposable.INSTANCE.m13092getLambda$1154407959$feature_crypto_externalDebug(), composerStartRestartGroup, 113442816, 95);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.ui.detail.position.CryptoPositionComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoPositionComposable6.PreviewPosition$lambda$28(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
