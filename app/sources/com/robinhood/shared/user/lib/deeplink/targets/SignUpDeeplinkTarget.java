package com.robinhood.shared.user.lib.deeplink.targets;

import android.content.Intent;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.shared.user.contracts.WelcomeIntentKey;
import com.robinhood.shared.user.contracts.auth.UserCreation;
import com.robinhood.shared.user.contracts.auth.UserCreationFlow;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SignUpDeeplinkTarget.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/user/lib/deeplink/targets/SignUpDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "lib-deeplink-targets_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class SignUpDeeplinkTarget extends DeeplinkTarget4 {
    public static final SignUpDeeplinkTarget INSTANCE = new SignUpDeeplinkTarget();

    private SignUpDeeplinkTarget() {
        super("sign_up", false, false, false, false, false, null, 110, null);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        String queryParameter = deeplinkContext.getUri().getQueryParameter("source");
        boolean booleanQueryParameter = deeplinkContext.getUri().getBooleanQueryParameter("standalone", false);
        String queryParameter2 = deeplinkContext.getUri().getQueryParameter("flow");
        UserCreationFlow userCreationFlow = (queryParameter2 != null && queryParameter2.hashCode() == 112877 && queryParameter2.equals("rhc")) ? UserCreationFlow.RHC : UserCreationFlow.TRADER;
        if (!booleanQueryParameter) {
            listCreateListBuilder.add(Navigator.DefaultImpls.createIntent$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), WelcomeIntentKey.INSTANCE, null, false, 12, null));
        }
        listCreateListBuilder.add(Navigator.DefaultImpls.createIntent$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new UserCreation(queryParameter, null, null, userCreationFlow, null, false, 54, null), null, false, 12, null));
        return (Intent[]) CollectionsKt.build(listCreateListBuilder).toArray(new Intent[0]);
    }
}
