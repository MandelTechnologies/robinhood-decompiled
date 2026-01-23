package com.robinhood.android.iav.p154ui.update;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.iav.p154ui.update.PlaidFragment;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.MoneyMovementsUsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.transfers.contracts.PlaidSdk;
import com.robinhood.android.transfers.contracts.TransferSuccessCallbacks;
import com.robinhood.models.api.bonfire.ApiPostTransferPage;
import com.robinhood.models.p355ui.bonfire.PostTransferFlow;
import com.robinhood.models.p355ui.bonfire.UiPostTransferPage;
import com.robinhood.models.p355ui.bonfire.UiPostTransferPage2;
import com.robinhood.shared.transfers.contracts.TransferSuccessKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;

/* compiled from: PlaidActivity.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 #2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001#B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u0011H\u0016J\u0016\u0010\u0015\u001a\u00020\u00112\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016J\b\u0010\u0019\u001a\u00020\u0011H\u0016J\u0010\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\t\u0010\u001d\u001a\u00020\bH\u0096\u0001R+\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0018\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fX\u0096\u0005¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/iav/ui/update/PlaidActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/iav/ui/update/PlaidFragment$Callbacks;", "Lcom/robinhood/android/transfers/contracts/TransferSuccessCallbacks;", "<init>", "()V", "<set-?>", "", "updateSuccessful", "getUpdateSuccessful", "()Z", "setUpdateSuccessful", "(Z)V", "updateSuccessful$delegate", "Lkotlin/properties/ReadWriteProperty;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "finish", "showPostTransferPage", "postTransferPages", "", "Lcom/robinhood/models/api/bonfire/ApiPostTransferPage;", "onExit", "onTransferConfirmationComplete", "postTransferFlow", "Lcom/robinhood/models/ui/bonfire/PostTransferFlow;", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-iav_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class PlaidActivity extends BaseActivity implements RegionGated, PlaidFragment.Callbacks, TransferSuccessCallbacks {
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: updateSuccessful$delegate, reason: from kotlin metadata */
    private final Interfaces3 updateSuccessful;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(PlaidActivity.class, "updateSuccessful", "getUpdateSuccessful()Z", 0))};

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

    public PlaidActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.$$delegate_0 = new RegionGated2(MoneyMovementsUsRegionGate.INSTANCE);
        this.updateSuccessful = BindSavedState2.savedBoolean(this, false).provideDelegate(this, $$delegatedProperties[0]);
    }

    private final boolean getUpdateSuccessful() {
        return ((Boolean) this.updateSuccessful.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    private final void setUpdateSuccessful(boolean z) {
        this.updateSuccessful.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z));
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, PlaidFragment.INSTANCE.newInstance(INSTANCE.getExtras((Activity) this)));
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, android.app.Activity
    public void finish() {
        setResult(getUpdateSuccessful() ? -1 : 0);
        super.finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.android.iav.ui.update.PlaidFragment.Callbacks
    public void showPostTransferPage(List<? extends ApiPostTransferPage> postTransferPages) {
        Intrinsics.checkNotNullParameter(postTransferPages, "postTransferPages");
        setUpdateSuccessful(true);
        Navigator navigator = getNavigator();
        String transferId = ((PlaidSdk) INSTANCE.getExtras((Activity) this)).getTransferId();
        if (transferId == null) {
            throw new IllegalStateException("Required value was null.");
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = postTransferPages.iterator();
        while (it.hasNext()) {
            UiPostTransferPage uiModel = UiPostTransferPage2.toUiModel((ApiPostTransferPage) it.next());
            if (uiModel != null) {
                arrayList.add(uiModel);
            }
        }
        replaceFragment(Navigator.DefaultImpls.createFragment$default(navigator, new TransferSuccessKey(new PostTransferFlow(transferId, arrayList, null, null), null, 2, 0 == true ? 1 : 0), null, 2, null));
    }

    @Override // com.robinhood.android.iav.ui.update.PlaidFragment.Callbacks
    public void onExit() {
        finish();
    }

    @Override // com.robinhood.android.transfers.contracts.TransferSuccessCallbacks
    public void onTransferConfirmationComplete(PostTransferFlow postTransferFlow) {
        Intrinsics.checkNotNullParameter(postTransferFlow, "postTransferFlow");
        finish();
    }

    /* compiled from: PlaidActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/iav/ui/update/PlaidActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/iav/ui/update/PlaidActivity;", "Lcom/robinhood/android/transfers/contracts/PlaidSdk;", "<init>", "()V", "feature-iav_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<PlaidActivity, PlaidSdk> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public PlaidSdk getExtras(PlaidActivity plaidActivity) {
            return (PlaidSdk) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, plaidActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, PlaidSdk plaidSdk) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, plaidSdk);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, PlaidSdk plaidSdk) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, plaidSdk);
        }
    }
}
