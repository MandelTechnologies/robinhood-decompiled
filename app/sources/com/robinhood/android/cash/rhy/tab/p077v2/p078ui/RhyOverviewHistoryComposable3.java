package com.robinhood.android.cash.rhy.tab.p077v2.p078ui;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.paging.compose.LazyPagingItems;
import coil.ImageLoader;
import com.robinhood.android.cash.rhy.tab.C10285R;
import com.robinhood.android.cash.rhy.tab.p077v2.CashTabSectionKey;
import com.robinhood.android.cash.rhy.tab.p077v2.p078ui.RhyOverviewHistoryComposable3;
import com.robinhood.android.cash.rhy.tab.p077v2.p078ui.matcha.PendingTransactionsRowComposable;
import com.robinhood.android.common.history.p082ui.HistoryRow4;
import com.robinhood.android.common.history.p082ui.HistoryRowsCallbacks;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.models.p355ui.matcha.UiMatchaPendingTransaction;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.PrimitiveIterators6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.PrimitiveRanges2;
import kotlin.ranges.RangesKt;

/* compiled from: RhyOverviewHistoryComposable.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001aj\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0018\u0010\t\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\f0\u000bj\u0002`\r\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00112\u0006\u0010\u0018\u001a\u00020\u0019H\u0000\u001a;\u0010\u001a\u001a\u00020\u0007*\u00020\b2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00112\u0006\u0010\u001c\u001a\u00020\u001d2\u0017\u0010\u001e\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00070\u001f¢\u0006\u0002\b H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0018\u0010\u0002\u001a\u00020\u0003*\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006!"}, m3636d2 = {"MaxHistoryItems", "", "historyRowKey", "", "getHistoryRowKey", "(I)Ljava/lang/String;", "rhyRecentHistorySection", "", "Landroidx/compose/foundation/lazy/LazyListScope;", "historyItems", "Landroidx/paging/compose/LazyPagingItems;", "Lcom/robinhood/shared/models/history/shared/StatefulHistoryEvent;", "Lcom/robinhood/shared/models/history/shared/HistoryEvent;", "Lcom/robinhood/shared/models/history/shared/GenericStatefulHistoryEvent;", "historyEmptyText", "Landroidx/compose/ui/text/AnnotatedString;", "historyEmptyTextClick", "Lkotlin/Function0;", "pendingMatchaTransactions", "", "Lcom/robinhood/models/ui/matcha/UiMatchaPendingTransaction;", "mediaImageLoader", "Lcoil/ImageLoader;", "onClickMatchaTransactions", "callbacks", "Lcom/robinhood/android/common/history/ui/HistoryRowsCallbacks;", "listSectionWithShowMore", "onShowMoreClicked", "showMoreVisible", "", "listContent", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "feature-cash-rhy-tab_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.cash.rhy.tab.v2.ui.RhyOverviewHistoryComposableKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class RhyOverviewHistoryComposable3 {
    public static final int MaxHistoryItems = 5;

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getHistoryRowKey(int i) {
        return "rhy_recent_history_row_" + i;
    }

    public static final void rhyRecentHistorySection(LazyListScope lazyListScope, LazyPagingItems<StatefulHistoryEvent<HistoryEvent>> lazyPagingItems, AnnotatedString historyEmptyText, Function0<Unit> function0, final List<? extends UiMatchaPendingTransaction> pendingMatchaTransactions, final ImageLoader mediaImageLoader, final Function0<Unit> onClickMatchaTransactions, final HistoryRowsCallbacks callbacks) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(historyEmptyText, "historyEmptyText");
        Intrinsics.checkNotNullParameter(pendingMatchaTransactions, "pendingMatchaTransactions");
        Intrinsics.checkNotNullParameter(mediaImageLoader, "mediaImageLoader");
        Intrinsics.checkNotNullParameter(onClickMatchaTransactions, "onClickMatchaTransactions");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        LazyListScope.item$default(lazyListScope, CashTabSectionKey.HistoryTitle, null, RhyOverviewHistoryComposable.INSTANCE.m11704getLambda$550795834$feature_cash_rhy_tab_externalDebug(), 2, null);
        LazyListScope.item$default(lazyListScope, CashTabSectionKey.MatchaPendingTransactions, null, ComposableLambda3.composableLambdaInstance(181618735, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.RhyOverviewHistoryComposableKt.rhyRecentHistorySection.1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                invoke(lazyItemScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope item, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i & 17) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(181618735, i, -1, "com.robinhood.android.cash.rhy.tab.v2.ui.rhyRecentHistorySection.<anonymous> (RhyOverviewHistoryComposable.kt:51)");
                }
                final List<UiMatchaPendingTransaction> list = pendingMatchaTransactions;
                final ImageLoader imageLoader = mediaImageLoader;
                final Function0<Unit> function02 = onClickMatchaTransactions;
                BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(778795524, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.RhyOverviewHistoryComposableKt.rhyRecentHistorySection.1.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i2) {
                        if ((i2 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(778795524, i2, -1, "com.robinhood.android.cash.rhy.tab.v2.ui.rhyRecentHistorySection.<anonymous>.<anonymous> (RhyOverviewHistoryComposable.kt:52)");
                        }
                        PendingTransactionsRowComposable.PendingTransactionsRowComposable(list, imageLoader, function02, composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 2, null);
        if (lazyPagingItems != null && lazyPagingItems.getItemCount() > 0) {
            PrimitiveRanges2 primitiveRanges2Until = RangesKt.until(0, RangesKt.coerceAtMost(lazyPagingItems.getItemCount(), 5));
            final ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(primitiveRanges2Until, 10));
            Iterator<Integer> it = primitiveRanges2Until.iterator();
            while (it.hasNext()) {
                arrayList.add(lazyPagingItems.get(((PrimitiveIterators6) it).nextInt()));
            }
            listSectionWithShowMore(lazyListScope, new C103652(callbacks), lazyPagingItems.getItemCount() > 5, new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.RhyOverviewHistoryComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RhyOverviewHistoryComposable3.rhyRecentHistorySection$lambda$3(arrayList, callbacks, (LazyListScope) obj);
                }
            });
            return;
        }
        LazyListScope.item$default(lazyListScope, CashTabSectionKey.HistoryEmpty, null, ComposableLambda3.composableLambdaInstance(-872261470, true, new C103664(function0, historyEmptyText)), 2, null);
    }

    /* compiled from: RhyOverviewHistoryComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cash.rhy.tab.v2.ui.RhyOverviewHistoryComposableKt$rhyRecentHistorySection$2 */
    /* synthetic */ class C103652 extends FunctionReferenceImpl implements Function0<Unit> {
        C103652(Object obj) {
            super(0, obj, HistoryRowsCallbacks.class, "onShowAllHistoryClicked", "onShowAllHistoryClicked()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((HistoryRowsCallbacks) this.receiver).onShowAllHistoryClicked();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit rhyRecentHistorySection$lambda$3(final List list, final HistoryRowsCallbacks historyRowsCallbacks, LazyListScope listSectionWithShowMore) {
        Intrinsics.checkNotNullParameter(listSectionWithShowMore, "$this$listSectionWithShowMore");
        final Function2 function2 = new Function2() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.RhyOverviewHistoryComposableKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return RhyOverviewHistoryComposable3.rhyRecentHistorySection$lambda$3$lambda$1(((Integer) obj).intValue(), (StatefulHistoryEvent) obj2);
            }
        };
        listSectionWithShowMore.items(list.size(), new Function1<Integer, Object>() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.RhyOverviewHistoryComposableKt$rhyRecentHistorySection$lambda$3$$inlined$itemsIndexed$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return function2.invoke(Integer.valueOf(i), list.get(i));
            }
        }, new Function1<Integer, Object>() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.RhyOverviewHistoryComposableKt$rhyRecentHistorySection$lambda$3$$inlined$itemsIndexed$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                list.get(i);
                return null;
            }
        }, ComposableLambda3.composableLambdaInstance(-1091073711, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.RhyOverviewHistoryComposableKt$rhyRecentHistorySection$lambda$3$$inlined$itemsIndexed$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                int i3;
                if ((i2 & 6) == 0) {
                    i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1091073711, i3, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                }
                StatefulHistoryEvent statefulHistoryEvent = (StatefulHistoryEvent) list.get(i);
                composer.startReplaceGroup(-1329021438);
                HistoryRow4.HistoryRow(statefulHistoryEvent, historyRowsCallbacks, null, false, false, RhyOverviewHistoryComposable3.getHistoryRowKey(i), null, composer, 0, 92);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object rhyRecentHistorySection$lambda$3$lambda$1(int i, StatefulHistoryEvent statefulHistoryEvent) {
        HistoryEvent historyEvent;
        UUID id;
        return (statefulHistoryEvent == null || (historyEvent = statefulHistoryEvent.getHistoryEvent()) == null || (id = historyEvent.getId()) == null) ? getHistoryRowKey(i) : id;
    }

    /* compiled from: RhyOverviewHistoryComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.cash.rhy.tab.v2.ui.RhyOverviewHistoryComposableKt$rhyRecentHistorySection$4 */
    static final class C103664 implements Function3<LazyItemScope, Composer, Integer, Unit> {
        final /* synthetic */ AnnotatedString $historyEmptyText;
        final /* synthetic */ Function0<Unit> $historyEmptyTextClick;

        C103664(Function0<Unit> function0, AnnotatedString annotatedString) {
            this.$historyEmptyTextClick = function0;
            this.$historyEmptyText = annotatedString;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-872261470, i, -1, "com.robinhood.android.cash.rhy.tab.v2.ui.rhyRecentHistorySection.<anonymous> (RhyOverviewHistoryComposable.kt:82)");
            }
            Modifier modifierM4893clickableXHw0xAI$default = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifierM4893clickableXHw0xAI$default, 0.0f, 1, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            Modifier modifierM21622defaultHorizontalPaddingWMci_g0 = PaddingKt.m21622defaultHorizontalPaddingWMci_g0(modifierFillMaxWidth$default, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), composer, 6, 0);
            composer.startReplaceGroup(-724639023);
            if (this.$historyEmptyTextClick != null) {
                composer.startReplaceGroup(5004770);
                boolean zChanged = composer.changed(this.$historyEmptyTextClick);
                final Function0<Unit> function0 = this.$historyEmptyTextClick;
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.RhyOverviewHistoryComposableKt$rhyRecentHistorySection$4$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return RhyOverviewHistoryComposable3.C103664.invoke$lambda$1$lambda$0(function0);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifierM4893clickableXHw0xAI$default, false, null, null, (Function0) objRememberedValue, 7, null);
            }
            composer.endReplaceGroup();
            BentoText2.m20748BentoTextQnj7Zds(this.$historyEmptyText, modifierM21622defaultHorizontalPaddingWMci_g0.then(modifierM4893clickableXHw0xAI$default), null, null, null, null, null, 0, false, 0, 0, null, null, null, composer, 0, 0, 16380);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Function0 function0) {
            function0.invoke();
            return Unit.INSTANCE;
        }
    }

    public static final void listSectionWithShowMore(LazyListScope lazyListScope, final Function0<Unit> onShowMoreClicked, final boolean z, Function1<? super LazyListScope, Unit> listContent) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(onShowMoreClicked, "onShowMoreClicked");
        Intrinsics.checkNotNullParameter(listContent, "listContent");
        listContent.invoke(lazyListScope);
        LazyListScope.item$default(lazyListScope, CashTabSectionKey.HistoryShowMore, null, ComposableLambda3.composableLambdaInstance(1345094195, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.RhyOverviewHistoryComposableKt.listSectionWithShowMore.1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                invoke(lazyItemScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope item, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i & 17) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1345094195, i, -1, "com.robinhood.android.cash.rhy.tab.v2.ui.listSectionWithShowMore.<anonymous> (RhyOverviewHistoryComposable.kt:109)");
                }
                if (z) {
                    final Function0<Unit> function0 = onShowMoreClicked;
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1908386957, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.RhyOverviewHistoryComposableKt.listSectionWithShowMore.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i2) {
                            if ((i2 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1908386957, i2, -1, "com.robinhood.android.cash.rhy.tab.v2.ui.listSectionWithShowMore.<anonymous>.<anonymous> (RhyOverviewHistoryComposable.kt:111)");
                            }
                            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer2, 6, 1);
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i3 = BentoTheme.$stable;
                            Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(modifierM21623defaultHorizontalPaddingrAjV9yQ, 0.0f, bentoTheme.getSpacing(composer2, i3).m21593getSmallD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer2, i3).m21592getMediumD9Ej5fM(), 5, null);
                            BentoTextButton2.m20715BentoTextButtonPIknLig(function0, StringResources_androidKt.stringResource(C10285R.string.rhy_recent_history_show_more, composer2, 0), modifierM5146paddingqDBjuR0$default, null, null, false, null, composer2, 0, 120);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer, 54), composer, 6);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 2, null);
    }
}
