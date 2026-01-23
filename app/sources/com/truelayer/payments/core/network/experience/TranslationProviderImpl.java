package com.truelayer.payments.core.network.experience;

import com.plaid.internal.EnumC7081g;
import com.truelayer.payments.analytics.TrueLayerAnalytics;
import com.truelayer.payments.analytics.events.AnalyticsEvents;
import com.truelayer.payments.core.TrueLayerCore;
import com.truelayer.payments.core.domain.errors.CoreError;
import com.truelayer.payments.core.domain.experience.localisation.Legals;
import com.truelayer.payments.core.domain.experience.localisation.LocalisedText;
import com.truelayer.payments.core.domain.experience.localisation.UserPriming;
import com.truelayer.payments.core.domain.payments.PaymentContext;
import com.truelayer.payments.core.domain.utils.Fail;
import com.truelayer.payments.core.domain.utils.Ok;
import com.truelayer.payments.core.domain.utils.Outcome;
import com.truelayer.payments.core.network.experience.TranslationsCache;
import com.truelayer.payments.core.network.experience.api.PaymentsExperienceApi;
import com.truelayer.payments.core.utils.ErrorUtils2;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job6;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlow2;
import kotlinx.coroutines.flow.SharedFlow4;

/* compiled from: TranslationProviderImpl.kt */
@Metadata(m3635d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001a\u0010$\u001a\u00020\u000b2\b\u0010%\u001a\u0004\u0018\u00010\u000b2\u0006\u0010&\u001a\u00020'H\u0002J \u0010(\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H)\u0012\u0004\u0012\u00020\r0\t0\b\"\u0004\b\u0000\u0010)H\u0002J8\u0010*\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n\u0012\u0004\u0012\u00020\r0\t2\u0006\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u000bH\u0082@¢\u0006\u0002\u0010.J2\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\t2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u0019H\u0082@¢\u0006\u0002\u00101J*\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0\t2\u0006\u0010+\u001a\u00020,2\u0006\u00103\u001a\u00020\u000bH\u0082@¢\u0006\u0002\u0010.J2\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\t2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u0019H\u0082@¢\u0006\u0002\u00101J\u001a\u00105\u001a\u0002062\u0006\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u000bH\u0016J8\u00107\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n\u0012\u0004\u0012\u00020\r0\t2\u0006\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u000bH\u0096@¢\u0006\u0002\u0010.J \u00108\u001a\u0002062\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u0019H\u0016J2\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\t2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u0019H\u0096@¢\u0006\u0002\u00101J\u0018\u0010:\u001a\u0002062\u0006\u0010+\u001a\u00020,2\u0006\u00103\u001a\u00020\u000bH\u0016J*\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0\t2\u0006\u0010+\u001a\u00020,2\u0006\u00103\u001a\u00020\u000bH\u0096@¢\u0006\u0002\u0010.R,\u0010\u0007\u001a \u0012\u001c\u0012\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n\u0012\u0004\u0012\u00020\r0\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R2\u0010\u0014\u001a \u0012\u001c\u0012\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n\u0012\u0004\u0012\u00020\r0\t0\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R&\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\t0\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010 \u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0\t0\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006<"}, m3636d2 = {"Lcom/truelayer/payments/core/network/experience/TranslationProviderImpl;", "Lcom/truelayer/payments/core/network/experience/TranslationProvider;", "experienceApi", "Lcom/truelayer/payments/core/network/experience/api/PaymentsExperienceApi;", "analytics", "Lcom/truelayer/payments/analytics/TrueLayerAnalytics;", "(Lcom/truelayer/payments/core/network/experience/api/PaymentsExperienceApi;Lcom/truelayer/payments/analytics/TrueLayerAnalytics;)V", "_inputTranslations", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/truelayer/payments/core/domain/utils/Outcome;", "", "", "Lcom/truelayer/payments/core/domain/experience/localisation/LocalisedText;", "Lcom/truelayer/payments/core/domain/errors/CoreError;", "_legalTranslations", "Lcom/truelayer/payments/core/domain/experience/localisation/Legals;", "_primingTranslations", "Lcom/truelayer/payments/core/domain/experience/localisation/UserPriming;", "cache", "Lcom/truelayer/payments/core/network/experience/TranslationsCache;", "inputTranslations", "Lkotlinx/coroutines/flow/SharedFlow;", "getInputTranslations", "()Lkotlinx/coroutines/flow/SharedFlow;", "isInputsFetching", "", "isLegalsFetching", "isPrimingFetching", "legalTranslations", "getLegalTranslations", "lock", "Ljava/lang/Object;", "primingTranslations", "getPrimingTranslations", "scope", "Lkotlinx/coroutines/CoroutineScope;", "createCacheKey", "key", "type", "Lcom/truelayer/payments/core/network/experience/TranslationsCache$Type;", "createTranslationFlow", "T", "fetchInputs", "paymentContext", "Lcom/truelayer/payments/core/domain/payments/PaymentContext;", "countryCode", "(Lcom/truelayer/payments/core/domain/payments/PaymentContext;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchLegals", "isSignupPlus", "(Lcom/truelayer/payments/core/domain/payments/PaymentContext;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchPriming", "providerId", "getLegals", "updateInputs", "", "updateInputsSync", "updateLegals", "updateLegalsSync", "updatePriming", "updatePrimingSync", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class TranslationProviderImpl implements TranslationProvider {
    private final SharedFlow2<Outcome<Map<String, LocalisedText>, CoreError>> _inputTranslations;
    private final SharedFlow2<Outcome<Legals, CoreError>> _legalTranslations;
    private final SharedFlow2<Outcome<UserPriming, CoreError>> _primingTranslations;
    private final TrueLayerAnalytics analytics;
    private final TranslationsCache cache;
    private final PaymentsExperienceApi experienceApi;
    private final SharedFlow<Outcome<Map<String, LocalisedText>, CoreError>> inputTranslations;
    private boolean isInputsFetching;
    private boolean isLegalsFetching;
    private boolean isPrimingFetching;
    private final SharedFlow<Outcome<Legals, CoreError>> legalTranslations;
    private final Object lock;
    private final SharedFlow<Outcome<UserPriming, CoreError>> primingTranslations;
    private final CoroutineScope scope;

    /* compiled from: TranslationProviderImpl.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaymentContext.PaymentType.values().length];
            try {
                iArr[PaymentContext.PaymentType.SinglePayment.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentContext.PaymentType.Mandate.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: TranslationProviderImpl.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.core.network.experience.TranslationProviderImpl", m3645f = "TranslationProviderImpl.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE}, m3647m = "fetchInputs")
    /* renamed from: com.truelayer.payments.core.network.experience.TranslationProviderImpl$fetchInputs$1 */
    static final class C427391 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C427391(Continuation<? super C427391> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TranslationProviderImpl.this.fetchInputs(null, null, this);
        }
    }

    /* compiled from: TranslationProviderImpl.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.core.network.experience.TranslationProviderImpl", m3645f = "TranslationProviderImpl.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_ICON_EXTERNAL_VALUE}, m3647m = "fetchLegals")
    /* renamed from: com.truelayer.payments.core.network.experience.TranslationProviderImpl$fetchLegals$1 */
    static final class C427401 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C427401(Continuation<? super C427401> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TranslationProviderImpl.this.fetchLegals(null, null, false, this);
        }
    }

    /* compiled from: TranslationProviderImpl.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.core.network.experience.TranslationProviderImpl", m3645f = "TranslationProviderImpl.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE, 255}, m3647m = "fetchPriming")
    /* renamed from: com.truelayer.payments.core.network.experience.TranslationProviderImpl$fetchPriming$1 */
    static final class C427411 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C427411(Continuation<? super C427411> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TranslationProviderImpl.this.fetchPriming(null, null, this);
        }
    }

    public TranslationProviderImpl(PaymentsExperienceApi experienceApi, TrueLayerAnalytics analytics) {
        Intrinsics.checkNotNullParameter(experienceApi, "experienceApi");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        this.experienceApi = experienceApi;
        this.analytics = analytics;
        this.scope = CoroutineScope2.CoroutineScope(Dispatchers.getIO().plus(Job6.Job$default(null, 1, null)));
        this.lock = new Object();
        this.cache = new TranslationsCache(null, null, null, 7, null);
        SharedFlow2<Outcome<Map<String, LocalisedText>, CoreError>> sharedFlow2CreateTranslationFlow = createTranslationFlow();
        this._inputTranslations = sharedFlow2CreateTranslationFlow;
        SharedFlow2<Outcome<Legals, CoreError>> sharedFlow2CreateTranslationFlow2 = createTranslationFlow();
        this._legalTranslations = sharedFlow2CreateTranslationFlow2;
        SharedFlow2<Outcome<UserPriming, CoreError>> sharedFlow2CreateTranslationFlow3 = createTranslationFlow();
        this._primingTranslations = sharedFlow2CreateTranslationFlow3;
        this.inputTranslations = FlowKt.asSharedFlow(sharedFlow2CreateTranslationFlow);
        this.legalTranslations = FlowKt.asSharedFlow(sharedFlow2CreateTranslationFlow2);
        this.primingTranslations = FlowKt.asSharedFlow(sharedFlow2CreateTranslationFlow3);
    }

    public /* synthetic */ TranslationProviderImpl(PaymentsExperienceApi paymentsExperienceApi, TrueLayerAnalytics trueLayerAnalytics, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(paymentsExperienceApi, (i & 2) != 0 ? TrueLayerCore.INSTANCE.getAnalytics$payments_core_release() : trueLayerAnalytics);
    }

    @Override // com.truelayer.payments.core.network.experience.TranslationProvider
    public SharedFlow<Outcome<Map<String, LocalisedText>, CoreError>> getInputTranslations() {
        return this.inputTranslations;
    }

    @Override // com.truelayer.payments.core.network.experience.TranslationProvider
    public SharedFlow<Outcome<Legals, CoreError>> getLegalTranslations() {
        return this.legalTranslations;
    }

    @Override // com.truelayer.payments.core.network.experience.TranslationProvider
    public SharedFlow<Outcome<UserPriming, CoreError>> getPrimingTranslations() {
        return this.primingTranslations;
    }

    private final <T> SharedFlow2<Outcome<T, CoreError>> createTranslationFlow() {
        return SharedFlow4.MutableSharedFlow(1, 1, BufferOverflow.DROP_OLDEST);
    }

    /* compiled from: TranslationProviderImpl.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.core.network.experience.TranslationProviderImpl$updateInputs$1", m3645f = "TranslationProviderImpl.kt", m3646l = {58}, m3647m = "invokeSuspend")
    /* renamed from: com.truelayer.payments.core.network.experience.TranslationProviderImpl$updateInputs$1 */
    static final class C427421 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $countryCode;
        final /* synthetic */ PaymentContext $paymentContext;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C427421(PaymentContext paymentContext, String str, Continuation<? super C427421> continuation) {
            super(2, continuation);
            this.$paymentContext = paymentContext;
            this.$countryCode = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TranslationProviderImpl.this.new C427421(this.$paymentContext, this.$countryCode, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C427421) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                TranslationProviderImpl translationProviderImpl = TranslationProviderImpl.this;
                PaymentContext paymentContext = this.$paymentContext;
                String str = this.$countryCode;
                this.label = 1;
                if (translationProviderImpl.fetchInputs(paymentContext, str, this) == coroutine_suspended) {
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

    @Override // com.truelayer.payments.core.network.experience.TranslationProvider
    public void updateInputs(PaymentContext paymentContext, String countryCode) {
        Intrinsics.checkNotNullParameter(paymentContext, "paymentContext");
        BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new C427421(paymentContext, countryCode, null), 3, null);
    }

    /* compiled from: TranslationProviderImpl.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.core.network.experience.TranslationProviderImpl$updateLegals$1", m3645f = "TranslationProviderImpl.kt", m3646l = {64}, m3647m = "invokeSuspend")
    /* renamed from: com.truelayer.payments.core.network.experience.TranslationProviderImpl$updateLegals$1 */
    static final class C427431 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $countryCode;
        final /* synthetic */ boolean $isSignupPlus;
        final /* synthetic */ PaymentContext $paymentContext;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C427431(PaymentContext paymentContext, String str, boolean z, Continuation<? super C427431> continuation) {
            super(2, continuation);
            this.$paymentContext = paymentContext;
            this.$countryCode = str;
            this.$isSignupPlus = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TranslationProviderImpl.this.new C427431(this.$paymentContext, this.$countryCode, this.$isSignupPlus, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C427431) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                TranslationProviderImpl translationProviderImpl = TranslationProviderImpl.this;
                PaymentContext paymentContext = this.$paymentContext;
                String str = this.$countryCode;
                boolean z = this.$isSignupPlus;
                this.label = 1;
                if (translationProviderImpl.fetchLegals(paymentContext, str, z, this) == coroutine_suspended) {
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

    @Override // com.truelayer.payments.core.network.experience.TranslationProvider
    public void updateLegals(PaymentContext paymentContext, String countryCode, boolean isSignupPlus) {
        Intrinsics.checkNotNullParameter(paymentContext, "paymentContext");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new C427431(paymentContext, countryCode, isSignupPlus, null), 3, null);
    }

    /* compiled from: TranslationProviderImpl.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.core.network.experience.TranslationProviderImpl$updatePriming$1", m3645f = "TranslationProviderImpl.kt", m3646l = {70}, m3647m = "invokeSuspend")
    /* renamed from: com.truelayer.payments.core.network.experience.TranslationProviderImpl$updatePriming$1 */
    static final class C427441 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ PaymentContext $paymentContext;
        final /* synthetic */ String $providerId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C427441(PaymentContext paymentContext, String str, Continuation<? super C427441> continuation) {
            super(2, continuation);
            this.$paymentContext = paymentContext;
            this.$providerId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TranslationProviderImpl.this.new C427441(this.$paymentContext, this.$providerId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C427441) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                TranslationProviderImpl translationProviderImpl = TranslationProviderImpl.this;
                PaymentContext paymentContext = this.$paymentContext;
                String str = this.$providerId;
                this.label = 1;
                if (translationProviderImpl.fetchPriming(paymentContext, str, this) == coroutine_suspended) {
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

    @Override // com.truelayer.payments.core.network.experience.TranslationProvider
    public void updatePriming(PaymentContext paymentContext, String providerId) {
        Intrinsics.checkNotNullParameter(paymentContext, "paymentContext");
        Intrinsics.checkNotNullParameter(providerId, "providerId");
        BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new C427441(paymentContext, providerId, null), 3, null);
    }

    @Override // com.truelayer.payments.core.network.experience.TranslationProvider
    public Object updateInputsSync(PaymentContext paymentContext, String str, Continuation<? super Outcome<? extends Map<String, LocalisedText>, ? extends CoreError>> continuation) {
        synchronized (this.lock) {
            try {
                if (this.isInputsFetching) {
                    this.lock.wait();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        return fetchInputs(paymentContext, str, continuation);
    }

    @Override // com.truelayer.payments.core.network.experience.TranslationProvider
    public Object updateLegalsSync(PaymentContext paymentContext, String str, boolean z, Continuation<? super Outcome<Legals, ? extends CoreError>> continuation) {
        synchronized (this.lock) {
            try {
                if (this.isLegalsFetching) {
                    this.lock.wait();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        return fetchLegals(paymentContext, str, z, continuation);
    }

    @Override // com.truelayer.payments.core.network.experience.TranslationProvider
    public Object updatePrimingSync(PaymentContext paymentContext, String str, Continuation<? super Outcome<? extends UserPriming, ? extends CoreError>> continuation) {
        synchronized (this.lock) {
            try {
                if (this.isPrimingFetching) {
                    this.lock.wait();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        return fetchPriming(paymentContext, str, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchInputs(PaymentContext paymentContext, String str, Continuation<? super Outcome<? extends Map<String, LocalisedText>, ? extends CoreError>> continuation) {
        C427391 c427391;
        String strCreateCacheKey;
        String str2;
        TranslationProviderImpl translationProviderImpl;
        PaymentContext paymentContext2;
        Outcome<Map<String, LocalisedText>, CoreError> ok;
        boolean z;
        TranslationProviderImpl translationProviderImpl2;
        if (continuation instanceof C427391) {
            c427391 = (C427391) continuation;
            int i = c427391.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c427391.label = i - Integer.MIN_VALUE;
            } else {
                c427391 = new C427391(continuation);
            }
        }
        Object obj = c427391.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c427391.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            strCreateCacheKey = createCacheKey(str, TranslationsCache.Type.INPUTS);
            synchronized (this.lock) {
                if (this.isInputsFetching) {
                    this.lock.wait();
                    Object ok2 = (Outcome) CollectionsKt.lastOrNull((List) this._inputTranslations.getReplayCache());
                    if (ok2 == null) {
                        ok2 = new Ok(MapsKt.emptyMap());
                    }
                    return ok2;
                }
                this.isInputsFetching = true;
                Unit unit = Unit.INSTANCE;
                Map<String, LocalisedText> inputs = this.cache.getInputs(strCreateCacheKey);
                if (inputs != null) {
                    ok = new Ok<>(inputs);
                    paymentContext2 = paymentContext;
                    translationProviderImpl = this;
                    z = ok instanceof Ok;
                    if (!z) {
                        translationProviderImpl.cache.saveInputs(strCreateCacheKey, (Map) ((Ok) ok).getValue());
                    } else if (!(ok instanceof Fail)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (!z) {
                        if (ok instanceof Fail) {
                            CoreError coreError = (CoreError) ((Fail) ok).getError();
                            translationProviderImpl.analytics.track(new AnalyticsEvents.BackgroundError(paymentContext2.getPaymentId(), coreError.getMessage(), ErrorUtils2.getLineNumber(), ErrorUtils2.getFileName(), null, coreError.getResponseBody(), coreError.getTraceId(), null, 144, null));
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    if (!Intrinsics.areEqual(CollectionsKt.lastOrNull((List) translationProviderImpl._inputTranslations.getReplayCache()), ok)) {
                        SharedFlow2<Outcome<Map<String, LocalisedText>, CoreError>> sharedFlow2 = translationProviderImpl._inputTranslations;
                        c427391.L$0 = translationProviderImpl;
                        c427391.L$1 = ok;
                        c427391.L$2 = null;
                        c427391.label = 2;
                        if (sharedFlow2.emit(ok, c427391) != coroutine_suspended) {
                            translationProviderImpl2 = translationProviderImpl;
                            translationProviderImpl = translationProviderImpl2;
                        }
                        return coroutine_suspended;
                    }
                    synchronized (translationProviderImpl.lock) {
                    }
                } else {
                    PaymentsExperienceApi paymentsExperienceApi = this.experienceApi;
                    String resourceToken = paymentContext.getResourceToken();
                    c427391.L$0 = this;
                    c427391.L$1 = paymentContext;
                    c427391.L$2 = strCreateCacheKey;
                    c427391.label = 1;
                    Object translations = paymentsExperienceApi.getTranslations(resourceToken, str, c427391);
                    if (translations != coroutine_suspended) {
                        obj = translations;
                        str2 = strCreateCacheKey;
                        translationProviderImpl = this;
                        paymentContext2 = paymentContext;
                    }
                    return coroutine_suspended;
                }
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ok = (Outcome) c427391.L$1;
                translationProviderImpl2 = (TranslationProviderImpl) c427391.L$0;
                ResultKt.throwOnFailure(obj);
                translationProviderImpl = translationProviderImpl2;
                synchronized (translationProviderImpl.lock) {
                    translationProviderImpl.isInputsFetching = false;
                    translationProviderImpl.lock.notifyAll();
                    Unit unit2 = Unit.INSTANCE;
                }
                return ok;
            }
            str2 = (String) c427391.L$2;
            paymentContext2 = (PaymentContext) c427391.L$1;
            translationProviderImpl = (TranslationProviderImpl) c427391.L$0;
            ResultKt.throwOnFailure(obj);
        }
        Outcome<Map<String, LocalisedText>, CoreError> outcome = (Outcome) obj;
        strCreateCacheKey = str2;
        ok = outcome;
        z = ok instanceof Ok;
        if (!z) {
        }
        if (!z) {
        }
        if (!Intrinsics.areEqual(CollectionsKt.lastOrNull((List) translationProviderImpl._inputTranslations.getReplayCache()), ok)) {
        }
        synchronized (translationProviderImpl.lock) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchLegals(PaymentContext paymentContext, String str, boolean z, Continuation<? super Outcome<Legals, ? extends CoreError>> continuation) {
        C427401 c427401;
        String strCreateCacheKey;
        Object legals;
        TranslationProviderImpl translationProviderImpl;
        Outcome<Legals, CoreError> ok;
        boolean z2;
        SharedFlow2<Outcome<Legals, CoreError>> sharedFlow2;
        Outcome<Legals, CoreError> outcome;
        TranslationProviderImpl translationProviderImpl2;
        PaymentContext paymentContext2 = paymentContext;
        if (continuation instanceof C427401) {
            c427401 = (C427401) continuation;
            int i = c427401.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c427401.label = i - Integer.MIN_VALUE;
            } else {
                c427401 = new C427401(continuation);
            }
        }
        Object obj = c427401.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c427401.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            strCreateCacheKey = createCacheKey(str + z + paymentContext2.getPaymentId(), TranslationsCache.Type.LEGALS);
            synchronized (this.lock) {
                if (this.isLegalsFetching) {
                    this.lock.wait();
                    Object fail = (Outcome) CollectionsKt.lastOrNull((List) this._legalTranslations.getReplayCache());
                    if (fail == null) {
                        fail = new Fail(CoreError.INSTANCE.mo27021default());
                    }
                    return fail;
                }
                this.isLegalsFetching = true;
                Unit unit = Unit.INSTANCE;
                Legals legals2 = this.cache.getLegals(strCreateCacheKey);
                if (legals2 != null) {
                    ok = new Ok<>(legals2);
                    translationProviderImpl = this;
                    z2 = ok instanceof Ok;
                    if (!z2) {
                        translationProviderImpl.cache.saveLegals(strCreateCacheKey, (Legals) ((Ok) ok).getValue());
                    } else if (!(ok instanceof Fail)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (!z2) {
                        if (ok instanceof Fail) {
                            CoreError coreError = (CoreError) ((Fail) ok).getError();
                            translationProviderImpl.analytics.track(new AnalyticsEvents.BackgroundError(paymentContext2.getPaymentId(), coreError.getMessage(), ErrorUtils2.getLineNumber(), ErrorUtils2.getFileName(), null, coreError.getResponseBody(), coreError.getTraceId(), null, 144, null));
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    sharedFlow2 = translationProviderImpl._legalTranslations;
                    c427401.L$0 = translationProviderImpl;
                    c427401.L$1 = ok;
                    c427401.L$2 = null;
                    c427401.label = 2;
                    if (sharedFlow2.emit(ok, c427401) != coroutine_suspended) {
                        outcome = ok;
                        translationProviderImpl2 = translationProviderImpl;
                        synchronized (translationProviderImpl2.lock) {
                        }
                    }
                    return coroutine_suspended;
                }
                c427401.L$0 = this;
                c427401.L$1 = paymentContext2;
                c427401.L$2 = strCreateCacheKey;
                c427401.label = 1;
                legals = getLegals(paymentContext2, str, z, c427401);
                if (legals != coroutine_suspended) {
                    translationProviderImpl = this;
                }
                return coroutine_suspended;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            outcome = (Outcome) c427401.L$1;
            translationProviderImpl2 = (TranslationProviderImpl) c427401.L$0;
            ResultKt.throwOnFailure(obj);
            synchronized (translationProviderImpl2.lock) {
                translationProviderImpl2.isLegalsFetching = false;
                translationProviderImpl2.lock.notifyAll();
                Unit unit2 = Unit.INSTANCE;
            }
            return outcome;
        }
        String str2 = (String) c427401.L$2;
        PaymentContext paymentContext3 = (PaymentContext) c427401.L$1;
        translationProviderImpl = (TranslationProviderImpl) c427401.L$0;
        ResultKt.throwOnFailure(obj);
        strCreateCacheKey = str2;
        paymentContext2 = paymentContext3;
        legals = obj;
        ok = (Outcome) legals;
        z2 = ok instanceof Ok;
        if (!z2) {
        }
        if (!z2) {
        }
        sharedFlow2 = translationProviderImpl._legalTranslations;
        c427401.L$0 = translationProviderImpl;
        c427401.L$1 = ok;
        c427401.L$2 = null;
        c427401.label = 2;
        if (sharedFlow2.emit(ok, c427401) != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getLegals(PaymentContext paymentContext, String str, boolean z, Continuation<? super Outcome<Legals, ? extends CoreError>> continuation) {
        int i = WhenMappings.$EnumSwitchMapping$0[paymentContext.getPaymentType().ordinal()];
        if (i == 1) {
            return this.experienceApi.getLegals(paymentContext.getResourceToken(), str, z, continuation);
        }
        if (i == 2) {
            return this.experienceApi.getMandatesLegals(paymentContext.getResourceToken(), str, continuation);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchPriming(PaymentContext paymentContext, String str, Continuation<? super Outcome<? extends UserPriming, ? extends CoreError>> continuation) {
        C427411 c427411;
        String strCreateCacheKey;
        String str2;
        TranslationProviderImpl translationProviderImpl;
        PaymentContext paymentContext2;
        Outcome<UserPriming, CoreError> ok;
        boolean z;
        SharedFlow2<Outcome<UserPriming, CoreError>> sharedFlow2;
        TranslationProviderImpl translationProviderImpl2;
        if (continuation instanceof C427411) {
            c427411 = (C427411) continuation;
            int i = c427411.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c427411.label = i - Integer.MIN_VALUE;
            } else {
                c427411 = new C427411(continuation);
            }
        }
        Object obj = c427411.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c427411.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            strCreateCacheKey = createCacheKey(str + paymentContext.getPaymentId(), TranslationsCache.Type.PRIMING);
            synchronized (this.lock) {
                if (this.isPrimingFetching) {
                    this.lock.wait();
                    Object fail = (Outcome) CollectionsKt.lastOrNull((List) this._primingTranslations.getReplayCache());
                    if (fail == null) {
                        fail = new Fail(CoreError.INSTANCE.mo27021default());
                    }
                    return fail;
                }
                this.isPrimingFetching = true;
                Unit unit = Unit.INSTANCE;
                UserPriming priming = this.cache.getPriming(strCreateCacheKey);
                if (priming != null) {
                    ok = new Ok<>(priming);
                    paymentContext2 = paymentContext;
                    translationProviderImpl = this;
                    z = ok instanceof Ok;
                    if (!z) {
                        translationProviderImpl.cache.savePriming(strCreateCacheKey, (UserPriming) ((Ok) ok).getValue());
                    } else if (!(ok instanceof Fail)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (!z) {
                        if (ok instanceof Fail) {
                            CoreError coreError = (CoreError) ((Fail) ok).getError();
                            translationProviderImpl.analytics.track(new AnalyticsEvents.BackgroundError(paymentContext2.getPaymentId(), coreError.getMessage(), ErrorUtils2.getLineNumber(), ErrorUtils2.getFileName(), null, coreError.getResponseBody(), coreError.getTraceId(), null, 144, null));
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    sharedFlow2 = translationProviderImpl._primingTranslations;
                    c427411.L$0 = translationProviderImpl;
                    c427411.L$1 = ok;
                    c427411.L$2 = null;
                    c427411.label = 2;
                    if (sharedFlow2.emit(ok, c427411) != coroutine_suspended) {
                        translationProviderImpl2 = translationProviderImpl;
                        synchronized (translationProviderImpl2.lock) {
                        }
                    }
                    return coroutine_suspended;
                }
                PaymentsExperienceApi paymentsExperienceApi = this.experienceApi;
                String resourceToken = paymentContext.getResourceToken();
                String paymentId = paymentContext.getPaymentId();
                c427411.L$0 = this;
                c427411.L$1 = paymentContext;
                c427411.L$2 = strCreateCacheKey;
                c427411.label = 1;
                Object userPriming = paymentsExperienceApi.getUserPriming(resourceToken, str, paymentId, c427411);
                if (userPriming != coroutine_suspended) {
                    obj = userPriming;
                    str2 = strCreateCacheKey;
                    translationProviderImpl = this;
                    paymentContext2 = paymentContext;
                }
                return coroutine_suspended;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ok = (Outcome) c427411.L$1;
            translationProviderImpl2 = (TranslationProviderImpl) c427411.L$0;
            ResultKt.throwOnFailure(obj);
            synchronized (translationProviderImpl2.lock) {
                translationProviderImpl2.isPrimingFetching = false;
                translationProviderImpl2.lock.notifyAll();
                Unit unit2 = Unit.INSTANCE;
            }
            return ok;
        }
        str2 = (String) c427411.L$2;
        paymentContext2 = (PaymentContext) c427411.L$1;
        translationProviderImpl = (TranslationProviderImpl) c427411.L$0;
        ResultKt.throwOnFailure(obj);
        Outcome<UserPriming, CoreError> outcome = (Outcome) obj;
        strCreateCacheKey = str2;
        ok = outcome;
        z = ok instanceof Ok;
        if (!z) {
        }
        if (!z) {
        }
        sharedFlow2 = translationProviderImpl._primingTranslations;
        c427411.L$0 = translationProviderImpl;
        c427411.L$1 = ok;
        c427411.L$2 = null;
        c427411.label = 2;
        if (sharedFlow2.emit(ok, c427411) != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    private final String createCacheKey(String key, TranslationsCache.Type type2) {
        return Locale.getDefault().toLanguageTag() + key + type2.name();
    }
}
