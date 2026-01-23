package com.robinhood.android.account.p060ui.documents;

import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.librobinhood.data.store.DocumentStore;
import com.robinhood.models.p320db.Document;
import com.robinhood.udf.UiEvent;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyStatementsDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/account/ui/documents/RhyStatementsDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/account/ui/documents/RhyStatementsViewState;", "documentStore", "Lcom/robinhood/librobinhood/data/store/DocumentStore;", "<init>", "(Lcom/robinhood/librobinhood/data/store/DocumentStore;)V", "onResume", "", "feature-account-overview_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class RhyStatementsDuxo extends OldBaseDuxo<RhyStatementsViewState> {
    public static final int $stable = 8;
    private final DocumentStore documentStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RhyStatementsDuxo(DocumentStore documentStore) {
        super(new RhyStatementsViewState(null, null, 3, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(documentStore, "documentStore");
        this.documentStore = documentStore;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onResume() {
        super.onResume();
        this.documentStore.refreshRhyDocuments(false);
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, this.documentStore.getSelfDirectedDocuments(Document.Category.RHY_ACCOUNT_STATEMENT), (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.account.ui.documents.RhyStatementsDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyStatementsDuxo.onResume$lambda$1(this.f$0, (List) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.account.ui.documents.RhyStatementsDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyStatementsDuxo.onResume$lambda$3(this.f$0, (Throwable) obj);
            }
        }, null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$1(RhyStatementsDuxo rhyStatementsDuxo, final List documents) {
        Intrinsics.checkNotNullParameter(documents, "documents");
        rhyStatementsDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.account.ui.documents.RhyStatementsDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyStatementsDuxo.onResume$lambda$1$lambda$0(documents, (RhyStatementsViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyStatementsViewState onResume$lambda$1$lambda$0(List list, RhyStatementsViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RhyStatementsViewState.copy$default(applyMutation, list, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$3(RhyStatementsDuxo rhyStatementsDuxo, final Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        rhyStatementsDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.account.ui.documents.RhyStatementsDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyStatementsDuxo.onResume$lambda$3$lambda$2(throwable, (RhyStatementsViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyStatementsViewState onResume$lambda$3$lambda$2(Throwable th, RhyStatementsViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RhyStatementsViewState.copy$default(applyMutation, null, new UiEvent(th), 1, null);
    }
}
