package com.truelayer.payments.p419ui.screens.providerselection.components;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.models.api.pathfinder.userview.ApiRenderablePlatforms;
import com.truelayer.payments.p419ui.C42830R;
import com.truelayer.payments.p419ui.components.SearchOptions;
import com.truelayer.payments.p419ui.components.SearchableItems4;
import com.truelayer.payments.p419ui.models.QueryState;
import com.truelayer.payments.p419ui.screens.providerselection.PaymentProviderViewData;
import com.truelayer.payments.p419ui.utils.TestTags;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: ProviderSelectionList.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aw\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\r2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\rH\u0001¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"ProviderSelectionList", "", "title", "", "query", "Lcom/truelayer/payments/ui/models/QueryState;", ApiRenderablePlatforms.VERSIONS_ALL, "", "Lcom/truelayer/payments/ui/screens/providerselection/PaymentProviderViewData;", "recent", "branchSelection", "", "onSelect", "Lkotlin/Function1;", "onDisabledSelect", "(Ljava/lang/String;Lcom/truelayer/payments/ui/models/QueryState;Ljava/util/List;Ljava/util/List;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "payments-ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.truelayer.payments.ui.screens.providerselection.components.ProviderSelectionListKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class ProviderSelectionList {
    /* JADX WARN: Removed duplicated region for block: B:100:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ProviderSelectionList(String str, QueryState queryState, List<PaymentProviderViewData> list, List<PaymentProviderViewData> list2, boolean z, Function1<? super PaymentProviderViewData, Unit> function1, Function1<? super PaymentProviderViewData, Unit> function12, Composer composer, final int i, final int i2) {
        String strStringResource;
        int i3;
        QueryState queryStateMo27021default;
        boolean z2;
        int i4;
        Function1<? super PaymentProviderViewData, Unit> function13;
        int i5;
        Function1<? super PaymentProviderViewData, Unit> function14;
        List<PaymentProviderViewData> list3;
        List<PaymentProviderViewData> list4;
        boolean z3;
        int i6;
        String str2;
        final Function1<? super PaymentProviderViewData, Unit> function15;
        final Function1<? super PaymentProviderViewData, Unit> function16;
        boolean zChanged;
        Object objRememberedValue;
        Object arrayList;
        final Function1<? super PaymentProviderViewData, Unit> function17;
        final String str3;
        final List<PaymentProviderViewData> list5;
        final List<PaymentProviderViewData> list6;
        final boolean z4;
        final Function1<? super PaymentProviderViewData, Unit> function18;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2020027135);
        if ((i & 14) == 0) {
            if ((i2 & 1) == 0) {
                strStringResource = str;
                int i7 = composerStartRestartGroup.changed(strStringResource) ? 4 : 2;
                i3 = i | i7;
            } else {
                strStringResource = str;
            }
            i3 = i | i7;
        } else {
            strStringResource = str;
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0) {
                queryStateMo27021default = queryState;
                int i8 = composerStartRestartGroup.changed(queryStateMo27021default) ? 32 : 16;
                i3 |= i8;
            } else {
                queryStateMo27021default = queryState;
            }
            i3 |= i8;
        } else {
            queryStateMo27021default = queryState;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= 128;
        }
        int i10 = i2 & 8;
        if (i10 != 0) {
            i3 |= 1024;
        }
        int i11 = i2 & 16;
        if (i11 != 0) {
            i3 |= 24576;
        } else {
            if ((i & 57344) == 0) {
                z2 = z;
                i3 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= 196608;
            } else {
                if ((i & 458752) == 0) {
                    function13 = function1;
                    i3 |= composerStartRestartGroup.changedInstance(function13) ? 131072 : 65536;
                }
                i5 = i2 & 64;
                if (i5 == 0) {
                    if ((i & 3670016) == 0) {
                        function14 = function12;
                        i3 |= composerStartRestartGroup.changedInstance(function14) ? 1048576 : 524288;
                    }
                    if ((i2 & 12) == 12 || (2995931 & i3) != 599186 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if ((i2 & 1) != 0) {
                                strStringResource = StringResources_androidKt.stringResource(C42830R.string.choose_your_bank, composerStartRestartGroup, 0);
                                i3 &= -15;
                            }
                            if ((i2 & 2) != 0) {
                                queryStateMo27021default = QueryState.INSTANCE.mo27021default();
                                i3 &= -113;
                            }
                            List<PaymentProviderViewData> listEmptyList = i9 == 0 ? CollectionsKt.emptyList() : list;
                            List<PaymentProviderViewData> listEmptyList2 = i10 == 0 ? CollectionsKt.emptyList() : list2;
                            if (i11 != 0) {
                                z2 = false;
                            }
                            Function1<? super PaymentProviderViewData, Unit> function19 = i4 == 0 ? new Function1<PaymentProviderViewData, Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.components.ProviderSelectionListKt.ProviderSelectionList.1
                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(PaymentProviderViewData it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(PaymentProviderViewData paymentProviderViewData) {
                                    invoke2(paymentProviderViewData);
                                    return Unit.INSTANCE;
                                }
                            } : function13;
                            if (i5 == 0) {
                                list3 = listEmptyList;
                                list4 = listEmptyList2;
                                function16 = function19;
                                z3 = z2;
                                i6 = i3;
                                str2 = strStringResource;
                                function15 = new Function1<PaymentProviderViewData, Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.components.ProviderSelectionListKt.ProviderSelectionList.2
                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(PaymentProviderViewData it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(PaymentProviderViewData paymentProviderViewData) {
                                        invoke2(paymentProviderViewData);
                                        return Unit.INSTANCE;
                                    }
                                };
                            } else {
                                list3 = listEmptyList;
                                list4 = listEmptyList2;
                                z3 = z2;
                                i6 = i3;
                                str2 = strStringResource;
                                function15 = function14;
                                function16 = function19;
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 1) != 0) {
                                i3 &= -15;
                            }
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                            }
                            list3 = list;
                            i6 = i3;
                            z3 = z2;
                            str2 = strStringResource;
                            function15 = function14;
                            function16 = function13;
                            list4 = list2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2020027135, i6, -1, "com.truelayer.payments.ui.screens.providerselection.components.ProviderSelectionList (ProviderSelectionList.kt:23)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(37330688);
                        zChanged = composerStartRestartGroup.changed(list3) | ((i6 & 57344) == 16384);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            if (z3) {
                                arrayList = new ArrayList();
                            } else {
                                List<PaymentProviderViewData> list7 = list3;
                                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list7, 10));
                                Iterator<T> it = list7.iterator();
                                while (it.hasNext()) {
                                    arrayList2.add(StringsKt.firstOrNull(((PaymentProviderViewData) it.next()).getDisplayName()));
                                }
                                arrayList = CollectionsKt.toMutableList((Collection) arrayList2);
                            }
                            objRememberedValue = arrayList;
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i12 = i6 << 3;
                        Function1<? super PaymentProviderViewData, Unit> function110 = function15;
                        SearchableItems4.SearchableItems(TestTag3.testTag(Modifier.INSTANCE, TestTags.PROVIDERS_LIST), str2, queryStateMo27021default, new SearchOptions(list3, list4, (List) objRememberedValue), null, ComposableLambda3.composableLambda(composerStartRestartGroup, -632491457, true, new Function3<PaymentProviderViewData, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.components.ProviderSelectionListKt.ProviderSelectionList.3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(PaymentProviderViewData paymentProviderViewData, Composer composer2, Integer num) {
                                invoke(paymentProviderViewData, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(PaymentProviderViewData it2, Composer composer2, int i13) {
                                Intrinsics.checkNotNullParameter(it2, "it");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-632491457, i13, -1, "com.truelayer.payments.ui.screens.providerselection.components.ProviderSelectionList.<anonymous> (ProviderSelectionList.kt:38)");
                                }
                                ProviderSelectionRow3.ProviderSelectionRow(it2, function16, function15, false, composer2, 8, 8);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), null, composerStartRestartGroup, (i12 & 112) | 200710 | (i12 & 896), 80);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function17 = function110;
                        str3 = str2;
                        list5 = list3;
                        list6 = list4;
                        z4 = z3;
                        function18 = function16;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        list5 = list;
                        list6 = list2;
                        str3 = strStringResource;
                        z4 = z2;
                        function18 = function13;
                        function17 = function14;
                    }
                    final QueryState queryState2 = queryStateMo27021default;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.components.ProviderSelectionListKt.ProviderSelectionList.4
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

                            public final void invoke(Composer composer2, int i13) {
                                ProviderSelectionList.ProviderSelectionList(str3, queryState2, list5, list6, z4, function18, function17, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 1572864;
                function14 = function12;
                if ((i2 & 12) == 12) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if ((i2 & 1) != 0) {
                        }
                        if ((i2 & 2) != 0) {
                        }
                        if (i9 == 0) {
                        }
                        if (i10 == 0) {
                        }
                        if (i11 != 0) {
                        }
                        if (i4 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composerStartRestartGroup.startReplaceableGroup(37330688);
                        zChanged = composerStartRestartGroup.changed(list3) | ((i6 & 57344) == 16384);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            if (z3) {
                            }
                            objRememberedValue = arrayList;
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            composerStartRestartGroup.endReplaceableGroup();
                            int i122 = i6 << 3;
                            Function1<? super PaymentProviderViewData, Unit> function1102 = function15;
                            SearchableItems4.SearchableItems(TestTag3.testTag(Modifier.INSTANCE, TestTags.PROVIDERS_LIST), str2, queryStateMo27021default, new SearchOptions(list3, list4, (List) objRememberedValue), null, ComposableLambda3.composableLambda(composerStartRestartGroup, -632491457, true, new Function3<PaymentProviderViewData, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.components.ProviderSelectionListKt.ProviderSelectionList.3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(PaymentProviderViewData paymentProviderViewData, Composer composer2, Integer num) {
                                    invoke(paymentProviderViewData, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(PaymentProviderViewData it2, Composer composer2, int i13) {
                                    Intrinsics.checkNotNullParameter(it2, "it");
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-632491457, i13, -1, "com.truelayer.payments.ui.screens.providerselection.components.ProviderSelectionList.<anonymous> (ProviderSelectionList.kt:38)");
                                    }
                                    ProviderSelectionRow3.ProviderSelectionRow(it2, function16, function15, false, composer2, 8, 8);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), null, composerStartRestartGroup, (i122 & 112) | 200710 | (i122 & 896), 80);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            function17 = function1102;
                            str3 = str2;
                            list5 = list3;
                            list6 = list4;
                            z4 = z3;
                            function18 = function16;
                        }
                    }
                }
                final QueryState queryState22 = queryStateMo27021default;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function13 = function1;
            i5 = i2 & 64;
            if (i5 == 0) {
            }
            function14 = function12;
            if ((i2 & 12) == 12) {
            }
            final QueryState queryState222 = queryStateMo27021default;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        z2 = z;
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        function13 = function1;
        i5 = i2 & 64;
        if (i5 == 0) {
        }
        function14 = function12;
        if ((i2 & 12) == 12) {
        }
        final QueryState queryState2222 = queryStateMo27021default;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
