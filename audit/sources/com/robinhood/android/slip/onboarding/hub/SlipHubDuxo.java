package com.robinhood.android.slip.onboarding.hub;

import com.robinhood.android.slip.onboarding.hub.SlipHubDuxo;
import com.robinhood.android.slip.onboarding.hub.SlipHubViewState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.api.retrofit.SlipApi;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.librobinhood.data.store.SlipEligibilityStore;
import com.robinhood.librobinhood.data.store.bonfire.slip.SlipHubStore;
import com.robinhood.librobinhood.data.store.bonfire.slip.SlipStatusStore;
import com.robinhood.models.api.ApiSlipConsentStatusRequestBody;
import com.robinhood.models.p320db.SlipEnabledResponse;
import com.robinhood.models.p320db.SlipHub;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.udf.UiEvent;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Observables;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Produce4;

/* compiled from: SlipHubDuxo.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u000e\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016J\u0018\u0010\u0017\u001a\u00020\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0019\u001a\u00020\u0016J\u0018\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0016H\u0002J\u001e\u0010\u001b\u001a\u00020\u0002*\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0019\u001a\u00020\u0016H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/hub/SlipHubDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/slip/onboarding/hub/SlipHubViewState;", "slipApi", "Lcom/robinhood/api/retrofit/SlipApi;", "slipHubStore", "Lcom/robinhood/librobinhood/data/store/bonfire/slip/SlipHubStore;", "slipEligibilityStore", "Lcom/robinhood/librobinhood/data/store/SlipEligibilityStore;", "slipStatusStore", "Lcom/robinhood/librobinhood/data/store/bonfire/slip/SlipStatusStore;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "<init>", "(Lcom/robinhood/api/retrofit/SlipApi;Lcom/robinhood/librobinhood/data/store/bonfire/slip/SlipHubStore;Lcom/robinhood/librobinhood/data/store/SlipEligibilityStore;Lcom/robinhood/librobinhood/data/store/bonfire/slip/SlipStatusStore;Lcom/robinhood/shared/store/user/UserStore;)V", "onStart", "", "updateSelectedAccountNumber", "selectedAccountNumber", "", "updateSlipConsentStatus", "isConsented", "", "updateAccountStatus", "accountNumber", "isEnabled", "updateSlipAccountStatus", "afterStatusUpdate", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class SlipHubDuxo extends OldBaseDuxo<SlipHubViewState> {
    public static final int $stable = 8;
    private final SlipApi slipApi;
    private final SlipEligibilityStore slipEligibilityStore;
    private final SlipHubStore slipHubStore;
    private final SlipStatusStore slipStatusStore;
    private final UserStore userStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SlipHubDuxo(SlipApi slipApi, SlipHubStore slipHubStore, SlipEligibilityStore slipEligibilityStore, SlipStatusStore slipStatusStore, UserStore userStore) {
        super(new SlipHubViewState(false, null, null, null, null, null, null, null, null, 511, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(slipApi, "slipApi");
        Intrinsics.checkNotNullParameter(slipHubStore, "slipHubStore");
        Intrinsics.checkNotNullParameter(slipEligibilityStore, "slipEligibilityStore");
        Intrinsics.checkNotNullParameter(slipStatusStore, "slipStatusStore");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        this.slipApi = slipApi;
        this.slipHubStore = slipHubStore;
        this.slipEligibilityStore = slipEligibilityStore;
        this.slipStatusStore = slipStatusStore;
        this.userStore = userStore;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        this.slipHubStore.refresh(true);
        this.slipStatusStore.refreshSlipAccountsStatusResponse(false);
        Observable<R> observableFlatMap = this.slipEligibilityStore.getSlipHubEnrollmentStatus().toObservable().doOnSubscribe(new C286611()).flatMap(new C286622());
        Intrinsics.checkNotNullExpressionValue(observableFlatMap, "flatMap(...)");
        ScopedObservable.subscribe$default(LifecycleHost.DefaultImpls.bind$default(this, observableFlatMap, (LifecycleEvent) null, 1, (Object) null), null, null, null, 7, null);
        LifecycleHost.DefaultImpls.bind$default(this, this.userStore.getUser(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.slip.onboarding.hub.SlipHubDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SlipHubDuxo.onStart$lambda$1(this.f$0, (User) obj);
            }
        });
    }

    /* compiled from: SlipHubDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.slip.onboarding.hub.SlipHubDuxo$onStart$1 */
    static final class C286611<T> implements Consumer {
        C286611() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SlipHubViewState accept$lambda$0(SlipHubViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return SlipHubViewState.copy$default(applyMutation, true, null, null, null, null, null, null, null, null, 510, null);
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(Disposable disposable) {
            SlipHubDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.slip.onboarding.hub.SlipHubDuxo$onStart$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SlipHubDuxo.C286611.accept$lambda$0((SlipHubViewState) obj);
                }
            });
        }
    }

    /* compiled from: SlipHubDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.slip.onboarding.hub.SlipHubDuxo$onStart$2 */
    static final class C286622<T, R> implements Function {

        /* compiled from: SlipHubDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.slip.onboarding.hub.SlipHubDuxo$onStart$2$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[SlipEligibilityStore.SlipHubEnrollmentStatus.values().length];
                try {
                    iArr[SlipEligibilityStore.SlipHubEnrollmentStatus.ENROLLED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[SlipEligibilityStore.SlipHubEnrollmentStatus.NOT_ELIGIBLE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[SlipEligibilityStore.SlipHubEnrollmentStatus.NOT_ENROLLED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        C286622() {
        }

        @Override // io.reactivex.functions.Function
        public final ObservableSource<? extends Unit> apply(SlipEligibilityStore.SlipHubEnrollmentStatus slipHubEnrollmentStatus) {
            Intrinsics.checkNotNullParameter(slipHubEnrollmentStatus, "slipHubEnrollmentStatus");
            int i = WhenMappings.$EnumSwitchMapping$0[slipHubEnrollmentStatus.ordinal()];
            if (i == 1) {
                Observables observables = Observables.INSTANCE;
                SlipHubDuxo slipHubDuxo = SlipHubDuxo.this;
                Observable<T> observableAsObservable = slipHubDuxo.asObservable(slipHubDuxo.slipHubStore.stream());
                SlipHubDuxo slipHubDuxo2 = SlipHubDuxo.this;
                return observables.combineLatest(observableAsObservable, slipHubDuxo2.asObservable(slipHubDuxo2.slipStatusStore.streamAccountsStatus())).map(new AnonymousClass1(SlipHubDuxo.this));
            }
            if (i == 2) {
                SlipHubDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.slip.onboarding.hub.SlipHubDuxo$onStart$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SlipHubDuxo.C286622.apply$lambda$0((SlipHubViewState) obj);
                    }
                });
                return Observable.just(Unit.INSTANCE);
            }
            if (i == 3) {
                SlipHubDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.slip.onboarding.hub.SlipHubDuxo$onStart$2$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SlipHubDuxo.C286622.apply$lambda$1((SlipHubViewState) obj);
                    }
                });
                return Observable.just(Unit.INSTANCE);
            }
            SlipHubDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.slip.onboarding.hub.SlipHubDuxo$onStart$2$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SlipHubDuxo.C286622.apply$lambda$2((SlipHubViewState) obj);
                }
            });
            return Observable.just(Unit.INSTANCE);
        }

        /* compiled from: SlipHubDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.slip.onboarding.hub.SlipHubDuxo$onStart$2$1, reason: invalid class name */
        static final class AnonymousClass1<T, R> implements Function {
            final /* synthetic */ SlipHubDuxo this$0;

            AnonymousClass1(SlipHubDuxo slipHubDuxo) {
                this.this$0 = slipHubDuxo;
            }

            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                apply((Tuples2<SlipHub, ? extends List<SlipEnabledResponse>>) obj);
                return Unit.INSTANCE;
            }

            public final void apply(Tuples2<SlipHub, ? extends List<SlipEnabledResponse>> tuples2) {
                Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                final SlipHub slipHubComponent1 = tuples2.component1();
                final List<SlipEnabledResponse> listComponent2 = tuples2.component2();
                this.this$0.applyMutation(new Function1() { // from class: com.robinhood.android.slip.onboarding.hub.SlipHubDuxo$onStart$2$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SlipHubDuxo.C286622.AnonymousClass1.apply$lambda$1(slipHubComponent1, listComponent2, (SlipHubViewState) obj);
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final SlipHubViewState apply$lambda$1(SlipHub slipHub, List list, SlipHubViewState applyMutation) {
                Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
                List list2 = list;
                LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list2, 10)), 16));
                for (T t : list2) {
                    linkedHashMap.put(((SlipEnabledResponse) t).getAccountNumber(), t);
                }
                return SlipHubViewState.copy$default(applyMutation, false, slipHub, null, null, null, null, linkedHashMap, null, null, 444, null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SlipHubViewState apply$lambda$0(SlipHubViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return SlipHubViewState.copy$default(applyMutation, false, null, new UiEvent(Unit.INSTANCE), null, null, null, null, null, null, 506, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SlipHubViewState apply$lambda$1(SlipHubViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return SlipHubViewState.copy$default(applyMutation, false, null, null, null, null, new UiEvent(Unit.INSTANCE), null, null, null, 478, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SlipHubViewState apply$lambda$2(SlipHubViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return SlipHubViewState.copy$default(applyMutation, false, null, null, null, null, null, null, null, null, 510, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(SlipHubDuxo slipHubDuxo, final User user) {
        Intrinsics.checkNotNullParameter(user, "user");
        slipHubDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.slip.onboarding.hub.SlipHubDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SlipHubDuxo.onStart$lambda$1$lambda$0(user, (SlipHubViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SlipHubViewState onStart$lambda$1$lambda$0(User user, SlipHubViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return SlipHubViewState.copy$default(applyMutation, false, null, null, null, null, null, null, null, user.getOrigin().getLocality(), 255, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SlipHubViewState updateSelectedAccountNumber$lambda$2(String str, SlipHubViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return SlipHubViewState.copy$default(applyMutation, false, null, null, null, null, null, null, str, null, 383, null);
    }

    public final void updateSelectedAccountNumber(final String selectedAccountNumber) {
        applyMutation(new Function1() { // from class: com.robinhood.android.slip.onboarding.hub.SlipHubDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SlipHubDuxo.updateSelectedAccountNumber$lambda$2(selectedAccountNumber, (SlipHubViewState) obj);
            }
        });
    }

    /* compiled from: SlipHubDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.slip.onboarding.hub.SlipHubDuxo$updateSlipConsentStatus$1", m3645f = "SlipHubDuxo.kt", m3646l = {93, 92}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.slip.onboarding.hub.SlipHubDuxo$updateSlipConsentStatus$1 */
    static final class C286641 extends ContinuationImpl7 implements Function2<Produce4<? super Unit>, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $isConsented;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C286641(boolean z, Continuation<? super C286641> continuation) {
            super(2, continuation);
            this.$isConsented = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C286641 c286641 = SlipHubDuxo.this.new C286641(this.$isConsented, continuation);
            c286641.L$0 = obj;
            return c286641;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Produce4<? super Unit> produce4, Continuation<? super Unit> continuation) {
            return ((C286641) create(produce4, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
        
            if (r1.send(r7, r6) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Produce4 produce4;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                produce4 = (Produce4) this.L$0;
                SlipApi slipApi = SlipHubDuxo.this.slipApi;
                ApiSlipConsentStatusRequestBody apiSlipConsentStatusRequestBody = new ApiSlipConsentStatusRequestBody(this.$isConsented);
                this.L$0 = produce4;
                this.label = 1;
                if (slipApi.updateSlipConsentStatus(apiSlipConsentStatusRequestBody, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            produce4 = (Produce4) this.L$0;
            ResultKt.throwOnFailure(obj);
            Unit unit = Unit.INSTANCE;
            this.L$0 = null;
            this.label = 2;
        }
    }

    public final void updateSlipConsentStatus(boolean isConsented) {
        Observable observableDoOnSubscribe = RxFactory.DefaultImpls.rxObservable$default(this, null, new C286641(isConsented, null), 1, null).doOnSubscribe(new C286652());
        Intrinsics.checkNotNullExpressionValue(observableDoOnSubscribe, "doOnSubscribe(...)");
        ScopedObservable.subscribe$default(LifecycleHost.DefaultImpls.bind$default(this, observableDoOnSubscribe, (LifecycleEvent) null, 1, (Object) null), null, new C286674(), new C286663(isConsented), 1, null);
    }

    /* compiled from: SlipHubDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.slip.onboarding.hub.SlipHubDuxo$updateSlipConsentStatus$2 */
    static final class C286652<T> implements Consumer {
        C286652() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SlipHubViewState accept$lambda$0(SlipHubViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return SlipHubViewState.copy$default(applyMutation, true, null, null, null, null, null, null, null, null, 510, null);
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(Disposable disposable) {
            SlipHubDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.slip.onboarding.hub.SlipHubDuxo$updateSlipConsentStatus$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SlipHubDuxo.C286652.accept$lambda$0((SlipHubViewState) obj);
                }
            });
        }
    }

    /* compiled from: SlipHubDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.slip.onboarding.hub.SlipHubDuxo$updateSlipConsentStatus$3 */
    static final class C286663 implements Action {
        final /* synthetic */ boolean $isConsented;

        C286663(boolean z) {
            this.$isConsented = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SlipHubViewState run$lambda$0(SlipHubDuxo slipHubDuxo, boolean z, SlipHubViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return slipHubDuxo.afterStatusUpdate(applyMutation, null, z);
        }

        @Override // io.reactivex.functions.Action
        public final void run() {
            final SlipHubDuxo slipHubDuxo = SlipHubDuxo.this;
            final boolean z = this.$isConsented;
            slipHubDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.slip.onboarding.hub.SlipHubDuxo$updateSlipConsentStatus$3$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SlipHubDuxo.C286663.run$lambda$0(slipHubDuxo, z, (SlipHubViewState) obj);
                }
            });
            SlipHubDuxo.this.slipHubStore.refresh(true);
        }
    }

    /* compiled from: SlipHubDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.slip.onboarding.hub.SlipHubDuxo$updateSlipConsentStatus$4 */
    static final class C286674<T> implements Consumer {
        C286674() {
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(Throwable th) {
            SlipHubDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.slip.onboarding.hub.SlipHubDuxo$updateSlipConsentStatus$4$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SlipHubDuxo.C286674.accept$lambda$0((SlipHubViewState) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SlipHubViewState accept$lambda$0(SlipHubViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return SlipHubViewState.copy$default(applyMutation, false, null, null, new UiEvent(SlipHubViewState.Result.Failure.INSTANCE), null, null, null, null, null, HttpStatusCode.BAD_GATEWAY_502, null);
        }
    }

    public final void updateAccountStatus(String accountNumber, boolean isEnabled) {
        if (accountNumber == null) {
            updateSlipConsentStatus(isEnabled);
        } else {
            updateSlipAccountStatus(accountNumber, isEnabled);
        }
    }

    /* compiled from: SlipHubDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.slip.onboarding.hub.SlipHubDuxo$updateSlipAccountStatus$1", m3645f = "SlipHubDuxo.kt", m3646l = {136}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.slip.onboarding.hub.SlipHubDuxo$updateSlipAccountStatus$1 */
    static final class C286631 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ boolean $isEnabled;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C286631(String str, boolean z, Continuation<? super C286631> continuation) {
            super(2, continuation);
            this.$accountNumber = str;
            this.$isEnabled = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C286631 c286631 = SlipHubDuxo.this.new C286631(this.$accountNumber, this.$isEnabled, continuation);
            c286631.L$0 = obj;
            return c286631;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C286631) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object objM28550constructorimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    SlipHubDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.slip.onboarding.hub.SlipHubDuxo$updateSlipAccountStatus$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return SlipHubDuxo.C286631.invokeSuspend$lambda$0((SlipHubViewState) obj2);
                        }
                    });
                    SlipHubDuxo slipHubDuxo = SlipHubDuxo.this;
                    String str = this.$accountNumber;
                    boolean z = this.$isEnabled;
                    Result.Companion companion = Result.INSTANCE;
                    SlipStatusStore slipStatusStore = slipHubDuxo.slipStatusStore;
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
            final SlipHubDuxo slipHubDuxo2 = SlipHubDuxo.this;
            if (Result.m28553exceptionOrNullimpl(objM28550constructorimpl) == null) {
                final SlipEnabledResponse slipEnabledResponse = (SlipEnabledResponse) objM28550constructorimpl;
                slipHubDuxo2.applyMutation(new Function1() { // from class: com.robinhood.android.slip.onboarding.hub.SlipHubDuxo$updateSlipAccountStatus$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return SlipHubDuxo.C286631.invokeSuspend$lambda$3$lambda$2(slipHubDuxo2, slipEnabledResponse, (SlipHubViewState) obj2);
                    }
                });
                slipHubDuxo2.slipHubStore.refresh(true);
            } else {
                slipHubDuxo2.applyMutation(new Function1() { // from class: com.robinhood.android.slip.onboarding.hub.SlipHubDuxo$updateSlipAccountStatus$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return SlipHubDuxo.C286631.invokeSuspend$lambda$5$lambda$4((SlipHubViewState) obj2);
                    }
                });
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SlipHubViewState invokeSuspend$lambda$0(SlipHubViewState slipHubViewState) {
            return SlipHubViewState.copy$default(slipHubViewState, true, null, null, null, null, null, null, null, null, 510, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SlipHubViewState invokeSuspend$lambda$3$lambda$2(SlipHubDuxo slipHubDuxo, SlipEnabledResponse slipEnabledResponse, SlipHubViewState slipHubViewState) {
            return slipHubDuxo.afterStatusUpdate(slipHubViewState, slipEnabledResponse.getAccountNumber(), slipEnabledResponse.isEnabled());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SlipHubViewState invokeSuspend$lambda$5$lambda$4(SlipHubViewState slipHubViewState) {
            return SlipHubViewState.copy$default(slipHubViewState, false, null, null, new UiEvent(SlipHubViewState.Result.Failure.INSTANCE), null, null, null, null, null, HttpStatusCode.BAD_GATEWAY_502, null);
        }
    }

    private final void updateSlipAccountStatus(String accountNumber, boolean isEnabled) {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C286631(accountNumber, isEnabled, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SlipHubViewState afterStatusUpdate(SlipHubViewState slipHubViewState, String str, boolean z) {
        String confirmationText = slipHubViewState.getConfirmationText(z, str);
        return SlipHubViewState.copy$default(slipHubViewState, false, null, null, confirmationText != null ? new UiEvent(new SlipHubViewState.Result.Success(confirmationText)) : null, z ? null : new UiEvent(Unit.INSTANCE), null, null, null, null, 486, null);
    }
}
