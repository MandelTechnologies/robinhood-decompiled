package com.robinhood.android.account.p060ui.documents;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.robinhood.android.account.overview.C8159R;
import com.robinhood.android.account.p060ui.documents.RhyStatementsAdapter;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.models.p320db.Document;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyStatementRowView.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00132\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0013B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0003H\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/account/ui/documents/RhyStatementRowView;", "Lcom/robinhood/android/designsystem/row/RdsRowView;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/models/db/Document;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "callbacks", "Lcom/robinhood/android/account/ui/documents/RhyStatementsAdapter$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/account/ui/documents/RhyStatementsAdapter$Callbacks;", "setCallbacks", "(Lcom/robinhood/android/account/ui/documents/RhyStatementsAdapter$Callbacks;)V", "bind", "", "state", "Companion", "feature-account-overview_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class RhyStatementRowView extends RdsRowView implements Bindable<Document> {
    private RhyStatementsAdapter.Callbacks callbacks;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RhyStatementRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final RhyStatementsAdapter.Callbacks getCallbacks() {
        return this.callbacks;
    }

    public final void setCallbacks(RhyStatementsAdapter.Callbacks callbacks) {
        this.callbacks = callbacks;
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(final Document state) {
        Intrinsics.checkNotNullParameter(state, "state");
        setSecondaryText(state.getDate().toString());
        OnClickListeners.onClick(this, new Function0() { // from class: com.robinhood.android.account.ui.documents.RhyStatementRowView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhyStatementRowView.bind$lambda$0(this.f$0, state);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$0(RhyStatementRowView rhyStatementRowView, Document document) {
        RhyStatementsAdapter.Callbacks callbacks = rhyStatementRowView.callbacks;
        if (callbacks != null) {
            callbacks.onStatementClicked(document);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: RhyStatementRowView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/account/ui/documents/RhyStatementRowView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/account/ui/documents/RhyStatementRowView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-account-overview_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<RhyStatementRowView> {
        private final /* synthetic */ Inflater<RhyStatementRowView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public RhyStatementRowView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (RhyStatementRowView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C8159R.layout.include_rhy_statement_row_view);
        }
    }
}
