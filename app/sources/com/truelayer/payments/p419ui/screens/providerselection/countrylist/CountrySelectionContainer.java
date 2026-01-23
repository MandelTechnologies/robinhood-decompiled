package com.truelayer.payments.p419ui.screens.providerselection.countrylist;

import android.content.Context;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.LayoutKt;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.view.compose.BackHandler;
import com.truelayer.payments.p419ui.C42830R;
import com.truelayer.payments.p419ui.components.toolbars.SearchBarKt;
import com.truelayer.payments.p419ui.models.Country;
import com.truelayer.payments.p419ui.models.QueryState;
import com.truelayer.payments.p419ui.screens.providerselection.ProviderSelectionScreen;
import com.truelayer.payments.p419ui.screens.providerselection.components.CountrySelectionList;
import com.truelayer.payments.p419ui.screens.searchselect.components.EmptyView;
import com.truelayer.payments.p419ui.utils.ContentChangeAccessibilityAnnouncement;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: CountrySelectionContainer.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0001¢\u0006\u0002\u0010\u0007\u001a=\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000eH\u0001¢\u0006\u0002\u0010\u000f¨\u0006\u0010²\u0006\n\u0010\u0002\u001a\u00020\u0003X\u008a\u008e\u0002"}, m3636d2 = {"CountrySelectionAccessibilityAnnouncements", "", "query", "Lcom/truelayer/payments/ui/models/QueryState;", "countries", "", "Lcom/truelayer/payments/ui/models/Country;", "(Lcom/truelayer/payments/ui/models/QueryState;Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", "CountrySelectionContainer", "screen", "Lcom/truelayer/payments/ui/screens/providerselection/ProviderSelectionScreen$CountrySelection;", "onCountrySelected", "Lkotlin/Function1;", "onAbort", "Lkotlin/Function0;", "(Lcom/truelayer/payments/ui/screens/providerselection/ProviderSelectionScreen$CountrySelection;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "payments-ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.truelayer.payments.ui.screens.providerselection.countrylist.CountrySelectionContainerKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class CountrySelectionContainer {
    public static final void CountrySelectionAccessibilityAnnouncements(final QueryState query, final List<Country> countries, Composer composer, final int i) {
        String string2;
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(countries, "countries");
        Composer composerStartRestartGroup = composer.startRestartGroup(1618566713);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1618566713, i, -1, "com.truelayer.payments.ui.screens.providerselection.countrylist.CountrySelectionAccessibilityAnnouncements (CountrySelectionContainer.kt:28)");
        }
        Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        int size = countries.size();
        if (!StringsKt.isBlank(query.getInner())) {
            if (size > 0) {
                string2 = context.getString(C42830R.string.accessibility_number_of_items_in_search_result, context.getResources().getQuantityString(C42830R.plurals.items, size, Integer.valueOf(size)));
            } else {
                string2 = context.getString(C42830R.string.country_not_found) + ". " + context.getString(C42830R.string.country_not_found_desc);
            }
            Intrinsics.checkNotNull(string2);
            ContentChangeAccessibilityAnnouncement.ContentChangeAccessibilityAnnouncement(query.getInner(), string2, composerStartRestartGroup, 0);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.countrylist.CountrySelectionContainerKt.CountrySelectionAccessibilityAnnouncements.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    CountrySelectionContainer.CountrySelectionAccessibilityAnnouncements(query, countries, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final void CountrySelectionContainer(final ProviderSelectionScreen.CountrySelection screen, Function1<? super Country, Unit> function1, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Composer composerStartRestartGroup = composer.startRestartGroup(1888266746);
        final Function1<? super Country, Unit> function12 = (i2 & 2) != 0 ? new Function1<Country, Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.countrylist.CountrySelectionContainerKt.CountrySelectionContainer.1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Country it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Country country) {
                invoke2(country);
                return Unit.INSTANCE;
            }
        } : function1;
        final Function0<Unit> function02 = (i2 & 4) != 0 ? null : function0;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1888266746, i, -1, "com.truelayer.payments.ui.screens.providerselection.countrylist.CountrySelectionContainer (CountrySelectionContainer.kt:51)");
        }
        composerStartRestartGroup.startReplaceableGroup(1651121692);
        boolean z = (((i & 896) ^ 384) > 256 && composerStartRestartGroup.changed(function02)) || (i & 384) == 256;
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.countrylist.CountrySelectionContainerKt$CountrySelectionContainer$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    Function0<Unit> function03 = function02;
                    if (function03 != null) {
                        function03.invoke();
                    }
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        BackHandler.BackHandler(false, (Function0) objRememberedValue, composerStartRestartGroup, 0, 1);
        composerStartRestartGroup.startReplaceableGroup(1651121743);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = SnapshotState3.mutableStateOf$default(QueryState.INSTANCE.mo27021default(), null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        final SnapshotState snapshotState = (SnapshotState) objRememberedValue2;
        composerStartRestartGroup.endReplaceableGroup();
        final List list = (List) ((Function2) screen.getSortAndFilter()).invoke(screen.getCountries(), CountrySelectionContainer$lambda$2(snapshotState).getInner());
        CountrySelectionAccessibilityAnnouncements(CountrySelectionContainer$lambda$2(snapshotState), list, composerStartRestartGroup, 64);
        ComposableLambda composableLambda = ComposableLambda3.composableLambda(composerStartRestartGroup, -73537346, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.countrylist.CountrySelectionContainerKt.CountrySelectionContainer.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i3) {
                if ((i3 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-73537346, i3, -1, "com.truelayer.payments.ui.screens.providerselection.countrylist.CountrySelectionContainer.<anonymous> (CountrySelectionContainer.kt:65)");
                    }
                    String strStringResource = StringResources_androidKt.stringResource(C42830R.string.choose_your_country, composer2, 0);
                    QueryState queryStateCountrySelectionContainer$lambda$2 = CountrySelectionContainer.CountrySelectionContainer$lambda$2(snapshotState);
                    composer2.startReplaceableGroup(911915825);
                    final SnapshotState<QueryState> snapshotState2 = snapshotState;
                    Object objRememberedValue3 = composer2.rememberedValue();
                    if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new Function1<QueryState, Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.countrylist.CountrySelectionContainerKt$CountrySelectionContainer$3$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(QueryState queryState) {
                                invoke2(queryState);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(QueryState newQuery) {
                                Intrinsics.checkNotNullParameter(newQuery, "newQuery");
                                snapshotState2.setValue(newQuery);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    composer2.endReplaceableGroup();
                    SearchBarKt.SearchBar(strStringResource, null, false, queryStateCountrySelectionContainer$lambda$2, (Function1) objRememberedValue3, function02, null, composer2, 24624, 68);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        });
        ComposableLambda composableLambda2 = ComposableLambda3.composableLambda(composerStartRestartGroup, -548535543, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.countrylist.CountrySelectionContainerKt.CountrySelectionContainer.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer2, Integer num) {
                invoke(paddingValues, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(PaddingValues it, Composer composer2, int i3) {
                Composer composer3;
                Intrinsics.checkNotNullParameter(it, "it");
                if ((i3 & 14) == 0) {
                    i3 |= composer2.changed(it) ? 4 : 2;
                }
                if ((i3 & 91) != 18 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-548535543, i3, -1, "com.truelayer.payments.ui.screens.providerselection.countrylist.CountrySelectionContainer.<anonymous> (CountrySelectionContainer.kt:74)");
                    }
                    Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), it);
                    List<Country> list2 = list;
                    ProviderSelectionScreen.CountrySelection countrySelection = screen;
                    Function1<Country, Unit> function13 = function12;
                    SnapshotState<QueryState> snapshotState2 = snapshotState;
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierPadding);
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    if (!list2.isEmpty()) {
                        composer2.startReplaceableGroup(-1239503388);
                        composer3 = composer2;
                        CountrySelectionList.CountrySelectionList(null, CountrySelectionContainer.CountrySelectionContainer$lambda$2(snapshotState2), list2, countrySelection.getSelectedCountry(), function13, composer3, 4608, 1);
                        composer3.endReplaceableGroup();
                    } else {
                        composer3 = composer2;
                        composer3.startReplaceableGroup(-1239503122);
                        EmptyView.EmptyView(C42830R.string.country_not_found, C42830R.string.country_not_found_desc, composer3, 0, 0);
                        composer3.endReplaceableGroup();
                    }
                    composer3.endReplaceableGroup();
                    composer3.endNode();
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        });
        final Function0<Unit> function03 = function02;
        ScaffoldKt.m5939ScaffoldTvnljyQ(null, composableLambda, null, null, null, 0, 0L, 0L, null, composableLambda2, composerStartRestartGroup, 805306416, 509);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Function1<? super Country, Unit> function13 = function12;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.countrylist.CountrySelectionContainerKt.CountrySelectionContainer.5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    CountrySelectionContainer.CountrySelectionContainer(screen, function13, function03, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final QueryState CountrySelectionContainer$lambda$2(SnapshotState<QueryState> snapshotState) {
        return snapshotState.getValue();
    }
}
