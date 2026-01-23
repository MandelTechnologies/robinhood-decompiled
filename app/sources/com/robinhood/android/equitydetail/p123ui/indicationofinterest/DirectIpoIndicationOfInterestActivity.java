package com.robinhood.android.equitydetail.p123ui.indicationofinterest;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.equitydetail.p123ui.indicationofinterest.DirectIpoIndicationOfInterestBottomSheetFragment;
import com.robinhood.android.navigation.IntentResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyDialogFragmentKey;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.regiongate.IpoAccessRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.serverclientcomponents.alert.ClientComponentAlertFragment;
import com.robinhood.android.serverclientcomponents.alert.ClientComponentAlertSheetFragment;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.models.api.GenericAlertErrorResponse;
import com.robinhood.models.serverdriven.p347db.GenericAlert;
import com.robinhood.models.serverdriven.p347db.ServerDrivenButton;
import com.robinhood.utils.extensions.Activity;
import java.util.Set;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;

/* compiled from: DirectIpoIndicationOfInterestActivity.kt */
@Metadata(m3635d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 12\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u000201B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J\u0010\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\"H\u0016J\u0010\u0010#\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\"H\u0016J\u0012\u0010$\u001a\u00020\u001a2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u0010\u0010'\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020)H\u0016J\t\u0010*\u001a\u00020\u0011H\u0096\u0001R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00118B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0018\u0010+\u001a\b\u0012\u0004\u0012\u00020-0,X\u0096\u0005¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00062"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/indicationofinterest/DirectIpoIndicationOfInterestActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/common/ui/RhDialogFragment$OnDismissListener;", "Lcom/robinhood/android/serverclientcomponents/alert/ClientComponentAlertSheetFragment$Callbacks;", "Lcom/robinhood/android/serverclientcomponents/alert/ClientComponentAlertFragment$Callbacks;", "Lcom/robinhood/android/equitydetail/ui/indicationofinterest/DirectIpoIndicationOfInterestBottomSheetFragment$Callbacks;", "Lcom/robinhood/android/common/ui/BaseBottomSheetDialogFragment$OnDismissListener;", "<init>", "()V", "instrumentId", "Ljava/util/UUID;", "getInstrumentId", "()Ljava/util/UUID;", "instrumentId$delegate", "Lkotlin/Lazy;", "<set-?>", "", "finishActivityIfIoiBottomSheetDismissed", "getFinishActivityIfIoiBottomSheetDismissed", "()Z", "setFinishActivityIfIoiBottomSheetDismissed", "(Z)V", "finishActivityIfIoiBottomSheetDismissed$delegate", "Lkotlin/properties/ReadWriteProperty;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onActionClicked", "button", "Lcom/robinhood/models/serverdriven/db/ServerDrivenButton;", "onDialogDismissed", "id", "", "onBottomSheetDismissed", "onExpressInterestSuccess", "alert", "Lcom/robinhood/models/serverdriven/db/GenericAlert;", "onExpressInterestError", "throwable", "", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "IndicationOfInterestErrorHandler", "Companion", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class DirectIpoIndicationOfInterestActivity extends BaseActivity implements RegionGated, RhDialogFragment.OnDismissListener, ClientComponentAlertSheetFragment.Callbacks, ClientComponentAlertFragment.Callbacks, DirectIpoIndicationOfInterestBottomSheetFragment.Callbacks, BaseBottomSheetDialogFragment.OnDismissListener {
    private static final String EXTRA_INSTRUMENT_ID = "instrumentId";
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: finishActivityIfIoiBottomSheetDismissed$delegate, reason: from kotlin metadata */
    private final Interfaces3 finishActivityIfIoiBottomSheetDismissed;

    /* renamed from: instrumentId$delegate, reason: from kotlin metadata */
    private final Lazy instrumentId;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(DirectIpoIndicationOfInterestActivity.class, "finishActivityIfIoiBottomSheetDismissed", "getFinishActivityIfIoiBottomSheetDismissed()Z", 0))};

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

    public DirectIpoIndicationOfInterestActivity() {
        super(C15314R.layout.activity_direct_ipo_indication_of_interest);
        this.$$delegate_0 = new RegionGated2(IpoAccessRegionGate.INSTANCE);
        this.instrumentId = Activity.intentExtra(this, "instrumentId");
        this.finishActivityIfIoiBottomSheetDismissed = BindSavedState2.savedBoolean(this, true).provideDelegate(this, $$delegatedProperties[0]);
    }

    private final UUID getInstrumentId() {
        return (UUID) this.instrumentId.getValue();
    }

    private final boolean getFinishActivityIfIoiBottomSheetDismissed() {
        return ((Boolean) this.finishActivityIfIoiBottomSheetDismissed.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    private final void setFinishActivityIfIoiBottomSheetDismissed(boolean z) {
        this.finishActivityIfIoiBottomSheetDismissed.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z));
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            DirectIpoIndicationOfInterestBottomSheetFragment directIpoIndicationOfInterestBottomSheetFragment = (DirectIpoIndicationOfInterestBottomSheetFragment) DirectIpoIndicationOfInterestBottomSheetFragment.INSTANCE.newInstance((Parcelable) new DirectIpoIndicationOfInterestBottomSheetFragment.Args(getInstrumentId()));
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            directIpoIndicationOfInterestBottomSheetFragment.show(supportFragmentManager, "direct-ipo-ioi-enrollment-alert");
        }
    }

    @Override // com.robinhood.android.serverclientcomponents.actionbutton.ClientComponentButtonView.Callbacks
    public boolean onActionClicked(ServerDrivenButton button) {
        Intrinsics.checkNotNullParameter(button, "button");
        finish();
        return false;
    }

    @Override // com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        if (id == C11048R.id.dialog_id_generic_error) {
            finish();
        }
    }

    @Override // com.robinhood.android.common.ui.BaseBottomSheetDialogFragment.OnDismissListener
    public void onBottomSheetDismissed(int id) {
        if (id == C15314R.id.dialog_id_indication_of_interest) {
            if (getFinishActivityIfIoiBottomSheetDismissed()) {
                finish();
                return;
            }
            return;
        }
        finish();
    }

    @Override // com.robinhood.android.equitydetail.ui.indicationofinterest.DirectIpoIndicationOfInterestBottomSheetFragment.Callbacks
    public void onExpressInterestSuccess(GenericAlert alert) {
        setResult(-1);
        if (alert != null) {
            setFinishActivityIfIoiBottomSheetDismissed(false);
            Navigator.DefaultImpls.createDialogFragment$default(getNavigator(), new LegacyDialogFragmentKey.ClientComponentAlertSheet(alert, false, false, 0, 14, (DefaultConstructorMarker) null), null, 2, null).show(getSupportFragmentManager(), "direct-ipo-ioi-enrollment-alert");
        }
    }

    @Override // com.robinhood.android.equitydetail.ui.indicationofinterest.DirectIpoIndicationOfInterestBottomSheetFragment.Callbacks
    public void onExpressInterestError(Throwable throwable) throws Throwable {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        new IndicationOfInterestErrorHandler(this, this).accept(throwable);
    }

    /* compiled from: DirectIpoIndicationOfInterestActivity.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/indicationofinterest/DirectIpoIndicationOfInterestActivity$IndicationOfInterestErrorHandler;", "Lcom/robinhood/android/common/util/rx/ActivityErrorHandler;", "", "activity", "Landroid/app/Activity;", "<init>", "(Lcom/robinhood/android/equitydetail/ui/indicationofinterest/DirectIpoIndicationOfInterestActivity;Landroid/app/Activity;)V", "handleErrorResponse", "", "errorResponse", "Lcom/robinhood/models/api/ErrorResponse;", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private final class IndicationOfInterestErrorHandler extends ActivityErrorHandler {
        final /* synthetic */ DirectIpoIndicationOfInterestActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IndicationOfInterestErrorHandler(DirectIpoIndicationOfInterestActivity directIpoIndicationOfInterestActivity, android.app.Activity activity) {
            super(activity, true, 0, null, 12, null);
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.this$0 = directIpoIndicationOfInterestActivity;
        }

        @Override // com.robinhood.android.util.p275rx.AbsErrorHandler
        public boolean handleErrorResponse(ErrorResponse errorResponse) {
            Intrinsics.checkNotNullParameter(errorResponse, "errorResponse");
            if (errorResponse instanceof GenericAlertErrorResponse) {
                Navigator.DefaultImpls.createDialogFragment$default(this.this$0.getNavigator(), new LegacyDialogFragmentKey.ClientComponentAlert(((GenericAlertErrorResponse) errorResponse).getAlert(), false, false, 0, 14, (DefaultConstructorMarker) null), null, 2, null).show(this.this$0.getSupportFragmentManager(), "direct-ipo-ioi-enrollment-error");
                return true;
            }
            return super.handleErrorResponse(errorResponse);
        }
    }

    /* compiled from: DirectIpoIndicationOfInterestActivity.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/indicationofinterest/DirectIpoIndicationOfInterestActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolver;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$DirectIpoIndicationOfInterest;", "<init>", "()V", "EXTRA_INSTRUMENT_ID", "", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "key", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolver<LegacyIntentKey.DirectIpoIndicationOfInterest> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, LegacyIntentKey.DirectIpoIndicationOfInterest key) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(key, "key");
            Intent intent = new Intent(context, (Class<?>) DirectIpoIndicationOfInterestActivity.class);
            intent.putExtra("instrumentId", key.getInstrumentId());
            return intent;
        }
    }
}
