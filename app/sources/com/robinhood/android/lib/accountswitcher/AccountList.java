package com.robinhood.android.lib.accountswitcher;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.lib.accountswitcher.AccountSwitcherUtils;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherRow;
import com.robinhood.utils.resource.StringResource;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: AccountList.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001aª\u0001\u0010\u0018\u001a\u00020\u0012\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00042\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\u00042\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u0019\b\u0002\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0004¢\u0006\u0002\b\u00132\u001d\u0010\u0017\u001a\u0019\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00120\u0015¢\u0006\u0002\b\u0013H\u0001¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001d²\u0006\"\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001b0\u001a\"\b\b\u0000\u0010\u0001*\u00020\u00008\nX\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherRow;", "T", "Lkotlinx/collections/immutable/ImmutableList;", "rows", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "", "rowKey", "", "", "includeHeaderPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/lazy/LazyListScope;", "", "Lkotlin/ExtensionFunctionType;", "topContent", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/LazyItemScope;", "rowContent", "AccountList", "(Lkotlinx/collections/immutable/ImmutableList;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "", "Lcom/robinhood/android/lib/accountswitcher/AccountSection;", "sections", "lib-account-switcher_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.lib.accountswitcher.AccountListKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class AccountList {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountList$lambda$10(ImmutableList immutableList, Function1 function1, Function1 function12, PaddingValues paddingValues, Modifier modifier, Function1 function13, Function4 function4, int i, int i2, Composer composer, int i3) {
        AccountList(immutableList, function1, function12, paddingValues, modifier, function13, function4, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountList$lambda$1$lambda$0(LazyListScope lazyListScope) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T extends AccountSwitcherRow> void AccountList(final ImmutableList<? extends T> rows, final Function1<? super T, ? extends Object> rowKey, final Function1<? super Integer, Boolean> includeHeaderPadding, final PaddingValues contentPadding, Modifier modifier, Function1<? super LazyListScope, Unit> function1, final Function4<? super LazyItemScope, ? super T, ? super Composer, ? super Integer, Unit> rowContent, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function1<? super LazyListScope, Unit> function12;
        boolean z;
        Object objRememberedValue;
        final SnapshotState4 snapshotState4;
        boolean zChanged;
        Object objRememberedValue2;
        int i5;
        Function1<? super LazyListScope, Unit> function13;
        final Modifier modifier3;
        final Function1<? super LazyListScope, Unit> function14;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(rows, "rows");
        Intrinsics.checkNotNullParameter(rowKey, "rowKey");
        Intrinsics.checkNotNullParameter(includeHeaderPadding, "includeHeaderPadding");
        Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
        Intrinsics.checkNotNullParameter(rowContent, "rowContent");
        Composer composerStartRestartGroup = composer.startRestartGroup(1467769377);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(rows) : composerStartRestartGroup.changedInstance(rows) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(rowKey) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(includeHeaderPadding) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(contentPadding) ? 2048 : 1024;
        }
        int i6 = i2 & 16;
        if (i6 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= 196608;
                function12 = function1;
            } else {
                function12 = function1;
                if ((i & 196608) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(function12) ? 131072 : 65536;
                }
            }
            if ((i2 & 64) == 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(rowContent) ? 1048576 : 524288;
            }
            if ((i3 & 599187) == 599186 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                if (i4 != 0) {
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new Function1() { // from class: com.robinhood.android.lib.accountswitcher.AccountListKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AccountList.AccountList$lambda$1$lambda$0((LazyListScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    function12 = (Function1) objRememberedValue3;
                    composerStartRestartGroup.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1467769377, i3, -1, "com.robinhood.android.lib.accountswitcher.AccountList (AccountList.kt:40)");
                }
                composerStartRestartGroup.startReplaceGroup(5004770);
                z = (i3 & 14) != 4 || ((i3 & 8) != 0 && composerStartRestartGroup.changed(rows));
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.lib.accountswitcher.AccountListKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AccountSwitcherUtils2.generateAccountSections(rows);
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                snapshotState4 = (SnapshotState4) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierTestTag = TestTag3.testTag(modifier4, AccountSelectionList.AccountsColumnTestTag);
                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChanged = ((458752 & i3) != 131072) | composerStartRestartGroup.changed(snapshotState4) | ((i3 & 896) != 256) | ((i3 & 112) != 32) | ((3670016 & i3) != 1048576);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    final Function1<? super LazyListScope, Unit> function15 = function12;
                    i5 = i3;
                    Function1 function16 = new Function1() { // from class: com.robinhood.android.lib.accountswitcher.AccountListKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AccountList.AccountList$lambda$9$lambda$8(function15, snapshotState4, rowKey, includeHeaderPadding, rowContent, (LazyListScope) obj);
                        }
                    };
                    function13 = function15;
                    composerStartRestartGroup.updateRememberedValue(function16);
                    objRememberedValue2 = function16;
                } else {
                    function13 = function12;
                    i5 = i3;
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier5 = modifier4;
                LazyDslKt.LazyColumn(modifierTestTag, null, contentPadding, false, null, centerHorizontally, null, false, null, (Function1) objRememberedValue2, composerStartRestartGroup, ((i5 >> 3) & 896) | 196608, 474);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
                function14 = function13;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                function14 = function12;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.lib.accountswitcher.AccountListKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AccountList.AccountList$lambda$10(rows, rowKey, includeHeaderPadding, contentPadding, modifier3, function14, rowContent, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        if ((i2 & 64) == 0) {
        }
        if ((i3 & 599187) == 599186) {
            if (i6 == 0) {
            }
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(5004770);
            if ((i3 & 14) != 4) {
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z) {
                    objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.lib.accountswitcher.AccountListKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AccountSwitcherUtils2.generateAccountSections(rows);
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    snapshotState4 = (SnapshotState4) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierTestTag2 = TestTag3.testTag(modifier4, AccountSelectionList.AccountsColumnTestTag);
                    Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    zChanged = ((458752 & i3) != 131072) | composerStartRestartGroup.changed(snapshotState4) | ((i3 & 896) != 256) | ((i3 & 112) != 32) | ((3670016 & i3) != 1048576);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        final Function1 function152 = function12;
                        i5 = i3;
                        Function1 function162 = new Function1() { // from class: com.robinhood.android.lib.accountswitcher.AccountListKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AccountList.AccountList$lambda$9$lambda$8(function152, snapshotState4, rowKey, includeHeaderPadding, rowContent, (LazyListScope) obj);
                            }
                        };
                        function13 = function152;
                        composerStartRestartGroup.updateRememberedValue(function162);
                        objRememberedValue2 = function162;
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifier52 = modifier4;
                        LazyDslKt.LazyColumn(modifierTestTag2, null, contentPadding, false, null, centerHorizontally2, null, false, null, (Function1) objRememberedValue2, composerStartRestartGroup, ((i5 >> 3) & 896) | 196608, 474);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier52;
                        function14 = function13;
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountList$lambda$9$lambda$8(Function1 function1, SnapshotState4 snapshotState4, final Function1 function12, final Function1 function13, final Function4 function4, LazyListScope LazyColumn) {
        LazyListScope lazyListScope;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        function1.invoke(LazyColumn);
        final int i = 0;
        for (Object obj : AccountList$lambda$4(snapshotState4)) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            final AccountSwitcherUtils accountSwitcherUtils = (AccountSwitcherUtils) obj;
            if (accountSwitcherUtils instanceof AccountSwitcherUtils.WithHeader) {
                lazyListScope = LazyColumn;
                LazyListScope.item$default(lazyListScope, null, "account-header", ComposableLambda3.composableLambdaInstance(548702576, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.lib.accountswitcher.AccountListKt$AccountList$2$1$1$1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                        invoke(lazyItemScope, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(LazyItemScope item, Composer composer, int i3) {
                        Intrinsics.checkNotNullParameter(item, "$this$item");
                        if ((i3 & 17) == 16 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(548702576, i3, -1, "com.robinhood.android.lib.accountswitcher.AccountList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AccountList.kt:57)");
                        }
                        AccountHeader.AccountHeaderText(((AccountSwitcherUtils.WithHeader) accountSwitcherUtils).getHeaderText(), function13.invoke(Integer.valueOf(i)).booleanValue(), null, composer, StringResource.$stable, 4);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), 1, null);
            } else {
                lazyListScope = LazyColumn;
            }
            final List rows = accountSwitcherUtils.getRows();
            final Function1 function14 = new Function1() { // from class: com.robinhood.android.lib.accountswitcher.AccountListKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return AccountList.AccountList$lambda$9$lambda$8$lambda$7$lambda$5((AccountSwitcherRow) obj2);
                }
            };
            lazyListScope.items(rows.size(), function12 != null ? new Function1<Integer, Object>() { // from class: com.robinhood.android.lib.accountswitcher.AccountListKt$AccountList$lambda$9$lambda$8$lambda$7$$inlined$items$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int i3) {
                    return function12.invoke(rows.get(i3));
                }
            } : null, new Function1<Integer, Object>() { // from class: com.robinhood.android.lib.accountswitcher.AccountListKt$AccountList$lambda$9$lambda$8$lambda$7$$inlined$items$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int i3) {
                    return function14.invoke(rows.get(i3));
                }
            }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.lib.accountswitcher.AccountListKt$AccountList$lambda$9$lambda$8$lambda$7$$inlined$items$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                    invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope lazyItemScope, int i3, Composer composer, int i4) {
                    int i5;
                    if ((i4 & 6) == 0) {
                        i5 = (composer.changed(lazyItemScope) ? 4 : 2) | i4;
                    } else {
                        i5 = i4;
                    }
                    if ((i4 & 48) == 0) {
                        i5 |= composer.changed(i3) ? 32 : 16;
                    }
                    if (!composer.shouldExecute((i5 & 147) != 146, i5 & 1)) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-632812321, i5, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                    }
                    AccountSwitcherRow accountSwitcherRow = (AccountSwitcherRow) rows.get(i3);
                    composer.startReplaceGroup(1519182705);
                    function4.invoke(lazyItemScope, accountSwitcherRow, composer, Integer.valueOf(i5 & 14));
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
            i = i2;
            LazyColumn = lazyListScope;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object AccountList$lambda$9$lambda$8$lambda$7$lambda$5(AccountSwitcherRow it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return "account-row";
    }

    private static final <T extends AccountSwitcherRow> List<AccountSwitcherUtils<T>> AccountList$lambda$4(SnapshotState4<? extends List<? extends AccountSwitcherUtils<? extends T>>> snapshotState4) {
        return snapshotState4.getValue();
    }
}
