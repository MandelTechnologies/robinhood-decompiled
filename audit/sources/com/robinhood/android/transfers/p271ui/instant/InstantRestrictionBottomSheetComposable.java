package com.robinhood.android.transfers.p271ui.instant;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiIcon2;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.transfers.C30065R;
import com.robinhood.android.transfers.p271ui.instant.InstantRestrictionBottomSheet;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.api.bonfire.transfer.InstantOptionRow;
import com.robinhood.models.serverdriven.experimental.api.Button;
import com.robinhood.models.serverdriven.experimental.api.DisplayRTPUpsellAction;
import com.robinhood.transfers.api.TransferType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InstantRestrictionBottomSheetComposable.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aU\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\r¨\u0006\u000e"}, m3636d2 = {"InstantRestrictionBottomSheetComposable", "", "args", "Lcom/robinhood/android/transfers/ui/instant/InstantRestrictionBottomSheet$Args;", "onRowClick", "Lkotlin/Function1;", "Lcom/robinhood/transfers/api/TransferType;", "onButtonClick", "Lcom/robinhood/models/serverdriven/experimental/api/DisplayRTPUpsellAction;", "onDisclosureClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/transfers/ui/instant/InstantRestrictionBottomSheet$Args;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-transfers_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.ui.instant.InstantRestrictionBottomSheetComposableKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class InstantRestrictionBottomSheetComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstantRestrictionBottomSheetComposable$lambda$14(InstantRestrictionBottomSheet.Args args, Function1 function1, Function1 function12, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        InstantRestrictionBottomSheetComposable(args, function1, function12, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InstantRestrictionBottomSheetComposable(final InstantRestrictionBottomSheet.Args args, final Function1<? super TransferType, Unit> onRowClick, final Function1<? super DisplayRTPUpsellAction, Unit> onButtonClick, Function0<Unit> onDisclosureClick, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Button button;
        final Button button2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        int i4;
        final Function1<? super DisplayRTPUpsellAction, Unit> function1;
        Function0 function0;
        Function0 function02;
        Composer composer2;
        boolean z;
        Object objRememberedValue;
        final Function0<Unit> function03;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(onRowClick, "onRowClick");
        Intrinsics.checkNotNullParameter(onButtonClick, "onButtonClick");
        Intrinsics.checkNotNullParameter(onDisclosureClick, "onDisclosureClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1952451431);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(args) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onRowClick) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onButtonClick) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDisclosureClick) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1952451431, i3, -1, "com.robinhood.android.transfers.ui.instant.InstantRestrictionBottomSheetComposable (InstantRestrictionBottomSheetComposable.kt:31)");
                }
                button = (Button) CollectionsKt.getOrNull(args.getSduiAlertAction().getAlert().getAction_buttons(), 0);
                button2 = (Button) CollectionsKt.getOrNull(args.getSduiAlertAction().getAlert().getAction_buttons(), 1);
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Modifier.Companion companion3 = Modifier.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21593getSmallD9Ej5fM(), 5, null), bentoTheme.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default);
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
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                Modifier modifier5 = modifier4;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
                String title = args.getSduiAlertAction().getAlert().getTitle();
                TextAlign.Companion companion4 = TextAlign.INSTANCE;
                BentoText2.m20747BentoText38GnDrw(title, modifierFillMaxWidth$default, null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i6).getDisplayCapsuleMedium(), composerStartRestartGroup, 48, 0, 8124);
                Composer composer3 = composerStartRestartGroup;
                BentoMarkdownText2.BentoMarkdownText(args.getSduiAlertAction().getAlert().getBody_markdown(), SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), MarkdownStyle.m16260copyR0sFphs$default(BentoMarkdownText.INSTANCE.getStyle(composer3, BentoMarkdownText.$stable), null, null, null, null, null, null, null, 0L, null, companion4.m7919getCentere0LSkKk(), null, 1535, null), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer3, (MarkdownStyle.$stable << 6) | 48, 24);
                composer3.endNode();
                composer3.startReplaceGroup(-1821793383);
                for (final InstantOptionRow instantOptionRow : args.getInstantUpsellContent()) {
                    ServerToBentoAssetMapper2 bentoAsset = SduiIcon2.toBentoAsset(instantOptionRow.getIcon());
                    if (bentoAsset == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    BentoBaseRowState.Start.Icon icon = new BentoBaseRowState.Start.Icon(bentoAsset, null, null, 6, null);
                    String title2 = instantOptionRow.getTitle();
                    String subtitle = instantOptionRow.getSubtitle();
                    composer3.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = ((i3 & 112) == 32) | composer3.changedInstance(instantOptionRow);
                    Object objRememberedValue2 = composer3.rememberedValue();
                    if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.transfers.ui.instant.InstantRestrictionBottomSheetComposableKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return InstantRestrictionBottomSheetComposable.m2536xcffe35ae(onRowClick, instantOptionRow);
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue2);
                    }
                    composer3.endReplaceGroup();
                    Composer composer4 = composer3;
                    BentoBaseRowKt.m20916BentoBaseRowygcbOzY(null, icon, title2, subtitle, null, null, null, false, false, false, 0L, (Function0) objRememberedValue2, composer4, BentoBaseRowState.Start.Icon.$stable << 3, 0, 2033);
                    composer3 = composer4;
                }
                composer3.endReplaceGroup();
                Modifier.Companion companion5 = Modifier.INSTANCE;
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i7 = BentoTheme.$stable;
                Modifier modifierM5144paddingVpY3zN4$default2 = PaddingKt.m5144paddingVpY3zN4$default(companion5, bentoTheme2.getSpacing(composer3, i7).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                String label = button == null ? button.getLabel() : null;
                composer3.startReplaceGroup(-1821767555);
                if (button != null) {
                    function1 = onButtonClick;
                    function0 = null;
                    i4 = 256;
                } else {
                    composer3.startReplaceGroup(-1633490746);
                    i4 = 256;
                    boolean zChangedInstance2 = ((i3 & 896) == 256) | composer3.changedInstance(button);
                    Object objRememberedValue3 = composer3.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        function1 = onButtonClick;
                        objRememberedValue3 = new Function0() { // from class: com.robinhood.android.transfers.ui.instant.InstantRestrictionBottomSheetComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return InstantRestrictionBottomSheetComposable.m2537x15d9ae51(function1, button);
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue3);
                    } else {
                        function1 = onButtonClick;
                    }
                    function0 = (Function0) objRememberedValue3;
                    composer3.endReplaceGroup();
                }
                composer3.endReplaceGroup();
                String label2 = button2 == null ? button2.getLabel() : null;
                composer3.startReplaceGroup(-1821761195);
                if (button2 != null) {
                    function02 = null;
                } else {
                    composer3.startReplaceGroup(-1633490746);
                    boolean zChangedInstance3 = ((i3 & 896) == i4) | composer3.changedInstance(button2);
                    Object objRememberedValue4 = composer3.rememberedValue();
                    if (zChangedInstance3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new Function0() { // from class: com.robinhood.android.transfers.ui.instant.InstantRestrictionBottomSheetComposableKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return InstantRestrictionBottomSheetComposable.m2538x5bb526f4(function1, button2);
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue4);
                    }
                    composer3.endReplaceGroup();
                    function02 = (Function0) objRememberedValue4;
                }
                composer3.endReplaceGroup();
                composer2 = composer3;
                BentoButtonBar2.BentoButtonBar(modifierM5144paddingVpY3zN4$default2, null, null, false, null, null, function0, label, false, null, false, function02, label2, false, null, false, composer2, 0, 0, 59198);
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null), bentoTheme2.getSpacing(composer2, i7).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, bentoTheme2.getSpacing(composer2, i7).m21590getDefaultD9Ej5fM(), 7, null);
                composer2.startReplaceGroup(5004770);
                z = (i3 & 7168) != 2048;
                objRememberedValue = composer2.rememberedValue();
                if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    function03 = onDisclosureClick;
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.transfers.ui.instant.InstantRestrictionBottomSheetComposableKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return InstantRestrictionBottomSheetComposable.m2535x15ca81fc(function03);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                } else {
                    function03 = onDisclosureClick;
                }
                composer2.endReplaceGroup();
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C30065R.string.gated_instant_restriction_bottom_sheet_footer, composer2, 0), ClickableKt.m4893clickableXHw0xAI$default(modifierM5146paddingqDBjuR0$default, false, null, null, (Function0) objRememberedValue, 7, null), null, null, FontWeight.INSTANCE.getBold(), TextDecoration.INSTANCE.getUnderline(), TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, null, composer2, 221184, 0, 16268);
                composerStartRestartGroup = composer2;
                composerStartRestartGroup.endNode();
                Unit unit = Unit.INSTANCE;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                function03 = onDisclosureClick;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Function0<Unit> function04 = function03;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.ui.instant.InstantRestrictionBottomSheetComposableKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return InstantRestrictionBottomSheetComposable.InstantRestrictionBottomSheetComposable$lambda$14(args, onRowClick, onButtonClick, function04, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((i3 & 9363) == 9362) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            button = (Button) CollectionsKt.getOrNull(args.getSduiAlertAction().getAlert().getAction_buttons(), 0);
            button2 = (Button) CollectionsKt.getOrNull(args.getSduiAlertAction().getAlert().getAction_buttons(), 1);
            Arrangement arrangement2 = Arrangement.INSTANCE;
            Arrangement.Vertical top2 = arrangement2.getTop();
            Alignment.Companion companion6 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(top2, companion6.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor3 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy3, companion22.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion22.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                Modifier.Companion companion32 = Modifier.INSTANCE;
                BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                int i62 = BentoTheme.$stable;
                Modifier modifierM5144paddingVpY3zN4$default3 = PaddingKt.m5144paddingVpY3zN4$default(PaddingKt.m5146paddingqDBjuR0$default(companion32, 0.0f, bentoTheme3.getSpacing(composerStartRestartGroup, i62).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme3.getSpacing(composerStartRestartGroup, i62).m21593getSmallD9Ej5fM(), 5, null), bentoTheme3.getSpacing(composerStartRestartGroup, i62).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy22 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion6.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default3);
                Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy22, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting()) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                    Modifier modifier52 = modifier4;
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion32, 0.0f, 1, null);
                    String title3 = args.getSduiAlertAction().getAlert().getTitle();
                    TextAlign.Companion companion42 = TextAlign.INSTANCE;
                    BentoText2.m20747BentoText38GnDrw(title3, modifierFillMaxWidth$default2, null, null, null, null, TextAlign.m7912boximpl(companion42.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme3.getTypography(composerStartRestartGroup, i62).getDisplayCapsuleMedium(), composerStartRestartGroup, 48, 0, 8124);
                    Composer composer32 = composerStartRestartGroup;
                    BentoMarkdownText2.BentoMarkdownText(args.getSduiAlertAction().getAlert().getBody_markdown(), SizeKt.fillMaxWidth$default(companion32, 0.0f, 1, null), MarkdownStyle.m16260copyR0sFphs$default(BentoMarkdownText.INSTANCE.getStyle(composer32, BentoMarkdownText.$stable), null, null, null, null, null, null, null, 0L, null, companion42.m7919getCentere0LSkKk(), null, 1535, null), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer32, (MarkdownStyle.$stable << 6) | 48, 24);
                    composer32.endNode();
                    composer32.startReplaceGroup(-1821793383);
                    while (r4.hasNext()) {
                    }
                    composer32.endReplaceGroup();
                    Modifier.Companion companion52 = Modifier.INSTANCE;
                    BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                    int i72 = BentoTheme.$stable;
                    Modifier modifierM5144paddingVpY3zN4$default22 = PaddingKt.m5144paddingVpY3zN4$default(companion52, bentoTheme22.getSpacing(composer32, i72).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                    if (button == null) {
                    }
                    composer32.startReplaceGroup(-1821767555);
                    if (button != null) {
                    }
                    composer32.endReplaceGroup();
                    if (button2 == null) {
                    }
                    composer32.startReplaceGroup(-1821761195);
                    if (button2 != null) {
                    }
                    composer32.endReplaceGroup();
                    composer2 = composer32;
                    BentoButtonBar2.BentoButtonBar(modifierM5144paddingVpY3zN4$default22, null, null, false, null, null, function0, label, false, null, false, function02, label2, false, null, false, composer2, 0, 0, 59198);
                    Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion52, 0.0f, 1, null), bentoTheme22.getSpacing(composer2, i72).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, bentoTheme22.getSpacing(composer2, i72).m21590getDefaultD9Ej5fM(), 7, null);
                    composer2.startReplaceGroup(5004770);
                    if ((i3 & 7168) != 2048) {
                    }
                    objRememberedValue = composer2.rememberedValue();
                    if (z) {
                        function03 = onDisclosureClick;
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.transfers.ui.instant.InstantRestrictionBottomSheetComposableKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return InstantRestrictionBottomSheetComposable.m2535x15ca81fc(function03);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue);
                        composer2.endReplaceGroup();
                        BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C30065R.string.gated_instant_restriction_bottom_sheet_footer, composer2, 0), ClickableKt.m4893clickableXHw0xAI$default(modifierM5146paddingqDBjuR0$default2, false, null, null, (Function0) objRememberedValue, 7, null), null, null, FontWeight.INSTANCE.getBold(), TextDecoration.INSTANCE.getUnderline(), TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, null, composer2, 221184, 0, 16268);
                        composerStartRestartGroup = composer2;
                        composerStartRestartGroup.endNode();
                        Unit unit2 = Unit.INSTANCE;
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier52;
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: InstantRestrictionBottomSheetComposable$lambda$13$lambda$12$lambda$3$lambda$2$lambda$1 */
    public static final Unit m2536xcffe35ae(Function1 function1, InstantOptionRow instantOptionRow) {
        function1.invoke(instantOptionRow.getInstantTransferType());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: InstantRestrictionBottomSheetComposable$lambda$13$lambda$12$lambda$6$lambda$5$lambda$4 */
    public static final Unit m2537x15d9ae51(Function1 function1, Button button) {
        function1.invoke(button.getAction());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: InstantRestrictionBottomSheetComposable$lambda$13$lambda$12$lambda$9$lambda$8$lambda$7 */
    public static final Unit m2538x5bb526f4(Function1 function1, Button button) {
        function1.invoke(button.getAction());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: InstantRestrictionBottomSheetComposable$lambda$13$lambda$12$lambda$11$lambda$10 */
    public static final Unit m2535x15ca81fc(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}
