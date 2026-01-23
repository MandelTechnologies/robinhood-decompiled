package com.robinhood.shared.documentdownload;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.util.notification.RhGcmListenerService;
import com.robinhood.models.p320db.Document;
import com.robinhood.shared.documents.contracts.DocumentDownloadKey;
import com.robinhood.shared.documents.contracts.DocumentDownloadLaunchMode;
import com.robinhood.utils.extensions.StringsKt;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.LocalDate;

/* compiled from: DocumentDownloadDeeplinkTarget.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0017¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/documentdownload/DocumentDownloadDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "feature-document-download_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class DocumentDownloadDeeplinkTarget extends DeeplinkTarget4 {
    public static final DocumentDownloadDeeplinkTarget INSTANCE = new DocumentDownloadDeeplinkTarget();
    public static final int $stable = 8;

    private DocumentDownloadDeeplinkTarget() {
        super("document", false, false, false, false, false, null, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    @SuppressLint({"NowWithoutClock"})
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        UUID uuid;
        Document.Category categoryFromServerValue;
        Document.FileType fileTypeFromServerValue;
        Document.Type typeFromServerValue;
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        String queryParameter = deeplinkContext.getUri().getQueryParameter("id");
        Intent intentCreateIntent$default = null;
        if (queryParameter != null) {
            try {
                uuid = StringsKt.toUuid(queryParameter);
            } catch (IllegalArgumentException unused) {
            }
        } else {
            uuid = null;
        }
        String queryParameter2 = deeplinkContext.getUri().getQueryParameter(RhGcmListenerService.EXTRA_CATEGORY);
        if (queryParameter2 == null || (categoryFromServerValue = Document.Category.INSTANCE.fromServerValue(queryParameter2)) == null) {
            categoryFromServerValue = Document.Category.TRADE_CONFIRM;
        }
        Document.Category category = categoryFromServerValue;
        String queryParameter3 = deeplinkContext.getUri().getQueryParameter("filetype");
        if (queryParameter3 == null || (fileTypeFromServerValue = Document.FileType.INSTANCE.fromServerValue(queryParameter3)) == null) {
            fileTypeFromServerValue = Document.FileType.PDF;
        }
        Document.FileType fileType = fileTypeFromServerValue;
        String queryParameter4 = deeplinkContext.getUri().getQueryParameter("type");
        if (queryParameter4 == null || (typeFromServerValue = Document.Type.INSTANCE.fromServerValue(queryParameter4)) == null) {
            typeFromServerValue = Document.Type.TYPE_TRADE_CONFIRM;
        }
        Document.Type type2 = typeFromServerValue;
        if (uuid != null) {
            Navigator navigator = deeplinkContext.getNavigator();
            Context context = deeplinkContext.getContext();
            LocalDate localDateNow = LocalDate.now();
            Intrinsics.checkNotNullExpressionValue(localDateNow, "now(...)");
            String string2 = uuid.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            intentCreateIntent$default = Navigator.DefaultImpls.createIntent$default(navigator, context, new DocumentDownloadKey(new Document(category, localDateNow, fileType, string2, true, type2, null, 64, null), DocumentDownloadLaunchMode.OPEN, null, false, 12, null), null, false, 12, null);
        }
        return (Intent[]) CollectionsKt.listOfNotNull(intentCreateIntent$default).toArray(new Intent[0]);
    }
}
