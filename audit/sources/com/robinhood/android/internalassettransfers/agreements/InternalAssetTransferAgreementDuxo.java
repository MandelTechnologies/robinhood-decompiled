package com.robinhood.android.internalassettransfers.agreements;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.agreements.AgreementsStore;
import com.robinhood.android.agreements.models.UiAgreementWithContent;
import com.robinhood.android.internalassettransfers.agreements.InternalAssetTransferAgreementDataState;
import com.robinhood.android.internalassettransfers.agreements.InternalAssetTransferAgreementDuxo3;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: InternalAssetTransferAgreementDuxo.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u000eJ\b\u0010\u0013\u001a\u00020\u000eH\u0002J\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/agreements/InternalAssetTransferAgreementDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/internalassettransfers/agreements/InternalAssetTransferAgreementDataState;", "Lcom/robinhood/android/internalassettransfers/agreements/InternalAssetTransferAgreementViewState;", "Lcom/robinhood/android/internalassettransfers/agreements/InternalAssetTransferAgreementEvent;", "agreementsStore", "Lcom/robinhood/android/agreements/AgreementsStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/internalassettransfers/agreements/InternalAssetTransferAgreementStateProvider;", "<init>", "(Lcom/robinhood/android/agreements/AgreementsStore;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/internalassettransfers/agreements/InternalAssetTransferAgreementStateProvider;)V", "onStart", "", "onAgreeButtonClick", "agreement", "Lcom/robinhood/android/agreements/models/UiAgreementWithContent;", "onRetryButtonClick", "fetchAgreement", "signAgreement", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class InternalAssetTransferAgreementDuxo extends BaseDuxo3<InternalAssetTransferAgreementDataState, InternalAssetTransferAgreementViewState, InternalAssetTransferAgreementDuxo3> {
    public static final int $stable = 8;
    private final AgreementsStore agreementsStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternalAssetTransferAgreementDuxo(AgreementsStore agreementsStore, DuxoBundle duxoBundle, InternalAssetTransferAgreementStateProvider stateProvider) {
        super(new InternalAssetTransferAgreementDataState(null, null, 3, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(agreementsStore, "agreementsStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.agreementsStore = agreementsStore;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        fetchAgreement();
    }

    public final void onAgreeButtonClick(UiAgreementWithContent agreement) {
        Intrinsics.checkNotNullParameter(agreement, "agreement");
        signAgreement(agreement);
    }

    public final void onRetryButtonClick() {
        fetchAgreement();
    }

    /* compiled from: InternalAssetTransferAgreementDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/internalassettransfers/agreements/InternalAssetTransferAgreementDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.agreements.InternalAssetTransferAgreementDuxo$fetchAgreement$1", m3645f = "InternalAssetTransferAgreementDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.internalassettransfers.agreements.InternalAssetTransferAgreementDuxo$fetchAgreement$1 */
    static final class C190331 extends ContinuationImpl7 implements Function2<InternalAssetTransferAgreementDataState, Continuation<? super InternalAssetTransferAgreementDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C190331(Continuation<? super C190331> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C190331 c190331 = new C190331(continuation);
            c190331.L$0 = obj;
            return c190331;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InternalAssetTransferAgreementDataState internalAssetTransferAgreementDataState, Continuation<? super InternalAssetTransferAgreementDataState> continuation) {
            return ((C190331) create(internalAssetTransferAgreementDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return InternalAssetTransferAgreementDataState.copy$default((InternalAssetTransferAgreementDataState) this.L$0, InternalAssetTransferAgreementDataState.LcenState.Loading.INSTANCE, null, 2, null);
        }
    }

    private final void fetchAgreement() {
        applyMutation(new C190331(null));
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C190342(null), 3, null);
    }

    /* compiled from: InternalAssetTransferAgreementDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.agreements.InternalAssetTransferAgreementDuxo$fetchAgreement$2", m3645f = "InternalAssetTransferAgreementDuxo.kt", m3646l = {53}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.internalassettransfers.agreements.InternalAssetTransferAgreementDuxo$fetchAgreement$2 */
    static final class C190342 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C190342(Continuation<? super C190342> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InternalAssetTransferAgreementDuxo.this.new C190342(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C190342) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    AgreementsStore agreementsStore = InternalAssetTransferAgreementDuxo.this.agreementsStore;
                    this.label = 1;
                    obj = agreementsStore.getAgreementWithContent("internal_asset_transfer_agreement", this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                InternalAssetTransferAgreementDuxo.this.applyMutation(new AnonymousClass1((UiAgreementWithContent) obj, null));
            } catch (Exception e) {
                InternalAssetTransferAgreementDuxo.this.applyMutation(new AnonymousClass2(e, null));
            }
            return Unit.INSTANCE;
        }

        /* compiled from: InternalAssetTransferAgreementDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/internalassettransfers/agreements/InternalAssetTransferAgreementDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.agreements.InternalAssetTransferAgreementDuxo$fetchAgreement$2$1", m3645f = "InternalAssetTransferAgreementDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.internalassettransfers.agreements.InternalAssetTransferAgreementDuxo$fetchAgreement$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<InternalAssetTransferAgreementDataState, Continuation<? super InternalAssetTransferAgreementDataState>, Object> {
            final /* synthetic */ UiAgreementWithContent $agreement;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(UiAgreementWithContent uiAgreementWithContent, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$agreement = uiAgreementWithContent;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$agreement, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InternalAssetTransferAgreementDataState internalAssetTransferAgreementDataState, Continuation<? super InternalAssetTransferAgreementDataState> continuation) {
                return ((AnonymousClass1) create(internalAssetTransferAgreementDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return InternalAssetTransferAgreementDataState.copy$default((InternalAssetTransferAgreementDataState) this.L$0, new InternalAssetTransferAgreementDataState.LcenState.Content(this.$agreement), null, 2, null);
            }
        }

        /* compiled from: InternalAssetTransferAgreementDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/internalassettransfers/agreements/InternalAssetTransferAgreementDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.agreements.InternalAssetTransferAgreementDuxo$fetchAgreement$2$2", m3645f = "InternalAssetTransferAgreementDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.internalassettransfers.agreements.InternalAssetTransferAgreementDuxo$fetchAgreement$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<InternalAssetTransferAgreementDataState, Continuation<? super InternalAssetTransferAgreementDataState>, Object> {
            final /* synthetic */ Exception $exception;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(Exception exc, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$exception = exc;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$exception, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InternalAssetTransferAgreementDataState internalAssetTransferAgreementDataState, Continuation<? super InternalAssetTransferAgreementDataState> continuation) {
                return ((AnonymousClass2) create(internalAssetTransferAgreementDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return InternalAssetTransferAgreementDataState.copy$default((InternalAssetTransferAgreementDataState) this.L$0, new InternalAssetTransferAgreementDataState.LcenState.Error(this.$exception), null, 2, null);
            }
        }
    }

    /* compiled from: InternalAssetTransferAgreementDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/internalassettransfers/agreements/InternalAssetTransferAgreementDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.agreements.InternalAssetTransferAgreementDuxo$signAgreement$1", m3645f = "InternalAssetTransferAgreementDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.internalassettransfers.agreements.InternalAssetTransferAgreementDuxo$signAgreement$1 */
    static final class C190351 extends ContinuationImpl7 implements Function2<InternalAssetTransferAgreementDataState, Continuation<? super InternalAssetTransferAgreementDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C190351(Continuation<? super C190351> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C190351 c190351 = new C190351(continuation);
            c190351.L$0 = obj;
            return c190351;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InternalAssetTransferAgreementDataState internalAssetTransferAgreementDataState, Continuation<? super InternalAssetTransferAgreementDataState> continuation) {
            return ((C190351) create(internalAssetTransferAgreementDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return InternalAssetTransferAgreementDataState.copy$default((InternalAssetTransferAgreementDataState) this.L$0, null, InternalAssetTransferAgreementDataState.LcenState.Loading.INSTANCE, 1, null);
        }
    }

    private final void signAgreement(UiAgreementWithContent agreement) {
        applyMutation(new C190351(null));
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C190362(agreement, null), 3, null);
    }

    /* compiled from: InternalAssetTransferAgreementDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.agreements.InternalAssetTransferAgreementDuxo$signAgreement$2", m3645f = "InternalAssetTransferAgreementDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_GLOBE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.internalassettransfers.agreements.InternalAssetTransferAgreementDuxo$signAgreement$2 */
    static final class C190362 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UiAgreementWithContent $agreement;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C190362(UiAgreementWithContent uiAgreementWithContent, Continuation<? super C190362> continuation) {
            super(2, continuation);
            this.$agreement = uiAgreementWithContent;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InternalAssetTransferAgreementDuxo.this.new C190362(this.$agreement, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C190362) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            C190362 c190362;
            AgreementsStore agreementsStore;
            UiAgreementWithContent uiAgreementWithContent;
            Exception exc;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                try {
                    agreementsStore = InternalAssetTransferAgreementDuxo.this.agreementsStore;
                    uiAgreementWithContent = this.$agreement;
                    this.label = 1;
                    c190362 = this;
                } catch (Exception e) {
                    e = e;
                    c190362 = this;
                    exc = e;
                    InternalAssetTransferAgreementDuxo.this.applyMutation(new AnonymousClass2(exc, null));
                    return Unit.INSTANCE;
                }
                try {
                    if (AgreementsStore.signAgreement$default(agreementsStore, uiAgreementWithContent, null, null, c190362, 6, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (Exception e2) {
                    e = e2;
                    exc = e;
                    InternalAssetTransferAgreementDuxo.this.applyMutation(new AnonymousClass2(exc, null));
                    return Unit.INSTANCE;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                try {
                    ResultKt.throwOnFailure(obj);
                    c190362 = this;
                } catch (Exception e3) {
                    exc = e3;
                    c190362 = this;
                    InternalAssetTransferAgreementDuxo.this.applyMutation(new AnonymousClass2(exc, null));
                    return Unit.INSTANCE;
                }
            }
            InternalAssetTransferAgreementDuxo.this.applyMutation(new AnonymousClass1(c190362.$agreement, null));
            InternalAssetTransferAgreementDuxo.this.submit(InternalAssetTransferAgreementDuxo3.NavigateToReviewScreen.INSTANCE);
            return Unit.INSTANCE;
        }

        /* compiled from: InternalAssetTransferAgreementDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/internalassettransfers/agreements/InternalAssetTransferAgreementDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.agreements.InternalAssetTransferAgreementDuxo$signAgreement$2$1", m3645f = "InternalAssetTransferAgreementDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.internalassettransfers.agreements.InternalAssetTransferAgreementDuxo$signAgreement$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<InternalAssetTransferAgreementDataState, Continuation<? super InternalAssetTransferAgreementDataState>, Object> {
            final /* synthetic */ UiAgreementWithContent $agreement;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(UiAgreementWithContent uiAgreementWithContent, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$agreement = uiAgreementWithContent;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$agreement, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InternalAssetTransferAgreementDataState internalAssetTransferAgreementDataState, Continuation<? super InternalAssetTransferAgreementDataState> continuation) {
                return ((AnonymousClass1) create(internalAssetTransferAgreementDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return InternalAssetTransferAgreementDataState.copy$default((InternalAssetTransferAgreementDataState) this.L$0, null, new InternalAssetTransferAgreementDataState.LcenState.Content(this.$agreement), 1, null);
            }
        }

        /* compiled from: InternalAssetTransferAgreementDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/internalassettransfers/agreements/InternalAssetTransferAgreementDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.agreements.InternalAssetTransferAgreementDuxo$signAgreement$2$2", m3645f = "InternalAssetTransferAgreementDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.internalassettransfers.agreements.InternalAssetTransferAgreementDuxo$signAgreement$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<InternalAssetTransferAgreementDataState, Continuation<? super InternalAssetTransferAgreementDataState>, Object> {
            final /* synthetic */ Exception $exception;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(Exception exc, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$exception = exc;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$exception, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InternalAssetTransferAgreementDataState internalAssetTransferAgreementDataState, Continuation<? super InternalAssetTransferAgreementDataState> continuation) {
                return ((AnonymousClass2) create(internalAssetTransferAgreementDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return InternalAssetTransferAgreementDataState.copy$default((InternalAssetTransferAgreementDataState) this.L$0, null, new InternalAssetTransferAgreementDataState.LcenState.Error(this.$exception), 1, null);
            }
        }
    }
}
