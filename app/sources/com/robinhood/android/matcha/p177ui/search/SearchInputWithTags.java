package com.robinhood.android.matcha.p177ui.search;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.interaction.FocusInteraction3;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.selection.SelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColors2;
import androidx.compose.material.TextKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.SolidColor;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.input.VisualTransformation;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.compose.theme.style.TextInputStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: SearchInputWithTags.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u001am\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0010¨\u0006\u0011²\u0006\n\u0010\u0012\u001a\u00020\u0013X\u008a\u0084\u0002²\u0006\n\u0010\u0014\u001a\u00020\u0015X\u008a\u0084\u0002"}, m3636d2 = {"SearchInputWithTags", "", "profileTags", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/matcha/ui/search/ProfileTag;", "onTagClick", "Lkotlin/Function1;", "", "onTagRemoveClick", "Lkotlin/Function0;", "value", "", "onValueChange", "placeholder", "modifier", "Landroidx/compose/ui/Modifier;", "(Lkotlinx/collections/immutable/ImmutableList;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-p2p_externalDebug", "focused", "", "valueColor", "Landroidx/compose/ui/graphics/Color;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.matcha.ui.search.SearchInputWithTagsKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class SearchInputWithTags {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SearchInputWithTags$lambda$3(ImmutableList immutableList, Function1 function1, Function0 function0, String str, Function1 function12, String str2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SearchInputWithTags(immutableList, function1, function0, str, function12, str2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SearchInputWithTags(final ImmutableList<ProfileTag> profileTags, final Function1<? super Integer, Unit> onTagClick, final Function0<Unit> onTagRemoveClick, final String value, final Function1<? super String, Unit> onValueChange, final String str, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Object objRememberedValue;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(profileTags, "profileTags");
        Intrinsics.checkNotNullParameter(onTagClick, "onTagClick");
        Intrinsics.checkNotNullParameter(onTagRemoveClick, "onTagRemoveClick");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(-139706581);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(profileTags) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onTagClick) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onTagRemoveClick) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(value) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onValueChange) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 131072 : 65536;
        }
        int i4 = i2 & 64;
        if (i4 == 0) {
            if ((1572864 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 1048576 : 524288;
            }
            if ((599187 & i3) == 599186 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-139706581, i3, -1, "com.robinhood.android.matcha.ui.search.SearchInputWithTags (SearchInputWithTags.kt:48)");
                }
                final TextInputStyle.Style standard = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getTextInput(composerStartRestartGroup, 0).getStandard();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = InteractionSource2.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                final InteractionSource3 interactionSource3 = (InteractionSource3) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                final SnapshotState4<Boolean> snapshotState4CollectIsFocusedAsState = FocusInteraction3.collectIsFocusedAsState(interactionSource3, composerStartRestartGroup, 6);
                final TextInputStyle.InputState inputState = !SearchInputWithTags$lambda$1(snapshotState4CollectIsFocusedAsState) ? TextInputStyle.InputState.Focused : TextInputStyle.InputState.Enabled;
                SelectionColors selectionColors = new SelectionColors(standard.getColors().m21993getCursorColor0d7_KjU(), Color.m6705copywmQWz5c$default(standard.getColors().m21993getCursorColor0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), null);
                final SnapshotState4<Color> snapshotState4 = standard.getColors().getValueColor().get(inputState, composerStartRestartGroup, TextInputStyle.StateColor.$stable << 3);
                final Modifier modifier5 = modifier4;
                CompositionLocal3.CompositionLocalProvider(TextSelectionColors2.getLocalTextSelectionColors().provides(selectionColors), ComposableLambda3.rememberComposableLambda(-1792933269, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.matcha.ui.search.SearchInputWithTagsKt.SearchInputWithTags.1
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
                            ComposerKt.traceEventStart(-1792933269, i5, -1, "com.robinhood.android.matcha.ui.search.SearchInputWithTags.<anonymous> (SearchInputWithTags.kt:69)");
                        }
                        String str2 = value;
                        Function1<String, Unit> function1 = onValueChange;
                        Modifier modifier6 = modifier5;
                        TextStyle textStyleM7655copyp1EtxEg$default = TextStyle.m7655copyp1EtxEg$default(standard.getTypography().getValueTextStyle(), SearchInputWithTags.SearchInputWithTags$lambda$2(snapshotState4), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
                        KeyboardOptions keyboardOptions = KeyboardOptions.INSTANCE.getDefault();
                        VisualTransformation none = VisualTransformation.INSTANCE.getNone();
                        InteractionSource3 interactionSource32 = interactionSource3;
                        SolidColor solidColor = new SolidColor(standard.getColors().m21993getCursorColor0d7_KjU(), null);
                        final TextInputStyle.Style style = standard;
                        final TextInputStyle.InputState inputState2 = inputState;
                        final SnapshotState4<Boolean> snapshotState42 = snapshotState4CollectIsFocusedAsState;
                        final SnapshotState4<Color> snapshotState43 = snapshotState4;
                        final String str3 = str;
                        final String str4 = value;
                        final ImmutableList<ProfileTag> immutableList = profileTags;
                        final Function1<Integer, Unit> function12 = onTagClick;
                        final Function0<Unit> function0 = onTagRemoveClick;
                        BasicTextFieldKt.BasicTextField(str2, (Function1<? super String, Unit>) function1, modifier6, true, false, textStyleM7655copyp1EtxEg$default, keyboardOptions, (KeyboardActions) null, false, 0, 0, none, (Function1<? super TextLayoutResult, Unit>) null, interactionSource32, (Brush) solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambda3.rememberComposableLambda(253700686, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: com.robinhood.android.matcha.ui.search.SearchInputWithTagsKt.SearchInputWithTags.1.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer3, Integer num) {
                                invoke((Function2<? super Composer, ? super Integer, Unit>) function2, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Function2<? super Composer, ? super Integer, Unit> innerTextField, Composer composer3, int i6) {
                                int i7;
                                Arrangement arrangement;
                                int i8;
                                Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
                                if ((i6 & 6) == 0) {
                                    i7 = i6 | (composer3.changedInstance(innerTextField) ? 4 : 2);
                                } else {
                                    i7 = i6;
                                }
                                if ((i7 & 19) == 18 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(253700686, i7, -1, "com.robinhood.android.matcha.ui.search.SearchInputWithTags.<anonymous>.<anonymous> (SearchInputWithTags.kt:81)");
                                }
                                Arrangement arrangement2 = Arrangement.INSTANCE;
                                Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement2.m5089spacedBy0680j_4(style.getSpacing().m22021getVerticalSpacingD9Ej5fM());
                                Alignment.Horizontal horizontalAlignment = style.getHorizontalAlignment();
                                TextInputStyle.Style style2 = style;
                                TextInputStyle.InputState inputState3 = inputState2;
                                SnapshotState4<Boolean> snapshotState44 = snapshotState42;
                                SnapshotState4<Color> snapshotState45 = snapshotState43;
                                String str5 = str3;
                                String str6 = str4;
                                ImmutableList<ProfileTag> immutableList2 = immutableList;
                                Function1<Integer, Unit> function13 = function12;
                                Function0<Unit> function02 = function0;
                                Modifier.Companion companion = Modifier.INSTANCE;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, horizontalAlignment, composer3, 0);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, companion);
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                Column6 column6 = Column6.INSTANCE;
                                Alignment.Companion companion3 = Alignment.INSTANCE;
                                Alignment.Vertical centerVertically = companion3.getCenterVertically();
                                Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.m5155defaultMinSizeVpY3zN4$default(Background3.m4871backgroundbw27NRU(BorderKt.m4876borderxT4_qwU(companion, style2.getSizing().getBorderSize().get(SearchInputWithTags.SearchInputWithTags$lambda$1(snapshotState44), composer3, TextInputStyle.BorderSize.$stable << 3).getValue().getValue(), style2.getColors().getBorderColor().get(inputState3, composer3, TextInputStyle.BorderColor.$stable << 3).getValue().getValue(), style2.getSizing().getShape()), style2.getColors().m21992getBackgroundColor0d7_KjU(), style2.getSizing().getShape()), 0.0f, style2.getSizing().m22011getMinHeightD9Ej5fM(), 1, null), style2.getSpacing().getContainerHorizontalPadding().get(true, composer3, (TextInputStyle.HorizontalPadding.$stable << 3) | 6).getValue().getValue(), 0.0f, 2, null);
                                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement2.m5089spacedBy0680j_4(style2.getSpacing().m22018getContainerIconSpacingD9Ej5fM()), centerVertically, composer3, 48);
                                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierM5144paddingVpY3zN4$default);
                                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                                if (composer3.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor2);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
                                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                                Row6 row6 = Row6.INSTANCE;
                                BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.SEARCH_24);
                                String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_action_search, composer3, 0);
                                long jSearchInputWithTags$lambda$2 = SearchInputWithTags.SearchInputWithTags$lambda$2(snapshotState45);
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i9 = BentoTheme.$stable;
                                BentoIcon2.m20644BentoIconFU0evQE(size24, strStringResource, jSearchInputWithTags$lambda$2, row6.align(PaddingKt.m5144paddingVpY3zN4$default(companion, 0.0f, bentoTheme.getSpacing(composer3, i9).m21590getDefaultD9Ej5fM(), 1, null), companion3.getTop()), null, false, composer3, BentoIcon4.Size24.$stable, 48);
                                Composer composer4 = composer3;
                                Modifier modifierM5144paddingVpY3zN4$default2 = PaddingKt.m5144paddingVpY3zN4$default(Row5.weight$default(row6, companion, 1.0f, false, 2, null), 0.0f, style2.getSpacing().m22019getContainerVerticalPaddingD9Ej5fM(), 1, null);
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Intrinsics.areEqual(style2.getHorizontalAlignment(), companion3.getCenterHorizontally()) ? companion3.getCenter() : companion3.getTopStart(), false);
                                int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer4, modifierM5144paddingVpY3zN4$default2);
                                Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
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
                                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                composer4.startReplaceGroup(1390928827);
                                if (str5 == null || StringsKt.isBlank(str5) || str6.length() != 0 || !immutableList2.isEmpty()) {
                                    arrangement = arrangement2;
                                    i8 = i9;
                                } else {
                                    i8 = i9;
                                    arrangement = arrangement2;
                                    TextKt.m5665Text4IGK_g(str5, null, style2.getColors().getPlaceholderColor().get(inputState3, composer4, TextInputStyle.PlaceholderColor.$stable << 3).getValue().getValue(), 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), true, 1, 0, null, style2.getTypography().getValueTextStyle(), composer3, 0, 3504, 51194);
                                    composer4 = composer3;
                                }
                                composer4.endReplaceGroup();
                                FlowLayoutKt.FlowRow(null, arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer4, i8).m21595getXsmallD9Ej5fM()), arrangement.getCenter(), null, 0, 0, ComposableLambda3.rememberComposableLambda(-1408509463, true, new SearchInputWithTags2(immutableList2, innerTextField, function13, function02), composer4, 54), composer4, 1573248, 57);
                                composer3.endNode();
                                composer3.endNode();
                                composer3.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 102239232, 199728, 5776);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.matcha.ui.search.SearchInputWithTagsKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SearchInputWithTags.SearchInputWithTags$lambda$3(profileTags, onTagClick, onTagRemoveClick, value, onValueChange, str, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 1572864;
        modifier2 = modifier;
        if ((599187 & i3) == 599186) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            final TextInputStyle.Style standard2 = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getTextInput(composerStartRestartGroup, 0).getStandard();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            final InteractionSource3 interactionSource32 = (InteractionSource3) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            final SnapshotState4<Boolean> snapshotState4CollectIsFocusedAsState2 = FocusInteraction3.collectIsFocusedAsState(interactionSource32, composerStartRestartGroup, 6);
            final TextInputStyle.InputState inputState2 = !SearchInputWithTags$lambda$1(snapshotState4CollectIsFocusedAsState2) ? TextInputStyle.InputState.Focused : TextInputStyle.InputState.Enabled;
            SelectionColors selectionColors2 = new SelectionColors(standard2.getColors().m21993getCursorColor0d7_KjU(), Color.m6705copywmQWz5c$default(standard2.getColors().m21993getCursorColor0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), null);
            final SnapshotState4<Color> snapshotState42 = standard2.getColors().getValueColor().get(inputState2, composerStartRestartGroup, TextInputStyle.StateColor.$stable << 3);
            final Modifier modifier52 = modifier4;
            CompositionLocal3.CompositionLocalProvider(TextSelectionColors2.getLocalTextSelectionColors().provides(selectionColors2), ComposableLambda3.rememberComposableLambda(-1792933269, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.matcha.ui.search.SearchInputWithTagsKt.SearchInputWithTags.1
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
                        ComposerKt.traceEventStart(-1792933269, i5, -1, "com.robinhood.android.matcha.ui.search.SearchInputWithTags.<anonymous> (SearchInputWithTags.kt:69)");
                    }
                    String str2 = value;
                    Function1<String, Unit> function1 = onValueChange;
                    Modifier modifier6 = modifier52;
                    TextStyle textStyleM7655copyp1EtxEg$default = TextStyle.m7655copyp1EtxEg$default(standard2.getTypography().getValueTextStyle(), SearchInputWithTags.SearchInputWithTags$lambda$2(snapshotState42), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
                    KeyboardOptions keyboardOptions = KeyboardOptions.INSTANCE.getDefault();
                    VisualTransformation none = VisualTransformation.INSTANCE.getNone();
                    InteractionSource3 interactionSource322 = interactionSource32;
                    SolidColor solidColor = new SolidColor(standard2.getColors().m21993getCursorColor0d7_KjU(), null);
                    final TextInputStyle.Style style = standard2;
                    final TextInputStyle.InputState inputState22 = inputState2;
                    final SnapshotState4<Boolean> snapshotState422 = snapshotState4CollectIsFocusedAsState2;
                    final SnapshotState4<Color> snapshotState43 = snapshotState42;
                    final String str3 = str;
                    final String str4 = value;
                    final ImmutableList<ProfileTag> immutableList = profileTags;
                    final Function1<? super Integer, Unit> function12 = onTagClick;
                    final Function0<Unit> function0 = onTagRemoveClick;
                    BasicTextFieldKt.BasicTextField(str2, (Function1<? super String, Unit>) function1, modifier6, true, false, textStyleM7655copyp1EtxEg$default, keyboardOptions, (KeyboardActions) null, false, 0, 0, none, (Function1<? super TextLayoutResult, Unit>) null, interactionSource322, (Brush) solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambda3.rememberComposableLambda(253700686, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: com.robinhood.android.matcha.ui.search.SearchInputWithTagsKt.SearchInputWithTags.1.1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer3, Integer num) {
                            invoke((Function2<? super Composer, ? super Integer, Unit>) function2, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Function2<? super Composer, ? super Integer, Unit> innerTextField, Composer composer3, int i6) {
                            int i7;
                            Arrangement arrangement;
                            int i8;
                            Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
                            if ((i6 & 6) == 0) {
                                i7 = i6 | (composer3.changedInstance(innerTextField) ? 4 : 2);
                            } else {
                                i7 = i6;
                            }
                            if ((i7 & 19) == 18 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(253700686, i7, -1, "com.robinhood.android.matcha.ui.search.SearchInputWithTags.<anonymous>.<anonymous> (SearchInputWithTags.kt:81)");
                            }
                            Arrangement arrangement2 = Arrangement.INSTANCE;
                            Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement2.m5089spacedBy0680j_4(style.getSpacing().m22021getVerticalSpacingD9Ej5fM());
                            Alignment.Horizontal horizontalAlignment = style.getHorizontalAlignment();
                            TextInputStyle.Style style2 = style;
                            TextInputStyle.InputState inputState3 = inputState22;
                            SnapshotState4<Boolean> snapshotState44 = snapshotState422;
                            SnapshotState4<Color> snapshotState45 = snapshotState43;
                            String str5 = str3;
                            String str6 = str4;
                            ImmutableList<ProfileTag> immutableList2 = immutableList;
                            Function1<Integer, Unit> function13 = function12;
                            Function0<Unit> function02 = function0;
                            Modifier.Companion companion = Modifier.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, horizontalAlignment, composer3, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, companion);
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            Alignment.Companion companion3 = Alignment.INSTANCE;
                            Alignment.Vertical centerVertically = companion3.getCenterVertically();
                            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.m5155defaultMinSizeVpY3zN4$default(Background3.m4871backgroundbw27NRU(BorderKt.m4876borderxT4_qwU(companion, style2.getSizing().getBorderSize().get(SearchInputWithTags.SearchInputWithTags$lambda$1(snapshotState44), composer3, TextInputStyle.BorderSize.$stable << 3).getValue().getValue(), style2.getColors().getBorderColor().get(inputState3, composer3, TextInputStyle.BorderColor.$stable << 3).getValue().getValue(), style2.getSizing().getShape()), style2.getColors().m21992getBackgroundColor0d7_KjU(), style2.getSizing().getShape()), 0.0f, style2.getSizing().m22011getMinHeightD9Ej5fM(), 1, null), style2.getSpacing().getContainerHorizontalPadding().get(true, composer3, (TextInputStyle.HorizontalPadding.$stable << 3) | 6).getValue().getValue(), 0.0f, 2, null);
                            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement2.m5089spacedBy0680j_4(style2.getSpacing().m22018getContainerIconSpacingD9Ej5fM()), centerVertically, composer3, 48);
                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierM5144paddingVpY3zN4$default);
                            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                            if (composer3.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor2);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                            Row6 row6 = Row6.INSTANCE;
                            BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.SEARCH_24);
                            String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_action_search, composer3, 0);
                            long jSearchInputWithTags$lambda$2 = SearchInputWithTags.SearchInputWithTags$lambda$2(snapshotState45);
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i9 = BentoTheme.$stable;
                            BentoIcon2.m20644BentoIconFU0evQE(size24, strStringResource, jSearchInputWithTags$lambda$2, row6.align(PaddingKt.m5144paddingVpY3zN4$default(companion, 0.0f, bentoTheme.getSpacing(composer3, i9).m21590getDefaultD9Ej5fM(), 1, null), companion3.getTop()), null, false, composer3, BentoIcon4.Size24.$stable, 48);
                            Composer composer4 = composer3;
                            Modifier modifierM5144paddingVpY3zN4$default2 = PaddingKt.m5144paddingVpY3zN4$default(Row5.weight$default(row6, companion, 1.0f, false, 2, null), 0.0f, style2.getSpacing().m22019getContainerVerticalPaddingD9Ej5fM(), 1, null);
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Intrinsics.areEqual(style2.getHorizontalAlignment(), companion3.getCenterHorizontally()) ? companion3.getCenter() : companion3.getTopStart(), false);
                            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer4, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer4, modifierM5144paddingVpY3zN4$default2);
                            Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
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
                            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            composer4.startReplaceGroup(1390928827);
                            if (str5 == null || StringsKt.isBlank(str5) || str6.length() != 0 || !immutableList2.isEmpty()) {
                                arrangement = arrangement2;
                                i8 = i9;
                            } else {
                                i8 = i9;
                                arrangement = arrangement2;
                                TextKt.m5665Text4IGK_g(str5, null, style2.getColors().getPlaceholderColor().get(inputState3, composer4, TextInputStyle.PlaceholderColor.$stable << 3).getValue().getValue(), 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), true, 1, 0, null, style2.getTypography().getValueTextStyle(), composer3, 0, 3504, 51194);
                                composer4 = composer3;
                            }
                            composer4.endReplaceGroup();
                            FlowLayoutKt.FlowRow(null, arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer4, i8).m21595getXsmallD9Ej5fM()), arrangement.getCenter(), null, 0, 0, ComposableLambda3.rememberComposableLambda(-1408509463, true, new SearchInputWithTags2(immutableList2, innerTextField, function13, function02), composer4, 54), composer4, 1573248, 57);
                            composer3.endNode();
                            composer3.endNode();
                            composer3.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 102239232, 199728, 5776);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean SearchInputWithTags$lambda$1(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long SearchInputWithTags$lambda$2(SnapshotState4<Color> snapshotState4) {
        return snapshotState4.getValue().getValue();
    }
}
