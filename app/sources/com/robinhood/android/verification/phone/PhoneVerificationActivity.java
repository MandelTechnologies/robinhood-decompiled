package com.robinhood.android.verification.phone;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.view.ComponentActivity;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.lib.stepupverification.SuvLauncher;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.data.PhoneVerificationResult;
import com.robinhood.android.navigation.app.keys.data.PhoneVerificationResult2;
import com.robinhood.android.verification.phone.PhoneInitialLoadingFragment;
import com.robinhood.android.verification.phone.PhoneUpdateFragment;
import com.robinhood.android.verification.phone.PhoneVerifyOdysseyActivity;
import com.robinhood.shared.security.contracts.PhoneVerificationFlowType;
import com.robinhood.shared.security.contracts.PhoneVerifyIntentKey;
import com.robinhood.shared.security.contracts.PhoneVerifyOdysseyIntentKey;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;

/* compiled from: PhoneVerificationActivity.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 +2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001+B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0018\u001a\u00020\u000b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\u0018\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J \u0010\u001f\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u00102\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\nH\u0016J\u0010\u0010#\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u0010H\u0016J\u0012\u0010$\u001a\u00020\u000b2\b\u0010 \u001a\u0004\u0018\u00010\u0010H\u0002J\u0010\u0010%\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020'H\u0016J\u0010\u0010(\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020*H\u0016R \u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R/\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u00108B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/verification/phone/PhoneVerificationActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/verification/phone/PhoneInitialLoadingFragment$Callbacks;", "Lcom/robinhood/android/verification/phone/PhoneUpdateFragment$Callbacks;", "Lcom/robinhood/android/common/ui/RhDialogFragment$OnDismissListener;", "<init>", "()V", "launchSuv", "Lkotlin/Function2;", "Ljava/util/UUID;", "", "", "phoneOdysseyLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/robinhood/shared/security/contracts/PhoneVerifyOdysseyIntentKey;", "<set-?>", "", "newPhoneNumber", "getNewPhoneNumber", "()Ljava/lang/String;", "setNewPhoneNumber", "(Ljava/lang/String;)V", "newPhoneNumber$delegate", "Lkotlin/properties/ReadWriteProperty;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onInitialLoadingFinished", "userPhone", "verificationType", "Lcom/robinhood/android/verification/phone/PhoneVerificationType;", "onSuvRequired", "phoneNumber", "workflowId", "isMigrated", "onPhoneNumberUpdateCompleted", "launchPhoneVerifyOdyssey", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onDialogDismissed", "id", "", "Companion", "feature-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class PhoneVerificationActivity extends BaseActivity implements PhoneInitialLoadingFragment.Callbacks, PhoneUpdateFragment.Callbacks, RhDialogFragment.OnDismissListener {
    private final Function2<UUID, Boolean, Unit> launchSuv;

    /* renamed from: newPhoneNumber$delegate, reason: from kotlin metadata */
    private final Interfaces3 newPhoneNumber;
    private final ActivityResultLauncher<PhoneVerifyOdysseyIntentKey> phoneOdysseyLauncher;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(PhoneVerificationActivity.class, "newPhoneNumber", "getNewPhoneNumber()Ljava/lang/String;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: PhoneVerificationActivity.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PhoneVerificationType.values().length];
            try {
                iArr[PhoneVerificationType.VERIFICATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PhoneVerificationType.REVERIFICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PhoneVerificationActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.launchSuv = SuvLauncher.registerSuvLauncher((ComponentActivity) this, (Function0<? extends Navigator>) new Function0() { // from class: com.robinhood.android.verification.phone.PhoneVerificationActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.getNavigator();
            }
        }, (Function0<Unit>) new Function0() { // from class: com.robinhood.android.verification.phone.PhoneVerificationActivity$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PhoneVerificationActivity.launchSuv$lambda$1(this.f$0);
            }
        }, (Function0<Unit>) new Function0() { // from class: com.robinhood.android.verification.phone.PhoneVerificationActivity$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PhoneVerificationActivity.launchSuv$lambda$2(this.f$0);
            }
        });
        this.phoneOdysseyLauncher = registerForActivityResult(new PhoneVerifyOdysseyActivity.ResultContract(), new ActivityResultCallback() { // from class: com.robinhood.android.verification.phone.PhoneVerificationActivity$phoneOdysseyLauncher$1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(PhoneVerificationResult phoneVerificationResult) {
                if (phoneVerificationResult != null) {
                    PhoneVerificationActivity phoneVerificationActivity = this.this$0;
                    Intent intent = new Intent();
                    intent.putExtra(PhoneVerificationResult2.PHONE_VERIFICATION_RESULT_KEY, phoneVerificationResult);
                    Unit unit = Unit.INSTANCE;
                    phoneVerificationActivity.setResult(-1, intent);
                } else {
                    this.this$0.setResult(0);
                }
                this.this$0.finish();
            }
        });
        this.newPhoneNumber = BindSavedState2.savedString(this).provideDelegate(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchSuv$lambda$1(PhoneVerificationActivity phoneVerificationActivity) {
        phoneVerificationActivity.launchPhoneVerifyOdyssey(phoneVerificationActivity.getNewPhoneNumber());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchSuv$lambda$2(PhoneVerificationActivity phoneVerificationActivity) {
        phoneVerificationActivity.finish();
        return Unit.INSTANCE;
    }

    private final String getNewPhoneNumber() {
        return (String) this.newPhoneNumber.getValue(this, $$delegatedProperties[0]);
    }

    private final void setNewPhoneNumber(String str) {
        this.newPhoneNumber.setValue(this, $$delegatedProperties[0], str);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, PhoneInitialLoadingFragment.INSTANCE.newInstance());
        }
    }

    @Override // com.robinhood.android.verification.phone.PhoneInitialLoadingFragment.Callbacks
    public void onInitialLoadingFinished(String userPhone, PhoneVerificationType verificationType) {
        Intrinsics.checkNotNullParameter(userPhone, "userPhone");
        Intrinsics.checkNotNullParameter(verificationType, "verificationType");
        int i = WhenMappings.$EnumSwitchMapping$0[verificationType.ordinal()];
        if (i == 1) {
            this.phoneOdysseyLauncher.launch(new PhoneVerifyOdysseyIntentKey(PhoneVerificationFlowType.VERIFIED_SETTINGS, ((PhoneVerifyIntentKey) INSTANCE.getExtras((Activity) this)).getSource(), userPhone));
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            replaceFragmentWithoutAnimationAndBackStack(PhoneUpdateFragment.INSTANCE.newInstance());
        }
    }

    @Override // com.robinhood.android.verification.phone.PhoneUpdateFragment.Callbacks
    public void onSuvRequired(String phoneNumber, UUID workflowId, boolean isMigrated) {
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        setNewPhoneNumber(phoneNumber);
        this.launchSuv.invoke(workflowId, Boolean.valueOf(isMigrated));
    }

    @Override // com.robinhood.android.verification.phone.PhoneUpdateFragment.Callbacks
    public void onPhoneNumberUpdateCompleted(String phoneNumber) {
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        launchPhoneVerifyOdyssey(phoneNumber);
    }

    private final void launchPhoneVerifyOdyssey(String phoneNumber) {
        this.phoneOdysseyLauncher.launch(new PhoneVerifyOdysseyIntentKey(PhoneVerificationFlowType.REVERIFIED_SETTINGS, ((PhoneVerifyIntentKey) INSTANCE.getExtras((Activity) this)).getSource(), phoneNumber));
        overridePendingTransition(0, 0);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setTitle((CharSequence) null);
    }

    @Override // com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        if (id == C11048R.id.dialog_id_create_challenge_error) {
            finish();
        }
    }

    /* compiled from: PhoneVerificationActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/verification/phone/PhoneVerificationActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/verification/phone/PhoneVerificationActivity;", "Lcom/robinhood/shared/security/contracts/PhoneVerifyIntentKey;", "<init>", "()V", "feature-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<PhoneVerificationActivity, PhoneVerifyIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public PhoneVerifyIntentKey getExtras(PhoneVerificationActivity phoneVerificationActivity) {
            return (PhoneVerifyIntentKey) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, phoneVerificationActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, PhoneVerifyIntentKey phoneVerifyIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, phoneVerifyIntentKey);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, PhoneVerifyIntentKey phoneVerifyIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, phoneVerifyIntentKey);
        }
    }
}
