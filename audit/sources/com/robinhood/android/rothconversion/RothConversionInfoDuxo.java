package com.robinhood.android.rothconversion;

import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.transfers.AdvisoryIraRothConversionExperiment;
import com.robinhood.android.models.retirement.p194db.RothConversionInfoViewModel;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.bonfire.retirement.RothConversionStore;
import io.reactivex.rxkotlin.Observables;
import java.util.List;
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
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RothConversionInfoDuxo.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B;\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fB)\b\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0006\u0010\u0013\u001a\u00020\u0012J\b\u0010\u0014\u001a\u00020\u0012H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/rothconversion/RothConversionInfoDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/rothconversion/RothConversionInfoDataState;", "Lcom/robinhood/android/rothconversion/RothConversionInfoViewState;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "conversionStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RothConversionStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "stateProvider", "Lcom/robinhood/android/udf/StateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RothConversionStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/android/udf/StateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RothConversionStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/android/udf/DuxoBundle;)V", "onStart", "", "retryLoad", "loadConversionInfo", "feature-roth-conversion_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class RothConversionInfoDuxo extends BaseDuxo<RothConversionInfoDataState, RothConversionInfoViewState> {
    public static final int $stable = 8;
    private final AccountProvider accountProvider;
    private final RothConversionStore conversionStore;
    private final ExperimentsStore experimentsStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RothConversionInfoDuxo(AccountProvider accountProvider, RothConversionStore conversionStore, ExperimentsStore experimentsStore, StateProvider<? super RothConversionInfoDataState, ? extends RothConversionInfoViewState> stateProvider, DuxoBundle duxoBundle) {
        super(new RothConversionInfoDataState(null, null, null, false, 15, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(conversionStore, "conversionStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.accountProvider = accountProvider;
        this.conversionStore = conversionStore;
        this.experimentsStore = experimentsStore;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RothConversionInfoDuxo(AccountProvider accountProvider, RothConversionStore conversionStore, ExperimentsStore experimentsStore, DuxoBundle duxoBundle) {
        this(accountProvider, conversionStore, experimentsStore, RothConversionInfoDataState.INSTANCE.getStateProvider(), duxoBundle);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(conversionStore, "conversionStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        loadConversionInfo();
        AccountProvider.DefaultImpls.refresh$default(this.accountProvider, false, 1, null);
        LifecycleHost.DefaultImpls.bind$default(this, Observables.INSTANCE.zip(this.accountProvider.streamAllAccounts(), ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{AdvisoryIraRothConversionExperiment.INSTANCE}, false, null, 6, null)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.rothconversion.RothConversionInfoDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RothConversionInfoDuxo.onStart$lambda$0(this.f$0, (Tuples2) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$0(RothConversionInfoDuxo rothConversionInfoDuxo, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        rothConversionInfoDuxo.applyMutation(new RothConversionInfoDuxo4((List) tuples2.component1(), ((Boolean) tuples2.component2()).booleanValue(), null));
        return Unit.INSTANCE;
    }

    /* compiled from: RothConversionInfoDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/rothconversion/RothConversionInfoDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.rothconversion.RothConversionInfoDuxo$retryLoad$1", m3645f = "RothConversionInfoDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.rothconversion.RothConversionInfoDuxo$retryLoad$1 */
    static final class C277951 extends ContinuationImpl7 implements Function2<RothConversionInfoDataState, Continuation<? super RothConversionInfoDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C277951(Continuation<? super C277951> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C277951 c277951 = new C277951(continuation);
            c277951.L$0 = obj;
            return c277951;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(RothConversionInfoDataState rothConversionInfoDataState, Continuation<? super RothConversionInfoDataState> continuation) {
            return ((C277951) create(rothConversionInfoDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((RothConversionInfoDataState) this.L$0).mutateLoading();
        }
    }

    public final void retryLoad() {
        applyMutation(new C277951(null));
        loadConversionInfo();
    }

    private final void loadConversionInfo() {
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, this.conversionStore.getInfoQuery().invoke(), (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.rothconversion.RothConversionInfoDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RothConversionInfoDuxo.loadConversionInfo$lambda$1(this.f$0, (RothConversionInfoViewModel) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.rothconversion.RothConversionInfoDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RothConversionInfoDuxo.loadConversionInfo$lambda$2(this.f$0, (Throwable) obj);
            }
        }, null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadConversionInfo$lambda$1(RothConversionInfoDuxo rothConversionInfoDuxo, RothConversionInfoViewModel viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        rothConversionInfoDuxo.applyMutation(new RothConversionInfoDuxo2(viewModel, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadConversionInfo$lambda$2(RothConversionInfoDuxo rothConversionInfoDuxo, Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        rothConversionInfoDuxo.applyMutation(new RothConversionInfoDuxo3(throwable, null));
        return Unit.INSTANCE;
    }
}
