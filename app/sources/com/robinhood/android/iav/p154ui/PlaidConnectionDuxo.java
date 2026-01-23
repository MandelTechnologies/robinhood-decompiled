package com.robinhood.android.iav.p154ui;

import com.robinhood.android.api.gold.nativefunding.upsell.GoldNativeFundingUpsellApi;
import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.android.iav.experiment.GoldBackupBillingNewRhExperiment;
import com.robinhood.android.iav.p154ui.PlaidConnectionDuxo;
import com.robinhood.android.iav.p154ui.PlaidConnectionDuxo7;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.api.IavAccount;
import com.robinhood.shared.transfers.contracts.context.PlaidIavMetadata;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* compiled from: PlaidConnectionDuxo.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0006\u0010\u0011\u001a\u00020\u0010J\u0006\u0010\u0012\u001a\u00020\u0010J\u0010\u0010\u0013\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u0016\u0010\u0016\u001a\u00020\u00102\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u0018H\u0002J\u0006\u0010\u0019\u001a\u00020\u0010J\u001e\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u001f\u001a\u00020\u0010R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/iav/ui/PlaidConnectionDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/iav/ui/PlaidConnectionDuxoDS;", "Lcom/robinhood/android/iav/ui/PlaidConnectionDuxoVS;", "Lcom/robinhood/android/iav/ui/PlaidConnectionDuxoEvents;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "goldNativeFundingUpsellApi", "Lcom/robinhood/android/api/gold/nativefunding/upsell/GoldNativeFundingUpsellApi;", "transfersBonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/android/api/gold/nativefunding/upsell/GoldNativeFundingUpsellApi;Lcom/robinhood/android/api/transfers/TransfersBonfireApi;Lcom/robinhood/android/udf/DuxoBundle;)V", "onCreate", "", "linkDebitCardClicked", "plaidExited", "manualLinkingRequested", PlaidExchangeTokenFragment.ARG_PLAID_IAV_METADATA, "Lcom/robinhood/shared/transfers/contracts/context/PlaidIavMetadata;", "executeRetrieval", "finishedCallback", "Lkotlin/Function0;", "popupWasShown", "onShowOnboardingGoldUpsellAfterPlaidConnection", "iavAccountAccessToken", "", "iavAccount", "Lcom/robinhood/models/api/IavAccount;", "onGoldUpsellAfterIavAccountCompleted", "feature-iav_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class PlaidConnectionDuxo extends BaseDuxo3<PlaidConnectionDuxoDS, PlaidConnectionDuxoVS, PlaidConnectionDuxo7> {
    public static final int $stable = 8;
    private final ExperimentsStore experimentsStore;
    private final GoldNativeFundingUpsellApi goldNativeFundingUpsellApi;
    private final TransfersBonfireApi transfersBonfireApi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaidConnectionDuxo(ExperimentsStore experimentsStore, GoldNativeFundingUpsellApi goldNativeFundingUpsellApi, TransfersBonfireApi transfersBonfireApi, DuxoBundle duxoBundle) {
        super(new PlaidConnectionDuxoDS(false, false, null, false, false, false, null, null, null, false, false, false, 4091, null), new PlaidConnectionDuxo9(), duxoBundle);
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(goldNativeFundingUpsellApi, "goldNativeFundingUpsellApi");
        Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.experimentsStore = experimentsStore;
        this.goldNativeFundingUpsellApi = goldNativeFundingUpsellApi;
        this.transfersBonfireApi = transfersBonfireApi;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        executeRetrieval(new Function0() { // from class: com.robinhood.android.iav.ui.PlaidConnectionDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{GoldBackupBillingNewRhExperiment.INSTANCE}, false, null, 6, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.iav.ui.PlaidConnectionDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PlaidConnectionDuxo.onCreate$lambda$1(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(PlaidConnectionDuxo plaidConnectionDuxo, boolean z) {
        plaidConnectionDuxo.applyMutation(new PlaidConnectionDuxo2(z, null));
        if (z) {
            BuildersKt__Builders_commonKt.launch$default(plaidConnectionDuxo.getLifecycleScope(), null, null, new PlaidConnectionDuxo3(plaidConnectionDuxo, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    public final void linkDebitCardClicked() {
        submit(PlaidConnectionDuxo7.NavigateToDebitCard.INSTANCE);
    }

    /* compiled from: PlaidConnectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/iav/ui/PlaidConnectionDuxoDS;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.iav.ui.PlaidConnectionDuxo$plaidExited$1", m3645f = "PlaidConnectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.iav.ui.PlaidConnectionDuxo$plaidExited$1 */
    static final class C184891 extends ContinuationImpl7 implements Function2<PlaidConnectionDuxoDS, Continuation<? super PlaidConnectionDuxoDS>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C184891(Continuation<? super C184891> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C184891 c184891 = PlaidConnectionDuxo.this.new C184891(continuation);
            c184891.L$0 = obj;
            return c184891;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PlaidConnectionDuxoDS plaidConnectionDuxoDS, Continuation<? super PlaidConnectionDuxoDS> continuation) {
            return ((C184891) create(plaidConnectionDuxoDS, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            PlaidConnectionDuxoDS plaidConnectionDuxoDS = (PlaidConnectionDuxoDS) this.L$0;
            if (plaidConnectionDuxoDS.getServiceFeeParamRetreivalFinished()) {
                PlaidConnectionDuxoDS plaidConnectionDuxoDSCopy$default = PlaidConnectionDuxoDS.copy$default(plaidConnectionDuxoDS, true, false, null, false, false, false, null, null, null, false, false, false, 4094, null);
                if (plaidConnectionDuxoDS.getShowPopup()) {
                    PlaidConnectionDuxo.this.submit(PlaidConnectionDuxo7.LogAppear.INSTANCE);
                }
                return plaidConnectionDuxoDSCopy$default;
            }
            final PlaidConnectionDuxo plaidConnectionDuxo = PlaidConnectionDuxo.this;
            plaidConnectionDuxo.executeRetrieval(new Function0() { // from class: com.robinhood.android.iav.ui.PlaidConnectionDuxo$plaidExited$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PlaidConnectionDuxo.C184891.invokeSuspend$lambda$0(plaidConnectionDuxo);
                }
            });
            return plaidConnectionDuxoDS;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(PlaidConnectionDuxo plaidConnectionDuxo) {
            plaidConnectionDuxo.plaidExited();
            return Unit.INSTANCE;
        }
    }

    public final void plaidExited() {
        applyMutation(new C184891(null));
    }

    /* compiled from: PlaidConnectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/iav/ui/PlaidConnectionDuxoDS;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.iav.ui.PlaidConnectionDuxo$manualLinkingRequested$1", m3645f = "PlaidConnectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.iav.ui.PlaidConnectionDuxo$manualLinkingRequested$1 */
    static final class C184841 extends ContinuationImpl7 implements Function2<PlaidConnectionDuxoDS, Continuation<? super PlaidConnectionDuxoDS>, Object> {
        final /* synthetic */ PlaidIavMetadata $plaidIavMetadata;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C184841(PlaidIavMetadata plaidIavMetadata, Continuation<? super C184841> continuation) {
            super(2, continuation);
            this.$plaidIavMetadata = plaidIavMetadata;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C184841 c184841 = PlaidConnectionDuxo.this.new C184841(this.$plaidIavMetadata, continuation);
            c184841.L$0 = obj;
            return c184841;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PlaidConnectionDuxoDS plaidConnectionDuxoDS, Continuation<? super PlaidConnectionDuxoDS> continuation) {
            return ((C184841) create(plaidConnectionDuxoDS, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            PlaidConnectionDuxoDS plaidConnectionDuxoDS = (PlaidConnectionDuxoDS) this.L$0;
            if (plaidConnectionDuxoDS.getServiceFeeParamRetreivalFinished()) {
                if (plaidConnectionDuxoDS.getShowPopup()) {
                    return PlaidConnectionDuxoDS.copy$default(plaidConnectionDuxoDS, true, false, null, false, false, false, null, null, null, false, false, false, 4094, null);
                }
                PlaidConnectionDuxo.this.submit(new PlaidConnectionDuxo7.NavigateToManualLinkingScreen(this.$plaidIavMetadata));
                return plaidConnectionDuxoDS;
            }
            final PlaidConnectionDuxo plaidConnectionDuxo = PlaidConnectionDuxo.this;
            final PlaidIavMetadata plaidIavMetadata = this.$plaidIavMetadata;
            plaidConnectionDuxo.executeRetrieval(new Function0() { // from class: com.robinhood.android.iav.ui.PlaidConnectionDuxo$manualLinkingRequested$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PlaidConnectionDuxo.C184841.invokeSuspend$lambda$0(plaidConnectionDuxo, plaidIavMetadata);
                }
            });
            return plaidConnectionDuxoDS;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(PlaidConnectionDuxo plaidConnectionDuxo, PlaidIavMetadata plaidIavMetadata) {
            plaidConnectionDuxo.manualLinkingRequested(plaidIavMetadata);
            return Unit.INSTANCE;
        }
    }

    public final void manualLinkingRequested(PlaidIavMetadata plaidIavMetadata) {
        applyMutation(new C184841(plaidIavMetadata, null));
    }

    /* compiled from: PlaidConnectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/iav/ui/PlaidConnectionDuxoDS;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.iav.ui.PlaidConnectionDuxo$executeRetrieval$1", m3645f = "PlaidConnectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.iav.ui.PlaidConnectionDuxo$executeRetrieval$1 */
    static final class C184831 extends ContinuationImpl7 implements Function2<PlaidConnectionDuxoDS, Continuation<? super PlaidConnectionDuxoDS>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C184831(Continuation<? super C184831> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C184831 c184831 = new C184831(continuation);
            c184831.L$0 = obj;
            return c184831;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PlaidConnectionDuxoDS plaidConnectionDuxoDS, Continuation<? super PlaidConnectionDuxoDS> continuation) {
            return ((C184831) create(plaidConnectionDuxoDS, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return PlaidConnectionDuxoDS.copy$default((PlaidConnectionDuxoDS) this.L$0, false, false, null, false, true, false, null, null, null, false, false, false, 4079, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void executeRetrieval(Function0<Unit> finishedCallback) {
        applyMutation(new C184831(null));
        finishedCallback.invoke();
    }

    /* compiled from: PlaidConnectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/iav/ui/PlaidConnectionDuxoDS;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.iav.ui.PlaidConnectionDuxo$popupWasShown$1", m3645f = "PlaidConnectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.iav.ui.PlaidConnectionDuxo$popupWasShown$1 */
    static final class C184901 extends ContinuationImpl7 implements Function2<PlaidConnectionDuxoDS, Continuation<? super PlaidConnectionDuxoDS>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C184901(Continuation<? super C184901> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C184901 c184901 = new C184901(continuation);
            c184901.L$0 = obj;
            return c184901;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PlaidConnectionDuxoDS plaidConnectionDuxoDS, Continuation<? super PlaidConnectionDuxoDS> continuation) {
            return ((C184901) create(plaidConnectionDuxoDS, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return PlaidConnectionDuxoDS.copy$default((PlaidConnectionDuxoDS) this.L$0, false, false, null, false, false, true, null, null, null, false, false, false, 4063, null);
        }
    }

    public final void popupWasShown() {
        applyMutation(new C184901(null));
    }

    public final void onShowOnboardingGoldUpsellAfterPlaidConnection(final String iavAccountAccessToken, final IavAccount iavAccount, final PlaidIavMetadata plaidIavMetadata) {
        Intrinsics.checkNotNullParameter(iavAccountAccessToken, "iavAccountAccessToken");
        Intrinsics.checkNotNullParameter(iavAccount, "iavAccount");
        Intrinsics.checkNotNullParameter(plaidIavMetadata, "plaidIavMetadata");
        withDataState(new Function1() { // from class: com.robinhood.android.iav.ui.PlaidConnectionDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PlaidConnectionDuxo.onShowOnboardingGoldUpsellAfterPlaidConnection$lambda$2(this.f$0, iavAccountAccessToken, iavAccount, plaidIavMetadata, (PlaidConnectionDuxoDS) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onShowOnboardingGoldUpsellAfterPlaidConnection$lambda$2(PlaidConnectionDuxo plaidConnectionDuxo, String str, IavAccount iavAccount, PlaidIavMetadata plaidIavMetadata, PlaidConnectionDuxoDS state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state.isGoldBackupBillingMember()) {
            if (!state.getHasShownGoldNativeFundingUpsell() && state.isOnboardingGoldUpsellAvailable()) {
                plaidConnectionDuxo.submit(new PlaidConnectionDuxo7.NavigateToCreateIavRelationship(true, str, iavAccount, plaidIavMetadata));
                plaidConnectionDuxo.applyMutation(new PlaidConnectionDuxo4(str, iavAccount, plaidIavMetadata, null));
            } else {
                plaidConnectionDuxo.submit(new PlaidConnectionDuxo7.NavigateToQueuedDepositScreen(str, iavAccount, plaidIavMetadata));
            }
        } else if (!state.getHasShownGoldNativeFundingUpsell()) {
            plaidConnectionDuxo.submit(new PlaidConnectionDuxo7.NavigateToOnboardingGoldNativeFundingUpsell(false));
            plaidConnectionDuxo.applyMutation(new PlaidConnectionDuxo5(str, iavAccount, plaidIavMetadata, null));
        } else {
            plaidConnectionDuxo.submit(new PlaidConnectionDuxo7.NavigateToQueuedDepositScreen(str, iavAccount, plaidIavMetadata));
        }
        return Unit.INSTANCE;
    }

    /* compiled from: PlaidConnectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/iav/ui/PlaidConnectionDuxoDS;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.iav.ui.PlaidConnectionDuxo$onGoldUpsellAfterIavAccountCompleted$1", m3645f = "PlaidConnectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.iav.ui.PlaidConnectionDuxo$onGoldUpsellAfterIavAccountCompleted$1 */
    static final class C184861 extends ContinuationImpl7 implements Function2<PlaidConnectionDuxoDS, Continuation<? super PlaidConnectionDuxoDS>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C184861(Continuation<? super C184861> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C184861 c184861 = PlaidConnectionDuxo.this.new C184861(continuation);
            c184861.L$0 = obj;
            return c184861;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PlaidConnectionDuxoDS plaidConnectionDuxoDS, Continuation<? super PlaidConnectionDuxoDS> continuation) {
            return ((C184861) create(plaidConnectionDuxoDS, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            PlaidConnectionDuxoDS plaidConnectionDuxoDS = (PlaidConnectionDuxoDS) this.L$0;
            if (plaidConnectionDuxoDS.isGoldBackupBillingMember()) {
                if (plaidConnectionDuxoDS.getIavAccountAccessToken() != null && plaidConnectionDuxoDS.getIavAccount() != null) {
                    PlaidConnectionDuxo.this.submit(new PlaidConnectionDuxo7.NavigateToNormalDepositScreen(plaidConnectionDuxoDS.getIavAccountAccessToken(), plaidConnectionDuxoDS.getIavAccount()));
                }
            } else if (plaidConnectionDuxoDS.getIavAccountAccessToken() != null && plaidConnectionDuxoDS.getIavAccount() != null && plaidConnectionDuxoDS.getPlaidIavMetadata() != null) {
                PlaidConnectionDuxo.this.submit(new PlaidConnectionDuxo7.NavigateToQueuedDepositScreen(plaidConnectionDuxoDS.getIavAccountAccessToken(), plaidConnectionDuxoDS.getIavAccount(), plaidConnectionDuxoDS.getPlaidIavMetadata()));
            }
            return PlaidConnectionDuxoDS.copy$default(plaidConnectionDuxoDS, false, false, null, false, false, false, null, null, null, true, false, false, 3135, null);
        }
    }

    public final void onGoldUpsellAfterIavAccountCompleted() {
        applyMutation(new C184861(null));
    }
}
