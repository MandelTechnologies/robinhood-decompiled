package com.robinhood.android.redesigninvesting.investingmonitor.p232ui.edit;

import android.content.res.Resources;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.selection.Selectable3;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardActions2;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.focus.FocusRequester;
import androidx.compose.p011ui.focus.FocusRequesterModifier3;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.semantics.Role;
import androidx.compose.p011ui.text.TextRange;
import androidx.compose.p011ui.text.TextRange2;
import androidx.compose.p011ui.text.input.ImeAction;
import androidx.compose.p011ui.text.input.KeyboardCapitalization;
import androidx.compose.p011ui.text.input.TextFieldValue;
import androidx.compose.p011ui.text.style.TextAlign;
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
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet3;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.redesigninvesting.investingmonitor.C26507R;
import com.robinhood.android.redesigninvesting.investingmonitor.model.InvestingMonitorPage;
import com.robinhood.android.redesigninvesting.investingmonitor.p232ui.edit.InvestingMonitorActionsBottomSheetKt;
import com.robinhood.android.redesigninvesting.investingmonitor.p232ui.item.row.InvestingMonitorAssetRowExample;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoRadioButton2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextInput4;
import com.robinhood.compose.bento.component.BentoTextInput8;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoTheme4;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.p320db.CuratedList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* compiled from: InvestingMonitorActionsBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u001aÂ\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00010\n2!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00010\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\n2'\u0010\u0012\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00060\u0013¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00140\nH\u0001¢\u0006\u0002\u0010\u0015\u001a\u001b\u0010\u0016\u001a\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0003¢\u0006\u0002\u0010\u0017\u001ai\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032!\u0010\u0019\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00010\n2!\u0010\u001a\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00010\n2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0003¢\u0006\u0002\u0010\u001b\u001a7\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\n2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0003¢\u0006\u0002\u0010\u001d\u001a[\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00010\b2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0003¢\u0006\u0002\u0010#¨\u0006$²\u0006\n\u0010%\u001a\u00020&X\u008a\u008e\u0002²\u0006\n\u0010'\u001a\u00020(X\u008a\u008e\u0002²\u0006\n\u0010)\u001a\u00020\u000bX\u008a\u008e\u0002²\u0006\n\u0010*\u001a\u00020+X\u008a\u008e\u0002²\u0006\n\u0010,\u001a\u00020-X\u008a\u008e\u0002"}, m3636d2 = {"InvestingMonitorActionsBottomSheet", "", "investingMonitorPage", "Lcom/robinhood/android/redesigninvesting/investingmonitor/model/InvestingMonitorPage;", "tabs", "Lkotlinx/collections/immutable/PersistentList;", "Lcom/robinhood/models/db/CuratedList;", "onDismiss", "Lkotlin/Function0;", "onWatchlistTempRenamed", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "newValue", "onWatchlistRenamed", "onWatchlistRenameCancelled", "onPageDeleteRequested", "onTabsReordered", "", "Lkotlinx/coroutines/Job;", "(Lcom/robinhood/android/redesigninvesting/investingmonitor/model/InvestingMonitorPage;Lkotlinx/collections/immutable/PersistentList;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "DisplayDataBottomSheet", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "RenameBottomSheet", "onNameChanged", "onNewNameConfirmed", "(Lcom/robinhood/android/redesigninvesting/investingmonitor/model/InvestingMonitorPage;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "DeleteConfirmationBottomSheet", "(Lcom/robinhood/android/redesigninvesting/investingmonitor/model/InvestingMonitorPage;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "MainActionsBottomSheet", "onDisplayDataClicked", "onDeleteClicked", "onRenameClicked", "onEditTabsClicked", "(Lcom/robinhood/android/redesigninvesting/investingmonitor/model/InvestingMonitorPage;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "feature-investing-monitor_externalDebug", "displayState", "Lcom/robinhood/android/redesigninvesting/investingmonitor/ui/edit/DisplayAction;", "selectedOption", "Lcom/robinhood/android/redesigninvesting/investingmonitor/ui/edit/DisplayOption;", "editedName", "isError", "", "textFieldValue", "Landroidx/compose/ui/text/input/TextFieldValue;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class InvestingMonitorActionsBottomSheetKt {

    /* compiled from: InvestingMonitorActionsBottomSheet.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DisplayAction.values().length];
            try {
                iArr[DisplayAction.MAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DisplayAction.DISPLAY_DATA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DisplayAction.EDIT_TABS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DisplayAction.RENAME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DisplayAction.DELETE_CONFIRMATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DeleteConfirmationBottomSheet$lambda$34(InvestingMonitorPage investingMonitorPage, Function1 function1, Function0 function0, int i, Composer composer, int i2) {
        DeleteConfirmationBottomSheet(investingMonitorPage, function1, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DisplayDataBottomSheet$lambda$21(Function0 function0, int i, Composer composer, int i2) {
        DisplayDataBottomSheet(function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InvestingMonitorActionsBottomSheet$lambda$17(InvestingMonitorPage investingMonitorPage, ImmutableList3 immutableList3, Function0 function0, Function1 function1, Function1 function12, Function0 function02, Function1 function13, Function1 function14, int i, Composer composer, int i2) {
        InvestingMonitorActionsBottomSheet(investingMonitorPage, immutableList3, function0, function1, function12, function02, function13, function14, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainActionsBottomSheet$lambda$35(InvestingMonitorPage investingMonitorPage, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, int i, Composer composer, int i2) {
        MainActionsBottomSheet(investingMonitorPage, function0, function02, function03, function04, function05, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RenameBottomSheet$lambda$33(InvestingMonitorPage investingMonitorPage, Function1 function1, Function1 function12, Function0 function0, int i, Composer composer, int i2) {
        RenameBottomSheet(investingMonitorPage, function1, function12, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void InvestingMonitorActionsBottomSheet(final InvestingMonitorPage investingMonitorPage, final ImmutableList3<CuratedList> tabs, final Function0<Unit> onDismiss, final Function1<? super String, Unit> onWatchlistTempRenamed, final Function1<? super String, Unit> onWatchlistRenamed, final Function0<Unit> onWatchlistRenameCancelled, final Function1<? super InvestingMonitorPage, Unit> onPageDeleteRequested, final Function1<? super List<CuratedList>, ? extends Job> onTabsReordered, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(investingMonitorPage, "investingMonitorPage");
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(onWatchlistTempRenamed, "onWatchlistTempRenamed");
        Intrinsics.checkNotNullParameter(onWatchlistRenamed, "onWatchlistRenamed");
        Intrinsics.checkNotNullParameter(onWatchlistRenameCancelled, "onWatchlistRenameCancelled");
        Intrinsics.checkNotNullParameter(onPageDeleteRequested, "onPageDeleteRequested");
        Intrinsics.checkNotNullParameter(onTabsReordered, "onTabsReordered");
        Composer composerStartRestartGroup = composer.startRestartGroup(2069002314);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(investingMonitorPage) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(tabs) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onDismiss) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onWatchlistTempRenamed) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onWatchlistRenamed) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onWatchlistRenameCancelled) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onPageDeleteRequested) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onTabsReordered) ? 8388608 : 4194304;
        }
        if ((4793491 & i2) == 4793490 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2069002314, i2, -1, "com.robinhood.android.redesigninvesting.investingmonitor.ui.edit.InvestingMonitorActionsBottomSheet (InvestingMonitorActionsBottomSheet.kt:72)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(DisplayAction.MAIN, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            int i3 = WhenMappings.$EnumSwitchMapping$0[InvestingMonitorActionsBottomSheet$lambda$1(snapshotState).ordinal()];
            if (i3 == 1) {
                composerStartRestartGroup.startReplaceGroup(572859798);
                composerStartRestartGroup.startReplaceGroup(5004770);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.edit.InvestingMonitorActionsBottomSheetKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return InvestingMonitorActionsBottomSheetKt.InvestingMonitorActionsBottomSheet$lambda$4$lambda$3(snapshotState);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                Function0 function0 = (Function0) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(5004770);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.edit.InvestingMonitorActionsBottomSheetKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return InvestingMonitorActionsBottomSheetKt.InvestingMonitorActionsBottomSheet$lambda$6$lambda$5(snapshotState);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                Function0 function02 = (Function0) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(5004770);
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new Function0() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.edit.InvestingMonitorActionsBottomSheetKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return InvestingMonitorActionsBottomSheetKt.InvestingMonitorActionsBottomSheet$lambda$8$lambda$7(snapshotState);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                Function0 function03 = (Function0) objRememberedValue4;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(5004770);
                Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = new Function0() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.edit.InvestingMonitorActionsBottomSheetKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return InvestingMonitorActionsBottomSheetKt.InvestingMonitorActionsBottomSheet$lambda$10$lambda$9(snapshotState);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceGroup();
                MainActionsBottomSheet(investingMonitorPage, onDismiss, function0, function02, function03, (Function0) objRememberedValue5, composerStartRestartGroup, (i2 & 14) | 224640 | ((i2 >> 3) & 112));
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            } else if (i3 == 2) {
                composerStartRestartGroup.startReplaceGroup(573489160);
                composerStartRestartGroup.startReplaceGroup(5004770);
                Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue6 == companion.getEmpty()) {
                    objRememberedValue6 = new Function0() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.edit.InvestingMonitorActionsBottomSheetKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return InvestingMonitorActionsBottomSheetKt.InvestingMonitorActionsBottomSheet$lambda$12$lambda$11(snapshotState);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceGroup();
                DisplayDataBottomSheet((Function0) objRememberedValue6, composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceGroup();
            } else if (i3 == 3) {
                composerStartRestartGroup.startReplaceGroup(573639479);
                InvestingMonitorEditTabsBottomSheet3.InvestingMonitorEditTabsBottomSheet(tabs, onTabsReordered, onDismiss, null, composerStartRestartGroup, ((i2 >> 3) & 14) | ((i2 >> 18) & 112) | (i2 & 896), 8);
                composerStartRestartGroup.endReplaceGroup();
            } else if (i3 == 4) {
                composerStartRestartGroup.startReplaceGroup(573871049);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean z = (458752 & i2) == 131072;
                Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue7 == companion.getEmpty()) {
                    objRememberedValue7 = new Function0() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.edit.InvestingMonitorActionsBottomSheetKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return InvestingMonitorActionsBottomSheetKt.InvestingMonitorActionsBottomSheet$lambda$14$lambda$13(onWatchlistRenameCancelled, snapshotState);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                composerStartRestartGroup.endReplaceGroup();
                int i4 = i2 & 14;
                int i5 = i2 >> 6;
                RenameBottomSheet(investingMonitorPage, onWatchlistTempRenamed, onWatchlistRenamed, (Function0) objRememberedValue7, composerStartRestartGroup, (i5 & 896) | i4 | (i5 & 112));
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (i3 != 5) {
                    composerStartRestartGroup.startReplaceGroup(-258615896);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(574306196);
                composerStartRestartGroup.startReplaceGroup(5004770);
                Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue8 == companion.getEmpty()) {
                    objRememberedValue8 = new Function0() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.edit.InvestingMonitorActionsBottomSheetKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return InvestingMonitorActionsBottomSheetKt.InvestingMonitorActionsBottomSheet$lambda$16$lambda$15(snapshotState);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                composerStartRestartGroup.endReplaceGroup();
                DeleteConfirmationBottomSheet(investingMonitorPage, onPageDeleteRequested, (Function0) objRememberedValue8, composerStartRestartGroup, (i2 & 14) | 384 | ((i2 >> 15) & 112));
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.edit.InvestingMonitorActionsBottomSheetKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InvestingMonitorActionsBottomSheetKt.InvestingMonitorActionsBottomSheet$lambda$17(investingMonitorPage, tabs, onDismiss, onWatchlistTempRenamed, onWatchlistRenamed, onWatchlistRenameCancelled, onPageDeleteRequested, onTabsReordered, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InvestingMonitorActionsBottomSheet$lambda$4$lambda$3(SnapshotState snapshotState) {
        snapshotState.setValue(DisplayAction.DISPLAY_DATA);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InvestingMonitorActionsBottomSheet$lambda$8$lambda$7(SnapshotState snapshotState) {
        snapshotState.setValue(DisplayAction.RENAME);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisplayOption DisplayDataBottomSheet$lambda$19(SnapshotState<DisplayOption> snapshotState) {
        return snapshotState.getValue();
    }

    private static final DisplayAction InvestingMonitorActionsBottomSheet$lambda$1(SnapshotState<DisplayAction> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String RenameBottomSheet$lambda$23(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean RenameBottomSheet$lambda$27(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldValue RenameBottomSheet$lambda$30(SnapshotState<TextFieldValue> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InvestingMonitorActionsBottomSheet$lambda$10$lambda$9(SnapshotState snapshotState) {
        snapshotState.setValue(DisplayAction.EDIT_TABS);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InvestingMonitorActionsBottomSheet$lambda$6$lambda$5(SnapshotState snapshotState) {
        snapshotState.setValue(DisplayAction.DELETE_CONFIRMATION);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InvestingMonitorActionsBottomSheet$lambda$12$lambda$11(SnapshotState snapshotState) {
        snapshotState.setValue(DisplayAction.MAIN);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DisplayDataBottomSheet$lambda$20(SnapshotState<DisplayOption> snapshotState, DisplayOption displayOption) {
        snapshotState.setValue(displayOption);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RenameBottomSheet$lambda$24(SnapshotState<String> snapshotState, String str) {
        snapshotState.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RenameBottomSheet$lambda$31(SnapshotState<TextFieldValue> snapshotState, TextFieldValue textFieldValue) {
        snapshotState.setValue(textFieldValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InvestingMonitorActionsBottomSheet$lambda$14$lambda$13(Function0 function0, SnapshotState snapshotState) {
        snapshotState.setValue(DisplayAction.MAIN);
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InvestingMonitorActionsBottomSheet$lambda$16$lambda$15(SnapshotState snapshotState) {
        snapshotState.setValue(DisplayAction.MAIN);
        return Unit.INSTANCE;
    }

    private static final void DisplayDataBottomSheet(final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        final Function0<Unit> function02;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1241430689);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1241430689, i2, -1, "com.robinhood.android.redesigninvesting.investingmonitor.ui.edit.DisplayDataBottomSheet (InvestingMonitorActionsBottomSheet.kt:141)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(DisplayOption.CHART_1D, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            function02 = function0;
            RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI(function02, null, false, null, null, 0L, ComposableLambda3.rememberComposableLambda(1617038584, true, new Function3<RhModalBottomSheet5, Composer, Integer, Unit>() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.edit.InvestingMonitorActionsBottomSheetKt.DisplayDataBottomSheet.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer2, Integer num) {
                    invoke(rhModalBottomSheet5, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(RhModalBottomSheet5 RhModalBottomSheet, Composer composer2, int i3) {
                    Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
                    if ((i3 & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1617038584, i3, -1, "com.robinhood.android.redesigninvesting.investingmonitor.ui.edit.DisplayDataBottomSheet.<anonymous> (InvestingMonitorActionsBottomSheet.kt:148)");
                    }
                    final Function0<Unit> function03 = function0;
                    final SnapshotState<DisplayOption> snapshotState2 = snapshotState;
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-711550397, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.edit.InvestingMonitorActionsBottomSheetKt.DisplayDataBottomSheet.1.1

                        /* compiled from: InvestingMonitorActionsBottomSheet.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.redesigninvesting.investingmonitor.ui.edit.InvestingMonitorActionsBottomSheetKt$DisplayDataBottomSheet$1$1$2, reason: invalid class name */
                        static final class AnonymousClass2 implements Function3<PaddingValues, Composer, Integer, Unit> {
                            final /* synthetic */ SnapshotState<DisplayOption> $selectedOption$delegate;

                            AnonymousClass2(SnapshotState<DisplayOption> snapshotState) {
                                this.$selectedOption$delegate = snapshotState;
                            }

                            public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
                                int i2;
                                final SnapshotState<DisplayOption> snapshotState;
                                final SnapshotState<DisplayOption> snapshotState2;
                                Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                if ((i & 6) == 0) {
                                    i2 = i | (composer.changed(paddingValues) ? 4 : 2);
                                } else {
                                    i2 = i;
                                }
                                if ((i2 & 19) == 18 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1907491154, i2, -1, "com.robinhood.android.redesigninvesting.investingmonitor.ui.edit.DisplayDataBottomSheet.<anonymous>.<anonymous>.<anonymous> (InvestingMonitorActionsBottomSheet.kt:169)");
                                }
                                Modifier.Companion companion = Modifier.INSTANCE;
                                Modifier modifierPadding = PaddingKt.padding(companion, paddingValues);
                                SnapshotState<DisplayOption> snapshotState3 = this.$selectedOption$delegate;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierPadding);
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                if (composer.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer.startReusableNode();
                                if (composer.getInserting()) {
                                    composer.createNode(constructor);
                                } else {
                                    composer.useNode();
                                }
                                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                Column6 column6 = Column6.INSTANCE;
                                InvestingMonitorAssetRowExample.InvestingMonitorAssetRowExample(null, composer, 0, 1);
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i3 = BentoTheme.$stable;
                                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i3).m21594getXlargeD9Ej5fM()), composer, 0);
                                BentoText2.m20747BentoText38GnDrw("Middle column", PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM(), 0.0f, 2, null), Color.m6701boximpl(bentoTheme.getColors(composer, i3).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i3).getTextS(), composer, 6, 0, 8184);
                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                                boolean z = InvestingMonitorActionsBottomSheetKt.DisplayDataBottomSheet$lambda$19(snapshotState3) == DisplayOption.CHART_1D;
                                Role.Companion companion3 = Role.INSTANCE;
                                Role roleM7472boximpl = Role.m7472boximpl(companion3.m7484getRadioButtono7Vup1c());
                                composer.startReplaceGroup(5004770);
                                Object objRememberedValue = composer.rememberedValue();
                                Composer.Companion companion4 = Composer.INSTANCE;
                                if (objRememberedValue == companion4.getEmpty()) {
                                    snapshotState = snapshotState3;
                                    objRememberedValue = new Function0() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.edit.InvestingMonitorActionsBottomSheetKt$DisplayDataBottomSheet$1$1$2$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return InvestingMonitorActionsBottomSheetKt.C265361.AnonymousClass1.AnonymousClass2.invoke$lambda$6$lambda$1$lambda$0(snapshotState);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                } else {
                                    snapshotState = snapshotState3;
                                }
                                composer.endReplaceGroup();
                                Modifier modifierM5316selectableXHw0xAI$default = Selectable3.m5316selectableXHw0xAI$default(modifierFillMaxWidth$default, z, false, roleM7472boximpl, (Function0) objRememberedValue, 2, null);
                                ComposableSingletons$InvestingMonitorActionsBottomSheetKt composableSingletons$InvestingMonitorActionsBottomSheetKt = ComposableSingletons$InvestingMonitorActionsBottomSheetKt.INSTANCE;
                                SnapshotState<DisplayOption> snapshotState4 = snapshotState;
                                BentoBaseRowLayout.BentoBaseRowLayout(modifierM5316selectableXHw0xAI$default, null, composableSingletons$InvestingMonitorActionsBottomSheetKt.m17981getLambda$450359328$feature_investing_monitor_externalDebug(), composableSingletons$InvestingMonitorActionsBottomSheetKt.m17977getLambda$1696267265$feature_investing_monitor_externalDebug(), null, null, ComposableLambda3.rememberComposableLambda(-1139023780, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.edit.InvestingMonitorActionsBottomSheetKt$DisplayDataBottomSheet$1$1$2$1$2
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i4) {
                                        if ((i4 & 3) == 2 && composer2.getSkipping()) {
                                            composer2.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1139023780, i4, -1, "com.robinhood.android.redesigninvesting.investingmonitor.ui.edit.DisplayDataBottomSheet.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InvestingMonitorActionsBottomSheet.kt:199)");
                                        }
                                        BentoRadioButton2.BentoRadioButton(InvestingMonitorActionsBottomSheetKt.DisplayDataBottomSheet$lambda$19(snapshotState) == DisplayOption.CHART_1D, null, false, composer2, 0, 6);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer, 54), false, false, false, null, composer, 1576320, 0, 1970);
                                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                                boolean z2 = InvestingMonitorActionsBottomSheetKt.DisplayDataBottomSheet$lambda$19(snapshotState4) == DisplayOption.MARKET_CAP;
                                Role roleM7472boximpl2 = Role.m7472boximpl(companion3.m7484getRadioButtono7Vup1c());
                                composer.startReplaceGroup(5004770);
                                Object objRememberedValue2 = composer.rememberedValue();
                                if (objRememberedValue2 == companion4.getEmpty()) {
                                    snapshotState2 = snapshotState4;
                                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.edit.InvestingMonitorActionsBottomSheetKt$DisplayDataBottomSheet$1$1$2$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return InvestingMonitorActionsBottomSheetKt.C265361.AnonymousClass1.AnonymousClass2.invoke$lambda$6$lambda$3$lambda$2(snapshotState2);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue2);
                                } else {
                                    snapshotState2 = snapshotState4;
                                }
                                composer.endReplaceGroup();
                                final SnapshotState<DisplayOption> snapshotState5 = snapshotState2;
                                BentoBaseRowLayout.BentoBaseRowLayout(Selectable3.m5316selectableXHw0xAI$default(modifierFillMaxWidth$default2, z2, false, roleM7472boximpl2, (Function0) objRememberedValue2, 2, null), null, composableSingletons$InvestingMonitorActionsBottomSheetKt.m17976getLambda$1304906423$feature_investing_monitor_externalDebug(), composableSingletons$InvestingMonitorActionsBottomSheetKt.m17980getLambda$326558296$feature_investing_monitor_externalDebug(), null, null, ComposableLambda3.rememberComposableLambda(-1686481211, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.edit.InvestingMonitorActionsBottomSheetKt$DisplayDataBottomSheet$1$1$2$1$4
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i4) {
                                        if ((i4 & 3) == 2 && composer2.getSkipping()) {
                                            composer2.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1686481211, i4, -1, "com.robinhood.android.redesigninvesting.investingmonitor.ui.edit.DisplayDataBottomSheet.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InvestingMonitorActionsBottomSheet.kt:217)");
                                        }
                                        BentoRadioButton2.BentoRadioButton(InvestingMonitorActionsBottomSheetKt.DisplayDataBottomSheet$lambda$19(snapshotState2) == DisplayOption.MARKET_CAP, null, false, composer2, 0, 6);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer, 54), false, false, false, null, composer, 1576320, 0, 1970);
                                Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                                Role roleM7472boximpl3 = Role.m7472boximpl(companion3.m7484getRadioButtono7Vup1c());
                                composer.startReplaceGroup(1849434622);
                                Object objRememberedValue3 = composer.rememberedValue();
                                if (objRememberedValue3 == companion4.getEmpty()) {
                                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.edit.InvestingMonitorActionsBottomSheetKt$DisplayDataBottomSheet$1$1$2$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue3);
                                }
                                composer.endReplaceGroup();
                                BentoBaseRowLayout.BentoBaseRowLayout(Selectable3.m5316selectableXHw0xAI$default(modifierFillMaxWidth$default3, false, false, roleM7472boximpl3, (Function0) objRememberedValue3, 2, null), null, composableSingletons$InvestingMonitorActionsBottomSheetKt.m17979getLambda$2018552216$feature_investing_monitor_externalDebug(), composableSingletons$InvestingMonitorActionsBottomSheetKt.m17975getLambda$1040204089$feature_investing_monitor_externalDebug(), null, null, ComposableLambda3.rememberComposableLambda(1894840292, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.edit.InvestingMonitorActionsBottomSheetKt$DisplayDataBottomSheet$1$1$2$1$6
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i4) {
                                        if ((i4 & 3) == 2 && composer2.getSkipping()) {
                                            composer2.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1894840292, i4, -1, "com.robinhood.android.redesigninvesting.investingmonitor.ui.edit.DisplayDataBottomSheet.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InvestingMonitorActionsBottomSheet.kt:235)");
                                        }
                                        BentoRadioButton2.BentoRadioButton(InvestingMonitorActionsBottomSheetKt.DisplayDataBottomSheet$lambda$19(snapshotState5) == DisplayOption.VOLUME, null, false, composer2, 0, 6);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer, 54), false, false, false, null, composer, 1576320, 0, 1970);
                                composer.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
                                invoke(paddingValues, composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$6$lambda$1$lambda$0(SnapshotState snapshotState) {
                                InvestingMonitorActionsBottomSheetKt.DisplayDataBottomSheet$lambda$20(snapshotState, DisplayOption.CHART_1D);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$6$lambda$3$lambda$2(SnapshotState snapshotState) {
                                InvestingMonitorActionsBottomSheetKt.DisplayDataBottomSheet$lambda$20(snapshotState, DisplayOption.MARKET_CAP);
                                return Unit.INSTANCE;
                            }
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i4) {
                            if ((i4 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-711550397, i4, -1, "com.robinhood.android.redesigninvesting.investingmonitor.ui.edit.DisplayDataBottomSheet.<anonymous>.<anonymous> (InvestingMonitorActionsBottomSheet.kt:149)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i5 = BentoTheme.$stable;
                            long jM21371getBg0d7_KjU = bentoTheme.getColors(composer3, i5).m21371getBg0d7_KjU();
                            long jM21425getFg0d7_KjU = bentoTheme.getColors(composer3, i5).m21425getFg0d7_KjU();
                            final Function0<Unit> function04 = function03;
                            ScaffoldKt.m5939ScaffoldTvnljyQ(companion, ComposableLambda3.rememberComposableLambda(1303748871, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.edit.InvestingMonitorActionsBottomSheetKt.DisplayDataBottomSheet.1.1.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i6) {
                                    if ((i6 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1303748871, i6, -1, "com.robinhood.android.redesigninvesting.investingmonitor.ui.edit.DisplayDataBottomSheet.<anonymous>.<anonymous>.<anonymous> (InvestingMonitorActionsBottomSheet.kt:154)");
                                    }
                                    Function2<Composer, Integer, Unit> function2M17978getLambda$1721948940$feature_investing_monitor_externalDebug = ComposableSingletons$InvestingMonitorActionsBottomSheetKt.INSTANCE.m17978getLambda$1721948940$feature_investing_monitor_externalDebug();
                                    final Function0<Unit> function05 = function04;
                                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M17978getLambda$1721948940$feature_investing_monitor_externalDebug, null, ComposableLambda3.rememberComposableLambda(-640609208, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.edit.InvestingMonitorActionsBottomSheetKt.DisplayDataBottomSheet.1.1.1.1
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer5, Integer num) {
                                            invoke(bentoAppBarScope, composer5, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer5, int i7) {
                                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                            if ((i7 & 6) == 0) {
                                                i7 |= (i7 & 8) == 0 ? composer5.changed(BentoAppBar) : composer5.changedInstance(BentoAppBar) ? 4 : 2;
                                            }
                                            if ((i7 & 19) == 18 && composer5.getSkipping()) {
                                                composer5.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-640609208, i7, -1, "com.robinhood.android.redesigninvesting.investingmonitor.ui.edit.DisplayDataBottomSheet.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InvestingMonitorActionsBottomSheet.kt:162)");
                                            }
                                            BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, function05, composer5, (BentoAppBarScope.$stable << 12) | ((i7 << 12) & 57344), 7);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer4, 54), null, null, false, false, null, null, 0L, null, composer4, 390, 0, 2042);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), null, null, null, 0, jM21371getBg0d7_KjU, jM21425getFg0d7_KjU, null, ComposableLambda3.rememberComposableLambda(1907491154, true, new AnonymousClass2(snapshotState2), composer3, 54), composer3, 805306422, 316);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i2 & 14) | 1572864, 62);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            function02 = function0;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.edit.InvestingMonitorActionsBottomSheetKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InvestingMonitorActionsBottomSheetKt.DisplayDataBottomSheet$lambda$21(function02, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void RenameBottomSheet(InvestingMonitorPage investingMonitorPage, final Function1<? super String, Unit> function1, final Function1<? super String, Unit> function12, final Function0<Unit> function0, Composer composer, final int i) {
        final InvestingMonitorPage investingMonitorPage2;
        int i2;
        Function0<Unit> function02;
        Composer composerStartRestartGroup = composer.startRestartGroup(1548647203);
        if ((i & 6) == 0) {
            investingMonitorPage2 = investingMonitorPage;
            i2 = (composerStartRestartGroup.changedInstance(investingMonitorPage2) ? 4 : 2) | i;
        } else {
            investingMonitorPage2 = investingMonitorPage;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function12) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            function02 = function0;
            i2 |= composerStartRestartGroup.changedInstance(function02) ? 2048 : 1024;
        } else {
            function02 = function0;
        }
        if ((i2 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1548647203, i2, -1, "com.robinhood.android.redesigninvesting.investingmonitor.ui.edit.RenameBottomSheet (InvestingMonitorActionsBottomSheet.kt:250)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(investingMonitorPage2.getTabTitle(), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new FocusRequester();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final FocusRequester focusRequester = (FocusRequester) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = SnapshotState3.mutableStateOf$default(new TextFieldValue(RenameBottomSheet$lambda$23(snapshotState), TextRange2.TextRange(RenameBottomSheet$lambda$23(snapshotState).length()), (TextRange) null, 4, (DefaultConstructorMarker) null), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            final SnapshotState snapshotState3 = (SnapshotState) objRememberedValue4;
            composerStartRestartGroup.endReplaceGroup();
            Unit unit = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(5004770);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new InvestingMonitorActionsBottomSheetKt$RenameBottomSheet$1$1(focusRequester, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, 6);
            RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI(function02, null, false, null, null, 0L, ComposableLambda3.rememberComposableLambda(-1956304324, true, new Function3<RhModalBottomSheet5, Composer, Integer, Unit>() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.edit.InvestingMonitorActionsBottomSheetKt.RenameBottomSheet.2

                /* compiled from: InvestingMonitorActionsBottomSheet.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.redesigninvesting.investingmonitor.ui.edit.InvestingMonitorActionsBottomSheetKt$RenameBottomSheet$2$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ SnapshotState<String> $editedName$delegate;
                    final /* synthetic */ FocusRequester $focusRequester;
                    final /* synthetic */ SnapshotState<Boolean> $isError$delegate;
                    final /* synthetic */ Function1<String, Unit> $onNameChanged;
                    final /* synthetic */ Function1<String, Unit> $onNewNameConfirmed;
                    final /* synthetic */ SnapshotState<TextFieldValue> $textFieldValue$delegate;

                    /* JADX WARN: Multi-variable type inference failed */
                    AnonymousClass1(FocusRequester focusRequester, Function1<? super String, Unit> function1, Function1<? super String, Unit> function12, SnapshotState<TextFieldValue> snapshotState, SnapshotState<String> snapshotState2, SnapshotState<Boolean> snapshotState3) {
                        this.$focusRequester = focusRequester;
                        this.$onNewNameConfirmed = function1;
                        this.$onNameChanged = function12;
                        this.$textFieldValue$delegate = snapshotState;
                        this.$editedName$delegate = snapshotState2;
                        this.$isError$delegate = snapshotState3;
                    }

                    public final void invoke(Composer composer, int i) {
                        if ((i & 3) == 2 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1472057849, i, -1, "com.robinhood.android.redesigninvesting.investingmonitor.ui.edit.RenameBottomSheet.<anonymous>.<anonymous> (InvestingMonitorActionsBottomSheet.kt:266)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i2 = BentoTheme.$stable;
                        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 8, null);
                        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                        FocusRequester focusRequester = this.$focusRequester;
                        final Function1<String, Unit> function1 = this.$onNewNameConfirmed;
                        final Function1<String, Unit> function12 = this.$onNameChanged;
                        final SnapshotState<TextFieldValue> snapshotState = this.$textFieldValue$delegate;
                        final SnapshotState<String> snapshotState2 = this.$editedName$delegate;
                        final SnapshotState<Boolean> snapshotState3 = this.$isError$delegate;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer, 48);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5146paddingqDBjuR0$default);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        if (composer.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer.startReusableNode();
                        if (composer.getInserting()) {
                            composer.createNode(constructor);
                        } else {
                            composer.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        InvestingMonitorActionsBottomSheetTitle.Title(StringResources_androidKt.stringResource(C26507R.string.investing_monitor_rename_title, composer, 0), PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 7, null), composer, 0, 0);
                        Modifier modifierFocusRequester = FocusRequesterModifier3.focusRequester(companion, focusRequester);
                        String text = InvestingMonitorActionsBottomSheetKt.RenameBottomSheet$lambda$30(snapshotState).getText();
                        KeyboardOptions keyboardOptionsM5353copyINvB4aQ$default = KeyboardOptions.m5353copyINvB4aQ$default(KeyboardOptions.INSTANCE.getDefault(), KeyboardCapitalization.INSTANCE.m7770getWordsIUNYP9k(), null, 0, InvestingMonitorActionsBottomSheetKt.RenameBottomSheet$lambda$23(snapshotState2).length() > 67 ? ImeAction.INSTANCE.m7750getNoneeUduSuo() : ImeAction.INSTANCE.m7747getDoneeUduSuo(), null, null, null, 118, null);
                        composer.startReplaceGroup(-1746271574);
                        boolean zChanged = composer.changed(function1);
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.edit.InvestingMonitorActionsBottomSheetKt$RenameBottomSheet$2$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return InvestingMonitorActionsBottomSheetKt.C265412.AnonymousClass1.invoke$lambda$6$lambda$1$lambda$0(function1, snapshotState3, snapshotState2, (KeyboardActions2) obj);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        KeyboardActions keyboardActions = new KeyboardActions((Function1) objRememberedValue, null, null, null, null, null, 62, null);
                        composer.startReplaceGroup(2055916331);
                        BentoTextInput8.Message.Error error = InvestingMonitorActionsBottomSheetKt.RenameBottomSheet$lambda$27(snapshotState3) ? new BentoTextInput8.Message.Error(StringResources_androidKt.stringResource(C26507R.string.investing_monitor_watchlist_name_too_long, composer, 0)) : null;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(-1224400529);
                        boolean zChanged2 = composer.changed(function12);
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.edit.InvestingMonitorActionsBottomSheetKt$RenameBottomSheet$2$1$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return InvestingMonitorActionsBottomSheetKt.C265412.AnonymousClass1.invoke$lambda$6$lambda$3$lambda$2(function12, snapshotState2, snapshotState3, snapshotState, (String) obj);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        composer.endReplaceGroup();
                        BentoTextInput4.BentoTextInput(text, (Function1) objRememberedValue2, modifierFocusRequester, null, null, null, error, null, null, null, keyboardOptionsM5353copyINvB4aQ$default, keyboardActions, null, false, false, composer, BentoTextInput8.Message.Error.$stable << 18, 0, 29624);
                        Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                        boolean z = !InvestingMonitorActionsBottomSheetKt.RenameBottomSheet$lambda$27(snapshotState3);
                        String strStringResource = StringResources_androidKt.stringResource(C26507R.string.investing_monitor_save, composer, 0);
                        composer.startReplaceGroup(-1633490746);
                        boolean zChanged3 = composer.changed(function1);
                        Object objRememberedValue3 = composer.rememberedValue();
                        if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function0() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.edit.InvestingMonitorActionsBottomSheetKt$RenameBottomSheet$2$1$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return InvestingMonitorActionsBottomSheetKt.C265412.AnonymousClass1.invoke$lambda$6$lambda$5$lambda$4(function1, snapshotState2);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue3);
                        }
                        composer.endReplaceGroup();
                        BentoButtonBar2.BentoButtonBar(modifierM5144paddingVpY3zN4$default, null, null, false, null, null, (Function0) objRememberedValue3, strStringResource, false, null, z, null, null, false, null, false, composer, 0, 0, 64318);
                        composer.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$6$lambda$3$lambda$2(Function1 function1, SnapshotState snapshotState, SnapshotState snapshotState2, SnapshotState snapshotState3, String newValue) {
                        Intrinsics.checkNotNullParameter(newValue, "newValue");
                        InvestingMonitorActionsBottomSheetKt.RenameBottomSheet$lambda$24(snapshotState, newValue);
                        InvestingMonitorActionsBottomSheetKt.RenameBottomSheet$lambda$28(snapshotState2, newValue.length() > 67);
                        InvestingMonitorActionsBottomSheetKt.RenameBottomSheet$lambda$31(snapshotState3, new TextFieldValue(newValue, TextRange2.TextRange(newValue.length()), (TextRange) null, 4, (DefaultConstructorMarker) null));
                        function1.invoke(newValue);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$6$lambda$1$lambda$0(Function1 function1, SnapshotState snapshotState, SnapshotState snapshotState2, KeyboardActions2 KeyboardActions) {
                        Intrinsics.checkNotNullParameter(KeyboardActions, "$this$KeyboardActions");
                        if (!InvestingMonitorActionsBottomSheetKt.RenameBottomSheet$lambda$27(snapshotState)) {
                            function1.invoke(InvestingMonitorActionsBottomSheetKt.RenameBottomSheet$lambda$23(snapshotState2));
                        }
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$6$lambda$5$lambda$4(Function1 function1, SnapshotState snapshotState) {
                        function1.invoke(InvestingMonitorActionsBottomSheetKt.RenameBottomSheet$lambda$23(snapshotState));
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer2, Integer num) {
                    invoke(rhModalBottomSheet5, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(RhModalBottomSheet5 RhModalBottomSheet, Composer composer2, int i3) {
                    Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
                    if ((i3 & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1956304324, i3, -1, "com.robinhood.android.redesigninvesting.investingmonitor.ui.edit.RenameBottomSheet.<anonymous> (InvestingMonitorActionsBottomSheet.kt:265)");
                    }
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1472057849, true, new AnonymousClass1(focusRequester, function12, function1, snapshotState3, snapshotState, snapshotState2), composer2, 54), composer2, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i2 >> 9) & 14) | 1572864, 62);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.edit.InvestingMonitorActionsBottomSheetKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InvestingMonitorActionsBottomSheetKt.RenameBottomSheet$lambda$33(investingMonitorPage2, function1, function12, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RenameBottomSheet$lambda$28(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    private static final void DeleteConfirmationBottomSheet(final InvestingMonitorPage investingMonitorPage, final Function1<? super InvestingMonitorPage, Unit> function1, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1886688014);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(investingMonitorPage) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1886688014, i2, -1, "com.robinhood.android.redesigninvesting.investingmonitor.ui.edit.DeleteConfirmationBottomSheet (InvestingMonitorActionsBottomSheet.kt:334)");
            }
            RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI(function0, null, false, null, null, 0L, ComposableLambda3.rememberComposableLambda(882630631, true, new Function3<RhModalBottomSheet5, Composer, Integer, Unit>() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.edit.InvestingMonitorActionsBottomSheetKt.DeleteConfirmationBottomSheet.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer2, Integer num) {
                    invoke(rhModalBottomSheet5, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(RhModalBottomSheet5 RhModalBottomSheet, Composer composer2, int i3) {
                    Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
                    if ((i3 & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(882630631, i3, -1, "com.robinhood.android.redesigninvesting.investingmonitor.ui.edit.DeleteConfirmationBottomSheet.<anonymous> (InvestingMonitorActionsBottomSheet.kt:338)");
                    }
                    final InvestingMonitorPage investingMonitorPage2 = investingMonitorPage;
                    final Function1<InvestingMonitorPage, Unit> function12 = function1;
                    final Function0<Unit> function02 = function0;
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1907942158, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.edit.InvestingMonitorActionsBottomSheetKt.DeleteConfirmationBottomSheet.1.1
                        public final void invoke(Composer composer3, int i4) {
                            if ((i4 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1907942158, i4, -1, "com.robinhood.android.redesigninvesting.investingmonitor.ui.edit.DeleteConfirmationBottomSheet.<anonymous>.<anonymous> (InvestingMonitorActionsBottomSheet.kt:339)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i5 = BentoTheme.$stable;
                            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme.getSpacing(composer3, i5).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer3, i5).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer3, i5).m21592getMediumD9Ej5fM(), 0.0f, 8, null);
                            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                            InvestingMonitorPage investingMonitorPage3 = investingMonitorPage2;
                            Function1<InvestingMonitorPage, Unit> function13 = function12;
                            Function0<Unit> function03 = function02;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer3, 48);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM5146paddingqDBjuR0$default);
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
                            InvestingMonitorActionsBottomSheetTitle.Title(StringResources_androidKt.stringResource(C26507R.string.investing_monitor_really_delete_title, new Object[]{investingMonitorPage3.getTabTitle()}, composer3, 0), PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer3, i5).m21592getMediumD9Ej5fM(), 7, null), composer3, 0, 0);
                            Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme.getSpacing(composer3, i5).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer3, i5).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer3, i5).m21590getDefaultD9Ej5fM(), 2, null);
                            String strStringResource = StringResources_androidKt.stringResource(C26507R.string.investing_monitor_really_delete_message, composer3, 0);
                            long jM21425getFg0d7_KjU = bentoTheme.getColors(composer3, i5).m21425getFg0d7_KjU();
                            BentoText2.m20747BentoText38GnDrw(strStringResource, modifierM5146paddingqDBjuR0$default2, Color.m6701boximpl(jM21425getFg0d7_KjU), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i5).getTextM(), composer3, 0, 0, 8120);
                            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, BentoTheme4.NEGATIVE, ComposableLambda3.rememberComposableLambda(1401207968, true, new C26535xea7fa091(function13, investingMonitorPage3, function03), composer3, 54), composer3, 113246208, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE);
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
                    }, composer2, 54), composer2, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i2 >> 6) & 14) | 1572864, 62);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.edit.InvestingMonitorActionsBottomSheetKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InvestingMonitorActionsBottomSheetKt.DeleteConfirmationBottomSheet$lambda$34(investingMonitorPage, function1, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void MainActionsBottomSheet(final InvestingMonitorPage investingMonitorPage, final Function0<Unit> function0, final Function0<Unit> function02, final Function0<Unit> function03, final Function0<Unit> function04, final Function0<Unit> function05, Composer composer, final int i) {
        int i2;
        Function0<Unit> function06;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2008587869);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(investingMonitorPage) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            function06 = function0;
            i2 |= composerStartRestartGroup.changedInstance(function06) ? 32 : 16;
        } else {
            function06 = function0;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function03) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function04) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function05) ? 131072 : 65536;
        }
        if ((74899 & i2) != 74898 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2008587869, i2, -1, "com.robinhood.android.redesigninvesting.investingmonitor.ui.edit.MainActionsBottomSheet (InvestingMonitorActionsBottomSheet.kt:395)");
            }
            composer2 = composerStartRestartGroup;
            RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI(function06, null, false, null, null, 0L, ComposableLambda3.rememberComposableLambda(469545130, true, new Function3<RhModalBottomSheet5, Composer, Integer, Unit>() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.edit.InvestingMonitorActionsBottomSheetKt.MainActionsBottomSheet.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer3, Integer num) {
                    invoke(rhModalBottomSheet5, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(RhModalBottomSheet5 RhModalBottomSheet, Composer composer3, int i3) {
                    Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
                    if ((i3 & 17) == 16 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(469545130, i3, -1, "com.robinhood.android.redesigninvesting.investingmonitor.ui.edit.MainActionsBottomSheet.<anonymous> (InvestingMonitorActionsBottomSheet.kt:399)");
                    }
                    final InvestingMonitorPage investingMonitorPage2 = investingMonitorPage;
                    final Function0<Unit> function07 = function02;
                    final Function0<Unit> function08 = function04;
                    final Function0<Unit> function09 = function05;
                    final Function0<Unit> function010 = function03;
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1158543167, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.edit.InvestingMonitorActionsBottomSheetKt.MainActionsBottomSheet.1.1
                        public final void invoke(Composer composer4, int i4) throws Resources.NotFoundException {
                            if ((i4 & 3) == 2 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1158543167, i4, -1, "com.robinhood.android.redesigninvesting.investingmonitor.ui.edit.MainActionsBottomSheet.<anonymous>.<anonymous> (InvestingMonitorActionsBottomSheet.kt:400)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Alignment.Companion companion2 = Alignment.INSTANCE;
                            Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
                            InvestingMonitorPage investingMonitorPage3 = investingMonitorPage2;
                            Function0<Unit> function011 = function07;
                            Function0<Unit> function012 = function08;
                            Function0<Unit> function013 = function09;
                            Function0<Unit> function014 = function010;
                            Arrangement arrangement = Arrangement.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer4, 48);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, companion);
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
                            if (composer4.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer4.startReusableNode();
                            if (composer4.getInserting()) {
                                composer4.createNode(constructor);
                            } else {
                                composer4.useNode();
                            }
                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            String strStringResource = StringResources_androidKt.stringResource(C26507R.string.investing_monitor_edit_title, new Object[]{investingMonitorPage3.getTabTitle()}, composer4, 0);
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i5 = BentoTheme.$stable;
                            InvestingMonitorActionsBottomSheetTitle.Title(strStringResource, PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme.getSpacing(composer4, i5).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer4, i5).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer4, i5).m21592getMediumD9Ej5fM(), 0.0f, 8, null), composer4, 0, 0);
                            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(companion, ScrollKt.rememberScrollState(0, composer4, 0, 1), false, null, false, 14, null);
                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer4, 0);
                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer4, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer4, modifierVerticalScroll$default);
                            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                            if (composer4.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer4.startReusableNode();
                            if (composer4.getInserting()) {
                                composer4.createNode(constructor2);
                            } else {
                                composer4.useNode();
                            }
                            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer4);
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                            BentoBaseRowKt.m20916BentoBaseRowygcbOzY(null, null, StringResources_androidKt.stringResource(C26507R.string.investing_monitor_display_data, composer4, 0), null, null, null, null, false, false, false, 0L, function011, composer4, 0, 0, 2043);
                            composer4.startReplaceGroup(569953721);
                            if (!investingMonitorPage3.getCuratedList().isOptionsWatchlist() && !investingMonitorPage3.getCuratedList().isRobinhoodList()) {
                                BentoBaseRowKt.m20916BentoBaseRowygcbOzY(null, null, StringResources_androidKt.stringResource(C26507R.string.investing_monitor_rename, composer4, 0), null, null, null, null, false, false, false, 0L, function012, composer4, 0, 0, 2043);
                            }
                            composer4.endReplaceGroup();
                            BentoBaseRowKt.m20916BentoBaseRowygcbOzY(null, null, StringResources_androidKt.stringResource(C26507R.string.investing_monitor_reorder_tabs, composer4, 0), null, null, null, null, false, false, false, 0L, function013, composer4, 0, 0, 2043);
                            composer4.startReplaceGroup(569975321);
                            if (!investingMonitorPage3.getCuratedList().isOptionsWatchlist() && !investingMonitorPage3.getCuratedList().isRobinhoodList()) {
                                BentoBaseRowKt.m20916BentoBaseRowygcbOzY(null, null, StringResources_androidKt.stringResource(C26507R.string.investing_monitor_delete, composer4, 0), null, null, null, null, false, false, false, 0L, function014, composer4, 0, 0, 2043);
                            }
                            composer4.endReplaceGroup();
                            composer4.endNode();
                            composer4.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) throws Resources.NotFoundException {
                            invoke(composer4, num.intValue());
                            return Unit.INSTANCE;
                        }
                    }, composer3, 54), composer3, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composer2, ((i2 >> 3) & 14) | 1572864, 62);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.edit.InvestingMonitorActionsBottomSheetKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InvestingMonitorActionsBottomSheetKt.MainActionsBottomSheet$lambda$35(investingMonitorPage, function0, function02, function03, function04, function05, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
