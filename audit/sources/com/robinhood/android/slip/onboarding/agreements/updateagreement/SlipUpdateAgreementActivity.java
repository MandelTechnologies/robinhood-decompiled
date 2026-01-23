package com.robinhood.android.slip.onboarding.agreements.updateagreement;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SlipRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.slip.C28532R;
import com.robinhood.android.slip.onboarding.agreements.updateagreement.SlipUpdateAgreementFragment;
import com.robinhood.compose.app.ShimmerLoadingFragment;
import com.robinhood.compose.common.ShimmerLoaderType;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.bonfire.slip.SlipUpdatedAgreementsStore;
import com.robinhood.models.p355ui.UiUpdatedAgreementsResponse;
import com.robinhood.utils.Optional;
import com.robinhood.utils.extensions.SinglesAndroid;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SlipUpdateAgreementActivity.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001a2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u001aB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\t\u0010\u0013\u001a\u00020\u0014H\u0096\u0001R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0018\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/agreements/updateagreement/SlipUpdateAgreementActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/common/ui/RhDialogFragment$OnDismissListener;", "<init>", "()V", "slipUpdatedAgreementsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/slip/SlipUpdatedAgreementsStore;", "getSlipUpdatedAgreementsStore", "()Lcom/robinhood/librobinhood/data/store/bonfire/slip/SlipUpdatedAgreementsStore;", "setSlipUpdatedAgreementsStore", "(Lcom/robinhood/librobinhood/data/store/bonfire/slip/SlipUpdatedAgreementsStore;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDialogDismissed", "id", "", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class SlipUpdateAgreementActivity extends BaseActivity implements RegionGated, RhDialogFragment.OnDismissListener {
    private final /* synthetic */ RegionGated2 $$delegate_0;
    public SlipUpdatedAgreementsStore slipUpdatedAgreementsStore;

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

    public SlipUpdateAgreementActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.$$delegate_0 = new RegionGated2(SlipRegionGate.INSTANCE);
    }

    public final SlipUpdatedAgreementsStore getSlipUpdatedAgreementsStore() {
        SlipUpdatedAgreementsStore slipUpdatedAgreementsStore = this.slipUpdatedAgreementsStore;
        if (slipUpdatedAgreementsStore != null) {
            return slipUpdatedAgreementsStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("slipUpdatedAgreementsStore");
        return null;
    }

    public final void setSlipUpdatedAgreementsStore(SlipUpdatedAgreementsStore slipUpdatedAgreementsStore) {
        Intrinsics.checkNotNullParameter(slipUpdatedAgreementsStore, "<set-?>");
        this.slipUpdatedAgreementsStore = slipUpdatedAgreementsStore;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        showCloseIcon();
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, ShimmerLoadingFragment.INSTANCE.newInstance((Parcelable) new ShimmerLoadingFragment.Args(new ShimmerLoaderType.List(true, true, 0, 4, null), null, 2, 0 == true ? 1 : 0)));
            LifecycleHost.DefaultImpls.bind$default(this, SinglesAndroid.observeOnMainThread(getSlipUpdatedAgreementsStore().forceFetchUpdatedAgreementsIfNotCached()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.slip.onboarding.agreements.updateagreement.SlipUpdateAgreementActivity$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SlipUpdateAgreementActivity.onCreate$lambda$0(this.f$0, (Optional) obj);
                }
            }, new Function1() { // from class: com.robinhood.android.slip.onboarding.agreements.updateagreement.SlipUpdateAgreementActivity$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SlipUpdateAgreementActivity.onCreate$lambda$1(this.f$0, (Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(SlipUpdateAgreementActivity slipUpdateAgreementActivity, Optional optional) {
        List<UiUpdatedAgreementsResponse.UpdatedAgreement> updatedAgreements;
        Intrinsics.checkNotNullParameter(optional, "<destruct>");
        UiUpdatedAgreementsResponse uiUpdatedAgreementsResponse = (UiUpdatedAgreementsResponse) optional.component1();
        UiUpdatedAgreementsResponse.UpdatedAgreement updatedAgreement = (uiUpdatedAgreementsResponse == null || (updatedAgreements = uiUpdatedAgreementsResponse.getUpdatedAgreements()) == null) ? null : (UiUpdatedAgreementsResponse.UpdatedAgreement) CollectionsKt.firstOrNull((List) updatedAgreements);
        if (updatedAgreement != null) {
            slipUpdateAgreementActivity.replaceFragmentWithoutBackStack(SlipUpdateAgreementFragment.INSTANCE.newInstance((Parcelable) new SlipUpdateAgreementFragment.Args(updatedAgreement, ((LegacyIntentKey.SlipUpdateAgreement) INSTANCE.getExtras((Activity) slipUpdateAgreementActivity)).getSource())));
        } else {
            RhDialogFragment.Builder builderSlipUpdateAgreementDialog = SlipUpdateAgreementActivity2.slipUpdateAgreementDialog(slipUpdateAgreementActivity);
            FragmentManager supportFragmentManager = slipUpdateAgreementActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            RhDialogFragment.Builder.show$default(builderSlipUpdateAgreementDialog, supportFragmentManager, "slip-already-signed-agreements", false, 4, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(SlipUpdateAgreementActivity slipUpdateAgreementActivity, Throwable t) throws Throwable {
        Intrinsics.checkNotNullParameter(t, "t");
        ActivityErrorHandler.Companion.handle$default(ActivityErrorHandler.INSTANCE, slipUpdateAgreementActivity, t, false, false, 0, null, 60, null);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        if (id == C28532R.id.dialog_id_slip_already_signed) {
            finish();
        }
    }

    /* compiled from: SlipUpdateAgreementActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/agreements/updateagreement/SlipUpdateAgreementActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/slip/onboarding/agreements/updateagreement/SlipUpdateAgreementActivity;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$SlipUpdateAgreement;", "<init>", "()V", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<SlipUpdateAgreementActivity, LegacyIntentKey.SlipUpdateAgreement> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public LegacyIntentKey.SlipUpdateAgreement getExtras(SlipUpdateAgreementActivity slipUpdateAgreementActivity) {
            return (LegacyIntentKey.SlipUpdateAgreement) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, slipUpdateAgreementActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, LegacyIntentKey.SlipUpdateAgreement slipUpdateAgreement) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, slipUpdateAgreement);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, LegacyIntentKey.SlipUpdateAgreement slipUpdateAgreement) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, slipUpdateAgreement);
        }
    }
}
