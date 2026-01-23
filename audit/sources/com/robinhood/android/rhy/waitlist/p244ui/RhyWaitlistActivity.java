package com.robinhood.android.rhy.waitlist.p244ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.navigation.IntentResolver;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.rhy.contracts.RhyWaitlistSignUpConfirmationContract;
import com.robinhood.android.rhy.contracts.RhyWaitlistSignUpContract;
import com.robinhood.android.rhy.waitlist.p244ui.RhyWaitlistLoadingFragment;
import com.robinhood.models.api.bonfire.waitlist.WaitlistStatus;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyWaitlistActivity.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00182\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001\u0018B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\tH\u0016J\b\u0010\u0010\u001a\u00020\tH\u0016J\t\u0010\u0011\u001a\u00020\u0012H\u0096\u0001R\u0018\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/rhy/waitlist/ui/RhyWaitlistActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/rhy/waitlist/ui/RhyWaitlistLoadingFragment$Callbacks;", "Lcom/robinhood/android/rhy/contracts/RhyWaitlistSignUpContract$Callbacks;", "Lcom/robinhood/android/rhy/contracts/RhyWaitlistSignUpConfirmationContract$Callbacks;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onWaitlistSpotLoaded", "waitlistStatus", "Lcom/robinhood/models/api/bonfire/waitlist/WaitlistStatus;", "onWaitlistJoined", "onWaitlistDone", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-rhy-waitlist_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class RhyWaitlistActivity extends BaseActivity implements RegionGated, RhyWaitlistLoadingFragment.Callbacks, RhyWaitlistSignUpContract.Callbacks, RhyWaitlistSignUpConfirmationContract.Callbacks {
    public static final String WAITLIST_NAME = "rhy_spending";
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: RhyWaitlistActivity.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WaitlistStatus.values().length];
            try {
                iArr[WaitlistStatus.CAN_JOIN_WAITLIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WaitlistStatus.IN_WAITLIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WaitlistStatus.GRANTED_ACCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
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

    public RhyWaitlistActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.$$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().getDecorView().setSystemUiVisibility(1280);
        super.onCreate(savedInstanceState);
        RhToolbar rhToolbar = getRhToolbar();
        if (rhToolbar != null) {
            rhToolbar.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.robinhood.android.rhy.waitlist.ui.RhyWaitlistActivity.onCreate.1
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View v, WindowInsets insets) {
                    Intrinsics.checkNotNullParameter(v, "v");
                    Intrinsics.checkNotNullParameter(insets, "insets");
                    ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
                    Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    ((FrameLayout.LayoutParams) layoutParams).topMargin = insets.getSystemWindowInsetTop();
                    return insets;
                }
            });
        }
        showCloseIcon();
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, RhyWaitlistLoadingFragment.INSTANCE.newInstance((Parcelable) new RhyWaitlistLoadingFragment.Args(WAITLIST_NAME)));
        }
    }

    @Override // com.robinhood.android.rhy.waitlist.ui.RhyWaitlistLoadingFragment.Callbacks
    public void onWaitlistSpotLoaded(WaitlistStatus waitlistStatus) {
        Intrinsics.checkNotNullParameter(waitlistStatus, "waitlistStatus");
        int i = WhenMappings.$EnumSwitchMapping$0[waitlistStatus.ordinal()];
        if (i == 1) {
            replaceFragment(new RhyWaitlistSignUpFragment());
        } else if (i == 2 || i == 3) {
            replaceFragment(new RhyWaitlistComingSoonFragment());
        } else {
            finish();
        }
    }

    @Override // com.robinhood.android.rhy.contracts.RhyWaitlistSignUpContract.Callbacks
    public void onWaitlistJoined() {
        replaceFragment(new RhyWaitlistSignUpConfirmationFragment());
    }

    @Override // com.robinhood.android.rhy.contracts.RhyWaitlistSignUpConfirmationContract.Callbacks
    public void onWaitlistDone() {
        setResult(-1);
        finish();
    }

    /* compiled from: RhyWaitlistActivity.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/rhy/waitlist/ui/RhyWaitlistActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolver;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$RhyWaitlist;", "<init>", "()V", "WAITLIST_NAME", "", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "key", "feature-rhy-waitlist_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolver<LegacyIntentKey.RhyWaitlist> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, LegacyIntentKey.RhyWaitlist key) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(key, "key");
            return new Intent(context, (Class<?>) RhyWaitlistActivity.class);
        }
    }
}
