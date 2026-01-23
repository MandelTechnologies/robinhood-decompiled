package com.robinhood.shared.documents.statements;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.ListAdapter;
import com.robinhood.models.p320db.Document;
import com.robinhood.shared.documents.contracts.DocumentDownloadLaunchMode;
import com.robinhood.shared.documents.statements.DocumentRowItem;
import com.robinhood.shared.documents.statements.DocumentsAdapter2;
import com.robinhood.shared.documents.statements.databinding.RowDocumentBinding;
import com.robinhood.shared.documents.statements.databinding.RowTaxCertificationBannerBinding;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DocumentsAdapter.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0012\u0013B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/shared/documents/statements/DocumentsAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/robinhood/shared/documents/statements/DocumentRowItem;", "Lcom/robinhood/shared/documents/statements/DocumentViewHolder;", "callbacks", "Lcom/robinhood/shared/documents/statements/DocumentsAdapter$Callbacks;", "<init>", "(Lcom/robinhood/shared/documents/statements/DocumentsAdapter$Callbacks;)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "", "holder", "position", "getItemViewType", "Callbacks", "Companion", "feature-statements_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class DocumentsAdapter extends ListAdapter<DocumentRowItem, DocumentsAdapter2> {
    public static final int VIEW_TYPE_DOCUMENT = 1;
    public static final int VIEW_TYPE_TAX_CERTIFICATION_BANNER = 0;
    private final Callbacks callbacks;
    public static final int $stable = 8;

    /* compiled from: DocumentsAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0003H&¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/shared/documents/statements/DocumentsAdapter$Callbacks;", "", "onDocumentActionReceived", "", "document", "Lcom/robinhood/models/db/Document;", "launchMode", "Lcom/robinhood/shared/documents/contracts/DocumentDownloadLaunchMode;", "onTaxCertificationBannerClicked", "feature-statements_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onDocumentActionReceived(Document document, DocumentDownloadLaunchMode launchMode);

        void onTaxCertificationBannerClicked();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DocumentsAdapter(Callbacks callbacks) {
        super(DiffCallbacks.Equality.INSTANCE);
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        DiffCallbacks diffCallbacks = DiffCallbacks.INSTANCE;
        this.callbacks = callbacks;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public DocumentsAdapter2 onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
        if (viewType == 0) {
            RowTaxCertificationBannerBinding rowTaxCertificationBannerBindingInflate = RowTaxCertificationBannerBinding.inflate(layoutInflaterFrom, parent, false);
            Intrinsics.checkNotNullExpressionValue(rowTaxCertificationBannerBindingInflate, "inflate(...)");
            return new DocumentsAdapter2.CertifyTaxInfoBanner(rowTaxCertificationBannerBindingInflate);
        }
        if (viewType == 1) {
            RowDocumentBinding rowDocumentBindingInflate = RowDocumentBinding.inflate(layoutInflaterFrom, parent, false);
            Intrinsics.checkNotNullExpressionValue(rowDocumentBindingInflate, "inflate(...)");
            return new DocumentsAdapter2.Item(rowDocumentBindingInflate, this.callbacks);
        }
        Preconditions.INSTANCE.failUnexpectedItemKotlin(Integer.valueOf(viewType));
        throw new ExceptionsH();
    }

    /* compiled from: DocumentsAdapter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.documents.statements.DocumentsAdapter$onBindViewHolder$1 */
    /* synthetic */ class C387821 extends FunctionReferenceImpl implements Function0<Unit> {
        C387821(Object obj) {
            super(0, obj, Callbacks.class, "onTaxCertificationBannerClicked", "onTaxCertificationBannerClicked()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((Callbacks) this.receiver).onTaxCertificationBannerClicked();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(DocumentsAdapter2 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof DocumentsAdapter2.CertifyTaxInfoBanner) {
            ((DocumentsAdapter2.CertifyTaxInfoBanner) holder).bind(new C387821(this.callbacks));
        } else {
            if (!(holder instanceof DocumentsAdapter2.Item)) {
                throw new NoWhenBranchMatchedException();
            }
            DocumentRowItem item = getItem(position);
            Intrinsics.checkNotNull(item, "null cannot be cast to non-null type com.robinhood.shared.documents.statements.DocumentRowItem.Document");
            ((DocumentsAdapter2.Item) holder).bind(((DocumentRowItem.Document) item).getDocument());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return getItem(position).getViewType();
    }
}
