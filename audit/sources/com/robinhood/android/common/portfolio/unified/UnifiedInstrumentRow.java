package com.robinhood.android.common.portfolio.unified;

import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.android.common.portfolio.instrument.InstrumentListItemComposable;
import com.robinhood.android.common.portfolio.options.OptionInstrumentListItemComposable;
import com.robinhood.android.common.portfolio.position.PositionListItemComposableKt;
import com.robinhood.android.common.portfolio.position.SwipeAnimationPreview;
import com.robinhood.android.common.portfolio.unified.UnifiedInstrumentRow2;
import com.robinhood.android.models.portfolio.PositionsV2;
import com.robinhood.android.models.portfolio.api.PositionsLocation;
import com.robinhood.models.p320db.CuratedListItem;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: UnifiedInstrumentRow.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001aI\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m3636d2 = {"UnifiedInstrumentRow", "", "row", "Lcom/robinhood/android/common/portfolio/unified/UnifiedRow;", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "identifier", "", "onDisplayValueClicked", "(Lcom/robinhood/android/common/portfolio/unified/UnifiedRow;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "feature-lib-portfolio_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.common.portfolio.unified.UnifiedInstrumentRowKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class UnifiedInstrumentRow {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UnifiedInstrumentRow$lambda$6(UnifiedInstrumentRow2 unifiedInstrumentRow2, Function0 function0, Modifier modifier, String str, Function0 function02, int i, int i2, Composer composer, int i3) {
        UnifiedInstrumentRow(unifiedInstrumentRow2, function0, modifier, str, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0156  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void UnifiedInstrumentRow(final UnifiedInstrumentRow2 row, final Function0<Unit> function0, Modifier modifier, String str, Function0<Unit> function02, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        String str2;
        int i5;
        Function0<Unit> function03;
        Function0<Unit> function04;
        Modifier modifier3;
        String str3;
        String str4;
        Function0<Unit> function05;
        final Modifier modifier4;
        final String str5;
        final Function0<Unit> function06;
        Function0<Unit> function07;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(row, "row");
        Composer composerStartRestartGroup = composer.startRestartGroup(-291644319);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(row) : composerStartRestartGroup.changedInstance(row) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
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
                    str2 = str;
                    i3 |= composerStartRestartGroup.changed(str2) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 == 0) {
                    if ((i & 24576) == 0) {
                        function03 = function02;
                        i3 |= composerStartRestartGroup.changedInstance(function03) ? 16384 : 8192;
                    }
                    if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                        if (i6 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        String str6 = i4 == 0 ? "" : str2;
                        if (i5 == 0) {
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.common.portfolio.unified.UnifiedInstrumentRowKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            function04 = (Function0) objRememberedValue;
                        } else {
                            function04 = function03;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-291644319, i3, -1, "com.robinhood.android.common.portfolio.unified.UnifiedInstrumentRow (UnifiedInstrumentRow.kt:23)");
                        }
                        if (!(row instanceof UnifiedInstrumentRow2.OptionStrategyRow)) {
                            composerStartRestartGroup.startReplaceGroup(343202429);
                            UnifiedInstrumentRow2.OptionStrategyRow optionStrategyRow = (UnifiedInstrumentRow2.OptionStrategyRow) row;
                            int i7 = i3;
                            CuratedListItem optionCuratedListItem = optionStrategyRow.getOptionCuratedListItem();
                            String displayType = optionStrategyRow.getDisplayType();
                            String accountNumber = optionStrategyRow.getAccountNumber();
                            composerStartRestartGroup.startReplaceGroup(-1097297810);
                            if (function0 == null) {
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.common.portfolio.unified.UnifiedInstrumentRowKt$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                function07 = (Function0) objRememberedValue2;
                                composerStartRestartGroup.endReplaceGroup();
                            } else {
                                function07 = function0;
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            int i8 = (i7 >> 3) & 7168;
                            int i9 = i7 << 6;
                            str3 = str6;
                            Function0<Unit> function08 = function04;
                            modifier3 = modifier2;
                            OptionInstrumentListItemComposable.OptionInstrumentListItemComposable(optionCuratedListItem, displayType, function07, function08, modifier3, str3, accountNumber, null, composerStartRestartGroup, (458752 & i9) | (57344 & i9) | i8, 128);
                            function04 = function08;
                            composerStartRestartGroup = composerStartRestartGroup;
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            int i10 = i3;
                            if (row instanceof UnifiedInstrumentRow2.InstrumentRow) {
                                composerStartRestartGroup.startReplaceGroup(343658687);
                                UnifiedInstrumentRow2.InstrumentRow instrumentRow = (UnifiedInstrumentRow2.InstrumentRow) row;
                                int i11 = ((i10 << 3) & 896) | ((i10 >> 3) & 7168);
                                int i12 = i10 << 6;
                                InstrumentListItemComposable.InstrumentListItemComposable(instrumentRow.getDisplayType(), instrumentRow.getInstrument(), function0, function04, modifier2, str6, instrumentRow.getAccountNumber(), null, composerStartRestartGroup, i11 | (57344 & i12) | (458752 & i12), 128);
                                composerStartRestartGroup.endReplaceGroup();
                                modifier3 = modifier2;
                                str3 = str6;
                            } else {
                                if (!(row instanceof UnifiedInstrumentRow2.PositionRow)) {
                                    composerStartRestartGroup.startReplaceGroup(-1097308347);
                                    composerStartRestartGroup.endReplaceGroup();
                                    throw new NoWhenBranchMatchedException();
                                }
                                composerStartRestartGroup.startReplaceGroup(344084689);
                                UnifiedInstrumentRow2.PositionRow positionRow = (UnifiedInstrumentRow2.PositionRow) row;
                                PositionsV2.PositionListItemV2 position = positionRow.getPosition();
                                modifier3 = modifier2;
                                PositionsLocation positionsLocation = PositionsLocation.UNKNOWN;
                                String displayType2 = positionRow.getDisplayType();
                                str3 = str6;
                                int index = positionRow.getIndex();
                                SwipeAnimationPreview swipeAnimationPreview = positionRow.getSwipeAnimationPreview();
                                composerStartRestartGroup.startReplaceGroup(-1097266002);
                                if (function0 == null) {
                                    composerStartRestartGroup.startReplaceGroup(1849434622);
                                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue3 = new Function0() { // from class: com.robinhood.android.common.portfolio.unified.UnifiedInstrumentRowKt$$ExternalSyntheticLambda2
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    function05 = (Function0) objRememberedValue3;
                                    str4 = displayType2;
                                } else {
                                    str4 = displayType2;
                                    function05 = function0;
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                int i13 = i10 << 6;
                                PositionListItemComposableKt.PositionListItemComposable(position, str4, positionsLocation, index, modifier3, str3, null, swipeAnimationPreview, function05, function04, composerStartRestartGroup, (458752 & i13) | (57344 & i13) | 384 | ((i10 << 15) & 1879048192), 64);
                                composerStartRestartGroup = composerStartRestartGroup;
                                composerStartRestartGroup.endReplaceGroup();
                            }
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        str5 = str3;
                        function06 = function04;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier4 = modifier2;
                        str5 = str2;
                        function06 = function03;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.common.portfolio.unified.UnifiedInstrumentRowKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return UnifiedInstrumentRow.UnifiedInstrumentRow$lambda$6(row, function0, modifier4, str5, function06, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 24576;
                function03 = function02;
                if ((i3 & 9363) == 9362) {
                    if (i6 != 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    if (!(row instanceof UnifiedInstrumentRow2.OptionStrategyRow)) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier4 = modifier3;
                    str5 = str3;
                    function06 = function04;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            str2 = str;
            i5 = i2 & 16;
            if (i5 == 0) {
            }
            function03 = function02;
            if ((i3 & 9363) == 9362) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        str2 = str;
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        function03 = function02;
        if ((i3 & 9363) == 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
