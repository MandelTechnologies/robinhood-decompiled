package com.robinhood.android.transfers.p271ui.deeplink;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.C11839R;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.transfers.contracts.WithdrawFundsDeeplink;
import com.robinhood.android.transfers.p271ui.deeplink.WithdrawFundsDeeplinkEvent;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: WithdrawFundsDeeplinkActivity.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00122\u00020\u00012\u00020\u0002:\u0001\u0012B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/deeplink/WithdrawFundsDeeplinkActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/common/ui/RhDialogFragment$OnDismissListener;", "<init>", "()V", "duxo", "Lcom/robinhood/android/transfers/ui/deeplink/WithdrawFundsDeeplinkDuxo;", "getDuxo", "()Lcom/robinhood/android/transfers/ui/deeplink/WithdrawFundsDeeplinkDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDialogDismissed", "id", "", "Companion", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class WithdrawFundsDeeplinkActivity extends BaseActivity implements RhDialogFragment.OnDismissListener {

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public WithdrawFundsDeeplinkActivity() {
        super(C11839R.layout.activity_rds_loading);
        this.duxo = DuxosKt.duxo(this, WithdrawFundsDeeplinkDuxo.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WithdrawFundsDeeplinkDuxo getDuxo() {
        return (WithdrawFundsDeeplinkDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        BaseActivity.collectDuxoState$default(this, null, new C306151(null), 1, null);
    }

    /* compiled from: WithdrawFundsDeeplinkActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.deeplink.WithdrawFundsDeeplinkActivity$onCreate$1", m3645f = "WithdrawFundsDeeplinkActivity.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.deeplink.WithdrawFundsDeeplinkActivity$onCreate$1 */
    static final class C306151 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C306151(Continuation<? super C306151> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C306151 c306151 = WithdrawFundsDeeplinkActivity.this.new C306151(continuation);
            c306151.L$0 = obj;
            return c306151;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C306151) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: WithdrawFundsDeeplinkActivity.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.deeplink.WithdrawFundsDeeplinkActivity$onCreate$1$1", m3645f = "WithdrawFundsDeeplinkActivity.kt", m3646l = {28}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.transfers.ui.deeplink.WithdrawFundsDeeplinkActivity$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ WithdrawFundsDeeplinkActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(WithdrawFundsDeeplinkActivity withdrawFundsDeeplinkActivity, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = withdrawFundsDeeplinkActivity;
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
                    final WithdrawFundsDeeplinkActivity withdrawFundsDeeplinkActivity = this.this$0;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.transfers.ui.deeplink.WithdrawFundsDeeplinkActivity.onCreate.1.1.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit((Event<WithdrawFundsDeeplinkEvent>) obj2, (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(final Event<WithdrawFundsDeeplinkEvent> event, Continuation<? super Unit> continuation) {
                            EventConsumer<WithdrawFundsDeeplinkEvent> eventConsumerInvoke;
                            EventConsumer<WithdrawFundsDeeplinkEvent> eventConsumerInvoke2;
                            final WithdrawFundsDeeplinkActivity withdrawFundsDeeplinkActivity2 = withdrawFundsDeeplinkActivity;
                            if ((event.getData() instanceof WithdrawFundsDeeplinkEvent.NavigateAndFinish) && (eventConsumerInvoke2 = event.getGetEventConsumer().invoke()) != null) {
                                eventConsumerInvoke2.consume(event, new Function1() { // from class: com.robinhood.android.transfers.ui.deeplink.WithdrawFundsDeeplinkActivity$onCreate$1$1$1$emit$$inlined$consumeIfType$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                        m19756invoke(obj2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m19756invoke(Object it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        Navigator.DefaultImpls.startActivity$default(withdrawFundsDeeplinkActivity2.getNavigator(), withdrawFundsDeeplinkActivity2, ((WithdrawFundsDeeplinkEvent.NavigateAndFinish) event.getData()).getIntentKey(), null, false, null, null, 60, null);
                                        withdrawFundsDeeplinkActivity2.finish();
                                    }
                                });
                            }
                            final WithdrawFundsDeeplinkActivity withdrawFundsDeeplinkActivity3 = withdrawFundsDeeplinkActivity;
                            if ((event.getData() instanceof WithdrawFundsDeeplinkEvent.Error) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                                eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.transfers.ui.deeplink.WithdrawFundsDeeplinkActivity$onCreate$1$1$1$emit$$inlined$consumeIfType$2
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) throws Throwable {
                                        m19757invoke(obj2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m19757invoke(Object it) throws Throwable {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        ActivityErrorHandler.Companion.handle$default(ActivityErrorHandler.INSTANCE, withdrawFundsDeeplinkActivity3, ((WithdrawFundsDeeplinkEvent.Error) event.getData()).getThrowable(), true, false, 0, null, 56, null);
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
                BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, null, null, new AnonymousClass1(WithdrawFundsDeeplinkActivity.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        finish();
    }

    /* compiled from: WithdrawFundsDeeplinkActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/deeplink/WithdrawFundsDeeplinkActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/transfers/ui/deeplink/DepositFundsDeepLinkActivity;", "Lcom/robinhood/android/transfers/contracts/WithdrawFundsDeeplink;", "<init>", "()V", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<DepositFundsDeepLinkActivity, WithdrawFundsDeeplink> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public WithdrawFundsDeeplink getExtras(DepositFundsDeepLinkActivity depositFundsDeepLinkActivity) {
            return (WithdrawFundsDeeplink) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, depositFundsDeepLinkActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, WithdrawFundsDeeplink withdrawFundsDeeplink) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, withdrawFundsDeeplink);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, WithdrawFundsDeeplink withdrawFundsDeeplink) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, withdrawFundsDeeplink);
        }
    }
}
