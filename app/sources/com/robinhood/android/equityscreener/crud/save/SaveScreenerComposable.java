package com.robinhood.android.equityscreener.crud.save;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.equityscreener.C15652R;
import com.robinhood.android.equityscreener.crud.save.SaveScreenerBottomSheetViewState;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.waitlist.spot.WaitlistAnimationConstants;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoIconButton2;
import com.robinhood.compose.bento.component.BentoIconButton4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextInput4;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.ModifiersKt;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.compose.theme.style.ButtonStyle;
import com.robinhood.librobinhood.data.store.bonfire.screener.store.ScreenersStore;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SaveScreenerComposable.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\u001ab\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0001¢\u0006\u0002\u0010\r¨\u0006\u000e²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u0084\u0002"}, m3636d2 = {"SaveScreenerComposable", "", "viewState", "Lcom/robinhood/android/equityscreener/crud/save/SaveScreenerBottomSheetViewState;", "onEditEmoji", "Lkotlin/Function0;", "onDisplayNameChanged", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "onSave", "onCancel", "(Lcom/robinhood/android/equityscreener/crud/save/SaveScreenerBottomSheetViewState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "feature-equity-screener_externalDebug", "backgroundColor", "Landroidx/compose/ui/graphics/Color;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equityscreener.crud.save.SaveScreenerComposableKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class SaveScreenerComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SaveScreenerComposable$lambda$5(SaveScreenerBottomSheetViewState saveScreenerBottomSheetViewState, Function0 function0, Function1 function1, Function0 function02, Function0 function03, int i, Composer composer, int i2) {
        SaveScreenerComposable(saveScreenerBottomSheetViewState, function0, function1, function02, function03, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x05b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SaveScreenerComposable(SaveScreenerBottomSheetViewState viewState, final Function0<Unit> onEditEmoji, final Function1<? super String, Unit> onDisplayNameChanged, Function0<Unit> function0, Function0<Unit> function02, Composer composer, final int i) {
        int i2;
        boolean z;
        String strStringResource;
        boolean z2;
        final SaveScreenerBottomSheetViewState saveScreenerBottomSheetViewState;
        final Function0<Unit> onSave = function0;
        final Function0<Unit> onCancel = function02;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(onEditEmoji, "onEditEmoji");
        Intrinsics.checkNotNullParameter(onDisplayNameChanged, "onDisplayNameChanged");
        Intrinsics.checkNotNullParameter(onSave, "onSave");
        Intrinsics.checkNotNullParameter(onCancel, "onCancel");
        Composer composerStartRestartGroup = composer.startRestartGroup(985290760);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(viewState) : composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onEditEmoji) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onDisplayNameChanged) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onSave) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onCancel) ? 16384 : 8192;
        }
        if ((i2 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            saveScreenerBottomSheetViewState = viewState;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(985290760, i2, -1, "com.robinhood.android.equityscreener.crud.save.SaveScreenerComposable (SaveScreenerComposable.kt:47)");
            }
            boolean z3 = viewState instanceof SaveScreenerBottomSheetViewState.Loading;
            boolean z4 = viewState instanceof SaveScreenerBottomSheetViewState.Ready;
            boolean z5 = z4 && !((SaveScreenerBottomSheetViewState.Ready) viewState).isSaving();
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composerStartRestartGroup, 6, 1);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = i2;
            int i4 = BentoTheme.$stable;
            Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(modifierM21623defaultHorizontalPaddingrAjV9yQ, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null);
            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            Modifier modifierAlign = column6.align(ModifiersKt.bentoPlaceholder$default(companion, z3, null, 2, null), companion2.getCenterHorizontally());
            if (z4) {
                composerStartRestartGroup.startReplaceGroup(2115465868);
                z = false;
                strStringResource = StringResources_androidKt.stringResource(((SaveScreenerBottomSheetViewState.Ready) viewState).getTitleResId(), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                z = false;
                composerStartRestartGroup.startReplaceGroup(2115539586);
                strStringResource = StringResources_androidKt.stringResource(C15652R.string.save_sheet_title_save, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            FontWeight.Companion companion4 = FontWeight.INSTANCE;
            FontWeight medium = companion4.getMedium();
            TextStyle displayCapsuleSmall = bentoTheme.getTypography(composerStartRestartGroup, i4).getDisplayCapsuleSmall();
            TextAlign.Companion companion5 = TextAlign.INSTANCE;
            boolean z6 = z;
            BentoText2.m20747BentoText38GnDrw(strStringResource, modifierAlign, null, null, medium, null, TextAlign.m7912boximpl(companion5.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleSmall, composerStartRestartGroup, 24576, 0, 8108);
            Modifier modifierAlign2 = column6.align(ModifiersKt.bentoPlaceholder$default(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), z3, null, 2, null), companion2.getCenterHorizontally());
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), z6);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, z6 ? 1 : 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAlign2);
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
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            boolean z7 = z5;
            Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(Background3.m4872backgroundbw27NRU$default(Clip.clip(companion, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(8))), bentoTheme.getColors(composerStartRestartGroup, i4).m21372getBg20d7_KjU(), null, 2, null), z7, null, null, onEditEmoji, 6, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4893clickableXHw0xAI$default);
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
            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
            BentoText2.m20747BentoText38GnDrw(z4 ? ((SaveScreenerBottomSheetViewState.Ready) viewState).getEmoji() : ScreenersStore.DefaultEmoji, androidx.compose.foundation.layout.PaddingKt.m5142padding3ABfNKs(boxScopeInstance.align(companion, companion2.getCenter()), bentoTheme.getSpacing(composerStartRestartGroup, i4).m21590getDefaultD9Ej5fM()), null, null, companion4.getBold(), null, TextAlign.m7912boximpl(companion5.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i4).getDisplayNibLarge(), composerStartRestartGroup, 24576, 0, 8108);
            composerStartRestartGroup.endNode();
            float f = 4;
            int i5 = i3 >> 3;
            BentoIconButton2.m20641BentoIconButtoncqYvz4g(onEditEmoji, new BentoIconButton4.Icon.StandardSize16(ServerToBentoAssetMapper2.EDIT_12), StringResources_androidKt.stringResource(C15652R.string.save_sheet_edit_emoji, composerStartRestartGroup, 0), OffsetKt.m5124offsetVpY3zN4(boxScopeInstance.align(companion, companion2.getBottomEnd()), C2002Dp.m7995constructorimpl(f), C2002Dp.m7995constructorimpl(f)), null, z7, null, Color.m6701boximpl(SaveScreenerComposable$lambda$4$lambda$2$lambda$1(((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getButton(composerStartRestartGroup, 0).getPrimary().getColors().getBackgroundColor().get(z7, composerStartRestartGroup, ButtonStyle.StateColor.$stable << 3))), null, C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(bentoTheme.getSpacing(composerStartRestartGroup, i4).m21595getXsmallD9Ej5fM() + C2002Dp.m7995constructorimpl(12))), true, composerStartRestartGroup, (i5 & 14) | (BentoIconButton4.Icon.StandardSize16.$stable << 3), 6, WaitlistAnimationConstants.IN_WAITLIST_ANIMATION_END);
            composerStartRestartGroup.endNode();
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C15652R.string.save_sheet_screener_name, composerStartRestartGroup, 0), androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), null, null, companion4.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i4).getTextM(), composerStartRestartGroup, 24576, 0, 8172);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion);
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
            Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy3, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion3.getSetModifier());
            BentoTextInput4.BentoTextInput(z4 ? ((SaveScreenerBottomSheetViewState.Ready) viewState).getDisplayName() : "", onDisplayNameChanged, ModifiersKt.bentoPlaceholder$default(SizeKt.fillMaxWidth$default(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), 0.0f, 1, null), z3, null, 2, null), null, null, null, null, null, null, null, null, null, null, z7, false, composerStartRestartGroup, i5 & 112, 0, 24568);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.startReplaceGroup(805087018);
            if (z4) {
                SaveScreenerBottomSheetViewState.Ready ready = (SaveScreenerBottomSheetViewState.Ready) viewState;
                if (ready.getSaveError() != null) {
                    Modifier modifierM5125offsetVpY3zN4$default = OffsetKt.m5125offsetVpY3zN4$default(boxScopeInstance.align(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), companion2.getTopStart()), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21591getLargeD9Ej5fM(), 1, null);
                    String errorMessage = ready.getSaveError().getErrorMessage();
                    composerStartRestartGroup.startReplaceGroup(805100167);
                    if (errorMessage == null) {
                        errorMessage = StringResources_androidKt.stringResource(C15652R.string.save_sheet_save_error, composerStartRestartGroup, 0);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    z2 = true;
                    BentoText2.m20747BentoText38GnDrw(errorMessage, modifierM5125offsetVpY3zN4$default, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i4).getJoule()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i4).getTextS(), composerStartRestartGroup, 0, 0, 8184);
                    composerStartRestartGroup = composerStartRestartGroup;
                } else {
                    z2 = true;
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                saveScreenerBottomSheetViewState = viewState;
                onSave = function0;
                onCancel = function02;
                BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1997880423, z2, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equityscreener.crud.save.SaveScreenerComposableKt$SaveScreenerComposable$1$3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i6) {
                        if ((i6 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1997880423, i6, -1, "com.robinhood.android.equityscreener.crud.save.SaveScreenerComposable.<anonymous>.<anonymous> (SaveScreenerComposable.kt:147)");
                        }
                        Modifier modifierM5146paddingqDBjuR0$default2 = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
                        Orientation orientation = Orientation.Horizontal;
                        String strStringResource2 = StringResources_androidKt.stringResource(C15652R.string.save_sheet_save, composer2, 0);
                        SaveScreenerBottomSheetViewState saveScreenerBottomSheetViewState2 = saveScreenerBottomSheetViewState;
                        boolean z8 = (saveScreenerBottomSheetViewState2 instanceof SaveScreenerBottomSheetViewState.Ready) && ((SaveScreenerBottomSheetViewState.Ready) saveScreenerBottomSheetViewState2).isSaving();
                        SaveScreenerBottomSheetViewState saveScreenerBottomSheetViewState3 = saveScreenerBottomSheetViewState;
                        BentoButtonBar2.BentoButtonBar(modifierM5146paddingqDBjuR0$default2, null, null, false, null, orientation, onSave, strStringResource2, z8, null, (saveScreenerBottomSheetViewState3 instanceof SaveScreenerBottomSheetViewState.Ready) && ((SaveScreenerBottomSheetViewState.Ready) saveScreenerBottomSheetViewState3).isSaveEnabled(), onCancel, StringResources_androidKt.stringResource(C15652R.string.go_back, composer2, 0), false, null, false, composer2, 196608, 0, 57886);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final SaveScreenerBottomSheetViewState saveScreenerBottomSheetViewState2 = saveScreenerBottomSheetViewState;
            final Function0<Unit> function03 = onSave;
            final Function0<Unit> function04 = onCancel;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equityscreener.crud.save.SaveScreenerComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SaveScreenerComposable.SaveScreenerComposable$lambda$5(saveScreenerBottomSheetViewState2, onEditEmoji, onDisplayNameChanged, function03, function04, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final long SaveScreenerComposable$lambda$4$lambda$2$lambda$1(SnapshotState4<Color> snapshotState4) {
        return snapshotState4.getValue().getValue();
    }
}
