package com.robinhood.android.search.highlights.p249ui;

import android.content.Context;
import android.net.Uri;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.compose.p011ui.platform.ViewCompositionStrategy;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.search.highlights.C27914R;
import com.robinhood.android.search.highlights.p249ui.SearchHighlightDisclosureAdapter;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.utils.p409ui.view.recyclerview.GenericViewHolder;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SearchHighlightDisclosureAdapter.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tJ\b\u0010\f\u001a\u00020\rH\u0016J\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\rH\u0016J\u001e\u0010\u0012\u001a\u00020\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0014\u001a\u00020\rH\u0016J\u0016\u0010\u0015\u001a\u00020\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/search/highlights/ui/SearchHighlightDisclosureAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/robinhood/utils/ui/view/recyclerview/GenericViewHolder;", "Landroidx/compose/ui/platform/ComposeView;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "<init>", "(Lcom/robinhood/android/navigation/Navigator;)V", "shouldShow", "", "bind", "", "getItemCount", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "holder", "position", "onViewRecycled", "lib-search-highlights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class SearchHighlightDisclosureAdapter extends RecyclerView.Adapter<GenericViewHolder<? extends ComposeView>> {
    public static final int $stable = 8;
    private final Navigator navigator;
    private boolean shouldShow;

    public SearchHighlightDisclosureAdapter(Navigator navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.navigator = navigator;
    }

    public final void bind(boolean shouldShow) {
        boolean z = this.shouldShow;
        this.shouldShow = shouldShow;
        if (z != shouldShow) {
            if (shouldShow) {
                notifyItemInserted(0);
            } else {
                notifyItemRemoved(0);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: getItemCount */
    public int getSize() {
        return this.shouldShow ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public GenericViewHolder<ComposeView> onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnDetachedFromWindow.INSTANCE);
        return new GenericViewHolder<>(composeView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(GenericViewHolder<ComposeView> holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ((ComposeView) holder.getView()).setContent(ComposableLambda3.composableLambdaInstance(-299123003, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.search.highlights.ui.SearchHighlightDisclosureAdapter.onBindViewHolder.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                if ((i & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-299123003, i, -1, "com.robinhood.android.search.highlights.ui.SearchHighlightDisclosureAdapter.onBindViewHolder.<anonymous> (SearchHighlightDisclosureAdapter.kt:60)");
                }
                ProvidedValue<Navigator> providedValueProvides = LocalNavigator.getLocalNavigator().provides(SearchHighlightDisclosureAdapter.this.navigator);
                final SearchHighlightDisclosureAdapter searchHighlightDisclosureAdapter = SearchHighlightDisclosureAdapter.this;
                CompositionLocal3.CompositionLocalProvider(providedValueProvides, ComposableLambda3.rememberComposableLambda(788685317, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.search.highlights.ui.SearchHighlightDisclosureAdapter.onBindViewHolder.1.1

                    /* compiled from: SearchHighlightDisclosureAdapter.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.search.highlights.ui.SearchHighlightDisclosureAdapter$onBindViewHolder$1$1$1, reason: invalid class name and collision with other inner class name */
                    static final class C505261 implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ SearchHighlightDisclosureAdapter this$0;

                        C505261(SearchHighlightDisclosureAdapter searchHighlightDisclosureAdapter) {
                            this.this$0 = searchHighlightDisclosureAdapter;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$3$lambda$2$lambda$1$lambda$0(SearchHighlightDisclosureAdapter searchHighlightDisclosureAdapter, Context context, String url) {
                            Intrinsics.checkNotNullParameter(url, "url");
                            Uri uri = Uri.parse(url);
                            if (searchHighlightDisclosureAdapter.navigator.isDeepLinkSupported(uri)) {
                                Navigator.DefaultImpls.handleDeepLink$default(searchHighlightDisclosureAdapter.navigator, context, uri, null, null, false, null, 60, null);
                            }
                            return Unit.INSTANCE;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                            invoke(composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer, int i) {
                            boolean z;
                            Composer composer2 = composer;
                            if ((i & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-935165107, i, -1, "com.robinhood.android.search.highlights.ui.SearchHighlightDisclosureAdapter.onBindViewHolder.<anonymous>.<anonymous>.<anonymous> (SearchHighlightDisclosureAdapter.kt:62)");
                            }
                            Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21592getMediumD9Ej5fM());
                            final SearchHighlightDisclosureAdapter searchHighlightDisclosureAdapter = this.this$0;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM5142padding3ABfNKs);
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            final Context context = (Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            List listListOf = CollectionsKt.listOf((Object[]) new String[]{StringResources_androidKt.stringResource(C27914R.string.search_disclosure_first_part, composer2, 0), StringResources_androidKt.stringResource(C27914R.string.gated_options_search_disclosure_second_part, composer2, 0), StringResources_androidKt.stringResource(C27914R.string.search_disclosure_third_part, composer2, 0)});
                            composer2.startReplaceGroup(-927438208);
                            int i2 = 0;
                            for (Object obj : listListOf) {
                                int i3 = i2 + 1;
                                if (i2 < 0) {
                                    CollectionsKt.throwIndexOverflow();
                                }
                                String str = (String) obj;
                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                int i4 = i2;
                                BentoMarkdownText bentoMarkdownText = BentoMarkdownText.INSTANCE;
                                int iM7924getStarte0LSkKk = TextAlign.INSTANCE.m7924getStarte0LSkKk();
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i5 = BentoTheme.$stable;
                                List list = listListOf;
                                MarkdownStyle markdownStyleM21100withTextStylesYhh7B2I = bentoMarkdownText.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composer2, i5).getTextS(), iM7924getStarte0LSkKk, bentoTheme.getColors(composer2, i5).m21426getFg20d7_KjU(), bentoTheme.getColors(composer2, i5).m21426getFg20d7_KjU(), false, composer, BentoMarkdownText.$stable << 15, 16);
                                composer2 = composer;
                                composer2.startReplaceGroup(-1633490746);
                                boolean zChangedInstance = composer2.changedInstance(searchHighlightDisclosureAdapter) | composer2.changedInstance(context);
                                Object objRememberedValue = composer2.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function1() { // from class: com.robinhood.android.search.highlights.ui.SearchHighlightDisclosureAdapter$onBindViewHolder$1$1$1$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj2) {
                                            return SearchHighlightDisclosureAdapter.C279361.AnonymousClass1.C505261.invoke$lambda$3$lambda$2$lambda$1$lambda$0(searchHighlightDisclosureAdapter, context, (String) obj2);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue);
                                }
                                composer2.endReplaceGroup();
                                BentoMarkdownText2.BentoMarkdownText(str, companion2, markdownStyleM21100withTextStylesYhh7B2I, (Function0<Unit>) null, (Function1<? super String, Unit>) objRememberedValue, composer2, (MarkdownStyle.$stable << 6) | 48, 8);
                                composer2.startReplaceGroup(-927402615);
                                if (i4 < list.size() - 1) {
                                    z = false;
                                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composer2, i5).m21590getDefaultD9Ej5fM()), composer2, 0);
                                } else {
                                    z = false;
                                }
                                composer2.endReplaceGroup();
                                i2 = i3;
                                listListOf = list;
                            }
                            composer2.endReplaceGroup();
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }

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
                            ComposerKt.traceEventStart(788685317, i2, -1, "com.robinhood.android.search.highlights.ui.SearchHighlightDisclosureAdapter.onBindViewHolder.<anonymous>.<anonymous> (SearchHighlightDisclosureAdapter.kt:61)");
                        }
                        BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-935165107, true, new C505261(searchHighlightDisclosureAdapter), composer2, 54), composer2, 100663296, 255);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, ProvidedValue.$stable | 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(GenericViewHolder<ComposeView> holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ((ComposeView) holder.getView()).disposeComposition();
    }
}
