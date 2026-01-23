package com.robinhood.android.pathfinder.corepages.documentrequestslist;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.lib.pathfinder.extensions.IconTypes;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.RichTexts2;
import com.robinhood.android.pathfinder.corepages.documentrequestslist.DocumentRequestsListViewState;
import com.robinhood.compose.app.ErrorScreenComposable;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.models.p355ui.pathfinder.contexts.DocumentRequest;
import com.robinhood.models.serverdriven.p347db.RichText;
import com.robinhood.shared.pathfinder.corepages.C39352R;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DocumentRequestsListComposable.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\t\u001aE\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0001¢\u0006\u0002\u0010\n\u001a7\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\f2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0003¢\u0006\u0002\u0010\r\u001a\u0017\u0010\u000e\u001a\u00020\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0003¢\u0006\u0002\u0010\u0011\u001a\u0017\u0010\u0012\u001a\u00020\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0003¢\u0006\u0002\u0010\u0011\u001a\u0017\u0010\u0013\u001a\u00020\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0003¢\u0006\u0002\u0010\u0011\u001aA\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u0003¢\u0006\u0002\u0010\u001b\u001a1\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u001a2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u0003¢\u0006\u0002\u0010\u001f\u001a\r\u0010 \u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010!\"\u000e\u0010\"\u001a\u00020#X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010$\u001a\u00020#X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010%\u001a\u00020#X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010&\u001a\u00020#X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010'\u001a\u00020#X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010(\u001a\u00020#X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010)\u001a\u00020#X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010*\u001a\u00020#X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010+\u001a\u00020#X\u0080T¢\u0006\u0002\n\u0000¨\u0006,"}, m3636d2 = {"DocumentRequestsListComposable", "", "state", "Lcom/robinhood/android/pathfinder/corepages/documentrequestslist/DocumentRequestsListViewState;", "onClickDocument", "Lkotlin/Function1;", "Lcom/robinhood/models/ui/pathfinder/contexts/DocumentRequest;", "onClickContinue", "Lkotlin/Function0;", "onClickRetry", "(Lcom/robinhood/android/pathfinder/corepages/documentrequestslist/DocumentRequestsListViewState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Content", "Lcom/robinhood/android/pathfinder/corepages/documentrequestslist/DocumentRequestsListViewState$Loaded;", "(Lcom/robinhood/android/pathfinder/corepages/documentrequestslist/DocumentRequestsListViewState$Loaded;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Preheading", "text", "Lcom/robinhood/models/serverdriven/db/RichText;", "(Lcom/robinhood/models/serverdriven/db/RichText;Landroidx/compose/runtime/Composer;I)V", "Heading", "Subheading", "DocumentRequests", "modifier", "Landroidx/compose/ui/Modifier;", "documentRequests", "", "isSendingInput", "", "(Landroidx/compose/ui/Modifier;Ljava/util/List;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "DocumentRequest", "documentRequest", "onClick", "(Lcom/robinhood/models/ui/pathfinder/contexts/DocumentRequest;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "DocumentRequestsListComposablePreview", "(Landroidx/compose/runtime/Composer;I)V", DocumentRequestsListComposable4.DocumentRequestsListTestTagContent, "", DocumentRequestsListComposable4.DocumentRequestsListTestTagError, DocumentRequestsListComposable4.DocumentRequestsListTestTagPreheading, DocumentRequestsListComposable4.DocumentRequestsListTestTagHeading, DocumentRequestsListComposable4.DocumentRequestsListTestTagSubheading, DocumentRequestsListComposable4.DocumentRequestsListTestTagList, DocumentRequestsListComposable4.DocumentRequestsListTestTagRow, DocumentRequestsListComposable4.DocumentRequestsListTestTagContinue, DocumentRequestsListComposable4.DocumentRequestsListTestTagLoadingContent, "feature-pathfinder-core-pages_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.pathfinder.corepages.documentrequestslist.DocumentRequestsListComposableKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class DocumentRequestsListComposable4 {
    public static final String DocumentRequestsListTestTagContent = "DocumentRequestsListTestTagContent";
    public static final String DocumentRequestsListTestTagContinue = "DocumentRequestsListTestTagContinue";
    public static final String DocumentRequestsListTestTagError = "DocumentRequestsListTestTagError";
    public static final String DocumentRequestsListTestTagHeading = "DocumentRequestsListTestTagHeading";
    public static final String DocumentRequestsListTestTagList = "DocumentRequestsListTestTagList";
    public static final String DocumentRequestsListTestTagLoadingContent = "DocumentRequestsListTestTagLoadingContent";
    public static final String DocumentRequestsListTestTagPreheading = "DocumentRequestsListTestTagPreheading";
    public static final String DocumentRequestsListTestTagRow = "DocumentRequestsListTestTagRow";
    public static final String DocumentRequestsListTestTagSubheading = "DocumentRequestsListTestTagSubheading";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$2(DocumentRequestsListViewState.Loaded loaded, Function1 function1, Function0 function0, int i, Composer composer, int i2) {
        Content(loaded, function1, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DocumentRequest$lambda$12(DocumentRequest documentRequest, boolean z, Function1 function1, int i, Composer composer, int i2) {
        DocumentRequest(documentRequest, z, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DocumentRequests$lambda$9(Modifier modifier, List list, boolean z, Function1 function1, int i, int i2, Composer composer, int i3) {
        DocumentRequests(modifier, list, z, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DocumentRequestsListComposable$lambda$0(DocumentRequestsListViewState documentRequestsListViewState, Function1 function1, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        DocumentRequestsListComposable(documentRequestsListViewState, function1, function0, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DocumentRequestsListComposablePreview$lambda$13(int i, Composer composer, int i2) {
        DocumentRequestsListComposablePreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Heading$lambda$4(RichText richText, int i, Composer composer, int i2) {
        Heading(richText, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preheading$lambda$3(RichText richText, int i, Composer composer, int i2) {
        Preheading(richText, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Subheading$lambda$5(RichText richText, int i, Composer composer, int i2) {
        Subheading(richText, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void DocumentRequestsListComposable(final DocumentRequestsListViewState state, final Function1<? super DocumentRequest, Unit> onClickDocument, final Function0<Unit> onClickContinue, final Function0<Unit> onClickRetry, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onClickDocument, "onClickDocument");
        Intrinsics.checkNotNullParameter(onClickContinue, "onClickContinue");
        Intrinsics.checkNotNullParameter(onClickRetry, "onClickRetry");
        Composer composerStartRestartGroup = composer.startRestartGroup(-936923811);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onClickDocument) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onClickContinue) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onClickRetry) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-936923811, i2, -1, "com.robinhood.android.pathfinder.corepages.documentrequestslist.DocumentRequestsListComposable (DocumentRequestsListComposable.kt:35)");
            }
            if (state instanceof DocumentRequestsListViewState.Loaded) {
                composerStartRestartGroup.startReplaceGroup(1095490482);
                Content((DocumentRequestsListViewState.Loaded) state, onClickDocument, onClickContinue, composerStartRestartGroup, i2 & 1008);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(state instanceof DocumentRequestsListViewState.Error)) {
                    composerStartRestartGroup.startReplaceGroup(1559357255);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(1095719882);
                ErrorScreenComposable.ErrorScreenComposable(TestTag3.testTag(Modifier.INSTANCE, DocumentRequestsListTestTagError), onClickRetry, 0, null, null, null, null, false, composerStartRestartGroup, ((i2 >> 6) & 112) | 6, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.pathfinder.corepages.documentrequestslist.DocumentRequestsListComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DocumentRequestsListComposable4.DocumentRequestsListComposable$lambda$0(state, onClickDocument, onClickContinue, onClickRetry, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Content(final DocumentRequestsListViewState.Loaded loaded, final Function1<? super DocumentRequest, Unit> function1, Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        final Function0<Unit> function02;
        Composer composerStartRestartGroup = composer.startRestartGroup(-287003660);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(loaded) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        int i3 = i2;
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-287003660, i3, -1, "com.robinhood.android.pathfinder.corepages.documentrequestslist.Content (DocumentRequestsListComposable.kt:59)");
            }
            boolean zIsSendingInput = loaded.isSendingInput();
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(TestTag3.testTag(companion, DocumentRequestsListTestTagContent), 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            Preheading(loaded.getPreheading(), composerStartRestartGroup, 0);
            Heading(loaded.getHeading(), composerStartRestartGroup, 0);
            Subheading(loaded.getSubheading(), composerStartRestartGroup, 0);
            DocumentRequests(Column5.weight$default(column6, TestTag3.testTag(companion, DocumentRequestsListTestTagList), 1.0f, false, 2, null), loaded.getDocumentRequests(), zIsSendingInput, function1, composerStartRestartGroup, (i3 << 6) & 7168, 0);
            composerStartRestartGroup.startReplaceGroup(-2086218413);
            if (loaded.getShouldShowContinueButton()) {
                Modifier modifierTestTag = TestTag3.testTag(companion, DocumentRequestsListTestTagContinue);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i4 = BentoTheme.$stable;
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(modifierTestTag, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM(), 7, null), 0.0f, 1, null);
                composerStartRestartGroup = composerStartRestartGroup;
                function02 = function0;
                BentoButtonKt.m20586BentoButtonEikTQX8(function02, StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composerStartRestartGroup, 0), modifierFillMaxWidth$default2, null, null, !zIsSendingInput, zIsSendingInput, null, null, null, null, false, null, composerStartRestartGroup, (i3 >> 6) & 14, 0, 8088);
            } else {
                composerStartRestartGroup = composerStartRestartGroup;
                function02 = function0;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            function02 = function0;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.pathfinder.corepages.documentrequestslist.DocumentRequestsListComposableKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DocumentRequestsListComposable4.Content$lambda$2(loaded, function1, function02, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Preheading(final RichText richText, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1674837987);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(richText) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1674837987, i2, -1, "com.robinhood.android.pathfinder.corepages.documentrequestslist.Preheading (DocumentRequestsListComposable.kt:97)");
            }
            if (richText != null) {
                Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, DocumentRequestsListTestTagPreheading);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i3 = BentoTheme.$stable;
                BentoText2.m20748BentoTextQnj7Zds(RichTexts2.m15956toAnnotatedStringiJQMabo(richText, 0L, composerStartRestartGroup, i2 & 14, 1), PaddingKt.m5146paddingqDBjuR0$default(modifierTestTag, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM(), 6, null), null, null, null, null, null, 0, false, 0, 0, null, null, null, composerStartRestartGroup, 0, 0, 16380);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.pathfinder.corepages.documentrequestslist.DocumentRequestsListComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DocumentRequestsListComposable4.Preheading$lambda$3(richText, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Heading(final RichText richText, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(2098573718);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(richText) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2098573718, i2, -1, "com.robinhood.android.pathfinder.corepages.documentrequestslist.Heading (DocumentRequestsListComposable.kt:109)");
            }
            if (richText != null) {
                Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, DocumentRequestsListTestTagHeading);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i3 = BentoTheme.$stable;
                BentoText2.m20748BentoTextQnj7Zds(RichTexts2.m15956toAnnotatedStringiJQMabo(richText, 0L, composerStartRestartGroup, i2 & 14, 1), PaddingKt.m5146paddingqDBjuR0$default(modifierTestTag, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM(), 6, null), null, null, null, null, null, 0, false, 0, 0, null, null, bentoTheme.getTypography(composerStartRestartGroup, i3).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8188);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.pathfinder.corepages.documentrequestslist.DocumentRequestsListComposableKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DocumentRequestsListComposable4.Heading$lambda$4(richText, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Subheading(final RichText richText, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(2090154938);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(richText) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2090154938, i2, -1, "com.robinhood.android.pathfinder.corepages.documentrequestslist.Subheading (DocumentRequestsListComposable.kt:122)");
            }
            if (richText != null) {
                Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, DocumentRequestsListTestTagSubheading);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i3 = BentoTheme.$stable;
                BentoText2.m20748BentoTextQnj7Zds(RichTexts2.m15956toAnnotatedStringiJQMabo(richText, 0L, composerStartRestartGroup, i2 & 14, 1), PaddingKt.m5146paddingqDBjuR0$default(modifierTestTag, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM(), 6, null), null, null, null, null, null, 0, false, 0, 0, null, null, null, composerStartRestartGroup, 0, 0, 16380);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.pathfinder.corepages.documentrequestslist.DocumentRequestsListComposableKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DocumentRequestsListComposable4.Subheading$lambda$5(richText, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void DocumentRequests(Modifier modifier, final List<DocumentRequest> list, final boolean z, final Function1<? super DocumentRequest, Unit> function1, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Composer composer2;
        final Modifier modifier3;
        Composer composerStartRestartGroup = composer.startRestartGroup(627319098);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(list) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
            modifier3 = modifier2;
        } else {
            Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(627319098, i3, -1, "com.robinhood.android.pathfinder.corepages.documentrequestslist.DocumentRequests (DocumentRequestsListComposable.kt:139)");
            }
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(list) | ((i3 & 896) == 256) | ((i3 & 7168) == 2048);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.pathfinder.corepages.documentrequestslist.DocumentRequestsListComposableKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return DocumentRequestsListComposable4.DocumentRequests$lambda$8$lambda$7(list, z, function1, (LazyListScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            LazyDslKt.LazyColumn(modifier4, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer2, i3 & 14, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.pathfinder.corepages.documentrequestslist.DocumentRequestsListComposableKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DocumentRequestsListComposable4.DocumentRequests$lambda$9(modifier3, list, z, function1, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DocumentRequest(final DocumentRequest documentRequest, final boolean z, final Function1<? super DocumentRequest, Unit> function1, Composer composer, final int i) {
        int i2;
        BentoBaseRowState.Meta callToAction;
        AnnotatedString annotatedString;
        boolean z2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1781997012);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(documentRequest) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i3 = i2;
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1781997012, i3, -1, "com.robinhood.android.pathfinder.corepages.documentrequestslist.DocumentRequest (DocumentRequestsListComposable.kt:159)");
            }
            composerStartRestartGroup.startReplaceGroup(-1192816739);
            if (documentRequest.isSubmitted()) {
                callToAction = new BentoBaseRowState.Meta.Icon(ServerToBentoAssetMapper2.CHECKMARK_24, "", (Color) null, (Function0) null, 12, (DefaultConstructorMarker) null);
            } else {
                callToAction = new BentoBaseRowState.Meta.CallToAction(StringResources_androidKt.stringResource(C39352R.string.document_requests_list_upload, composerStartRestartGroup, 0), null, 2, null);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, DocumentRequestsListTestTagRow);
            RichText title = documentRequest.getTitle();
            composerStartRestartGroup.startReplaceGroup(-1192805209);
            AnnotatedString annotatedStringM15956toAnnotatedStringiJQMabo = title == null ? null : RichTexts2.m15956toAnnotatedStringiJQMabo(title, 0L, composerStartRestartGroup, 0, 1);
            composerStartRestartGroup.endReplaceGroup();
            if (annotatedStringM15956toAnnotatedStringiJQMabo == null) {
                annotatedStringM15956toAnnotatedStringiJQMabo = new AnnotatedString("", null, 2, null);
            }
            AnnotatedString annotatedString2 = annotatedStringM15956toAnnotatedStringiJQMabo;
            RichText description = documentRequest.getDescription();
            composerStartRestartGroup.startReplaceGroup(-1192802105);
            AnnotatedString annotatedStringM15956toAnnotatedStringiJQMabo2 = description != null ? RichTexts2.m15956toAnnotatedStringiJQMabo(description, 0L, composerStartRestartGroup, 0, 1) : null;
            composerStartRestartGroup.endReplaceGroup();
            BentoBaseRowState.Start start = IconTypes.getStart(documentRequest.getIcon());
            if (documentRequest.isSubmitted() || z) {
                annotatedString = annotatedStringM15956toAnnotatedStringiJQMabo2;
                z2 = false;
            } else {
                annotatedString = annotatedStringM15956toAnnotatedStringiJQMabo2;
                z2 = true;
            }
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(documentRequest) | ((i3 & 896) == 256);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.pathfinder.corepages.documentrequestslist.DocumentRequestsListComposableKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DocumentRequestsListComposable4.DocumentRequest$lambda$11$lambda$10(function1, documentRequest);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoBaseRowKt.m20914BentoBaseRowbcLT7KE(modifierTestTag, start, annotatedString2, annotatedString, null, callToAction, null, false, false, false, z2, false, 0L, (Function0) objRememberedValue, composerStartRestartGroup, (BentoBaseRowState.Start.$stable << 3) | 6 | (BentoBaseRowState.Meta.$stable << 15), 0, 7120);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.pathfinder.corepages.documentrequestslist.DocumentRequestsListComposableKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DocumentRequestsListComposable4.DocumentRequest$lambda$12(documentRequest, z, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DocumentRequests$lambda$8$lambda$7(final List list, final boolean z, final Function1 function1, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final C25292x57f35122 c25292x57f35122 = new Function1() { // from class: com.robinhood.android.pathfinder.corepages.documentrequestslist.DocumentRequestsListComposableKt$DocumentRequests$lambda$8$lambda$7$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(DocumentRequest documentRequest) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((DocumentRequest) obj);
            }
        };
        LazyColumn.items(list.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.pathfinder.corepages.documentrequestslist.DocumentRequestsListComposableKt$DocumentRequests$lambda$8$lambda$7$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return c25292x57f35122.invoke(list.get(i));
            }
        }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.pathfinder.corepages.documentrequestslist.DocumentRequestsListComposableKt$DocumentRequests$lambda$8$lambda$7$$inlined$items$default$4
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
                    ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                DocumentRequest documentRequest = (DocumentRequest) list.get(i);
                composer.startReplaceGroup(237292790);
                DocumentRequestsListComposable4.DocumentRequest(documentRequest, z, function1, composer, 0);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        if (z) {
            LazyListScope.item$default(LazyColumn, null, null, DocumentRequestsListComposable.INSTANCE.getLambda$1295301130$feature_pathfinder_core_pages_externalDebug(), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DocumentRequest$lambda$11$lambda$10(Function1 function1, DocumentRequest documentRequest) {
        function1.invoke(documentRequest);
        return Unit.INSTANCE;
    }

    private static final void DocumentRequestsListComposablePreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(887422993);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(887422993, i, -1, "com.robinhood.android.pathfinder.corepages.documentrequestslist.DocumentRequestsListComposablePreview (DocumentRequestsListComposable.kt:184)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, Boolean.TRUE, null, null, DocumentRequestsListComposable.INSTANCE.m2363x4298c901(), composerStartRestartGroup, 100859904, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.pathfinder.corepages.documentrequestslist.DocumentRequestsListComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DocumentRequestsListComposable4.DocumentRequestsListComposablePreview$lambda$13(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
