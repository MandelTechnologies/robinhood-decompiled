package com.robinhood.android.doc.deeplink;

import android.content.Intent;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.models.api.ColorTheme;
import com.robinhood.models.api.DocUploadThanksContext;
import com.robinhood.models.api.identi.ApiDocumentRequest;
import com.robinhood.models.p355ui.DocumentRequest;
import com.robinhood.utils.extensions.StringsKt;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ForeignBankStatementDocumentRequestDeeplinkTarget.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/doc/deeplink/ForeignBankStatementDocumentRequestDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class ForeignBankStatementDocumentRequestDeeplinkTarget extends DeeplinkTarget4 {
    public static final ForeignBankStatementDocumentRequestDeeplinkTarget INSTANCE = new ForeignBankStatementDocumentRequestDeeplinkTarget();
    public static final int $stable = 8;

    private ForeignBankStatementDocumentRequestDeeplinkTarget() {
        super("foreign_bank_statement_request", false, false, false, false, false, null, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        UUID uuid;
        UUID uuid2;
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        String queryParameter = deeplinkContext.getUri().getQueryParameter("id");
        if (queryParameter != null) {
            try {
                uuid = StringsKt.toUuid(queryParameter);
            } catch (IllegalArgumentException unused) {
                uuid = null;
            }
            uuid2 = uuid;
        } else {
            uuid2 = null;
        }
        return (Intent[]) CollectionsKt.listOfNotNull((Object[]) new Intent[]{deeplinkContext.getMainIntent(deeplinkContext.getRequiresBackingActivity()), Navigators2.buildDocRequestIntent$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), uuid2 != null ? DocumentRequest.Companion.forIdentiDocument$default(DocumentRequest.INSTANCE, uuid2, ApiDocumentRequest.Type.FOREIGN_BANK_STATEMENT, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null) : null, (DocUploadThanksContext) null, (ColorTheme) null, 12, (Object) null)}).toArray(new Intent[0]);
    }
}
