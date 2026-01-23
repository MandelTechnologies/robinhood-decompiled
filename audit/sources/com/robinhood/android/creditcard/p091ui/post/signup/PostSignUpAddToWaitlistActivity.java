package com.robinhood.android.creditcard.p091ui.post.signup;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.view.WindowCompat;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.creditcard.contracts.CreditCardWaitlistPostSignUpIntentKey;
import com.robinhood.android.creditcard.p091ui.post.signup.PostSignUpAddToWaitlistActivityDuxo2;
import com.robinhood.android.creditcard.p091ui.post.signup.PostSignUpAddToWaitlistFragment;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.regiongate.CreditCardRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import java.util.Set;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: PostSignUpAddToWaitlistActivity.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001c2\u00020\u00012\u00020\u0002:\u0001\u001cB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\u0016\u0010\u0011\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002J\b\u0010\u0015\u001a\u00020\u000eH\u0002J\t\u0010\u0016\u001a\u00020\fH\u0096\u0001R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/post/signup/PostSignUpAddToWaitlistActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "duxo", "Lcom/robinhood/android/creditcard/ui/post/signup/PostSignUpAddToWaitlistActivityDuxo;", "getDuxo", "()Lcom/robinhood/android/creditcard/ui/post/signup/PostSignUpAddToWaitlistActivityDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "requiresAuthentication", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "handleDuxoEvent", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/creditcard/ui/post/signup/PostSignUpAddToWaitlistActivityEvent;", "launchAddToWaitlist", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class PostSignUpAddToWaitlistActivity extends BaseActivity implements RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

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

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public boolean requiresAuthentication() {
        return false;
    }

    public PostSignUpAddToWaitlistActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.$$delegate_0 = new RegionGated2(CreditCardRegionGate.INSTANCE);
        this.duxo = DuxosKt.duxo(this, PostSignUpAddToWaitlistActivityDuxo.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PostSignUpAddToWaitlistActivityDuxo getDuxo() {
        return (PostSignUpAddToWaitlistActivityDuxo) this.duxo.getValue();
    }

    /* compiled from: PostSignUpAddToWaitlistActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.post.signup.PostSignUpAddToWaitlistActivity$onCreate$1", m3645f = "PostSignUpAddToWaitlistActivity.kt", m3646l = {27}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.creditcard.ui.post.signup.PostSignUpAddToWaitlistActivity$onCreate$1 */
    static final class C126231 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C126231(Continuation<? super C126231> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PostSignUpAddToWaitlistActivity.this.new C126231(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C126231) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: PostSignUpAddToWaitlistActivity.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.creditcard.ui.post.signup.PostSignUpAddToWaitlistActivity$onCreate$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ PostSignUpAddToWaitlistActivity $tmp0;

            AnonymousClass1(PostSignUpAddToWaitlistActivity postSignUpAddToWaitlistActivity) {
                this.$tmp0 = postSignUpAddToWaitlistActivity;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, PostSignUpAddToWaitlistActivity.class, "handleDuxoEvent", "handleDuxoEvent(Lcom/robinhood/android/udf/event/Event;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(Event<PostSignUpAddToWaitlistActivityDuxo2> event, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$handleDuxoEvent = C126231.invokeSuspend$handleDuxoEvent(this.$tmp0, event, continuation);
                return objInvokeSuspend$handleDuxoEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$handleDuxoEvent : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((Event<PostSignUpAddToWaitlistActivityDuxo2>) obj, (Continuation<? super Unit>) continuation);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$handleDuxoEvent(PostSignUpAddToWaitlistActivity postSignUpAddToWaitlistActivity, Event event, Continuation continuation) {
            postSignUpAddToWaitlistActivity.handleDuxoEvent(event);
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(PostSignUpAddToWaitlistActivity.this.getDuxo().getEventFlow());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(PostSignUpAddToWaitlistActivity.this);
                this.label = 1;
                if (flowFilterNotNull.collect(anonymousClass1, this) == coroutine_suspended) {
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

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        BaseActivity.collectDuxoState$default(this, null, new C126231(null), 1, null);
        WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
        if (savedInstanceState == null) {
            int i = C11048R.id.fragment_container;
            PostSignUpAddToWaitlistFragment.Companion companion = PostSignUpAddToWaitlistFragment.INSTANCE;
            Companion companion2 = INSTANCE;
            setFragment(i, companion.newInstance((Parcelable) new PostSignUpAddToWaitlistFragment.Args(((CreditCardWaitlistPostSignUpIntentKey) companion2.getExtras((Activity) this)).getRedirectKey(), ((CreditCardWaitlistPostSignUpIntentKey) companion2.getExtras((Activity) this)).getShouldLaunchTaxMatchPromoForResurrectedUser())));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleDuxoEvent(final Event<PostSignUpAddToWaitlistActivityDuxo2> event) {
        EventConsumer<PostSignUpAddToWaitlistActivityDuxo2> eventConsumerInvoke;
        if (!(event.getData() instanceof PostSignUpAddToWaitlistActivityDuxo2) || (eventConsumerInvoke = event.getGetEventConsumer().invoke()) == null) {
            return;
        }
        eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.creditcard.ui.post.signup.PostSignUpAddToWaitlistActivity$handleDuxoEvent$$inlined$consumeIfType$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m12855invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m12855invoke(Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                PostSignUpAddToWaitlistActivityDuxo2 postSignUpAddToWaitlistActivityDuxo2 = (PostSignUpAddToWaitlistActivityDuxo2) event.getData();
                if (postSignUpAddToWaitlistActivityDuxo2 instanceof PostSignUpAddToWaitlistActivityDuxo2.AddToWaitlist) {
                    this.launchAddToWaitlist();
                } else {
                    if (!Intrinsics.areEqual(postSignUpAddToWaitlistActivityDuxo2, PostSignUpAddToWaitlistActivityDuxo2.Error.INSTANCE)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.finish();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launchAddToWaitlist() {
        int i = C11048R.id.fragment_container;
        PostSignUpAddToWaitlistFragment.Companion companion = PostSignUpAddToWaitlistFragment.INSTANCE;
        Companion companion2 = INSTANCE;
        setFragment(i, companion.newInstance((Parcelable) new PostSignUpAddToWaitlistFragment.Args(((CreditCardWaitlistPostSignUpIntentKey) companion2.getExtras((Activity) this)).getRedirectKey(), ((CreditCardWaitlistPostSignUpIntentKey) companion2.getExtras((Activity) this)).getShouldLaunchTaxMatchPromoForResurrectedUser())));
    }

    /* compiled from: PostSignUpAddToWaitlistActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/post/signup/PostSignUpAddToWaitlistActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/creditcard/ui/post/signup/PostSignUpAddToWaitlistActivity;", "Lcom/robinhood/android/creditcard/contracts/CreditCardWaitlistPostSignUpIntentKey;", "<init>", "()V", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<PostSignUpAddToWaitlistActivity, CreditCardWaitlistPostSignUpIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public CreditCardWaitlistPostSignUpIntentKey getExtras(PostSignUpAddToWaitlistActivity postSignUpAddToWaitlistActivity) {
            return (CreditCardWaitlistPostSignUpIntentKey) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, postSignUpAddToWaitlistActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, CreditCardWaitlistPostSignUpIntentKey creditCardWaitlistPostSignUpIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, creditCardWaitlistPostSignUpIntentKey);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, CreditCardWaitlistPostSignUpIntentKey creditCardWaitlistPostSignUpIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, creditCardWaitlistPostSignUpIntentKey);
        }
    }
}
