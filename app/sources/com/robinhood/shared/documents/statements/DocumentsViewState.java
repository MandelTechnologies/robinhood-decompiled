package com.robinhood.shared.documents.statements;

import android.content.res.Resources;
import com.robinhood.android.util.notification.RhGcmListenerService;
import com.robinhood.models.api.ManagementType;
import com.robinhood.models.api.bonfire.ApiTaxFormResubmissionStatus;
import com.robinhood.models.p320db.Document;
import com.robinhood.models.p320db.bonfire.RhyAccount;
import com.robinhood.shared.documents.statements.DocumentRowItem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: DocumentsViewState.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/J\t\u00100\u001a\u00020\u0003HÆ\u0003J\u0011\u00101\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0011\u00102\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0011\u00104\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003J\t\u00105\u001a\u00020\u000eHÆ\u0003J\t\u00106\u001a\u00020\u0010HÆ\u0003Ji\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001J\u0013\u00108\u001a\u00020\u00102\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010:\u001a\u00020;HÖ\u0001J\t\u0010<\u001a\u00020-HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010 \u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b \u0010\u001fR\u0011\u0010!\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\"\u0010\u001fR\u0014\u0010#\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u001fR\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u000b8F¢\u0006\u0006\u001a\u0004\b'\u0010\u001bR\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020&0\u000b8F¢\u0006\u0006\u001a\u0004\b)\u0010\u001bR\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020&0\u000b8F¢\u0006\u0006\u001a\u0004\b+\u0010\u001b¨\u0006="}, m3636d2 = {"Lcom/robinhood/shared/documents/statements/DocumentsViewState;", "", RhGcmListenerService.EXTRA_CATEGORY, "Lcom/robinhood/models/db/Document$Category;", "selfDirectedDocuments", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/db/Document;", "managedDocuments", "taxFormResubmissionStatus", "Lcom/robinhood/models/api/bonfire/ApiTaxFormResubmissionStatus;", "rhyAccounts", "", "Lcom/robinhood/models/db/bonfire/RhyAccount;", "managementTypeChipGroupViewState", "Lcom/robinhood/shared/documents/statements/ManagementTypeChipGroupViewState;", "inEcRegionGate", "", "<init>", "(Lcom/robinhood/models/db/Document$Category;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/models/api/bonfire/ApiTaxFormResubmissionStatus;Ljava/util/List;Lcom/robinhood/shared/documents/statements/ManagementTypeChipGroupViewState;Z)V", "getCategory", "()Lcom/robinhood/models/db/Document$Category;", "getSelfDirectedDocuments", "()Lkotlinx/collections/immutable/ImmutableList;", "getManagedDocuments", "getTaxFormResubmissionStatus", "()Lcom/robinhood/models/api/bonfire/ApiTaxFormResubmissionStatus;", "getRhyAccounts", "()Ljava/util/List;", "getManagementTypeChipGroupViewState", "()Lcom/robinhood/shared/documents/statements/ManagementTypeChipGroupViewState;", "getInEcRegionGate", "()Z", "isLoading", "showEmptyState", "getShowEmptyState", "shouldShowTaxCertificationBanner", "getShouldShowTaxCertificationBanner", "selfDirectedItems", "Lcom/robinhood/shared/documents/statements/DocumentRowItem;", "getSelfDirectedItems", "managedItems", "getManagedItems", "currentShowingItems", "getCurrentShowingItems", "getToolbarTitle", "", "res", "Landroid/content/res/Resources;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "feature-statements_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final /* data */ class DocumentsViewState {
    public static final int $stable = 8;
    private final Document.Category category;
    private final boolean inEcRegionGate;
    private final ImmutableList<Document> managedDocuments;
    private final ManagementTypeChipGroupViewState managementTypeChipGroupViewState;
    private final List<RhyAccount> rhyAccounts;
    private final ImmutableList<Document> selfDirectedDocuments;
    private final ApiTaxFormResubmissionStatus taxFormResubmissionStatus;

    /* compiled from: DocumentsViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ManagementType.values().length];
            try {
                iArr[ManagementType.SELF_DIRECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ManagementType.MANAGED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ManagementType.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Document.Category.values().length];
            try {
                iArr2[Document.Category.TAX.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[Document.Category.TRADE_CONFIRM.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[Document.Category.ACCOUNT_STATEMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[Document.Category.MANAGED_INDIVIDUAL_STATEMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[Document.Category.MANAGED_IRA_STATEMENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[Document.Category.IRA_STATEMENT.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[Document.Category.RHC_STATEMENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[Document.Category.RHC_EU_STATEMENT.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[Document.Category.MANAGED_JOINT_STATEMENT.ordinal()] = 9;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[Document.Category.JOINT_ACCOUNT_STATEMENT.ordinal()] = 10;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[Document.Category.RHD_DAILY_STATEMENT.ordinal()] = 11;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[Document.Category.RHD_MONTHLY_STATEMENT.ordinal()] = 12;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[Document.Category.ADHOC_DOCUMENT_UPLOAD.ordinal()] = 13;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[Document.Category.RHY_ACCOUNT_STATEMENT.ordinal()] = 14;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[Document.Category.JOINT_TRADE_CONFIRM.ordinal()] = 15;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[Document.Category.IRA_TRADE_CONFIRM.ordinal()] = 16;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[Document.Category.ACCOUNT_ACTIVITY_REPORT.ordinal()] = 17;
            } catch (NoSuchFieldError unused20) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static /* synthetic */ DocumentsViewState copy$default(DocumentsViewState documentsViewState, Document.Category category, ImmutableList immutableList, ImmutableList immutableList2, ApiTaxFormResubmissionStatus apiTaxFormResubmissionStatus, List list, ManagementTypeChipGroupViewState managementTypeChipGroupViewState, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            category = documentsViewState.category;
        }
        if ((i & 2) != 0) {
            immutableList = documentsViewState.selfDirectedDocuments;
        }
        if ((i & 4) != 0) {
            immutableList2 = documentsViewState.managedDocuments;
        }
        if ((i & 8) != 0) {
            apiTaxFormResubmissionStatus = documentsViewState.taxFormResubmissionStatus;
        }
        if ((i & 16) != 0) {
            list = documentsViewState.rhyAccounts;
        }
        if ((i & 32) != 0) {
            managementTypeChipGroupViewState = documentsViewState.managementTypeChipGroupViewState;
        }
        if ((i & 64) != 0) {
            z = documentsViewState.inEcRegionGate;
        }
        ManagementTypeChipGroupViewState managementTypeChipGroupViewState2 = managementTypeChipGroupViewState;
        boolean z2 = z;
        List list2 = list;
        ImmutableList immutableList3 = immutableList2;
        return documentsViewState.copy(category, immutableList, immutableList3, apiTaxFormResubmissionStatus, list2, managementTypeChipGroupViewState2, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final Document.Category getCategory() {
        return this.category;
    }

    public final ImmutableList<Document> component2() {
        return this.selfDirectedDocuments;
    }

    public final ImmutableList<Document> component3() {
        return this.managedDocuments;
    }

    /* renamed from: component4, reason: from getter */
    public final ApiTaxFormResubmissionStatus getTaxFormResubmissionStatus() {
        return this.taxFormResubmissionStatus;
    }

    public final List<RhyAccount> component5() {
        return this.rhyAccounts;
    }

    /* renamed from: component6, reason: from getter */
    public final ManagementTypeChipGroupViewState getManagementTypeChipGroupViewState() {
        return this.managementTypeChipGroupViewState;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getInEcRegionGate() {
        return this.inEcRegionGate;
    }

    public final DocumentsViewState copy(Document.Category category, ImmutableList<Document> selfDirectedDocuments, ImmutableList<Document> managedDocuments, ApiTaxFormResubmissionStatus taxFormResubmissionStatus, List<RhyAccount> rhyAccounts, ManagementTypeChipGroupViewState managementTypeChipGroupViewState, boolean inEcRegionGate) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(managementTypeChipGroupViewState, "managementTypeChipGroupViewState");
        return new DocumentsViewState(category, selfDirectedDocuments, managedDocuments, taxFormResubmissionStatus, rhyAccounts, managementTypeChipGroupViewState, inEcRegionGate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentsViewState)) {
            return false;
        }
        DocumentsViewState documentsViewState = (DocumentsViewState) other;
        return this.category == documentsViewState.category && Intrinsics.areEqual(this.selfDirectedDocuments, documentsViewState.selfDirectedDocuments) && Intrinsics.areEqual(this.managedDocuments, documentsViewState.managedDocuments) && Intrinsics.areEqual(this.taxFormResubmissionStatus, documentsViewState.taxFormResubmissionStatus) && Intrinsics.areEqual(this.rhyAccounts, documentsViewState.rhyAccounts) && Intrinsics.areEqual(this.managementTypeChipGroupViewState, documentsViewState.managementTypeChipGroupViewState) && this.inEcRegionGate == documentsViewState.inEcRegionGate;
    }

    public int hashCode() {
        int iHashCode = this.category.hashCode() * 31;
        ImmutableList<Document> immutableList = this.selfDirectedDocuments;
        int iHashCode2 = (iHashCode + (immutableList == null ? 0 : immutableList.hashCode())) * 31;
        ImmutableList<Document> immutableList2 = this.managedDocuments;
        int iHashCode3 = (iHashCode2 + (immutableList2 == null ? 0 : immutableList2.hashCode())) * 31;
        ApiTaxFormResubmissionStatus apiTaxFormResubmissionStatus = this.taxFormResubmissionStatus;
        int iHashCode4 = (iHashCode3 + (apiTaxFormResubmissionStatus == null ? 0 : apiTaxFormResubmissionStatus.hashCode())) * 31;
        List<RhyAccount> list = this.rhyAccounts;
        return ((((iHashCode4 + (list != null ? list.hashCode() : 0)) * 31) + this.managementTypeChipGroupViewState.hashCode()) * 31) + Boolean.hashCode(this.inEcRegionGate);
    }

    public String toString() {
        return "DocumentsViewState(category=" + this.category + ", selfDirectedDocuments=" + this.selfDirectedDocuments + ", managedDocuments=" + this.managedDocuments + ", taxFormResubmissionStatus=" + this.taxFormResubmissionStatus + ", rhyAccounts=" + this.rhyAccounts + ", managementTypeChipGroupViewState=" + this.managementTypeChipGroupViewState + ", inEcRegionGate=" + this.inEcRegionGate + ")";
    }

    public DocumentsViewState(Document.Category category, ImmutableList<Document> immutableList, ImmutableList<Document> immutableList2, ApiTaxFormResubmissionStatus apiTaxFormResubmissionStatus, List<RhyAccount> list, ManagementTypeChipGroupViewState managementTypeChipGroupViewState, boolean z) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(managementTypeChipGroupViewState, "managementTypeChipGroupViewState");
        this.category = category;
        this.selfDirectedDocuments = immutableList;
        this.managedDocuments = immutableList2;
        this.taxFormResubmissionStatus = apiTaxFormResubmissionStatus;
        this.rhyAccounts = list;
        this.managementTypeChipGroupViewState = managementTypeChipGroupViewState;
        this.inEcRegionGate = z;
    }

    public final Document.Category getCategory() {
        return this.category;
    }

    public final ImmutableList<Document> getSelfDirectedDocuments() {
        return this.selfDirectedDocuments;
    }

    public final ImmutableList<Document> getManagedDocuments() {
        return this.managedDocuments;
    }

    public final ApiTaxFormResubmissionStatus getTaxFormResubmissionStatus() {
        return this.taxFormResubmissionStatus;
    }

    public final List<RhyAccount> getRhyAccounts() {
        return this.rhyAccounts;
    }

    public /* synthetic */ DocumentsViewState(Document.Category category, ImmutableList immutableList, ImmutableList immutableList2, ApiTaxFormResubmissionStatus apiTaxFormResubmissionStatus, List list, ManagementTypeChipGroupViewState managementTypeChipGroupViewState, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(category, (i & 2) != 0 ? null : immutableList, (i & 4) != 0 ? null : immutableList2, (i & 8) != 0 ? null : apiTaxFormResubmissionStatus, (i & 16) == 0 ? list : null, (i & 32) != 0 ? new ManagementTypeChipGroupViewState(null, false, null, null, 15, null) : managementTypeChipGroupViewState, (i & 64) != 0 ? false : z);
    }

    public final ManagementTypeChipGroupViewState getManagementTypeChipGroupViewState() {
        return this.managementTypeChipGroupViewState;
    }

    public final boolean getInEcRegionGate() {
        return this.inEcRegionGate;
    }

    public final boolean isLoading() {
        return this.selfDirectedDocuments == null;
    }

    public final boolean getShowEmptyState() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.managementTypeChipGroupViewState.getCurrentManagementType().ordinal()];
        if (i == 1) {
            ImmutableList<Document> immutableList = this.selfDirectedDocuments;
            return immutableList == null || immutableList.isEmpty();
        }
        if (i == 2) {
            ImmutableList<Document> immutableList2 = this.managedDocuments;
            return immutableList2 == null || immutableList2.isEmpty();
        }
        if (i == 3) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final boolean getShouldShowTaxCertificationBanner() {
        if (this.category != Document.Category.TAX) {
            return false;
        }
        ApiTaxFormResubmissionStatus apiTaxFormResubmissionStatus = this.taxFormResubmissionStatus;
        return apiTaxFormResubmissionStatus == null || apiTaxFormResubmissionStatus.getRequires_tax_form_resubmission();
    }

    public final List<DocumentRowItem> getSelfDirectedItems() {
        Collection collectionEmptyList;
        SpreadBuilder spreadBuilder = new SpreadBuilder(2);
        DocumentRowItem.TaxCertificationBanner taxCertificationBanner = DocumentRowItem.TaxCertificationBanner.INSTANCE;
        if (!getShouldShowTaxCertificationBanner()) {
            taxCertificationBanner = null;
        }
        spreadBuilder.add(taxCertificationBanner);
        ImmutableList<Document> immutableList = this.selfDirectedDocuments;
        if (immutableList == null) {
            collectionEmptyList = CollectionsKt.emptyList();
        } else {
            collectionEmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(immutableList, 10));
            Iterator<Document> it = immutableList.iterator();
            while (it.hasNext()) {
                collectionEmptyList.add(new DocumentRowItem.Document(it.next()));
            }
        }
        spreadBuilder.addSpread(collectionEmptyList.toArray(new DocumentRowItem.Document[0]));
        return CollectionsKt.listOfNotNull(spreadBuilder.toArray(new DocumentRowItem[spreadBuilder.size()]));
    }

    public final List<DocumentRowItem> getManagedItems() {
        Collection collectionEmptyList;
        ImmutableList<Document> immutableList = this.managedDocuments;
        if (immutableList != null) {
            collectionEmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(immutableList, 10));
            Iterator<Document> it = immutableList.iterator();
            while (it.hasNext()) {
                collectionEmptyList.add(new DocumentRowItem.Document(it.next()));
            }
        } else {
            collectionEmptyList = CollectionsKt.emptyList();
        }
        DocumentRowItem.Document[] documentArr = (DocumentRowItem.Document[]) collectionEmptyList.toArray(new DocumentRowItem.Document[0]);
        return CollectionsKt.listOf(Arrays.copyOf(documentArr, documentArr.length));
    }

    public final List<DocumentRowItem> getCurrentShowingItems() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.managementTypeChipGroupViewState.getCurrentManagementType().ordinal()];
        if (i == 1) {
            return getSelfDirectedItems();
        }
        if (i == 2) {
            return getManagedItems();
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return CollectionsKt.emptyList();
    }

    public final String getToolbarTitle(Resources res) throws Resources.NotFoundException {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(res, "res");
        switch (WhenMappings.$EnumSwitchMapping$1[this.category.ordinal()]) {
            case 1:
                String string2 = res.getString(C38788R.string.documents_tax_documents_action);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return string2;
            case 2:
                String string3 = res.getString(C38788R.string.documents_trade_confirms_action);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                return string3;
            case 3:
                List<RhyAccount> list = this.rhyAccounts;
                if (list == null) {
                    return "";
                }
                List<RhyAccount> list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        if (((RhyAccount) it.next()).isSpendingAccount()) {
                            String string4 = res.getString(C38788R.string.documents_account_statements_action);
                            Intrinsics.checkNotNull(string4);
                            return string4;
                        }
                    }
                }
                String string5 = res.getString(C38788R.string.documents_investing_account_statements_action);
                Intrinsics.checkNotNull(string5);
                return string5;
            case 4:
                String string6 = res.getString(C38788R.string.documents_investing_account_statements_action);
                Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                return string6;
            case 5:
            case 6:
                String string7 = res.getString(C38788R.string.documents_retirement_account_statements_action);
                Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
                return string7;
            case 7:
                String string8 = res.getString(C38788R.string.gated_crypto_documents_rhc_account_statements_action);
                Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
                return string8;
            case 8:
                String string9 = res.getString(C38788R.string.documents_account_statements_action);
                Intrinsics.checkNotNullExpressionValue(string9, "getString(...)");
                return string9;
            case 9:
            case 10:
                String string10 = res.getString(C38788R.string.documents_joint_account_statements_action);
                Intrinsics.checkNotNullExpressionValue(string10, "getString(...)");
                return string10;
            case 11:
                if (this.inEcRegionGate) {
                    i = C38788R.string.documents_rhd_account_daily_statements_action;
                } else {
                    i = C38788R.string.documents_rhd_account_daily_statements_action_no_ec;
                }
                String string11 = res.getString(i);
                Intrinsics.checkNotNullExpressionValue(string11, "getString(...)");
                return string11;
            case 12:
                if (this.inEcRegionGate) {
                    i2 = C38788R.string.documents_rhd_account_monthly_statements_action;
                } else {
                    i2 = C38788R.string.documents_rhd_account_monthly_statements_action_no_ec;
                }
                String string12 = res.getString(i2);
                Intrinsics.checkNotNullExpressionValue(string12, "getString(...)");
                return string12;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                throw new IllegalStateException("Unsupported document type");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
