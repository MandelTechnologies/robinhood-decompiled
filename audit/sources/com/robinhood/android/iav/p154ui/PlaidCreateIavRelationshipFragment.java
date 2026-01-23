package com.robinhood.android.iav.p154ui;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.data.store.logging.utils.LoggingUtils4;
import com.robinhood.android.iav.C18470R;
import com.robinhood.android.transfers.contracts.transfercontext.CreateIavAccountData;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.IavAccount;
import com.robinhood.models.api.cashier.RhAccountType;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.IAVContext;
import com.robinhood.rosetta.eventlogging.NetworkContext;
import com.robinhood.rosetta.eventlogging.PlaidEventData;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.transfers.contracts.context.PlaidIavMetadata;
import com.robinhood.store.achrelationship.IavStore;
import com.robinhood.utils.extensions.SinglesAndroid;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;
import retrofit2.Response;

/* compiled from: PlaidCreateIavRelationshipFragment.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u0000 .2\u00020\u0001:\u0003,-.B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0010\u0010%\u001a\u00020 2\u0006\u0010&\u001a\u00020'H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00118B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010(\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/iav/ui/PlaidCreateIavRelationshipFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "iavStore", "Lcom/robinhood/store/achrelationship/IavStore;", "getIavStore", "()Lcom/robinhood/store/achrelationship/IavStore;", "setIavStore", "(Lcom/robinhood/store/achrelationship/IavStore;)V", "<set-?>", "", "requestCompleted", "getRequestCompleted", "()Z", "setRequestCompleted", "(Z)V", "requestCompleted$delegate", "Lkotlin/properties/ReadWriteProperty;", "callbacks", "Lcom/robinhood/android/iav/ui/PlaidCreateIavRelationshipFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/iav/ui/PlaidCreateIavRelationshipFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onDialogDismissed", "id", "", "screenDescription", "", "getScreenDescription", "()Ljava/lang/String;", "Callbacks", "Args", "Companion", "feature-iav_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class PlaidCreateIavRelationshipFragment extends BaseFragment {
    public AnalyticsLogger analytics;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    public IavStore iavStore;

    /* renamed from: requestCompleted$delegate, reason: from kotlin metadata */
    private final Interfaces3 requestCompleted;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(PlaidCreateIavRelationshipFragment.class, "requestCompleted", "getRequestCompleted()Z", 0)), Reflection.property1(new PropertyReference1Impl(PlaidCreateIavRelationshipFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/iav/ui/PlaidCreateIavRelationshipFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: PlaidCreateIavRelationshipFragment.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/iav/ui/PlaidCreateIavRelationshipFragment$Callbacks;", "", "onPlaidIavRelationshipCreated", "", "achRelationship", "Lcom/robinhood/models/db/AchRelationship;", "createIavAccountData", "Lcom/robinhood/android/transfers/contracts/transfercontext/CreateIavAccountData;", "isGoldBackupBillingMember", "", "feature-iav_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onPlaidIavRelationshipCreated(AchRelationship achRelationship, CreateIavAccountData createIavAccountData, boolean isGoldBackupBillingMember);
    }

    public PlaidCreateIavRelationshipFragment() {
        super(C18470R.layout.fragment_plaid_create_iav_relationship);
        this.requestCompleted = BindSavedState2.savedBoolean(this, false).provideDelegate(this, $$delegatedProperties[0]);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.iav.ui.PlaidCreateIavRelationshipFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
    }

    public final AnalyticsLogger getAnalytics() {
        AnalyticsLogger analyticsLogger = this.analytics;
        if (analyticsLogger != null) {
            return analyticsLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        return null;
    }

    public final void setAnalytics(AnalyticsLogger analyticsLogger) {
        Intrinsics.checkNotNullParameter(analyticsLogger, "<set-?>");
        this.analytics = analyticsLogger;
    }

    public final IavStore getIavStore() {
        IavStore iavStore = this.iavStore;
        if (iavStore != null) {
            return iavStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("iavStore");
        return null;
    }

    public final void setIavStore(IavStore iavStore) {
        Intrinsics.checkNotNullParameter(iavStore, "<set-?>");
        this.iavStore = iavStore;
    }

    private final boolean getRequestCompleted() {
        return ((Boolean) this.requestCompleted.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    private final void setRequestCompleted(boolean z) {
        this.requestCompleted.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z));
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (getRequestCompleted()) {
            return;
        }
        IavStore iavStore = getIavStore();
        Companion companion = INSTANCE;
        LifecycleHost.DefaultImpls.bind$default(this, SinglesAndroid.observeOnMainThread(iavStore.createAchRelationship(((Args) companion.getArgs((Fragment) this)).getAccessToken(), ((Args) companion.getArgs((Fragment) this)).getIavAccount().getIav_account_id(), null, ((Args) companion.getArgs((Fragment) this)).getRhAccountType(), ((Args) companion.getArgs((Fragment) this)).getPlaidIavMetadata(), new Function1() { // from class: com.robinhood.android.iav.ui.PlaidCreateIavRelationshipFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PlaidCreateIavRelationshipFragment.onViewCreated$lambda$0(this.f$0, (Response) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.iav.ui.PlaidCreateIavRelationshipFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PlaidCreateIavRelationshipFragment.onViewCreated$lambda$1(this.f$0, (Throwable) obj);
            }
        })), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.iav.ui.PlaidCreateIavRelationshipFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PlaidCreateIavRelationshipFragment.onViewCreated$lambda$2(this.f$0, (AchRelationship) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.iav.ui.PlaidCreateIavRelationshipFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PlaidCreateIavRelationshipFragment.onViewCreated$lambda$3(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventData onViewCreated$lambda$0(PlaidCreateIavRelationshipFragment plaidCreateIavRelationshipFragment, Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        String string2 = ExtensionsKt.getSessionId(plaidCreateIavRelationshipFragment).toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        IAVContext iAVContext = new IAVContext(null, string2, null, null, 13, null);
        NetworkContext networkContext = LoggingUtils4.toNetworkContext((Response<?>) response, NetworkContext.Tag.IAV_CREATE_RELATIONSHIP);
        Companion companion = INSTANCE;
        String institutionId = ((Args) companion.getArgs((Fragment) plaidCreateIavRelationshipFragment)).getPlaidIavMetadata().getInstitutionId();
        String str = institutionId == null ? "" : institutionId;
        String institutionName = ((Args) companion.getArgs((Fragment) plaidCreateIavRelationshipFragment)).getPlaidIavMetadata().getInstitutionName();
        String str2 = institutionName == null ? "" : institutionName;
        String linkSessionId = ((Args) companion.getArgs((Fragment) plaidCreateIavRelationshipFragment)).getPlaidIavMetadata().getLinkSessionId();
        return new UserInteractionEventData(UserInteractionEventData.EventType.NETWORK, null, null, null, new Context(0, 0, 0, null, null, null, null, Context.ProductTag.IAV, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, networkContext, new PlaidEventData(null, null, null, null, null, null, null, str, str2, null, linkSessionId == null ? "" : linkSessionId, null, null, null, null, null, null, null, null, null, 1047167, null), iAVContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -129, -57345, -1, -1, -1, -1, 16383, null), null, null, 110, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventData onViewCreated$lambda$1(PlaidCreateIavRelationshipFragment plaidCreateIavRelationshipFragment, Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        String string2 = ExtensionsKt.getSessionId(plaidCreateIavRelationshipFragment).toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        IAVContext iAVContext = new IAVContext(null, string2, null, null, 13, null);
        Companion companion = INSTANCE;
        String institutionId = ((Args) companion.getArgs((Fragment) plaidCreateIavRelationshipFragment)).getPlaidIavMetadata().getInstitutionId();
        String str = institutionId == null ? "" : institutionId;
        String institutionName = ((Args) companion.getArgs((Fragment) plaidCreateIavRelationshipFragment)).getPlaidIavMetadata().getInstitutionName();
        String str2 = institutionName == null ? "" : institutionName;
        String linkSessionId = ((Args) companion.getArgs((Fragment) plaidCreateIavRelationshipFragment)).getPlaidIavMetadata().getLinkSessionId();
        return new UserInteractionEventData(UserInteractionEventData.EventType.NETWORK, null, null, null, new Context(0, 0, 0, null, null, null, null, Context.ProductTag.IAV, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, LoggingUtils4.toNetworkContext(throwable, NetworkContext.Tag.IAV_CREATE_RELATIONSHIP), new PlaidEventData(null, null, null, null, null, null, null, str, str2, null, linkSessionId == null ? "" : linkSessionId, null, null, null, null, null, null, null, null, null, 1047167, null), iAVContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -129, -57345, -1, -1, -1, -1, 16383, null), null, null, 110, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2(PlaidCreateIavRelationshipFragment plaidCreateIavRelationshipFragment, AchRelationship achRelationship) {
        Intrinsics.checkNotNullParameter(achRelationship, "achRelationship");
        plaidCreateIavRelationshipFragment.setRequestCompleted(true);
        Callbacks callbacks = plaidCreateIavRelationshipFragment.getCallbacks();
        Companion companion = INSTANCE;
        callbacks.onPlaidIavRelationshipCreated(achRelationship, new CreateIavAccountData(((Args) companion.getArgs((Fragment) plaidCreateIavRelationshipFragment)).getAccessToken(), ((Args) companion.getArgs((Fragment) plaidCreateIavRelationshipFragment)).getIavAccount(), achRelationship.getBankAccountType()), ((Args) companion.getArgs((Fragment) plaidCreateIavRelationshipFragment)).getIsGoldBackupBillingMember());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3(PlaidCreateIavRelationshipFragment plaidCreateIavRelationshipFragment, Throwable throwable) throws Throwable {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        plaidCreateIavRelationshipFragment.setRequestCompleted(true);
        ActivityErrorHandler.Companion companion = ActivityErrorHandler.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = plaidCreateIavRelationshipFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        ActivityErrorHandler.Companion.handle$default(companion, fragmentActivityRequireActivity, throwable, true, false, 0, null, 56, null);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        if (id == C11048R.id.dialog_id_generic_error) {
            requireActivity().finish();
        } else {
            super.onDialogDismissed(id);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    /* renamed from: getScreenDescription */
    public String getProfileId() {
        Fragment fragmentRequireParentFragment = requireParentFragment();
        Intrinsics.checkNotNull(fragmentRequireParentFragment, "null cannot be cast to non-null type com.robinhood.android.iav.ui.PlaidConnectionFragment");
        return ((PlaidConnectionFragment) fragmentRequireParentFragment).getProfileId();
    }

    /* compiled from: PlaidCreateIavRelationshipFragment.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0017\u001a\u00020\u0018J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0018R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0016¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/iav/ui/PlaidCreateIavRelationshipFragment$Args;", "Landroid/os/Parcelable;", "accessToken", "", "iavAccount", "Lcom/robinhood/models/api/IavAccount;", PlaidExchangeTokenFragment.ARG_PLAID_IAV_METADATA, "Lcom/robinhood/shared/transfers/contracts/context/PlaidIavMetadata;", "rhAccountType", "Lcom/robinhood/models/api/cashier/RhAccountType;", "isGoldBackupBillingMember", "", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/api/IavAccount;Lcom/robinhood/shared/transfers/contracts/context/PlaidIavMetadata;Lcom/robinhood/models/api/cashier/RhAccountType;Z)V", "getAccessToken", "()Ljava/lang/String;", "getIavAccount", "()Lcom/robinhood/models/api/IavAccount;", "getPlaidIavMetadata", "()Lcom/robinhood/shared/transfers/contracts/context/PlaidIavMetadata;", "getRhAccountType", "()Lcom/robinhood/models/api/cashier/RhAccountType;", "()Z", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-iav_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String accessToken;
        private final IavAccount iavAccount;
        private final boolean isGoldBackupBillingMember;
        private final PlaidIavMetadata plaidIavMetadata;
        private final RhAccountType rhAccountType;

        /* compiled from: PlaidCreateIavRelationshipFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readString(), (IavAccount) parcel.readParcelable(Args.class.getClassLoader()), (PlaidIavMetadata) parcel.readParcelable(Args.class.getClassLoader()), RhAccountType.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accessToken);
            dest.writeParcelable(this.iavAccount, flags);
            dest.writeParcelable(this.plaidIavMetadata, flags);
            dest.writeString(this.rhAccountType.name());
            dest.writeInt(this.isGoldBackupBillingMember ? 1 : 0);
        }

        public Args(String accessToken, IavAccount iavAccount, PlaidIavMetadata plaidIavMetadata, RhAccountType rhAccountType, boolean z) {
            Intrinsics.checkNotNullParameter(accessToken, "accessToken");
            Intrinsics.checkNotNullParameter(iavAccount, "iavAccount");
            Intrinsics.checkNotNullParameter(plaidIavMetadata, "plaidIavMetadata");
            Intrinsics.checkNotNullParameter(rhAccountType, "rhAccountType");
            this.accessToken = accessToken;
            this.iavAccount = iavAccount;
            this.plaidIavMetadata = plaidIavMetadata;
            this.rhAccountType = rhAccountType;
            this.isGoldBackupBillingMember = z;
        }

        public final String getAccessToken() {
            return this.accessToken;
        }

        public final IavAccount getIavAccount() {
            return this.iavAccount;
        }

        public final PlaidIavMetadata getPlaidIavMetadata() {
            return this.plaidIavMetadata;
        }

        public final RhAccountType getRhAccountType() {
            return this.rhAccountType;
        }

        /* renamed from: isGoldBackupBillingMember, reason: from getter */
        public final boolean getIsGoldBackupBillingMember() {
            return this.isGoldBackupBillingMember;
        }
    }

    /* compiled from: PlaidCreateIavRelationshipFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/iav/ui/PlaidCreateIavRelationshipFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/iav/ui/PlaidCreateIavRelationshipFragment;", "Lcom/robinhood/android/iav/ui/PlaidCreateIavRelationshipFragment$Args;", "<init>", "()V", "feature-iav_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<PlaidCreateIavRelationshipFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(PlaidCreateIavRelationshipFragment plaidCreateIavRelationshipFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, plaidCreateIavRelationshipFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public PlaidCreateIavRelationshipFragment newInstance(Args args) {
            return (PlaidCreateIavRelationshipFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(PlaidCreateIavRelationshipFragment plaidCreateIavRelationshipFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, plaidCreateIavRelationshipFragment, args);
        }
    }
}
