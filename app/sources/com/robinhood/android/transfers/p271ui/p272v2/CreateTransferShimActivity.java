package com.robinhood.android.transfers.p271ui.p272v2;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.robinhood.android.banking.experiments.TransfersRedesignExperiment;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.C11839R;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.transfers.contracts.Transfer;
import com.robinhood.android.transfers.contracts.TransferConfiguration;
import com.robinhood.android.transfers.contracts.TransferShim;
import com.robinhood.android.transfers.contracts.TransferV22;
import com.robinhood.android.transfers.p271ui.p272v2.extensions.TransferConfigurations2;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.bonfire.TransferV2LimitsStore;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreateTransferShimActivity.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\"\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/v2/CreateTransferShimActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "<init>", "()V", "experimentStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "getExperimentStore", "()Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "setExperimentStore", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;)V", "transferLimitsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferV2LimitsStore;", "getTransferLimitsStore", "()Lcom/robinhood/librobinhood/data/store/bonfire/TransferV2LimitsStore;", "setTransferLimitsStore", "(Lcom/robinhood/librobinhood/data/store/bonfire/TransferV2LimitsStore;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "entrypointShouldAlwaysShowOldFlow", "", "entryPoint", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "onActivityResult", "requestCode", "", "resultCode", WebsocketGatewayConstants.DATA_KEY, "Landroid/content/Intent;", "Companion", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class CreateTransferShimActivity extends BaseActivity {
    public static final int transferRequestCode = 820;
    public ExperimentsStore experimentStore;
    public TransferV2LimitsStore transferLimitsStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: CreateTransferShimActivity.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MAXTransferContext.EntryPoint.values().length];
            try {
                iArr[MAXTransferContext.EntryPoint.MENU_OF_OPTIONS_JOINT_ACCOUNT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MAXTransferContext.EntryPoint.JOINT_ACCOUNT_FUNDING_METHODS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CreateTransferShimActivity() {
        super(C11839R.layout.activity_rds_loading);
    }

    public final ExperimentsStore getExperimentStore() {
        ExperimentsStore experimentsStore = this.experimentStore;
        if (experimentsStore != null) {
            return experimentsStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("experimentStore");
        return null;
    }

    public final void setExperimentStore(ExperimentsStore experimentsStore) {
        Intrinsics.checkNotNullParameter(experimentsStore, "<set-?>");
        this.experimentStore = experimentsStore;
    }

    public final TransferV2LimitsStore getTransferLimitsStore() {
        TransferV2LimitsStore transferV2LimitsStore = this.transferLimitsStore;
        if (transferV2LimitsStore != null) {
            return transferV2LimitsStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("transferLimitsStore");
        return null;
    }

    public final void setTransferLimitsStore(TransferV2LimitsStore transferV2LimitsStore) {
        Intrinsics.checkNotNullParameter(transferV2LimitsStore, "<set-?>");
        this.transferLimitsStore = transferV2LimitsStore;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View viewFindViewById = findViewById(R.id.content);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ApplyWindowInsets.m26663applyWindowInsetsAsMarginqNU9l24(viewFindViewById, InsetSides.INSTANCE.m26683getTopXedK2Rk());
        getTransferLimitsStore().refresh();
        Companion companion = INSTANCE;
        final TransferConfiguration transferConfiguration = ((TransferShim) companion.getExtras((Activity) this)).getTransferConfiguration();
        if ((transferConfiguration instanceof TransferConfiguration.DayTradeCall) || (transferConfiguration instanceof TransferConfiguration.GoldApyBoostMinDeposit) || (transferConfiguration instanceof TransferConfiguration.IraContribution) || (transferConfiguration instanceof TransferConfiguration.MarginCallPrevention) || (transferConfiguration instanceof TransferConfiguration.MarginResolution) || (transferConfiguration instanceof TransferConfiguration.PdtPrevention) || (transferConfiguration instanceof TransferConfiguration.RothConversion) || TransferConfigurations2.isFromIraSettingTransfersRow(transferConfiguration) || entrypointShouldAlwaysShowOldFlow(transferConfiguration.getEntryPoint())) {
            Navigator.DefaultImpls.startActivityForResult$default(getNavigator(), (Activity) this, (IntentKey) new Transfer(((TransferShim) companion.getExtras((Activity) this)).getDeepLinkMetadata(), transferConfiguration), transferRequestCode, (PerformanceMetricEventData.Source) null, false, (Function1) null, (NavigationType) null, 120, (Object) null);
            return;
        }
        Observable observableTake = ExperimentsProvider.DefaultImpls.streamState$default(getExperimentStore(), new Experiment[]{TransfersRedesignExperiment.INSTANCE}, false, null, 6, null).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableTake), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferShimActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferShimActivity.onCreate$lambda$1$lambda$0(this.f$0, transferConfiguration, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1$lambda$0(CreateTransferShimActivity createTransferShimActivity, TransferConfiguration transferConfiguration, Boolean bool) {
        if (bool.booleanValue()) {
            Navigator navigator = createTransferShimActivity.getNavigator();
            Companion companion = INSTANCE;
            Navigator.DefaultImpls.startActivityForResult$default(navigator, (Activity) createTransferShimActivity, (IntentKey) TransferV22.toTransferV2IntentKey(transferConfiguration, ((TransferShim) companion.getExtras((Activity) createTransferShimActivity)).getDirection(), ((TransferShim) companion.getExtras((Activity) createTransferShimActivity)).getDeepLinkMetadata()), transferRequestCode, (PerformanceMetricEventData.Source) null, false, (Function1) null, (NavigationType) null, 120, (Object) null);
        } else {
            Navigator.DefaultImpls.startActivityForResult$default(createTransferShimActivity.getNavigator(), (Activity) createTransferShimActivity, (IntentKey) new Transfer(((TransferShim) INSTANCE.getExtras((Activity) createTransferShimActivity)).getDeepLinkMetadata(), transferConfiguration), transferRequestCode, (PerformanceMetricEventData.Source) null, false, (Function1) null, (NavigationType) null, 120, (Object) null);
        }
        return Unit.INSTANCE;
    }

    private final boolean entrypointShouldAlwaysShowOldFlow(MAXTransferContext.EntryPoint entryPoint) {
        int i = WhenMappings.$EnumSwitchMapping$0[entryPoint.ordinal()];
        return i == 1 || i == 2;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 820) {
            setResult(resultCode, data);
        } else {
            super.onActivityResult(requestCode, resultCode, data);
        }
        finish();
    }

    /* compiled from: CreateTransferShimActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/v2/CreateTransferShimActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferShimActivity;", "Lcom/robinhood/android/transfers/contracts/TransferShim;", "<init>", "()V", "transferRequestCode", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<CreateTransferShimActivity, TransferShim> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public TransferShim getExtras(CreateTransferShimActivity createTransferShimActivity) {
            return (TransferShim) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, createTransferShimActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, TransferShim transferShim) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, transferShim);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, TransferShim transferShim) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, transferShim);
        }
    }
}
