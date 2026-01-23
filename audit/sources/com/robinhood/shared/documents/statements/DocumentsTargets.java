package com.robinhood.shared.documents.statements;

import android.content.Context;
import android.content.Intent;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.CryptoRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.experiments.ExperimentDeclaration;
import com.robinhood.models.p320db.Document;
import com.robinhood.shared.documents.contracts.DocumentsFragmentKey;
import com.robinhood.utils.extensions.Contexts8;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DocumentsTargets.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/documents/statements/CryptoStatementsDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "feature-statements_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.documents.statements.CryptoStatementsDeeplinkTarget, reason: use source file name */
/* loaded from: classes6.dex */
public final class DocumentsTargets extends DeeplinkTarget4 {
    public static final DocumentsTargets INSTANCE = new DocumentsTargets();
    public static final int $stable = 8;

    private DocumentsTargets() {
        super("crypto_statements", (RegionGate) CryptoRegionGate.INSTANCE, (ExperimentDeclaration) null, false, false, 28, (DefaultConstructorMarker) null);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        Document.Category category;
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        String queryParameter = deeplinkContext.getUri().getQueryParameter("type");
        Boolean boolValueOf = queryParameter != null ? Boolean.valueOf(Intrinsics.areEqual(queryParameter, Document.Category.RHC_EU_STATEMENT.getServerValue())) : null;
        Navigator navigator = deeplinkContext.getNavigator();
        Context context = deeplinkContext.getContext();
        if (boolValueOf != null ? boolValueOf.booleanValue() : Contexts8.isRhcApp(deeplinkContext.getContext())) {
            category = Document.Category.RHC_EU_STATEMENT;
        } else {
            category = Document.Category.RHC_STATEMENT;
        }
        return new Intent[]{Navigator.DefaultImpls.createIntentForFragment$default(navigator, context, new DocumentsFragmentKey(category), false, false, false, null, false, false, false, false, false, null, false, 8188, null)};
    }
}
