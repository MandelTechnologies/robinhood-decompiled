package com.robinhood.shared.documents.statements;

import android.content.res.Resources;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.PopupMenu;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.designsystem.banner.RdsInfoBannerView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.models.p320db.Document;
import com.robinhood.shared.documents.contracts.DocumentDownloadLaunchMode;
import com.robinhood.shared.documents.statements.DocumentsAdapter;
import com.robinhood.shared.documents.statements.DocumentsAdapter2;
import com.robinhood.shared.documents.statements.databinding.RowDocumentBinding;
import com.robinhood.shared.documents.statements.databinding.RowTaxCertificationBannerBinding;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DocumentsAdapter.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/documents/statements/DocumentViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "Item", "CertifyTaxInfoBanner", "Lcom/robinhood/shared/documents/statements/DocumentViewHolder$CertifyTaxInfoBanner;", "Lcom/robinhood/shared/documents/statements/DocumentViewHolder$Item;", "feature-statements_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.documents.statements.DocumentViewHolder, reason: use source file name */
/* loaded from: classes6.dex */
public abstract class DocumentsAdapter2 extends RecyclerView.ViewHolder {
    public static final int $stable = 8;

    public /* synthetic */ DocumentsAdapter2(View view, DefaultConstructorMarker defaultConstructorMarker) {
        this(view);
    }

    private DocumentsAdapter2(View view) {
        super(view);
    }

    /* compiled from: DocumentsAdapter.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/shared/documents/statements/DocumentViewHolder$Item;", "Lcom/robinhood/shared/documents/statements/DocumentViewHolder;", "binding", "Lcom/robinhood/shared/documents/statements/databinding/RowDocumentBinding;", "callbacks", "Lcom/robinhood/shared/documents/statements/DocumentsAdapter$Callbacks;", "<init>", "(Lcom/robinhood/shared/documents/statements/databinding/RowDocumentBinding;Lcom/robinhood/shared/documents/statements/DocumentsAdapter$Callbacks;)V", "bind", "", "document", "Lcom/robinhood/models/db/Document;", "onItemClick", "feature-statements_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.documents.statements.DocumentViewHolder$Item */
    public static final class Item extends DocumentsAdapter2 {
        public static final int $stable = 8;
        private final RowDocumentBinding binding;
        private final DocumentsAdapter.Callbacks callbacks;

        /* compiled from: DocumentsAdapter.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.shared.documents.statements.DocumentViewHolder$Item$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Document.Category.values().length];
                try {
                    iArr[Document.Category.TAX.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Document.Category.ACCOUNT_STATEMENT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Document.Category.RHY_ACCOUNT_STATEMENT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Document.Category.RHC_STATEMENT.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Document.Category.RHC_EU_STATEMENT.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[Document.Category.RHD_DAILY_STATEMENT.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[Document.Category.RHD_MONTHLY_STATEMENT.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[Document.Category.TRADE_CONFIRM.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[Document.Category.IRA_TRADE_CONFIRM.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[Document.Category.JOINT_TRADE_CONFIRM.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[Document.Category.MANAGED_INDIVIDUAL_STATEMENT.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[Document.Category.MANAGED_IRA_STATEMENT.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[Document.Category.MANAGED_JOINT_STATEMENT.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[Document.Category.IRA_STATEMENT.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[Document.Category.ACCOUNT_ACTIVITY_REPORT.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[Document.Category.JOINT_ACCOUNT_STATEMENT.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[Document.Category.ADHOC_DOCUMENT_UPLOAD.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Item(RowDocumentBinding binding, DocumentsAdapter.Callbacks callbacks) {
            Intrinsics.checkNotNullParameter(binding, "binding");
            Intrinsics.checkNotNullParameter(callbacks, "callbacks");
            ConstraintLayout root = binding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            super(root, null);
            this.binding = binding;
            this.callbacks = callbacks;
        }

        public final void bind(final Document document) {
            int i;
            Intrinsics.checkNotNullParameter(document, "document");
            switch (WhenMappings.$EnumSwitchMapping$0[document.getCategory().ordinal()]) {
                case 1:
                    i = C38788R.drawable.ic_action_documents;
                    break;
                case 2:
                    i = C38788R.drawable.ic_action_statements;
                    break;
                case 3:
                    i = C38788R.drawable.ic_action_statements;
                    break;
                case 4:
                case 5:
                    i = C38788R.drawable.ic_action_statements;
                    break;
                case 6:
                    i = C38788R.drawable.ic_action_statements;
                    break;
                case 7:
                    i = C38788R.drawable.ic_action_statements;
                    break;
                case 8:
                case 9:
                case 10:
                    i = C38788R.drawable.ic_action_confirms;
                    break;
                case 11:
                case 12:
                case 13:
                case 14:
                    i = C38788R.drawable.ic_action_statements;
                    break;
                case 15:
                    i = C38788R.drawable.ic_action_statements;
                    break;
                case 16:
                    i = C38788R.drawable.ic_action_statements;
                    break;
                case 17:
                    i = C38788R.drawable.ic_action_documents;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            Resources resources = this.binding.docIconImg.getResources();
            this.binding.docIconImg.setImageResource(i);
            RhTextView rhTextView = this.binding.titleTxt;
            Intrinsics.checkNotNull(resources);
            rhTextView.setText(Documents.getTitle(document, resources));
            String subtitle = Documents.getSubtitle(document, resources);
            this.binding.subtitleTxt.setText(subtitle);
            RhTextView subtitleTxt = this.binding.subtitleTxt;
            Intrinsics.checkNotNullExpressionValue(subtitleTxt, "subtitleTxt");
            subtitleTxt.setVisibility(subtitle != null ? 0 : 8);
            View itemView = this.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            OnClickListeners.onClick(itemView, new Function0() { // from class: com.robinhood.shared.documents.statements.DocumentViewHolder$Item$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DocumentsAdapter2.Item.bind$lambda$0(this.f$0, document);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit bind$lambda$0(Item item, Document document) {
            item.onItemClick(document);
            return Unit.INSTANCE;
        }

        private final void onItemClick(final Document document) {
            PopupMenu popupMenu = new PopupMenu(this.itemView.getContext(), this.itemView, 8388613);
            popupMenu.inflate(C38788R.menu.menu_documents);
            popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: com.robinhood.shared.documents.statements.DocumentViewHolder$Item$onItemClick$1$1
                @Override // androidx.appcompat.widget.PopupMenu.OnMenuItemClickListener
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    DocumentDownloadLaunchMode documentDownloadLaunchMode;
                    int itemId = menuItem.getItemId();
                    if (itemId == C38788R.id.action_open) {
                        documentDownloadLaunchMode = DocumentDownloadLaunchMode.OPEN;
                    } else {
                        if (itemId != C38788R.id.action_share) {
                            Preconditions.INSTANCE.failUnexpectedItemKotlin(Integer.valueOf(menuItem.getItemId()));
                            throw new ExceptionsH();
                        }
                        documentDownloadLaunchMode = DocumentDownloadLaunchMode.SHARE;
                    }
                    this.this$0.callbacks.onDocumentActionReceived(document, documentDownloadLaunchMode);
                    return true;
                }
            });
            popupMenu.show();
        }
    }

    /* compiled from: DocumentsAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/documents/statements/DocumentViewHolder$CertifyTaxInfoBanner;", "Lcom/robinhood/shared/documents/statements/DocumentViewHolder;", "binding", "Lcom/robinhood/shared/documents/statements/databinding/RowTaxCertificationBannerBinding;", "<init>", "(Lcom/robinhood/shared/documents/statements/databinding/RowTaxCertificationBannerBinding;)V", "bind", "", "onClick", "Lkotlin/Function0;", "feature-statements_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.documents.statements.DocumentViewHolder$CertifyTaxInfoBanner */
    public static final class CertifyTaxInfoBanner extends DocumentsAdapter2 {
        public static final int $stable = 8;
        private final RowTaxCertificationBannerBinding binding;

        /* JADX WARN: Illegal instructions before constructor call */
        public CertifyTaxInfoBanner(RowTaxCertificationBannerBinding binding) {
            Intrinsics.checkNotNullParameter(binding, "binding");
            FrameLayout root = binding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            super(root, null);
            this.binding = binding;
        }

        public final void bind(Function0<Unit> onClick) {
            Intrinsics.checkNotNullParameter(onClick, "onClick");
            RdsInfoBannerView taxCertificationBanner = this.binding.taxCertificationBanner;
            Intrinsics.checkNotNullExpressionValue(taxCertificationBanner, "taxCertificationBanner");
            OnClickListeners.onClick(taxCertificationBanner, onClick);
        }
    }
}
