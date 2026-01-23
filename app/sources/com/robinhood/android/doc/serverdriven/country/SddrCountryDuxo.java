package com.robinhood.android.doc.serverdriven.country;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.doc.serverdriven.country.SddrCountryFragment;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.shared.store.user.UserStore;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;

/* compiled from: SddrCountryDuxo.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0015B1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/doc/serverdriven/country/SddrCountryDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/doc/serverdriven/country/SddrCountryDataState;", "Lcom/robinhood/android/doc/serverdriven/country/SddrCountryViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "stateProvider", "Lcom/robinhood/android/doc/serverdriven/country/SddrCountryStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/android/doc/serverdriven/country/SddrCountryStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "Companion", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class SddrCountryDuxo extends BaseDuxo<SddrCountryDataState, SddrCountryViewState> implements HasSavedState {
    private final ExperimentsStore experimentsStore;
    private final SavedStateHandle savedStateHandle;
    private final UserStore userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SddrCountryDuxo(ExperimentsStore experimentsStore, UserStore userStore, SddrCountryStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Companion companion = INSTANCE;
        super(new SddrCountryDataState(((SddrCountryFragment.Args) companion.getArgs(savedStateHandle)).getContent(), null, null, ((SddrCountryFragment.Args) companion.getArgs(savedStateHandle)).getSelected(), 6, null), stateProvider, duxoBundle);
        this.experimentsStore = experimentsStore;
        this.userStore = userStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C142791(null));
    }

    /* compiled from: SddrCountryDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.doc.serverdriven.country.SddrCountryDuxo$onCreate$1", m3645f = "SddrCountryDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.doc.serverdriven.country.SddrCountryDuxo$onCreate$1 */
    static final class C142791 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C142791(Continuation<? super C142791> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C142791 c142791 = SddrCountryDuxo.this.new C142791(continuation);
            c142791.L$0 = obj;
            return c142791;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C142791) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                SddrCountryDuxo.this.applyMutation(new AnonymousClass1(BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new SddrCountryDuxo3(SddrCountryDuxo.this, null), 3, null), BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new SddrCountryDuxo2(SddrCountryDuxo.this, null), 3, null), null));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: SddrCountryDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/doc/serverdriven/country/SddrCountryDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.doc.serverdriven.country.SddrCountryDuxo$onCreate$1$1", m3645f = "SddrCountryDuxo.kt", m3646l = {47, 48}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.doc.serverdriven.country.SddrCountryDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<SddrCountryDataState, Continuation<? super SddrCountryDataState>, Object> {
            final /* synthetic */ Deferred<Boolean> $inExperiment;
            final /* synthetic */ Deferred<CountryCode.Supported> $userLocality;
            private /* synthetic */ Object L$0;
            Object L$1;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(Deferred<? extends CountryCode.Supported> deferred, Deferred<Boolean> deferred2, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$userLocality = deferred;
                this.$inExperiment = deferred2;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$userLocality, this.$inExperiment, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(SddrCountryDataState sddrCountryDataState, Continuation<? super SddrCountryDataState> continuation) {
                return ((AnonymousClass1) create(sddrCountryDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                SddrCountryDataState sddrCountryDataState;
                CountryCode.Supported supported;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    SddrCountryDataState sddrCountryDataState2 = (SddrCountryDataState) this.L$0;
                    Deferred<CountryCode.Supported> deferred = this.$userLocality;
                    this.L$0 = sddrCountryDataState2;
                    this.label = 1;
                    Object objAwait = deferred.await(this);
                    if (objAwait != coroutine_suspended) {
                        sddrCountryDataState = sddrCountryDataState2;
                        obj = objAwait;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    CountryCode.Supported supported2 = (CountryCode.Supported) this.L$1;
                    sddrCountryDataState = (SddrCountryDataState) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    supported = supported2;
                    return SddrCountryDataState.copy$default(sddrCountryDataState, null, boxing.boxBoolean(((Boolean) obj).booleanValue()), supported, null, 9, null);
                }
                sddrCountryDataState = (SddrCountryDataState) this.L$0;
                ResultKt.throwOnFailure(obj);
                CountryCode.Supported supported3 = (CountryCode.Supported) obj;
                Deferred<Boolean> deferred2 = this.$inExperiment;
                this.L$0 = sddrCountryDataState;
                this.L$1 = supported3;
                this.label = 2;
                Object objAwait2 = deferred2.await(this);
                if (objAwait2 != coroutine_suspended) {
                    supported = supported3;
                    obj = objAwait2;
                    return SddrCountryDataState.copy$default(sddrCountryDataState, null, boxing.boxBoolean(((Boolean) obj).booleanValue()), supported, null, 9, null);
                }
                return coroutine_suspended;
            }
        }
    }

    /* compiled from: SddrCountryDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/doc/serverdriven/country/SddrCountryDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/doc/serverdriven/country/SddrCountryDuxo;", "Lcom/robinhood/android/doc/serverdriven/country/SddrCountryFragment$Args;", "<init>", "()V", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<SddrCountryDuxo, SddrCountryFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public SddrCountryFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (SddrCountryFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public SddrCountryFragment.Args getArgs(SddrCountryDuxo sddrCountryDuxo) {
            return (SddrCountryFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, sddrCountryDuxo);
        }
    }
}
