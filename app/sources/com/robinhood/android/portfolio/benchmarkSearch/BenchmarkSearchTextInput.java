package com.robinhood.android.portfolio.benchmarkSearch;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor2;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.models.portfolio.BenchmarkingSearchResults;
import com.robinhood.android.models.portfolio.BenchmarkingSearchSection;
import com.robinhood.android.portfolio.C25550R;
import com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchStateProvider3;
import com.robinhood.compose.bento.component.BentoTextInput4;
import com.robinhood.compose.bento.component.BentoTextInput8;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.app.type.AppType;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BenchmarkSearchTextInput.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a;\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\tH\u0001¢\u0006\u0002\u0010\u000b\"\u0010\u0010\f\u001a\u00020\n8\u0000X\u0081T¢\u0006\u0002\n\u0000¨\u0006\r²\u0006\n\u0010\u000e\u001a\u00020\nX\u008a\u008e\u0002"}, m3636d2 = {"BenchmarkSearchTextInput", "", "appType", "Lcom/robinhood/shared/app/type/AppType;", "viewState", "Lcom/robinhood/android/portfolio/benchmarkSearch/BenchmarkSearchViewState$Ready;", "modifier", "Landroidx/compose/ui/Modifier;", "onQueryChanged", "Lkotlin/Function1;", "", "(Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/android/portfolio/benchmarkSearch/BenchmarkSearchViewState$Ready;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "RETURNS_COMPARISON_SEARCH_IDENTIFIER", "feature-portfolio_externalDebug", "query"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchTextInputKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class BenchmarkSearchTextInput {
    public static final String RETURNS_COMPARISON_SEARCH_IDENTIFIER = "returns-comparison-search";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BenchmarkSearchTextInput$lambda$11(AppType appType, BenchmarkSearchStateProvider3.Ready ready, Modifier modifier, Function1 function1, int i, int i2, Composer composer, int i3) {
        BenchmarkSearchTextInput(appType, ready, modifier, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0104 A[LOOP:0: B:62:0x00fe->B:64:0x0104, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BenchmarkSearchTextInput(final AppType appType, final BenchmarkSearchStateProvider3.Ready viewState, Modifier modifier, final Function1<? super String, Unit> onQueryChanged, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        final EventLogger current;
        UserInteractionEventDescriptor userInteractionEventDescriptor;
        BenchmarkingSearchResults searchResults;
        boolean zChanged;
        Object objRememberedValue;
        Iterator<BenchmarkingSearchSection> it;
        Context context;
        boolean zChangedInstance;
        Object objRememberedValue2;
        UserInteractionEventDescriptor userInteractionEventDescriptor2;
        Context context2;
        Object objRememberedValue3;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        boolean z;
        Object objRememberedValue4;
        boolean zChangedInstance2;
        Object objRememberedValue5;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(onQueryChanged, "onQueryChanged");
        Composer composerStartRestartGroup = composer.startRestartGroup(885876181);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(appType.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(viewState) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onQueryChanged) ? 2048 : 1024;
            }
            i4 = i3;
            if ((i4 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(885876181, i4, -1, "com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchTextInput (BenchmarkSearchTextInput.kt:29)");
                }
                current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                searchResults = viewState.getSearchResults();
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChanged = composerStartRestartGroup.changed(userInteractionEventDescriptor) | composerStartRestartGroup.changed(searchResults);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Context contextOrNew = UserInteractionEventDescriptor2.orNew(userInteractionEventDescriptor.getContext());
                    String query = searchResults.getQuery();
                    ImmutableList<BenchmarkingSearchSection> sections = searchResults.getSections();
                    ArrayList arrayList = new ArrayList();
                    it = sections.iterator();
                    while (it.hasNext()) {
                        CollectionsKt.addAll(arrayList, it.next().getItems());
                    }
                    objRememberedValue = Context.copy$default(contextOrNew, 0, arrayList.size(), 0, null, null, query, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -35, -1, -1, -1, -1, -1, 16383, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                context = (Context) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                String query2 = searchResults.getQuery();
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChangedInstance = composerStartRestartGroup.changedInstance(searchResults) | composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor) | composerStartRestartGroup.changedInstance(context);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new BenchmarkSearchTextInput2(searchResults, current, userInteractionEventDescriptor, context, null);
                    userInteractionEventDescriptor2 = userInteractionEventDescriptor;
                    context2 = context;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    context2 = context;
                    userInteractionEventDescriptor2 = userInteractionEventDescriptor;
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(query2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = SnapshotState3.mutableStateOf$default(searchResults.getQuery(), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                snapshotState = (SnapshotState) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                String strBenchmarkSearchTextInput$lambda$4 = BenchmarkSearchTextInput$lambda$4(snapshotState);
                String strStringResource = StringResources_androidKt.stringResource((appType != AppType.RHC || appType == AppType.NCW) ? C25550R.string.gated_crypto_rhc_benchmark_search_hint_with_crypto : (viewState.getInEtfRegionGate() && viewState.getInCryptoRegionGate()) ? C25550R.string.benchmark_search_hint_with_stock_etf_crypto : viewState.getInEtfRegionGate() ? C25550R.string.benchmark_search_hint_with_stock_etf : viewState.getInCryptoRegionGate() ? C25550R.string.benchmark_search_hint_with_stock_crypto : C25550R.string.benchmark_search_hint_with_stock, composerStartRestartGroup, 0);
                BentoTextInput8.Icon.Size24 size24 = new BentoTextInput8.Icon.Size24(ServerToBentoAssetMapper2.SEARCH_16, null, null, 6, null);
                BentoTextInput8.Icon.Size24 size242 = new BentoTextInput8.Icon.Size24(ServerToBentoAssetMapper2.CLOSE_16, StringResources_androidKt.stringResource(C25550R.string.benchmark_search_clear, composerStartRestartGroup, 0), null, 4, null);
                if (StringsKt.isBlank(BenchmarkSearchTextInput$lambda$4(snapshotState))) {
                    size242 = null;
                }
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                int i6 = i4 & 7168;
                z = i6 != 2048;
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new Function1() { // from class: com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchTextInputKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return BenchmarkSearchTextInput.BenchmarkSearchTextInput$lambda$8$lambda$7(onQueryChanged, snapshotState, (String) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                Function1 function1 = (Function1) objRememberedValue4;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChangedInstance2 = composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor2) | composerStartRestartGroup.changedInstance(context2) | (i6 != 2048);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance2 || objRememberedValue5 == companion.getEmpty()) {
                    final UserInteractionEventDescriptor userInteractionEventDescriptor3 = userInteractionEventDescriptor2;
                    final Context context3 = context2;
                    Function0 function0 = new Function0() { // from class: com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchTextInputKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return BenchmarkSearchTextInput.BenchmarkSearchTextInput$lambda$10$lambda$9(current, userInteractionEventDescriptor3, context3, onQueryChanged, snapshotState);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(function0);
                    objRememberedValue5 = function0;
                }
                composerStartRestartGroup.endReplaceGroup();
                int i7 = BentoTextInput8.Icon.Size24.$stable;
                Modifier modifier5 = modifier4;
                BentoTextInput8.Icon.Size24 size243 = size242;
                composer2 = composerStartRestartGroup;
                BentoTextInput4.BentoTextInput(strBenchmarkSearchTextInput$lambda$4, function1, modifier5, null, strStringResource, null, null, size24, size243, (Function0) objRememberedValue5, null, null, null, false, false, composer2, (i4 & 896) | (i7 << 21) | (i7 << 24), 0, 31848);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchTextInputKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return BenchmarkSearchTextInput.BenchmarkSearchTextInput$lambda$11(appType, viewState, modifier3, onQueryChanged, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i2 & 8) == 0) {
        }
        i4 = i3;
        if ((i4 & 1171) == 1170) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            searchResults = viewState.getSearchResults();
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            zChanged = composerStartRestartGroup.changed(userInteractionEventDescriptor) | composerStartRestartGroup.changed(searchResults);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                Context contextOrNew2 = UserInteractionEventDescriptor2.orNew(userInteractionEventDescriptor.getContext());
                String query3 = searchResults.getQuery();
                ImmutableList<BenchmarkingSearchSection> sections2 = searchResults.getSections();
                ArrayList arrayList2 = new ArrayList();
                it = sections2.iterator();
                while (it.hasNext()) {
                }
                objRememberedValue = Context.copy$default(contextOrNew2, 0, arrayList2.size(), 0, null, null, query3, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -35, -1, -1, -1, -1, -1, 16383, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                context = (Context) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                String query22 = searchResults.getQuery();
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChangedInstance = composerStartRestartGroup.changedInstance(searchResults) | composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor) | composerStartRestartGroup.changedInstance(context);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance) {
                    objRememberedValue2 = new BenchmarkSearchTextInput2(searchResults, current, userInteractionEventDescriptor, context, null);
                    userInteractionEventDescriptor2 = userInteractionEventDescriptor;
                    context2 = context;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(query22, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue3 == companion.getEmpty()) {
                    }
                    snapshotState = (SnapshotState) objRememberedValue3;
                    composerStartRestartGroup.endReplaceGroup();
                    String strBenchmarkSearchTextInput$lambda$42 = BenchmarkSearchTextInput$lambda$4(snapshotState);
                    if (appType != AppType.RHC) {
                        String strStringResource2 = StringResources_androidKt.stringResource((appType != AppType.RHC || appType == AppType.NCW) ? C25550R.string.gated_crypto_rhc_benchmark_search_hint_with_crypto : (viewState.getInEtfRegionGate() && viewState.getInCryptoRegionGate()) ? C25550R.string.benchmark_search_hint_with_stock_etf_crypto : viewState.getInEtfRegionGate() ? C25550R.string.benchmark_search_hint_with_stock_etf : viewState.getInCryptoRegionGate() ? C25550R.string.benchmark_search_hint_with_stock_crypto : C25550R.string.benchmark_search_hint_with_stock, composerStartRestartGroup, 0);
                        BentoTextInput8.Icon.Size24 size244 = new BentoTextInput8.Icon.Size24(ServerToBentoAssetMapper2.SEARCH_16, null, null, 6, null);
                        BentoTextInput8.Icon.Size24 size2422 = new BentoTextInput8.Icon.Size24(ServerToBentoAssetMapper2.CLOSE_16, StringResources_androidKt.stringResource(C25550R.string.benchmark_search_clear, composerStartRestartGroup, 0), null, 4, null);
                        if (StringsKt.isBlank(BenchmarkSearchTextInput$lambda$4(snapshotState))) {
                        }
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        int i62 = i4 & 7168;
                        if (i62 != 2048) {
                        }
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (!z) {
                            objRememberedValue4 = new Function1() { // from class: com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchTextInputKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return BenchmarkSearchTextInput.BenchmarkSearchTextInput$lambda$8$lambda$7(onQueryChanged, snapshotState, (String) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            Function1 function12 = (Function1) objRememberedValue4;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(-1224400529);
                            zChangedInstance2 = composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor2) | composerStartRestartGroup.changedInstance(context2) | (i62 != 2048);
                            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                            if (!zChangedInstance2) {
                                final UserInteractionEventDescriptor userInteractionEventDescriptor32 = userInteractionEventDescriptor2;
                                final Context context32 = context2;
                                Function0 function02 = new Function0() { // from class: com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchTextInputKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return BenchmarkSearchTextInput.BenchmarkSearchTextInput$lambda$10$lambda$9(current, userInteractionEventDescriptor32, context32, onQueryChanged, snapshotState);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(function02);
                                objRememberedValue5 = function02;
                                composerStartRestartGroup.endReplaceGroup();
                                int i72 = BentoTextInput8.Icon.Size24.$stable;
                                Modifier modifier52 = modifier4;
                                BentoTextInput8.Icon.Size24 size2432 = size2422;
                                composer2 = composerStartRestartGroup;
                                BentoTextInput4.BentoTextInput(strBenchmarkSearchTextInput$lambda$42, function12, modifier52, null, strStringResource2, null, null, size244, size2432, (Function0) objRememberedValue5, null, null, null, false, false, composer2, (i4 & 896) | (i72 << 21) | (i72 << 24), 0, 31848);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier3 = modifier52;
                            }
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BenchmarkSearchTextInput$lambda$8$lambda$7(Function1 function1, SnapshotState snapshotState, String newQuery) {
        Intrinsics.checkNotNullParameter(newQuery, "newQuery");
        snapshotState.setValue(newQuery);
        function1.invoke(newQuery);
        return Unit.INSTANCE;
    }

    private static final String BenchmarkSearchTextInput$lambda$4(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BenchmarkSearchTextInput$lambda$10$lambda$9(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, Context context, Function1 function1, SnapshotState snapshotState) {
        EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.CLEAR_SEARCH_QUERY, userInteractionEventDescriptor.getScreen(), new Component(Component.ComponentType.CANCEL_BUTTON, RETURNS_COMPARISON_SEARCH_IDENTIFIER, null, 4, null), null, context, false, 40, null);
        snapshotState.setValue("");
        function1.invoke("");
        return Unit.INSTANCE;
    }
}
