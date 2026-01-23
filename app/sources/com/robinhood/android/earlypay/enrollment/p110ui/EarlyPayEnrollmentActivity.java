package com.robinhood.android.earlypay.enrollment.p110ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.directdeposit.DirectDepositConstants;
import com.robinhood.android.common.directdeposit.DirectDepositSource;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.earlypay.enrollment.p110ui.EarlyPayEnrollmentFragment;
import com.robinhood.android.earlypay.lib.confirmation.p111ui.EarlyPayConfirmationFragment;
import com.robinhood.android.earlypay.lib.confirmation.p111ui.EarlyPayConfirmationType;
import com.robinhood.android.earlypay.lib.signup.p112ui.EarlyPaySignupFragment;
import com.robinhood.android.navigation.IntentResolver;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.transfers.contracts.DirectDepositShimKey;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.utils.extensions.Activity;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.io.Serializable;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EarlyPayEnrollmentActivity.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 '2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001'B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\"\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\b\u0010\u0018\u001a\u00020\u000fH\u0016J\b\u0010\u0019\u001a\u00020\u000fH\u0016J\b\u0010\u001a\u001a\u00020\u000fH\u0016J\b\u0010\u001b\u001a\u00020\u000fH\u0016J\b\u0010\u001c\u001a\u00020\u000fH\u0016J\u0012\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002J\t\u0010!\u001a\u00020\tH\u0096\u0001R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#X\u0096\u0005¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/earlypay/enrollment/ui/EarlyPayEnrollmentActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/earlypay/enrollment/ui/EarlyPayEnrollmentFragment$Callbacks;", "Lcom/robinhood/android/earlypay/lib/signup/ui/EarlyPaySignupFragment$Callbacks;", "Lcom/robinhood/android/earlypay/lib/confirmation/ui/EarlyPayConfirmationFragment$Callbacks;", "<init>", "()V", "hideEnrollmentActions", "", "getHideEnrollmentActions", "()Z", "hideEnrollmentActions$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onActivityResult", "requestCode", "", "resultCode", WebsocketGatewayConstants.DATA_KEY, "Landroid/content/Intent;", "onEnrollmentSuccess", "onEnrollmentSkipped", "onEnrollmentConfirmed", "takeUserIntoDirectDeposits", "onAlreadySetupDirectDeposits", "getConfirmationFragment", "Lcom/robinhood/android/earlypay/lib/confirmation/ui/EarlyPayConfirmationFragment;", "directDepositSource", "Lcom/robinhood/android/common/directdeposit/DirectDepositSource;", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-early-pay_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class EarlyPayEnrollmentActivity extends BaseActivity implements RegionGated, EarlyPayEnrollmentFragment.Callbacks, EarlyPaySignupFragment.Callbacks, EarlyPayConfirmationFragment.Callbacks {
    private static final int DIRECT_DEPOSIT_REQUEST_CODE = 77;
    private static final String EXTRA_HIDE_ACTIONS = "hideActions";
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: hideEnrollmentActions$delegate, reason: from kotlin metadata */
    private final Lazy hideEnrollmentActions;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: EarlyPayEnrollmentActivity.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DirectDepositSource.values().length];
            try {
                iArr[DirectDepositSource.ALREADY_SET_UP_DD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DirectDepositSource.MANUAL_ACCOUNT_ROUTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DirectDepositSource.MANUAL_FORM_HR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DirectDepositSource.SWITCHER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public EarlyPayEnrollmentActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.$$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);
        this.hideEnrollmentActions = Activity.intentExtra(this, EXTRA_HIDE_ACTIONS);
    }

    private final boolean getHideEnrollmentActions() {
        return ((Boolean) this.hideEnrollmentActions.getValue()).booleanValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(this), AchromaticOverlay.INSTANCE, null, 2, null);
        showCloseIcon();
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, EarlyPayEnrollmentFragment.INSTANCE.newInstance((Parcelable) new EarlyPayEnrollmentFragment.Args(getHideEnrollmentActions())));
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    protected void onActivityResult(int requestCode, int resultCode, final Intent data) {
        if (requestCode == 77 && resultCode == -1) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.robinhood.android.earlypay.enrollment.ui.EarlyPayEnrollmentActivity.onActivityResult.1
                @Override // java.lang.Runnable
                public final void run() {
                    EarlyPayEnrollmentActivity earlyPayEnrollmentActivity = EarlyPayEnrollmentActivity.this;
                    Intent intent = data;
                    Serializable serializableExtra = intent != null ? intent.getSerializableExtra(DirectDepositConstants.directDepositTypeResultKey) : null;
                    earlyPayEnrollmentActivity.replaceFragment(earlyPayEnrollmentActivity.getConfirmationFragment(serializableExtra instanceof DirectDepositSource ? (DirectDepositSource) serializableExtra : null));
                }
            });
        } else {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }

    @Override // com.robinhood.android.earlypay.enrollment.ui.EarlyPayEnrollmentFragment.Callbacks, com.robinhood.android.earlypay.lib.signup.ui.EarlyPaySignupFragment.Callbacks
    public void onEnrollmentSuccess() {
        replaceFragment(EarlyPayConfirmationFragment.INSTANCE.newInstance((Parcelable) new EarlyPayConfirmationFragment.Args(EarlyPayConfirmationType.STANDARD)));
    }

    @Override // com.robinhood.android.earlypay.enrollment.ui.EarlyPayEnrollmentFragment.Callbacks, com.robinhood.android.earlypay.lib.signup.ui.EarlyPaySignupFragment.Callbacks
    public void onEnrollmentSkipped() {
        setResult(-1);
        finish();
    }

    @Override // com.robinhood.android.earlypay.lib.confirmation.ui.EarlyPayConfirmationFragment.Callbacks
    public void onEnrollmentConfirmed() {
        setResult(-1);
        finish();
    }

    @Override // com.robinhood.android.earlypay.enrollment.ui.EarlyPayEnrollmentFragment.Callbacks
    public void takeUserIntoDirectDeposits() {
        Navigator.DefaultImpls.startActivityForResult$default(getNavigator(), (android.app.Activity) this, (IntentKey) new DirectDepositShimKey(false, false, false, true, false, false, false, false, EnumC7081g.SDK_ASSET_ICON_CANCEL_VALUE, null), 77, (PerformanceMetricEventData.Source) null, false, (Function1) null, (NavigationType) null, 120, (Object) null);
    }

    @Override // com.robinhood.android.earlypay.enrollment.ui.EarlyPayEnrollmentFragment.Callbacks
    public void onAlreadySetupDirectDeposits() {
        replaceFragment(EarlyPaySignupFragment.INSTANCE.newInstance((Parcelable) new EarlyPaySignupFragment.Args(false)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EarlyPayConfirmationFragment getConfirmationFragment(DirectDepositSource directDepositSource) {
        EarlyPayConfirmationType earlyPayConfirmationType;
        EarlyPayConfirmationFragment.Companion companion = EarlyPayConfirmationFragment.INSTANCE;
        int i = directDepositSource == null ? -1 : WhenMappings.$EnumSwitchMapping$0[directDepositSource.ordinal()];
        if (i == -1 || i == 1 || i == 2 || i == 3) {
            earlyPayConfirmationType = EarlyPayConfirmationType.MANUAL_DIRECT_DEPOSIT_SET_UP;
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            earlyPayConfirmationType = EarlyPayConfirmationType.SWITCHER;
        }
        return (EarlyPayConfirmationFragment) companion.newInstance((Parcelable) new EarlyPayConfirmationFragment.Args(earlyPayConfirmationType));
    }

    /* compiled from: EarlyPayEnrollmentActivity.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/earlypay/enrollment/ui/EarlyPayEnrollmentActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolver;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$EarlyPayEnrollment;", "<init>", "()V", "DIRECT_DEPOSIT_REQUEST_CODE", "", "EXTRA_HIDE_ACTIONS", "", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "key", "feature-early-pay_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolver<LegacyIntentKey.EarlyPayEnrollment> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, LegacyIntentKey.EarlyPayEnrollment key) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(key, "key");
            Intent intentPutExtra = new Intent(context, (Class<?>) EarlyPayEnrollmentActivity.class).putExtra(EarlyPayEnrollmentActivity.EXTRA_HIDE_ACTIONS, key.getHideActions());
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
            return intentPutExtra;
        }
    }
}
