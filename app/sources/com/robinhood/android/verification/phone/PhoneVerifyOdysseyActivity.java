package com.robinhood.android.verification.phone;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.view.result.contract.ActivityResultContract;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.app.keys.data.PhoneVerificationResult;
import com.robinhood.android.odyssey.lib.BaseSdActivity;
import com.robinhood.librobinhood.data.store.identi.ProfileInfoStore;
import com.robinhood.librobinhood.data.store.identi.ServerDrivenStore;
import com.robinhood.security.screenprotect.ScreenProtectFlow;
import com.robinhood.security.screenprotect.ScreenProtectManager;
import com.robinhood.shared.security.contracts.PhoneVerifyOdysseyIntentKey;
import com.robinhood.shared.store.user.UserStore;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PhoneVerifyOdysseyActivity.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 #2\u00020\u0001:\u0002\"#B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J\b\u0010 \u001a\u00020\u001dH\u0016J\b\u0010!\u001a\u00020\u001dH\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0016\u001a\u00020\u00178VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/verification/phone/PhoneVerifyOdysseyActivity;", "Lcom/robinhood/android/odyssey/lib/BaseSdActivity;", "<init>", "()V", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "getUserStore", "()Lcom/robinhood/shared/store/user/UserStore;", "setUserStore", "(Lcom/robinhood/shared/store/user/UserStore;)V", "profileInfoStore", "Lcom/robinhood/librobinhood/data/store/identi/ProfileInfoStore;", "getProfileInfoStore", "()Lcom/robinhood/librobinhood/data/store/identi/ProfileInfoStore;", "setProfileInfoStore", "(Lcom/robinhood/librobinhood/data/store/identi/ProfileInfoStore;)V", "screenProtectManager", "Lcom/robinhood/security/screenprotect/ScreenProtectManager;", "getScreenProtectManager", "()Lcom/robinhood/security/screenprotect/ScreenProtectManager;", "setScreenProtectManager", "(Lcom/robinhood/security/screenprotect/ScreenProtectManager;)V", "odysseyFlowConfiguration", "Lcom/robinhood/librobinhood/data/store/identi/ServerDrivenStore$FlowConfiguration;", "getOdysseyFlowConfiguration", "()Lcom/robinhood/librobinhood/data/store/identi/ServerDrivenStore$FlowConfiguration;", "odysseyFlowConfiguration$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "submitExit", "onExitFlow", "ResultContract", "Companion", "feature-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class PhoneVerifyOdysseyActivity extends BaseSdActivity {
    private static final String ODYSSEY_PHONE_VERIFY_PATH = "verify_phone_number";
    private static final String ODYSSEY_PHONE_VERIFY_QUERY_PARAM_FLOW_TYPE = "verification_flow";
    private static final String ODYSSEY_PHONE_VERIFY_SOURCE = "verification_source";

    /* renamed from: odysseyFlowConfiguration$delegate, reason: from kotlin metadata */
    private final Lazy odysseyFlowConfiguration = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.verification.phone.PhoneVerifyOdysseyActivity$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PhoneVerifyOdysseyActivity.odysseyFlowConfiguration_delegate$lambda$0(this.f$0);
        }
    });
    public ProfileInfoStore profileInfoStore;
    public ScreenProtectManager screenProtectManager;
    public UserStore userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.odyssey.lib.BaseSdActivity, com.robinhood.android.odyssey.lib.template.BaseSdTemplateFragment.Callbacks
    public void submitExit() {
    }

    public final UserStore getUserStore() {
        UserStore userStore = this.userStore;
        if (userStore != null) {
            return userStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userStore");
        return null;
    }

    public final void setUserStore(UserStore userStore) {
        Intrinsics.checkNotNullParameter(userStore, "<set-?>");
        this.userStore = userStore;
    }

    public final ProfileInfoStore getProfileInfoStore() {
        ProfileInfoStore profileInfoStore = this.profileInfoStore;
        if (profileInfoStore != null) {
            return profileInfoStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("profileInfoStore");
        return null;
    }

    public final void setProfileInfoStore(ProfileInfoStore profileInfoStore) {
        Intrinsics.checkNotNullParameter(profileInfoStore, "<set-?>");
        this.profileInfoStore = profileInfoStore;
    }

    public final ScreenProtectManager getScreenProtectManager() {
        ScreenProtectManager screenProtectManager = this.screenProtectManager;
        if (screenProtectManager != null) {
            return screenProtectManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("screenProtectManager");
        return null;
    }

    public final void setScreenProtectManager(ScreenProtectManager screenProtectManager) {
        Intrinsics.checkNotNullParameter(screenProtectManager, "<set-?>");
        this.screenProtectManager = screenProtectManager;
    }

    @Override // com.robinhood.android.odyssey.lib.BaseSdActivity
    public ServerDrivenStore.FlowConfiguration getOdysseyFlowConfiguration() {
        return (ServerDrivenStore.FlowConfiguration) this.odysseyFlowConfiguration.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ServerDrivenStore.FlowConfiguration odysseyFlowConfiguration_delegate$lambda$0(PhoneVerifyOdysseyActivity phoneVerifyOdysseyActivity) {
        Companion companion = INSTANCE;
        return new ServerDrivenStore.FlowConfiguration(ODYSSEY_PHONE_VERIFY_PATH, false, MapsKt.mapOf(Tuples4.m3642to(ODYSSEY_PHONE_VERIFY_QUERY_PARAM_FLOW_TYPE, ((PhoneVerifyOdysseyIntentKey) companion.getExtras((Activity) phoneVerifyOdysseyActivity)).getFlowType().getServerValue()), Tuples4.m3642to(ODYSSEY_PHONE_VERIFY_SOURCE, ((PhoneVerifyOdysseyIntentKey) companion.getExtras((Activity) phoneVerifyOdysseyActivity)).getSource().getServerValue())), ((PhoneVerifyOdysseyIntentKey) companion.getExtras((Activity) phoneVerifyOdysseyActivity)).getPhoneNumber(), null, null, 50, null);
    }

    @Override // com.robinhood.android.odyssey.lib.BaseSdActivity, com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ScreenProtectManager screenProtectManager = getScreenProtectManager();
        screenProtectManager.blockScreenSharing(this, ScreenProtectFlow.UPDATE_PHONE_NUMBER);
        screenProtectManager.setFlagSecure(this);
    }

    @Override // com.robinhood.android.odyssey.lib.BaseSdActivity
    public void onExitFlow() {
        super.onExitFlow();
        getUserStore().refresh(true);
        getProfileInfoStore().refreshProfileInfo(true);
    }

    /* compiled from: PhoneVerifyOdysseyActivity.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/verification/phone/PhoneVerifyOdysseyActivity$ResultContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/robinhood/shared/security/contracts/PhoneVerifyOdysseyIntentKey;", "Lcom/robinhood/android/navigation/app/keys/data/PhoneVerificationResult;", "<init>", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "parseResult", "resultCode", "", "intent", "feature-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class ResultContract extends ActivityResultContract<PhoneVerifyOdysseyIntentKey, PhoneVerificationResult> {
        public static final int $stable = 8;

        @Override // androidx.view.result.contract.ActivityResultContract
        public Intent createIntent(Context context, PhoneVerifyOdysseyIntentKey input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            return PhoneVerifyOdysseyActivity.INSTANCE.getIntent(context, (Parcelable) input);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.view.result.contract.ActivityResultContract
        public PhoneVerificationResult parseResult(int resultCode, Intent intent) {
            Bundle extras;
            String string2 = (intent == null || (extras = intent.getExtras()) == null) ? null : extras.getString(BaseSdActivity.ODYSSEY_DISMISS_RESULT_KEY);
            if (string2 != null) {
            }
            if (string2 != null) {
                return (PhoneVerificationResult) PhoneVerificationResult.INSTANCE.fromServerValue(string2);
            }
            return null;
        }
    }

    /* compiled from: PhoneVerifyOdysseyActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/verification/phone/PhoneVerifyOdysseyActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/verification/phone/PhoneVerifyOdysseyActivity;", "Lcom/robinhood/shared/security/contracts/PhoneVerifyOdysseyIntentKey;", "<init>", "()V", "ODYSSEY_PHONE_VERIFY_PATH", "", "ODYSSEY_PHONE_VERIFY_QUERY_PARAM_FLOW_TYPE", "ODYSSEY_PHONE_VERIFY_SOURCE", "feature-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<PhoneVerifyOdysseyActivity, PhoneVerifyOdysseyIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public PhoneVerifyOdysseyIntentKey getExtras(PhoneVerifyOdysseyActivity phoneVerifyOdysseyActivity) {
            return (PhoneVerifyOdysseyIntentKey) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, phoneVerifyOdysseyActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, PhoneVerifyOdysseyIntentKey phoneVerifyOdysseyIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, phoneVerifyOdysseyIntentKey);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, PhoneVerifyOdysseyIntentKey phoneVerifyOdysseyIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, phoneVerifyOdysseyIntentKey);
        }
    }
}
