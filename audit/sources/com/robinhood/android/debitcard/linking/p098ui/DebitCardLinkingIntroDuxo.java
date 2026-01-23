package com.robinhood.android.debitcard.linking.p098ui;

import com.robinhood.android.api.transfers.DisclosureLocation;
import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.models.api.bonfire.transfer.ApiDisclosureUIResponse;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.utils.logging.CrashReporter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DebitCardLinkingIntroDuxo.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\f\rB\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/debitcard/linking/ui/DebitCardLinkingIntroDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/debitcard/linking/ui/DebitCardLinkingIntroDuxo$DataState;", "Lcom/robinhood/android/debitcard/linking/ui/DebitCardLinkingIntroDuxo$ViewState;", "transfersBonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/api/transfers/TransfersBonfireApi;Lcom/robinhood/android/udf/DuxoBundle;)V", "onCreate", "", "DataState", "ViewState", "feature-debit-card-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class DebitCardLinkingIntroDuxo extends BaseDuxo<DataState, ViewState> {
    public static final int $stable = 8;
    private final TransfersBonfireApi transfersBonfireApi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DebitCardLinkingIntroDuxo(TransfersBonfireApi transfersBonfireApi, DuxoBundle duxoBundle) {
        super(new DataState(null), DebitCardLinkingIntroDuxo2.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.transfersBonfireApi = transfersBonfireApi;
    }

    /* compiled from: DebitCardLinkingIntroDuxo.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/debitcard/linking/ui/DebitCardLinkingIntroDuxo$DataState;", "", "response", "Lcom/robinhood/models/api/bonfire/transfer/ApiDisclosureUIResponse;", "<init>", "(Lcom/robinhood/models/api/bonfire/transfer/ApiDisclosureUIResponse;)V", "getResponse", "()Lcom/robinhood/models/api/bonfire/transfer/ApiDisclosureUIResponse;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-debit-card-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class DataState {
        public static final int $stable = 8;
        private final ApiDisclosureUIResponse response;

        public static /* synthetic */ DataState copy$default(DataState dataState, ApiDisclosureUIResponse apiDisclosureUIResponse, int i, Object obj) {
            if ((i & 1) != 0) {
                apiDisclosureUIResponse = dataState.response;
            }
            return dataState.copy(apiDisclosureUIResponse);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiDisclosureUIResponse getResponse() {
            return this.response;
        }

        public final DataState copy(ApiDisclosureUIResponse response) {
            return new DataState(response);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DataState) && Intrinsics.areEqual(this.response, ((DataState) other).response);
        }

        public int hashCode() {
            ApiDisclosureUIResponse apiDisclosureUIResponse = this.response;
            if (apiDisclosureUIResponse == null) {
                return 0;
            }
            return apiDisclosureUIResponse.hashCode();
        }

        public String toString() {
            return "DataState(response=" + this.response + ")";
        }

        public DataState(ApiDisclosureUIResponse apiDisclosureUIResponse) {
            this.response = apiDisclosureUIResponse;
        }

        public final ApiDisclosureUIResponse getResponse() {
            return this.response;
        }
    }

    /* compiled from: DebitCardLinkingIntroDuxo.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/debitcard/linking/ui/DebitCardLinkingIntroDuxo$ViewState;", "", "component", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "<init>", "(Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;)V", "getComponent", "()Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-debit-card-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ViewState {
        public static final int $stable = 8;
        private final UIComponent<GenericAction> component;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ViewState copy$default(ViewState viewState, UIComponent uIComponent, int i, Object obj) {
            if ((i & 1) != 0) {
                uIComponent = viewState.component;
            }
            return viewState.copy(uIComponent);
        }

        public final UIComponent<GenericAction> component1() {
            return this.component;
        }

        public final ViewState copy(UIComponent<? extends GenericAction> component) {
            return new ViewState(component);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ViewState) && Intrinsics.areEqual(this.component, ((ViewState) other).component);
        }

        public int hashCode() {
            UIComponent<GenericAction> uIComponent = this.component;
            if (uIComponent == null) {
                return 0;
            }
            return uIComponent.hashCode();
        }

        public String toString() {
            return "ViewState(component=" + this.component + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ViewState(UIComponent<? extends GenericAction> uIComponent) {
            this.component = uIComponent;
        }

        public final UIComponent<GenericAction> getComponent() {
            return this.component;
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.CREATED, new C138981(null));
    }

    /* compiled from: DebitCardLinkingIntroDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.debitcard.linking.ui.DebitCardLinkingIntroDuxo$onCreate$1", m3645f = "DebitCardLinkingIntroDuxo.kt", m3646l = {34}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.debitcard.linking.ui.DebitCardLinkingIntroDuxo$onCreate$1 */
    static final class C138981 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C138981(Continuation<? super C138981> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DebitCardLinkingIntroDuxo.this.new C138981(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C138981) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            TransfersBonfireApi transfersBonfireApi;
            DisclosureLocation disclosureLocation;
            C138981 c138981;
            Exception exc;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                try {
                    transfersBonfireApi = DebitCardLinkingIntroDuxo.this.transfersBonfireApi;
                    disclosureLocation = DisclosureLocation.DEBIT_CARD_LINKING_UPSELL_INTRO;
                    this.label = 1;
                    c138981 = this;
                } catch (Exception e) {
                    e = e;
                    exc = e;
                    CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, exc, false, null, 6, null);
                    return Unit.INSTANCE;
                }
                try {
                    obj = TransfersBonfireApi.DefaultImpls.getDisclosure$default(transfersBonfireApi, disclosureLocation, null, null, null, null, null, c138981, 62, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (Exception e2) {
                    e = e2;
                    exc = e;
                    CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, exc, false, null, 6, null);
                    return Unit.INSTANCE;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                try {
                    ResultKt.throwOnFailure(obj);
                    c138981 = this;
                } catch (Exception e3) {
                    exc = e3;
                    CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, exc, false, null, 6, null);
                    return Unit.INSTANCE;
                }
            }
            DebitCardLinkingIntroDuxo.this.applyMutation(new AnonymousClass1((ApiDisclosureUIResponse) obj, null));
            return Unit.INSTANCE;
        }

        /* compiled from: DebitCardLinkingIntroDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/debitcard/linking/ui/DebitCardLinkingIntroDuxo$DataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.debitcard.linking.ui.DebitCardLinkingIntroDuxo$onCreate$1$1", m3645f = "DebitCardLinkingIntroDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.debitcard.linking.ui.DebitCardLinkingIntroDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<DataState, Continuation<? super DataState>, Object> {
            final /* synthetic */ ApiDisclosureUIResponse $disclosure;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ApiDisclosureUIResponse apiDisclosureUIResponse, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$disclosure = apiDisclosureUIResponse;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$disclosure, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(DataState dataState, Continuation<? super DataState> continuation) {
                return ((AnonymousClass1) create(dataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ((DataState) this.L$0).copy(this.$disclosure);
            }
        }
    }
}
