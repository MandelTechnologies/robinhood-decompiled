package com.robinhood.android.lib.trade;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.navigation.Navigator;
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

/* compiled from: BaseOrderActivity.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.lib.trade.BaseOrderActivity$onCreate$1$checkSuitability$1", m3645f = "BaseOrderActivity.kt", m3646l = {353, EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.lib.trade.BaseOrderActivity$onCreate$1$checkSuitability$1, reason: use source file name */
/* loaded from: classes8.dex */
final class BaseOrderActivity4 extends ContinuationImpl7 implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ CoroutineScope $$this$launchWhenCreated;
    Object L$0;
    int label;
    final /* synthetic */ BaseOrderActivity<OrderManagerT, OrderCreateFragmentT> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    BaseOrderActivity4(BaseOrderActivity<? extends OrderManagerT, OrderCreateFragmentT> baseOrderActivity, CoroutineScope coroutineScope, Continuation<? super BaseOrderActivity4> continuation) {
        super(1, continuation);
        this.this$0 = baseOrderActivity;
        this.$$this$launchWhenCreated = coroutineScope;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new BaseOrderActivity4(this.this$0, this.$$this$launchWhenCreated, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((BaseOrderActivity4) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006c, code lost:
    
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
            C206281 c206281 = new C206281(this.this$0, str, this.$$this$launchWhenCreated, null);
            this.L$0 = null;
            this.label = 3;
        }
        str = (String) obj;
        SuitabilityStore suitabilityStore = this.this$0.getSuitabilityStore();
        Intrinsics.checkNotNull(str);
        OrderSide side = this.this$0.getSide();
        this.L$0 = str;
        this.label = 2;
        obj = suitabilityStore.shouldForceSuitability(str, side, this);
        if (obj != coroutine_suspended) {
            C206281 c2062812 = new C206281(this.this$0, str, this.$$this$launchWhenCreated, null);
            this.L$0 = null;
            this.label = 3;
        }
        return coroutine_suspended;
    }

    /* compiled from: BaseOrderActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u00060\u0005j\u0002`\u00060\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "", "", "Lcom/robinhood/store/base/SuitabilityQuestionnaireContext;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.lib.trade.BaseOrderActivity$onCreate$1$checkSuitability$1$1", m3645f = "BaseOrderActivity.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.lib.trade.BaseOrderActivity$onCreate$1$checkSuitability$1$1 */
    static final class C206281 extends ContinuationImpl7 implements Function2<Tuples2<? extends Boolean, ? extends String>, Continuation<? super Unit>, Object> {
        final /* synthetic */ CoroutineScope $$this$launchWhenCreated;
        final /* synthetic */ String $accountNumber;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ BaseOrderActivity<OrderManagerT, OrderCreateFragmentT> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C206281(BaseOrderActivity<? extends OrderManagerT, OrderCreateFragmentT> baseOrderActivity, String str, CoroutineScope coroutineScope, Continuation<? super C206281> continuation) {
            super(2, continuation);
            this.this$0 = baseOrderActivity;
            this.$accountNumber = str;
            this.$$this$launchWhenCreated = coroutineScope;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C206281 c206281 = new C206281(this.this$0, this.$accountNumber, this.$$this$launchWhenCreated, continuation);
            c206281.L$0 = obj;
            return c206281;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends Boolean, ? extends String> tuples2, Continuation<? super Unit> continuation) {
            return invoke2((Tuples2<Boolean, String>) tuples2, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Tuples2<Boolean, String> tuples2, Continuation<? super Unit> continuation) {
            return ((C206281) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Tuples2 tuples2 = (Tuples2) this.L$0;
            boolean zBooleanValue = ((Boolean) tuples2.component1()).booleanValue();
            String str = (String) tuples2.component2();
            if (!(this.this$0.getCurrentFragment() instanceof BaseOrderConfirmationFragment) && ((BaseOrderActivity) this.this$0).forceSuitability == null && zBooleanValue) {
                BaseActivity baseActivity = this.this$0;
                baseActivity.startActivityForResult(Navigator.DefaultImpls.createIntent$default(baseActivity.getNavigator(), this.this$0, new Questionnaire(true, str, this.$accountNumber, null, null, null, false, false, false, false, false, null, null, false, false, false, false, false, null, null, 1048568, null), null, false, 12, null), 1);
            }
            Launch.launchMain$default(this.$$this$launchWhenCreated, null, null, new AnonymousClass1(this.this$0, zBooleanValue, null), 3, null);
            return Unit.INSTANCE;
        }

        /* compiled from: BaseOrderActivity.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.lib.trade.BaseOrderActivity$onCreate$1$checkSuitability$1$1$1", m3645f = "BaseOrderActivity.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.lib.trade.BaseOrderActivity$onCreate$1$checkSuitability$1$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ boolean $force;
            int label;
            final /* synthetic */ BaseOrderActivity<OrderManagerT, OrderCreateFragmentT> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(BaseOrderActivity<? extends OrderManagerT, OrderCreateFragmentT> baseOrderActivity, boolean z, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = baseOrderActivity;
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
                ((BaseOrderActivity) this.this$0).forceSuitability = boxing.boxBoolean(this.$force);
                return Unit.INSTANCE;
            }
        }
    }
}
