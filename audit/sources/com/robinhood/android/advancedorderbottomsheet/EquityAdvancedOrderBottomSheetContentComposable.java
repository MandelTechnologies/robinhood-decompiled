package com.robinhood.android.advancedorderbottomsheet;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.SheetState;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.advancedorderbottomsheet.EquityAdvancedOrderBottomSheetState;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.tradinghourvisual.lib.p263ui.OrderTradingSessionVisualizerUtil;
import com.robinhood.android.tradinghourvisual.lib.p263ui.SetTradingHourVisualizerArgs;
import com.robinhood.android.tradinghourvisual.lib.p263ui.SetTradingHoursComposableKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.extensions.StringsKt;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: EquityAdvancedOrderBottomSheetContentComposable.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aE\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"EquityAdvancedOrderBottomSheetContentComposable", "", "state", "Lcom/robinhood/android/advancedorderbottomsheet/EquityAdvancedOrderBottomSheetState;", "editingField", "Lcom/robinhood/android/advancedorderbottomsheet/EditingField;", "callbacks", "Lcom/robinhood/android/advancedorderbottomsheet/EquityAdvancedOrderDropdownEditCallbacks;", "sheetState", "Landroidx/compose/material3/SheetState;", "hideBottomSheet", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/advancedorderbottomsheet/EquityAdvancedOrderBottomSheetState;Lcom/robinhood/android/advancedorderbottomsheet/EditingField;Lcom/robinhood/android/advancedorderbottomsheet/EquityAdvancedOrderDropdownEditCallbacks;Landroidx/compose/material3/SheetState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-advanced-order-bottom-sheet_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advancedorderbottomsheet.EquityAdvancedOrderBottomSheetContentComposableKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class EquityAdvancedOrderBottomSheetContentComposable {

    /* compiled from: EquityAdvancedOrderBottomSheetContentComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.advancedorderbottomsheet.EquityAdvancedOrderBottomSheetContentComposableKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EditingField.values().length];
            try {
                iArr[EditingField.TRADING_SESSION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EditingField.TIME_IN_FORCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EditingField.STRATEGY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EditingField.TRADING_SESSION_SETTINGS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EditingField.NUMBER_OF_FRACTIONAL_SHARES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EditingField.LIMIT_PRICE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EditingField.ACCOUNT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EditingField.SELECT_LOTS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[EditingField.NUMBER_OF_WHOLE_SHARES.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[EditingField.ORDER_TYPE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EquityAdvancedOrderBottomSheetContentComposable$lambda$4(EquityAdvancedOrderBottomSheetState equityAdvancedOrderBottomSheetState, EditingField editingField, EquityAdvancedOrderDropdownEditCallbacks equityAdvancedOrderDropdownEditCallbacks, SheetState sheetState, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        EquityAdvancedOrderBottomSheetContentComposable(equityAdvancedOrderBottomSheetState, editingField, equityAdvancedOrderDropdownEditCallbacks, sheetState, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EquityAdvancedOrderBottomSheetContentComposable(final EquityAdvancedOrderBottomSheetState state, final EditingField editingField, final EquityAdvancedOrderDropdownEditCallbacks equityAdvancedOrderDropdownEditCallbacks, final SheetState sheetState, final Function0<Unit> hideBottomSheet, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Screen.Name name;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        String strNullIfEmpty;
        String str;
        int i4;
        Composer composer2;
        final Modifier modifier3;
        int i5;
        Context context;
        Modifier modifier4;
        String str2;
        Screen screen;
        int i6;
        Context context2;
        String str3;
        int i7;
        Modifier modifierAlign;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        EquityAdvancedOrderDropdownEditCallbacks callbacks = equityAdvancedOrderDropdownEditCallbacks;
        SheetState sheetState2 = sheetState;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(editingField, "editingField");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Intrinsics.checkNotNullParameter(sheetState2, "sheetState");
        Intrinsics.checkNotNullParameter(hideBottomSheet, "hideBottomSheet");
        Composer composerStartRestartGroup = composer.startRestartGroup(1506936745);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(editingField.ordinal()) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(sheetState2) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(hideBottomSheet) ? 16384 : 8192;
        }
        int i8 = i2 & 32;
        if (i8 == 0) {
            if ((196608 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
            if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier5 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1506936745, i3, -1, "com.robinhood.android.advancedorderbottomsheet.EquityAdvancedOrderBottomSheetContentComposable (EquityAdvancedOrderBottomSheetContentComposable.kt:38)");
                }
                Context context3 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                switch (WhenMappings.$EnumSwitchMapping$0[editingField.ordinal()]) {
                    case 1:
                        name = Screen.Name.EQUITY_SET_TRADING_HOURS_PAGE;
                        break;
                    case 2:
                        name = Screen.Name.EQUITY_SET_TIME_IN_FORCE_PAGE;
                        break;
                    case 3:
                        name = Screen.Name.NAME_UNSPECIFIED;
                        break;
                    case 4:
                        name = Screen.Name.NAME_UNSPECIFIED;
                        break;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                        throw new IllegalStateException("Should not use bottom sheet for these fields");
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                Screen screen2 = new Screen(name, null, "LIMIT", null, 10, null);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i9 = BentoTheme.$stable;
                Screen screen3 = screen2;
                Modifier modifierLogScreenTransitions = ModifiersKt.logScreenTransitions(PaddingKt.m5142padding3ABfNKs(modifier5, bentoTheme.getSpacing(composerStartRestartGroup, i9).m21592getMediumD9Ej5fM()), new UserInteractionEventDescriptor(null, screen2, null, null, null, null, 61, null));
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierLogScreenTransitions);
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
                Context context4 = context3;
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                StringResource headerTitle = state.getHeaderTitle();
                Resources resources = context4.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                strNullIfEmpty = StringsKt.nullIfEmpty(headerTitle.getText(resources).toString());
                composerStartRestartGroup.startReplaceGroup(1751292701);
                if (strNullIfEmpty != null) {
                    composer2 = composerStartRestartGroup;
                    str = "getResources(...)";
                    i4 = 0;
                } else {
                    TextStyle displayCapsuleSmall = bentoTheme.getTypography(composerStartRestartGroup, i9).getDisplayCapsuleSmall();
                    long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i9).m21425getFg0d7_KjU();
                    str = "getResources(...)";
                    i4 = 0;
                    BentoText2.m20747BentoText38GnDrw(strNullIfEmpty, PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i9).m21590getDefaultD9Ej5fM(), 7, null), Color.m6701boximpl(jM21425getFg0d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, displayCapsuleSmall, composerStartRestartGroup, 0, 0, 8184);
                    composer2 = composerStartRestartGroup;
                    Unit unit = Unit.INSTANCE;
                }
                composer2.endReplaceGroup();
                composer2.startReplaceGroup(1751306798);
                for (EquityAdvancedOrderBottomSheetState.BottomSheetRowState.BaseRow baseRow : state.getBottomSheetRowStates()) {
                    if (baseRow instanceof EquityAdvancedOrderBottomSheetState.BottomSheetRowState.VisualizerRow) {
                        composer2.startReplaceGroup(615237621);
                        SetTradingHourVisualizerArgs visualizerArgs = ((EquityAdvancedOrderBottomSheetState.BottomSheetRowState.VisualizerRow) baseRow).getVisualizerArgs();
                        int i10 = i4;
                        Composer composer3 = composer2;
                        SetTradingHoursComposableKt.SetTradingHoursComposable(visualizerArgs.getLeftEdgeText(), visualizerArgs.getRightEdgeText(), visualizerArgs.getLeftBoundaryText(), visualizerArgs.getRightBoundaryText(), visualizerArgs.getGetGradientColor().invoke(composer2, Integer.valueOf(i10)), visualizerArgs.getNumPegs(), visualizerArgs.getLeftEdgeInstant(), visualizerArgs.getRightEdgeInstant(), visualizerArgs.getSelectedMarketHoursOpenClose(), TestTag3.testTag(Modifier.INSTANCE, OrderTradingSessionVisualizerUtil.TradeVisualizerTestTag), composer3, 805306368, 0);
                        composer3.endReplaceGroup();
                        i7 = i10;
                        modifier4 = modifier5;
                        composer2 = composer3;
                        str3 = str;
                        screen = screen3;
                        i6 = i3;
                        context2 = context4;
                    } else {
                        String str4 = str;
                        int i11 = i4;
                        Composer composer4 = composer2;
                        if (baseRow instanceof EquityAdvancedOrderBottomSheetState.BottomSheetRowState.BaseDataRow) {
                            composer4.startReplaceGroup(616164521);
                            SheetState sheetState3 = sheetState2;
                            EquityAdvancedOrderDropdownEditCallbacks equityAdvancedOrderDropdownEditCallbacks2 = callbacks;
                            screen = screen3;
                            i6 = i3;
                            i5 = i11;
                            modifier4 = modifier5;
                            str2 = str4;
                            context = context4;
                            EquityAdvancedOrderBottomSheetDataRowComposable.EquityAdvancedOrderBottomSheetDataRowComposable((EquityAdvancedOrderBottomSheetState.BottomSheetRowState.BaseDataRow) baseRow, screen, equityAdvancedOrderDropdownEditCallbacks2, sheetState3, null, composer4, i3 & 8064, 16);
                            composer4.endReplaceGroup();
                        } else {
                            i5 = i11;
                            context = context4;
                            modifier4 = modifier5;
                            str2 = str4;
                            screen = screen3;
                            i6 = i3;
                            if (baseRow instanceof EquityAdvancedOrderBottomSheetState.BottomSheetRowState.SubtitleRow) {
                                composer4.startReplaceGroup(616554563);
                                EquityAdvancedOrderBottomSheetState.BottomSheetRowState.SubtitleRow subtitleRow = (EquityAdvancedOrderBottomSheetState.BottomSheetRowState.SubtitleRow) baseRow;
                                Alignment.Horizontal horizontalAlignment = subtitleRow.getHorizontalAlignment();
                                Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, subtitleRow.getTestTag());
                                if (horizontalAlignment != null && (modifierAlign = column6.align(modifierTestTag, horizontalAlignment)) != null) {
                                    modifierTestTag = modifierAlign;
                                }
                                EquityAdvancedOrderBottomSheetSubtitleRowComposable.EquityAdvancedOrderBottomSheetSubtitleRowComposable(subtitleRow, modifierTestTag, composer4, StringResource.$stable, i5);
                                composer4.endReplaceGroup();
                            } else if (baseRow instanceof EquityAdvancedOrderBottomSheetState.BottomSheetRowState.DisclaimerMarkdownRow) {
                                composer4.startReplaceGroup(617119569);
                                EquityAdvancedOrderBottomSheetState.BottomSheetRowState.DisclaimerMarkdownRow disclaimerMarkdownRow = (EquityAdvancedOrderBottomSheetState.BottomSheetRowState.DisclaimerMarkdownRow) baseRow;
                                StringResource disclaimerMarkdown = disclaimerMarkdownRow.getDisclaimerMarkdown();
                                Resources resources2 = context.getResources();
                                Intrinsics.checkNotNullExpressionValue(resources2, str2);
                                String string2 = disclaimerMarkdown.getText(resources2).toString();
                                context2 = context;
                                BentoMarkdownText bentoMarkdownText = BentoMarkdownText.INSTANCE;
                                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                int i12 = BentoTheme.$stable;
                                TextStyle textS = bentoTheme2.getTypography(composer4, i12).getTextS();
                                long jM21426getFg20d7_KjU = bentoTheme2.getColors(composer4, i12).m21426getFg20d7_KjU();
                                i7 = i5;
                                str3 = str2;
                                BentoMarkdownText2.BentoMarkdownText(string2, TestTag3.testTag(PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, bentoTheme2.getSpacing(composer4, i12).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), disclaimerMarkdownRow.getTestTag()), bentoMarkdownText.m21100withTextStylesYhh7B2I(textS, TextAlign.INSTANCE.m7919getCentere0LSkKk(), jM21426getFg20d7_KjU, 0L, false, composer4, BentoMarkdownText.$stable << 15, 24), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer4, MarkdownStyle.$stable << 6, 24);
                                composer2 = composer4;
                                composer2.endReplaceGroup();
                            } else {
                                composer2 = composer4;
                                context2 = context;
                                str3 = str2;
                                i7 = i5;
                                if (baseRow instanceof EquityAdvancedOrderBottomSheetState.BottomSheetRowState.DisclaimerTextRow) {
                                    composer2.startReplaceGroup(617846550);
                                    EquityAdvancedOrderBottomSheetState.BottomSheetRowState.DisclaimerTextRow disclaimerTextRow = (EquityAdvancedOrderBottomSheetState.BottomSheetRowState.DisclaimerTextRow) baseRow;
                                    StringResource disclaimerText = disclaimerTextRow.getDisclaimerText();
                                    Resources resources3 = context2.getResources();
                                    Intrinsics.checkNotNullExpressionValue(resources3, str3);
                                    String string3 = disclaimerText.getText(resources3).toString();
                                    BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                                    int i13 = BentoTheme.$stable;
                                    BentoText2.m20747BentoText38GnDrw(string3, TestTag3.testTag(PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, bentoTheme3.getSpacing(composer2, i13).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), disclaimerTextRow.getTestTag()), Color.m6701boximpl(bentoTheme3.getColors(composer2, i13).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme3.getTypography(composer2, i13).getTextS(), composer2, 0, 0, 8120);
                                    composer2.endReplaceGroup();
                                } else if (baseRow instanceof EquityAdvancedOrderBottomSheetState.BottomSheetRowState.DoneButtonRow) {
                                    composer2.startReplaceGroup(618444819);
                                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-321806471, true, new EquityAdvancedOrderBottomSheetContentComposable2(baseRow, context2, hideBottomSheet), composer2, 54), composer2, 6);
                                    composer2.endReplaceGroup();
                                } else {
                                    composer2.startReplaceGroup(-1919694154);
                                    composer2.endReplaceGroup();
                                    throw new IllegalStateException(("Unknown row state: " + baseRow).toString());
                                }
                            }
                        }
                        composer2 = composer4;
                        context2 = context;
                        str3 = str2;
                        i7 = i5;
                    }
                    sheetState2 = sheetState;
                    context4 = context2;
                    str = str3;
                    i3 = i6;
                    modifier5 = modifier4;
                    i4 = i7;
                    screen3 = screen;
                    callbacks = equityAdvancedOrderDropdownEditCallbacks;
                }
                Modifier modifier6 = modifier5;
                composer2.endReplaceGroup();
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier6;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advancedorderbottomsheet.EquityAdvancedOrderBottomSheetContentComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return EquityAdvancedOrderBottomSheetContentComposable.EquityAdvancedOrderBottomSheetContentComposable$lambda$4(state, editingField, equityAdvancedOrderDropdownEditCallbacks, sheetState, hideBottomSheet, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 196608;
        modifier2 = modifier;
        if ((74899 & i3) == 74898) {
            if (i8 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Context context32 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            switch (WhenMappings.$EnumSwitchMapping$0[editingField.ordinal()]) {
            }
            Screen screen22 = new Screen(name, null, "LIMIT", null, 10, null);
            BentoTheme bentoTheme4 = BentoTheme.INSTANCE;
            int i92 = BentoTheme.$stable;
            Screen screen32 = screen22;
            Modifier modifierLogScreenTransitions2 = ModifiersKt.logScreenTransitions(PaddingKt.m5142padding3ABfNKs(modifier5, bentoTheme4.getSpacing(composerStartRestartGroup, i92).m21592getMediumD9Ej5fM()), new UserInteractionEventDescriptor(null, screen22, null, null, null, null, 61, null));
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierLogScreenTransitions2);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Context context42 = context32;
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                StringResource headerTitle2 = state.getHeaderTitle();
                Resources resources4 = context42.getResources();
                Intrinsics.checkNotNullExpressionValue(resources4, "getResources(...)");
                strNullIfEmpty = StringsKt.nullIfEmpty(headerTitle2.getText(resources4).toString());
                composerStartRestartGroup.startReplaceGroup(1751292701);
                if (strNullIfEmpty != null) {
                }
                composer2.endReplaceGroup();
                composer2.startReplaceGroup(1751306798);
                while (r31.hasNext()) {
                }
                Modifier modifier62 = modifier5;
                composer2.endReplaceGroup();
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier62;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
