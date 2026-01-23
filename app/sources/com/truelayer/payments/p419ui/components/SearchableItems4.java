package com.truelayer.payments.p419ui.components;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.LayoutKt;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.truelayer.payments.p419ui.C42830R;
import com.truelayer.payments.p419ui.models.QueryState;
import com.truelayer.payments.p419ui.theme.Spacing;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.Footer;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SearchableItems.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a|\u0010\u0013\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\b\b\u0002\u0010\n\u001a\u00020\t2!\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\u000b2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0011H\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u000f\u0010\u0015\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m3636d2 = {"T", "Landroidx/compose/ui/Modifier;", "modifier", "", "title", "Lcom/truelayer/payments/ui/models/QueryState;", "query", "Lcom/truelayer/payments/ui/components/SearchOptions;", "options", "Landroidx/compose/foundation/lazy/LazyListState;", "listState", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", AnalyticsStrings.BUTTON_AUTOMATIC_DEPOSIT_FREQUENCY_SELECTION_OPTION, "", "row", "Lkotlin/Function0;", Footer.f10637type, "SearchableItems", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lcom/truelayer/payments/ui/models/QueryState;Lcom/truelayer/payments/ui/components/SearchOptions;Landroidx/compose/foundation/lazy/LazyListState;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "SearchableListEmptyView", "(Landroidx/compose/runtime/Composer;I)V", "payments-ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.truelayer.payments.ui.components.SearchableItemsKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class SearchableItems4 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:76:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> void SearchableItems(Modifier modifier, final String title, final QueryState query, final SearchOptions<T> options, LazyListState lazyListState, final Function3<? super T, ? super Composer, ? super Integer, Unit> row, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        final LazyListState lazyListStateRememberLazyListState;
        int i3;
        boolean z;
        boolean z2;
        final LazyListState lazyListState2;
        boolean z3;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(row, "row");
        Composer composerStartRestartGroup = composer.startRestartGroup(2130720738);
        final Modifier modifier2 = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        if ((i2 & 16) != 0) {
            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
            i3 = i & (-57345);
        } else {
            lazyListStateRememberLazyListState = lazyListState;
            i3 = i;
        }
        Function2<? super Composer, ? super Integer, Unit> function22 = (i2 & 64) != 0 ? null : function2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2130720738, i3, -1, "com.truelayer.payments.ui.components.SearchableItems (SearchableItems.kt:57)");
        }
        final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        int bottom = WindowInsets_androidKt.getIme(WindowInsets.INSTANCE, composerStartRestartGroup, 8).getBottom((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity()));
        composerStartRestartGroup.startReplaceableGroup(-129342537);
        if (options.getAll().isEmpty()) {
            SearchableListEmptyView(composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup2 != null) {
                final Function2<? super Composer, ? super Integer, Unit> function23 = function22;
                scopeUpdateScopeEndRestartGroup2.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.SearchableItemsKt.SearchableItems.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i4) {
                        SearchableItems4.SearchableItems(modifier2, title, query, options, lazyListStateRememberLazyListState, row, function23, composer3, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                    }
                });
                return;
            }
            return;
        }
        final Function2<? super Composer, ? super Integer, Unit> function24 = function22;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-129342457);
        Object[] objArr = (((i & 896) ^ 384) > 256 && composerStartRestartGroup.changed(query)) || (i & 384) == 256;
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (objArr != false || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = options.filter(query);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        final List list = (List) objRememberedValue;
        composerStartRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(Boolean.TRUE, new C428712(query, options, null), composerStartRestartGroup, 70);
        composerStartRestartGroup.startReplaceableGroup(-129342212);
        boolean z4 = (((57344 & i) ^ 24576) > 16384 && composerStartRestartGroup.changed(lazyListStateRememberLazyListState)) || (i & 24576) == 16384;
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (z4 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new SearchableItems5(lazyListStateRememberLazyListState, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(query, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, ((i3 >> 6) & 14) | 64);
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
        if (composerStartRestartGroup.getApplier() == null) {
            Composables.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
        final Modifier modifier3 = modifier2;
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        function3ModifierMaterializerOf.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        Modifier modifierWeight$default = Column5.weight$default(Column6.INSTANCE, companion, 1.0f, false, 2, null);
        if (query.getInner().length() == 0) {
            z = true;
            if (options.getIndexedItems().size() > 1) {
                z2 = true;
            }
            lazyListState2 = lazyListStateRememberLazyListState;
            z3 = z;
            composer2 = composerStartRestartGroup;
            FastScrollKt.FastScrollingContainer(modifierWeight$default, z2, options.getIndexedItems(), lazyListState2, ComposableLambda3.composableLambda(composerStartRestartGroup, 1111162547, z3, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.SearchableItemsKt$SearchableItems$4$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i4) {
                    if ((i4 & 11) != 2 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1111162547, i4, -1, "com.truelayer.payments.ui.components.SearchableItems.<anonymous>.<anonymous> (SearchableItems.kt:84)");
                        }
                        Modifier modifier4 = modifier3;
                        final SearchOptions<T> searchOptions = options;
                        final Context context2 = context;
                        Modifier modifierSemantics$default = SemanticsModifier6.semantics$default(modifier4, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.truelayer.payments.ui.components.SearchableItemsKt$SearchableItems$4$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(SemanticsPropertyReceiver semantics) {
                                String string2;
                                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                                if (!searchOptions.getAll().isEmpty()) {
                                    Context context3 = context2;
                                    string2 = context3.getString(C42830R.string.accessibility_number_of_items_in_list, context3.getResources().getQuantityString(C42830R.plurals.items, searchOptions.getAll().size(), Integer.valueOf(searchOptions.getAll().size())));
                                    Intrinsics.checkNotNull(string2);
                                } else {
                                    string2 = context2.getString(C42830R.string.accessibility_empty_list);
                                    Intrinsics.checkNotNull(string2);
                                }
                                SemanticsPropertiesKt.setContentDescription(semantics, string2);
                            }
                        }, 1, null);
                        LazyListState lazyListState3 = lazyListState2;
                        final QueryState queryState = query;
                        final String str = title;
                        final SearchOptions<T> searchOptions2 = options;
                        final List<T> list2 = list;
                        final Function3<T, Composer, Integer, Unit> function3 = row;
                        LazyDslKt.LazyColumn(modifierSemantics$default, lazyListState3, null, false, null, null, null, false, new Function1<LazyListScope, Unit>() { // from class: com.truelayer.payments.ui.components.SearchableItemsKt$SearchableItems$4$1.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(LazyListScope lazyListScope) {
                                invoke2(lazyListScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(LazyListScope LazyColumn) {
                                LazyListScope lazyListScope;
                                Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                                if (queryState instanceof QueryState.UnFocused) {
                                    final String str2 = str;
                                    lazyListScope = LazyColumn;
                                    LazyListScope.item$default(lazyListScope, str2, null, ComposableLambda3.composableLambdaInstance(-1428604060, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.SearchableItemsKt.SearchableItems.4.1.2.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(3);
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer4, Integer num) {
                                            invoke(lazyItemScope, composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(LazyItemScope item, Composer composer4, int i5) {
                                            Intrinsics.checkNotNullParameter(item, "$this$item");
                                            if ((i5 & 81) != 16 || !composer4.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1428604060, i5, -1, "com.truelayer.payments.ui.components.SearchableItems.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SearchableItems.kt:105)");
                                                }
                                                ScreenTitle.ScreenTitle(str2, PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, Spacing.INSTANCE.m27174getLARGED9Ej5fM(), 7, null), composer4, 48, 0);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer4.skipToGroupEnd();
                                        }
                                    }), 2, null);
                                } else {
                                    lazyListScope = LazyColumn;
                                }
                                if (queryState.getInner().length() == 0 && !searchOptions2.getRecommendations().isEmpty()) {
                                    List recommendations = searchOptions2.getRecommendations();
                                    AnonymousClass2 anonymousClass2 = new Function2<Integer, T, Object>() { // from class: com.truelayer.payments.ui.components.SearchableItemsKt.SearchableItems.4.1.2.2
                                        /* JADX WARN: Multi-variable type inference failed */
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Object invoke(Integer num, Object obj) {
                                            return invoke(num.intValue(), (int) obj);
                                        }

                                        public final Object invoke(int i5, T t) {
                                            return "recent-" + i5;
                                        }
                                    };
                                    final Function3<T, Composer, Integer, Unit> function32 = function3;
                                    ItemDivider.dividedItems(lazyListScope, recommendations, (Function2) anonymousClass2, (Function4) ComposableLambda3.composableLambdaInstance(101245319, true, new Function4<LazyItemScope, T, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.SearchableItemsKt.SearchableItems.4.1.2.3
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(4);
                                        }

                                        /* JADX WARN: Multi-variable type inference failed */
                                        @Override // kotlin.jvm.functions.Function4
                                        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Object obj, Composer composer4, Integer num) {
                                            invoke(lazyItemScope, (LazyItemScope) obj, composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(LazyItemScope dividedItems, T t, Composer composer4, int i5) {
                                            Intrinsics.checkNotNullParameter(dividedItems, "$this$dividedItems");
                                            if ((i5 & 112) == 0) {
                                                i5 |= composer4.changed(t) ? 32 : 16;
                                            }
                                            if ((i5 & 721) == 144 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(101245319, i5, -1, "com.truelayer.payments.ui.components.SearchableItems.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SearchableItems.kt:119)");
                                            }
                                            function32.invoke(t, composer4, Integer.valueOf((i5 >> 3) & 14));
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }));
                                    LazyListScope.item$default(lazyListScope, null, null, SearchableItems.INSTANCE.m27035getLambda1$payments_ui_release(), 3, null);
                                }
                                List<T> list3 = list2;
                                AnonymousClass4 anonymousClass4 = new Function2<Integer, T, Object>() { // from class: com.truelayer.payments.ui.components.SearchableItemsKt.SearchableItems.4.1.2.4
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Object invoke(Integer num, Object obj) {
                                        return invoke(num.intValue(), (int) obj);
                                    }

                                    public final Object invoke(int i5, T t) {
                                        return Integer.valueOf(i5);
                                    }
                                };
                                final Function3<T, Composer, Integer, Unit> function33 = function3;
                                ItemDivider.dividedItems(lazyListScope, (List) list3, (Function2) anonymousClass4, (Function4) ComposableLambda3.composableLambdaInstance(1091315097, true, new Function4<LazyItemScope, T, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.SearchableItemsKt.SearchableItems.4.1.2.5
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(4);
                                    }

                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // kotlin.jvm.functions.Function4
                                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Object obj, Composer composer4, Integer num) {
                                        invoke(lazyItemScope, (LazyItemScope) obj, composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(LazyItemScope dividedItems, T t, Composer composer4, int i5) {
                                        Intrinsics.checkNotNullParameter(dividedItems, "$this$dividedItems");
                                        if ((i5 & 112) == 0) {
                                            i5 |= composer4.changed(t) ? 32 : 16;
                                        }
                                        if ((i5 & 721) == 144 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1091315097, i5, -1, "com.truelayer.payments.ui.components.SearchableItems.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SearchableItems.kt:131)");
                                        }
                                        function33.invoke(t, composer4, Integer.valueOf((i5 >> 3) & 14));
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }));
                            }
                        }, composer3, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }), composer2, ((i3 >> 3) & 7168) | 25088, 0);
            composer2.startReplaceableGroup(-129339893);
            if (function24 != null && bottom == 0) {
                SurfaceKt.m5967SurfaceT9BRK9s(SizeKt.fillMaxWidth$default(companion, 0.0f, z3 ? 1 : 0, null), null, 0L, 0L, C2002Dp.m7995constructorimpl(!lazyListState2.isScrollInProgress() ? 15 : 5), 0.0f, null, ComposableLambda3.composableLambda(composer2, -214847562, z3, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.SearchableItemsKt$SearchableItems$4$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i4) {
                        if ((i4 & 11) != 2 || !composer3.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-214847562, i4, -1, "com.truelayer.payments.ui.components.SearchableItems.<anonymous>.<anonymous> (SearchableItems.kt:143)");
                            }
                            Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(Modifier.INSTANCE, Spacing.INSTANCE.m27177getREGULARD9Ej5fM());
                            Function2<Composer, Integer, Unit> function25 = function24;
                            composer3.startReplaceableGroup(-483455358);
                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                            composer3.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM5142padding3ABfNKs);
                            if (composer3.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor2);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            function3ModifierMaterializerOf2.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composer3)), composer3, 0);
                            composer3.startReplaceableGroup(2058660585);
                            Column6 column6 = Column6.INSTANCE;
                            function25.invoke(composer3, 0);
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
                        composer3.skipToGroupEnd();
                    }
                }), composer2, 12582918, 110);
                composer2 = composer2;
            }
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.SearchableItemsKt.SearchableItems.5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i4) {
                        SearchableItems4.SearchableItems(modifier3, title, query, options, lazyListState2, row, function24, composer3, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                    }
                });
                return;
            }
            return;
        }
        z = true;
        z2 = false;
        lazyListState2 = lazyListStateRememberLazyListState;
        z3 = z;
        composer2 = composerStartRestartGroup;
        FastScrollKt.FastScrollingContainer(modifierWeight$default, z2, options.getIndexedItems(), lazyListState2, ComposableLambda3.composableLambda(composerStartRestartGroup, 1111162547, z3, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.SearchableItemsKt$SearchableItems$4$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer3, int i4) {
                if ((i4 & 11) != 2 || !composer3.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1111162547, i4, -1, "com.truelayer.payments.ui.components.SearchableItems.<anonymous>.<anonymous> (SearchableItems.kt:84)");
                    }
                    Modifier modifier4 = modifier3;
                    final SearchOptions<T> searchOptions = options;
                    final Context context2 = context;
                    Modifier modifierSemantics$default = SemanticsModifier6.semantics$default(modifier4, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.truelayer.payments.ui.components.SearchableItemsKt$SearchableItems$4$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SemanticsPropertyReceiver semantics) {
                            String string2;
                            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                            if (!searchOptions.getAll().isEmpty()) {
                                Context context3 = context2;
                                string2 = context3.getString(C42830R.string.accessibility_number_of_items_in_list, context3.getResources().getQuantityString(C42830R.plurals.items, searchOptions.getAll().size(), Integer.valueOf(searchOptions.getAll().size())));
                                Intrinsics.checkNotNull(string2);
                            } else {
                                string2 = context2.getString(C42830R.string.accessibility_empty_list);
                                Intrinsics.checkNotNull(string2);
                            }
                            SemanticsPropertiesKt.setContentDescription(semantics, string2);
                        }
                    }, 1, null);
                    LazyListState lazyListState3 = lazyListState2;
                    final QueryState queryState = query;
                    final String str = title;
                    final SearchOptions<T> searchOptions2 = options;
                    final List<? extends T> list2 = list;
                    final Function3<? super T, ? super Composer, ? super Integer, Unit> function3 = row;
                    LazyDslKt.LazyColumn(modifierSemantics$default, lazyListState3, null, false, null, null, null, false, new Function1<LazyListScope, Unit>() { // from class: com.truelayer.payments.ui.components.SearchableItemsKt$SearchableItems$4$1.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(LazyListScope lazyListScope) {
                            invoke2(lazyListScope);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(LazyListScope LazyColumn) {
                            LazyListScope lazyListScope;
                            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                            if (queryState instanceof QueryState.UnFocused) {
                                final String str2 = str;
                                lazyListScope = LazyColumn;
                                LazyListScope.item$default(lazyListScope, str2, null, ComposableLambda3.composableLambdaInstance(-1428604060, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.SearchableItemsKt.SearchableItems.4.1.2.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer4, Integer num) {
                                        invoke(lazyItemScope, composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(LazyItemScope item, Composer composer4, int i5) {
                                        Intrinsics.checkNotNullParameter(item, "$this$item");
                                        if ((i5 & 81) != 16 || !composer4.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1428604060, i5, -1, "com.truelayer.payments.ui.components.SearchableItems.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SearchableItems.kt:105)");
                                            }
                                            ScreenTitle.ScreenTitle(str2, PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, Spacing.INSTANCE.m27174getLARGED9Ej5fM(), 7, null), composer4, 48, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer4.skipToGroupEnd();
                                    }
                                }), 2, null);
                            } else {
                                lazyListScope = LazyColumn;
                            }
                            if (queryState.getInner().length() == 0 && !searchOptions2.getRecommendations().isEmpty()) {
                                List recommendations = searchOptions2.getRecommendations();
                                AnonymousClass2 anonymousClass2 = new Function2<Integer, T, Object>() { // from class: com.truelayer.payments.ui.components.SearchableItemsKt.SearchableItems.4.1.2.2
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Object invoke(Integer num, Object obj) {
                                        return invoke(num.intValue(), (int) obj);
                                    }

                                    public final Object invoke(int i5, T t) {
                                        return "recent-" + i5;
                                    }
                                };
                                final Function3<? super T, ? super Composer, ? super Integer, Unit> function32 = function3;
                                ItemDivider.dividedItems(lazyListScope, recommendations, (Function2) anonymousClass2, (Function4) ComposableLambda3.composableLambdaInstance(101245319, true, new Function4<LazyItemScope, T, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.SearchableItemsKt.SearchableItems.4.1.2.3
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(4);
                                    }

                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // kotlin.jvm.functions.Function4
                                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Object obj, Composer composer4, Integer num) {
                                        invoke(lazyItemScope, (LazyItemScope) obj, composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(LazyItemScope dividedItems, T t, Composer composer4, int i5) {
                                        Intrinsics.checkNotNullParameter(dividedItems, "$this$dividedItems");
                                        if ((i5 & 112) == 0) {
                                            i5 |= composer4.changed(t) ? 32 : 16;
                                        }
                                        if ((i5 & 721) == 144 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(101245319, i5, -1, "com.truelayer.payments.ui.components.SearchableItems.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SearchableItems.kt:119)");
                                        }
                                        function32.invoke(t, composer4, Integer.valueOf((i5 >> 3) & 14));
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }));
                                LazyListScope.item$default(lazyListScope, null, null, SearchableItems.INSTANCE.m27035getLambda1$payments_ui_release(), 3, null);
                            }
                            List<T> list3 = list2;
                            AnonymousClass4 anonymousClass4 = new Function2<Integer, T, Object>() { // from class: com.truelayer.payments.ui.components.SearchableItemsKt.SearchableItems.4.1.2.4
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Object invoke(Integer num, Object obj) {
                                    return invoke(num.intValue(), (int) obj);
                                }

                                public final Object invoke(int i5, T t) {
                                    return Integer.valueOf(i5);
                                }
                            };
                            final Function3<? super T, ? super Composer, ? super Integer, Unit> function33 = function3;
                            ItemDivider.dividedItems(lazyListScope, (List) list3, (Function2) anonymousClass4, (Function4) ComposableLambda3.composableLambdaInstance(1091315097, true, new Function4<LazyItemScope, T, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.SearchableItemsKt.SearchableItems.4.1.2.5
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(4);
                                }

                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // kotlin.jvm.functions.Function4
                                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Object obj, Composer composer4, Integer num) {
                                    invoke(lazyItemScope, (LazyItemScope) obj, composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(LazyItemScope dividedItems, T t, Composer composer4, int i5) {
                                    Intrinsics.checkNotNullParameter(dividedItems, "$this$dividedItems");
                                    if ((i5 & 112) == 0) {
                                        i5 |= composer4.changed(t) ? 32 : 16;
                                    }
                                    if ((i5 & 721) == 144 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1091315097, i5, -1, "com.truelayer.payments.ui.components.SearchableItems.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SearchableItems.kt:131)");
                                    }
                                    function33.invoke(t, composer4, Integer.valueOf((i5 >> 3) & 14));
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }));
                        }
                    }, composer3, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer3.skipToGroupEnd();
            }
        }), composer2, ((i3 >> 3) & 7168) | 25088, 0);
        composer2.startReplaceableGroup(-129339893);
        if (function24 != null) {
            SurfaceKt.m5967SurfaceT9BRK9s(SizeKt.fillMaxWidth$default(companion, 0.0f, z3 ? 1 : 0, null), null, 0L, 0L, C2002Dp.m7995constructorimpl(!lazyListState2.isScrollInProgress() ? 15 : 5), 0.0f, null, ComposableLambda3.composableLambda(composer2, -214847562, z3, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.SearchableItemsKt$SearchableItems$4$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i4) {
                    if ((i4 & 11) != 2 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-214847562, i4, -1, "com.truelayer.payments.ui.components.SearchableItems.<anonymous>.<anonymous> (SearchableItems.kt:143)");
                        }
                        Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(Modifier.INSTANCE, Spacing.INSTANCE.m27177getREGULARD9Ej5fM());
                        Function2<Composer, Integer, Unit> function25 = function24;
                        composer3.startReplaceableGroup(-483455358);
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                        composer3.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM5142padding3ABfNKs);
                        if (composer3.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor2);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composer3)), composer3, 0);
                        composer3.startReplaceableGroup(2058660585);
                        Column6 column6 = Column6.INSTANCE;
                        function25.invoke(composer3, 0);
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
                    composer3.skipToGroupEnd();
                }
            }), composer2, 12582918, 110);
            composer2 = composer2;
        }
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        composer2.endNode();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: SearchableItems.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, m3636d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.ui.components.SearchableItemsKt$SearchableItems$2", m3645f = "SearchableItems.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.truelayer.payments.ui.components.SearchableItemsKt$SearchableItems$2 */
    static final class C428712 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SearchOptions<T> $options;
        final /* synthetic */ QueryState $query;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C428712(QueryState queryState, SearchOptions<T> searchOptions, Continuation<? super C428712> continuation) {
            super(2, continuation);
            this.$query = queryState;
            this.$options = searchOptions;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C428712(this.$query, this.$options, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C428712) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (this.$query.getInner().length() == 0) {
                this.$options.getIndexedItems().add(0, null);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SearchableListEmptyView(Composer composer, final int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-35997175);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-35997175, i, -1, "com.truelayer.payments.ui.components.SearchableListEmptyView (SearchableItems.kt:153)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.fillMaxHeight(Modifier.INSTANCE, 0.9f), 0.0f, 1, null);
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(center, centerHorizontally, composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            function3ModifierMaterializerOf.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            Column6 column6 = Column6.INSTANCE;
            composer2 = composerStartRestartGroup;
            TextKt.m6028Text4IGK_g(StringResources_androidKt.stringResource(C42830R.string.search_options_dialog_no_results, composerStartRestartGroup, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getTitleMedium(), composer2, 0, 0, 65534);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.SearchableItemsKt.SearchableListEmptyView.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i2) {
                    SearchableItems4.SearchableListEmptyView(composer3, RecomposeScopeImpl4.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
