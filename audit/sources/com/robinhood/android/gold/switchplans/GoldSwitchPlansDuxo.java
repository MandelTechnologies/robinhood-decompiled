package com.robinhood.android.gold.switchplans;

import com.robinhood.android.gold.subscription.api.GoldSwitchSubscriptionPlanRequest;
import com.robinhood.android.gold.subscription.api.GoldSwitchSubscriptionPlanResponse;
import com.robinhood.android.gold.subscription.store.GoldSubscriptionStore;
import com.robinhood.android.gold.switchplans.GoldSwitchPlansViewState;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.utils.extensions.StringsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import midas.service.p509v1.MidasService;
import midas.service.p509v1.SwitchPlansContentRequestDto;
import midas.service.p509v1.SwitchPlansContentResponse;
import midas.service.p509v1.SwitchPlansContentResponseDto;

/* compiled from: GoldSwitchPlansDuxo.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u001c\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/gold/switchplans/GoldSwitchPlansDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/gold/switchplans/GoldSwitchPlansViewState;", "midasService", "Lmidas/service/v1/MidasService;", "goldSubscriptionStore", "Lcom/robinhood/android/gold/subscription/store/GoldSubscriptionStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lmidas/service/v1/MidasService;Lcom/robinhood/android/gold/subscription/store/GoldSubscriptionStore;Lcom/robinhood/android/udf/DuxoBundle;)V", "onCreate", "", "switchPlans", "selectionPlanId", "", "onSwitchPlansSuccess", "Lkotlin/Function0;", "feature-gold-switch-plans_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class GoldSwitchPlansDuxo extends BaseDuxo4<GoldSwitchPlansViewState> {
    public static final int $stable = 8;
    private final GoldSubscriptionStore goldSubscriptionStore;
    private final MidasService midasService;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoldSwitchPlansDuxo(MidasService midasService, GoldSubscriptionStore goldSubscriptionStore, DuxoBundle duxoBundle) {
        super(GoldSwitchPlansViewState.Loading.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(midasService, "midasService");
        Intrinsics.checkNotNullParameter(goldSubscriptionStore, "goldSubscriptionStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.midasService = midasService;
        this.goldSubscriptionStore = goldSubscriptionStore;
    }

    /* compiled from: GoldSwitchPlansDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.gold.switchplans.GoldSwitchPlansDuxo$onCreate$1", m3645f = "GoldSwitchPlansDuxo.kt", m3646l = {29}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.gold.switchplans.GoldSwitchPlansDuxo$onCreate$1 */
    static final class C179401 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C179401(Continuation<? super C179401> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GoldSwitchPlansDuxo.this.new C179401(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C179401) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    MidasService midasService = GoldSwitchPlansDuxo.this.midasService;
                    SwitchPlansContentRequestDto switchPlansContentRequestDto = new SwitchPlansContentRequestDto(null, null, null, 7, null);
                    this.label = 1;
                    obj = midasService.SwitchPlansContent(switchPlansContentRequestDto, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                GoldSwitchPlansDuxo.this.applyMutation(new AnonymousClass1(((SwitchPlansContentResponseDto) obj).toProto(), null));
            } catch (Exception e) {
                GoldSwitchPlansDuxo.this.applyMutation(new AnonymousClass2(e, null));
            }
            return Unit.INSTANCE;
        }

        /* compiled from: GoldSwitchPlansDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/gold/switchplans/GoldSwitchPlansViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.gold.switchplans.GoldSwitchPlansDuxo$onCreate$1$1", m3645f = "GoldSwitchPlansDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.gold.switchplans.GoldSwitchPlansDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<GoldSwitchPlansViewState, Continuation<? super GoldSwitchPlansViewState>, Object> {
            final /* synthetic */ SwitchPlansContentResponse $switchPlans;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(SwitchPlansContentResponse switchPlansContentResponse, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$switchPlans = switchPlansContentResponse;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$switchPlans, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(GoldSwitchPlansViewState goldSwitchPlansViewState, Continuation<? super GoldSwitchPlansViewState> continuation) {
                return ((AnonymousClass1) create(goldSwitchPlansViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return new GoldSwitchPlansViewState.Loaded(this.$switchPlans);
            }
        }

        /* compiled from: GoldSwitchPlansDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/gold/switchplans/GoldSwitchPlansViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.gold.switchplans.GoldSwitchPlansDuxo$onCreate$1$2", m3645f = "GoldSwitchPlansDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.gold.switchplans.GoldSwitchPlansDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<GoldSwitchPlansViewState, Continuation<? super GoldSwitchPlansViewState>, Object> {

            /* renamed from: $e */
            final /* synthetic */ Exception f4175$e;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(Exception exc, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.f4175$e = exc;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.f4175$e, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(GoldSwitchPlansViewState goldSwitchPlansViewState, Continuation<? super GoldSwitchPlansViewState> continuation) {
                return ((AnonymousClass2) create(goldSwitchPlansViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return new GoldSwitchPlansViewState.Error(this.f4175$e);
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C179401(null), 3, null);
    }

    /* compiled from: GoldSwitchPlansDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.gold.switchplans.GoldSwitchPlansDuxo$switchPlans$1", m3645f = "GoldSwitchPlansDuxo.kt", m3646l = {44}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.gold.switchplans.GoldSwitchPlansDuxo$switchPlans$1 */
    static final class C179411 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function0<Unit> $onSwitchPlansSuccess;
        final /* synthetic */ String $selectionPlanId;
        int label;
        final /* synthetic */ GoldSwitchPlansDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C179411(String str, GoldSwitchPlansDuxo goldSwitchPlansDuxo, Function0<Unit> function0, Continuation<? super C179411> continuation) {
            super(2, continuation);
            this.$selectionPlanId = str;
            this.this$0 = goldSwitchPlansDuxo;
            this.$onSwitchPlansSuccess = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C179411(this.$selectionPlanId, this.this$0, this.$onSwitchPlansSuccess, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C179411) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                GoldSwitchSubscriptionPlanRequest goldSwitchSubscriptionPlanRequest = new GoldSwitchSubscriptionPlanRequest(StringsKt.toUuid(this.$selectionPlanId));
                GoldSubscriptionStore goldSubscriptionStore = this.this$0.goldSubscriptionStore;
                this.label = 1;
                obj = goldSubscriptionStore.switchSubscriptionPlan(goldSwitchSubscriptionPlanRequest, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            GoldSwitchSubscriptionPlanResponse goldSwitchSubscriptionPlanResponse = (GoldSwitchSubscriptionPlanResponse) obj;
            if (!goldSwitchSubscriptionPlanResponse.getSuccess()) {
                this.this$0.applyMutation(new AnonymousClass1(goldSwitchSubscriptionPlanResponse, null));
            } else {
                this.$onSwitchPlansSuccess.invoke();
            }
            return Unit.INSTANCE;
        }

        /* compiled from: GoldSwitchPlansDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/gold/switchplans/GoldSwitchPlansViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.gold.switchplans.GoldSwitchPlansDuxo$switchPlans$1$1", m3645f = "GoldSwitchPlansDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.gold.switchplans.GoldSwitchPlansDuxo$switchPlans$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<GoldSwitchPlansViewState, Continuation<? super GoldSwitchPlansViewState>, Object> {
            final /* synthetic */ GoldSwitchSubscriptionPlanResponse $result;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(GoldSwitchSubscriptionPlanResponse goldSwitchSubscriptionPlanResponse, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$result = goldSwitchSubscriptionPlanResponse;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$result, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(GoldSwitchPlansViewState goldSwitchPlansViewState, Continuation<? super GoldSwitchPlansViewState> continuation) {
                return ((AnonymousClass1) create(goldSwitchPlansViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return new GoldSwitchPlansViewState.Error(new Error(this.$result.getDisplayStatusMessage()));
            }
        }
    }

    public final void switchPlans(String selectionPlanId, Function0<Unit> onSwitchPlansSuccess) {
        Intrinsics.checkNotNullParameter(selectionPlanId, "selectionPlanId");
        Intrinsics.checkNotNullParameter(onSwitchPlansSuccess, "onSwitchPlansSuccess");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C179411(selectionPlanId, this, onSwitchPlansSuccess, null), 3, null);
    }
}
