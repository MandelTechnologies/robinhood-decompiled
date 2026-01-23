package com.robinhood.android.wires.p278ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import bff_money_movement.service.p019v1.NonOriginatedTransferTypeDto;
import bff_money_movement.service.p019v1.StandardScreenDataDto;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.android.banking.experiments.OutgoingWiresRevampKillswitch;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.models.transfer.shared.ThirdPartyOutgoingWiresInfo;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.regiongate.MoneyMovementsUsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.transfers.contracts.AccountSpecificNonOriginatedTransferInfo;
import com.robinhood.android.transfers.contracts.Transfer;
import com.robinhood.android.transfers.contracts.TransferConfiguration;
import com.robinhood.android.transfers.contracts.WireRoutingDetailsInputActivityIntentKey;
import com.robinhood.android.transfers.contracts.Wires;
import com.robinhood.android.transfers.contracts.wires.WireAccountCreation;
import com.robinhood.android.wires.p278ui.WiresDirectionSelectionFragment;
import com.robinhood.android.wires.p278ui.WiresInvalidAccountContentFragment;
import com.robinhood.android.wires.p278ui.WiresLinkAccountFragment;
import com.robinhood.android.wires.p278ui.WiresLoadingFragment;
import com.robinhood.android.wires.p278ui.WiresVanDetailsFragment;
import com.robinhood.android.wires.p278ui.thirdparty.ThirdPartyWireKey;
import com.robinhood.android.wires.p278ui.thirdparty.WiresThirdPartyFragment;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.lib.transfers.nonoriginated.NonOriginatedAccountInfoFragment;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.bonfire.TransferWireAccountStore;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.ManagementType;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.api.bonfire.ApiTransferAccountsResponse;
import com.robinhood.models.api.bonfire.transfer.wires.ApiIncomingWireContent;
import com.robinhood.models.api.bonfire.transfer.wires.ApiOutgoingWireContent;
import com.robinhood.models.api.bonfire.transfer.wires.ApiWireDetailsContent;
import com.robinhood.models.api.bonfire.wires.RecipientType;
import com.robinhood.models.api.bonfire.wires.RecipientType2;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.models.p320db.bonfire.TransferAccount6;
import com.robinhood.rosetta.common.CurrencyDto;
import com.robinhood.rosetta.eventlogging.WiresContext;
import com.robinhood.transfers.api.TransferType;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.logging.CrashReporter;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;
import microgram.contracts.money_movement.wire_account_creation.proto.p502v1.DidLinkAccountRequestDto;
import microgram.contracts.money_movement.wire_account_creation.proto.p502v1.RecipientTypeDto;

/* compiled from: WiresActivity.kt */
@Metadata(m3635d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 k2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u0001kB\u0007¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010B\u001a\u00020C2\b\u0010D\u001a\u0004\u0018\u00010EH\u0014J\b\u0010F\u001a\u00020CH\u0016J\u0018\u0010G\u001a\u00020C2\u0006\u0010H\u001a\u00020#2\u0006\u0010I\u001a\u00020JH\u0016J\u0010\u0010K\u001a\u00020C2\u0006\u0010L\u001a\u00020MH\u0016J\u0010\u0010N\u001a\u00020C2\u0006\u0010O\u001a\u00020MH\u0016J\u0010\u0010P\u001a\u00020C2\u0006\u0010O\u001a\u00020MH\u0016J\u0012\u0010Q\u001a\u00020C2\b\u0010R\u001a\u0004\u0018\u00010SH\u0016J\u0012\u0010T\u001a\u00020C2\b\u0010R\u001a\u0004\u0018\u00010SH\u0016J\b\u0010U\u001a\u00020CH\u0016J\u0010\u0010V\u001a\u00020C2\u0006\u0010W\u001a\u00020XH\u0016J\b\u0010Y\u001a\u00020CH\u0016J\u0010\u0010Z\u001a\u00020C2\u0006\u0010[\u001a\u00020\\H\u0002J\b\u0010]\u001a\u00020CH\u0002J\u0010\u0010^\u001a\u00020C2\u0006\u0010_\u001a\u00020;H\u0002J\b\u0010`\u001a\u00020CH\u0002J\u0010\u0010a\u001a\u00020C2\u0006\u0010b\u001a\u00020cH\u0016J\b\u0010d\u001a\u00020CH\u0016J\t\u0010e\u001a\u00020;H\u0096\u0001R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001c\u001a\u00020\u001d8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R/\u0010$\u001a\u0004\u0018\u00010#2\b\u0010\"\u001a\u0004\u0018\u00010#8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R+\u0010,\u001a\u00020+2\u0006\u0010\"\u001a\u00020+8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b1\u0010*\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R/\u00102\u001a\u0004\u0018\u00010#2\b\u0010\"\u001a\u0004\u0018\u00010#8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b5\u0010*\u001a\u0004\b3\u0010&\"\u0004\b4\u0010(R+\u00106\u001a\u00020+2\u0006\u0010\"\u001a\u00020+8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b9\u0010*\u001a\u0004\b7\u0010.\"\u0004\b8\u00100R\u000e\u0010:\u001a\u00020;X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010<\u001a\u00020=8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\b>\u0010?R\u0018\u0010f\u001a\b\u0012\u0004\u0012\u00020h0gX\u0096\u0005¢\u0006\u0006\u001a\u0004\bi\u0010j¨\u0006l"}, m3636d2 = {"Lcom/robinhood/android/wires/ui/WiresActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/wires/ui/WiresLoadingFragment$Callbacks;", "Lcom/robinhood/android/wires/ui/WiresDirectionSelectionFragment$Callbacks;", "Lcom/robinhood/android/transfers/contracts/wires/WireAccountCreation$Callbacks;", "Lcom/robinhood/android/wires/ui/WiresLinkAccountFragment$Callbacks;", "Lcom/robinhood/lib/transfers/nonoriginated/NonOriginatedAccountInfoFragment$Callbacks;", "<init>", "()V", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "getExperimentsStore", "()Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "setExperimentsStore", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;)V", "transferWireAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferWireAccountStore;", "getTransferWireAccountStore", "()Lcom/robinhood/librobinhood/data/store/bonfire/TransferWireAccountStore;", "setTransferWireAccountStore", "(Lcom/robinhood/librobinhood/data/store/bonfire/TransferWireAccountStore;)V", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "getAccountProvider", "()Lcom/robinhood/android/lib/account/AccountProvider;", "setAccountProvider", "(Lcom/robinhood/android/lib/account/AccountProvider;)V", "transfersBonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "getTransfersBonfireApi", "()Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "setTransfersBonfireApi", "(Lcom/robinhood/android/api/transfers/TransfersBonfireApi;)V", "<set-?>", "", "firstPartyWireAccountId", "getFirstPartyWireAccountId", "()Ljava/lang/String;", "setFirstPartyWireAccountId", "(Ljava/lang/String;)V", "firstPartyWireAccountId$delegate", "Lkotlin/properties/ReadWriteProperty;", "", "firstPartyWireAccountCount", "getFirstPartyWireAccountCount", "()I", "setFirstPartyWireAccountCount", "(I)V", "firstPartyWireAccountCount$delegate", "thirdPartyWireAccountId", "getThirdPartyWireAccountId", "setThirdPartyWireAccountId", "thirdPartyWireAccountId$delegate", "thirdPartyWireAccountCount", "getThirdPartyWireAccountCount", "setThirdPartyWireAccountCount", "thirdPartyWireAccountCount$delegate", "isOutgoingWiresRevampEnabled", "", "wiresContext", "Lcom/robinhood/rosetta/eventlogging/WiresContext;", "getWiresContext$feature_wires_externalDebug", "()Lcom/robinhood/rosetta/eventlogging/WiresContext;", "wiresContext$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onBackPressed", "onLoadInvalidAccountContent", "screenIdentifier", "invalidAccountContent", "Lcom/robinhood/models/api/bonfire/transfer/wires/ApiWireDetailsContent$InvalidAccountContent;", "onLoadPreselectedContent", "wireDetailsContent", "Lcom/robinhood/models/api/bonfire/transfer/wires/ApiWireDetailsContent$WireDetailsContent;", "onLoadWireTypeSelection", "incomingContent", "onIncomingWiresRowClicked", "onOutgoingWiresRowClicked", "linkAccountDetails", "Lcom/robinhood/models/api/bonfire/transfer/wires/ApiOutgoingWireContent$ApiOutgoingWireDetails$LinkAccountDetails;", "onOutgoingWiresRowThirdPartyHomeClosingClicked", "onGenericOutgoingWiresThirdPartyClicked", "onAccountCreated", "request", "Lmicrogram/contracts/money_movement/wire_account_creation/proto/v1/DidLinkAccountRequestDto;", "onAccountLinked", "showIncomingWireDetails", "content", "Lcom/robinhood/models/api/bonfire/transfer/wires/ApiIncomingWireContent;", "handleFirstPartyOutgoingWire", "handleThirdPartyWires", "useGenericMode", "startOutgoingWireTransfer", "showConfirmation", "screenData", "Lbff_money_movement/service/v1/StandardScreenDataDto;", "exitNonOriginatedAccountInfo", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-wires_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes16.dex */
public final class WiresActivity extends BaseActivity implements RegionGated, WiresLoadingFragment.Callbacks, WiresDirectionSelectionFragment.Callbacks, WireAccountCreation.Callbacks, WiresLinkAccountFragment.Callbacks, NonOriginatedAccountInfoFragment.Callbacks {
    private final /* synthetic */ RegionGated2 $$delegate_0;
    public AccountProvider accountProvider;
    public ExperimentsStore experimentsStore;

    /* renamed from: firstPartyWireAccountCount$delegate, reason: from kotlin metadata */
    private final Interfaces3 firstPartyWireAccountCount;

    /* renamed from: firstPartyWireAccountId$delegate, reason: from kotlin metadata */
    private final Interfaces3 firstPartyWireAccountId;
    private boolean isOutgoingWiresRevampEnabled;

    /* renamed from: thirdPartyWireAccountCount$delegate, reason: from kotlin metadata */
    private final Interfaces3 thirdPartyWireAccountCount;

    /* renamed from: thirdPartyWireAccountId$delegate, reason: from kotlin metadata */
    private final Interfaces3 thirdPartyWireAccountId;
    public TransferWireAccountStore transferWireAccountStore;
    public TransfersBonfireApi transfersBonfireApi;

    /* renamed from: wiresContext$delegate, reason: from kotlin metadata */
    private final Lazy wiresContext;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(WiresActivity.class, "firstPartyWireAccountId", "getFirstPartyWireAccountId()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(WiresActivity.class, "firstPartyWireAccountCount", "getFirstPartyWireAccountCount()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(WiresActivity.class, "thirdPartyWireAccountId", "getThirdPartyWireAccountId()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(WiresActivity.class, "thirdPartyWireAccountCount", "getThirdPartyWireAccountCount()I", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: WiresActivity.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WiresContext.WiresDirection.values().length];
            try {
                iArr[WiresContext.WiresDirection.INCOMING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WiresContext.WiresDirection.OUTGOING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WiresContext.WiresDirection.WIRES_DIRECTION_UNSPECIFIED.ordinal()] = 3;
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

    public WiresActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.$$delegate_0 = new RegionGated2(MoneyMovementsUsRegionGate.INSTANCE);
        Interfaces<Object, Interfaces3<Object, String>> interfacesSavedString = BindSavedState2.savedString(this);
        KProperty<?>[] kPropertyArr = $$delegatedProperties;
        this.firstPartyWireAccountId = interfacesSavedString.provideDelegate(this, kPropertyArr[0]);
        this.firstPartyWireAccountCount = BindSavedState2.savedInt(this, 0).provideDelegate(this, kPropertyArr[1]);
        this.thirdPartyWireAccountId = BindSavedState2.savedString(this).provideDelegate(this, kPropertyArr[2]);
        this.thirdPartyWireAccountCount = BindSavedState2.savedInt(this, 0).provideDelegate(this, kPropertyArr[3]);
        this.wiresContext = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.wires.ui.WiresActivity$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WiresActivity.wiresContext_delegate$lambda$0(this.f$0);
            }
        });
    }

    public final ExperimentsStore getExperimentsStore() {
        ExperimentsStore experimentsStore = this.experimentsStore;
        if (experimentsStore != null) {
            return experimentsStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("experimentsStore");
        return null;
    }

    public final void setExperimentsStore(ExperimentsStore experimentsStore) {
        Intrinsics.checkNotNullParameter(experimentsStore, "<set-?>");
        this.experimentsStore = experimentsStore;
    }

    public final TransferWireAccountStore getTransferWireAccountStore() {
        TransferWireAccountStore transferWireAccountStore = this.transferWireAccountStore;
        if (transferWireAccountStore != null) {
            return transferWireAccountStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("transferWireAccountStore");
        return null;
    }

    public final void setTransferWireAccountStore(TransferWireAccountStore transferWireAccountStore) {
        Intrinsics.checkNotNullParameter(transferWireAccountStore, "<set-?>");
        this.transferWireAccountStore = transferWireAccountStore;
    }

    public final AccountProvider getAccountProvider() {
        AccountProvider accountProvider = this.accountProvider;
        if (accountProvider != null) {
            return accountProvider;
        }
        Intrinsics.throwUninitializedPropertyAccessException("accountProvider");
        return null;
    }

    public final void setAccountProvider(AccountProvider accountProvider) {
        Intrinsics.checkNotNullParameter(accountProvider, "<set-?>");
        this.accountProvider = accountProvider;
    }

    public final TransfersBonfireApi getTransfersBonfireApi() {
        TransfersBonfireApi transfersBonfireApi = this.transfersBonfireApi;
        if (transfersBonfireApi != null) {
            return transfersBonfireApi;
        }
        Intrinsics.throwUninitializedPropertyAccessException("transfersBonfireApi");
        return null;
    }

    public final void setTransfersBonfireApi(TransfersBonfireApi transfersBonfireApi) {
        Intrinsics.checkNotNullParameter(transfersBonfireApi, "<set-?>");
        this.transfersBonfireApi = transfersBonfireApi;
    }

    private final String getFirstPartyWireAccountId() {
        return (String) this.firstPartyWireAccountId.getValue(this, $$delegatedProperties[0]);
    }

    private final void setFirstPartyWireAccountId(String str) {
        this.firstPartyWireAccountId.setValue(this, $$delegatedProperties[0], str);
    }

    private final int getFirstPartyWireAccountCount() {
        return ((Number) this.firstPartyWireAccountCount.getValue(this, $$delegatedProperties[1])).intValue();
    }

    private final void setFirstPartyWireAccountCount(int i) {
        this.firstPartyWireAccountCount.setValue(this, $$delegatedProperties[1], Integer.valueOf(i));
    }

    private final String getThirdPartyWireAccountId() {
        return (String) this.thirdPartyWireAccountId.getValue(this, $$delegatedProperties[2]);
    }

    private final void setThirdPartyWireAccountId(String str) {
        this.thirdPartyWireAccountId.setValue(this, $$delegatedProperties[2], str);
    }

    private final int getThirdPartyWireAccountCount() {
        return ((Number) this.thirdPartyWireAccountCount.getValue(this, $$delegatedProperties[3])).intValue();
    }

    private final void setThirdPartyWireAccountCount(int i) {
        this.thirdPartyWireAccountCount.setValue(this, $$delegatedProperties[3], Integer.valueOf(i));
    }

    public final WiresContext getWiresContext$feature_wires_externalDebug() {
        return (WiresContext) this.wiresContext.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WiresContext wiresContext_delegate$lambda$0(WiresActivity wiresActivity) {
        Companion companion = INSTANCE;
        return new WiresContext(((Wires) companion.getExtras((Activity) wiresActivity)).getDirection(), ((Wires) companion.getExtras((Activity) wiresActivity)).getEntryPoint(), null, null, 12, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, WiresLoadingFragment.INSTANCE.newInstance(INSTANCE.getExtras((Activity) this)));
        }
        Observable observableRefCount = ExperimentsProvider.DefaultImpls.streamState$default(getExperimentsStore(), new Experiment[]{OutgoingWiresRevampKillswitch.INSTANCE}, false, null, 6, null).replay(1).refCount();
        Intrinsics.checkNotNullExpressionValue(observableRefCount, "refCount(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableRefCount), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.wires.ui.WiresActivity$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WiresActivity.onCreate$lambda$1(this.f$0, (Boolean) obj);
            }
        });
        Observable observableSwitchMap = observableRefCount.switchMap(new Function() { // from class: com.robinhood.android.wires.ui.WiresActivity.onCreate.2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends List<TransferAccount>> apply(Boolean isOutgoingWiresRevampEnabled) {
                Intrinsics.checkNotNullParameter(isOutgoingWiresRevampEnabled, "isOutgoingWiresRevampEnabled");
                if (isOutgoingWiresRevampEnabled.booleanValue()) {
                    return WiresActivity.this.getTransferWireAccountStore().streamOutgoingWiresAccountByRecipientType(RecipientType.FIRST_PARTY);
                }
                return TransfersBonfireApi.DefaultImpls.getTransferAccountsSingle$default(WiresActivity.this.getTransfersBonfireApi(), false, null, TransferType.OUTGOING_WIRE, 3, null).map(new Function() { // from class: com.robinhood.android.wires.ui.WiresActivity.onCreate.2.1
                    @Override // io.reactivex.functions.Function
                    public final List<TransferAccount> apply(ApiTransferAccountsResponse response) {
                        Intrinsics.checkNotNullParameter(response, "response");
                        List<ApiTransferAccount> results = response.getResults();
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(results, 10));
                        Iterator<T> it = results.iterator();
                        while (it.hasNext()) {
                            arrayList.add(TransferAccount6.toDbModel((ApiTransferAccount) it.next()));
                        }
                        return arrayList;
                    }
                }).toObservable();
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableSwitchMap), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.wires.ui.WiresActivity$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WiresActivity.onCreate$lambda$4(this.f$0, (List) obj);
            }
        });
        Observable observableSwitchMap2 = observableRefCount.switchMap(new Function() { // from class: com.robinhood.android.wires.ui.WiresActivity.onCreate.4
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends List<TransferAccount>> apply(Boolean isOutgoingWiresRevampEnabled) {
                Intrinsics.checkNotNullParameter(isOutgoingWiresRevampEnabled, "isOutgoingWiresRevampEnabled");
                if (isOutgoingWiresRevampEnabled.booleanValue()) {
                    return WiresActivity.this.getTransferWireAccountStore().streamOutgoingWiresAccountByRecipientType(RecipientType.THIRD_PARTY_OTHERS);
                }
                Observable observableJust = Observable.just(CollectionsKt.emptyList());
                Intrinsics.checkNotNull(observableJust);
                return observableJust;
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap2, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableSwitchMap2), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.wires.ui.WiresActivity$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WiresActivity.onCreate$lambda$7(this.f$0, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(WiresActivity wiresActivity, Boolean bool) {
        Intrinsics.checkNotNull(bool);
        wiresActivity.isOutgoingWiresRevampEnabled = bool.booleanValue();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$4(WiresActivity wiresActivity, List list) {
        Intrinsics.checkNotNull(list);
        List list2 = list;
        Iterator it = list2.iterator();
        int i = 0;
        Object obj = null;
        boolean z = false;
        while (true) {
            if (!it.hasNext()) {
                if (!z) {
                    break;
                }
            } else {
                Object next = it.next();
                if (((TransferAccount) next).getType() == ApiTransferAccount.TransferAccountType.OUTGOING_WIRE_ACCOUNT) {
                    if (z) {
                        break;
                    }
                    z = true;
                    obj = next;
                }
            }
        }
        obj = null;
        TransferAccount transferAccount = (TransferAccount) obj;
        wiresActivity.setFirstPartyWireAccountId(transferAccount != null ? transferAccount.getAccountId() : null);
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                if (((TransferAccount) it2.next()).getType() == ApiTransferAccount.TransferAccountType.OUTGOING_WIRE_ACCOUNT && (i = i + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        wiresActivity.setFirstPartyWireAccountCount(i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$7(WiresActivity wiresActivity, List list) {
        Intrinsics.checkNotNull(list);
        List list2 = list;
        Iterator it = list2.iterator();
        int i = 0;
        Object obj = null;
        boolean z = false;
        while (true) {
            if (!it.hasNext()) {
                if (!z) {
                    break;
                }
            } else {
                Object next = it.next();
                if (((TransferAccount) next).getType() == ApiTransferAccount.TransferAccountType.OUTGOING_WIRE_ACCOUNT) {
                    if (z) {
                        break;
                    }
                    z = true;
                    obj = next;
                }
            }
        }
        obj = null;
        TransferAccount transferAccount = (TransferAccount) obj;
        wiresActivity.setThirdPartyWireAccountId(transferAccount != null ? transferAccount.getAccountId() : null);
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                if (((TransferAccount) it2.next()).getType() == ApiTransferAccount.TransferAccountType.OUTGOING_WIRE_ACCOUNT && (i = i + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        wiresActivity.setThirdPartyWireAccountCount(i);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (getSupportFragmentManager().getFragments().size() <= 2) {
            finish();
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.robinhood.android.wires.ui.WiresLoadingFragment.Callbacks
    public void onLoadInvalidAccountContent(String screenIdentifier, ApiWireDetailsContent.InvalidAccountContent invalidAccountContent) {
        Intrinsics.checkNotNullParameter(screenIdentifier, "screenIdentifier");
        Intrinsics.checkNotNullParameter(invalidAccountContent, "invalidAccountContent");
        replaceFragment(WiresInvalidAccountContentFragment.INSTANCE.newInstance((Parcelable) new WiresInvalidAccountContentFragment.Args(screenIdentifier, invalidAccountContent)));
    }

    @Override // com.robinhood.android.wires.ui.WiresLoadingFragment.Callbacks
    public void onLoadPreselectedContent(ApiWireDetailsContent.WireDetailsContent wireDetailsContent) {
        Intrinsics.checkNotNullParameter(wireDetailsContent, "wireDetailsContent");
        int i = WhenMappings.$EnumSwitchMapping$0[((Wires) INSTANCE.getExtras((Activity) this)).getDirection().ordinal()];
        if (i == 1) {
            ApiIncomingWireContent incoming_wire = wireDetailsContent.getIncoming_wire();
            Intrinsics.checkNotNull(incoming_wire);
            showIncomingWireDetails(incoming_wire);
        } else if (i == 2) {
            handleFirstPartyOutgoingWire();
        } else {
            if (i == 3) {
                throw new IllegalStateException("Unexpectedly called with unspecified direction");
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // com.robinhood.android.wires.ui.WiresLoadingFragment.Callbacks
    public void onLoadWireTypeSelection(ApiWireDetailsContent.WireDetailsContent incomingContent) {
        Intrinsics.checkNotNullParameter(incomingContent, "incomingContent");
        replaceFragmentWithoutAnimation(WiresDirectionSelectionFragment.INSTANCE.newInstance((Parcelable) new WiresDirectionSelectionFragment.Args(incomingContent)));
    }

    @Override // com.robinhood.android.wires.ui.WiresDirectionSelectionFragment.Callbacks
    public void onIncomingWiresRowClicked(ApiWireDetailsContent.WireDetailsContent incomingContent) {
        Intrinsics.checkNotNullParameter(incomingContent, "incomingContent");
        ApiIncomingWireContent incoming_wire = incomingContent.getIncoming_wire();
        Intrinsics.checkNotNull(incoming_wire);
        showIncomingWireDetails(incoming_wire);
    }

    @Override // com.robinhood.android.wires.ui.WiresDirectionSelectionFragment.Callbacks
    public void onOutgoingWiresRowClicked(ApiOutgoingWireContent.ApiOutgoingWireDetails.LinkAccountDetails linkAccountDetails) {
        handleFirstPartyOutgoingWire();
    }

    @Override // com.robinhood.android.wires.ui.WiresDirectionSelectionFragment.Callbacks
    public void onOutgoingWiresRowThirdPartyHomeClosingClicked(ApiOutgoingWireContent.ApiOutgoingWireDetails.LinkAccountDetails linkAccountDetails) {
        handleThirdPartyWires(false);
    }

    @Override // com.robinhood.android.wires.ui.WiresDirectionSelectionFragment.Callbacks
    public void onGenericOutgoingWiresThirdPartyClicked() {
        handleThirdPartyWires(true);
    }

    @Override // com.robinhood.android.transfers.contracts.wires.WireAccountCreation.Callbacks
    public void onAccountCreated(DidLinkAccountRequestDto request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Navigator.DefaultImpls.startActivity$default(getNavigator(), this, new Transfer(new TransferConfiguration.OutgoingWire(new TransferConfiguration.TransferAccountSelection(null, false, ApiTransferAccount.TransferAccountType.RHS, 3, null), new TransferConfiguration.TransferAccountSelection(request.getInstrument_id(), false, ApiTransferAccount.TransferAccountType.OUTGOING_WIRE_ACCOUNT, 2, null), request.getRecipient_type() == RecipientTypeDto.RECIPIENT_TYPE_FIRST_PARTY, new WiresContext(WiresContext.WiresDirection.OUTGOING, WiresContext.EntryPoint.ENTRY_POINT_UNSPECIFIED, null, null, 12, null), null, null, RecipientType2.dtoToRecipientType(request.getRecipient_type()), request.getRecipient_type() == RecipientTypeDto.RECIPIENT_TYPE_THIRD_PARTY_OTHER ? new ThirdPartyOutgoingWiresInfo(request.getInstrument_id(), null, null, 6, null) : null, 48, null)), null, false, null, null, 60, null);
        finish();
    }

    @Override // com.robinhood.android.wires.ui.WiresLinkAccountFragment.Callbacks
    public void onAccountLinked() {
        startOutgoingWireTransfer();
    }

    private final void showIncomingWireDetails(final ApiIncomingWireContent content) {
        if (content.getShow_mib_non_originated_transfer_info()) {
            replaceFragment(Navigator.DefaultImpls.createFragment$default(getNavigator(), new AccountSpecificNonOriginatedTransferInfo(NonOriginatedTransferTypeDto.WIRE), null, 2, null));
        } else {
            ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, getAccountProvider().streamAllAccounts(), (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.wires.ui.WiresActivity$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return WiresActivity.showIncomingWireDetails$lambda$11(this.f$0, content, (List) obj);
                }
            }, new Function1() { // from class: com.robinhood.android.wires.ui.WiresActivity$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return WiresActivity.showIncomingWireDetails$lambda$12((Throwable) obj);
                }
            }, null, null, 12, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a3 A[EDGE_INSN: B:63:0x00a3->B:47:0x00a3 BREAK  A[LOOP:2: B:8:0x0019->B:64:?]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit showIncomingWireDetails$lambda$11(WiresActivity wiresActivity, ApiIncomingWireContent apiIncomingWireContent, List accounts2) {
        Iterator it;
        int i;
        Intrinsics.checkNotNullParameter(accounts2, "accounts");
        List list = accounts2;
        boolean z = list instanceof Collection;
        if (z && list.isEmpty()) {
            boolean z2 = false;
            if (z) {
                it = list.iterator();
                i = 0;
                while (it.hasNext()) {
                }
                if (i >= 2) {
                }
            }
        } else {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (((Account) it2.next()).getManagementType() == ManagementType.MANAGED) {
                    break;
                }
            }
            boolean z22 = false;
            if (z || !list.isEmpty()) {
                it = list.iterator();
                i = 0;
                while (it.hasNext()) {
                    if (((Account) it.next()).getBrokerageAccountType() == BrokerageAccountType.INDIVIDUAL && (i = i + 1) < 0) {
                        CollectionsKt.throwCountOverflow();
                    }
                }
            } else {
                i = 0;
            }
            if (i >= 2) {
                wiresActivity.replaceFragment(NonOriginatedAccountInfoFragment.INSTANCE.newInstance((Parcelable) new NonOriginatedAccountInfoFragment.Args(NonOriginatedTransferTypeDto.WIRE, CurrencyDto.USD, null, null, 12, null)));
            } else {
                if (!z || !list.isEmpty()) {
                    Iterator it3 = list.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        String nickname = ((Account) it3.next()).getNickname();
                        if (!(nickname == null || nickname.length() == 0)) {
                            z22 = true;
                            break;
                        }
                    }
                }
                if (!z22) {
                    wiresActivity.replaceFragment(WiresVanDetailsFragment.INSTANCE.newInstance((Parcelable) new WiresVanDetailsFragment.Args(apiIncomingWireContent)));
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showIncomingWireDetails$lambda$12(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, it, true, null, 4, null);
        return Unit.INSTANCE;
    }

    private final void handleFirstPartyOutgoingWire() {
        if (getFirstPartyWireAccountCount() >= 1) {
            TransferConfiguration.TransferAccountSelection transferAccountSelection = new TransferConfiguration.TransferAccountSelection(null, false, ApiTransferAccount.TransferAccountType.RHS, 3, null);
            String firstPartyWireAccountId = getFirstPartyWireAccountId();
            Navigator.DefaultImpls.startActivity$default(getNavigator(), this, new Transfer(new TransferConfiguration.OutgoingWire(transferAccountSelection, firstPartyWireAccountId != null ? new TransferConfiguration.TransferAccountSelection(firstPartyWireAccountId, false, ApiTransferAccount.TransferAccountType.OUTGOING_WIRE_ACCOUNT, 2, null) : null, true, new WiresContext(WiresContext.WiresDirection.OUTGOING, WiresContext.EntryPoint.ENTRY_POINT_UNSPECIFIED, null, null, 12, null), null, null, this.isOutgoingWiresRevampEnabled ? RecipientType.FIRST_PARTY : null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE, null)), null, false, null, null, 60, null);
        } else if (this.isOutgoingWiresRevampEnabled) {
            replaceFragment(Navigator.DefaultImpls.createFragment$default(getNavigator(), new WireAccountCreation(RecipientType.FIRST_PARTY), null, 2, null));
        } else {
            Navigator.DefaultImpls.startActivity$default(getNavigator(), this, new WireRoutingDetailsInputActivityIntentKey(null, getWiresContext$feature_wires_externalDebug(), false, 4, null), null, false, null, null, 60, null);
            finish();
        }
    }

    private final void handleThirdPartyWires(boolean useGenericMode) {
        if (this.isOutgoingWiresRevampEnabled && useGenericMode) {
            RecipientType recipientType = null;
            if (getThirdPartyWireAccountCount() < 1) {
                replaceFragment(Navigator.DefaultImpls.createFragment$default(getNavigator(), new WireAccountCreation(RecipientType.THIRD_PARTY_OTHERS), null, 2, null));
                return;
            }
            TransferConfiguration.TransferAccountSelection transferAccountSelection = new TransferConfiguration.TransferAccountSelection(null, false, ApiTransferAccount.TransferAccountType.RHS, 3, null);
            String thirdPartyWireAccountId = getThirdPartyWireAccountId();
            TransferConfiguration.TransferAccountSelection transferAccountSelection2 = thirdPartyWireAccountId != null ? new TransferConfiguration.TransferAccountSelection(thirdPartyWireAccountId, false, ApiTransferAccount.TransferAccountType.OUTGOING_WIRE_ACCOUNT, 2, null) : null;
            WiresContext wiresContext = new WiresContext(WiresContext.WiresDirection.OUTGOING, WiresContext.EntryPoint.ENTRY_POINT_UNSPECIFIED, null, null, 12, null);
            if (this.isOutgoingWiresRevampEnabled) {
                if (useGenericMode) {
                    recipientType = RecipientType.THIRD_PARTY_OTHERS;
                } else {
                    recipientType = RecipientType.THIRD_PARTY_HOME_CLOSING;
                }
            }
            Navigator.DefaultImpls.startActivity$default(getNavigator(), this, new Transfer(new TransferConfiguration.OutgoingWire(transferAccountSelection, transferAccountSelection2, false, wiresContext, null, null, recipientType, new ThirdPartyOutgoingWiresInfo(getThirdPartyWireAccountId(), null, null, 6, null), 48, null)), null, false, null, null, 60, null);
            return;
        }
        replaceFragment(WiresThirdPartyFragment.INSTANCE.createFragment((FragmentKey) new ThirdPartyWireKey(useGenericMode)));
    }

    private final void startOutgoingWireTransfer() {
        startActivity(Navigator.DefaultImpls.createIntent$default(getNavigator(), this, new Transfer(new TransferConfiguration.OutgoingWire(null, null, false, getWiresContext$feature_wires_externalDebug(), null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE, null)), null, false, 12, null));
        finish();
    }

    /* compiled from: WiresActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/wires/ui/WiresActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/wires/ui/WiresActivity;", "Lcom/robinhood/android/transfers/contracts/Wires;", "<init>", "()V", "feature-wires_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<WiresActivity, Wires> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public Wires getExtras(WiresActivity wiresActivity) {
            return (Wires) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, wiresActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, Wires wires) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, wires);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, Wires wires) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, wires);
        }
    }

    @Override // com.robinhood.lib.transfers.nonoriginated.NonOriginatedAccountInfoFragment.Callbacks
    public void showConfirmation(StandardScreenDataDto screenData) {
        Intrinsics.checkNotNullParameter(screenData, "screenData");
        finish();
    }

    @Override // com.robinhood.lib.transfers.nonoriginated.NonOriginatedAccountInfoFragment.Callbacks
    public void exitNonOriginatedAccountInfo() {
        finish();
    }
}
