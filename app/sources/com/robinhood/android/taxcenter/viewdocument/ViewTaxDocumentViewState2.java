package com.robinhood.android.taxcenter.viewdocument;

import com.robinhood.android.models.taxcenter.p195db.TaxDocument;
import com.robinhood.android.taxcenter.viewdocument.ViewTaxDocumentViewState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.p320db.Document;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.LocalDate;

/* compiled from: ViewTaxDocumentViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/taxcenter/viewdocument/ViewTaxDocumentStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/taxcenter/viewdocument/ViewTaxDocumentDataState;", "Lcom/robinhood/android/taxcenter/viewdocument/ViewTaxDocumentViewState;", "<init>", "()V", "reduce", "dataState", "feature-tax-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.taxcenter.viewdocument.ViewTaxDocumentStateProvider, reason: use source file name */
/* loaded from: classes9.dex */
public final class ViewTaxDocumentViewState2 implements StateProvider<ViewTaxDocumentDataState, ViewTaxDocumentViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public ViewTaxDocumentViewState reduce(ViewTaxDocumentDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        TaxDocument documentMetadata = dataState.getDocumentMetadata();
        if (documentMetadata == null) {
            return ViewTaxDocumentViewState.Loading.INSTANCE;
        }
        String str = documentMetadata.getTitle() + "." + documentMetadata.getFileType();
        String fileType = documentMetadata.getFileType();
        Document.Category category = Document.Category.TAX;
        LocalDate localDateNow = LocalDate.now();
        Intrinsics.checkNotNullExpressionValue(localDateNow, "now(...)");
        Document.FileType fileTypeFromServerValue = Document.FileType.INSTANCE.fromServerValue(documentMetadata.getFileType());
        if (fileTypeFromServerValue == null) {
            fileTypeFromServerValue = Document.FileType.UNKNOWN;
        }
        return new ViewTaxDocumentViewState.Ready(str, fileType, new Document(category, localDateNow, fileTypeFromServerValue, dataState.getDocumentId(), false, Document.Type.UNKNOWN, null, 64, null));
    }
}
