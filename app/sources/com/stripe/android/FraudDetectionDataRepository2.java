package com.stripe.android;

import android.content.Context;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.core.networking.DefaultStripeNetworkClient;
import com.stripe.android.core.networking.StripeNetworkClient;
import com.stripe.android.core.networking.StripeResponse;
import com.stripe.android.networking.FraudDetectionData;
import com.stripe.android.networking.FraudDetectionDataRequest;
import com.stripe.android.networking.FraudDetectionDataRequestFactory;
import com.stripe.android.networking.FraudDetectionDataRequestFactory2;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.Dispatchers;

/* compiled from: FraudDetectionDataRepository.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B-\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u000fJ\n\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0011H\u0096@¢\u0006\u0002\u0010\u0014J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0011H\u0016R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m3636d2 = {"Lcom/stripe/android/DefaultFraudDetectionDataRepository;", "Lcom/stripe/android/FraudDetectionDataRepository;", "context", "Landroid/content/Context;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "(Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;)V", "localStore", "Lcom/stripe/android/FraudDetectionDataStore;", "fraudDetectionDataRequestFactory", "Lcom/stripe/android/networking/FraudDetectionDataRequestFactory;", "stripeNetworkClient", "Lcom/stripe/android/core/networking/StripeNetworkClient;", "errorReporter", "Lcom/stripe/android/payments/core/analytics/ErrorReporter;", "(Lcom/stripe/android/FraudDetectionDataStore;Lcom/stripe/android/networking/FraudDetectionDataRequestFactory;Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lkotlin/coroutines/CoroutineContext;)V", "cachedFraudDetectionData", "Lcom/stripe/android/networking/FraudDetectionData;", "getCached", "getLatest", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refresh", "", AnalyticsStrings.BUTTON_EDIT_PROFILE_SAVE, "fraudDetectionData", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.stripe.android.DefaultFraudDetectionDataRepository, reason: use source file name */
/* loaded from: classes10.dex */
public final class FraudDetectionDataRepository2 implements FraudDetectionDataRepository {
    private FraudDetectionData cachedFraudDetectionData;
    private final ErrorReporter errorReporter;
    private final FraudDetectionDataRequestFactory fraudDetectionDataRequestFactory;
    private final FraudDetectionDataStore localStore;
    private final StripeNetworkClient stripeNetworkClient;
    private final CoroutineContext workContext;

    public FraudDetectionDataRepository2(FraudDetectionDataStore localStore, FraudDetectionDataRequestFactory fraudDetectionDataRequestFactory, StripeNetworkClient stripeNetworkClient, ErrorReporter errorReporter, CoroutineContext workContext) {
        Intrinsics.checkNotNullParameter(localStore, "localStore");
        Intrinsics.checkNotNullParameter(fraudDetectionDataRequestFactory, "fraudDetectionDataRequestFactory");
        Intrinsics.checkNotNullParameter(stripeNetworkClient, "stripeNetworkClient");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        this.localStore = localStore;
        this.fraudDetectionDataRequestFactory = fraudDetectionDataRequestFactory;
        this.stripeNetworkClient = stripeNetworkClient;
        this.errorReporter = errorReporter;
        this.workContext = workContext;
    }

    public /* synthetic */ FraudDetectionDataRepository2(Context context, CoroutineContext coroutineContext, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? Dispatchers.getIO() : coroutineContext);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FraudDetectionDataRepository2(Context context, CoroutineContext workContext) {
        this(new FraudDetectionDataStore2(context, workContext), new FraudDetectionDataRequestFactory2(context), new DefaultStripeNetworkClient(workContext, null, null, 0, null, 30, null), ErrorReporter.INSTANCE.createFallbackInstance(context, SetsKt.emptySet()), workContext);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
    }

    /* compiled from: FraudDetectionDataRepository.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.stripe.android.DefaultFraudDetectionDataRepository$refresh$1", m3645f = "FraudDetectionDataRepository.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_HOME_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.stripe.android.DefaultFraudDetectionDataRepository$refresh$1 */
    static final class C424981 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C424981(Continuation<? super C424981> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FraudDetectionDataRepository2.this.new C424981(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C424981) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FraudDetectionDataRepository2 fraudDetectionDataRepository2 = FraudDetectionDataRepository2.this;
                this.label = 1;
                if (fraudDetectionDataRepository2.getLatest(this) == coroutine_suspended) {
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
    }

    @Override // com.stripe.android.FraudDetectionDataRepository
    public void refresh() {
        if (Stripe.INSTANCE.getAdvancedFraudSignalsEnabled()) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScope2.CoroutineScope(this.workContext), null, null, new C424981(null), 3, null);
        }
    }

    /* compiled from: FraudDetectionDataRepository.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "Lcom/stripe/android/networking/FraudDetectionData;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.stripe.android.DefaultFraudDetectionDataRepository$getLatest$2", m3645f = "FraudDetectionDataRepository.kt", m3646l = {74, 80}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.stripe.android.DefaultFraudDetectionDataRepository$getLatest$2 */
    static final class C424972 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super FraudDetectionData>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C424972(Continuation<? super C424972> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C424972 c424972 = FraudDetectionDataRepository2.this.new C424972(continuation);
            c424972.L$0 = obj;
            return c424972;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super FraudDetectionData> continuation) {
            return ((C424972) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0072, code lost:
        
            if (r9 == r0) goto L23;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v11, types: [com.stripe.android.DefaultFraudDetectionDataRepository] */
        /* JADX WARN: Type inference failed for: r1v14 */
        /* JADX WARN: Type inference failed for: r1v15 */
        /* JADX WARN: Type inference failed for: r1v2, types: [com.stripe.android.DefaultFraudDetectionDataRepository] */
        /* JADX WARN: Type inference failed for: r1v6, types: [com.stripe.android.DefaultFraudDetectionDataRepository, java.lang.Object] */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objM28550constructorimpl;
            FraudDetectionData fraudDetectionData;
            ?? r1;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
            } catch (Throwable th) {
                Result.Companion companion = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                r1 = i;
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                FraudDetectionDataStore fraudDetectionDataStore = FraudDetectionDataRepository2.this.localStore;
                this.L$0 = coroutineScope;
                this.label = 1;
                obj = fraudDetectionDataStore.get(this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ?? r12 = (FraudDetectionDataRepository2) this.L$0;
                ResultKt.throwOnFailure(obj);
                i = r12;
                objM28550constructorimpl = Result.m28550constructorimpl(FraudDetectionDataRepository3.fraudDetectionData((StripeResponse) obj));
                r1 = i;
                Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
                if (thM28553exceptionOrNullimpl != null) {
                    ErrorReporter.DefaultImpls.report$default(((FraudDetectionDataRepository2) r1).errorReporter, ErrorReporter.ExpectedErrorEvent.FRAUD_DETECTION_API_FAILURE, StripeException.INSTANCE.create(thM28553exceptionOrNullimpl), null, 4, null);
                }
                if (Result.m28555isFailureimpl(objM28550constructorimpl)) {
                    objM28550constructorimpl = null;
                }
                fraudDetectionData = (FraudDetectionData) objM28550constructorimpl;
                if (!Intrinsics.areEqual(FraudDetectionDataRepository2.this.cachedFraudDetectionData, fraudDetectionData) && fraudDetectionData != null) {
                    FraudDetectionDataRepository2.this.save(fraudDetectionData);
                }
                return fraudDetectionData;
            }
            ResultKt.throwOnFailure(obj);
            ?? r13 = FraudDetectionDataRepository2.this;
            fraudDetectionData = (FraudDetectionData) obj;
            if (fraudDetectionData == null || fraudDetectionData.isExpired(((Number) FraudDetectionDataRepository3.timestampSupplier.invoke()).longValue())) {
                Result.Companion companion2 = Result.INSTANCE;
                StripeNetworkClient stripeNetworkClient = ((FraudDetectionDataRepository2) r13).stripeNetworkClient;
                FraudDetectionDataRequest fraudDetectionDataRequestCreate = ((FraudDetectionDataRepository2) r13).fraudDetectionDataRequestFactory.create(fraudDetectionData);
                this.L$0 = r13;
                this.label = 2;
                obj = stripeNetworkClient.executeRequest(fraudDetectionDataRequestCreate, this);
                i = r13;
            }
            if (!Intrinsics.areEqual(FraudDetectionDataRepository2.this.cachedFraudDetectionData, fraudDetectionData)) {
                FraudDetectionDataRepository2.this.save(fraudDetectionData);
            }
            return fraudDetectionData;
        }
    }

    @Override // com.stripe.android.FraudDetectionDataRepository
    public Object getLatest(Continuation<? super FraudDetectionData> continuation) {
        return BuildersKt.withContext(this.workContext, new C424972(null), continuation);
    }

    @Override // com.stripe.android.FraudDetectionDataRepository
    public FraudDetectionData getCached() {
        FraudDetectionData fraudDetectionData = this.cachedFraudDetectionData;
        if (Stripe.INSTANCE.getAdvancedFraudSignalsEnabled()) {
            return fraudDetectionData;
        }
        return null;
    }

    public void save(FraudDetectionData fraudDetectionData) {
        Intrinsics.checkNotNullParameter(fraudDetectionData, "fraudDetectionData");
        this.cachedFraudDetectionData = fraudDetectionData;
        this.localStore.save(fraudDetectionData);
    }
}
