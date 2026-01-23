package com.robinhood.android.creditcard.p091ui.creditapplication.address.search;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material3.Divider5;
import androidx.compose.material3.SnackbarHostKt;
import androidx.compose.material3.SnackbarHostState;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.focus.FocusChangedModifier2;
import androidx.compose.p011ui.focus.FocusState;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.creditcard.C12201R;
import com.robinhood.android.creditcard.p091ui.creditapplication.CreditApplicationScaffoldKt;
import com.robinhood.android.creditcard.p091ui.creditapplication.address.search.SearchAddressComposable;
import com.robinhood.android.creditcard.p091ui.creditapplication.loggingUtils;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextInput4;
import com.robinhood.compose.bento.component.BentoTextWithLink;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SearchAddressComposable.kt */
@Metadata(m3635d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u008d\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0001¢\u0006\u0002\u0010\u0013\"\u000e\u0010\u0014\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0018²\u0006\n\u0010\u0019\u001a\u00020\u0006X\u008a\u008e\u0002²\u0006\n\u0010\u001a\u001a\u00020\u0010X\u008a\u008e\u0002²\u0006\n\u0010\t\u001a\u00020\u0006X\u008a\u008e\u0002"}, m3636d2 = {"SearchAddress", "", "onBack", "Lkotlin/Function0;", "onContinue", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "placeId", "onEnterManually", "onQueryChange", "", "input", "onDismissError", "isShipping", "", "viewState", "Lcom/robinhood/android/creditcard/ui/creditapplication/address/search/SearchAddressViewState;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ZLcom/robinhood/android/creditcard/ui/creditapplication/address/search/SearchAddressViewState;Landroidx/compose/runtime/Composer;I)V", "SEARCH_ADDRESS_TITLE_TEST_TAG", "SEARCH_ADDRESS_QUERY_INPUT_TEST_TAG", "SEARCH_ADDRESS_NO_PREDICTION_TEST_TAG", "SEARCH_ADDRESS_NO_SHIPPING_TEST_TAG", "feature-credit-card_externalDebug", "query", "focused"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.address.search.SearchAddressComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class SearchAddressComposable {
    public static final String SEARCH_ADDRESS_NO_PREDICTION_TEST_TAG = "search-address-no-prediction-test-tag";
    public static final String SEARCH_ADDRESS_NO_SHIPPING_TEST_TAG = "search-address-no-shipping-test-tag";
    public static final String SEARCH_ADDRESS_QUERY_INPUT_TEST_TAG = "search-address-query-input-test-tag";
    public static final String SEARCH_ADDRESS_TITLE_TEST_TAG = "search-address-title-test-tag";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SearchAddress$lambda$14(Function0 function0, Function1 function1, Function0 function02, Function1 function12, Function0 function03, boolean z, SearchAddressViewState searchAddressViewState, int i, Composer composer, int i2) {
        SearchAddress(function0, function1, function02, function12, function03, z, searchAddressViewState, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void SearchAddress(final Function0<Unit> onBack, final Function1<? super String, Unit> onContinue, final Function0<Unit> onEnterManually, final Function1<? super CharSequence, Unit> onQueryChange, final Function0<Unit> onDismissError, final boolean z, final SearchAddressViewState viewState, Composer composer, final int i) {
        int i2;
        boolean z2;
        Object searchAddressComposable2;
        Boolean bool;
        Composer composer2;
        Composer composer3;
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Intrinsics.checkNotNullParameter(onContinue, "onContinue");
        Intrinsics.checkNotNullParameter(onEnterManually, "onEnterManually");
        Intrinsics.checkNotNullParameter(onQueryChange, "onQueryChange");
        Intrinsics.checkNotNullParameter(onDismissError, "onDismissError");
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Composer composerStartRestartGroup = composer.startRestartGroup(371998485);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(onBack) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onContinue) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onEnterManually) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onQueryChange) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onDismissError) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            z2 = z;
            i2 |= composerStartRestartGroup.changed(z2) ? 131072 : 65536;
        } else {
            z2 = z;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(viewState) ? 1048576 : 524288;
        }
        if ((599187 & i2) == 599186 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer3 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(371998485, i2, -1, "com.robinhood.android.creditcard.ui.creditapplication.address.search.SearchAddress (SearchAddressComposable.kt:56)");
            }
            EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            Object[] objArr = new Object[0];
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.address.search.SearchAddressComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SearchAddressComposable.SearchAddress$lambda$1$lambda$0();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            SnapshotState snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
            Object[] objArr2 = new Object[0];
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.address.search.SearchAddressComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SearchAddressComposable.SearchAddress$lambda$5$lambda$4();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            SnapshotState snapshotState2 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 3072, 6);
            Object[] objArr3 = new Object[0];
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.address.search.SearchAddressComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SearchAddressComposable.SearchAddress$lambda$9$lambda$8();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            SnapshotState snapshotState3 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr3, (Saver) null, (String) null, (Function0) objRememberedValue3, composerStartRestartGroup, 3072, 6);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new SnackbarHostState();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            final SnackbarHostState snackbarHostState = (SnackbarHostState) objRememberedValue4;
            composerStartRestartGroup.endReplaceGroup();
            List<AutocompletePrediction> predictions = (SearchAddress$lambda$2(snapshotState).length() != 0 && SearchAddress$lambda$6(snapshotState2)) ? viewState.getPredictions() : CollectionsKt.emptyList();
            String strStringResource = StringResources_androidKt.stringResource(C12201R.string.credit_app_unexpected_error_title, composerStartRestartGroup, 0);
            Boolean boolValueOf = Boolean.valueOf(viewState.getShowError());
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            boolean zChangedInstance = ((i2 & 57344) == 16384) | composerStartRestartGroup.changedInstance(viewState) | composerStartRestartGroup.changed(strStringResource);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue5 == companion.getEmpty()) {
                bool = boolValueOf;
                composer2 = composerStartRestartGroup;
                searchAddressComposable2 = new SearchAddressComposable2(viewState, snackbarHostState, strStringResource, onDismissError, null);
                composer2.updateRememberedValue(searchAddressComposable2);
            } else {
                searchAddressComposable2 = objRememberedValue5;
                bool = boolValueOf;
                composer2 = composerStartRestartGroup;
            }
            composer2.endReplaceGroup();
            EffectsKt.LaunchedEffect(bool, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) searchAddressComposable2, composer2, 0);
            Composer composer4 = composer2;
            CreditApplicationScaffoldKt.m12623CreditApplicationScaffoldTuSUGN0(new Screen(Screen.Name.CC_APPLICATION_ADDRESS_SEARCH, null, null, null, 14, null), null, null, onBack, null, null, null, null, ComposableLambda3.rememberComposableLambda(-1508704805, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.address.search.SearchAddressComposableKt.SearchAddress.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                    invoke(composer5, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer5, int i3) {
                    if ((i3 & 3) == 2 && composer5.getSkipping()) {
                        composer5.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1508704805, i3, -1, "com.robinhood.android.creditcard.ui.creditapplication.address.search.SearchAddress.<anonymous> (SearchAddressComposable.kt:83)");
                    }
                    SnackbarHostKt.SnackbarHost(snackbarHostState, null, null, composer5, 6, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer2, 54), null, false, false, ComposableLambda3.rememberComposableLambda(835513801, true, new C122843(z2, snapshotState2, snapshotState, onQueryChange, predictions, current, onEnterManually, snapshotState3, onContinue), composer2, 54), composer4, ((i2 << 9) & 7168) | 100663296, 384, 3830);
            composer3 = composer4;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.creditapplication.address.search.SearchAddressComposableKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SearchAddressComposable.SearchAddress$lambda$14(onBack, onContinue, onEnterManually, onQueryChange, onDismissError, z, viewState, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState SearchAddress$lambda$1$lambda$0() {
        return SnapshotState3.mutableStateOf$default("", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState SearchAddress$lambda$5$lambda$4() {
        return SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SearchAddress$lambda$7(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState SearchAddress$lambda$9$lambda$8() {
        return SnapshotState3.mutableStateOf$default("", null, 2, null);
    }

    /* compiled from: SearchAddressComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.address.search.SearchAddressComposableKt$SearchAddress$3 */
    static final class C122843 implements Function3<PaddingValues, Composer, Integer, Unit> {
        final /* synthetic */ EventLogger $eventLogger;
        final /* synthetic */ SnapshotState<Boolean> $focused$delegate;
        final /* synthetic */ boolean $isShipping;
        final /* synthetic */ Function1<String, Unit> $onContinue;
        final /* synthetic */ Function0<Unit> $onEnterManually;
        final /* synthetic */ Function1<CharSequence, Unit> $onQueryChange;
        final /* synthetic */ SnapshotState<String> $placeId$delegate;
        final /* synthetic */ List<AutocompletePrediction> $predictions;
        final /* synthetic */ SnapshotState<String> $query$delegate;

        /* JADX WARN: Multi-variable type inference failed */
        C122843(boolean z, SnapshotState<Boolean> snapshotState, SnapshotState<String> snapshotState2, Function1<? super CharSequence, Unit> function1, List<? extends AutocompletePrediction> list, EventLogger eventLogger, Function0<Unit> function0, SnapshotState<String> snapshotState3, Function1<? super String, Unit> function12) {
            this.$isShipping = z;
            this.$focused$delegate = snapshotState;
            this.$query$delegate = snapshotState2;
            this.$onQueryChange = function1;
            this.$predictions = list;
            this.$eventLogger = eventLogger;
            this.$onEnterManually = function0;
            this.$placeId$delegate = snapshotState3;
            this.$onContinue = function12;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v19 */
        /* JADX WARN: Type inference failed for: r2v20, types: [android.text.style.CharacterStyle, java.lang.Object, kotlin.jvm.internal.DefaultConstructorMarker] */
        /* JADX WARN: Type inference failed for: r2v29 */
        /* JADX WARN: Type inference failed for: r45v0, types: [android.text.style.CharacterStyle, kotlin.jvm.internal.DefaultConstructorMarker] */
        public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
            int i2;
            AutocompletePrediction autocompletePrediction;
            EventLogger eventLogger;
            SnapshotState<String> snapshotState;
            SnapshotState<String> snapshotState2;
            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
            int i3 = (i & 6) == 0 ? i | (composer.changed(paddingValues) ? 4 : 2) : i;
            if ((i3 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(835513801, i3, -1, "com.robinhood.android.creditcard.ui.creditapplication.address.search.SearchAddress.<anonymous> (SearchAddressComposable.kt:85)");
            }
            Alignment.Companion companion = Alignment.INSTANCE;
            Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierImePadding = WindowInsetsPadding_androidKt.imePadding(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(androidx.compose.foundation.layout.PaddingKt.padding(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), paddingValues), 0.0f, composer, 0, 1));
            boolean z = this.$isShipping;
            final SnapshotState<Boolean> snapshotState3 = this.$focused$delegate;
            final SnapshotState<String> snapshotState4 = this.$query$delegate;
            final Function1<CharSequence, Unit> function1 = this.$onQueryChange;
            List<AutocompletePrediction> list = this.$predictions;
            EventLogger eventLogger2 = this.$eventLogger;
            final Function0<Unit> function0 = this.$onEnterManually;
            SnapshotState<String> snapshotState5 = this.$placeId$delegate;
            Function1<String, Unit> function12 = this.$onContinue;
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierImePadding);
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
            Modifier modifierTestTag = TestTag3.testTag(companion2, SearchAddressComposable.SEARCH_ADDRESS_TITLE_TEST_TAG);
            String strStringResource = StringResources_androidKt.stringResource(z ? C12201R.string.credit_app_address_title_shipping : C12201R.string.credit_app_address_title_residential, composer, 0);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i4 = BentoTheme.$stable;
            Function1<String, Unit> function13 = function12;
            EventLogger eventLogger3 = eventLogger2;
            SnapshotState<String> snapshotState6 = snapshotState5;
            BentoText2.m20747BentoText38GnDrw(strStringResource, modifierTestTag, null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i4).getDisplayCapsuleLarge(), composer, 48, 0, 8124);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composer, i4).m21594getXlargeD9Ej5fM()), composer, 0);
            String strSearchAddress$lambda$2 = SearchAddressComposable.SearchAddress$lambda$2(snapshotState4);
            String strStringResource2 = StringResources_androidKt.stringResource(C12201R.string.credit_app_address_search_placeholder, composer, 0);
            composer.startReplaceGroup(5004770);
            boolean zChanged = composer.changed(snapshotState3);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.address.search.SearchAddressComposableKt$SearchAddress$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SearchAddressComposable.C122843.invoke$lambda$13$lambda$1$lambda$0(snapshotState3, (FocusState) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            Modifier modifierTestTag2 = TestTag3.testTag(FocusChangedModifier2.onFocusChanged(companion2, (Function1) objRememberedValue), SearchAddressComposable.SEARCH_ADDRESS_QUERY_INPUT_TEST_TAG);
            composer.startReplaceGroup(-1633490746);
            boolean zChanged2 = composer.changed(snapshotState4) | composer.changed(function1);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.address.search.SearchAddressComposableKt$SearchAddress$3$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SearchAddressComposable.C122843.invoke$lambda$13$lambda$3$lambda$2(function1, snapshotState4, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            SnapshotState<String> snapshotState7 = snapshotState4;
            BentoTextInput4.BentoTextInput(strSearchAddress$lambda$2, (Function1) objRememberedValue2, modifierTestTag2, null, strStringResource2, null, null, null, null, null, null, null, null, false, false, composer, 0, 0, 32744);
            Composer composer2 = composer;
            float f = 0.0f;
            ?? r2 = 0;
            int i5 = 1;
            Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), bentoTheme.getColors(composer2, i4).m21372getBg20d7_KjU(), null, 2, null);
            float f2 = 1;
            Modifier modifierM4877borderxT4_qwU$default = BorderKt.m4877borderxT4_qwU$default(modifierM4872backgroundbw27NRU$default, C2002Dp.m7995constructorimpl(f2), bentoTheme.getColors(composer2, i4).m21373getBg30d7_KjU(), null, 4, null);
            int i6 = 0;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composer2, 0);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierM4877borderxT4_qwU$default);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composer2.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor2);
            } else {
                composer2.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            composer2.startReplaceGroup(-1913805926);
            List<AutocompletePrediction> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (final AutocompletePrediction autocompletePrediction2 : list2) {
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, f, i5, r2);
                composer2.startReplaceGroup(-1224400529);
                final SnapshotState<String> snapshotState8 = snapshotState7;
                final SnapshotState<String> snapshotState9 = snapshotState6;
                final EventLogger eventLogger4 = eventLogger3;
                final Function1<String, Unit> function14 = function13;
                boolean zChanged3 = composer2.changed(snapshotState8) | composer2.changedInstance(autocompletePrediction2) | composer2.changed(snapshotState9) | composer2.changedInstance(eventLogger4) | composer2.changed(function14);
                Object objRememberedValue3 = composer2.rememberedValue();
                if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    Function0 function02 = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.address.search.SearchAddressComposableKt$SearchAddress$3$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SearchAddressComposable.C122843.invoke$lambda$13$lambda$10$lambda$9$lambda$5$lambda$4(autocompletePrediction2, eventLogger4, function14, snapshotState8, snapshotState9);
                        }
                    };
                    autocompletePrediction = autocompletePrediction2;
                    eventLogger = eventLogger4;
                    function13 = function14;
                    snapshotState = snapshotState8;
                    snapshotState2 = snapshotState9;
                    composer2.updateRememberedValue(function02);
                    objRememberedValue3 = function02;
                } else {
                    autocompletePrediction = autocompletePrediction2;
                    eventLogger = eventLogger4;
                    function13 = function14;
                    snapshotState = snapshotState8;
                    snapshotState2 = snapshotState9;
                }
                composer2.endReplaceGroup();
                Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifierFillMaxWidth$default, false, null, null, (Function0) objRememberedValue3, 7, null);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i7 = BentoTheme.$stable;
                Modifier modifierM5143paddingVpY3zN4 = androidx.compose.foundation.layout.PaddingKt.m5143paddingVpY3zN4(modifierM4893clickableXHw0xAI$default, bentoTheme2.getSpacing(composer2, i7).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composer2, i7).m21590getDefaultD9Ej5fM());
                String placeId = autocompletePrediction.getPlaceId();
                Intrinsics.checkNotNullExpressionValue(placeId, "getPlaceId(...)");
                Modifier modifierTestTag3 = TestTag3.testTag(modifierM5143paddingVpY3zN4, placeId);
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer2, i6);
                int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, i6);
                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer2, modifierTestTag3);
                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                if (composer2.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor3);
                } else {
                    composer2.useNode();
                }
                Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer2);
                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
                if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion4.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                AnnotatedString.Builder builder = new AnnotatedString.Builder(i6, i5, r2);
                builder.append((CharSequence) autocompletePrediction.getPrimaryText(r2));
                builder.append(PlaceholderUtils.XXShortPlaceholderText);
                AnnotatedString annotatedString = builder.toAnnotatedString();
                long jM21425getFg0d7_KjU = bentoTheme2.getColors(composer2, i7).m21425getFg0d7_KjU();
                TextStyle textM = bentoTheme2.getTypography(composer2, i7).getTextM();
                Color colorM6701boximpl = Color.m6701boximpl(jM21425getFg0d7_KjU);
                ?? r45 = r2;
                float f3 = f2;
                ArrayList arrayList2 = arrayList;
                BentoText2.m20748BentoTextQnj7Zds(annotatedString, null, colorM6701boximpl, null, null, null, null, 0, false, 1, 0, null, null, textM, composer, 805306368, 0, 7674);
                AnnotatedString.Builder builder2 = new AnnotatedString.Builder(0, 1, r45);
                builder2.append((CharSequence) autocompletePrediction.getSecondaryText(r45));
                BentoText2.m20748BentoTextQnj7Zds(builder2.toAnnotatedString(), null, Color.m6701boximpl(bentoTheme2.getColors(composer, i7).m21426getFg20d7_KjU()), null, null, null, null, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, null, bentoTheme2.getTypography(composer, i7).getTextM(), composer, 817889280, 0, 7546);
                composer.endNode();
                composer2 = composer;
                Divider5.m5851HorizontalDivider9IZ8Weo(null, C2002Dp.m7995constructorimpl(f3), bentoTheme2.getColors(composer, i7).m21373getBg30d7_KjU(), composer2, 48, 1);
                arrayList2.add(Unit.INSTANCE);
                arrayList = arrayList2;
                f2 = f3;
                snapshotState7 = snapshotState;
                snapshotState6 = snapshotState2;
                f = 0.0f;
                i5 = 1;
                eventLogger3 = eventLogger;
                r2 = 0;
                i6 = 0;
            }
            Composer composer3 = composer2;
            final EventLogger eventLogger5 = eventLogger3;
            composer3.endReplaceGroup();
            composer3.endNode();
            composer3.startReplaceGroup(-2119486072);
            if (list.isEmpty()) {
                Modifier.Companion companion5 = Modifier.INSTANCE;
                BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                int i8 = BentoTheme.$stable;
                i2 = 0;
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion5, bentoTheme3.getSpacing(composer3, i8).m21594getXlargeD9Ej5fM()), composer3, 0);
                Modifier modifierTestTag4 = TestTag3.testTag(companion5, SearchAddressComposable.SEARCH_ADDRESS_NO_PREDICTION_TEST_TAG);
                String strStringResource3 = StringResources_androidKt.stringResource(C12201R.string.credit_app_address_cant_find, composer3, 0);
                String strStringResource4 = StringResources_androidKt.stringResource(C12201R.string.credit_app_address_enter_manual, composer3, 0);
                long jM21425getFg0d7_KjU2 = bentoTheme3.getColors(composer3, i8).m21425getFg0d7_KjU();
                TextStyle textM2 = bentoTheme3.getTypography(composer3, i8).getTextM();
                int iM7919getCentere0LSkKk = TextAlign.INSTANCE.m7919getCentere0LSkKk();
                composer3.startReplaceGroup(-1633490746);
                boolean zChangedInstance = composer3.changedInstance(eventLogger5) | composer3.changed(function0);
                Object objRememberedValue4 = composer3.rememberedValue();
                if (zChangedInstance || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.address.search.SearchAddressComposableKt$SearchAddress$3$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SearchAddressComposable.C122843.invoke$lambda$13$lambda$12$lambda$11(eventLogger5, function0);
                        }
                    };
                    composer3.updateRememberedValue(objRememberedValue4);
                }
                composer3.endReplaceGroup();
                BentoTextWithLink.m20752BentoTextWithLinkXkG1Q0A(strStringResource3, strStringResource4, (Function0) objRememberedValue4, modifierTestTag4, jM21425getFg0d7_KjU2, 0L, textM2, iM7919getCentere0LSkKk, composer3, 3072, 32);
            } else {
                i2 = 0;
            }
            composer3.endReplaceGroup();
            composer3.startReplaceGroup(-2119461006);
            if (!z) {
                Modifier.Companion companion6 = Modifier.INSTANCE;
                Spacer2.Spacer(Column5.weight$default(column6, companion6, 1.0f, false, 2, null), composer3, i2);
                Modifier modifierTestTag5 = TestTag3.testTag(companion6, SearchAddressComposable.SEARCH_ADDRESS_NO_SHIPPING_TEST_TAG);
                String strStringResource5 = StringResources_androidKt.stringResource(C12201R.string.credit_app_update_helper_text, composer3, i2);
                BentoTheme bentoTheme4 = BentoTheme.INSTANCE;
                int i9 = BentoTheme.$stable;
                BentoText2.m20747BentoText38GnDrw(strStringResource5, modifierTestTag5, Color.m6701boximpl(bentoTheme4.getColors(composer3, i9).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme4.getTypography(composer3, i9).getTextS(), composer3, 48, 0, 8120);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion6, bentoTheme4.getSpacing(composer3, i9).m21590getDefaultD9Ej5fM()), composer3, 0);
            }
            composer3.endReplaceGroup();
            composer3.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$13$lambda$3$lambda$2(Function1 function1, SnapshotState snapshotState, String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            SearchAddressComposable.SearchAddress$lambda$3(snapshotState, it);
            function1.invoke(it);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$13$lambda$1$lambda$0(SnapshotState snapshotState, FocusState it) {
            Intrinsics.checkNotNullParameter(it, "it");
            SearchAddressComposable.SearchAddress$lambda$7(snapshotState, it.isFocused());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$13$lambda$10$lambda$9$lambda$5$lambda$4(AutocompletePrediction autocompletePrediction, EventLogger eventLogger, Function1 function1, SnapshotState snapshotState, SnapshotState snapshotState2) {
            String string2 = autocompletePrediction.getFullText(null).toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            SearchAddressComposable.SearchAddress$lambda$3(snapshotState, string2);
            String placeId = autocompletePrediction.getPlaceId();
            Intrinsics.checkNotNullExpressionValue(placeId, "getPlaceId(...)");
            SearchAddressComposable.SearchAddress$lambda$11(snapshotState2, placeId);
            EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.SELECT, loggingUtils.getCcScreen(), new Component(Component.ComponentType.SEARCH_RESULT_ROW, null, null, 6, null), null, null, false, 56, null);
            function1.invoke(SearchAddressComposable.SearchAddress$lambda$10(snapshotState2));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$13$lambda$12$lambda$11(EventLogger eventLogger, Function0 function0) {
            loggingUtils.logEdit$default(eventLogger, null, 1, null);
            function0.invoke();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String SearchAddress$lambda$10(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String SearchAddress$lambda$2(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    private static final boolean SearchAddress$lambda$6(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SearchAddress$lambda$11(SnapshotState<String> snapshotState, String str) {
        snapshotState.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SearchAddress$lambda$3(SnapshotState<String> snapshotState, String str) {
        snapshotState.setValue(str);
    }
}
