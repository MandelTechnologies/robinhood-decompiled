package com.truelayer.payments.p419ui.screens.providerselection.components;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.truelayer.payments.p419ui.C42830R;
import com.truelayer.payments.p419ui.components.SearchOptions;
import com.truelayer.payments.p419ui.components.SearchableItems4;
import com.truelayer.payments.p419ui.models.Country;
import com.truelayer.payments.p419ui.models.QueryState;
import com.truelayer.payments.p419ui.utils.TestTags;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CountrySelectionList.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aQ\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0001¢\u0006\u0002\u0010\f¨\u0006\r"}, m3636d2 = {"CountrySelectionList", "", "title", "", "query", "Lcom/truelayer/payments/ui/models/QueryState;", "countries", "", "Lcom/truelayer/payments/ui/models/Country;", "selectedCountry", "onSelect", "Lkotlin/Function1;", "(Ljava/lang/String;Lcom/truelayer/payments/ui/models/QueryState;Ljava/util/List;Lcom/truelayer/payments/ui/models/Country;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "payments-ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.truelayer.payments.ui.screens.providerselection.components.CountrySelectionListKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class CountrySelectionList {
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CountrySelectionList(String str, final QueryState query, List<Country> list, Country country, Function1<? super Country, Unit> function1, Composer composer, final int i, final int i2) {
        final String strStringResource;
        int i3;
        Function1<? super Country, Unit> function12;
        List<Country> list2;
        final Country country2;
        final Function1<? super Country, Unit> function13;
        final List<Country> list3;
        final Country country3;
        final Function1<? super Country, Unit> function14;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(query, "query");
        Composer composerStartRestartGroup = composer.startRestartGroup(1564298650);
        if ((i & 14) == 0) {
            if ((i2 & 1) == 0) {
                strStringResource = str;
                int i4 = composerStartRestartGroup.changed(strStringResource) ? 4 : 2;
                i3 = i | i4;
            } else {
                strStringResource = str;
            }
            i3 = i | i4;
        } else {
            strStringResource = str;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(query) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 1024;
        }
        int i7 = i2 & 16;
        if (i7 == 0) {
            if ((i & 57344) == 0) {
                function12 = function1;
                i3 |= composerStartRestartGroup.changedInstance(function12) ? 16384 : 8192;
            }
            if ((i2 & 12) == 12 || (46811 & i3) != 9362 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    if ((i2 & 1) != 0) {
                        strStringResource = StringResources_androidKt.stringResource(C42830R.string.choose_your_country, composerStartRestartGroup, 0);
                        i3 &= -15;
                    }
                    List<Country> listEmptyList = i5 == 0 ? CollectionsKt.emptyList() : list;
                    Country country4 = i6 == 0 ? null : country;
                    if (i7 == 0) {
                        list2 = listEmptyList;
                        country2 = country4;
                        function13 = new Function1<Country, Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.components.CountrySelectionListKt.CountrySelectionList.1
                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Country it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Country country5) {
                                invoke2(country5);
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1564298650, i3, -1, "com.truelayer.payments.ui.screens.providerselection.components.CountrySelectionList (CountrySelectionList.kt:20)");
                        }
                        List<Country> list4 = list2;
                        int i8 = i3 << 3;
                        SearchableItems4.SearchableItems(TestTag3.testTag(Modifier.INSTANCE, TestTags.COUNTRIES_LIST), strStringResource, query, new SearchOptions(list2, null, null, 6, null), null, ComposableLambda3.composableLambda(composerStartRestartGroup, 859589676, true, new Function3<Country, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.components.CountrySelectionListKt.CountrySelectionList.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Country country5, Composer composer2, Integer num) {
                                invoke(country5, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Country it, Composer composer2, int i9) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(859589676, i9, -1, "com.truelayer.payments.ui.screens.providerselection.components.CountrySelectionList.<anonymous> (CountrySelectionList.kt:27)");
                                }
                                String countryCode = it.getCountryCode();
                                Country country5 = country2;
                                CountrySelectionRow3.CountrySelectionRow(it, Intrinsics.areEqual(countryCode, country5 != null ? country5.getCountryCode() : null), function13, composer2, 8);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), null, composerStartRestartGroup, (i8 & 896) | (i8 & 112) | 200710, 80);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        list3 = list4;
                        country3 = country2;
                        function14 = function13;
                    } else {
                        list2 = listEmptyList;
                        country2 = country4;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 1) != 0) {
                        i3 &= -15;
                    }
                    list2 = list;
                    country2 = country;
                }
                function13 = function12;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                List<Country> list42 = list2;
                int i82 = i3 << 3;
                SearchableItems4.SearchableItems(TestTag3.testTag(Modifier.INSTANCE, TestTags.COUNTRIES_LIST), strStringResource, query, new SearchOptions(list2, null, null, 6, null), null, ComposableLambda3.composableLambda(composerStartRestartGroup, 859589676, true, new Function3<Country, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.components.CountrySelectionListKt.CountrySelectionList.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Country country5, Composer composer2, Integer num) {
                        invoke(country5, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Country it, Composer composer2, int i9) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(859589676, i9, -1, "com.truelayer.payments.ui.screens.providerselection.components.CountrySelectionList.<anonymous> (CountrySelectionList.kt:27)");
                        }
                        String countryCode = it.getCountryCode();
                        Country country5 = country2;
                        CountrySelectionRow3.CountrySelectionRow(it, Intrinsics.areEqual(countryCode, country5 != null ? country5.getCountryCode() : null), function13, composer2, 8);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), null, composerStartRestartGroup, (i82 & 896) | (i82 & 112) | 200710, 80);
                if (ComposerKt.isTraceInProgress()) {
                }
                list3 = list42;
                country3 = country2;
                function14 = function13;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                list3 = list;
                country3 = country;
                function14 = function12;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.components.CountrySelectionListKt.CountrySelectionList.3
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

                    public final void invoke(Composer composer2, int i9) {
                        CountrySelectionList.CountrySelectionList(strStringResource, query, list3, country3, function14, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        function12 = function1;
        if ((i2 & 12) == 12) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if ((i2 & 1) != 0) {
                }
                if (i5 == 0) {
                }
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
