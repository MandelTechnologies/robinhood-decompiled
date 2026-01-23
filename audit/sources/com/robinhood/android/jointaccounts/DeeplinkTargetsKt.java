package com.robinhood.android.jointaccounts;

import android.content.Intent;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.recurring.backup.RecurringOrderBackupPaymentMethodFragment;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.navigation.keys.HostIntentKey;
import com.robinhood.android.navigation.keys.IntentKey;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeeplinkTargets.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a+\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b*\u00020\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0002\u0010\r\u001a+\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b*\u00020\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000f0\u000bH\u0002¢\u0006\u0002\u0010\r\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u0018\u0010\u0003\u001a\u00020\u0001*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m3636d2 = {"ACCEPT_JOINT_ACCOUNT_DEEPLINK_PATH", "", "INVITATION_ID_QUERY_KEY", RecurringOrderBackupPaymentMethodFragment.ARG_LOGGING_SOURCE, "Lcom/robinhood/android/deeplink/DeeplinkContext;", "getLoggingSource", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)Ljava/lang/String;", "createIntentsForActivityWithInvitationId", "", "Landroid/content/Intent;", "keyBuilder", "Lkotlin/Function1;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;Lkotlin/jvm/functions/Function1;)[Landroid/content/Intent;", "createIntentsForFragmentWithInvitationId", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "feature-joint-account-onboarding_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class DeeplinkTargetsKt {
    public static final String ACCEPT_JOINT_ACCOUNT_DEEPLINK_PATH = "accept_joint_account_invite";
    public static final String INVITATION_ID_QUERY_KEY = "invitation_id";

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLoggingSource(DeeplinkTarget2 deeplinkTarget2) {
        String queryParameter = deeplinkTarget2.getUri().getQueryParameter("source");
        return queryParameter == null ? "" : queryParameter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent[] createIntentsForActivityWithInvitationId(DeeplinkTarget2 deeplinkTarget2, Function1<? super String, ? extends IntentKey> function1) {
        String queryParameter = deeplinkTarget2.getUri().getQueryParameter(INVITATION_ID_QUERY_KEY);
        return queryParameter == null ? new Intent[0] : new Intent[]{Navigator.DefaultImpls.createIntent$default(deeplinkTarget2.getNavigator(), deeplinkTarget2.getContext(), function1.invoke(queryParameter), null, false, 12, null)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent[] createIntentsForFragmentWithInvitationId(DeeplinkTarget2 deeplinkTarget2, final Function1<? super String, ? extends FragmentKey> function1) {
        return createIntentsForActivityWithInvitationId(deeplinkTarget2, new Function1() { // from class: com.robinhood.android.jointaccounts.DeeplinkTargetsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DeeplinkTargetsKt.createIntentsForFragmentWithInvitationId$lambda$0(function1, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntentKey createIntentsForFragmentWithInvitationId$lambda$0(Function1 function1, String invitationId) {
        Intrinsics.checkNotNullParameter(invitationId, "invitationId");
        return new HostIntentKey.ShowFragmentInStandaloneRdsActivity((FragmentKey) function1.invoke(invitationId), false, false, false, false, false, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
    }
}
