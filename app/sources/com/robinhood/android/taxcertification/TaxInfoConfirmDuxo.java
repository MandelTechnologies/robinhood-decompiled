package com.robinhood.android.taxcertification;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.taxcertification.TaxInfoConfirmViewState3;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.api.retrofit.Identi;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.identi.AddressStore;
import com.robinhood.models.api.identi.ApiLastFourSsn;
import com.robinhood.models.api.identi.ApiSsnAttempts;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.models.p355ui.identi.ResidentialAddress;
import com.robinhood.models.p355ui.identi.UiAddress;
import com.robinhood.shared.store.user.UserStore;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Observables;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TaxInfoConfirmDuxo.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0012B)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/taxcertification/TaxInfoConfirmDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/taxcertification/TaxInfoConfirmViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "addressStore", "Lcom/robinhood/librobinhood/data/store/identi/AddressStore;", "identi", "Lcom/robinhood/api/retrofit/Identi;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/identi/AddressStore;Lcom/robinhood/api/retrofit/Identi;Lcom/robinhood/shared/store/user/UserStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "Companion", "feature-tax-certification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class TaxInfoConfirmDuxo extends OldBaseDuxo<TaxInfoConfirmViewState> implements HasSavedState {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final AddressStore addressStore;
    private final Identi identi;
    private final SavedStateHandle savedStateHandle;
    private final UserStore userStore;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TaxInfoConfirmDuxo(AddressStore addressStore, Identi identi2, UserStore userStore, SavedStateHandle savedStateHandle) {
        super(new TaxInfoConfirmViewState(null, null, null, null, 15, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(addressStore, "addressStore");
        Intrinsics.checkNotNullParameter(identi2, "identi");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.addressStore = addressStore;
        this.identi = identi2;
        this.userStore = userStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        UserStore.refresh$default(this.userStore, false, 1, null);
        AddressStore.refreshResidentialAddress$default(this.addressStore, false, 1, null);
        Observables observables = Observables.INSTANCE;
        Observable<User> user = this.userStore.getUser();
        Observable<ResidentialAddress> observableStreamResidentialAddress = this.addressStore.streamResidentialAddress();
        final C292911 c292911 = new PropertyReference1Impl() { // from class: com.robinhood.android.taxcertification.TaxInfoConfirmDuxo.onStart.1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((ResidentialAddress) obj).getAddress();
            }
        };
        ObservableSource map = observableStreamResidentialAddress.map(new Function(c292911) { // from class: com.robinhood.android.taxcertification.TaxInfoConfirmDuxo$sam$io_reactivex_functions_Function$0
            private final /* synthetic */ Function1 function;

            {
                Intrinsics.checkNotNullParameter(c292911, "function");
                this.function = c292911;
            }

            @Override // io.reactivex.functions.Function
            public final /* synthetic */ Object apply(Object obj) {
                return this.function.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observables.combineLatest(user, map), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.taxcertification.TaxInfoConfirmDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TaxInfoConfirmDuxo.onStart$lambda$1(this.f$0, (Tuples2) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, RxFactory.DefaultImpls.rxSingle$default(this, null, new C292923(null), 1, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.taxcertification.TaxInfoConfirmDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TaxInfoConfirmDuxo.onStart$lambda$3(this.f$0, (TaxInfoConfirmViewState3) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, RxFactory.DefaultImpls.rxSingle$default(this, null, new C292935(null), 1, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.taxcertification.TaxInfoConfirmDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TaxInfoConfirmDuxo.onStart$lambda$5(this.f$0, (TaxInfoConfirmViewState2) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(TaxInfoConfirmDuxo taxInfoConfirmDuxo, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        final User user = (User) tuples2.component1();
        final UiAddress uiAddress = (UiAddress) tuples2.component2();
        taxInfoConfirmDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.taxcertification.TaxInfoConfirmDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TaxInfoConfirmDuxo.onStart$lambda$1$lambda$0(user, uiAddress, (TaxInfoConfirmViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TaxInfoConfirmViewState onStart$lambda$1$lambda$0(User user, UiAddress uiAddress, TaxInfoConfirmViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return TaxInfoConfirmViewState.copy$default(applyMutation, null, null, user.getFullName(), uiAddress, 3, null);
    }

    /* compiled from: TaxInfoConfirmDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/taxcertification/SsnDisplayState;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.taxcertification.TaxInfoConfirmDuxo$onStart$3", m3645f = "TaxInfoConfirmDuxo.kt", m3646l = {52}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.taxcertification.TaxInfoConfirmDuxo$onStart$3 */
    static final class C292923 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super TaxInfoConfirmViewState3>, Object> {
        int label;

        C292923(Continuation<? super C292923> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TaxInfoConfirmDuxo.this.new C292923(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super TaxInfoConfirmViewState3> continuation) {
            return ((C292923) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (((LegacyFragmentKey.VerifyTaxInfo) TaxInfoConfirmDuxo.INSTANCE.getArgs((HasSavedState) TaxInfoConfirmDuxo.this)).getShowSsn()) {
                        Identi identi2 = TaxInfoConfirmDuxo.this.identi;
                        this.label = 1;
                        obj = identi2.getLastFourSsn(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        return TaxInfoConfirmViewState3.Hide.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return new TaxInfoConfirmViewState3.Success(((ApiLastFourSsn) obj).getSsn());
            } catch (Exception unused) {
                return TaxInfoConfirmViewState3.Failure.INSTANCE;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$3(TaxInfoConfirmDuxo taxInfoConfirmDuxo, final TaxInfoConfirmViewState3 displayState) {
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        taxInfoConfirmDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.taxcertification.TaxInfoConfirmDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TaxInfoConfirmDuxo.onStart$lambda$3$lambda$2(displayState, (TaxInfoConfirmViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TaxInfoConfirmViewState onStart$lambda$3$lambda$2(TaxInfoConfirmViewState3 taxInfoConfirmViewState3, TaxInfoConfirmViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return TaxInfoConfirmViewState.copy$default(applyMutation, taxInfoConfirmViewState3, null, null, null, 14, null);
    }

    /* compiled from: TaxInfoConfirmDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/taxcertification/SsnAttemptState;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.taxcertification.TaxInfoConfirmDuxo$onStart$5", m3645f = "TaxInfoConfirmDuxo.kt", m3646l = {73}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.taxcertification.TaxInfoConfirmDuxo$onStart$5 */
    static final class C292935 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super TaxInfoConfirmViewState2>, Object> {
        int label;

        C292935(Continuation<? super C292935> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TaxInfoConfirmDuxo.this.new C292935(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super TaxInfoConfirmViewState2> continuation) {
            return ((C292935) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (((LegacyFragmentKey.VerifyTaxInfo) TaxInfoConfirmDuxo.INSTANCE.getArgs((HasSavedState) TaxInfoConfirmDuxo.this)).getShowSsn()) {
                        Identi identi2 = TaxInfoConfirmDuxo.this.identi;
                        this.label = 1;
                        obj = identi2.getSsnAttemptsLeft(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        return TaxInfoConfirmViewState2.LOCKED_OUT;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                if (((ApiSsnAttempts) obj).getHas_ssn_attempts_left()) {
                    return TaxInfoConfirmViewState2.CAN_ATTEMPT;
                }
                return TaxInfoConfirmViewState2.LOCKED_OUT;
            } catch (Exception unused) {
                return TaxInfoConfirmViewState2.CAN_ATTEMPT;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$5(TaxInfoConfirmDuxo taxInfoConfirmDuxo, final TaxInfoConfirmViewState2 attemptState) {
        Intrinsics.checkNotNullParameter(attemptState, "attemptState");
        taxInfoConfirmDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.taxcertification.TaxInfoConfirmDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TaxInfoConfirmDuxo.onStart$lambda$5$lambda$4(attemptState, (TaxInfoConfirmViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TaxInfoConfirmViewState onStart$lambda$5$lambda$4(TaxInfoConfirmViewState2 taxInfoConfirmViewState2, TaxInfoConfirmViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return TaxInfoConfirmViewState.copy$default(applyMutation, null, taxInfoConfirmViewState2, null, null, 13, null);
    }

    /* compiled from: TaxInfoConfirmDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/taxcertification/TaxInfoConfirmDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/taxcertification/TaxInfoConfirmDuxo;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$VerifyTaxInfo;", "<init>", "()V", "feature-tax-certification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<TaxInfoConfirmDuxo, LegacyFragmentKey.VerifyTaxInfo> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyFragmentKey.VerifyTaxInfo getArgs(SavedStateHandle savedStateHandle) {
            return (LegacyFragmentKey.VerifyTaxInfo) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyFragmentKey.VerifyTaxInfo getArgs(TaxInfoConfirmDuxo taxInfoConfirmDuxo) {
            return (LegacyFragmentKey.VerifyTaxInfo) DuxoCompanion.DefaultImpls.getArgs(this, taxInfoConfirmDuxo);
        }
    }
}
