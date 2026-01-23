package com.robinhood.android.doc.deeplink;

import android.content.Intent;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.models.api.ColorTheme;
import com.robinhood.models.api.DocUploadThanksContext;
import com.robinhood.models.p355ui.DocumentRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: DocumentRequestsDeeplinkTarget.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/doc/deeplink/DocumentRequestsDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class DocumentRequestsDeeplinkTarget extends DeeplinkTarget4 {
    public static final DocumentRequestsDeeplinkTarget INSTANCE = new DocumentRequestsDeeplinkTarget();
    public static final int $stable = 8;

    private DocumentRequestsDeeplinkTarget() {
        super("document_requests", false, false, false, false, false, null, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        ColorTheme colorThemeFromServerValue;
        List listSplit$default;
        UUID uuid;
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        String queryParameter = deeplinkContext.getUri().getQueryParameter("ids");
        ArrayList arrayList = null;
        if (queryParameter != null && (listSplit$default = StringsKt.split$default((CharSequence) queryParameter, new String[]{","}, false, 0, 6, (Object) null)) != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = listSplit$default.iterator();
            while (it.hasNext()) {
                try {
                    uuid = com.robinhood.utils.extensions.StringsKt.toUuid(StringsKt.trim((String) it.next()).toString());
                } catch (IllegalArgumentException unused) {
                    uuid = null;
                }
                if (uuid != null) {
                    arrayList2.add(uuid);
                }
            }
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList.add(DocumentRequest.INSTANCE.forDocumentRequestId((UUID) it2.next()));
            }
        }
        String queryParameter2 = deeplinkContext.getUri().getQueryParameter("theme");
        if (queryParameter2 == null || (colorThemeFromServerValue = ColorTheme.INSTANCE.fromServerValue(queryParameter2)) == null) {
            colorThemeFromServerValue = ColorTheme.DEFAULT;
        }
        return (Intent[]) CollectionsKt.listOfNotNull((Object[]) new Intent[]{deeplinkContext.getMainIntent(deeplinkContext.getRequiresBackingActivity()), Navigators2.buildDocRequestIntent(deeplinkContext.getNavigator(), deeplinkContext.getContext(), arrayList, (DocUploadThanksContext) DocUploadThanksContext.INSTANCE.fromServerValue(deeplinkContext.getUri().getQueryParameter("thanks")), colorThemeFromServerValue)}).toArray(new Intent[0]);
    }
}
