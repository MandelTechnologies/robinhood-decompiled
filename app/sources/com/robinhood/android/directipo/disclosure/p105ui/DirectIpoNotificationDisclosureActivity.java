package com.robinhood.android.directipo.disclosure.p105ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.directipo.disclosure.p105ui.DirectIpoNotificationDisclosureFragment;
import com.robinhood.android.directipo.disclosure.p105ui.DirectIpoNotificationDisclosureLoadingFragment;
import com.robinhood.android.navigation.IntentResolver;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import com.robinhood.android.regiongate.IpoAccessRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.directipo.models.DirectIpoOrderSource;
import com.robinhood.directipo.models.api.ApiDirectIpoNotificationDisclosure;
import com.robinhood.utils.extensions.Activity;
import java.util.Set;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DirectIpoNotificationDisclosureActivity.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 .2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001.B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014J\b\u0010\u001c\u001a\u00020\u0019H\u0016J\u0010\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\"H\u0016J\u0010\u0010#\u001a\u00020\u00192\u0006\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020\u0019H\u0016J\t\u0010'\u001a\u00020(H\u0096\u0001R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u000e\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*X\u0096\u0005¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/directipo/disclosure/ui/DirectIpoNotificationDisclosureActivity;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/common/ui/RhDialogFragment$OnDismissListener;", "Lcom/robinhood/android/directipo/disclosure/ui/DirectIpoNotificationDisclosureLoadingFragment$Callbacks;", "Lcom/robinhood/android/directipo/disclosure/ui/DirectIpoNotificationDisclosureFragment$Callbacks;", "<init>", "()V", "instrumentId", "Ljava/util/UUID;", "getInstrumentId", "()Ljava/util/UUID;", "instrumentId$delegate", "Lkotlin/Lazy;", DirectIpoNotificationDisclosureActivity.EXTRA_DESTINATION, "", "getDestination", "()Ljava/lang/String;", "destination$delegate", "source", "Lcom/robinhood/directipo/models/DirectIpoOrderSource;", "getSource", "()Lcom/robinhood/directipo/models/DirectIpoOrderSource;", "source$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onBackPressed", "onDialogDismissed", "id", "", "onLoadNotificationDisclosureSuccess", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "Lcom/robinhood/directipo/models/api/ApiDirectIpoNotificationDisclosure;", "onLoadNotificationDisclosureFailure", "throwable", "", "onCompleteNotificationDisclosure", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-direct-ipo-notification-disclosure_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes27.dex */
public final class DirectIpoNotificationDisclosureActivity extends BaseActivity implements RegionGated, RhDialogFragment.OnDismissListener, DirectIpoNotificationDisclosureLoadingFragment.Callbacks, DirectIpoNotificationDisclosureFragment.Callbacks {
    private static final String EXTRA_DESTINATION = "destination";
    private static final String EXTRA_INSTRUMENT_ID = "instrumentId";
    private static final String EXTRA_SOURCE = "source";
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: destination$delegate, reason: from kotlin metadata */
    private final Lazy destination;

    /* renamed from: instrumentId$delegate, reason: from kotlin metadata */
    private final Lazy instrumentId;

    /* renamed from: source$delegate, reason: from kotlin metadata */
    private final Lazy source;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public DirectIpoNotificationDisclosureActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.$$delegate_0 = new RegionGated2(IpoAccessRegionGate.INSTANCE);
        this.instrumentId = Activity.intentExtra(this, "instrumentId");
        this.destination = Activity.intentExtra(this, EXTRA_DESTINATION);
        this.source = Activity.intentExtra(this, "source");
    }

    private final UUID getInstrumentId() {
        return (UUID) this.instrumentId.getValue();
    }

    private final String getDestination() {
        return (String) this.destination.getValue();
    }

    private final DirectIpoOrderSource getSource() {
        return (DirectIpoOrderSource) this.source.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, DirectIpoNotificationDisclosureLoadingFragment.INSTANCE.newInstance((Parcelable) new DirectIpoNotificationDisclosureLoadingFragment.Args(getInstrumentId(), getDestination(), getSource())));
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (getCurrentFragment() instanceof DirectIpoNotificationDisclosureFragment) {
            finish();
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        if (id == C11048R.id.dialog_id_generic_error) {
            finish();
        }
    }

    @Override // com.robinhood.android.directipo.disclosure.ui.DirectIpoNotificationDisclosureLoadingFragment.Callbacks
    public void onLoadNotificationDisclosureSuccess(ApiDirectIpoNotificationDisclosure disclosure) {
        Intrinsics.checkNotNullParameter(disclosure, "disclosure");
        replaceFragmentWithoutAnimation(DirectIpoNotificationDisclosureFragment.INSTANCE.newInstance((Parcelable) disclosure));
    }

    @Override // com.robinhood.android.directipo.disclosure.ui.DirectIpoNotificationDisclosureLoadingFragment.Callbacks
    public void onLoadNotificationDisclosureFailure(Throwable throwable) throws Throwable {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        ActivityErrorHandler.Companion.handle$default(ActivityErrorHandler.INSTANCE, this, throwable, true, false, 0, null, 56, null);
    }

    @Override // com.robinhood.android.directipo.disclosure.ui.DirectIpoNotificationDisclosureFragment.Callbacks
    public void onCompleteNotificationDisclosure() {
        finish();
    }

    /* compiled from: DirectIpoNotificationDisclosureActivity.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/directipo/disclosure/ui/DirectIpoNotificationDisclosureActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolver;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$DirectIpoNotificationDisclosure;", "<init>", "()V", "EXTRA_INSTRUMENT_ID", "", "EXTRA_DESTINATION", "EXTRA_SOURCE", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "key", "feature-direct-ipo-notification-disclosure_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolver<LegacyIntentKey.DirectIpoNotificationDisclosure> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, LegacyIntentKey.DirectIpoNotificationDisclosure key) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(key, "key");
            Intent intent = new Intent(context, (Class<?>) DirectIpoNotificationDisclosureActivity.class);
            intent.putExtra("instrumentId", key.getInstrumentId());
            intent.putExtra(DirectIpoNotificationDisclosureActivity.EXTRA_DESTINATION, key.getDestination());
            intent.putExtra("source", key.getSource());
            return intent;
        }
    }
}
