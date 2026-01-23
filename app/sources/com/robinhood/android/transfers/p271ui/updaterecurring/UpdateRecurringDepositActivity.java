package com.robinhood.android.transfers.p271ui.updaterecurring;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.C11839R;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.databinding.ActivityFragmentContainerWithRdsLoadingViewBinding;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.DeepLinkIntentKey;
import com.robinhood.android.transfers.contracts.UpdateRecurringDepositKey;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.utils.extensions.ObservablesAndroid;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: UpdateRecurringDepositActivity.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0011H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/updaterecurring/UpdateRecurringDepositActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "<init>", "()V", "duxo", "Lcom/robinhood/android/transfers/ui/updaterecurring/UpdateRecurringDepositDuxo;", "getDuxo", "()Lcom/robinhood/android/transfers/ui/updaterecurring/UpdateRecurringDepositDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "bindings", "Lcom/robinhood/android/common/ui/databinding/ActivityFragmentContainerWithRdsLoadingViewBinding;", "getBindings", "()Lcom/robinhood/android/common/ui/databinding/ActivityFragmentContainerWithRdsLoadingViewBinding;", "bindings$delegate", "Lkotlin/properties/ReadOnlyProperty;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "runFlow", "keyWithUpdates", "Lcom/robinhood/android/transfers/contracts/UpdateRecurringDepositKey;", "abortFlow", "Companion", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class UpdateRecurringDepositActivity extends BaseActivity {

    /* renamed from: bindings$delegate, reason: from kotlin metadata */
    private final Interfaces2 bindings;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(UpdateRecurringDepositActivity.class, "bindings", "getBindings()Lcom/robinhood/android/common/ui/databinding/ActivityFragmentContainerWithRdsLoadingViewBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public UpdateRecurringDepositActivity() {
        super(C11839R.layout.activity_fragment_container_with_rds_loading_view);
        this.duxo = DuxosKt.duxo(this, UpdateRecurringDepositDuxo.class);
        this.bindings = ViewBinding5.viewBinding(this, UpdateRecurringDepositActivity2.INSTANCE);
    }

    public final UpdateRecurringDepositDuxo getDuxo() {
        return (UpdateRecurringDepositDuxo) this.duxo.getValue();
    }

    private final ActivityFragmentContainerWithRdsLoadingViewBinding getBindings() {
        Object value = this.bindings.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ActivityFragmentContainerWithRdsLoadingViewBinding) value;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            getBindings().rdsLoadingView.setVisibility(0);
            LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().streamMaxAwarenessExperimentState()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ui.updaterecurring.UpdateRecurringDepositActivity$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UpdateRecurringDepositActivity.onCreate$lambda$0(this.f$0, ((Boolean) obj).booleanValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit onCreate$lambda$0(UpdateRecurringDepositActivity updateRecurringDepositActivity, boolean z) {
        if (z) {
            Companion companion = INSTANCE;
            if (((UpdateRecurringDepositKey) companion.getExtras((Activity) updateRecurringDepositActivity)).frequencySupported()) {
                updateRecurringDepositActivity.runFlow((UpdateRecurringDepositKey) companion.getExtras((Activity) updateRecurringDepositActivity));
            } else {
                updateRecurringDepositActivity.abortFlow();
            }
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        hideToolbar();
    }

    private final void runFlow(UpdateRecurringDepositKey keyWithUpdates) {
        setFragment(C11048R.id.fragment_container, UpdateRecurringDepositFrequencyFragment.INSTANCE.newInstance((Parcelable) keyWithUpdates));
        getBindings().rdsLoadingView.setVisibility(8);
    }

    private final void abortFlow() {
        startActivity(Navigator.DefaultImpls.createIntent$default(getNavigator(), this, new DeepLinkIntentKey.UnrecognizedDeepLink(false, false, null, 7, null), null, false, 12, null));
        finish();
    }

    /* compiled from: UpdateRecurringDepositActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/updaterecurring/UpdateRecurringDepositActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/transfers/ui/updaterecurring/UpdateRecurringDepositActivity;", "Lcom/robinhood/android/transfers/contracts/UpdateRecurringDepositKey;", "<init>", "()V", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<UpdateRecurringDepositActivity, UpdateRecurringDepositKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public UpdateRecurringDepositKey getExtras(UpdateRecurringDepositActivity updateRecurringDepositActivity) {
            return (UpdateRecurringDepositKey) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, updateRecurringDepositActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, UpdateRecurringDepositKey updateRecurringDepositKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, updateRecurringDepositKey);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, UpdateRecurringDepositKey updateRecurringDepositKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, updateRecurringDepositKey);
        }
    }
}
