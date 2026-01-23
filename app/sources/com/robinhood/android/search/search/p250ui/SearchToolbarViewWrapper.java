package com.robinhood.android.search.search.p250ui;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.search.C27909R;
import com.robinhood.android.search.search.SearchViewState;
import com.robinhood.android.search.search.p250ui.SearchToolbarViewWrapper;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SearchToolbarViewWrapper.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\u001b\u001cB\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00122\u001b\b\u0002\u0010\u0015\u001a\u0015\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016¢\u0006\u0002\b\u0017J\u001f\u0010\u0018\u001a\u00020\u00142\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u0016¢\u0006\u0002\b\u0017J\r\u0010\u0019\u001a\u00020\u0014H\u0017¢\u0006\u0002\u0010\u001aR+\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/search/search/ui/SearchToolbarViewWrapper;", "Lcom/robinhood/compose/app/GenericComposeView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "<set-?>", "Lcom/robinhood/android/search/search/ui/SearchToolbarViewWrapper$ViewState;", "uiState", "getUiState", "()Lcom/robinhood/android/search/search/ui/SearchToolbarViewWrapper$ViewState;", "setUiState", "(Lcom/robinhood/android/search/search/ui/SearchToolbarViewWrapper$ViewState;)V", "uiState$delegate", "Landroidx/compose/runtime/MutableState;", "callback", "Lcom/robinhood/android/search/search/ui/SearchToolbarViewWrapper$Callback;", "bind", "", "updateFunction", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "update", "Content", "(Landroidx/compose/runtime/Composer;I)V", "Callback", "ViewState", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class SearchToolbarViewWrapper extends Hammer_SearchToolbarViewWrapper {
    public static final int $stable = 8;
    private Callback callback;

    /* renamed from: uiState$delegate, reason: from kotlin metadata */
    private final SnapshotState uiState;

    /* compiled from: SearchToolbarViewWrapper.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\u0003H&¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/search/search/ui/SearchToolbarViewWrapper$Callback;", "", "onQueryChanged", "", "query", "", "onQueryCleared", "onQueryCancelled", "onFocusChanged", "focused", "", "onToolbarBackPressed", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callback {
        void onFocusChanged(boolean focused);

        void onQueryCancelled();

        void onQueryChanged(String query);

        void onQueryCleared();

        void onToolbarBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$1(SearchToolbarViewWrapper searchToolbarViewWrapper, int i, Composer composer, int i2) {
        searchToolbarViewWrapper.Content(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public /* synthetic */ SearchToolbarViewWrapper(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchToolbarViewWrapper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.uiState = SnapshotState3.mutableStateOf$default(new ViewState(null, false, 0, false, false, null, 63, null), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final ViewState getUiState() {
        return (ViewState) this.uiState.getValue();
    }

    private final void setUiState(ViewState viewState) {
        this.uiState.setValue(viewState);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void bind$default(SearchToolbarViewWrapper searchToolbarViewWrapper, Callback callback, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        searchToolbarViewWrapper.bind(callback, function1);
    }

    public final void bind(Callback callback, Function1<? super ViewState, ViewState> updateFunction) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.callback = callback;
        if (updateFunction != null) {
            setUiState(updateFunction.invoke(getUiState()));
        }
    }

    public final void update(Function1<? super ViewState, ViewState> updateFunction) {
        Intrinsics.checkNotNullParameter(updateFunction, "updateFunction");
        setUiState(updateFunction.invoke(getUiState()));
    }

    /* compiled from: SearchToolbarViewWrapper.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.search.search.ui.SearchToolbarViewWrapper$Content$1 */
    static final class C281401 implements Function2<Composer, Integer, Unit> {
        C281401() {
        }

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
                ComposerKt.traceEventStart(-373459354, i, -1, "com.robinhood.android.search.search.ui.SearchToolbarViewWrapper.Content.<anonymous> (SearchToolbarViewWrapper.kt:45)");
            }
            int hintText = SearchToolbarViewWrapper.this.getUiState().getHintText();
            boolean loading = SearchToolbarViewWrapper.this.getUiState().getLoading();
            boolean showBackButton = SearchToolbarViewWrapper.this.getUiState().getShowBackButton();
            String initialQueryInput = SearchToolbarViewWrapper.this.getUiState().getInitialQueryInput();
            boolean initialFocusSet = SearchToolbarViewWrapper.this.getUiState().getInitialFocusSet();
            boolean z = SearchToolbarViewWrapper.this.getUiState().getDisplayMode() == SearchViewState.DisplayMode.EMPTY_RECENT_SEARCH_LIST || SearchToolbarViewWrapper.this.getUiState().getDisplayMode() == SearchViewState.DisplayMode.RECENT_SEARCHES;
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(SearchToolbarViewWrapper.this);
            final SearchToolbarViewWrapper searchToolbarViewWrapper = SearchToolbarViewWrapper.this;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.search.search.ui.SearchToolbarViewWrapper$Content$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SearchToolbarViewWrapper.C281401.invoke$lambda$1$lambda$0(searchToolbarViewWrapper);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(SearchToolbarViewWrapper.this);
            final SearchToolbarViewWrapper searchToolbarViewWrapper2 = SearchToolbarViewWrapper.this;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.search.search.ui.SearchToolbarViewWrapper$Content$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SearchToolbarViewWrapper.C281401.invoke$lambda$3$lambda$2(searchToolbarViewWrapper2, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function1 function1 = (Function1) objRememberedValue2;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance3 = composer.changedInstance(SearchToolbarViewWrapper.this);
            final SearchToolbarViewWrapper searchToolbarViewWrapper3 = SearchToolbarViewWrapper.this;
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.search.search.ui.SearchToolbarViewWrapper$Content$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SearchToolbarViewWrapper.C281401.invoke$lambda$5$lambda$4(searchToolbarViewWrapper3);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            Function0 function02 = (Function0) objRememberedValue3;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance4 = composer.changedInstance(SearchToolbarViewWrapper.this);
            final SearchToolbarViewWrapper searchToolbarViewWrapper4 = SearchToolbarViewWrapper.this;
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new Function0() { // from class: com.robinhood.android.search.search.ui.SearchToolbarViewWrapper$Content$1$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SearchToolbarViewWrapper.C281401.invoke$lambda$7$lambda$6(searchToolbarViewWrapper4);
                    }
                };
                composer.updateRememberedValue(objRememberedValue4);
            }
            Function0 function03 = (Function0) objRememberedValue4;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance5 = composer.changedInstance(SearchToolbarViewWrapper.this);
            final SearchToolbarViewWrapper searchToolbarViewWrapper5 = SearchToolbarViewWrapper.this;
            Object objRememberedValue5 = composer.rememberedValue();
            if (zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = new Function1() { // from class: com.robinhood.android.search.search.ui.SearchToolbarViewWrapper$Content$1$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SearchToolbarViewWrapper.C281401.invoke$lambda$9$lambda$8(searchToolbarViewWrapper5, ((Boolean) obj).booleanValue());
                    }
                };
                composer.updateRememberedValue(objRememberedValue5);
            }
            composer.endReplaceGroup();
            SearchToolbarComposable.SearchToolbarComposable(null, function0, function1, function02, function03, (Function1) objRememberedValue5, hintText, loading, showBackButton, initialFocusSet, initialQueryInput, z, composer, 0, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(SearchToolbarViewWrapper searchToolbarViewWrapper) {
            Callback callback = searchToolbarViewWrapper.callback;
            if (callback != null) {
                callback.onToolbarBackPressed();
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(SearchToolbarViewWrapper searchToolbarViewWrapper, String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Callback callback = searchToolbarViewWrapper.callback;
            if (callback != null) {
                callback.onQueryChanged(it);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4(SearchToolbarViewWrapper searchToolbarViewWrapper) {
            Callback callback = searchToolbarViewWrapper.callback;
            if (callback != null) {
                callback.onQueryCleared();
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$7$lambda$6(SearchToolbarViewWrapper searchToolbarViewWrapper) {
            Callback callback = searchToolbarViewWrapper.callback;
            if (callback != null) {
                callback.onQueryCancelled();
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$9$lambda$8(SearchToolbarViewWrapper searchToolbarViewWrapper, boolean z) {
            Callback callback = searchToolbarViewWrapper.callback;
            if (callback != null) {
                callback.onFocusChanged(z);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeView
    public void Content(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1445890031);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1445890031, i2, -1, "com.robinhood.android.search.search.ui.SearchToolbarViewWrapper.Content (SearchToolbarViewWrapper.kt:43)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-373459354, true, new C281401(), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.search.search.ui.SearchToolbarViewWrapper$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SearchToolbarViewWrapper.Content$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: SearchToolbarViewWrapper.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u000bHÆ\u0003JE\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\u00052\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0007HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/search/search/ui/SearchToolbarViewWrapper$ViewState;", "", "initialQueryInput", "", "initialFocusSet", "", "hintText", "", "showBackButton", "loading", "displayMode", "Lcom/robinhood/android/search/search/SearchViewState$DisplayMode;", "<init>", "(Ljava/lang/String;ZIZZLcom/robinhood/android/search/search/SearchViewState$DisplayMode;)V", "getInitialQueryInput", "()Ljava/lang/String;", "getInitialFocusSet", "()Z", "getHintText", "()I", "getShowBackButton", "getLoading", "getDisplayMode", "()Lcom/robinhood/android/search/search/SearchViewState$DisplayMode;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ViewState {
        public static final int $stable = 0;
        private final SearchViewState.DisplayMode displayMode;
        private final int hintText;
        private final boolean initialFocusSet;
        private final String initialQueryInput;
        private final boolean loading;
        private final boolean showBackButton;

        public ViewState() {
            this(null, false, 0, false, false, null, 63, null);
        }

        public static /* synthetic */ ViewState copy$default(ViewState viewState, String str, boolean z, int i, boolean z2, boolean z3, SearchViewState.DisplayMode displayMode, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = viewState.initialQueryInput;
            }
            if ((i2 & 2) != 0) {
                z = viewState.initialFocusSet;
            }
            if ((i2 & 4) != 0) {
                i = viewState.hintText;
            }
            if ((i2 & 8) != 0) {
                z2 = viewState.showBackButton;
            }
            if ((i2 & 16) != 0) {
                z3 = viewState.loading;
            }
            if ((i2 & 32) != 0) {
                displayMode = viewState.displayMode;
            }
            boolean z4 = z3;
            SearchViewState.DisplayMode displayMode2 = displayMode;
            return viewState.copy(str, z, i, z2, z4, displayMode2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getInitialQueryInput() {
            return this.initialQueryInput;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getInitialFocusSet() {
            return this.initialFocusSet;
        }

        /* renamed from: component3, reason: from getter */
        public final int getHintText() {
            return this.hintText;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getShowBackButton() {
            return this.showBackButton;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getLoading() {
            return this.loading;
        }

        /* renamed from: component6, reason: from getter */
        public final SearchViewState.DisplayMode getDisplayMode() {
            return this.displayMode;
        }

        public final ViewState copy(String initialQueryInput, boolean initialFocusSet, int hintText, boolean showBackButton, boolean loading, SearchViewState.DisplayMode displayMode) {
            Intrinsics.checkNotNullParameter(initialQueryInput, "initialQueryInput");
            Intrinsics.checkNotNullParameter(displayMode, "displayMode");
            return new ViewState(initialQueryInput, initialFocusSet, hintText, showBackButton, loading, displayMode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) other;
            return Intrinsics.areEqual(this.initialQueryInput, viewState.initialQueryInput) && this.initialFocusSet == viewState.initialFocusSet && this.hintText == viewState.hintText && this.showBackButton == viewState.showBackButton && this.loading == viewState.loading && this.displayMode == viewState.displayMode;
        }

        public int hashCode() {
            return (((((((((this.initialQueryInput.hashCode() * 31) + Boolean.hashCode(this.initialFocusSet)) * 31) + Integer.hashCode(this.hintText)) * 31) + Boolean.hashCode(this.showBackButton)) * 31) + Boolean.hashCode(this.loading)) * 31) + this.displayMode.hashCode();
        }

        public String toString() {
            return "ViewState(initialQueryInput=" + this.initialQueryInput + ", initialFocusSet=" + this.initialFocusSet + ", hintText=" + this.hintText + ", showBackButton=" + this.showBackButton + ", loading=" + this.loading + ", displayMode=" + this.displayMode + ")";
        }

        public ViewState(String initialQueryInput, boolean z, int i, boolean z2, boolean z3, SearchViewState.DisplayMode displayMode) {
            Intrinsics.checkNotNullParameter(initialQueryInput, "initialQueryInput");
            Intrinsics.checkNotNullParameter(displayMode, "displayMode");
            this.initialQueryInput = initialQueryInput;
            this.initialFocusSet = z;
            this.hintText = i;
            this.showBackButton = z2;
            this.loading = z3;
            this.displayMode = displayMode;
        }

        public /* synthetic */ ViewState(String str, boolean z, int i, boolean z2, boolean z3, SearchViewState.DisplayMode displayMode, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? C27909R.string.search_hint : i, (i2 & 8) != 0 ? true : z2, (i2 & 16) != 0 ? false : z3, (i2 & 32) != 0 ? SearchViewState.DisplayMode.EMPTY : displayMode);
        }

        public final String getInitialQueryInput() {
            return this.initialQueryInput;
        }

        public final boolean getInitialFocusSet() {
            return this.initialFocusSet;
        }

        public final int getHintText() {
            return this.hintText;
        }

        public final boolean getShowBackButton() {
            return this.showBackButton;
        }

        public final boolean getLoading() {
            return this.loading;
        }

        public final SearchViewState.DisplayMode getDisplayMode() {
            return this.displayMode;
        }
    }
}
