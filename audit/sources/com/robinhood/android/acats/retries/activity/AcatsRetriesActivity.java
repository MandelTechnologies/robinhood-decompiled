package com.robinhood.android.acats.retries.activity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.robinhood.android.acats.contracts.AcatsRetriesIntentKey;
import com.robinhood.android.acats.retries.AcatsRetriesEvents;
import com.robinhood.android.acats.retries.fragment.AcatsRetriesFragmentContract;
import com.robinhood.android.acatsin.accountnumber.AcatsInAccountNumberContract;
import com.robinhood.android.acatsin.agreement.AcatsInAgreementContract;
import com.robinhood.android.acatsin.asset.AcatsInReviewAssetsContract;
import com.robinhood.android.acatsin.availabledestinations.AcatsInAvailableDestinationsContract;
import com.robinhood.android.acatsin.confirmation.AcatsInConfirmationContract;
import com.robinhood.android.acatsin.partials.AcatsInPartialTransferParentContract;
import com.robinhood.android.acatsin.partials.UiAcatsAsset;
import com.robinhood.android.acatsin.util.AcatsFlowStep2;
import com.robinhood.android.acatsin.util.AcatsInScreenContext;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.C11839R;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.databinding.ActivityFragmentContainerWithRdsLoadingViewBinding;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.history.contracts.DetailType;
import com.robinhood.android.history.contracts.LegacyDetailFragmentKey;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.AcatsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.models.acats.p299db.bonfire.AvailableAccount;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.bonfire.ApiAcatsAccountContentsResponse;
import com.robinhood.models.api.bonfire.ApiAcatsTransfer;
import com.robinhood.models.api.bonfire.ApiBrokerage;
import com.robinhood.models.p355ui.UiSlipAgreements;
import com.robinhood.utils.Either;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.ExceptionsH;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: AcatsRetriesActivity.kt */
@Metadata(m3635d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 P2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t:\u0001PB\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0014J\b\u0010\"\u001a\u00020\u001fH\u0016J \u0010#\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020(H\u0016J\u0012\u0010)\u001a\u00020\u001f2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\u0010\u0010,\u001a\u00020\u001f2\u0006\u0010-\u001a\u00020.H\u0002J\u0016\u0010/\u001a\u00020\u001f2\f\u00100\u001a\b\u0012\u0004\u0012\u00020201H\u0016J\u0016\u00103\u001a\u00020\u001f2\f\u00100\u001a\b\u0012\u0004\u0012\u00020201H\u0016J\u0010\u00104\u001a\u00020\u001f2\u0006\u00105\u001a\u000206H\u0016J\u0010\u00107\u001a\u00020\u001f2\u0006\u00108\u001a\u00020%H\u0016J\u0010\u00109\u001a\u00020\u001f2\u0006\u0010:\u001a\u00020%H\u0016J<\u0010;\u001a\u00020\u001f2\f\u00100\u001a\b\u0012\u0004\u0012\u000202012\b\u0010&\u001a\u0004\u0018\u00010%2\b\u0010:\u001a\u0004\u0018\u00010%2\b\u0010<\u001a\u0004\u0018\u00010=2\u0006\u0010'\u001a\u00020(H\u0016J\b\u0010>\u001a\u00020\u001fH\u0016J\u0010\u0010?\u001a\u00020\u001f2\u0006\u0010@\u001a\u00020AH\u0016J\u0010\u0010B\u001a\u00020\u001f2\u0006\u0010C\u001a\u00020DH\u0016J\u0018\u0010E\u001a\u00020\u001f2\u000e\u0010F\u001a\n\u0012\u0004\u0012\u00020G\u0018\u000101H\u0016J\b\u0010H\u001a\u00020\u001fH\u0016J\t\u0010I\u001a\u00020JH\u0096\u0001R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0018\u0010K\u001a\b\u0012\u0004\u0012\u00020M0LX\u0096\u0005¢\u0006\u0006\u001a\u0004\bN\u0010O¨\u0006Q"}, m3636d2 = {"Lcom/robinhood/android/acats/retries/activity/AcatsRetriesActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/acats/retries/fragment/AcatsRetriesFragmentContract$Callbacks;", "Lcom/robinhood/android/acatsin/accountnumber/AcatsInAccountNumberContract$Callbacks;", "Lcom/robinhood/android/acatsin/availabledestinations/AcatsInAvailableDestinationsContract$Callbacks;", "Lcom/robinhood/android/acatsin/confirmation/AcatsInConfirmationContract$Callbacks;", "Lcom/robinhood/android/acatsin/partials/AcatsInPartialTransferParentContract$Callbacks;", "Lcom/robinhood/android/acatsin/asset/AcatsInReviewAssetsContract$Callbacks;", "Lcom/robinhood/android/acatsin/agreement/AcatsInAgreementContract$Callbacks;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "bindings", "Lcom/robinhood/android/common/ui/databinding/ActivityFragmentContainerWithRdsLoadingViewBinding;", "getBindings", "()Lcom/robinhood/android/common/ui/databinding/ActivityFragmentContainerWithRdsLoadingViewBinding;", "bindings$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/acats/retries/activity/AcatsRetriesDuxo;", "getDuxo", "()Lcom/robinhood/android/acats/retries/activity/AcatsRetriesDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "activityViewStateStore", "Lcom/robinhood/android/acats/retries/activity/AcatsRetriesActivityStore;", "getActivityViewStateStore", "()Lcom/robinhood/android/acats/retries/activity/AcatsRetriesActivityStore;", "setActivityViewStateStore", "(Lcom/robinhood/android/acats/retries/activity/AcatsRetriesActivityStore;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "submitRetry", "showAgreement", "dtcNumber", "", "rhsAccountNumber", "screenContext", "Lcom/robinhood/android/acatsin/util/AcatsInScreenContext;", "rowClicked", "action", "Lcom/robinhood/models/api/bonfire/ApiAcatsTransfer$AcatRetryStep;", "handleDuxoEvent", "event", "Lcom/robinhood/android/acats/retries/AcatsRetriesEvents;", "onBuildPartialTransferComplete", "assets", "", "Lcom/robinhood/android/acatsin/partials/UiAcatsAsset;", "onAcatsRetryAssetVerified", "onRhsAccountSelected", "account", "Lcom/robinhood/models/acats/db/bonfire/AvailableAccount;", "onDeeplinkSelected", "deeplink", "onAccountNumberEntered", "accountNumber", "onAcatsRetryEditClicked", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "onConfirmationDoneClicked", "onViewDetailsClicked", "acatsTransferId", "Ljava/util/UUID;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onSlipAgreementsUpdated", "slipAgreements", "Lcom/robinhood/models/ui/UiSlipAgreements$Agreement;", "onAgreementAccepted", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-acats-retries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AcatsRetriesActivity extends BaseActivity implements AcatsRetriesFragmentContract.Callbacks, AcatsInAccountNumberContract.Callbacks, AcatsInAvailableDestinationsContract.Callbacks, AcatsInConfirmationContract.Callbacks, AcatsInPartialTransferParentContract.Callbacks, AcatsInReviewAssetsContract.Callbacks, AcatsInAgreementContract.Callbacks, RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0;
    public AcatsRetriesActivityStore activityViewStateStore;

    /* renamed from: bindings$delegate, reason: from kotlin metadata */
    private final Interfaces2 bindings;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AcatsRetriesActivity.class, "bindings", "getBindings()Lcom/robinhood/android/common/ui/databinding/ActivityFragmentContainerWithRdsLoadingViewBinding;", 0))};

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

    @Override // com.robinhood.android.acatsin.agreement.AcatsInAgreementContract.Callbacks
    public AcatsInAgreementContract.Key buildAgreementContract(String str, AcatsInScreenContext acatsInScreenContext, Either<ApiBrokerage, String> either, boolean z, AcatsFlowStep2 acatsFlowStep2, UUID uuid) {
        return AcatsInAgreementContract.Callbacks.DefaultImpls.buildAgreementContract(this, str, acatsInScreenContext, either, z, acatsFlowStep2, uuid);
    }

    public AcatsRetriesActivity() {
        super(C11839R.layout.activity_fragment_container_with_rds_loading_view);
        this.$$delegate_0 = new RegionGated2(AcatsRegionGate.INSTANCE);
        this.bindings = ViewBinding5.viewBinding(this, AcatsRetriesActivity2.INSTANCE);
        this.duxo = DuxosKt.duxo(this, AcatsRetriesDuxo.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ActivityFragmentContainerWithRdsLoadingViewBinding getBindings() {
        Object value = this.bindings.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ActivityFragmentContainerWithRdsLoadingViewBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AcatsRetriesDuxo getDuxo() {
        return (AcatsRetriesDuxo) this.duxo.getValue();
    }

    public final AcatsRetriesActivityStore getActivityViewStateStore() {
        AcatsRetriesActivityStore acatsRetriesActivityStore = this.activityViewStateStore;
        if (acatsRetriesActivityStore != null) {
            return acatsRetriesActivityStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("activityViewStateStore");
        return null;
    }

    public final void setActivityViewStateStore(AcatsRetriesActivityStore acatsRetriesActivityStore) {
        Intrinsics.checkNotNullParameter(acatsRetriesActivityStore, "<set-?>");
        this.activityViewStateStore = acatsRetriesActivityStore;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        BaseActivity.collectDuxoState$default(this, null, new C76621(null), 1, null);
        ShimmerLoadingView shimmerLoadingView = getBindings().rdsLoadingView;
        Intrinsics.checkNotNull(shimmerLoadingView);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(shimmerLoadingView, InsetSides.INSTANCE.m26678getAllXedK2Rk());
        shimmerLoadingView.show();
        BaseActivity.collectDuxoState$default(this, null, new C76633(null), 1, null);
        BaseActivity.collectDuxoState$default(this, null, new C76644(null), 1, null);
    }

    /* compiled from: AcatsRetriesActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acats.retries.activity.AcatsRetriesActivity$onCreate$1", m3645f = "AcatsRetriesActivity.kt", m3646l = {66}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acats.retries.activity.AcatsRetriesActivity$onCreate$1 */
    static final class C76621 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C76621(Continuation<? super C76621> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AcatsRetriesActivity.this.new C76621(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C76621) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Event<AcatsRetriesEvents>> eventFlow = AcatsRetriesActivity.this.getDuxo().getEventFlow();
                final AcatsRetriesActivity acatsRetriesActivity = AcatsRetriesActivity.this;
                FlowCollector<? super Event<AcatsRetriesEvents>> flowCollector = new FlowCollector() { // from class: com.robinhood.android.acats.retries.activity.AcatsRetriesActivity.onCreate.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Event<AcatsRetriesEvents>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(final Event<AcatsRetriesEvents> event, Continuation<? super Unit> continuation) {
                        EventConsumer<AcatsRetriesEvents> eventConsumerInvoke;
                        if (event != null) {
                            final AcatsRetriesActivity acatsRetriesActivity2 = acatsRetriesActivity;
                            if ((event.getData() instanceof AcatsRetriesEvents) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                                eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.acats.retries.activity.AcatsRetriesActivity$onCreate$1$1$emit$$inlined$consumeIfType$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                        m10675invoke(obj2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m10675invoke(Object it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        acatsRetriesActivity2.handleDuxoEvent((AcatsRetriesEvents) event.getData());
                                    }
                                });
                            }
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (eventFlow.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new ExceptionsH();
        }
    }

    /* compiled from: AcatsRetriesActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acats.retries.activity.AcatsRetriesActivity$onCreate$3", m3645f = "AcatsRetriesActivity.kt", m3646l = {83}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.acats.retries.activity.AcatsRetriesActivity$onCreate$3 */
    static final class C76633 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C76633(Continuation<? super C76633> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AcatsRetriesActivity.this.new C76633(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C76633) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final Flow flowFilterNotNull = FlowKt.filterNotNull(AcatsRetriesActivity.this.getDuxo().getStateFlow());
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<AcatsRetriesViewState>() { // from class: com.robinhood.android.acats.retries.activity.AcatsRetriesActivity$onCreate$3$invokeSuspend$$inlined$filter$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.acats.retries.activity.AcatsRetriesActivity$onCreate$3$invokeSuspend$$inlined$filter$1$2 */
                    public static final class C76602<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.acats.retries.activity.AcatsRetriesActivity$onCreate$3$invokeSuspend$$inlined$filter$1$2", m3645f = "AcatsRetriesActivity.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.acats.retries.activity.AcatsRetriesActivity$onCreate$3$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            Object L$1;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return C76602.this.emit(null, this);
                            }
                        }

                        public C76602(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            }
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                if (((AcatsRetriesViewState) obj).isReady()) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super AcatsRetriesViewState> flowCollector, Continuation continuation) {
                        Object objCollect = flowFilterNotNull.collect(new C76602(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                });
                final AcatsRetriesActivity acatsRetriesActivity = AcatsRetriesActivity.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.acats.retries.activity.AcatsRetriesActivity.onCreate.3.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((AcatsRetriesViewState) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(AcatsRetriesViewState acatsRetriesViewState, Continuation<? super Unit> continuation) {
                        acatsRetriesActivity.getBindings().rdsLoadingView.hide();
                        Object objUpdateViewState = acatsRetriesActivity.getActivityViewStateStore().updateViewState(acatsRetriesViewState, continuation);
                        return objUpdateViewState == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objUpdateViewState : Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowDistinctUntilChanged.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: AcatsRetriesActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acats.retries.activity.AcatsRetriesActivity$onCreate$4", m3645f = "AcatsRetriesActivity.kt", m3646l = {93}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.acats.retries.activity.AcatsRetriesActivity$onCreate$4 */
    static final class C76644 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C76644(Continuation<? super C76644> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AcatsRetriesActivity.this.new C76644(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C76644) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final Flow flowFilterNotNull = FlowKt.filterNotNull(AcatsRetriesActivity.this.getDuxo().getStateFlow());
                Flow flowTake = FlowKt.take(new Flow<AcatsRetriesViewState>() { // from class: com.robinhood.android.acats.retries.activity.AcatsRetriesActivity$onCreate$4$invokeSuspend$$inlined$filter$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.acats.retries.activity.AcatsRetriesActivity$onCreate$4$invokeSuspend$$inlined$filter$1$2 */
                    public static final class C76612<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.acats.retries.activity.AcatsRetriesActivity$onCreate$4$invokeSuspend$$inlined$filter$1$2", m3645f = "AcatsRetriesActivity.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.acats.retries.activity.AcatsRetriesActivity$onCreate$4$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            Object L$1;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return C76612.this.emit(null, this);
                            }
                        }

                        public C76612(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            }
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                if (((AcatsRetriesViewState) obj).isReady()) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super AcatsRetriesViewState> flowCollector, Continuation continuation) {
                        Object objCollect = flowFilterNotNull.collect(new C76612(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                }, 1);
                final AcatsRetriesActivity acatsRetriesActivity = AcatsRetriesActivity.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.acats.retries.activity.AcatsRetriesActivity.onCreate.4.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((AcatsRetriesViewState) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(AcatsRetriesViewState acatsRetriesViewState, Continuation<? super Unit> continuation) {
                        AcatsRetriesActivity acatsRetriesActivity2 = acatsRetriesActivity;
                        acatsRetriesActivity2.replaceFragmentWithoutAnimation(Navigator.DefaultImpls.createFragment$default(acatsRetriesActivity2.getNavigator(), new AcatsRetriesFragmentContract.Key(acatsRetriesViewState.getScreenContext().toEventContext()), null, 2, null));
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowTake.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.acats.retries.fragment.AcatsRetriesFragmentContract.Callbacks
    public void submitRetry() {
        getDuxo().submitRetry();
    }

    @Override // com.robinhood.android.acats.retries.fragment.AcatsRetriesFragmentContract.Callbacks
    public void showAgreement(String dtcNumber, String rhsAccountNumber, AcatsInScreenContext screenContext) {
        Intrinsics.checkNotNullParameter(dtcNumber, "dtcNumber");
        Intrinsics.checkNotNullParameter(rhsAccountNumber, "rhsAccountNumber");
        Intrinsics.checkNotNullParameter(screenContext, "screenContext");
        replaceFragment(Navigator.DefaultImpls.createFragment$default(getNavigator(), AcatsInAgreementContract.Callbacks.DefaultImpls.buildAgreementContract$default(this, rhsAccountNumber, screenContext, new Either.Right(dtcNumber), true, null, null, 48, null), null, 2, null));
    }

    @Override // com.robinhood.android.acats.retries.fragment.AcatsRetriesFragmentContract.Callbacks
    public void rowClicked(ApiAcatsTransfer.AcatRetryStep action) {
        getDuxo().rowClicked(action);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleDuxoEvent(AcatsRetriesEvents event) {
        if (event instanceof AcatsRetriesEvents.FragmentLauncher) {
            replaceFragment(Navigator.DefaultImpls.createFragment$default(getNavigator(), ((AcatsRetriesEvents.FragmentLauncher) event).getKey(), null, 2, null));
        } else if (event instanceof AcatsRetriesEvents.TransferSubmit.TransferSubmitError) {
            AbsErrorHandler.handleError$default(getActivityErrorHandler(), ((AcatsRetriesEvents.TransferSubmit.TransferSubmitError) event).getError(), false, 2, null);
        }
    }

    @Override // com.robinhood.android.acatsin.partials.AcatsInPartialTransferParentContract.Callbacks
    public void onBuildPartialTransferComplete(List<? extends UiAcatsAsset> assets) {
        Intrinsics.checkNotNullParameter(assets, "assets");
        getDuxo().updateAssets(assets);
        popFragments(2);
    }

    @Override // com.robinhood.android.acatsin.asset.AcatsInReviewAssetsContract.Callbacks
    public void onAcatsRetryAssetVerified(List<? extends UiAcatsAsset> assets) {
        Intrinsics.checkNotNullParameter(assets, "assets");
        getDuxo().updateAssets(assets);
        popLastFragment();
    }

    @Override // com.robinhood.android.acatsin.availabledestinations.AcatsInAvailableDestinationsContract.Callbacks
    public void onRhsAccountSelected(AvailableAccount account) {
        Intrinsics.checkNotNullParameter(account, "account");
        getDuxo().updateAccountTitle(account);
        popLastFragment();
    }

    @Override // com.robinhood.android.acatsin.availabledestinations.AcatsInAvailableDestinationsContract.Callbacks
    public void onDeeplinkSelected(String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Navigator.DefaultImpls.handleDeepLink$default(getNavigator(), this, Uri.parse(deeplink), null, null, false, null, 60, null);
    }

    @Override // com.robinhood.android.acatsin.accountnumber.AcatsInAccountNumberContract.Callbacks
    public void onAccountNumberEntered(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        getDuxo().updateAccountNumber(accountNumber);
        popLastFragment();
    }

    @Override // com.robinhood.android.acatsin.asset.AcatsInReviewAssetsContract.Callbacks
    public void onAcatsRetryEditClicked(List<? extends UiAcatsAsset> assets, String rhsAccountNumber, String accountNumber, BrokerageAccountType brokerageAccountType, AcatsInScreenContext screenContext) {
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(screenContext, "screenContext");
        replaceFragment(Navigator.DefaultImpls.createFragment$default(getNavigator(), new AcatsInPartialTransferParentContract.Key(screenContext, new Either.Right(""), rhsAccountNumber, accountNumber, brokerageAccountType, null, CollectionsKt.toSet(ApiAcatsAccountContentsResponse.SupportedContentType.getEntries()), null, assets, true, false, 1024, null), null, 2, null));
    }

    @Override // com.robinhood.android.acatsin.confirmation.AcatsInConfirmationContract.Callbacks
    public void onConfirmationDoneClicked() {
        finish();
    }

    @Override // com.robinhood.android.acatsin.confirmation.AcatsInConfirmationContract.Callbacks
    public void onViewDetailsClicked(UUID acatsTransferId) {
        Intrinsics.checkNotNullParameter(acatsTransferId, "acatsTransferId");
        finish();
        startActivity(Navigator.DefaultImpls.createIntentForFragment$default(getNavigator(), this, LegacyDetailFragmentKey.Companion.from$default(LegacyDetailFragmentKey.INSTANCE, DetailType.ACATS_TRANSFER, acatsTransferId, null, false, 12, null), false, false, false, null, false, false, false, false, false, null, false, 8188, null));
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.getToolbar().setNavigationIcon(C20690R.drawable.ic_rds_close_24dp);
    }

    @Override // com.robinhood.android.acatsin.agreement.AcatsInAgreementContract.Callbacks
    public void onSlipAgreementsUpdated(List<UiSlipAgreements.Agreement> slipAgreements) throws Exception {
        throw new Exception("onSlipAgreementsUpdated() should not be called in AcatsRetriesActivity");
    }

    @Override // com.robinhood.android.acatsin.agreement.AcatsInAgreementContract.Callbacks
    public void onAgreementAccepted() throws Exception {
        throw new Exception("onAgreementAccepted() should not be called in AcatsRetriesActivity");
    }

    /* compiled from: AcatsRetriesActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/acats/retries/activity/AcatsRetriesActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/acats/retries/activity/AcatsRetriesActivity;", "Lcom/robinhood/android/acats/contracts/AcatsRetriesIntentKey;", "<init>", "()V", "feature-acats-retries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<AcatsRetriesActivity, AcatsRetriesIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public AcatsRetriesIntentKey getExtras(AcatsRetriesActivity acatsRetriesActivity) {
            return (AcatsRetriesIntentKey) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, acatsRetriesActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, AcatsRetriesIntentKey acatsRetriesIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, acatsRetriesIntentKey);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, AcatsRetriesIntentKey acatsRetriesIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, acatsRetriesIntentKey);
        }
    }
}
