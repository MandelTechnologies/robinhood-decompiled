package com.robinhood.android.doc.deeplink;

import android.content.Context;
import android.content.Intent;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.onboarding.contracts.DocumentUpload;
import com.robinhood.models.api.ColorTheme;
import com.robinhood.models.api.DocUploadThanksContext;
import com.robinhood.models.p355ui.DocumentRequest;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Navigators.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u001a6\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0000\u001a<\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\f2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0000¨\u0006\r"}, m3636d2 = {"buildDocRequestIntent", "Landroid/content/Intent;", "Lcom/robinhood/android/navigation/Navigator;", "context", "Landroid/content/Context;", "request", "Lcom/robinhood/models/ui/DocumentRequest;", "showThanks", "Lcom/robinhood/models/api/DocUploadThanksContext;", "theme", "Lcom/robinhood/models/api/ColorTheme;", "requests", "", "feature-doc-upload_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.doc.deeplink.NavigatorsKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class Navigators2 {
    public static /* synthetic */ Intent buildDocRequestIntent$default(Navigator navigator, Context context, DocumentRequest documentRequest, DocUploadThanksContext docUploadThanksContext, ColorTheme colorTheme, int i, Object obj) {
        if ((i & 4) != 0) {
            docUploadThanksContext = null;
        }
        if ((i & 8) != 0) {
            colorTheme = ColorTheme.DEFAULT;
        }
        return buildDocRequestIntent(navigator, context, documentRequest, docUploadThanksContext, colorTheme);
    }

    public static final Intent buildDocRequestIntent(Navigator navigator, Context context, DocumentRequest documentRequest, DocUploadThanksContext docUploadThanksContext, ColorTheme theme) {
        Intrinsics.checkNotNullParameter(navigator, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(theme, "theme");
        if (documentRequest != null) {
            return Navigator.DefaultImpls.createIntent$default(navigator, context, DocumentUpload.Companion.singleDocStandaloneActivityIntent$default(DocumentUpload.INSTANCE, documentRequest, false, docUploadThanksContext, false, theme, 10, null), null, false, 12, null);
        }
        return null;
    }

    public static /* synthetic */ Intent buildDocRequestIntent$default(Navigator navigator, Context context, List list, DocUploadThanksContext docUploadThanksContext, ColorTheme colorTheme, int i, Object obj) {
        if ((i & 4) != 0) {
            docUploadThanksContext = null;
        }
        if ((i & 8) != 0) {
            colorTheme = ColorTheme.DEFAULT;
        }
        return buildDocRequestIntent(navigator, context, (List<DocumentRequest>) list, docUploadThanksContext, colorTheme);
    }

    public static final Intent buildDocRequestIntent(Navigator navigator, Context context, List<DocumentRequest> list, DocUploadThanksContext docUploadThanksContext, ColorTheme theme) {
        Intrinsics.checkNotNullParameter(navigator, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(theme, "theme");
        List<DocumentRequest> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return null;
        }
        return Navigator.DefaultImpls.createIntent$default(navigator, context, DocumentUpload.Companion.multiDocStandaloneActivityIntent$default(DocumentUpload.INSTANCE, list, false, docUploadThanksContext, false, theme, 10, null), null, false, 12, null);
    }
}
