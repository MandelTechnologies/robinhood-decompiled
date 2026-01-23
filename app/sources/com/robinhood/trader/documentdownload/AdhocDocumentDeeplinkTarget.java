package com.robinhood.trader.documentdownload;

import android.content.Intent;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.models.p320db.Document;
import com.robinhood.shared.documents.contracts.DocumentDownloadKey;
import com.robinhood.shared.documents.contracts.DocumentDownloadLaunchMode;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import p479j$.time.Instant;
import p479j$.time.LocalDate;
import p479j$.time.ZoneOffset;

/* compiled from: AdhocDocumentDeeplinkTarget.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/trader/documentdownload/AdhocDocumentDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "deeplinkContext", "j$/time/LocalDate", "parseDateFromUri", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)Lj$/time/LocalDate;", "", "Landroid/content/Intent;", "getIntents", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "DEFAULT_FALLBACK_DATE", "Lj$/time/LocalDate;", "feature-document-download_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class AdhocDocumentDeeplinkTarget extends DeeplinkTarget4 {
    public static final int $stable;
    private static final LocalDate DEFAULT_FALLBACK_DATE;
    public static final AdhocDocumentDeeplinkTarget INSTANCE = new AdhocDocumentDeeplinkTarget();

    private AdhocDocumentDeeplinkTarget() {
        super("adhoc_document", false, false, false, false, false, null, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
    }

    static {
        LocalDate localDateM3377of = LocalDate.m3377of(1970, 1, 1);
        Intrinsics.checkNotNullExpressionValue(localDateM3377of, "of(...)");
        DEFAULT_FALLBACK_DATE = localDateM3377of;
        $stable = 8;
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        String string2;
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        String queryParameter = deeplinkContext.getUri().getQueryParameter("id");
        if (queryParameter != null && (string2 = StringsKt.trim(queryParameter).toString()) != null) {
            if (StringsKt.isBlank(string2)) {
                string2 = null;
            }
            String str = string2;
            if (str != null) {
                LocalDate dateFromUri = parseDateFromUri(deeplinkContext);
                if (dateFromUri == null) {
                    dateFromUri = DEFAULT_FALLBACK_DATE;
                }
                return new Intent[]{Navigator.DefaultImpls.createIntent$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new DocumentDownloadKey(new Document(Document.Category.ADHOC_DOCUMENT_UPLOAD, dateFromUri, Document.FileType.PDF, str, true, Document.Type.TYPE_ADHOC, null, 64, null), DocumentDownloadLaunchMode.OPEN, null, true, 4, null), null, false, 12, null)};
            }
        }
        return deeplinkContext.handleMalformedUri(deeplinkContext.getUri());
    }

    private final LocalDate parseDateFromUri(DeeplinkTarget2 deeplinkContext) {
        String string2;
        Long longOrNull;
        Object objM28550constructorimpl;
        String string3;
        Object objM28550constructorimpl2;
        String queryParameter = deeplinkContext.getUri().getQueryParameter(InquiryField.DateField.TYPE);
        if (queryParameter != null && (string3 = StringsKt.trim(queryParameter).toString()) != null) {
            if (StringsKt.isBlank(string3)) {
                string3 = null;
            }
            if (string3 != null) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    objM28550constructorimpl2 = Result.m28550constructorimpl(LocalDate.parse(string3));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM28550constructorimpl2 = Result.m28550constructorimpl(ResultKt.createFailure(th));
                }
                return (LocalDate) (Result.m28555isFailureimpl(objM28550constructorimpl2) ? null : objM28550constructorimpl2);
            }
        }
        String queryParameter2 = deeplinkContext.getUri().getQueryParameter("ts");
        if (queryParameter2 == null || (string2 = StringsKt.trim(queryParameter2).toString()) == null || (longOrNull = StringsKt.toLongOrNull(string2)) == null) {
            return null;
        }
        long jLongValue = longOrNull.longValue();
        try {
            Result.Companion companion3 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(Instant.ofEpochMilli(jLongValue).atZone(ZoneOffset.UTC).mo3459a());
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th2));
        }
        return (LocalDate) (Result.m28555isFailureimpl(objM28550constructorimpl) ? null : objM28550constructorimpl);
    }
}
