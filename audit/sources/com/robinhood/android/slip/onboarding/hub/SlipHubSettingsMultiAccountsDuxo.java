package com.robinhood.android.slip.onboarding.hub;

import com.robinhood.android.slip.onboarding.hub.SlipHubSettingsMultiAccountsDataState;
import com.robinhood.android.slip.onboarding.hub.SlipHubSettingsMultiAccountsEvent;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.bonfire.slip.SlipHubStore;
import com.robinhood.librobinhood.data.store.bonfire.slip.SlipStatusStore;
import com.robinhood.models.p320db.SlipEnabledResponse;
import com.robinhood.models.p320db.SlipHub;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.shared.store.user.UserStore;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: SlipHubSettingsMultiAccountsDuxo.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0016\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u0016\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u0016\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u001a\u001a\u00020\u0012R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/hub/SlipHubSettingsMultiAccountsDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/slip/onboarding/hub/SlipHubSettingsMultiAccountsDataState;", "Lcom/robinhood/android/slip/onboarding/hub/SlipHubSettingsMultiAccountsViewState;", "Lcom/robinhood/android/slip/onboarding/hub/SlipHubSettingsMultiAccountsEvent;", "slipHubStore", "Lcom/robinhood/librobinhood/data/store/bonfire/slip/SlipHubStore;", "slipStatusStore", "Lcom/robinhood/librobinhood/data/store/bonfire/slip/SlipStatusStore;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "stateProvider", "Lcom/robinhood/android/slip/onboarding/hub/SlipHubSettingsMultiAccountsStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/slip/SlipHubStore;Lcom/robinhood/librobinhood/data/store/bonfire/slip/SlipStatusStore;Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/android/slip/onboarding/hub/SlipHubSettingsMultiAccountsStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "onCreate", "", "setAccountStatus", "accountNumber", "", "enabled", "", "onAccountToggled", "userTriedToChangeAccountStatus", "dismissAlert", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class SlipHubSettingsMultiAccountsDuxo extends BaseDuxo3<SlipHubSettingsMultiAccountsDataState, SlipHubSettingsMultiAccountsViewState, SlipHubSettingsMultiAccountsEvent> {
    public static final int $stable = 8;
    private final SlipHubStore slipHubStore;
    private final SlipStatusStore slipStatusStore;
    private final UserStore userStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlipHubSettingsMultiAccountsDuxo(SlipHubStore slipHubStore, SlipStatusStore slipStatusStore, UserStore userStore, SlipHubSettingsMultiAccountsStateProvider stateProvider, DuxoBundle duxoBundle) {
        super(new SlipHubSettingsMultiAccountsDataState(null, null, null, null, null, 31, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(slipHubStore, "slipHubStore");
        Intrinsics.checkNotNullParameter(slipStatusStore, "slipStatusStore");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.slipHubStore = slipHubStore;
        this.slipStatusStore = slipStatusStore;
        this.userStore = userStore;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C286721(null));
    }

    /* compiled from: SlipHubSettingsMultiAccountsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.slip.onboarding.hub.SlipHubSettingsMultiAccountsDuxo$onCreate$1", m3645f = "SlipHubSettingsMultiAccountsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.slip.onboarding.hub.SlipHubSettingsMultiAccountsDuxo$onCreate$1 */
    static final class C286721 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C286721(Continuation<? super C286721> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C286721 c286721 = SlipHubSettingsMultiAccountsDuxo.this.new C286721(continuation);
            c286721.L$0 = obj;
            return c286721;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C286721) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                SlipHubSettingsMultiAccountsDuxo.this.slipStatusStore.refreshSlipAccountsStatusResponse(true);
                SlipHubSettingsMultiAccountsDuxo.this.slipHubStore.refresh(true);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(SlipHubSettingsMultiAccountsDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(SlipHubSettingsMultiAccountsDuxo.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: SlipHubSettingsMultiAccountsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.slip.onboarding.hub.SlipHubSettingsMultiAccountsDuxo$onCreate$1$1", m3645f = "SlipHubSettingsMultiAccountsDuxo.kt", m3646l = {43}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.slip.onboarding.hub.SlipHubSettingsMultiAccountsDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ SlipHubSettingsMultiAccountsDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(SlipHubSettingsMultiAccountsDuxo slipHubSettingsMultiAccountsDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = slipHubSettingsMultiAccountsDuxo;
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
                    Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.this$0.userStore.getUser()), Integer.MAX_VALUE, null, 2, null);
                    C505461 c505461 = new C505461(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowBuffer$default, c505461, this) == coroutine_suspended) {
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

            /* compiled from: SlipHubSettingsMultiAccountsDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "user", "Lcom/robinhood/models/db/sheriff/User;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.slip.onboarding.hub.SlipHubSettingsMultiAccountsDuxo$onCreate$1$1$1", m3645f = "SlipHubSettingsMultiAccountsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.slip.onboarding.hub.SlipHubSettingsMultiAccountsDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C505461 extends ContinuationImpl7 implements Function2<User, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ SlipHubSettingsMultiAccountsDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C505461(SlipHubSettingsMultiAccountsDuxo slipHubSettingsMultiAccountsDuxo, Continuation<? super C505461> continuation) {
                    super(2, continuation);
                    this.this$0 = slipHubSettingsMultiAccountsDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C505461 c505461 = new C505461(this.this$0, continuation);
                    c505461.L$0 = obj;
                    return c505461;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(User user, Continuation<? super Unit> continuation) {
                    return ((C505461) create(user, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: SlipHubSettingsMultiAccountsDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/slip/onboarding/hub/SlipHubSettingsMultiAccountsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.slip.onboarding.hub.SlipHubSettingsMultiAccountsDuxo$onCreate$1$1$1$1", m3645f = "SlipHubSettingsMultiAccountsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.slip.onboarding.hub.SlipHubSettingsMultiAccountsDuxo$onCreate$1$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C505471 extends ContinuationImpl7 implements Function2<SlipHubSettingsMultiAccountsDataState, Continuation<? super SlipHubSettingsMultiAccountsDataState>, Object> {
                    final /* synthetic */ User $user;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C505471(User user, Continuation<? super C505471> continuation) {
                        super(2, continuation);
                        this.$user = user;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C505471 c505471 = new C505471(this.$user, continuation);
                        c505471.L$0 = obj;
                        return c505471;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(SlipHubSettingsMultiAccountsDataState slipHubSettingsMultiAccountsDataState, Continuation<? super SlipHubSettingsMultiAccountsDataState> continuation) {
                        return ((C505471) create(slipHubSettingsMultiAccountsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return SlipHubSettingsMultiAccountsDataState.copy$default((SlipHubSettingsMultiAccountsDataState) this.L$0, null, null, null, null, this.$user.getOrigin().getLocality(), 15, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C505471((User) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: SlipHubSettingsMultiAccountsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.slip.onboarding.hub.SlipHubSettingsMultiAccountsDuxo$onCreate$1$2", m3645f = "SlipHubSettingsMultiAccountsDuxo.kt", m3646l = {55}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.slip.onboarding.hub.SlipHubSettingsMultiAccountsDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ SlipHubSettingsMultiAccountsDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(SlipHubSettingsMultiAccountsDuxo slipHubSettingsMultiAccountsDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = slipHubSettingsMultiAccountsDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowCombine = FlowKt.combine(this.this$0.slipStatusStore.streamAccountsStatus(), this.this$0.slipHubStore.stream(), new AnonymousClass1(null));
                    C505482 c505482 = new C505482(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowCombine, c505482, this) == coroutine_suspended) {
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

            /* compiled from: SlipHubSettingsMultiAccountsDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lkotlin/Pair;", "", "Lcom/robinhood/models/db/SlipEnabledResponse;", "Lcom/robinhood/models/db/SlipHub;", "accountStatuses", "slipHub"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.slip.onboarding.hub.SlipHubSettingsMultiAccountsDuxo$onCreate$1$2$1", m3645f = "SlipHubSettingsMultiAccountsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.slip.onboarding.hub.SlipHubSettingsMultiAccountsDuxo$onCreate$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function3<List<? extends SlipEnabledResponse>, SlipHub, Continuation<? super Tuples2<? extends List<? extends SlipEnabledResponse>, ? extends SlipHub>>, Object> {
                /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;

                AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                    super(3, continuation);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(List<? extends SlipEnabledResponse> list, SlipHub slipHub, Continuation<? super Tuples2<? extends List<? extends SlipEnabledResponse>, ? extends SlipHub>> continuation) {
                    return invoke2((List<SlipEnabledResponse>) list, slipHub, (Continuation<? super Tuples2<? extends List<SlipEnabledResponse>, SlipHub>>) continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(List<SlipEnabledResponse> list, SlipHub slipHub, Continuation<? super Tuples2<? extends List<SlipEnabledResponse>, SlipHub>> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                    anonymousClass1.L$0 = list;
                    anonymousClass1.L$1 = slipHub;
                    return anonymousClass1.invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Tuples4.m3642to((List) this.L$0, (SlipHub) this.L$1);
                }
            }

            /* compiled from: SlipHubSettingsMultiAccountsDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "", "Lcom/robinhood/models/db/SlipEnabledResponse;", "Lcom/robinhood/models/db/SlipHub;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.slip.onboarding.hub.SlipHubSettingsMultiAccountsDuxo$onCreate$1$2$2", m3645f = "SlipHubSettingsMultiAccountsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.slip.onboarding.hub.SlipHubSettingsMultiAccountsDuxo$onCreate$1$2$2, reason: invalid class name and collision with other inner class name */
            static final class C505482 extends ContinuationImpl7 implements Function2<Tuples2<? extends List<? extends SlipEnabledResponse>, ? extends SlipHub>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ SlipHubSettingsMultiAccountsDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C505482(SlipHubSettingsMultiAccountsDuxo slipHubSettingsMultiAccountsDuxo, Continuation<? super C505482> continuation) {
                    super(2, continuation);
                    this.this$0 = slipHubSettingsMultiAccountsDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C505482 c505482 = new C505482(this.this$0, continuation);
                    c505482.L$0 = obj;
                    return c505482;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends List<? extends SlipEnabledResponse>, ? extends SlipHub> tuples2, Continuation<? super Unit> continuation) {
                    return invoke2((Tuples2<? extends List<SlipEnabledResponse>, SlipHub>) tuples2, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Tuples2<? extends List<SlipEnabledResponse>, SlipHub> tuples2, Continuation<? super Unit> continuation) {
                    return ((C505482) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: SlipHubSettingsMultiAccountsDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/slip/onboarding/hub/SlipHubSettingsMultiAccountsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.slip.onboarding.hub.SlipHubSettingsMultiAccountsDuxo$onCreate$1$2$2$1", m3645f = "SlipHubSettingsMultiAccountsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.slip.onboarding.hub.SlipHubSettingsMultiAccountsDuxo$onCreate$1$2$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<SlipHubSettingsMultiAccountsDataState, Continuation<? super SlipHubSettingsMultiAccountsDataState>, Object> {
                    final /* synthetic */ List<SlipEnabledResponse> $accountStatuses;
                    final /* synthetic */ SlipHub $slipHub;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(List<SlipEnabledResponse> list, SlipHub slipHub, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$accountStatuses = list;
                        this.$slipHub = slipHub;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$accountStatuses, this.$slipHub, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(SlipHubSettingsMultiAccountsDataState slipHubSettingsMultiAccountsDataState, Continuation<? super SlipHubSettingsMultiAccountsDataState> continuation) {
                        return ((AnonymousClass1) create(slipHubSettingsMultiAccountsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        SlipHubSettingsMultiAccountsDataState slipHubSettingsMultiAccountsDataState = (SlipHubSettingsMultiAccountsDataState) this.L$0;
                        List<SlipEnabledResponse> list = this.$accountStatuses;
                        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
                        for (Object obj2 : list) {
                            linkedHashMap.put(((SlipEnabledResponse) obj2).getAccountNumber(), obj2);
                        }
                        return SlipHubSettingsMultiAccountsDataState.copy$default(slipHubSettingsMultiAccountsDataState, linkedHashMap, null, this.$slipHub, null, null, 26, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        Tuples2 tuples2 = (Tuples2) this.L$0;
                        this.this$0.applyMutation(new AnonymousClass1((List) tuples2.component1(), (SlipHub) tuples2.component2(), null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    /* compiled from: SlipHubSettingsMultiAccountsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.slip.onboarding.hub.SlipHubSettingsMultiAccountsDuxo$setAccountStatus$1", m3645f = "SlipHubSettingsMultiAccountsDuxo.kt", m3646l = {74}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.slip.onboarding.hub.SlipHubSettingsMultiAccountsDuxo$setAccountStatus$1 */
    static final class C286731 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ boolean $enabled;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C286731(String str, boolean z, Continuation<? super C286731> continuation) {
            super(2, continuation);
            this.$accountNumber = str;
            this.$enabled = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C286731 c286731 = SlipHubSettingsMultiAccountsDuxo.this.new C286731(this.$accountNumber, this.$enabled, continuation);
            c286731.L$0 = obj;
            return c286731;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C286731) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: SlipHubSettingsMultiAccountsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/slip/onboarding/hub/SlipHubSettingsMultiAccountsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.slip.onboarding.hub.SlipHubSettingsMultiAccountsDuxo$setAccountStatus$1$1", m3645f = "SlipHubSettingsMultiAccountsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.slip.onboarding.hub.SlipHubSettingsMultiAccountsDuxo$setAccountStatus$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<SlipHubSettingsMultiAccountsDataState, Continuation<? super SlipHubSettingsMultiAccountsDataState>, Object> {
            final /* synthetic */ String $accountNumber;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(String str, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$accountNumber = str;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$accountNumber, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(SlipHubSettingsMultiAccountsDataState slipHubSettingsMultiAccountsDataState, Continuation<? super SlipHubSettingsMultiAccountsDataState> continuation) {
                return ((AnonymousClass1) create(slipHubSettingsMultiAccountsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                SlipHubSettingsMultiAccountsDataState slipHubSettingsMultiAccountsDataState = (SlipHubSettingsMultiAccountsDataState) this.L$0;
                return SlipHubSettingsMultiAccountsDataState.copy$default(slipHubSettingsMultiAccountsDataState, null, null, null, SetsKt.plus(slipHubSettingsMultiAccountsDataState.getAccountNumbersCurrentlyUpdating(), this.$accountNumber), null, 23, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object objM28550constructorimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    SlipHubSettingsMultiAccountsDuxo.this.applyMutation(new AnonymousClass1(this.$accountNumber, null));
                    SlipHubSettingsMultiAccountsDuxo slipHubSettingsMultiAccountsDuxo = SlipHubSettingsMultiAccountsDuxo.this;
                    String str = this.$accountNumber;
                    boolean z = this.$enabled;
                    Result.Companion companion = Result.INSTANCE;
                    SlipStatusStore slipStatusStore = slipHubSettingsMultiAccountsDuxo.slipStatusStore;
                    this.label = 1;
                    obj = slipStatusStore.updateSlipEnabledStatus(str, z, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                objM28550constructorimpl = Result.m28550constructorimpl((SlipEnabledResponse) obj);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
            }
            SlipHubSettingsMultiAccountsDuxo slipHubSettingsMultiAccountsDuxo2 = SlipHubSettingsMultiAccountsDuxo.this;
            String str2 = this.$accountNumber;
            Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
            if (thM28553exceptionOrNullimpl == null) {
                slipHubSettingsMultiAccountsDuxo2.applyMutation(new SlipHubSettingsMultiAccountsDuxo2((SlipEnabledResponse) objM28550constructorimpl, str2, slipHubSettingsMultiAccountsDuxo2, null));
            } else {
                slipHubSettingsMultiAccountsDuxo2.applyMutation(new SlipHubSettingsMultiAccountsDuxo3(str2, null));
                slipHubSettingsMultiAccountsDuxo2.submit(new SlipHubSettingsMultiAccountsEvent.Error(thM28553exceptionOrNullimpl));
            }
            return Unit.INSTANCE;
        }
    }

    public final void setAccountStatus(String accountNumber, boolean enabled) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C286731(accountNumber, enabled, null), 3, null);
    }

    public final void onAccountToggled(final String accountNumber, final boolean enabled) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        withDataState(new Function1() { // from class: com.robinhood.android.slip.onboarding.hub.SlipHubSettingsMultiAccountsDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SlipHubSettingsMultiAccountsDuxo.onAccountToggled$lambda$0(accountNumber, enabled, this, (SlipHubSettingsMultiAccountsDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAccountToggled$lambda$0(String str, boolean z, SlipHubSettingsMultiAccountsDuxo slipHubSettingsMultiAccountsDuxo, SlipHubSettingsMultiAccountsDataState dataState) {
        Map<String, SlipHub.SlipHubAccountDetails> accountDetailsMap;
        SlipHub.SlipHubAccountDetails slipHubAccountDetails;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        SlipHub slipHub = dataState.getSlipHub();
        String enableDeeplink = (slipHub == null || (accountDetailsMap = slipHub.getAccountDetailsMap()) == null || (slipHubAccountDetails = accountDetailsMap.get(str)) == null) ? null : slipHubAccountDetails.getEnableDeeplink();
        if (z && enableDeeplink != null) {
            slipHubSettingsMultiAccountsDuxo.submit(new SlipHubSettingsMultiAccountsEvent.Deeplink(enableDeeplink));
        } else {
            slipHubSettingsMultiAccountsDuxo.userTriedToChangeAccountStatus(str, z);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: SlipHubSettingsMultiAccountsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/slip/onboarding/hub/SlipHubSettingsMultiAccountsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.slip.onboarding.hub.SlipHubSettingsMultiAccountsDuxo$userTriedToChangeAccountStatus$1", m3645f = "SlipHubSettingsMultiAccountsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.slip.onboarding.hub.SlipHubSettingsMultiAccountsDuxo$userTriedToChangeAccountStatus$1 */
    static final class C286741 extends ContinuationImpl7 implements Function2<SlipHubSettingsMultiAccountsDataState, Continuation<? super SlipHubSettingsMultiAccountsDataState>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ boolean $enabled;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C286741(String str, boolean z, Continuation<? super C286741> continuation) {
            super(2, continuation);
            this.$accountNumber = str;
            this.$enabled = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C286741 c286741 = new C286741(this.$accountNumber, this.$enabled, continuation);
            c286741.L$0 = obj;
            return c286741;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SlipHubSettingsMultiAccountsDataState slipHubSettingsMultiAccountsDataState, Continuation<? super SlipHubSettingsMultiAccountsDataState> continuation) {
            return ((C286741) create(slipHubSettingsMultiAccountsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return SlipHubSettingsMultiAccountsDataState.copy$default((SlipHubSettingsMultiAccountsDataState) this.L$0, null, new SlipHubSettingsMultiAccountsDataState.DialogToShowData(this.$accountNumber, this.$enabled), null, null, null, 29, null);
        }
    }

    public final void userTriedToChangeAccountStatus(String accountNumber, boolean enabled) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        applyMutation(new C286741(accountNumber, enabled, null));
    }

    /* compiled from: SlipHubSettingsMultiAccountsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/slip/onboarding/hub/SlipHubSettingsMultiAccountsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.slip.onboarding.hub.SlipHubSettingsMultiAccountsDuxo$dismissAlert$1", m3645f = "SlipHubSettingsMultiAccountsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.slip.onboarding.hub.SlipHubSettingsMultiAccountsDuxo$dismissAlert$1 */
    static final class C286711 extends ContinuationImpl7 implements Function2<SlipHubSettingsMultiAccountsDataState, Continuation<? super SlipHubSettingsMultiAccountsDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C286711(Continuation<? super C286711> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C286711 c286711 = new C286711(continuation);
            c286711.L$0 = obj;
            return c286711;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SlipHubSettingsMultiAccountsDataState slipHubSettingsMultiAccountsDataState, Continuation<? super SlipHubSettingsMultiAccountsDataState> continuation) {
            return ((C286711) create(slipHubSettingsMultiAccountsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return SlipHubSettingsMultiAccountsDataState.copy$default((SlipHubSettingsMultiAccountsDataState) this.L$0, null, null, null, null, null, 29, null);
        }
    }

    public final void dismissAlert() {
        applyMutation(new C286711(null));
    }
}
