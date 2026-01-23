package com.robinhood.android.lib.trade;

import androidx.fragment.app.FragmentActivity;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.contracts.CarIntentKey;
import com.robinhood.android.lib.trade.BaseOrderParentFragment3;
import com.robinhood.android.lib.trade.util.RunSuitabilityChecks;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract3;
import com.robinhood.android.waitlist.spot.WaitlistAnimationConstants;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.suitability.CombinedQuestionnaireStore;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.shared.i18n.car.CarSuitabilityType;
import com.robinhood.shared.questionnaire.contracts.Questionnaire;
import com.robinhood.utils.logging.CrashReporter;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: BaseOrderParentFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.lib.trade.BaseOrderParentFragment$onCreate$1$checkCarAndSuitability$1", m3645f = "BaseOrderParentFragment.kt", m3646l = {WaitlistAnimationConstants.IN_WAITLIST_ANIMATION_END, 113}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.lib.trade.BaseOrderParentFragment$onCreate$1$checkCarAndSuitability$1, reason: use source file name */
/* loaded from: classes8.dex */
final class BaseOrderParentFragment3 extends ContinuationImpl7 implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ OrderSide $side;
    Object L$0;
    int label;
    final /* synthetic */ BaseOrderParentFragment<OrderManagerT> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseOrderParentFragment3(BaseOrderParentFragment<OrderManagerT> baseOrderParentFragment, OrderSide orderSide, Continuation<? super BaseOrderParentFragment3> continuation) {
        super(1, continuation);
        this.this$0 = baseOrderParentFragment;
        this.$side = orderSide;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new BaseOrderParentFragment3(this.this$0, this.$side, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((BaseOrderParentFragment3) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Observable<String> accountNumberObs = this.this$0.getAccountNumberObs();
                this.label = 1;
                obj = RxAwait3.awaitFirstOrNull(accountNumberObs, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) this.L$0;
                ResultKt.throwOnFailure(obj);
                this.this$0.getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C206441((Flow) obj, this.this$0, str, null));
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            String str2 = (String) obj;
            if (str2 == null) {
                return Unit.INSTANCE;
            }
            CombinedQuestionnaireStore combinedQuestionnaireStore = this.this$0.getCombinedQuestionnaireStore();
            OrderSide orderSide = this.$side;
            CarSuitabilityType carSuitabilityType = this.this$0.getCarSuitabilityType();
            this.L$0 = str2;
            this.label = 2;
            Object objStreamNextQuestionnaire = combinedQuestionnaireStore.streamNextQuestionnaire(str2, orderSide, carSuitabilityType, this);
            if (objStreamNextQuestionnaire != coroutine_suspended) {
                str = str2;
                obj = objStreamNextQuestionnaire;
                this.this$0.getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C206441((Flow) obj, this.this$0, str, null));
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        } catch (Throwable th) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 6, null);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: BaseOrderParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.lib.trade.BaseOrderParentFragment$onCreate$1$checkCarAndSuitability$1$1", m3645f = "BaseOrderParentFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.lib.trade.BaseOrderParentFragment$onCreate$1$checkCarAndSuitability$1$1 */
    static final class C206441 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ Flow<Tuples2<CombinedQuestionnaireStore.Questionnaire, String>> $nextQuestionnaireFlow;
        int label;
        final /* synthetic */ BaseOrderParentFragment<OrderManagerT> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C206441(Flow<? extends Tuples2<? extends CombinedQuestionnaireStore.Questionnaire, String>> flow, BaseOrderParentFragment<OrderManagerT> baseOrderParentFragment, String str, Continuation<? super C206441> continuation) {
            super(2, continuation);
            this.$nextQuestionnaireFlow = flow;
            this.this$0 = baseOrderParentFragment;
            this.$accountNumber = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C206441(this.$nextQuestionnaireFlow, this.this$0, this.$accountNumber, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C206441) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Tuples2<CombinedQuestionnaireStore.Questionnaire, String>> flow = this.$nextQuestionnaireFlow;
                final BaseOrderParentFragment<OrderManagerT> baseOrderParentFragment = this.this$0;
                final String str = this.$accountNumber;
                Function0 function0 = new Function0() { // from class: com.robinhood.android.lib.trade.BaseOrderParentFragment$onCreate$1$checkCarAndSuitability$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BaseOrderParentFragment3.C206441.invokeSuspend$lambda$0(baseOrderParentFragment, str);
                    }
                };
                final BaseOrderParentFragment<OrderManagerT> baseOrderParentFragment2 = this.this$0;
                final String str2 = this.$accountNumber;
                Function2 function2 = new Function2() { // from class: com.robinhood.android.lib.trade.BaseOrderParentFragment$onCreate$1$checkCarAndSuitability$1$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return BaseOrderParentFragment3.C206441.invokeSuspend$lambda$1(baseOrderParentFragment2, str2, ((Boolean) obj2).booleanValue(), (String) obj3);
                    }
                };
                this.label = 1;
                if (RunSuitabilityChecks.runCarAndSuitabilityChecks(flow, function0, function2, this) == coroutine_suspended) {
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

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(BaseOrderParentFragment baseOrderParentFragment, String str) {
            if (!baseOrderParentFragment.isConfirmationScreen() && !baseOrderParentFragment.carLaunched) {
                NavigationActivityResultContract3.launch$default(baseOrderParentFragment.carLauncher, new CarIntentKey(str), null, false, 6, null);
                baseOrderParentFragment.carLaunched = true;
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(BaseOrderParentFragment baseOrderParentFragment, String str, boolean z, String str2) {
            if (!baseOrderParentFragment.isConfirmationScreen() && z && baseOrderParentFragment.forceSuitability == null) {
                Navigator navigator = baseOrderParentFragment.getNavigator();
                FragmentActivity fragmentActivityRequireActivity = baseOrderParentFragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                baseOrderParentFragment.startActivityForResult(Navigator.DefaultImpls.createIntent$default(navigator, fragmentActivityRequireActivity, new Questionnaire(true, str2, str, null, null, null, false, false, false, false, false, null, null, false, false, false, false, false, null, null, 1048568, null), null, false, 12, null), 1);
            }
            baseOrderParentFragment.forceSuitability = Boolean.valueOf(z);
            return Unit.INSTANCE;
        }
    }
}
