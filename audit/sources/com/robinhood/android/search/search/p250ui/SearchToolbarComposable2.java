package com.robinhood.android.search.search.p250ui;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.focus.FocusChangedModifier2;
import androidx.compose.p011ui.focus.FocusManager;
import androidx.compose.p011ui.focus.FocusRequester;
import androidx.compose.p011ui.focus.FocusRequesterModifier3;
import androidx.compose.p011ui.focus.FocusState;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoTextInput4;
import com.robinhood.compose.bento.component.BentoTextInput8;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SearchToolbarComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.search.search.ui.SearchToolbarComposableKt$SearchToolbarComposable$6$1$1, reason: use source file name */
/* loaded from: classes5.dex */
final class SearchToolbarComposable2 implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {
    final /* synthetic */ int $emptyTitleStr;
    final /* synthetic */ boolean $initialFocusSet;
    final /* synthetic */ String $initialQueryInput;
    final /* synthetic */ boolean $isRecentSearchDisplayed;
    final /* synthetic */ boolean $loading;
    final /* synthetic */ Function0<Unit> $onBackPressed;
    final /* synthetic */ Function1<Boolean, Unit> $onFocusChanged;
    final /* synthetic */ Function0<Unit> $onQueryCancelled;
    final /* synthetic */ Function1<String, Unit> $onQueryChanged;
    final /* synthetic */ Function0<Unit> $onQueryCleared;
    final /* synthetic */ boolean $showBackBtn;

    /* JADX WARN: Multi-variable type inference failed */
    SearchToolbarComposable2(String str, boolean z, boolean z2, boolean z3, Function0<Unit> function0, Function1<? super Boolean, Unit> function1, int i, Function1<? super String, Unit> function12, Function0<Unit> function02, boolean z4, Function0<Unit> function03) {
        this.$initialQueryInput = str;
        this.$initialFocusSet = z;
        this.$loading = z2;
        this.$showBackBtn = z3;
        this.$onBackPressed = function0;
        this.$onFocusChanged = function1;
        this.$emptyTitleStr = i;
        this.$onQueryChanged = function12;
        this.$onQueryCleared = function02;
        this.$isRecentSearchDisplayed = z4;
        this.$onQueryCancelled = function03;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
        invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
        return Unit.INSTANCE;
    }

    private static final void invoke$lambda$17$lambda$3(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState invoke$lambda$17$lambda$5$lambda$4(String str) {
        return SnapshotState3.mutableStateOf$default(str, null, 2, null);
    }

    private static final boolean invoke$lambda$17$lambda$2(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final String invoke$lambda$17$lambda$6(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$17$lambda$15$lambda$9$lambda$8(Function1 function1, SnapshotState snapshotState, FocusState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function1.invoke(Boolean.valueOf(it.isFocused()));
        invoke$lambda$17$lambda$3(snapshotState, it.isFocused());
        return Unit.INSTANCE;
    }

    public final void invoke(LazyItemScope stickyHeader, int i, Composer composer, int i2) {
        Function0<Unit> function0;
        String str;
        BentoTextInput8.Icon.Size24 size24;
        Modifier modifier;
        Intrinsics.checkNotNullParameter(stickyHeader, "$this$stickyHeader");
        if ((i2 & EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE) == 128 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(39784444, i2, -1, "com.robinhood.android.search.search.ui.SearchToolbarComposable.<anonymous>.<anonymous>.<anonymous> (SearchToolbarComposable.kt:60)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i3 = BentoTheme.$stable;
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Background3.m4872backgroundbw27NRU$default(companion, bentoTheme.getColors(composer, i3).m21371getBg0d7_KjU(), null, 2, null), 0.0f, 1, null);
        final String str2 = this.$initialQueryInput;
        boolean z = this.$initialFocusSet;
        boolean z2 = this.$loading;
        boolean z3 = this.$showBackBtn;
        Function0<Unit> function02 = this.$onBackPressed;
        final Function1<Boolean, Unit> function1 = this.$onFocusChanged;
        int i4 = this.$emptyTitleStr;
        final Function1<String, Unit> function12 = this.$onQueryChanged;
        final Function0<Unit> function03 = this.$onQueryCleared;
        boolean z4 = this.$isRecentSearchDisplayed;
        Function0<Unit> function04 = this.$onQueryCancelled;
        Arrangement arrangement = Arrangement.INSTANCE;
        Arrangement.Vertical top = arrangement.getTop();
        Alignment.Companion companion2 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierFillMaxWidth$default);
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        if (composer.getApplier() == null) {
            Composables.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
        Column6 column6 = Column6.INSTANCE;
        FocusManager focusManager = (FocusManager) composer.consume(CompositionLocalsKt.getLocalFocusManager());
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion4 = Composer.INSTANCE;
        if (objRememberedValue == companion4.getEmpty()) {
            objRememberedValue = new FocusRequester();
            composer.updateRememberedValue(objRememberedValue);
        }
        FocusRequester focusRequester = (FocusRequester) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion4.getEmpty()) {
            objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.valueOf(z), null, 2, null);
            composer.updateRememberedValue(objRememberedValue2);
        }
        final SnapshotState snapshotState = (SnapshotState) objRememberedValue2;
        composer.endReplaceGroup();
        Object[] objArr = new Object[0];
        composer.startReplaceGroup(5004770);
        boolean zChanged = composer.changed(str2);
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChanged || objRememberedValue3 == companion4.getEmpty()) {
            objRememberedValue3 = new Function0() { // from class: com.robinhood.android.search.search.ui.SearchToolbarComposableKt$SearchToolbarComposable$6$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SearchToolbarComposable2.invoke$lambda$17$lambda$5$lambda$4(str2);
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceGroup();
        final SnapshotState snapshotState2 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue3, composer, 0, 6);
        Modifier modifierM21618defaultFillMaxWidthPadding3ABfNKs = PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM());
        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM()), companion2.getCenterVertically(), composer, 48);
        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierM21618defaultFillMaxWidthPadding3ABfNKs);
        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
        if (composer.getApplier() == null) {
            Composables.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor2);
        } else {
            composer.useNode();
        }
        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer);
        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
        Row6 row6 = Row6.INSTANCE;
        SearchToolbarComposable.OptionalBackButton(z3, null, function02, composer, 0, 2);
        Modifier modifierFocusRequester = FocusRequesterModifier3.focusRequester(TestTag3.testTag(Row5.weight$default(row6, companion, 1.0f, false, 2, null), SearchToolbarComposable.TEST_TAG_TEXT_INPUT), focusRequester);
        composer.startReplaceGroup(-1633490746);
        boolean zChanged2 = composer.changed(function1);
        Object objRememberedValue4 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue4 == companion4.getEmpty()) {
            objRememberedValue4 = new Function1() { // from class: com.robinhood.android.search.search.ui.SearchToolbarComposableKt$SearchToolbarComposable$6$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SearchToolbarComposable2.invoke$lambda$17$lambda$15$lambda$9$lambda$8(function1, snapshotState, (FocusState) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue4);
        }
        composer.endReplaceGroup();
        Modifier modifierOnFocusChanged = FocusChangedModifier2.onFocusChanged(modifierFocusRequester, (Function1) objRememberedValue4);
        String strInvoke$lambda$17$lambda$6 = invoke$lambda$17$lambda$6(snapshotState2);
        String strStringResource = StringResources_androidKt.stringResource(i4, composer, 0);
        BentoTextInput8.Icon.Size24 size242 = new BentoTextInput8.Icon.Size24(ServerToBentoAssetMapper2.SEARCH_24, null, null, 6, null);
        if (invoke$lambda$17$lambda$6(snapshotState2).length() > 0) {
            function0 = function04;
            str = strStringResource;
            size24 = new BentoTextInput8.Icon.Size24(ServerToBentoAssetMapper2.CLOSE_24, null, null, 6, null);
        } else {
            function0 = function04;
            str = strStringResource;
            size24 = null;
        }
        composer.startReplaceGroup(-1633490746);
        boolean zChanged3 = composer.changed(snapshotState2) | composer.changed(function12);
        Object objRememberedValue5 = composer.rememberedValue();
        if (zChanged3 || objRememberedValue5 == companion4.getEmpty()) {
            objRememberedValue5 = new Function1() { // from class: com.robinhood.android.search.search.ui.SearchToolbarComposableKt$SearchToolbarComposable$6$1$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SearchToolbarComposable2.invoke$lambda$17$lambda$15$lambda$12$lambda$11(function12, snapshotState2, (String) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue5);
        }
        Function1 function13 = (Function1) objRememberedValue5;
        composer.endReplaceGroup();
        composer.startReplaceGroup(-1633490746);
        boolean zChanged4 = composer.changed(snapshotState2) | composer.changed(function03);
        Object objRememberedValue6 = composer.rememberedValue();
        if (zChanged4 || objRememberedValue6 == companion4.getEmpty()) {
            objRememberedValue6 = new Function0() { // from class: com.robinhood.android.search.search.ui.SearchToolbarComposableKt$SearchToolbarComposable$6$1$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SearchToolbarComposable2.invoke$lambda$17$lambda$15$lambda$14$lambda$13(function03, snapshotState2);
                }
            };
            composer.updateRememberedValue(objRememberedValue6);
        }
        composer.endReplaceGroup();
        int i5 = BentoTextInput8.Icon.Size24.$stable;
        Function0<Unit> function05 = function0;
        BentoTextInput4.BentoTextInput(strInvoke$lambda$17$lambda$6, function13, modifierOnFocusChanged, null, str, null, null, size242, size24, (Function0) objRememberedValue6, null, null, null, false, false, composer, (i5 << 24) | (i5 << 21), 0, 31848);
        AnimatedVisibilityKt.AnimatedVisibility(row6, invoke$lambda$17$lambda$2(snapshotState) || !StringsKt.isBlank(invoke$lambda$17$lambda$6(snapshotState2)) || z4, (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambda3.rememberComposableLambda(-817220726, true, new SearchToolbarComposable3(snapshotState2, focusManager, function05), composer, 54), composer, 1572870, 30);
        composer.endNode();
        composer.startReplaceGroup(-986600192);
        if (z) {
            Unit unit = Unit.INSTANCE;
            composer.startReplaceGroup(5004770);
            Object objRememberedValue7 = composer.rememberedValue();
            if (objRememberedValue7 == companion4.getEmpty()) {
                modifier = null;
                objRememberedValue7 = new SearchToolbarComposable4(focusRequester, null);
                composer.updateRememberedValue(objRememberedValue7);
            } else {
                modifier = null;
            }
            composer.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue7, composer, 6);
        } else {
            modifier = null;
        }
        composer.endReplaceGroup();
        SearchToolbarComposable.LoadingIndicator(z2, modifier, composer, 0, 2);
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$17$lambda$15$lambda$14$lambda$13(Function0 function0, SnapshotState snapshotState) {
        snapshotState.setValue("");
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$17$lambda$15$lambda$12$lambda$11(Function1 function1, SnapshotState snapshotState, String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        if (query.length() != 0) {
            String strJoinToString$default = SequencesKt.joinToString$default(Regex.findAll$default(SearchToolbarComposable.searchRegex, query, 0, 2, null), "", null, null, 0, null, new Function1() { // from class: com.robinhood.android.search.search.ui.SearchToolbarComposableKt$SearchToolbarComposable$6$1$1$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SearchToolbarComposable2.invoke$lambda$17$lambda$15$lambda$12$lambda$11$lambda$10((MatchResult) obj);
                }
            }, 30, null);
            if (strJoinToString$default.length() > 0) {
                snapshotState.setValue(strJoinToString$default);
                function1.invoke(strJoinToString$default);
            }
        } else {
            snapshotState.setValue(query);
            function1.invoke(query);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence invoke$lambda$17$lambda$15$lambda$12$lambda$11$lambda$10(MatchResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getValue();
    }
}
