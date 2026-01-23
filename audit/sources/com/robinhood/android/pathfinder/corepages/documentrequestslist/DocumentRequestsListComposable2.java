package com.robinhood.android.pathfinder.corepages.documentrequestslist;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.pathfinder.corepages.documentrequestslist.DocumentRequestsListViewState;
import com.robinhood.models.api.pathfinder.contexts.IconType;
import com.robinhood.models.p355ui.pathfinder.contexts.DocumentRequest;
import com.robinhood.models.serverdriven.p347db.RichText;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DocumentRequestsListComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.pathfinder.corepages.documentrequestslist.ComposableSingletons$DocumentRequestsListComposableKt$lambda$-1299870887$1, reason: use source file name */
/* loaded from: classes11.dex */
final class DocumentRequestsListComposable2 implements Function2<Composer, Integer, Unit> {
    public static final DocumentRequestsListComposable2 INSTANCE = new DocumentRequestsListComposable2();

    DocumentRequestsListComposable2() {
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
            ComposerKt.traceEventStart(-1299870887, i, -1, "com.robinhood.android.pathfinder.corepages.documentrequestslist.ComposableSingletons$DocumentRequestsListComposableKt.lambda$-1299870887.<anonymous> (DocumentRequestsListComposable.kt:186)");
        }
        DocumentRequestsListViewState.Loaded loaded = new DocumentRequestsListViewState.Loaded(CollectionsKt.listOf(new DocumentRequest("123", IconType.DOCUMENTS, new RichText("A Doc", CollectionsKt.emptyList()), new RichText("Who knows what it is", CollectionsKt.emptyList()), false)), new RichText("Hello world", CollectionsKt.emptyList()), new RichText("Document Requests", CollectionsKt.emptyList()), new RichText("Give me those docs", CollectionsKt.emptyList()), true, true);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.pathfinder.corepages.documentrequestslist.ComposableSingletons$DocumentRequestsListComposableKt$lambda$-1299870887$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DocumentRequestsListComposable2.invoke$lambda$1$lambda$0((DocumentRequest) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function1 function1 = (Function1) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.pathfinder.corepages.documentrequestslist.ComposableSingletons$DocumentRequestsListComposableKt$lambda$-1299870887$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        Function0 function0 = (Function0) objRememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new Function0() { // from class: com.robinhood.android.pathfinder.corepages.documentrequestslist.ComposableSingletons$DocumentRequestsListComposableKt$lambda$-1299870887$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceGroup();
        DocumentRequestsListComposable4.DocumentRequestsListComposable(loaded, function1, function0, (Function0) objRememberedValue3, composer, 3504);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(DocumentRequest it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
