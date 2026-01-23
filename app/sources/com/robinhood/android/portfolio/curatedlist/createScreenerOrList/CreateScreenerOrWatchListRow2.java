package com.robinhood.android.portfolio.curatedlist.createScreenerOrList;

import android.content.Context;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet3;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.common.contracts.CuratedListKey;
import com.robinhood.android.equities.contracts.EquityScreenerTableFragmentKey;
import com.robinhood.android.equities.equityscreener.crud.create.CreateScreenerComposable3;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.portfolio.curatedlist.C25624R;
import com.robinhood.android.portfolio.curatedlist.createScreenerOrList.CreateScreenerOrWatchListRow2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.equityscreener.models.api.ScreenerOrder;
import com.robinhood.equityscreener.models.p294db.Screener;
import com.robinhood.models.p320db.CuratedList;
import com.robinhood.shared.portfolio.lists.p391ui.UserListRowComposable5;
import com.robinhood.shared.portfolio.lists.p391ui.UserListRowComposable6;
import com.robinhood.shared.portfolio.lists.p391ui.UserListRowComposable7;
import com.robinhood.shared.portfolio.lists.p391ui.modals.create.CreateWatchlistComposable;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CreateScreenerOrWatchListRow.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u001a!\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a*\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0002¨\u0006\u000e²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u008e\u0002"}, m3636d2 = {"CreateScreenerOrWatchlistRow", "", "accountNumber", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "navigateCreateScreener", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "context", "Landroid/content/Context;", "screener", "Lcom/robinhood/equityscreener/models/db/Screener;", "lib-curated-list_externalDebug", "bottomSheetState", "Lcom/robinhood/android/portfolio/curatedlist/createScreenerOrList/BottomSheetState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.portfolio.curatedlist.createScreenerOrList.CreateScreenerOrWatchListRowKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class CreateScreenerOrWatchListRow2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateScreenerOrWatchlistRow$lambda$7(String str, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CreateScreenerOrWatchlistRow(str, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CreateScreenerOrWatchlistRow(final String str, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        Object objRememberedValue2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1181408930);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1181408930, i3, -1, "com.robinhood.android.portfolio.curatedlist.createScreenerOrList.CreateScreenerOrWatchlistRow (CreateScreenerOrWatchListRow.kt:40)");
                }
                final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(CreateScreenerOrWatchListRow.HIDDEN, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                UserListRowComposable7.BaseRow baseRow = new UserListRowComposable7.BaseRow(StringResource.INSTANCE.invoke(C25624R.string.watchlist_create_screener_list_choose, new Object[0]), new UserListRowComposable6.BentoIconAsset(ServerToBentoAssetMapper2.PLUS_24), null, null, 4, null);
                composerStartRestartGroup.startReplaceGroup(5004770);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.portfolio.curatedlist.createScreenerOrList.CreateScreenerOrWatchListRowKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CreateScreenerOrWatchListRow2.CreateScreenerOrWatchlistRow$lambda$4$lambda$3(snapshotState);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                UserListRowComposable5.UserListRowComposable(baseRow, (Function0) objRememberedValue2, modifier3, false, null, composerStartRestartGroup, UserListRowComposable7.BaseRow.$stable | 48 | ((i3 << 3) & 896), 24);
                Modifier modifier4 = modifier3;
                if (CreateScreenerOrWatchlistRow$lambda$1(snapshotState) == CreateScreenerOrWatchListRow.HIDDEN) {
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new Function0() { // from class: com.robinhood.android.portfolio.curatedlist.createScreenerOrList.CreateScreenerOrWatchListRowKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CreateScreenerOrWatchListRow2.CreateScreenerOrWatchlistRow$lambda$6$lambda$5(snapshotState);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-178629930, true, new Function3<RhModalBottomSheet5, Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.curatedlist.createScreenerOrList.CreateScreenerOrWatchListRowKt.CreateScreenerOrWatchlistRow.3

                        /* compiled from: CreateScreenerOrWatchListRow.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.portfolio.curatedlist.createScreenerOrList.CreateScreenerOrWatchListRowKt$CreateScreenerOrWatchlistRow$3$1, reason: invalid class name */
                        static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                            final /* synthetic */ String $accountNumber;
                            final /* synthetic */ SnapshotState<CreateScreenerOrWatchListRow> $bottomSheetState$delegate;
                            final /* synthetic */ Context $context;
                            final /* synthetic */ Navigator $navigator;
                            final /* synthetic */ RhModalBottomSheet5 $this_RhModalBottomSheet;

                            AnonymousClass1(RhModalBottomSheet5 rhModalBottomSheet5, Navigator navigator, Context context, String str, SnapshotState<CreateScreenerOrWatchListRow> snapshotState) {
                                this.$this_RhModalBottomSheet = rhModalBottomSheet5;
                                this.$navigator = navigator;
                                this.$context = context;
                                this.$accountNumber = str;
                                this.$bottomSheetState$delegate = snapshotState;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                invoke(composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$3$lambda$2(SnapshotState snapshotState) {
                                CreateScreenerOrWatchListRow2.CreateScreenerOrWatchlistRow$lambda$2(snapshotState, CreateScreenerOrWatchListRow.CREATE_WATCHLIST);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$5$lambda$4(RhModalBottomSheet5 rhModalBottomSheet5) {
                                RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$1$lambda$0(SnapshotState snapshotState) {
                                CreateScreenerOrWatchListRow2.CreateScreenerOrWatchlistRow$lambda$2(snapshotState, CreateScreenerOrWatchListRow.CREATE_SCREENER);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$7$lambda$6(RhModalBottomSheet5 rhModalBottomSheet5, Navigator navigator, Context context, String str, CuratedList curatedList) {
                                Intrinsics.checkNotNullParameter(curatedList, "curatedList");
                                RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
                                Navigator.DefaultImpls.showFragment$default(navigator, context, new CuratedListKey.UserList(curatedList.getId(), true, str), false, false, false, null, false, null, false, false, null, null, 4092, null);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$9$lambda$8(SnapshotState snapshotState) {
                                CreateScreenerOrWatchListRow2.CreateScreenerOrWatchlistRow$lambda$2(snapshotState, CreateScreenerOrWatchListRow.CREATE);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$11$lambda$10(Screener it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$13$lambda$12(Navigator navigator, Context context, String str, RhModalBottomSheet5 rhModalBottomSheet5, Screener screener) {
                                Intrinsics.checkNotNullParameter(screener, "screener");
                                CreateScreenerOrWatchListRow2.navigateCreateScreener(navigator, context, screener, str);
                                RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$15$lambda$14(SnapshotState snapshotState) {
                                CreateScreenerOrWatchListRow2.CreateScreenerOrWatchlistRow$lambda$2(snapshotState, CreateScreenerOrWatchListRow.CREATE);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer, int i) {
                                if ((i & 3) == 2 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1281824223, i, -1, "com.robinhood.android.portfolio.curatedlist.createScreenerOrList.CreateScreenerOrWatchlistRow.<anonymous>.<anonymous> (CreateScreenerOrWatchListRow.kt:62)");
                                }
                                if (CreateScreenerOrWatchListRow2.CreateScreenerOrWatchlistRow$lambda$1(this.$bottomSheetState$delegate) == CreateScreenerOrWatchListRow.CREATE) {
                                    composer.startReplaceGroup(822539863);
                                    composer.startReplaceGroup(5004770);
                                    final SnapshotState<CreateScreenerOrWatchListRow> snapshotState = this.$bottomSheetState$delegate;
                                    Object objRememberedValue = composer.rememberedValue();
                                    Composer.Companion companion = Composer.INSTANCE;
                                    if (objRememberedValue == companion.getEmpty()) {
                                        objRememberedValue = new Function0() { // from class: com.robinhood.android.portfolio.curatedlist.createScreenerOrList.CreateScreenerOrWatchListRowKt$CreateScreenerOrWatchlistRow$3$1$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return CreateScreenerOrWatchListRow2.C256463.AnonymousClass1.invoke$lambda$1$lambda$0(snapshotState);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    Function0 function0 = (Function0) objRememberedValue;
                                    composer.endReplaceGroup();
                                    composer.startReplaceGroup(5004770);
                                    final SnapshotState<CreateScreenerOrWatchListRow> snapshotState2 = this.$bottomSheetState$delegate;
                                    Object objRememberedValue2 = composer.rememberedValue();
                                    if (objRememberedValue2 == companion.getEmpty()) {
                                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.portfolio.curatedlist.createScreenerOrList.CreateScreenerOrWatchListRowKt$CreateScreenerOrWatchlistRow$3$1$$ExternalSyntheticLambda1
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return CreateScreenerOrWatchListRow2.C256463.AnonymousClass1.invoke$lambda$3$lambda$2(snapshotState2);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue2);
                                    }
                                    Function0 function02 = (Function0) objRememberedValue2;
                                    composer.endReplaceGroup();
                                    composer.startReplaceGroup(5004770);
                                    boolean zChangedInstance = composer.changedInstance(this.$this_RhModalBottomSheet);
                                    final RhModalBottomSheet5 rhModalBottomSheet5 = this.$this_RhModalBottomSheet;
                                    Object objRememberedValue3 = composer.rememberedValue();
                                    if (zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                                        objRememberedValue3 = new Function0() { // from class: com.robinhood.android.portfolio.curatedlist.createScreenerOrList.CreateScreenerOrWatchListRowKt$CreateScreenerOrWatchlistRow$3$1$$ExternalSyntheticLambda2
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return CreateScreenerOrWatchListRow2.C256463.AnonymousClass1.invoke$lambda$5$lambda$4(rhModalBottomSheet5);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue3);
                                    }
                                    composer.endReplaceGroup();
                                    CreateScreenerOrListComposable3.CreateScreenerOrListComposable(function0, function02, (Function0) objRememberedValue3, null, composer, 54, 8);
                                    composer.endReplaceGroup();
                                } else if (CreateScreenerOrWatchListRow2.CreateScreenerOrWatchlistRow$lambda$1(this.$bottomSheetState$delegate) == CreateScreenerOrWatchListRow.CREATE_WATCHLIST) {
                                    composer.startReplaceGroup(822558669);
                                    composer.startReplaceGroup(-1224400529);
                                    boolean zChangedInstance2 = composer.changedInstance(this.$this_RhModalBottomSheet) | composer.changedInstance(this.$navigator) | composer.changedInstance(this.$context) | composer.changed(this.$accountNumber);
                                    final RhModalBottomSheet5 rhModalBottomSheet52 = this.$this_RhModalBottomSheet;
                                    final Navigator navigator = this.$navigator;
                                    final Context context = this.$context;
                                    final String str = this.$accountNumber;
                                    Object objRememberedValue4 = composer.rememberedValue();
                                    if (zChangedInstance2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue4 = new Function1() { // from class: com.robinhood.android.portfolio.curatedlist.createScreenerOrList.CreateScreenerOrWatchListRowKt$CreateScreenerOrWatchlistRow$3$1$$ExternalSyntheticLambda3
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return CreateScreenerOrWatchListRow2.C256463.AnonymousClass1.invoke$lambda$7$lambda$6(rhModalBottomSheet52, navigator, context, str, (CuratedList) obj);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue4);
                                    }
                                    Function1 function1 = (Function1) objRememberedValue4;
                                    composer.endReplaceGroup();
                                    composer.startReplaceGroup(5004770);
                                    final SnapshotState<CreateScreenerOrWatchListRow> snapshotState3 = this.$bottomSheetState$delegate;
                                    Object objRememberedValue5 = composer.rememberedValue();
                                    if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue5 = new Function0() { // from class: com.robinhood.android.portfolio.curatedlist.createScreenerOrList.CreateScreenerOrWatchListRowKt$CreateScreenerOrWatchlistRow$3$1$$ExternalSyntheticLambda4
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return CreateScreenerOrWatchListRow2.C256463.AnonymousClass1.invoke$lambda$9$lambda$8(snapshotState3);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue5);
                                    }
                                    composer.endReplaceGroup();
                                    CreateWatchlistComposable.CreateWatchlistComposable(function1, (Function0) objRememberedValue5, null, null, composer, 48, 12);
                                    composer.endReplaceGroup();
                                } else if (CreateScreenerOrWatchListRow2.CreateScreenerOrWatchlistRow$lambda$1(this.$bottomSheetState$delegate) == CreateScreenerOrWatchListRow.CREATE_SCREENER) {
                                    composer.startReplaceGroup(822584150);
                                    ScreenerOrder screenerOrder = (ScreenerOrder) ScreenerOrder.INSTANCE.getDefault();
                                    composer.startReplaceGroup(1849434622);
                                    Object objRememberedValue6 = composer.rememberedValue();
                                    Composer.Companion companion2 = Composer.INSTANCE;
                                    if (objRememberedValue6 == companion2.getEmpty()) {
                                        objRememberedValue6 = new Function1() { // from class: com.robinhood.android.portfolio.curatedlist.createScreenerOrList.CreateScreenerOrWatchListRowKt$CreateScreenerOrWatchlistRow$3$1$$ExternalSyntheticLambda5
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return CreateScreenerOrWatchListRow2.C256463.AnonymousClass1.invoke$lambda$11$lambda$10((Screener) obj);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue6);
                                    }
                                    Function1 function12 = (Function1) objRememberedValue6;
                                    composer.endReplaceGroup();
                                    composer.startReplaceGroup(-1224400529);
                                    boolean zChangedInstance3 = composer.changedInstance(this.$navigator) | composer.changedInstance(this.$context) | composer.changed(this.$accountNumber) | composer.changedInstance(this.$this_RhModalBottomSheet);
                                    final Navigator navigator2 = this.$navigator;
                                    final Context context2 = this.$context;
                                    final String str2 = this.$accountNumber;
                                    final RhModalBottomSheet5 rhModalBottomSheet53 = this.$this_RhModalBottomSheet;
                                    Object objRememberedValue7 = composer.rememberedValue();
                                    if (zChangedInstance3 || objRememberedValue7 == companion2.getEmpty()) {
                                        objRememberedValue7 = new Function1() { // from class: com.robinhood.android.portfolio.curatedlist.createScreenerOrList.CreateScreenerOrWatchListRowKt$CreateScreenerOrWatchlistRow$3$1$$ExternalSyntheticLambda6
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return CreateScreenerOrWatchListRow2.C256463.AnonymousClass1.invoke$lambda$13$lambda$12(navigator2, context2, str2, rhModalBottomSheet53, (Screener) obj);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue7);
                                    }
                                    Function1 function13 = (Function1) objRememberedValue7;
                                    composer.endReplaceGroup();
                                    composer.startReplaceGroup(5004770);
                                    final SnapshotState<CreateScreenerOrWatchListRow> snapshotState4 = this.$bottomSheetState$delegate;
                                    Object objRememberedValue8 = composer.rememberedValue();
                                    if (objRememberedValue8 == companion2.getEmpty()) {
                                        objRememberedValue8 = new Function0() { // from class: com.robinhood.android.portfolio.curatedlist.createScreenerOrList.CreateScreenerOrWatchListRowKt$CreateScreenerOrWatchlistRow$3$1$$ExternalSyntheticLambda7
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return CreateScreenerOrWatchListRow2.C256463.AnonymousClass1.invoke$lambda$15$lambda$14(snapshotState4);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue8);
                                    }
                                    composer.endReplaceGroup();
                                    CreateScreenerComposable3.CreateScreenerComposable(screenerOrder, function12, function13, (Function0) objRememberedValue8, null, composer, 3120, 16);
                                    composer.endReplaceGroup();
                                } else {
                                    composer.startReplaceGroup(-268919039);
                                    composer.endReplaceGroup();
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer2, Integer num) {
                            invoke(rhModalBottomSheet5, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(RhModalBottomSheet5 RhModalBottomSheet, Composer composer2, int i5) {
                            Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
                            if ((i5 & 6) == 0) {
                                i5 |= (i5 & 8) == 0 ? composer2.changed(RhModalBottomSheet) : composer2.changedInstance(RhModalBottomSheet) ? 4 : 2;
                            }
                            if ((i5 & 19) == 18 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-178629930, i5, -1, "com.robinhood.android.portfolio.curatedlist.createScreenerOrList.CreateScreenerOrWatchlistRow.<anonymous> (CreateScreenerOrWatchListRow.kt:61)");
                            }
                            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1281824223, true, new AnonymousClass1(RhModalBottomSheet, navigator, context, str, snapshotState), composer2, 54), composer2, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54);
                    composerStartRestartGroup = composerStartRestartGroup;
                    RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI((Function0) objRememberedValue3, null, false, null, null, 0L, composableLambdaRememberComposableLambda, composerStartRestartGroup, 1572870, 62);
                } else {
                    composerStartRestartGroup = composerStartRestartGroup;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.portfolio.curatedlist.createScreenerOrList.CreateScreenerOrWatchListRowKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CreateScreenerOrWatchListRow2.CreateScreenerOrWatchlistRow$lambda$7(str, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            final Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            final Navigator navigator2 = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            UserListRowComposable7.BaseRow baseRow2 = new UserListRowComposable7.BaseRow(StringResource.INSTANCE.invoke(C25624R.string.watchlist_create_screener_list_choose, new Object[0]), new UserListRowComposable6.BentoIconAsset(ServerToBentoAssetMapper2.PLUS_24), null, null, 4, null);
            composerStartRestartGroup.startReplaceGroup(5004770);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            UserListRowComposable5.UserListRowComposable(baseRow2, (Function0) objRememberedValue2, modifier3, false, null, composerStartRestartGroup, UserListRowComposable7.BaseRow.$stable | 48 | ((i3 << 3) & 896), 24);
            Modifier modifier42 = modifier3;
            if (CreateScreenerOrWatchlistRow$lambda$1(snapshotState) == CreateScreenerOrWatchListRow.HIDDEN) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = modifier42;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateScreenerOrWatchlistRow$lambda$4$lambda$3(SnapshotState snapshotState) {
        snapshotState.setValue(CreateScreenerOrWatchListRow.CREATE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateScreenerOrWatchlistRow$lambda$6$lambda$5(SnapshotState snapshotState) {
        snapshotState.setValue(CreateScreenerOrWatchListRow.HIDDEN);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateScreenerOrWatchListRow CreateScreenerOrWatchlistRow$lambda$1(SnapshotState<CreateScreenerOrWatchListRow> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CreateScreenerOrWatchlistRow$lambda$2(SnapshotState<CreateScreenerOrWatchListRow> snapshotState, CreateScreenerOrWatchListRow createScreenerOrWatchListRow) {
        snapshotState.setValue(createScreenerOrWatchListRow);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void navigateCreateScreener(Navigator navigator, Context context, Screener screener, String str) {
        Navigator.DefaultImpls.showFragment$default(navigator, context, new EquityScreenerTableFragmentKey(screener.getId(), "lists_section_preset", false, str, 4, null), false, false, false, null, false, null, false, false, null, null, 4084, null);
    }
}
