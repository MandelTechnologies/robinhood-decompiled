package com.robinhood.android.taxcenter.previousdocuments;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
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
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.taxcenter.C29236R;
import com.robinhood.android.taxcenter.previousdocuments.PreviousTaxDocumentsComposable3;
import com.robinhood.android.taxcenter.previousdocuments.PreviousTaxDocumentsViewState;
import com.robinhood.compose.bento.component.BentoChip;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.common.HeaderButtonBarScreenLayout6;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.utils.resource.StringResource;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: PreviousTaxDocumentsComposable.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001ac\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072<\u0010\b\u001a8\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\n0\u000e¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00010\tH\u0007¢\u0006\u0002\u0010\u0010\u001ac\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072<\u0010\b\u001a8\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\n0\u000e¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00010\tH\u0003¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"PreviousTaxDocumentsComposable", "", "state", "Lcom/robinhood/android/taxcenter/previousdocuments/PreviousTaxDocumentsViewState;", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "listState", "Landroidx/compose/foundation/lazy/LazyListState;", "onShowYearSelector", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "activeYear", "", "yearList", "(Lcom/robinhood/android/taxcenter/previousdocuments/PreviousTaxDocumentsViewState;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/lazy/LazyListState;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Content", "Lcom/robinhood/android/taxcenter/previousdocuments/PreviousTaxDocumentsViewState$DocumentList;", "(Lcom/robinhood/android/taxcenter/previousdocuments/PreviousTaxDocumentsViewState$DocumentList;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/lazy/LazyListState;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "feature-tax-center_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.taxcenter.previousdocuments.PreviousTaxDocumentsComposableKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class PreviousTaxDocumentsComposable3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$2(PreviousTaxDocumentsViewState.DocumentList documentList, PaddingValues paddingValues, LazyListState lazyListState, Function2 function2, int i, Composer composer, int i2) {
        Content(documentList, paddingValues, lazyListState, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviousTaxDocumentsComposable$lambda$1(PreviousTaxDocumentsViewState previousTaxDocumentsViewState, PaddingValues paddingValues, LazyListState lazyListState, Function2 function2, int i, Composer composer, int i2) {
        PreviousTaxDocumentsComposable(previousTaxDocumentsViewState, paddingValues, lazyListState, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void PreviousTaxDocumentsComposable(final PreviousTaxDocumentsViewState state, final PaddingValues paddingValues, final LazyListState listState, final Function2<? super String, ? super List<String>, Unit> onShowYearSelector, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        Intrinsics.checkNotNullParameter(listState, "listState");
        Intrinsics.checkNotNullParameter(onShowYearSelector, "onShowYearSelector");
        Composer composerStartRestartGroup = composer.startRestartGroup(1026674671);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(paddingValues) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(listState) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onShowYearSelector) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1026674671, i2, -1, "com.robinhood.android.taxcenter.previousdocuments.PreviousTaxDocumentsComposable (PreviousTaxDocumentsComposable.kt:26)");
            }
            if (state instanceof PreviousTaxDocumentsViewState.Loading) {
                composerStartRestartGroup.startReplaceGroup(-1208108768);
                LocalShowPlaceholder.Loadable(true, null, null, ComposableLambda3.rememberComposableLambda(62707175, true, new C292471(state, paddingValues, listState), composerStartRestartGroup, 54), composerStartRestartGroup, 3078, 6);
                composerStartRestartGroup.endReplaceGroup();
            } else if (Intrinsics.areEqual(state, PreviousTaxDocumentsViewState.Empty.INSTANCE)) {
                composerStartRestartGroup.startReplaceGroup(-1208098132);
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C29236R.string.empty_documents_message, composerStartRestartGroup, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, 0, 0, 16382);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(state instanceof PreviousTaxDocumentsViewState.DocumentList)) {
                    composerStartRestartGroup.startReplaceGroup(-1208110662);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(-1208088813);
                Content((PreviousTaxDocumentsViewState.DocumentList) state, paddingValues, listState, onShowYearSelector, composerStartRestartGroup, i2 & 8176);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.taxcenter.previousdocuments.PreviousTaxDocumentsComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PreviousTaxDocumentsComposable3.PreviousTaxDocumentsComposable$lambda$1(state, paddingValues, listState, onShowYearSelector, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: PreviousTaxDocumentsComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.taxcenter.previousdocuments.PreviousTaxDocumentsComposableKt$PreviousTaxDocumentsComposable$1 */
    static final class C292471 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ LazyListState $listState;
        final /* synthetic */ PaddingValues $paddingValues;
        final /* synthetic */ PreviousTaxDocumentsViewState $state;

        C292471(PreviousTaxDocumentsViewState previousTaxDocumentsViewState, PaddingValues paddingValues, LazyListState lazyListState) {
            this.$state = previousTaxDocumentsViewState;
            this.$paddingValues = paddingValues;
            this.$listState = lazyListState;
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
                ComposerKt.traceEventStart(62707175, i, -1, "com.robinhood.android.taxcenter.previousdocuments.PreviousTaxDocumentsComposable.<anonymous> (PreviousTaxDocumentsComposable.kt:30)");
            }
            PreviousTaxDocumentsViewState.DocumentList mock = ((PreviousTaxDocumentsViewState.Loading) this.$state).getMock();
            PaddingValues paddingValues = this.$paddingValues;
            LazyListState lazyListState = this.$listState;
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function2() { // from class: com.robinhood.android.taxcenter.previousdocuments.PreviousTaxDocumentsComposableKt$PreviousTaxDocumentsComposable$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return PreviousTaxDocumentsComposable3.C292471.invoke$lambda$1$lambda$0((String) obj, (List) obj2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            PreviousTaxDocumentsComposable3.Content(mock, paddingValues, lazyListState, (Function2) objRememberedValue, composer, 3072);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(String str, List list) {
            Intrinsics.checkNotNullParameter(str, "<unused var>");
            Intrinsics.checkNotNullParameter(list, "<unused var>");
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Content(final PreviousTaxDocumentsViewState.DocumentList documentList, final PaddingValues paddingValues, final LazyListState lazyListState, final Function2<? super String, ? super List<String>, Unit> function2, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1046065478);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(documentList) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(paddingValues) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(lazyListState) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1046065478, i2, -1, "com.robinhood.android.taxcenter.previousdocuments.Content (PreviousTaxDocumentsComposable.kt:62)");
            }
            HeaderButtonBarScreenLayout6.HeaderButtonBarScreenLayout(null, ComposableLambda3.rememberComposableLambda(711965128, true, new C292451(documentList, function2), composerStartRestartGroup, 54), PreviousTaxDocumentsComposable.INSTANCE.getLambda$318846964$feature_tax_center_externalDebug(), ComposableLambda3.rememberComposableLambda(-1569156790, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.taxcenter.previousdocuments.PreviousTaxDocumentsComposableKt.Content.2
                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1569156790, i3, -1, "com.robinhood.android.taxcenter.previousdocuments.Content.<anonymous> (PreviousTaxDocumentsComposable.kt:75)");
                    }
                    List<UIComponent<GenericAction>> content = documentList.getContent();
                    Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, paddingValues);
                    LazyListState lazyListState2 = lazyListState;
                    composer2.startReplaceGroup(1076610452);
                    HorizontalPadding horizontalPadding = HorizontalPadding.Default;
                    ImmutableList3 persistentList = extensions2.toPersistentList(content);
                    composer2.startReplaceGroup(767440808);
                    SduiColumns.SduiLazyColumn(persistentList, GenericAction.class, modifierPadding, lazyListState2, null, null, horizontalPadding, false, composer2, 12582912, 0);
                    composer2.endReplaceGroup();
                    composer2.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 3504, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.taxcenter.previousdocuments.PreviousTaxDocumentsComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PreviousTaxDocumentsComposable3.Content$lambda$2(documentList, paddingValues, lazyListState, function2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: PreviousTaxDocumentsComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.taxcenter.previousdocuments.PreviousTaxDocumentsComposableKt$Content$1 */
    static final class C292451 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Function2<String, List<String>, Unit> $onShowYearSelector;
        final /* synthetic */ PreviousTaxDocumentsViewState.DocumentList $state;

        /* JADX WARN: Multi-variable type inference failed */
        C292451(PreviousTaxDocumentsViewState.DocumentList documentList, Function2<? super String, ? super List<String>, Unit> function2) {
            this.$state = documentList;
            this.$onShowYearSelector = function2;
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
                ComposerKt.traceEventStart(711965128, i, -1, "com.robinhood.android.taxcenter.previousdocuments.Content.<anonymous> (PreviousTaxDocumentsComposable.kt:65)");
            }
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer, 6, 1);
            StringResource displayYear = this.$state.getDisplayYear();
            Resources resources = ((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            String string2 = displayYear.getText(resources).toString();
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(this.$onShowYearSelector) | composer.changedInstance(this.$state);
            final Function2<String, List<String>, Unit> function2 = this.$onShowYearSelector;
            final PreviousTaxDocumentsViewState.DocumentList documentList = this.$state;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.taxcenter.previousdocuments.PreviousTaxDocumentsComposableKt$Content$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PreviousTaxDocumentsComposable3.C292451.invoke$lambda$1$lambda$0(function2, documentList);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoChip.BentoDropdownChip((Function0) objRememberedValue, modifierM21623defaultHorizontalPaddingrAjV9yQ, false, null, string2, composer, 0, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Function2 function2, PreviousTaxDocumentsViewState.DocumentList documentList) {
            function2.invoke(documentList.getActiveYear(), documentList.getYearList());
            return Unit.INSTANCE;
        }
    }
}
