package com.robinhood.android.account.p060ui.documents;

import android.view.View;
import android.view.ViewGroup;
import com.robinhood.models.p320db.Document;
import com.robinhood.test.idler.TrackedListAdapter;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericViewHolder;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyStatementsAdapter.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u001e\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0011\u001a\u00020\rH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/account/ui/documents/RhyStatementsAdapter;", "Lcom/robinhood/test/idler/TrackedListAdapter;", "Lcom/robinhood/models/db/Document;", "Lcom/robinhood/utils/ui/view/recyclerview/GenericViewHolder;", "Landroid/view/View;", "callbacks", "Lcom/robinhood/android/account/ui/documents/RhyStatementsAdapter$Callbacks;", "<init>", "(Lcom/robinhood/android/account/ui/documents/RhyStatementsAdapter$Callbacks;)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "", "holder", "position", "Callbacks", "feature-account-overview_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class RhyStatementsAdapter extends TrackedListAdapter<Document, GenericViewHolder<? extends View>> {
    public static final int $stable = 8;
    private final Callbacks callbacks;

    /* compiled from: RhyStatementsAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/account/ui/documents/RhyStatementsAdapter$Callbacks;", "", "onStatementClicked", "", "document", "Lcom/robinhood/models/db/Document;", "feature-account-overview_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onStatementClicked(Document document);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RhyStatementsAdapter(Callbacks callbacks) {
        super(DiffCallbacks.INSTANCE.byEquality(new Function1() { // from class: com.robinhood.android.account.ui.documents.RhyStatementsAdapter$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyStatementsAdapter._init_$lambda$0((Document) obj);
            }
        }));
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        this.callbacks = callbacks;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object _init_$lambda$0(Document byEquality) {
        Intrinsics.checkNotNullParameter(byEquality, "$this$byEquality");
        return byEquality.getId();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public GenericViewHolder<View> onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new GenericViewHolder<>(RhyStatementRowView.INSTANCE.inflate(parent));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(GenericViewHolder<? extends View> holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        View view = holder.getView();
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.robinhood.android.account.ui.documents.RhyStatementRowView");
        Document item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        ((RhyStatementRowView) view).bind(item);
        View view2 = holder.getView();
        Intrinsics.checkNotNull(view2, "null cannot be cast to non-null type com.robinhood.android.account.ui.documents.RhyStatementRowView");
        ((RhyStatementRowView) view2).setCallbacks(this.callbacks);
    }
}
