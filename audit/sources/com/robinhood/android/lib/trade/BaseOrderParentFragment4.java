package com.robinhood.android.lib.trade;

import androidx.fragment.app.FragmentActivity;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.waitlist.spot.WaitlistAnimationConstants;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.shared.questionnaire.contracts.Questionnaire;
import com.robinhood.store.base.SuitabilityStore;
import dispatch.core.Launch;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: BaseOrderParentFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.lib.trade.BaseOrderParentFragment$onCreate$1$checkSuitability$1", m3645f = "BaseOrderParentFragment.kt", m3646l = {WaitlistAnimationConstants.IN_WAITLIST_ANIMATION_END, EnumC7081g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.lib.trade.BaseOrderParentFragment$onCreate$1$checkSuitability$1, reason: use source file name */
/* loaded from: classes8.dex */
final class BaseOrderParentFragment4 extends ContinuationImpl7 implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ CoroutineScope $$this$launchWhenCreated;
    final /* synthetic */ OrderSide $side;
    Object L$0;
    int label;
    final /* synthetic */ BaseOrderParentFragment<OrderManagerT> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseOrderParentFragment4(BaseOrderParentFragment<OrderManagerT> baseOrderParentFragment, OrderSide orderSide, CoroutineScope coroutineScope, Continuation<? super BaseOrderParentFragment4> continuation) {
        super(1, continuation);
        this.this$0 = baseOrderParentFragment;
        this.$side = orderSide;
        this.$$this$launchWhenCreated = coroutineScope;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new BaseOrderParentFragment4(this.this$0, this.$side, this.$$this$launchWhenCreated, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((BaseOrderParentFragment4) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0068, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.collectLatest((kotlinx.coroutines.flow.Flow) r8, r3, r7) != r0) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Observable<String> accountNumberObs = this.this$0.getAccountNumberObs();
            this.label = 1;
            obj = RxAwait3.awaitFirst(accountNumberObs, this);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            str = (String) this.L$0;
            ResultKt.throwOnFailure(obj);
            C206451 c206451 = new C206451(this.this$0, str, this.$$this$launchWhenCreated, null);
            this.L$0 = null;
            this.label = 3;
        }
        str = (String) obj;
        SuitabilityStore suitabilityStore = this.this$0.getSuitabilityStore();
        Intrinsics.checkNotNull(str);
        OrderSide orderSide = this.$side;
        this.L$0 = str;
        this.label = 2;
        obj = suitabilityStore.shouldForceSuitability(str, orderSide, this);
        if (obj != coroutine_suspended) {
            C206451 c2064512 = new C206451(this.this$0, str, this.$$this$launchWhenCreated, null);
            this.L$0 = null;
            this.label = 3;
        }
        return coroutine_suspended;
    }

    /* compiled from: BaseOrderParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u00060\u0005j\u0002`\u00060\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "", "", "Lcom/robinhood/store/base/SuitabilityQuestionnaireContext;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.lib.trade.BaseOrderParentFragment$onCreate$1$checkSuitability$1$1", m3645f = "BaseOrderParentFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.lib.trade.BaseOrderParentFragment$onCreate$1$checkSuitability$1$1 */
    static final class C206451 extends ContinuationImpl7 implements Function2<Tuples2<? extends Boolean, ? extends String>, Continuation<? super Unit>, Object> {
        final /* synthetic */ CoroutineScope $$this$launchWhenCreated;
        final /* synthetic */ String $accountNumber;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ BaseOrderParentFragment<OrderManagerT> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C206451(BaseOrderParentFragment<OrderManagerT> baseOrderParentFragment, String str, CoroutineScope coroutineScope, Continuation<? super C206451> continuation) {
            super(2, continuation);
            this.this$0 = baseOrderParentFragment;
            this.$accountNumber = str;
            this.$$this$launchWhenCreated = coroutineScope;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C206451 c206451 = new C206451(this.this$0, this.$accountNumber, this.$$this$launchWhenCreated, continuation);
            c206451.L$0 = obj;
            return c206451;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends Boolean, ? extends String> tuples2, Continuation<? super Unit> continuation) {
            return invoke2((Tuples2<Boolean, String>) tuples2, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Tuples2<Boolean, String> tuples2, Continuation<? super Unit> continuation) {
            return ((C206451) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                Tuples2 tuples2 = (Tuples2) this.L$0;
                boolean zBooleanValue = ((Boolean) tuples2.component1()).booleanValue();
                String str = (String) tuples2.component2();
                if (!this.this$0.isConfirmationScreen() && ((BaseOrderParentFragment) this.this$0).forceSuitability == null && zBooleanValue) {
                    BaseFragment baseFragment = this.this$0;
                    Navigator navigator = baseFragment.getNavigator();
                    FragmentActivity fragmentActivityRequireActivity = this.this$0.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                    baseFragment.startActivityForResult(Navigator.DefaultImpls.createIntent$default(navigator, fragmentActivityRequireActivity, new Questionnaire(true, str, this.$accountNumber, null, null, null, false, false, false, false, false, null, null, false, false, false, false, false, null, null, 1048568, null), null, false, 12, null), 1);
                }
                Launch.launchMain$default(this.$$this$launchWhenCreated, null, null, new AnonymousClass1(this.this$0, zBooleanValue, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: BaseOrderParentFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.lib.trade.BaseOrderParentFragment$onCreate$1$checkSuitability$1$1$1", m3645f = "BaseOrderParentFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.lib.trade.BaseOrderParentFragment$onCreate$1$checkSuitability$1$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ boolean $force;
            int label;
            final /* synthetic */ BaseOrderParentFragment<OrderManagerT> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(BaseOrderParentFragment<OrderManagerT> baseOrderParentFragment, boolean z, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = baseOrderParentFragment;
                this.$force = z;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$force, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ((BaseOrderParentFragment) this.this$0).forceSuitability = boxing.boxBoolean(this.$force);
                return Unit.INSTANCE;
            }
        }
    }
}
