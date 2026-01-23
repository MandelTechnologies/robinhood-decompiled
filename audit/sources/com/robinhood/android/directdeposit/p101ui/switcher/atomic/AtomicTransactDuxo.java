package com.robinhood.android.directdeposit.p101ui.switcher.atomic;

import android.util.Base64;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.api.cashier.Cashier;
import com.robinhood.android.directdeposit.p101ui.switcher.atomic.AtomicTransactDuxo2;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.cashier.AtomicAccessToken;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Either;
import com.robinhood.utils.Either2;
import com.robinhood.utils.extensions.TypeToken;
import com.robinhood.utils.extensions.Types;
import com.robinhood.utils.moshi.LazyMoshi;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AtomicTransactDuxo.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u0011\u001a\u00020\u0012J\b\u0010\u0013\u001a\u00020\u0012H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0014\u001a\n \u0016*\u0004\u0018\u00010\u00150\u0015*\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/switcher/atomic/AtomicTransactDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/directdeposit/ui/switcher/atomic/AtomicTransactViewState;", "transactJavascriptBridge", "Lcom/robinhood/android/directdeposit/ui/switcher/atomic/AtomicTransactJavascriptBridge;", "cashier", "Lcom/robinhood/android/api/cashier/Cashier;", "transactConfiguration", "Lcom/robinhood/android/directdeposit/ui/switcher/atomic/TransactConfiguration;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "<init>", "(Lcom/robinhood/android/directdeposit/ui/switcher/atomic/AtomicTransactJavascriptBridge;Lcom/robinhood/android/api/cashier/Cashier;Lcom/robinhood/android/directdeposit/ui/switcher/atomic/TransactConfiguration;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/utils/moshi/LazyMoshi;)V", "getTransactJavascriptBridge", "()Lcom/robinhood/android/directdeposit/ui/switcher/atomic/AtomicTransactJavascriptBridge;", "setPageLoaded", "", "onCreate", "encodedPayload", "", "kotlin.jvm.PlatformType", "getEncodedPayload", "(Lcom/robinhood/android/directdeposit/ui/switcher/atomic/TransactConfiguration;)Ljava/lang/String;", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes27.dex */
public final class AtomicTransactDuxo extends OldBaseDuxo<AtomicTransactDuxo2> {
    public static final int $stable = 8;
    private final Cashier cashier;
    private final EventLogger eventLogger;
    private final LazyMoshi moshi;
    private final TransactConfiguration transactConfiguration;
    private final AtomicTransactJavascriptBridge transactJavascriptBridge;

    public final AtomicTransactJavascriptBridge getTransactJavascriptBridge() {
        return this.transactJavascriptBridge;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AtomicTransactDuxo(AtomicTransactJavascriptBridge transactJavascriptBridge, Cashier cashier, TransactConfiguration transactConfiguration, EventLogger eventLogger, LazyMoshi moshi) {
        super(new AtomicTransactDuxo2.Loading(null, 1, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(transactJavascriptBridge, "transactJavascriptBridge");
        Intrinsics.checkNotNullParameter(cashier, "cashier");
        Intrinsics.checkNotNullParameter(transactConfiguration, "transactConfiguration");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.transactJavascriptBridge = transactJavascriptBridge;
        this.cashier = cashier;
        this.transactConfiguration = transactConfiguration;
        this.eventLogger = eventLogger;
        this.moshi = moshi;
    }

    public final void setPageLoaded() {
        applyMutation(new Function1() { // from class: com.robinhood.android.directdeposit.ui.switcher.atomic.AtomicTransactDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AtomicTransactDuxo.setPageLoaded$lambda$0((AtomicTransactDuxo2) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AtomicTransactDuxo2 setPageLoaded$lambda$0(AtomicTransactDuxo2 applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        AtomicTransactDuxo2.Loaded loaded = applyMutation instanceof AtomicTransactDuxo2.Loaded ? (AtomicTransactDuxo2.Loaded) applyMutation : null;
        return loaded != null ? loaded : new AtomicTransactDuxo2.Loaded(null, null, 3, null);
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        Single singleOnErrorReturn = RxFactory.DefaultImpls.rxSingle$default(this, null, new C141451(null), 1, null).map(new Function() { // from class: com.robinhood.android.directdeposit.ui.switcher.atomic.AtomicTransactDuxo.onCreate.2
            @Override // io.reactivex.functions.Function
            public final Either<Throwable, String> apply(AtomicAccessToken atomicAccessToken) {
                Intrinsics.checkNotNullParameter(atomicAccessToken, "<destruct>");
                String access_token = atomicAccessToken.getAccess_token();
                String transact_url = atomicAccessToken.getTransact_url();
                AtomicTransactDuxo atomicTransactDuxo = AtomicTransactDuxo.this;
                return Either2.asRight(transact_url + "/initialize/" + atomicTransactDuxo.getEncodedPayload(TransactConfiguration.copy$default(atomicTransactDuxo.transactConfiguration, access_token, null, null, null, null, false, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null)));
            }
        }).onErrorReturn(new Function() { // from class: com.robinhood.android.directdeposit.ui.switcher.atomic.AtomicTransactDuxo.onCreate.3
            @Override // io.reactivex.functions.Function
            public final Either<Throwable, String> apply(Throwable it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Either2.asLeft(it);
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleOnErrorReturn, "onErrorReturn(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleOnErrorReturn, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.directdeposit.ui.switcher.atomic.AtomicTransactDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AtomicTransactDuxo.onCreate$lambda$2(this.f$0, (Either) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.transactJavascriptBridge.getEvents(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.directdeposit.ui.switcher.atomic.AtomicTransactDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AtomicTransactDuxo.onCreate$lambda$4(this.f$0, (TransactEvent) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.transactJavascriptBridge.getScreenChanges(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.directdeposit.ui.switcher.atomic.AtomicTransactDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AtomicTransactDuxo.onCreate$lambda$6(this.f$0, (Screen) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.transactJavascriptBridge.getLogEvents(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C141487(this.eventLogger));
    }

    /* compiled from: AtomicTransactDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/cashier/AtomicAccessToken;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.directdeposit.ui.switcher.atomic.AtomicTransactDuxo$onCreate$1", m3645f = "AtomicTransactDuxo.kt", m3646l = {53}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.directdeposit.ui.switcher.atomic.AtomicTransactDuxo$onCreate$1 */
    static final class C141451 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super AtomicAccessToken>, Object> {
        int label;

        C141451(Continuation<? super C141451> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AtomicTransactDuxo.this.new C141451(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AtomicAccessToken> continuation) {
            return ((C141451) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            Cashier cashier = AtomicTransactDuxo.this.cashier;
            this.label = 1;
            Object atomicAccessToken = cashier.getAtomicAccessToken(this);
            return atomicAccessToken == coroutine_suspended ? coroutine_suspended : atomicAccessToken;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$2(AtomicTransactDuxo atomicTransactDuxo, final Either either) {
        atomicTransactDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.directdeposit.ui.switcher.atomic.AtomicTransactDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AtomicTransactDuxo.onCreate$lambda$2$lambda$1(either, (AtomicTransactDuxo2) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AtomicTransactDuxo2 onCreate$lambda$2$lambda$1(Either either, AtomicTransactDuxo2 applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return new AtomicTransactDuxo2.Loading(new UiEvent(either));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$4(AtomicTransactDuxo atomicTransactDuxo, final TransactEvent transactEvent) {
        Intrinsics.checkNotNullParameter(transactEvent, "transactEvent");
        atomicTransactDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.directdeposit.ui.switcher.atomic.AtomicTransactDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AtomicTransactDuxo.onCreate$lambda$4$lambda$3(transactEvent, (AtomicTransactDuxo2) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AtomicTransactDuxo2 onCreate$lambda$4$lambda$3(TransactEvent transactEvent, AtomicTransactDuxo2 applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        UiEvent uiEvent = new UiEvent(transactEvent);
        if (applyMutation instanceof AtomicTransactDuxo2.Loaded) {
            return AtomicTransactDuxo2.Loaded.copy$default((AtomicTransactDuxo2.Loaded) applyMutation, uiEvent, null, 2, null);
        }
        return new AtomicTransactDuxo2.Loaded(uiEvent, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$6(AtomicTransactDuxo atomicTransactDuxo, final Screen screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        atomicTransactDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.directdeposit.ui.switcher.atomic.AtomicTransactDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AtomicTransactDuxo.onCreate$lambda$6$lambda$5(screen, (AtomicTransactDuxo2) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AtomicTransactDuxo2 onCreate$lambda$6$lambda$5(Screen screen, AtomicTransactDuxo2 applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return !(applyMutation instanceof AtomicTransactDuxo2.Loaded) ? applyMutation : AtomicTransactDuxo2.Loaded.copy$default((AtomicTransactDuxo2.Loaded) applyMutation, null, screen, 1, null);
    }

    /* compiled from: AtomicTransactDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.directdeposit.ui.switcher.atomic.AtomicTransactDuxo$onCreate$7 */
    /* synthetic */ class C141487 extends AdaptedFunctionReference implements Function1<UserInteractionEventData, Unit> {
        C141487(Object obj) {
            super(1, obj, EventLogger.class, "logUserInteractionEvent", "logUserInteractionEvent(Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;ZZ)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UserInteractionEventData userInteractionEventData) {
            invoke2(userInteractionEventData);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(UserInteractionEventData p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            EventLogger.DefaultImpls.logUserInteractionEvent$default((EventLogger) this.receiver, p0, false, false, 6, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getEncodedPayload(TransactConfiguration transactConfiguration) {
        LazyMoshi lazyMoshi = this.moshi;
        Types types = Types.INSTANCE;
        String json = lazyMoshi.adapter(new TypeToken<TransactConfiguration>() { // from class: com.robinhood.android.directdeposit.ui.switcher.atomic.AtomicTransactDuxo$special$$inlined$getAdapter$1
        }.getType()).toJson(transactConfiguration);
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        byte[] bytes = json.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return Base64.encodeToString(bytes, 0);
    }
}
