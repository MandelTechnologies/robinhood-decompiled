package com.robinhood.android.creditcard.p091ui.creditapplication.identity.confirmInfo;

import androidx.lifecycle.ViewModel2;
import com.robinhood.android.creditcard.p091ui.CreditCardBonusPointsUiRolloutExperiment;
import com.robinhood.android.creditcard.p091ui.CreditCardFreeGoldUiRolloutExperiment;
import com.robinhood.android.creditcard.p091ui.creditapplication.incentive.bonus.points.BonusPointsTextVariant;
import com.robinhood.android.lib.store.creditcard.CreditCardStore;
import com.robinhood.android.models.creditcard.api.graphql.GraphqlValidationType;
import com.robinhood.android.models.creditcard.api.graphql.IdentityDetailsPrefillResponse;
import com.robinhood.android.models.creditcard.api.graphql.IdentityDetailsPrefillResponse2;
import com.robinhood.android.models.creditcard.api.graphql.OfferQueryResponse2;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.coroutines.dagger.annotation.DefaultDispatcher;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import io.reactivex.Observable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: ConfirmInfoDuxo.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u0006\u0010\u0010\u001a\u00020\u000eJ\u0006\u0010\u0011\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/identity/confirmInfo/ConfirmInfoDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/creditcard/ui/creditapplication/identity/confirmInfo/ConfirmInfoViewState;", "creditCardStore", "Lcom/robinhood/android/lib/store/creditcard/CreditCardStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "defaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/lib/store/creditcard/CreditCardStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lkotlinx/coroutines/CoroutineDispatcher;Lcom/robinhood/android/udf/DuxoBundle;)V", "onStart", "", "onResume", "dismissFreeGoldBottomSheet", "dismissBonusPointsBottomSheet", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class ConfirmInfoDuxo extends BaseDuxo4<ConfirmInfoViewState> {
    public static final int $stable = 8;
    private final CreditCardStore creditCardStore;
    private final CoroutineDispatcher defaultDispatcher;
    private final ExperimentsStore experimentsStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmInfoDuxo(CreditCardStore creditCardStore, ExperimentsStore experimentsStore, @DefaultDispatcher CoroutineDispatcher defaultDispatcher, DuxoBundle duxoBundle) {
        super(new ConfirmInfoViewState(null, false, null, 7, null), duxoBundle);
        Intrinsics.checkNotNullParameter(creditCardStore, "creditCardStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.creditCardStore = creditCardStore;
        this.experimentsStore = experimentsStore;
        this.defaultDispatcher = defaultDispatcher;
    }

    /* compiled from: ConfirmInfoDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.identity.confirmInfo.ConfirmInfoDuxo$onStart$1", m3645f = "ConfirmInfoDuxo.kt", m3646l = {108, 109, 38}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.identity.confirmInfo.ConfirmInfoDuxo$onStart$1 */
    static final class C124111 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        int label;

        C124111(Continuation<? super C124111> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ConfirmInfoDuxo.this.new C124111(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C124111) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0098  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00be  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00c4  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Boolean bool;
            Object objHasActiveOffers;
            Boolean bool2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Observable observableStreamState$default = ExperimentsProvider.DefaultImpls.streamState$default(ConfirmInfoDuxo.this.experimentsStore, new Experiment[]{CreditCardFreeGoldUiRolloutExperiment.INSTANCE}, false, null, 6, null);
                this.label = 1;
                obj = RxAwait3.awaitFirst(observableStreamState$default, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bool2 = (Boolean) this.L$1;
                    bool = (Boolean) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    Map map = (Map) obj;
                    if (!bool.booleanValue() && Intrinsics.areEqual(map.get(OfferQueryResponse2.RH_CREDIT_APPLICATION_FREE_GOLD_MEMBERSHIP), boxing.boxBoolean(true))) {
                        ConfirmInfoDuxo.this.applyMutation(new AnonymousClass1(null));
                    } else if (bool2.booleanValue()) {
                        ConfirmInfoDuxo.this.applyMutation(new AnonymousClass2(map, null));
                    }
                    return Unit.INSTANCE;
                }
                bool = (Boolean) this.L$0;
                ResultKt.throwOnFailure(obj);
                Boolean bool3 = (Boolean) obj;
                CreditCardStore creditCardStore = ConfirmInfoDuxo.this.creditCardStore;
                OfferQueryResponse2[] offerQueryResponse2Arr = {OfferQueryResponse2.RH_CREDIT_APPLICATION_FREE_GOLD_MEMBERSHIP, OfferQueryResponse2.RH_CREDIT_APPLICATION_10K_POINTS, OfferQueryResponse2.RH_CREDIT_APPLICATION_15K_POINTS, OfferQueryResponse2.RH_CREDIT_APPLICATION_20K_POINTS};
                this.L$0 = bool;
                this.L$1 = bool3;
                this.label = 3;
                objHasActiveOffers = creditCardStore.hasActiveOffers(offerQueryResponse2Arr, this);
                if (objHasActiveOffers != coroutine_suspended) {
                    bool2 = bool3;
                    obj = objHasActiveOffers;
                    Map map2 = (Map) obj;
                    if (!bool.booleanValue()) {
                        if (bool2.booleanValue()) {
                        }
                    }
                    return Unit.INSTANCE;
                }
                return coroutine_suspended;
            }
            ResultKt.throwOnFailure(obj);
            Boolean bool4 = (Boolean) obj;
            Observable observableStreamState$default2 = ExperimentsProvider.DefaultImpls.streamState$default(ConfirmInfoDuxo.this.experimentsStore, new Experiment[]{CreditCardBonusPointsUiRolloutExperiment.INSTANCE}, false, null, 6, null);
            this.L$0 = bool4;
            this.label = 2;
            Object objAwaitFirst = RxAwait3.awaitFirst(observableStreamState$default2, this);
            if (objAwaitFirst != coroutine_suspended) {
                bool = bool4;
                obj = objAwaitFirst;
                Boolean bool32 = (Boolean) obj;
                CreditCardStore creditCardStore2 = ConfirmInfoDuxo.this.creditCardStore;
                OfferQueryResponse2[] offerQueryResponse2Arr2 = {OfferQueryResponse2.RH_CREDIT_APPLICATION_FREE_GOLD_MEMBERSHIP, OfferQueryResponse2.RH_CREDIT_APPLICATION_10K_POINTS, OfferQueryResponse2.RH_CREDIT_APPLICATION_15K_POINTS, OfferQueryResponse2.RH_CREDIT_APPLICATION_20K_POINTS};
                this.L$0 = bool;
                this.L$1 = bool32;
                this.label = 3;
                objHasActiveOffers = creditCardStore2.hasActiveOffers(offerQueryResponse2Arr2, this);
                if (objHasActiveOffers != coroutine_suspended) {
                }
            }
            return coroutine_suspended;
        }

        /* compiled from: ConfirmInfoDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/creditapplication/identity/confirmInfo/ConfirmInfoViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.identity.confirmInfo.ConfirmInfoDuxo$onStart$1$1", m3645f = "ConfirmInfoDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.identity.confirmInfo.ConfirmInfoDuxo$onStart$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<ConfirmInfoViewState, Continuation<? super ConfirmInfoViewState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ConfirmInfoViewState confirmInfoViewState, Continuation<? super ConfirmInfoViewState> continuation) {
                return ((AnonymousClass1) create(confirmInfoViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ConfirmInfoViewState.copy$default((ConfirmInfoViewState) this.L$0, null, true, null, 5, null);
            }
        }

        /* compiled from: ConfirmInfoDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/creditapplication/identity/confirmInfo/ConfirmInfoViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.identity.confirmInfo.ConfirmInfoDuxo$onStart$1$2", m3645f = "ConfirmInfoDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.identity.confirmInfo.ConfirmInfoDuxo$onStart$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<ConfirmInfoViewState, Continuation<? super ConfirmInfoViewState>, Object> {
            final /* synthetic */ Map<OfferQueryResponse2, Boolean> $offerEligibilityMap;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(Map<OfferQueryResponse2, Boolean> map, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$offerEligibilityMap = map;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$offerEligibilityMap, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ConfirmInfoViewState confirmInfoViewState, Continuation<? super ConfirmInfoViewState> continuation) {
                return ((AnonymousClass2) create(confirmInfoViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                BonusPointsTextVariant bonusPointsTextVariant;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ConfirmInfoViewState confirmInfoViewState = (ConfirmInfoViewState) this.L$0;
                if (Intrinsics.areEqual(this.$offerEligibilityMap.get(OfferQueryResponse2.RH_CREDIT_APPLICATION_20K_POINTS), boxing.boxBoolean(true))) {
                    bonusPointsTextVariant = BonusPointsTextVariant.BONUS_POINTS_20K;
                } else if (Intrinsics.areEqual(this.$offerEligibilityMap.get(OfferQueryResponse2.RH_CREDIT_APPLICATION_15K_POINTS), boxing.boxBoolean(true))) {
                    bonusPointsTextVariant = BonusPointsTextVariant.BONUS_POINTS_15K;
                } else {
                    bonusPointsTextVariant = Intrinsics.areEqual(this.$offerEligibilityMap.get(OfferQueryResponse2.RH_CREDIT_APPLICATION_10K_POINTS), boxing.boxBoolean(true)) ? BonusPointsTextVariant.BONUS_POINTS_10K : null;
                }
                return ConfirmInfoViewState.copy$default(confirmInfoViewState, null, false, bonusPointsTextVariant, 3, null);
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), this.defaultDispatcher, null, new C124111(null), 2, null);
    }

    /* compiled from: ConfirmInfoDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.identity.confirmInfo.ConfirmInfoDuxo$onResume$1", m3645f = "ConfirmInfoDuxo.kt", m3646l = {80}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.identity.confirmInfo.ConfirmInfoDuxo$onResume$1 */
    static final class C124101 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C124101(Continuation<? super C124101> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ConfirmInfoDuxo.this.new C124101(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C124101) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CreditCardStore creditCardStore = ConfirmInfoDuxo.this.creditCardStore;
                    this.label = 1;
                    obj = creditCardStore.getIdentityDetailsPrefill(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                ConfirmInfoDuxo.this.applyMutation(new AnonymousClass1((IdentityDetailsPrefillResponse) obj, null));
            } catch (Exception unused) {
            }
            return Unit.INSTANCE;
        }

        /* compiled from: ConfirmInfoDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/creditapplication/identity/confirmInfo/ConfirmInfoViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.identity.confirmInfo.ConfirmInfoDuxo$onResume$1$1", m3645f = "ConfirmInfoDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.identity.confirmInfo.ConfirmInfoDuxo$onResume$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<ConfirmInfoViewState, Continuation<? super ConfirmInfoViewState>, Object> {
            final /* synthetic */ IdentityDetailsPrefillResponse $res;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(IdentityDetailsPrefillResponse identityDetailsPrefillResponse, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$res = identityDetailsPrefillResponse;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$res, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ConfirmInfoViewState confirmInfoViewState, Continuation<? super ConfirmInfoViewState> continuation) {
                return ((AnonymousClass1) create(confirmInfoViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                GraphqlValidationType<IdentityDetailsPrefillResponse2> identityDetailsPrefill;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ConfirmInfoViewState confirmInfoViewState = (ConfirmInfoViewState) this.L$0;
                IdentityDetailsPrefillResponse identityDetailsPrefillResponse = this.$res;
                return ConfirmInfoViewState.copy$default(confirmInfoViewState, (identityDetailsPrefillResponse == null || (identityDetailsPrefill = identityDetailsPrefillResponse.getIdentityDetailsPrefill()) == null) ? null : identityDetailsPrefill.getData(), false, null, 6, null);
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onResume() {
        super.onResume();
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), this.defaultDispatcher, null, new C124101(null), 2, null);
    }

    /* compiled from: ConfirmInfoDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/creditapplication/identity/confirmInfo/ConfirmInfoViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.identity.confirmInfo.ConfirmInfoDuxo$dismissFreeGoldBottomSheet$1", m3645f = "ConfirmInfoDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.identity.confirmInfo.ConfirmInfoDuxo$dismissFreeGoldBottomSheet$1 */
    static final class C124091 extends ContinuationImpl7 implements Function2<ConfirmInfoViewState, Continuation<? super ConfirmInfoViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C124091(Continuation<? super C124091> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C124091 c124091 = new C124091(continuation);
            c124091.L$0 = obj;
            return c124091;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ConfirmInfoViewState confirmInfoViewState, Continuation<? super ConfirmInfoViewState> continuation) {
            return ((C124091) create(confirmInfoViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ConfirmInfoViewState.copy$default((ConfirmInfoViewState) this.L$0, null, false, null, 5, null);
        }
    }

    public final void dismissFreeGoldBottomSheet() {
        applyMutation(new C124091(null));
    }

    /* compiled from: ConfirmInfoDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/creditapplication/identity/confirmInfo/ConfirmInfoViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.identity.confirmInfo.ConfirmInfoDuxo$dismissBonusPointsBottomSheet$1", m3645f = "ConfirmInfoDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.identity.confirmInfo.ConfirmInfoDuxo$dismissBonusPointsBottomSheet$1 */
    static final class C124081 extends ContinuationImpl7 implements Function2<ConfirmInfoViewState, Continuation<? super ConfirmInfoViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C124081(Continuation<? super C124081> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C124081 c124081 = new C124081(continuation);
            c124081.L$0 = obj;
            return c124081;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ConfirmInfoViewState confirmInfoViewState, Continuation<? super ConfirmInfoViewState> continuation) {
            return ((C124081) create(confirmInfoViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ConfirmInfoViewState.copy$default((ConfirmInfoViewState) this.L$0, null, false, null, 3, null);
        }
    }

    public final void dismissBonusPointsBottomSheet() {
        applyMutation(new C124081(null));
    }
}
