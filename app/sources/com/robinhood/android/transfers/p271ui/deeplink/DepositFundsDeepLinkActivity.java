package com.robinhood.android.transfers.p271ui.deeplink;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.C11839R;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.transfers.contracts.DepositFundsDeepLink;
import com.robinhood.android.transfers.p271ui.deeplink.DepositFundsDeepLinkEvent;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: DepositFundsDeepLinkActivity.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000  2\u00020\u00012\u00020\u0002:\u0001 B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\"\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001a2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR+\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/deeplink/DepositFundsDeepLinkActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/common/ui/RhDialogFragment$OnDismissListener;", "<init>", "()V", "duxo", "Lcom/robinhood/android/transfers/ui/deeplink/DepositFundsDeepLinkDuxo;", "getDuxo", "()Lcom/robinhood/android/transfers/ui/deeplink/DepositFundsDeepLinkDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "<set-?>", "", "hasActivityLaunched", "getHasActivityLaunched", "()Z", "setHasActivityLaunched", "(Z)V", "hasActivityLaunched$delegate", "Lkotlin/properties/ReadWriteProperty;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDialogDismissed", "id", "", "onActivityResult", "requestCode", "resultCode", WebsocketGatewayConstants.DATA_KEY, "Landroid/content/Intent;", "Companion", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class DepositFundsDeepLinkActivity extends BaseActivity implements RhDialogFragment.OnDismissListener {
    public static final int REQUEST_CODE_TRANSFER = 1001;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    /* renamed from: hasActivityLaunched$delegate, reason: from kotlin metadata */
    private final Interfaces3 hasActivityLaunched;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(DepositFundsDeepLinkActivity.class, "hasActivityLaunched", "getHasActivityLaunched()Z", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public DepositFundsDeepLinkActivity() {
        super(C11839R.layout.activity_rds_loading);
        this.duxo = DuxosKt.duxo(this, DepositFundsDeepLinkDuxo.class);
        this.hasActivityLaunched = BindSavedState2.savedBoolean(this, false).provideDelegate(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DepositFundsDeepLinkDuxo getDuxo() {
        return (DepositFundsDeepLinkDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHasActivityLaunched() {
        return ((Boolean) this.hasActivityLaunched.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setHasActivityLaunched(boolean z) {
        this.hasActivityLaunched.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z));
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        BaseActivity.collectDuxoState$default(this, null, new C305971(null), 1, null);
    }

    /* compiled from: DepositFundsDeepLinkActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.deeplink.DepositFundsDeepLinkActivity$onCreate$1", m3645f = "DepositFundsDeepLinkActivity.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.deeplink.DepositFundsDeepLinkActivity$onCreate$1 */
    static final class C305971 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C305971(Continuation<? super C305971> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C305971 c305971 = DepositFundsDeepLinkActivity.this.new C305971(continuation);
            c305971.L$0 = obj;
            return c305971;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C305971) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: DepositFundsDeepLinkActivity.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.deeplink.DepositFundsDeepLinkActivity$onCreate$1$1", m3645f = "DepositFundsDeepLinkActivity.kt", m3646l = {32}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.transfers.ui.deeplink.DepositFundsDeepLinkActivity$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ DepositFundsDeepLinkActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(DepositFundsDeepLinkActivity depositFundsDeepLinkActivity, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = depositFundsDeepLinkActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowFilterNotNull = FlowKt.filterNotNull(this.this$0.getDuxo().getEventFlow());
                    final DepositFundsDeepLinkActivity depositFundsDeepLinkActivity = this.this$0;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.transfers.ui.deeplink.DepositFundsDeepLinkActivity.onCreate.1.1.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit((Event<DepositFundsDeepLinkEvent>) obj2, (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(final Event<DepositFundsDeepLinkEvent> event, Continuation<? super Unit> continuation) {
                            EventConsumer<DepositFundsDeepLinkEvent> eventConsumerInvoke;
                            EventConsumer<DepositFundsDeepLinkEvent> eventConsumerInvoke2;
                            final DepositFundsDeepLinkActivity depositFundsDeepLinkActivity2 = depositFundsDeepLinkActivity;
                            if ((event.getData() instanceof DepositFundsDeepLinkEvent.NavigateAndFinish) && (eventConsumerInvoke2 = event.getGetEventConsumer().invoke()) != null) {
                                eventConsumerInvoke2.consume(event, new Function1() { // from class: com.robinhood.android.transfers.ui.deeplink.DepositFundsDeepLinkActivity$onCreate$1$1$1$emit$$inlined$consumeIfType$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                        m19753invoke(obj2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m19753invoke(Object it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        IntentKey intentKey = ((DepositFundsDeepLinkEvent.NavigateAndFinish) event.getData()).getIntentKey();
                                        if (((DepositFundsDeepLink) DepositFundsDeepLinkActivity.INSTANCE.getExtras((Activity) depositFundsDeepLinkActivity2)).getShouldWaitForResult()) {
                                            if (!depositFundsDeepLinkActivity2.getHasActivityLaunched()) {
                                                depositFundsDeepLinkActivity2.setHasActivityLaunched(true);
                                                Navigator.DefaultImpls.startActivityForResult$default(depositFundsDeepLinkActivity2.getNavigator(), (Activity) depositFundsDeepLinkActivity2, intentKey, 1001, (PerformanceMetricEventData.Source) null, false, (Function1) null, (NavigationType) null, 120, (Object) null);
                                                return;
                                            } else {
                                                depositFundsDeepLinkActivity2.finish();
                                                return;
                                            }
                                        }
                                        Navigator.DefaultImpls.startActivity$default(depositFundsDeepLinkActivity2.getNavigator(), depositFundsDeepLinkActivity2, intentKey, null, false, null, null, 60, null);
                                        depositFundsDeepLinkActivity2.finish();
                                    }
                                });
                            }
                            final DepositFundsDeepLinkActivity depositFundsDeepLinkActivity3 = depositFundsDeepLinkActivity;
                            if ((event.getData() instanceof DepositFundsDeepLinkEvent.Error) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                                eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.transfers.ui.deeplink.DepositFundsDeepLinkActivity$onCreate$1$1$1$emit$$inlined$consumeIfType$2
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) throws Throwable {
                                        m19754invoke(obj2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m19754invoke(Object it) throws Throwable {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        ActivityErrorHandler.Companion.handle$default(ActivityErrorHandler.INSTANCE, depositFundsDeepLinkActivity3, ((DepositFundsDeepLinkEvent.Error) event.getData()).getThrowable(), true, false, 0, null, 56, null);
                                    }
                                });
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (flowFilterNotNull.collect(flowCollector, this) == coroutine_suspended) {
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

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, null, null, new AnonymousClass1(DepositFundsDeepLinkActivity.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 1001) {
            setResult(resultCode);
        } else {
            super.onActivityResult(requestCode, resultCode, data);
        }
        finish();
    }

    /* compiled from: DepositFundsDeepLinkActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/deeplink/DepositFundsDeepLinkActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/transfers/ui/deeplink/DepositFundsDeepLinkActivity;", "Lcom/robinhood/android/transfers/contracts/DepositFundsDeepLink;", "<init>", "()V", "REQUEST_CODE_TRANSFER", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<DepositFundsDeepLinkActivity, DepositFundsDeepLink> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public DepositFundsDeepLink getExtras(DepositFundsDeepLinkActivity depositFundsDeepLinkActivity) {
            return (DepositFundsDeepLink) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, depositFundsDeepLinkActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, DepositFundsDeepLink depositFundsDeepLink) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, depositFundsDeepLink);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, DepositFundsDeepLink depositFundsDeepLink) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, depositFundsDeepLink);
        }
    }
}
