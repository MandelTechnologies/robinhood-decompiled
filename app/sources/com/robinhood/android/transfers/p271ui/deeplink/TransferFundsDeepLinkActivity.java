package com.robinhood.android.transfers.p271ui.deeplink;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.C11839R;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract3;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.onboarding.contracts.OnboardingUpsellIntentKey;
import com.robinhood.android.transfers.contracts.CreateIavRelationshipIntentKey;
import com.robinhood.android.transfers.contracts.LinkingOptionsIntentKey;
import com.robinhood.android.transfers.contracts.TransferFundsDeepLink;
import com.robinhood.android.transfers.contracts.TransferResult;
import com.robinhood.android.transfers.contracts.TransferShim;
import com.robinhood.android.transfers.contracts.TransferShimContract;
import com.robinhood.android.transfers.contracts.UkQueuedDeposit;
import com.robinhood.android.transfers.p271ui.deeplink.TransferFundsDeepLinkViewState;
import com.robinhood.models.p320db.TransferDirection;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.rosetta.eventlogging.PaymentLinkingContext;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import com.robinhood.shared.transfers.contracts.context.IavSource;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.ExceptionsH;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: TransferFundsDeepLinkActivity.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 (2\u00020\u00012\u00020\u0002:\u0001(B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J\u0010\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"H\u0016J\"\u0010#\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\"2\b\u0010&\u001a\u0004\u0018\u00010'H\u0014R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR+\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R+\u0010\u0014\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0015\u0010\u000f\"\u0004\b\u0016\u0010\u0011R\u001a\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/deeplink/TransferFundsDeepLinkActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/common/ui/RhDialogFragment$OnDismissListener;", "<init>", "()V", "duxo", "Lcom/robinhood/android/transfers/ui/deeplink/TransferFundsDeepLinkDuxo;", "getDuxo", "()Lcom/robinhood/android/transfers/ui/deeplink/TransferFundsDeepLinkDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "<set-?>", "", "hasTransferLaunched", "getHasTransferLaunched", "()Z", "setHasTransferLaunched", "(Z)V", "hasTransferLaunched$delegate", "Lkotlin/properties/ReadWriteProperty;", "hasQueuedDepositsLaunched", "getHasQueuedDepositsLaunched", "setHasQueuedDepositsLaunched", "hasQueuedDepositsLaunched$delegate", "transferLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/robinhood/android/navigation/contracts/NavigationActivityResultContract$NavigationParams;", "Lcom/robinhood/android/transfers/contracts/TransferShim;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDialogDismissed", "id", "", "onActivityResult", "requestCode", "resultCode", WebsocketGatewayConstants.DATA_KEY, "Landroid/content/Intent;", "Companion", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class TransferFundsDeepLinkActivity extends BaseActivity implements RhDialogFragment.OnDismissListener {
    public static final int REQUEST_CODE_DCF_SIDE_BY_SIDE = 1000;
    public static final int REQUEST_CODE_QUEUED_DEPOSIT = 2000;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    /* renamed from: hasQueuedDepositsLaunched$delegate, reason: from kotlin metadata */
    private final Interfaces3 hasQueuedDepositsLaunched;

    /* renamed from: hasTransferLaunched$delegate, reason: from kotlin metadata */
    private final Interfaces3 hasTransferLaunched;
    private final ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<TransferShim>> transferLauncher;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(TransferFundsDeepLinkActivity.class, "hasTransferLaunched", "getHasTransferLaunched()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(TransferFundsDeepLinkActivity.class, "hasQueuedDepositsLaunched", "getHasQueuedDepositsLaunched()Z", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public TransferFundsDeepLinkActivity() {
        super(C11839R.layout.activity_rds_loading);
        this.duxo = DuxosKt.duxo(this, TransferFundsDeepLinkDuxo.class);
        Interfaces<Object, Interfaces3<Object, Boolean>> interfacesSavedBoolean = BindSavedState2.savedBoolean(this, false);
        KProperty<?>[] kPropertyArr = $$delegatedProperties;
        this.hasTransferLaunched = interfacesSavedBoolean.provideDelegate(this, kPropertyArr[0]);
        this.hasQueuedDepositsLaunched = BindSavedState2.savedBoolean(this, false).provideDelegate(this, kPropertyArr[1]);
        this.transferLauncher = registerForActivityResult(new TransferShimContract(new Function0() { // from class: com.robinhood.android.transfers.ui.deeplink.TransferFundsDeepLinkActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.getNavigator();
            }
        }), new ActivityResultCallback() { // from class: com.robinhood.android.transfers.ui.deeplink.TransferFundsDeepLinkActivity$transferLauncher$2
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(TransferResult transferResult) {
                if (transferResult instanceof TransferResult.Completed) {
                    if (((TransferFundsDeepLink) TransferFundsDeepLinkActivity.INSTANCE.getExtras((Activity) this.this$0)).getEntryPoint() == MAXTransferContext.EntryPoint.MENU_OF_OPTIONS) {
                        Navigator.DefaultImpls.startActivity$default(this.this$0.getNavigator(), this.this$0, new OnboardingUpsellIntentKey(OnboardingUpsellIntentKey.MENU_OF_OPTIONS_UPSELL, null, false, false, null, 30, null), null, false, null, null, 60, null);
                    }
                    this.this$0.setResult(-1);
                    this.this$0.finish();
                    return;
                }
                this.this$0.setResult(0);
                this.this$0.finish();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TransferFundsDeepLinkDuxo getDuxo() {
        return (TransferFundsDeepLinkDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHasTransferLaunched() {
        return ((Boolean) this.hasTransferLaunched.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setHasTransferLaunched(boolean z) {
        this.hasTransferLaunched.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHasQueuedDepositsLaunched() {
        return ((Boolean) this.hasQueuedDepositsLaunched.getValue(this, $$delegatedProperties[1])).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setHasQueuedDepositsLaunched(boolean z) {
        this.hasQueuedDepositsLaunched.setValue(this, $$delegatedProperties[1], Boolean.valueOf(z));
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View viewFindViewById = findViewById(R.id.content);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ApplyWindowInsets.m26663applyWindowInsetsAsMarginqNU9l24(viewFindViewById, InsetSides.INSTANCE.m26683getTopXedK2Rk());
        BaseActivity.collectDuxoState$default(this, null, new C306071(null), 1, null);
    }

    /* compiled from: TransferFundsDeepLinkActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.deeplink.TransferFundsDeepLinkActivity$onCreate$1", m3645f = "TransferFundsDeepLinkActivity.kt", m3646l = {61}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.deeplink.TransferFundsDeepLinkActivity$onCreate$1 */
    static final class C306071 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C306071(Continuation<? super C306071> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TransferFundsDeepLinkActivity.this.new C306071(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C306071) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<TransferFundsDeepLinkViewState> stateFlow = TransferFundsDeepLinkActivity.this.getDuxo().getStateFlow();
                final TransferFundsDeepLinkActivity transferFundsDeepLinkActivity = TransferFundsDeepLinkActivity.this;
                FlowCollector<? super TransferFundsDeepLinkViewState> flowCollector = new FlowCollector() { // from class: com.robinhood.android.transfers.ui.deeplink.TransferFundsDeepLinkActivity.onCreate.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((TransferFundsDeepLinkViewState) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(TransferFundsDeepLinkViewState transferFundsDeepLinkViewState, Continuation<? super Unit> continuation) throws Throwable {
                        IavSource iavSource;
                        if (transferFundsDeepLinkViewState instanceof TransferFundsDeepLinkViewState.Error) {
                            ActivityErrorHandler.Companion.handle$default(ActivityErrorHandler.INSTANCE, transferFundsDeepLinkActivity, ((TransferFundsDeepLinkViewState.Error) transferFundsDeepLinkViewState).getThrowable(), true, false, 0, null, 56, null);
                        } else if (!Intrinsics.areEqual(transferFundsDeepLinkViewState, TransferFundsDeepLinkViewState.Loading.INSTANCE)) {
                            if (transferFundsDeepLinkViewState instanceof TransferFundsDeepLinkViewState.QueuedDeposits) {
                                if (!transferFundsDeepLinkActivity.getHasQueuedDepositsLaunched()) {
                                    transferFundsDeepLinkActivity.setHasQueuedDepositsLaunched(true);
                                    if (((TransferFundsDeepLink) TransferFundsDeepLinkActivity.INSTANCE.getExtras((Activity) transferFundsDeepLinkActivity)).getEntryPoint() == MAXTransferContext.EntryPoint.MENU_OF_OPTIONS) {
                                        iavSource = IavSource.MENU_OF_OPTIONS;
                                    } else {
                                        iavSource = IavSource.DEEPLINK_QUEUED;
                                    }
                                    Navigator.DefaultImpls.startActivityForResult$default(transferFundsDeepLinkActivity.getNavigator(), (Activity) transferFundsDeepLinkActivity, (IntentKey) new CreateIavRelationshipIntentKey(iavSource, TransferDirection.DEPOSIT, ((TransferFundsDeepLinkViewState.QueuedDeposits) transferFundsDeepLinkViewState).getAmount(), null, false, true, null, null, EnumC7081g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE, null), 2000, (PerformanceMetricEventData.Source) null, false, (Function1) null, (NavigationType) null, 120, (Object) null);
                                } else {
                                    transferFundsDeepLinkActivity.finish();
                                }
                            } else if (transferFundsDeepLinkViewState instanceof TransferFundsDeepLinkViewState.Transfer) {
                                if (!transferFundsDeepLinkActivity.getHasTransferLaunched()) {
                                    transferFundsDeepLinkActivity.setHasTransferLaunched(true);
                                    ActivityResultLauncher activityResultLauncher = transferFundsDeepLinkActivity.transferLauncher;
                                    TransferFundsDeepLink transferFundsDeepLink = (TransferFundsDeepLink) TransferFundsDeepLinkActivity.INSTANCE.getExtras((Activity) transferFundsDeepLinkActivity);
                                    NavigationActivityResultContract3.launch$default(activityResultLauncher, new TransferShim(transferFundsDeepLink.getDirection(), ((TransferFundsDeepLinkViewState.Transfer) transferFundsDeepLinkViewState).getTransferConfiguration(), transferFundsDeepLink.getDeepLinkMetadata()), null, false, 6, null);
                                } else {
                                    transferFundsDeepLinkActivity.finish();
                                }
                            } else if (transferFundsDeepLinkViewState instanceof TransferFundsDeepLinkViewState.UkTransfer) {
                                Parcelable extras = TransferFundsDeepLinkActivity.INSTANCE.getExtras((Activity) transferFundsDeepLinkActivity);
                                TransferFundsDeepLinkActivity transferFundsDeepLinkActivity2 = transferFundsDeepLinkActivity;
                                Navigator.DefaultImpls.startActivity$default(transferFundsDeepLinkActivity2.getNavigator(), transferFundsDeepLinkActivity2, ((TransferFundsDeepLinkViewState.UkTransfer) transferFundsDeepLinkViewState).getKey(), null, false, null, null, 60, null);
                                transferFundsDeepLinkActivity.finish();
                            } else if (transferFundsDeepLinkViewState instanceof TransferFundsDeepLinkViewState.UkQueuedDeposit) {
                                Navigator.DefaultImpls.startActivity$default(transferFundsDeepLinkActivity.getNavigator(), transferFundsDeepLinkActivity, new UkQueuedDeposit(null, false, null, 7, null), null, false, null, null, 60, null);
                                transferFundsDeepLinkActivity.finish();
                            } else if (transferFundsDeepLinkViewState instanceof TransferFundsDeepLinkViewState.DcfSideBySide) {
                                Navigator.DefaultImpls.startActivityForResult$default(transferFundsDeepLinkActivity.getNavigator(), (Activity) transferFundsDeepLinkActivity, (IntentKey) new LinkingOptionsIntentKey(PaymentLinkingContext.EntryPoint.MENU_OF_OPTIONS, false), 1000, (PerformanceMetricEventData.Source) null, false, (Function1) null, (NavigationType) null, 120, (Object) null);
                                transferFundsDeepLinkActivity.finish();
                            } else {
                                if (!(transferFundsDeepLinkViewState instanceof TransferFundsDeepLinkViewState.InternationalTransferConfig)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                Navigator.DefaultImpls.startActivity$default(transferFundsDeepLinkActivity.getNavigator(), transferFundsDeepLinkActivity, ((TransferFundsDeepLinkViewState.InternationalTransferConfig) transferFundsDeepLinkViewState).getKey(), null, false, null, null, 60, null);
                                transferFundsDeepLinkActivity.finish();
                            }
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (stateFlow.collect(flowCollector, this) == coroutine_suspended) {
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

    @Override // com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 2000) {
            if (resultCode == -1 && ((TransferFundsDeepLink) INSTANCE.getExtras((Activity) this)).getEntryPoint() == MAXTransferContext.EntryPoint.MENU_OF_OPTIONS) {
                Navigator.DefaultImpls.startActivity$default(getNavigator(), this, new OnboardingUpsellIntentKey(OnboardingUpsellIntentKey.MENU_OF_OPTIONS_UPSELL, null, false, false, null, 30, null), null, false, null, null, 60, null);
            }
            finish();
            return;
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    /* compiled from: TransferFundsDeepLinkActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/deeplink/TransferFundsDeepLinkActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/transfers/ui/deeplink/TransferFundsDeepLinkActivity;", "Lcom/robinhood/android/transfers/contracts/TransferFundsDeepLink;", "<init>", "()V", "REQUEST_CODE_DCF_SIDE_BY_SIDE", "", "REQUEST_CODE_QUEUED_DEPOSIT", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<TransferFundsDeepLinkActivity, TransferFundsDeepLink> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public TransferFundsDeepLink getExtras(TransferFundsDeepLinkActivity transferFundsDeepLinkActivity) {
            return (TransferFundsDeepLink) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, transferFundsDeepLinkActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, TransferFundsDeepLink transferFundsDeepLink) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, transferFundsDeepLink);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, TransferFundsDeepLink transferFundsDeepLink) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, transferFundsDeepLink);
        }
    }
}
