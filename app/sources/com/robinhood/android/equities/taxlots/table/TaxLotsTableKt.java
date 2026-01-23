package com.robinhood.android.equities.taxlots.table;

import androidx.compose.foundation.Overscroll3;
import androidx.compose.foundation.Overscroll4;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.generic.table.DisplayDetails;
import com.robinhood.android.generic.table.GenericTableData;
import com.robinhood.android.generic.table.GenericTableKt;
import com.robinhood.android.generic.table.StickyColumn;
import com.robinhood.android.generic.table.TableScreenFillSettings;
import com.robinhood.compose.bento.component.numpad.BentoNumpadScopeV2;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.rosetta.common.MoneyDto;
import equity_trading_tax_lots.proto.p460v1.TaxLotInformationDto;
import equity_trading_tax_lots.proto.p460v1.TaxLotTermDto;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.threeten.extra.Days;
import p479j$.time.Instant;
import p479j$.time.temporal.TemporalAmount;

/* compiled from: TaxLotsTable.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u001ay\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0014\u0010\u0011\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00010\bH\u0001¢\u0006\u0002\u0010\u0013\u001a\f\u0010\u0014\u001a\u00020\u0006*\u00020\u0010H\u0002\u001a\r\u0010\u001a\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u001b\u001a\r\u0010\u001c\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u001b\"\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d²\u0006\n\u0010\u0014\u001a\u00020\u0006X\u008a\u0084\u0002"}, m3636d2 = {"TaxLotsTable", "", "tableData", "Lcom/robinhood/android/generic/table/GenericTableData;", "Lcom/robinhood/android/equities/taxlots/table/TaxLotsTableCell;", "canRequestNextPage", "", "setKeyboardVisible", "Lkotlin/Function1;", "requestNextPage", "Lkotlin/Function0;", "bentoNumpadScopeV2", "Lcom/robinhood/compose/bento/component/numpad/BentoNumpadScopeV2;", "modifier", "Landroidx/compose/ui/Modifier;", "scrollState", "Landroidx/compose/foundation/lazy/LazyListState;", "invalidNumberOfSharesCallback", "Ljava/math/BigDecimal;", "(Lcom/robinhood/android/generic/table/GenericTableData;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/robinhood/compose/bento/component/numpad/BentoNumpadScopeV2;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "reachedBottom", "mockLaxLotData", "", "Lcom/robinhood/android/equities/taxlots/table/SelectableTaxLot;", "getMockLaxLotData", "()Ljava/util/List;", "TaxLotsTablePreview", "(Landroidx/compose/runtime/Composer;I)V", "TaxLotsReadOnlyTablePreview", "lib-tax-lots_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class TaxLotsTableKt {
    private static final List<SelectableTaxLot> mockLaxLotData;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TaxLotsReadOnlyTablePreview$lambda$8(int i, Composer composer, int i2) {
        TaxLotsReadOnlyTablePreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TaxLotsTable$lambda$4(GenericTableData genericTableData, boolean z, Function1 function1, Function0 function0, BentoNumpadScopeV2 bentoNumpadScopeV2, Modifier modifier, LazyListState lazyListState, Function1 function12, int i, int i2, Composer composer, int i3) {
        TaxLotsTable(genericTableData, z, function1, function0, bentoNumpadScopeV2, modifier, lazyListState, function12, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TaxLotsTablePreview$lambda$7(int i, Composer composer, int i2) {
        TaxLotsTablePreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TaxLotsTable(final GenericTableData<TaxLotsTableHelpers4> tableData, boolean z, final Function1<? super Boolean, Unit> setKeyboardVisible, final Function0<Unit> requestNextPage, final BentoNumpadScopeV2 bentoNumpadScopeV2, Modifier modifier, LazyListState lazyListState, final Function1<? super BigDecimal, Unit> invalidNumberOfSharesCallback, Composer composer, final int i, final int i2) {
        int i3;
        final BentoNumpadScopeV2 bentoNumpadScopeV22;
        Modifier modifier2;
        LazyListState lazyListState2;
        final LazyListState lazyListStateRememberLazyListState;
        int i4;
        final Modifier modifier3;
        Object objRememberedValue;
        Composer.Companion companion;
        SnapshotState4 snapshotState4;
        boolean z2;
        Object objRememberedValue2;
        final Modifier modifier4;
        final LazyListState lazyListState3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final boolean z3 = z;
        Intrinsics.checkNotNullParameter(tableData, "tableData");
        Intrinsics.checkNotNullParameter(setKeyboardVisible, "setKeyboardVisible");
        Intrinsics.checkNotNullParameter(requestNextPage, "requestNextPage");
        Intrinsics.checkNotNullParameter(invalidNumberOfSharesCallback, "invalidNumberOfSharesCallback");
        Composer composerStartRestartGroup = composer.startRestartGroup(1444762386);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(tableData) : composerStartRestartGroup.changedInstance(tableData) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z3) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(setKeyboardVisible) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(requestNextPage) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
            bentoNumpadScopeV22 = bentoNumpadScopeV2;
        } else {
            bentoNumpadScopeV22 = bentoNumpadScopeV2;
            if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(bentoNumpadScopeV22) ? 16384 : 8192;
            }
        }
        int i5 = i2 & 32;
        if (i5 == 0) {
            if ((196608 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
            if ((1572864 & i) != 0) {
                if ((i2 & 64) == 0) {
                    lazyListState2 = lazyListState;
                    int i6 = composerStartRestartGroup.changed(lazyListState2) ? 1048576 : 524288;
                    i3 |= i6;
                } else {
                    lazyListState2 = lazyListState;
                }
                i3 |= i6;
            } else {
                lazyListState2 = lazyListState;
            }
            if ((i2 & 128) == 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(invalidNumberOfSharesCallback) ? 8388608 : 4194304;
            }
            if ((4793491 & i3) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    if (i5 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i2 & 64) == 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i4 = i3 & (-3670017);
                        modifier3 = modifier2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1444762386, i4, -1, "com.robinhood.android.equities.taxlots.table.TaxLotsTable (TaxLotsTable.kt:54)");
                    }
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.equities.taxlots.table.TaxLotsTableKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Boolean.valueOf(TaxLotsTableKt.reachedBottom(lazyListStateRememberLazyListState));
                            }
                        });
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    snapshotState4 = (SnapshotState4) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    ProvidedValue<Overscroll3> providedValueProvides = Overscroll4.getLocalOverscrollFactory().provides(null);
                    Function2<Composer, Integer, Unit> function2 = new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.taxlots.table.TaxLotsTableKt.TaxLotsTable.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i7) {
                            if ((i7 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1846204846, i7, -1, "com.robinhood.android.equities.taxlots.table.TaxLotsTable.<anonymous> (TaxLotsTable.kt:63)");
                            }
                            float fM7995constructorimpl = C2002Dp.m7995constructorimpl(50);
                            StickyColumn.StickAtEndUntilOnScreen stickAtEndUntilOnScreen = new StickyColumn.StickAtEndUntilOnScreen(3);
                            TableScreenFillSettings.Custom custom = new TableScreenFillSettings.Custom(SetsKt.setOf(0));
                            Function3<Column5, Composer, Integer, Unit> lambda$278356808$lib_tax_lots_externalDebug = z3 ? ComposableSingletons$TaxLotsTableKt.INSTANCE.getLambda$278356808$lib_tax_lots_externalDebug() : null;
                            GenericTableData<TaxLotsTableHelpers4> genericTableData = tableData;
                            final BentoNumpadScopeV2 bentoNumpadScopeV23 = bentoNumpadScopeV22;
                            final Function1<Boolean, Unit> function1 = setKeyboardVisible;
                            final Function1<BigDecimal, Unit> function12 = invalidNumberOfSharesCallback;
                            GenericTableKt.m14971GenericTable9SxZPhU(genericTableData, ComposableLambda3.rememberComposableLambda(-1464324288, true, new Function6<TaxLotsTableHelpers4, C2002Dp, C2002Dp, DisplayDetails, Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.taxlots.table.TaxLotsTableKt.TaxLotsTable.1.1
                                @Override // kotlin.jvm.functions.Function6
                                public /* bridge */ /* synthetic */ Unit invoke(TaxLotsTableHelpers4 taxLotsTableHelpers4, C2002Dp c2002Dp, C2002Dp c2002Dp2, DisplayDetails displayDetails, Composer composer3, Integer num) {
                                    m13663invokeC8IHX40(taxLotsTableHelpers4, c2002Dp, c2002Dp2, displayDetails, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke-C8IHX40, reason: not valid java name */
                                public final void m13663invokeC8IHX40(TaxLotsTableHelpers4 cell, C2002Dp c2002Dp, C2002Dp c2002Dp2, DisplayDetails displayDetails, Composer composer3, int i8) {
                                    int i9;
                                    Intrinsics.checkNotNullParameter(cell, "cell");
                                    Intrinsics.checkNotNullParameter(displayDetails, "displayDetails");
                                    if ((i8 & 6) == 0) {
                                        i9 = (composer3.changed(cell) ? 4 : 2) | i8;
                                    } else {
                                        i9 = i8;
                                    }
                                    if ((i8 & 48) == 0) {
                                        i9 |= composer3.changed(c2002Dp) ? 32 : 16;
                                    }
                                    if ((i8 & 384) == 0) {
                                        i9 |= composer3.changed(c2002Dp2) ? 256 : 128;
                                    }
                                    if ((i8 & 3072) == 0) {
                                        i9 |= (i8 & 4096) == 0 ? composer3.changed(displayDetails) : composer3.changedInstance(displayDetails) ? 2048 : 1024;
                                    }
                                    if ((i9 & 9363) == 9362 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1464324288, i9, -1, "com.robinhood.android.equities.taxlots.table.TaxLotsTable.<anonymous>.<anonymous> (TaxLotsTable.kt:71)");
                                    }
                                    TaxLotsTableHelpers5.m13660TaxLotsComponentMapperNWQEAi4(displayDetails.getRowIndex(), cell, c2002Dp2, c2002Dp, bentoNumpadScopeV23, function1, function12, displayDetails.getStickyColumn(), composer3, ((i9 << 3) & 112) | (i9 & 896) | ((i9 << 6) & 7168));
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer2, 54), modifier3, false, C2002Dp.m7993boximpl(fM7995constructorimpl), custom, lazyListStateRememberLazyListState, null, null, stickAtEndUntilOnScreen, lambda$278356808$lib_tax_lots_externalDebug, null, composer2, GenericTableData.$stable | 24624 | (TableScreenFillSettings.Custom.$stable << 15) | (StickyColumn.StickAtEndUntilOnScreen.$stable << 27), 0, 2440);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    };
                    z3 = z3;
                    CompositionLocal3.CompositionLocalProvider(providedValueProvides, ComposableLambda3.rememberComposableLambda(-1846204846, true, function2, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
                    Boolean boolValueOf = Boolean.valueOf(TaxLotsTable$lambda$2(snapshotState4));
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    z2 = ((i4 & 112) == 32) | ((i4 & 7168) == 2048);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (z2 || objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new TaxLotsTableKt$TaxLotsTable$2$1(z3, requestNextPage, snapshotState4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    lazyListState3 = lazyListStateRememberLazyListState;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                    }
                }
                i4 = i3;
                modifier3 = modifier2;
                lazyListStateRememberLazyListState = lazyListState2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                snapshotState4 = (SnapshotState4) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                ProvidedValue<Overscroll3> providedValueProvides2 = Overscroll4.getLocalOverscrollFactory().provides(null);
                Function2<Composer, Integer, Unit> function22 = new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.taxlots.table.TaxLotsTableKt.TaxLotsTable.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i7) {
                        if ((i7 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1846204846, i7, -1, "com.robinhood.android.equities.taxlots.table.TaxLotsTable.<anonymous> (TaxLotsTable.kt:63)");
                        }
                        float fM7995constructorimpl = C2002Dp.m7995constructorimpl(50);
                        StickyColumn.StickAtEndUntilOnScreen stickAtEndUntilOnScreen = new StickyColumn.StickAtEndUntilOnScreen(3);
                        TableScreenFillSettings.Custom custom = new TableScreenFillSettings.Custom(SetsKt.setOf(0));
                        Function3<Column5, Composer, Integer, Unit> lambda$278356808$lib_tax_lots_externalDebug = z3 ? ComposableSingletons$TaxLotsTableKt.INSTANCE.getLambda$278356808$lib_tax_lots_externalDebug() : null;
                        GenericTableData<TaxLotsTableHelpers4> genericTableData = tableData;
                        final BentoNumpadScopeV2 bentoNumpadScopeV23 = bentoNumpadScopeV22;
                        final Function1<? super Boolean, Unit> function1 = setKeyboardVisible;
                        final Function1<? super BigDecimal, Unit> function12 = invalidNumberOfSharesCallback;
                        GenericTableKt.m14971GenericTable9SxZPhU(genericTableData, ComposableLambda3.rememberComposableLambda(-1464324288, true, new Function6<TaxLotsTableHelpers4, C2002Dp, C2002Dp, DisplayDetails, Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.taxlots.table.TaxLotsTableKt.TaxLotsTable.1.1
                            @Override // kotlin.jvm.functions.Function6
                            public /* bridge */ /* synthetic */ Unit invoke(TaxLotsTableHelpers4 taxLotsTableHelpers4, C2002Dp c2002Dp, C2002Dp c2002Dp2, DisplayDetails displayDetails, Composer composer3, Integer num) {
                                m13663invokeC8IHX40(taxLotsTableHelpers4, c2002Dp, c2002Dp2, displayDetails, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke-C8IHX40, reason: not valid java name */
                            public final void m13663invokeC8IHX40(TaxLotsTableHelpers4 cell, C2002Dp c2002Dp, C2002Dp c2002Dp2, DisplayDetails displayDetails, Composer composer3, int i8) {
                                int i9;
                                Intrinsics.checkNotNullParameter(cell, "cell");
                                Intrinsics.checkNotNullParameter(displayDetails, "displayDetails");
                                if ((i8 & 6) == 0) {
                                    i9 = (composer3.changed(cell) ? 4 : 2) | i8;
                                } else {
                                    i9 = i8;
                                }
                                if ((i8 & 48) == 0) {
                                    i9 |= composer3.changed(c2002Dp) ? 32 : 16;
                                }
                                if ((i8 & 384) == 0) {
                                    i9 |= composer3.changed(c2002Dp2) ? 256 : 128;
                                }
                                if ((i8 & 3072) == 0) {
                                    i9 |= (i8 & 4096) == 0 ? composer3.changed(displayDetails) : composer3.changedInstance(displayDetails) ? 2048 : 1024;
                                }
                                if ((i9 & 9363) == 9362 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1464324288, i9, -1, "com.robinhood.android.equities.taxlots.table.TaxLotsTable.<anonymous>.<anonymous> (TaxLotsTable.kt:71)");
                                }
                                TaxLotsTableHelpers5.m13660TaxLotsComponentMapperNWQEAi4(displayDetails.getRowIndex(), cell, c2002Dp2, c2002Dp, bentoNumpadScopeV23, function1, function12, displayDetails.getStickyColumn(), composer3, ((i9 << 3) & 112) | (i9 & 896) | ((i9 << 6) & 7168));
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), modifier3, false, C2002Dp.m7993boximpl(fM7995constructorimpl), custom, lazyListStateRememberLazyListState, null, null, stickAtEndUntilOnScreen, lambda$278356808$lib_tax_lots_externalDebug, null, composer2, GenericTableData.$stable | 24624 | (TableScreenFillSettings.Custom.$stable << 15) | (StickyColumn.StickAtEndUntilOnScreen.$stable << 27), 0, 2440);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                };
                z3 = z3;
                CompositionLocal3.CompositionLocalProvider(providedValueProvides2, ComposableLambda3.rememberComposableLambda(-1846204846, true, function22, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
                Boolean boolValueOf2 = Boolean.valueOf(TaxLotsTable$lambda$2(snapshotState4));
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                z2 = ((i4 & 112) == 32) | ((i4 & 7168) == 2048);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (z2) {
                    objRememberedValue2 = new TaxLotsTableKt$TaxLotsTable$2$1(z3, requestNextPage, snapshotState4, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(boolValueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier4 = modifier3;
                    lazyListState3 = lazyListStateRememberLazyListState;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                lazyListState3 = lazyListState2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.taxlots.table.TaxLotsTableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return TaxLotsTableKt.TaxLotsTable$lambda$4(tableData, z3, setKeyboardVisible, requestNextPage, bentoNumpadScopeV2, modifier4, lazyListState3, invalidNumberOfSharesCallback, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 196608;
        modifier2 = modifier;
        if ((1572864 & i) != 0) {
        }
        if ((i2 & 128) == 0) {
        }
        if ((4793491 & i3) == 4793490) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i5 != 0) {
                }
                if ((i2 & 64) == 0) {
                    i4 = i3;
                    modifier3 = modifier2;
                    lazyListStateRememberLazyListState = lazyListState2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                snapshotState4 = (SnapshotState4) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                ProvidedValue<Overscroll3> providedValueProvides22 = Overscroll4.getLocalOverscrollFactory().provides(null);
                Function2<Composer, Integer, Unit> function222 = new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.taxlots.table.TaxLotsTableKt.TaxLotsTable.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i7) {
                        if ((i7 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1846204846, i7, -1, "com.robinhood.android.equities.taxlots.table.TaxLotsTable.<anonymous> (TaxLotsTable.kt:63)");
                        }
                        float fM7995constructorimpl = C2002Dp.m7995constructorimpl(50);
                        StickyColumn.StickAtEndUntilOnScreen stickAtEndUntilOnScreen = new StickyColumn.StickAtEndUntilOnScreen(3);
                        TableScreenFillSettings.Custom custom = new TableScreenFillSettings.Custom(SetsKt.setOf(0));
                        Function3<Column5, Composer, Integer, Unit> lambda$278356808$lib_tax_lots_externalDebug = z3 ? ComposableSingletons$TaxLotsTableKt.INSTANCE.getLambda$278356808$lib_tax_lots_externalDebug() : null;
                        GenericTableData<TaxLotsTableHelpers4> genericTableData = tableData;
                        final BentoNumpadScopeV2 bentoNumpadScopeV23 = bentoNumpadScopeV22;
                        final Function1<? super Boolean, Unit> function1 = setKeyboardVisible;
                        final Function1<? super BigDecimal, Unit> function12 = invalidNumberOfSharesCallback;
                        GenericTableKt.m14971GenericTable9SxZPhU(genericTableData, ComposableLambda3.rememberComposableLambda(-1464324288, true, new Function6<TaxLotsTableHelpers4, C2002Dp, C2002Dp, DisplayDetails, Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.taxlots.table.TaxLotsTableKt.TaxLotsTable.1.1
                            @Override // kotlin.jvm.functions.Function6
                            public /* bridge */ /* synthetic */ Unit invoke(TaxLotsTableHelpers4 taxLotsTableHelpers4, C2002Dp c2002Dp, C2002Dp c2002Dp2, DisplayDetails displayDetails, Composer composer3, Integer num) {
                                m13663invokeC8IHX40(taxLotsTableHelpers4, c2002Dp, c2002Dp2, displayDetails, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke-C8IHX40, reason: not valid java name */
                            public final void m13663invokeC8IHX40(TaxLotsTableHelpers4 cell, C2002Dp c2002Dp, C2002Dp c2002Dp2, DisplayDetails displayDetails, Composer composer3, int i8) {
                                int i9;
                                Intrinsics.checkNotNullParameter(cell, "cell");
                                Intrinsics.checkNotNullParameter(displayDetails, "displayDetails");
                                if ((i8 & 6) == 0) {
                                    i9 = (composer3.changed(cell) ? 4 : 2) | i8;
                                } else {
                                    i9 = i8;
                                }
                                if ((i8 & 48) == 0) {
                                    i9 |= composer3.changed(c2002Dp) ? 32 : 16;
                                }
                                if ((i8 & 384) == 0) {
                                    i9 |= composer3.changed(c2002Dp2) ? 256 : 128;
                                }
                                if ((i8 & 3072) == 0) {
                                    i9 |= (i8 & 4096) == 0 ? composer3.changed(displayDetails) : composer3.changedInstance(displayDetails) ? 2048 : 1024;
                                }
                                if ((i9 & 9363) == 9362 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1464324288, i9, -1, "com.robinhood.android.equities.taxlots.table.TaxLotsTable.<anonymous>.<anonymous> (TaxLotsTable.kt:71)");
                                }
                                TaxLotsTableHelpers5.m13660TaxLotsComponentMapperNWQEAi4(displayDetails.getRowIndex(), cell, c2002Dp2, c2002Dp, bentoNumpadScopeV23, function1, function12, displayDetails.getStickyColumn(), composer3, ((i9 << 3) & 112) | (i9 & 896) | ((i9 << 6) & 7168));
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), modifier3, false, C2002Dp.m7993boximpl(fM7995constructorimpl), custom, lazyListStateRememberLazyListState, null, null, stickAtEndUntilOnScreen, lambda$278356808$lib_tax_lots_externalDebug, null, composer2, GenericTableData.$stable | 24624 | (TableScreenFillSettings.Custom.$stable << 15) | (StickyColumn.StickAtEndUntilOnScreen.$stable << 27), 0, 2440);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                };
                z3 = z3;
                CompositionLocal3.CompositionLocalProvider(providedValueProvides22, ComposableLambda3.rememberComposableLambda(-1846204846, true, function222, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
                Boolean boolValueOf22 = Boolean.valueOf(TaxLotsTable$lambda$2(snapshotState4));
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                z2 = ((i4 & 112) == 32) | ((i4 & 7168) == 2048);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (z2) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean TaxLotsTable$lambda$2(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean reachedBottom(LazyListState lazyListState) {
        LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) CollectionsKt.lastOrNull((List) lazyListState.getLayoutInfo().getVisibleItemsInfo());
        return (lazyListItemInfo == null || lazyListItemInfo.getIndex() != 0) && lazyListItemInfo != null && lazyListItemInfo.getIndex() == lazyListState.getLayoutInfo().getTotalItemsCount() - 1;
    }

    static {
        ArrayList arrayList = new ArrayList(100);
        for (int i = 0; i < 100; i++) {
            String strValueOf = String.valueOf(i);
            Instant instantNow = Instant.now();
            Intrinsics.checkNotNullExpressionValue(instantNow, "now(...)");
            Instant instantMinus = instantNow.minus((TemporalAmount) Days.m3991of(i));
            Intrinsics.checkNotNullExpressionValue(instantMinus, "minus(...)");
            Instant instantNow2 = Instant.now();
            Intrinsics.checkNotNullExpressionValue(instantNow2, "now(...)");
            Instant instantMinus2 = instantNow2.minus((TemporalAmount) Days.m3991of(i));
            Intrinsics.checkNotNullExpressionValue(instantMinus2, "minus(...)");
            arrayList.add(new TaxLotInformationDto(strValueOf, i % 2 == 0 ? TaxLotTermDto.SHORT_TERM : TaxLotTermDto.LONG_TERM, new MoneyDto(new IdlDecimal(String.valueOf(i * 100)), null, 2, null), new IdlDecimal(String.valueOf(i)), instantMinus, true, instantMinus2));
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new SelectableTaxLot(((TaxLotInformationDto) it.next()).toProto(), null, null, 6, null));
        }
        mockLaxLotData = arrayList2;
    }

    public static final List<SelectableTaxLot> getMockLaxLotData() {
        return mockLaxLotData;
    }

    public static final void TaxLotsTablePreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1356788596);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1356788596, i, -1, "com.robinhood.android.equities.taxlots.table.TaxLotsTablePreview (TaxLotsTable.kt:128)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableSingletons$TaxLotsTableKt.INSTANCE.getLambda$379482692$lib_tax_lots_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.taxlots.table.TaxLotsTableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TaxLotsTableKt.TaxLotsTablePreview$lambda$7(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void TaxLotsReadOnlyTablePreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-156557810);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-156557810, i, -1, "com.robinhood.android.equities.taxlots.table.TaxLotsReadOnlyTablePreview (TaxLotsTable.kt:163)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableSingletons$TaxLotsTableKt.INSTANCE.getLambda$572738502$lib_tax_lots_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.taxlots.table.TaxLotsTableKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TaxLotsTableKt.TaxLotsReadOnlyTablePreview$lambda$8(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
