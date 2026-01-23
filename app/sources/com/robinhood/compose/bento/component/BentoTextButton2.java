package com.robinhood.compose.bento.component;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.interaction.PressInteraction2;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Row2;
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
import androidx.compose.p011ui.semantics.Role;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoTextButton3;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.compose.theme.style.TextButtonStyle;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BentoTextButton.kt */
@Metadata(m3635d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\u001a[\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\r\u0010\u0012\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0013\u001a\r\u0010\u0014\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0013¨\u0006\u0015²\u0006\n\u0010\u0016\u001a\u00020\rX\u008a\u0084\u0002²\u0006\n\u0010\u0017\u001a\u00020\u000fX\u008a\u0084\u0002²\u0006\f\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u008a\u008e\u0002"}, m3636d2 = {"BentoTextButton", "", "onClick", "Lkotlin/Function0;", "text", "", "modifier", "Landroidx/compose/ui/Modifier;", "icon", "Lcom/robinhood/compose/bento/component/BentoTextButtons$Icon$Size12;", "size", "Lcom/robinhood/compose/bento/component/BentoTextButtons$Size;", "enabled", "", "colorOverride", "Landroidx/compose/ui/graphics/Color;", "BentoTextButton-PIknLig", "(Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lcom/robinhood/compose/bento/component/BentoTextButtons$Icon$Size12;Lcom/robinhood/compose/bento/component/BentoTextButtons$Size;ZLandroidx/compose/ui/graphics/Color;Landroidx/compose/runtime/Composer;II)V", "BentoTextButtonMediumPreview", "(Landroidx/compose/runtime/Composer;I)V", "BentoTextButtonSmallPreview", "lib-compose-bento_externalRelease", "pressed", "currentColor", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.bento.component.BentoTextButtonKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class BentoTextButton2 {

    /* compiled from: BentoTextButton.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.compose.bento.component.BentoTextButtonKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BentoTextButton3.Size.values().length];
            try {
                iArr[BentoTextButton3.Size.f5147M.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BentoTextButton3.Size.f5148S.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoTextButtonMediumPreview$lambda$12(int i, Composer composer, int i2) {
        BentoTextButtonMediumPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoTextButtonSmallPreview$lambda$13(int i, Composer composer, int i2) {
        BentoTextButtonSmallPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoTextButton_PIknLig$lambda$11(Function0 function0, String str, Modifier modifier, BentoTextButton3.Icon.Size12 size12, BentoTextButton3.Size size, boolean z, Color color, int i, int i2, Composer composer, int i3) {
        m20715BentoTextButtonPIknLig(function0, str, modifier, size12, size, z, color, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x010e  */
    /* renamed from: BentoTextButton-PIknLig, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m20715BentoTextButtonPIknLig(final Function0<Unit> onClick, final String text, Modifier modifier, BentoTextButton3.Icon.Size12 size12, BentoTextButton3.Size size, boolean z, Color color, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int i4;
        BentoTextButton3.Icon.Size12 size122;
        int i5;
        int i6;
        boolean z2;
        int i7;
        Color color2;
        BentoTextButton3.Icon.Size12 size123;
        int i8;
        int i9;
        TextButtonStyle.Style m;
        Object objRememberedValue;
        Composer.Companion companion;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final SnapshotState4<Color> snapshotState4;
        int i10;
        Composer composer2;
        int i11;
        SnapshotMutationPolicy snapshotMutationPolicy;
        boolean z3;
        Object objRememberedValue2;
        final SnapshotState snapshotState;
        final boolean zBooleanValue;
        Modifier.Companion companion2;
        boolean zChanged;
        Object objRememberedValue3;
        Object objRememberedValue4;
        Composer composer3;
        final boolean z4;
        final BentoTextButton3.Icon.Size12 size124;
        final BentoTextButton3.Size size2;
        final Color color3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1262506154);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(text) ? 32 : 16;
        }
        int i12 = i2 & 4;
        if (i12 != 0) {
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
                    size122 = size12;
                    i3 |= composerStartRestartGroup.changed(size122) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    i3 |= composerStartRestartGroup.changed(size == null ? -1 : size.ordinal()) ? 16384 : 8192;
                }
                i6 = i2 & 32;
                if (i6 == 0) {
                    if ((196608 & i) == 0) {
                        z2 = z;
                        i3 |= composerStartRestartGroup.changed(z2) ? 131072 : 65536;
                    }
                    i7 = i2 & 64;
                    if (i7 == 0) {
                        i3 |= 1572864;
                        color2 = color;
                    } else {
                        color2 = color;
                        if ((i & 1572864) == 0) {
                            i3 |= composerStartRestartGroup.changed(color2) ? 1048576 : 524288;
                        }
                    }
                    if ((i3 & 599187) == 599186 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier3 = i12 == 0 ? Modifier.INSTANCE : modifier2;
                        size123 = i4 == 0 ? null : size122;
                        BentoTextButton3.Size size3 = i5 == 0 ? BentoTextButton3.Size.f5147M : size;
                        if (i6 != 0) {
                            z2 = true;
                        }
                        Color color4 = i7 == 0 ? null : color2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1262506154, i3, -1, "com.robinhood.compose.bento.component.BentoTextButton (BentoTextButton.kt:49)");
                        }
                        i8 = WhenMappings.$EnumSwitchMapping$0[size3.ordinal()];
                        if (i8 == 1) {
                            i9 = 2;
                            if (i8 != 2) {
                                composerStartRestartGroup.startReplaceGroup(-2087626735);
                                composerStartRestartGroup.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composerStartRestartGroup.startReplaceGroup(-2087622153);
                            m = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getTextButton(composerStartRestartGroup, 0).getS();
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            i9 = 2;
                            composerStartRestartGroup.startReplaceGroup(-2087624329);
                            m = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getTextButton(composerStartRestartGroup, 0).getM();
                            composerStartRestartGroup.endReplaceGroup();
                        }
                        TextButtonStyle.Style style = m;
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = InteractionSource2.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        InteractionSource3 interactionSource3 = (InteractionSource3) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        SnapshotState4<Boolean> snapshotState4CollectIsPressedAsState = PressInteraction2.collectIsPressedAsState(interactionSource3, composerStartRestartGroup, 6);
                        int i13 = i3;
                        boolean z5 = z2;
                        Modifier modifierM4891clickableO2vRcR0$default = ClickableKt.m4891clickableO2vRcR0$default(modifier3, interactionSource3, null, z5, null, Role.m7472boximpl(Role.INSTANCE.m7479getButtono7Vup1c()), onClick, 8, null);
                        Modifier modifier4 = modifier3;
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4891clickableO2vRcR0$default);
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
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                        Row6 row6 = Row6.INSTANCE;
                        snapshotState4 = (color4 == null ? TextButtonStyle.StateColor.m21964copyjxsXWHM$default(style.getColor(), color4.getValue(), 0L, 0.0f, 6, null) : style.getColor()).get(z5, BentoTextButton_PIknLig$lambda$1(snapshotState4CollectIsPressedAsState), composerStartRestartGroup, ((i13 >> 15) & 14) | (TextButtonStyle.StateColor.$stable << 6));
                        composerStartRestartGroup.startReplaceGroup(1925622800);
                        if (size123 == null && size123.getPosition() == BentoTextButton3.Icon.Position.Leading) {
                            composer2 = composerStartRestartGroup;
                            i10 = i9;
                            i11 = 1849434622;
                            snapshotMutationPolicy = null;
                            z3 = 6;
                            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size12(size123.getAsset()), null, BentoTextButton_PIknLig$lambda$10$lambda$2(snapshotState4), null, null, false, composer2, 48, 56);
                            Spacer2.Spacer(SizeKt.m5174width3ABfNKs(Modifier.INSTANCE, BentoTextButton.INSTANCE.m20712getIconSpacingD9Ej5fM$lib_compose_bento_externalRelease()), composer2, 6);
                        } else {
                            i10 = i9;
                            composer2 = composerStartRestartGroup;
                            i11 = 1849434622;
                            snapshotMutationPolicy = null;
                            z3 = 6;
                        }
                        composer2.endReplaceGroup();
                        composer2.startReplaceGroup(i11);
                        objRememberedValue2 = composer2.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = SnapshotState3.mutableStateOf$default(snapshotMutationPolicy, snapshotMutationPolicy, i10, snapshotMutationPolicy);
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        snapshotState = (SnapshotState) objRememberedValue2;
                        composer2.endReplaceGroup();
                        zBooleanValue = ((Boolean) composer2.consume(LocalShowPlaceholder.getLocalShowPlaceholder())).booleanValue();
                        companion2 = Modifier.INSTANCE;
                        composer2.startReplaceGroup(-1746271574);
                        zChanged = composer2.changed(zBooleanValue) | composer2.changed(snapshotState4);
                        objRememberedValue3 = composer2.rememberedValue();
                        if (!zChanged || objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = new Function1() { // from class: com.robinhood.compose.bento.component.BentoTextButtonKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return BentoTextButton2.BentoTextButton_PIknLig$lambda$10$lambda$7$lambda$6(zBooleanValue, snapshotState, snapshotState4, (DrawScope) obj);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue3);
                        }
                        composer2.endReplaceGroup();
                        Modifier modifierDrawBehind = DrawModifierKt.drawBehind(companion2, (Function1) objRememberedValue3);
                        Color colorM6701boximpl = Color.m6701boximpl(BentoTextButton_PIknLig$lambda$10$lambda$2(snapshotState4));
                        int iM7959getEllipsisgIe3tQ8 = TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8();
                        composer2.startReplaceGroup(5004770);
                        objRememberedValue4 = composer2.rememberedValue();
                        if (objRememberedValue4 == companion.getEmpty()) {
                            objRememberedValue4 = new Function1() { // from class: com.robinhood.compose.bento.component.BentoTextButtonKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return BentoTextButton2.BentoTextButton_PIknLig$lambda$10$lambda$9$lambda$8(snapshotState, (TextLayoutResult) obj);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue4);
                        }
                        composer2.endReplaceGroup();
                        Composer composer4 = composer2;
                        BentoText2.m20747BentoText38GnDrw(text, modifierDrawBehind, colorM6701boximpl, null, null, null, null, iM7959getEllipsisgIe3tQ8, false, 1, 0, (Function1) objRememberedValue4, 0, style.getTextStyle(), composer4, ((i13 >> 3) & 14) | 817889280, 48, 5496);
                        composer3 = composer4;
                        composer3.startReplaceGroup(1925674097);
                        if (size123 != null && size123.getPosition() == BentoTextButton3.Icon.Position.Trailing) {
                            Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion2, BentoTextButton.INSTANCE.m20712getIconSpacingD9Ej5fM$lib_compose_bento_externalRelease()), composer3, 6);
                            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size12(size123.getAsset()), null, BentoTextButton_PIknLig$lambda$10$lambda$2(snapshotState4), null, null, false, composer3, 48, 56);
                        }
                        composer3.endReplaceGroup();
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z4 = z5;
                        size124 = size123;
                        size2 = size3;
                        color3 = color4;
                        modifier2 = modifier4;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        size124 = size122;
                        color3 = color2;
                        z4 = z2;
                        composer3 = composerStartRestartGroup;
                        size2 = size;
                    }
                    scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoTextButtonKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return BentoTextButton2.BentoTextButton_PIknLig$lambda$11(onClick, text, modifier2, size124, size2, z4, color3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 196608;
                z2 = z;
                i7 = i2 & 64;
                if (i7 == 0) {
                }
                if ((i3 & 599187) == 599186) {
                    if (i12 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    i8 = WhenMappings.$EnumSwitchMapping$0[size3.ordinal()];
                    if (i8 == 1) {
                    }
                    TextButtonStyle.Style style2 = m;
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                    }
                    InteractionSource3 interactionSource32 = (InteractionSource3) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    SnapshotState4<Boolean> snapshotState4CollectIsPressedAsState2 = PressInteraction2.collectIsPressedAsState(interactionSource32, composerStartRestartGroup, 6);
                    int i132 = i3;
                    boolean z52 = z2;
                    Modifier modifierM4891clickableO2vRcR0$default2 = ClickableKt.m4891clickableO2vRcR0$default(modifier3, interactionSource32, null, z52, null, Role.m7472boximpl(Role.INSTANCE.m7479getButtono7Vup1c()), onClick, 8, null);
                    Modifier modifier42 = modifier3;
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4891clickableO2vRcR0$default2);
                    ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion32.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion32.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion32.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion32.getSetModifier());
                        Row6 row62 = Row6.INSTANCE;
                        snapshotState4 = (color4 == null ? TextButtonStyle.StateColor.m21964copyjxsXWHM$default(style2.getColor(), color4.getValue(), 0L, 0.0f, 6, null) : style2.getColor()).get(z52, BentoTextButton_PIknLig$lambda$1(snapshotState4CollectIsPressedAsState2), composerStartRestartGroup, ((i132 >> 15) & 14) | (TextButtonStyle.StateColor.$stable << 6));
                        composerStartRestartGroup.startReplaceGroup(1925622800);
                        if (size123 == null) {
                            i10 = i9;
                            composer2 = composerStartRestartGroup;
                            i11 = 1849434622;
                            snapshotMutationPolicy = null;
                            z3 = 6;
                            composer2.endReplaceGroup();
                            composer2.startReplaceGroup(i11);
                            objRememberedValue2 = composer2.rememberedValue();
                            if (objRememberedValue2 == companion.getEmpty()) {
                            }
                            snapshotState = (SnapshotState) objRememberedValue2;
                            composer2.endReplaceGroup();
                            zBooleanValue = ((Boolean) composer2.consume(LocalShowPlaceholder.getLocalShowPlaceholder())).booleanValue();
                            companion2 = Modifier.INSTANCE;
                            composer2.startReplaceGroup(-1746271574);
                            zChanged = composer2.changed(zBooleanValue) | composer2.changed(snapshotState4);
                            objRememberedValue3 = composer2.rememberedValue();
                            if (!zChanged) {
                                objRememberedValue3 = new Function1() { // from class: com.robinhood.compose.bento.component.BentoTextButtonKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return BentoTextButton2.BentoTextButton_PIknLig$lambda$10$lambda$7$lambda$6(zBooleanValue, snapshotState, snapshotState4, (DrawScope) obj);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue3);
                                composer2.endReplaceGroup();
                                Modifier modifierDrawBehind2 = DrawModifierKt.drawBehind(companion2, (Function1) objRememberedValue3);
                                Color colorM6701boximpl2 = Color.m6701boximpl(BentoTextButton_PIknLig$lambda$10$lambda$2(snapshotState4));
                                int iM7959getEllipsisgIe3tQ82 = TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8();
                                composer2.startReplaceGroup(5004770);
                                objRememberedValue4 = composer2.rememberedValue();
                                if (objRememberedValue4 == companion.getEmpty()) {
                                }
                                composer2.endReplaceGroup();
                                Composer composer42 = composer2;
                                BentoText2.m20747BentoText38GnDrw(text, modifierDrawBehind2, colorM6701boximpl2, null, null, null, null, iM7959getEllipsisgIe3tQ82, false, 1, 0, (Function1) objRememberedValue4, 0, style2.getTextStyle(), composer42, ((i132 >> 3) & 14) | 817889280, 48, 5496);
                                composer3 = composer42;
                                composer3.startReplaceGroup(1925674097);
                                if (size123 != null) {
                                    Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion2, BentoTextButton.INSTANCE.m20712getIconSpacingD9Ej5fM$lib_compose_bento_externalRelease()), composer3, 6);
                                    BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size12(size123.getAsset()), null, BentoTextButton_PIknLig$lambda$10$lambda$2(snapshotState4), null, null, false, composer3, 48, 56);
                                }
                                composer3.endReplaceGroup();
                                composer3.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                z4 = z52;
                                size124 = size123;
                                size2 = size3;
                                color3 = color4;
                                modifier2 = modifier42;
                            }
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            size122 = size12;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            z2 = z;
            i7 = i2 & 64;
            if (i7 == 0) {
            }
            if ((i3 & 599187) == 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        size122 = size12;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        z2 = z;
        i7 = i2 & 64;
        if (i7 == 0) {
        }
        if ((i3 & 599187) == 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final boolean BentoTextButton_PIknLig$lambda$1(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    private static final long BentoTextButton_PIknLig$lambda$10$lambda$2(SnapshotState4<Color> snapshotState4) {
        return snapshotState4.getValue().getValue();
    }

    private static final TextLayoutResult BentoTextButton_PIknLig$lambda$10$lambda$4(SnapshotState<TextLayoutResult> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoTextButton_PIknLig$lambda$10$lambda$7$lambda$6(boolean z, SnapshotState snapshotState, SnapshotState4 snapshotState4, DrawScope drawBehind) {
        Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
        TextLayoutResult textLayoutResultBentoTextButton_PIknLig$lambda$10$lambda$4 = BentoTextButton_PIknLig$lambda$10$lambda$4(snapshotState);
        if (textLayoutResultBentoTextButton_PIknLig$lambda$10$lambda$4 == null) {
            return Unit.INSTANCE;
        }
        if (z) {
            return Unit.INSTANCE;
        }
        long jBentoTextButton_PIknLig$lambda$10$lambda$2 = BentoTextButton_PIknLig$lambda$10$lambda$2(snapshotState4);
        float lineLeft = textLayoutResultBentoTextButton_PIknLig$lambda$10$lambda$4.getLineLeft(0);
        float lineBottom = textLayoutResultBentoTextButton_PIknLig$lambda$10$lambda$4.getLineBottom(0);
        long jM6535constructorimpl = Offset.m6535constructorimpl((Float.floatToRawIntBits(lineBottom) & 4294967295L) | (Float.floatToRawIntBits(lineLeft) << 32));
        float lineRight = textLayoutResultBentoTextButton_PIknLig$lambda$10$lambda$4.getLineRight(0);
        float lineBottom2 = textLayoutResultBentoTextButton_PIknLig$lambda$10$lambda$4.getLineBottom(0);
        DrawScope.m6951drawLineNGM6Ib0$default(drawBehind, jBentoTextButton_PIknLig$lambda$10$lambda$2, jM6535constructorimpl, Offset.m6535constructorimpl((Float.floatToRawIntBits(lineRight) << 32) | (Float.floatToRawIntBits(lineBottom2) & 4294967295L)), 0.0f, 0, null, 0.0f, null, 0, 504, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoTextButton_PIknLig$lambda$10$lambda$9$lambda$8(SnapshotState snapshotState, TextLayoutResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        snapshotState.setValue(it);
        return Unit.INSTANCE;
    }

    public static final void BentoTextButtonMediumPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1092641303);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1092641303, i, -1, "com.robinhood.compose.bento.component.BentoTextButtonMediumPreview (BentoTextButton.kt:208)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, BentoTextButton4.INSTANCE.getLambda$284494641$lib_compose_bento_externalRelease(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoTextButtonKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoTextButton2.BentoTextButtonMediumPreview$lambda$12(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void BentoTextButtonSmallPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-336772379);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-336772379, i, -1, "com.robinhood.compose.bento.component.BentoTextButtonSmallPreview (BentoTextButton.kt:265)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, BentoTextButton4.INSTANCE.m20799getLambda$430895971$lib_compose_bento_externalRelease(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoTextButtonKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoTextButton2.BentoTextButtonSmallPreview$lambda$13(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
