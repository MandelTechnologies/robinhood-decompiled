package com.robinhood.android.creditcard.p091ui.creditapplication;

import androidx.lifecycle.ViewModel2;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.creditcard.p091ui.CreditCardApplicationPromptAppUpdateExperiment;
import com.robinhood.android.creditcard.p091ui.CreditCardApplicationPromptAppUpdateExperiment2;
import com.robinhood.android.creditcard.p091ui.creditapplication.CreditApplicationDuxo6;
import com.robinhood.android.lib.store.creditcard.CreditCardStore;
import com.robinhood.android.lib.store.creditcard.prefs.CreditApplicationIdPref;
import com.robinhood.android.lib.store.creditcard.prefs.CreditCardEntryPointSourcePref;
import com.robinhood.android.lib.store.creditcard.prefs.IdentityIdPref;
import com.robinhood.android.models.creditcard.api.graphql.AddressType;
import com.robinhood.android.models.creditcard.api.graphql.CreditAccountStatusType;
import com.robinhood.android.models.creditcard.api.graphql.CreditApplicationPageObject;
import com.robinhood.android.models.creditcard.api.graphql.CreditApplicationPageResponse;
import com.robinhood.android.models.creditcard.api.graphql.CreditApplicationPageType;
import com.robinhood.android.models.creditcard.api.graphql.CreditApplicationsResponse;
import com.robinhood.android.models.creditcard.api.graphql.CreditCustomerRoleType;
import com.robinhood.android.models.creditcard.api.graphql.CreditCustomerStatusType;
import com.robinhood.android.models.creditcard.api.graphql.GraphqlValidationType;
import com.robinhood.android.models.creditcard.api.graphql.IdentityDetailsPrefillResponse;
import com.robinhood.android.models.creditcard.api.graphql.IdentityDetailsPrefillResponse2;
import com.robinhood.android.models.creditcard.api.graphql.IdentityEditabilityResponse;
import com.robinhood.android.models.creditcard.api.graphql.PremiumCreditLimitChoice;
import com.robinhood.android.models.creditcard.api.graphql.ServiceLevelType;
import com.robinhood.android.models.creditcard.api.graphql.ValidCreditApplicationInviteResponse;
import com.robinhood.android.models.creditcard.api.idverification.IdVerificationData;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.coroutines.dagger.annotation.DefaultDispatcher;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.prefs.StringPreference;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.utils.logging.CrashReporter;
import io.reactivex.Observable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxAwait3;
import p479j$.time.Instant;
import timber.log.Timber;

/* compiled from: CreditApplicationDuxo.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001BQ\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\b\u0001\u0010\f\u001a\u00020\r\u0012\b\b\u0001\u0010\u000e\u001a\u00020\r\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\r\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0002\b\u0019J)\u0010\u001a\u001a\u00020\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001cH\u0000¢\u0006\u0002\b\u001fJ\r\u0010 \u001a\u00020\u0017H\u0000¢\u0006\u0002\b!J\u000e\u0010\"\u001a\u00020\u0017H\u0082@¢\u0006\u0002\u0010#J\u0018\u0010$\u001a\u00020\u00172\b\u0010%\u001a\u0004\u0018\u00010&H\u0082@¢\u0006\u0002\u0010'R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationViewState;", "Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationEvent;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "creditCardStore", "Lcom/robinhood/android/lib/store/creditcard/CreditCardStore;", "experimentStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "identityId", "Lcom/robinhood/prefs/StringPreference;", "creditApplicationId", "defaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "creditCardEntryPointSourcePref", "<init>", "(Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/android/lib/store/creditcard/CreditCardStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/prefs/StringPreference;Lkotlinx/coroutines/CoroutineDispatcher;Lcom/robinhood/prefs/StringPreference;)V", "page", "Lcom/robinhood/android/models/creditcard/api/graphql/CreditApplicationPageType;", "onCreate", "", "underwrite", "underwrite$feature_credit_card_externalDebug", "handlePlaidSuccess", "originalAccountId", "", "plaidAccessToken", "updatedAccountId", "handlePlaidSuccess$feature_credit_card_externalDebug", "fetchLatestCreditApplicationPage", "fetchLatestCreditApplicationPage$feature_credit_card_externalDebug", "loadLatestCreditApplicationPage", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "identityPrefill", "authUser", "Lcom/robinhood/android/models/creditcard/api/graphql/CreditApplicationsResponse$AuthIdentityObject$CreditCustomer;", "(Lcom/robinhood/android/models/creditcard/api/graphql/CreditApplicationsResponse$AuthIdentityObject$CreditCustomer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class CreditApplicationDuxo extends BaseDuxo5<CreditApplicationViewState, CreditApplicationDuxo6> {
    public static final int $stable = 8;
    private final StringPreference creditApplicationId;
    private final StringPreference creditCardEntryPointSourcePref;
    private final CreditCardStore creditCardStore;
    private final CoroutineDispatcher defaultDispatcher;
    private final ExperimentsStore experimentStore;
    private final StringPreference identityId;
    private CreditApplicationPageType page;
    private final UserStore userStore;

    /* compiled from: CreditApplicationDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CreditApplicationPageType.values().length];
            try {
                iArr[CreditApplicationPageType.RUN_ELIGIBILITY_PROMPT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CreditApplicationPageType.ADDRESS_CHALLENGE_ENTRY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CreditApplicationPageType.IDENTITY_CONTEST_ENTRY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CreditApplicationPageType.CREDIT_FREEZE_PROMPT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CreditApplicationPageType.FRAUD_ALERT_PHONE_PROMPT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CreditApplicationPageType.APPLICATION_REVIEW_NOTICE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CreditApplicationPageType.ADVERSE_ACTION_NOTICE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CreditApplicationPageType.SSN_VERIFICATION_PROMPT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[CreditApplicationPageType.SSN_VERIFIED_PROMPT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[CreditApplicationPageType.LIMIT_REVEAL_PROMPT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[CreditApplicationPageType.FINAL_TERMS_PROMPT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[CreditApplicationPageType.SOLID_GOLD_DELAY_PROMPT.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[CreditApplicationPageType.SHIPPING_ADDRESS_ENTRY.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[CreditApplicationPageType.DOWNLOAD_APP_NOTICE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[CreditApplicationPageType.PLAID_CONNECTION_PROMPT.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[CreditApplicationPageType.UNKNOWN_ERROR_NOTICE.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: CreditApplicationDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.CreditApplicationDuxo", m3645f = "CreditApplicationDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_VALUE}, m3647m = "identityPrefill")
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.CreditApplicationDuxo$identityPrefill$1 */
    static final class C122291 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C122291(Continuation<? super C122291> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CreditApplicationDuxo.this.identityPrefill(null, this);
        }
    }

    /* compiled from: CreditApplicationDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.CreditApplicationDuxo", m3645f = "CreditApplicationDuxo.kt", m3646l = {383, 156, EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE, EnumC7081g.SDK_ASSET_ICON_EXTERNAL_VALUE, EnumC7081g.SDK_ASSET_ICON_COMMENT_VALUE, 280, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_DARK_APPEARANCE_VALUE}, m3647m = "loadLatestCreditApplicationPage")
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.CreditApplicationDuxo$loadLatestCreditApplicationPage$1 */
    static final class C122301 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C122301(Continuation<? super C122301> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CreditApplicationDuxo.this.loadLatestCreditApplicationPage(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreditApplicationDuxo(UserStore userStore, CreditCardStore creditCardStore, ExperimentsStore experimentStore, DuxoBundle duxoBundle, @IdentityIdPref StringPreference identityId, @CreditApplicationIdPref StringPreference creditApplicationId, @DefaultDispatcher CoroutineDispatcher defaultDispatcher, @CreditCardEntryPointSourcePref StringPreference creditCardEntryPointSourcePref) {
        super(new CreditApplicationViewState(false, false, 3, null), duxoBundle);
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(creditCardStore, "creditCardStore");
        Intrinsics.checkNotNullParameter(experimentStore, "experimentStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(identityId, "identityId");
        Intrinsics.checkNotNullParameter(creditApplicationId, "creditApplicationId");
        Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        Intrinsics.checkNotNullParameter(creditCardEntryPointSourcePref, "creditCardEntryPointSourcePref");
        this.userStore = userStore;
        this.creditCardStore = creditCardStore;
        this.experimentStore = experimentStore;
        this.identityId = identityId;
        this.creditApplicationId = creditApplicationId;
        this.defaultDispatcher = defaultDispatcher;
        this.creditCardEntryPointSourcePref = creditCardEntryPointSourcePref;
    }

    /* compiled from: CreditApplicationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.CreditApplicationDuxo$onCreate$1", m3645f = "CreditApplicationDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_GLOBE_VALUE, 76}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.CreditApplicationDuxo$onCreate$1 */
    static final class C122331 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* compiled from: CreditApplicationDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.CreditApplicationDuxo$onCreate$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[CreditCardApplicationPromptAppUpdateExperiment2.values().length];
                try {
                    iArr[CreditCardApplicationPromptAppUpdateExperiment2.FORCE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CreditCardApplicationPromptAppUpdateExperiment2.DISMISSABLE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        C122331(Continuation<? super C122331> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CreditApplicationDuxo.this.new C122331(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C122331) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
        
            if (r12.loadLatestCreditApplicationPage(r11) == r0) goto L26;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
            } catch (Throwable th) {
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 6, null);
                CreditApplicationDuxo.this.submit(CreditApplicationDuxo6.UnexpectedError.INSTANCE);
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CreditApplicationDuxo.this.experimentStore.refresh(false);
                Flow flowCoStreamVariant$default = ExperimentsProvider.DefaultImpls.coStreamVariant$default(CreditApplicationDuxo.this.experimentStore, CreditCardApplicationPromptAppUpdateExperiment.INSTANCE, CreditCardApplicationPromptAppUpdateExperiment2.CONTROL, false, 4, null);
                this.label = 1;
                obj = FlowKt.firstOrNull(flowCoStreamVariant$default, this);
                if (obj == coroutine_suspended) {
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
            ResultKt.throwOnFailure(obj);
            CreditCardApplicationPromptAppUpdateExperiment2 creditCardApplicationPromptAppUpdateExperiment2 = (CreditCardApplicationPromptAppUpdateExperiment2) obj;
            int i2 = creditCardApplicationPromptAppUpdateExperiment2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[creditCardApplicationPromptAppUpdateExperiment2.ordinal()];
            if (i2 == 1) {
                CreditApplicationDuxo.this.submit(new CreditApplicationDuxo6.PromptUpdate(false));
            } else if (i2 == 2) {
                CreditApplicationDuxo.this.submit(new CreditApplicationDuxo6.PromptUpdate(true));
            } else {
                CreditApplicationDuxo creditApplicationDuxo = CreditApplicationDuxo.this;
                this.label = 2;
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), this.defaultDispatcher, null, new C122331(null), 2, null);
    }

    public final void underwrite$feature_credit_card_externalDebug() {
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), this.defaultDispatcher, null, new CreditApplicationDuxo4(this, null), 2, null);
    }

    public final void handlePlaidSuccess$feature_credit_card_externalDebug(String originalAccountId, String plaidAccessToken, String updatedAccountId) {
        Intrinsics.checkNotNullParameter(plaidAccessToken, "plaidAccessToken");
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), null, null, new CreditApplicationDuxo3(this, originalAccountId, updatedAccountId, plaidAccessToken, null), 3, null);
    }

    /* renamed from: fetchLatestCreditApplicationPage$feature_credit_card_externalDebug */
    public final void m1875xb14037d7() {
        withDataState(new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.CreditApplicationDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreditApplicationDuxo.fetchLatestCreditApplicationPage$lambda$0(this.f$0, (CreditApplicationViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fetchLatestCreditApplicationPage$lambda$0(CreditApplicationDuxo creditApplicationDuxo, CreditApplicationViewState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (!it.isPageStateLoading()) {
            BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(creditApplicationDuxo), creditApplicationDuxo.defaultDispatcher, null, new CreditApplicationDuxo2(creditApplicationDuxo, null), 2, null);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: CreditApplicationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.CreditApplicationDuxo$loadLatestCreditApplicationPage$2", m3645f = "CreditApplicationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.CreditApplicationDuxo$loadLatestCreditApplicationPage$2 */
    static final class C122312 extends ContinuationImpl7 implements Function2<CreditApplicationViewState, Continuation<? super CreditApplicationViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C122312(Continuation<? super C122312> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C122312 c122312 = new C122312(continuation);
            c122312.L$0 = obj;
            return c122312;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CreditApplicationViewState creditApplicationViewState, Continuation<? super CreditApplicationViewState> continuation) {
            return ((C122312) create(creditApplicationViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return CreditApplicationViewState.copy$default((CreditApplicationViewState) this.L$0, false, true, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0403, code lost:
    
        if (identityPrefill(r1, r2) == r3) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01c8, code lost:
    
        if (identityPrefill(r1, r2) == r3) goto L228;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0234 A[Catch: Exception -> 0x0253, TRY_ENTER, TryCatch #0 {Exception -> 0x0253, blocks: (B:12:0x0032, B:120:0x0247, B:117:0x0234), top: B:231:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a4 A[PHI: r1 r4
      0x00a4: PHI (r1v13 java.lang.Object) = (r1v12 java.lang.Object), (r1v1 java.lang.Object) binds: [B:24:0x00a0, B:18:0x0068] A[DONT_GENERATE, DONT_INLINE]
      0x00a4: PHI (r4v2 java.util.UUID) = (r4v1 java.util.UUID), (r4v7 java.util.UUID) binds: [B:24:0x00a0, B:18:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01cc  */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadLatestCreditApplicationPage(Continuation<? super Unit> continuation) {
        C122301 c122301;
        UUID id;
        CreditApplicationsResponse.AuthIdentityObject authIdentity;
        Object validCreditApplicationInvites;
        Ref.ObjectRef objectRef;
        T next;
        ValidCreditApplicationInviteResponse validCreditApplicationInviteResponse;
        boolean z;
        CreditApplicationsResponse.AuthIdentityObject.CreditApplication creditApplication;
        Ref.ObjectRef objectRef2;
        CreditApplicationsResponse.AuthIdentityObject.CreditApplication creditApplication2;
        List<CreditApplicationsResponse.AuthIdentityObject.CreditApplication> creditApplications;
        ValidCreditApplicationInviteResponse.Response creditApplicationInvites;
        List<ValidCreditApplicationInviteResponse.Response.Invite> invites;
        CreditApplicationPageType page;
        CreditApplicationsResponse.AuthIdentityObject authIdentityObject;
        CreditApplicationsResponse.AuthIdentityObject.CreditApplication.CreditReport entity;
        CreditApplicationsResponse.AuthIdentityObject.Settings settings;
        CreditApplicationPageObject creditApplicationPage;
        IdentityEditabilityResponse.ApiResponse apiResponse;
        String firstName;
        String lastName;
        IdentityEditabilityResponse.ApiResponse.EditabilityContext ssn;
        IdentityEditabilityResponse.ApiResponse.EditabilityContext dob;
        IdentityEditabilityResponse.ApiResponse.EditabilityContext lastName2;
        IdentityEditabilityResponse.ApiResponse.EditabilityContext firstName2;
        CreditApplicationsResponse.AuthIdentityObject.Settings settings2;
        CreditApplicationsResponse.AuthIdentityObject.Settings.BirthdayType birthday;
        String date;
        CreditApplicationsResponse.AuthIdentityObject.Settings settings3;
        CreditApplicationsResponse.AuthIdentityObject.Settings.NameType name;
        CreditApplicationsResponse.AuthIdentityObject.Settings settings4;
        CreditApplicationsResponse.AuthIdentityObject.Settings.NameType name2;
        if (continuation instanceof C122301) {
            c122301 = (C122301) continuation;
            int i = c122301.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c122301.label = i - Integer.MIN_VALUE;
            } else {
                c122301 = new C122301(continuation);
            }
        }
        Object objAwaitFirst = c122301.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        boolean z2 = false;
        try {
        } catch (Exception unused) {
            submit(new CreditApplicationDuxo6.DownloadAppNotice(null, 1, null));
        }
        switch (c122301.label) {
            case 0:
                ResultKt.throwOnFailure(objAwaitFirst);
                applyMutation(new C122312(null));
                Observable<User> user = this.userStore.getUser();
                c122301.label = 1;
                objAwaitFirst = RxAwait3.awaitFirst(user, c122301);
                if (objAwaitFirst != coroutine_suspended) {
                    id = ((User) objAwaitFirst).getId();
                    CreditCardStore creditCardStore = this.creditCardStore;
                    c122301.L$0 = id;
                    c122301.label = 2;
                    objAwaitFirst = creditCardStore.getCreditApplications(c122301);
                    if (objAwaitFirst != coroutine_suspended) {
                        CreditApplicationsResponse creditApplicationsResponse = (CreditApplicationsResponse) objAwaitFirst;
                        authIdentity = creditApplicationsResponse == null ? creditApplicationsResponse.getAuthIdentity() : null;
                        Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
                        if ((authIdentity == null ? authIdentity.getId() : null) != null) {
                            this.identityId.set(authIdentity.getId());
                            List<CreditApplicationsResponse.AuthIdentityObject.CreditCustomer> creditCustomers = authIdentity.getCreditCustomers();
                            if (creditCustomers != null) {
                                Iterator<T> it = creditCustomers.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        next = it.next();
                                        CreditApplicationsResponse.AuthIdentityObject.CreditCustomer creditCustomer = (CreditApplicationsResponse.AuthIdentityObject.CreditCustomer) next;
                                        if (creditCustomer.getRole() == CreditCustomerRoleType.AUTHORIZED_USER && creditCustomer.getSettings().getStatus() != CreditCustomerStatusType.CLOSED && creditCustomer.getAccount().getBasicInfo() != null) {
                                            CreditApplicationsResponse.AuthIdentityObject.CreditCustomer.CreditAccount.CreditAccountBasicInfo basicInfo = creditCustomer.getAccount().getBasicInfo();
                                            if ((basicInfo != null ? basicInfo.getAccountStatus() : null) != CreditAccountStatusType.CLOSED) {
                                            }
                                        }
                                    } else {
                                        next = 0;
                                    }
                                }
                                objectRef3.element = next;
                            }
                        }
                        CreditCardStore creditCardStore2 = this.creditCardStore;
                        String string2 = id.toString();
                        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                        c122301.L$0 = authIdentity;
                        c122301.L$1 = objectRef3;
                        c122301.label = 3;
                        validCreditApplicationInvites = creditCardStore2.getValidCreditApplicationInvites(string2, c122301);
                        if (validCreditApplicationInvites != coroutine_suspended) {
                            objectRef = objectRef3;
                            objAwaitFirst = validCreditApplicationInvites;
                            validCreditApplicationInviteResponse = (ValidCreditApplicationInviteResponse) objAwaitFirst;
                            if (validCreditApplicationInviteResponse != null || (creditApplicationInvites = validCreditApplicationInviteResponse.getCreditApplicationInvites()) == null || (invites = creditApplicationInvites.getInvites()) == null) {
                                z = false;
                                List listSortedWith = (authIdentity != null || (creditApplications = authIdentity.getCreditApplications()) == null) ? null : CollectionsKt.sortedWith(creditApplications, new Comparator() { // from class: com.robinhood.android.creditcard.ui.creditapplication.CreditApplicationDuxo$loadLatestCreditApplicationPage$$inlined$sortedByDescending$1
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // java.util.Comparator
                                    public final int compare(T t, T t2) {
                                        return ComparisonsKt.compareValues(Long.valueOf(((CreditApplicationsResponse.AuthIdentityObject.CreditApplication) t2).getCreatedAt()), Long.valueOf(((CreditApplicationsResponse.AuthIdentityObject.CreditApplication) t).getCreatedAt()));
                                    }
                                });
                                List list = listSortedWith;
                                creditApplication = (list != null || list.isEmpty()) ? null : (CreditApplicationsResponse.AuthIdentityObject.CreditApplication) listSortedWith.get(0);
                                if (creditApplication == null) {
                                    this.creditApplicationId.set(creditApplication.getId());
                                    CreditCardStore creditCardStore3 = this.creditCardStore;
                                    String id2 = creditApplication.getId();
                                    CreditApplicationPageType creditApplicationPageType = this.page;
                                    c122301.L$0 = authIdentity;
                                    c122301.L$1 = objectRef;
                                    c122301.L$2 = creditApplication;
                                    c122301.label = 5;
                                    objAwaitFirst = creditCardStore3.getCreditApplicationPage(id2, creditApplicationPageType, c122301);
                                    if (objAwaitFirst != coroutine_suspended) {
                                        CreditApplicationsResponse.AuthIdentityObject.CreditApplication creditApplication3 = creditApplication;
                                        objectRef2 = objectRef;
                                        creditApplication2 = creditApplication3;
                                        CreditApplicationPageResponse creditApplicationPageResponse = (CreditApplicationPageResponse) objAwaitFirst;
                                        page = (creditApplicationPageResponse != null || (creditApplicationPage = creditApplicationPageResponse.getCreditApplicationPage()) == null) ? null : creditApplicationPage.getPage();
                                        this.page = page;
                                        switch (page != null ? -1 : WhenMappings.$EnumSwitchMapping$0[page.ordinal()]) {
                                            case -1:
                                                CreditApplicationsResponse.AuthIdentityObject.CreditCustomer creditCustomer2 = (CreditApplicationsResponse.AuthIdentityObject.CreditCustomer) objectRef2.element;
                                                c122301.L$0 = null;
                                                c122301.L$1 = null;
                                                c122301.L$2 = null;
                                                c122301.label = 8;
                                                break;
                                            case 0:
                                            default:
                                                throw new NoWhenBranchMatchedException();
                                            case 1:
                                                submit(new CreditApplicationDuxo6.RunEligibilityPrompt((CreditApplicationsResponse.AuthIdentityObject.CreditCustomer) objectRef2.element));
                                                break;
                                            case 2:
                                                submit(CreditApplicationDuxo6.AddressChallengeEntry.INSTANCE);
                                                break;
                                            case 3:
                                                CreditCardStore creditCardStore4 = this.creditCardStore;
                                                c122301.L$0 = authIdentity;
                                                c122301.L$1 = null;
                                                c122301.L$2 = null;
                                                c122301.label = 6;
                                                objAwaitFirst = creditCardStore4.getIdentityEditability(c122301);
                                                if (objAwaitFirst != coroutine_suspended) {
                                                    authIdentityObject = authIdentity;
                                                    apiResponse = (IdentityEditabilityResponse.ApiResponse) objAwaitFirst;
                                                    if (authIdentityObject != null || (settings4 = authIdentityObject.getSettings()) == null || (name2 = settings4.getName()) == null || (firstName = name2.getFirstName()) == null) {
                                                        firstName = "";
                                                    }
                                                    if (authIdentityObject != null || (settings3 = authIdentityObject.getSettings()) == null || (name = settings3.getName()) == null || (lastName = name.getLastName()) == null) {
                                                        lastName = "";
                                                    }
                                                    String str = (authIdentityObject != null || (settings2 = authIdentityObject.getSettings()) == null || (birthday = settings2.getBirthday()) == null || (date = CreditApplicationDuxo5.toDate(birthday.getBornAt())) == null) ? "" : date;
                                                    boolean z3 = !((apiResponse != null || (firstName2 = apiResponse.getFirstName()) == null || firstName2.getEditability()) ? false : true);
                                                    boolean z4 = !((apiResponse != null || (lastName2 = apiResponse.getLastName()) == null || lastName2.getEditability()) ? false : true);
                                                    boolean z5 = !((apiResponse != null || (dob = apiResponse.getDob()) == null || dob.getEditability()) ? false : true);
                                                    if (apiResponse != null && (ssn = apiResponse.getSsn()) != null && !ssn.getEditability()) {
                                                        z2 = true;
                                                    }
                                                    submit(new CreditApplicationDuxo6.IdentityContestEntry(new IdVerificationData(firstName, lastName, str, "", z3, z4, z5, !z2)));
                                                    break;
                                                }
                                                break;
                                            case 4:
                                                submit(CreditApplicationDuxo6.CreditFreezePrompt.INSTANCE);
                                                break;
                                            case 5:
                                                CreditApplicationsResponse.AuthIdentityObject.CreditApplication.IdentityLinkType<CreditApplicationsResponse.AuthIdentityObject.CreditApplication.CreditReport> creditReport = creditApplication2.getCreditReport();
                                                String fraudAlertPhoneHint = (creditReport == null || (entity = creditReport.getEntity()) == null) ? null : entity.getFraudAlertPhoneHint();
                                                Intrinsics.checkNotNull(fraudAlertPhoneHint);
                                                submit(new CreditApplicationDuxo6.FraudAlertPhonePrompt(fraudAlertPhoneHint));
                                                break;
                                            case 6:
                                                submit(CreditApplicationDuxo6.ApplicationReviewNotice.INSTANCE);
                                                break;
                                            case 7:
                                                submit(new CreditApplicationDuxo6.AdverseActionNotice(creditApplication2.getServiceLevel() == ServiceLevelType.RH_SOLID_GOLD));
                                                break;
                                            case 8:
                                                submit(CreditApplicationDuxo6.SsnVerification.INSTANCE);
                                                break;
                                            case 9:
                                                submit(CreditApplicationDuxo6.SsnVerified.INSTANCE);
                                                break;
                                            case 10:
                                                CreditApplicationsResponse.AuthIdentityObject.CreditApplication.CreditTerms selectedTerms = creditApplication2.getSelectedTerms();
                                                Long limitMaxMicro = selectedTerms != null ? selectedTerms.getLimitMaxMicro() : null;
                                                Intrinsics.checkNotNull(limitMaxMicro);
                                                long jLongValue = limitMaxMicro.longValue();
                                                List<PremiumCreditLimitChoice> premiumCreditLimitChoices = creditApplication2.getPremiumCreditLimitChoices();
                                                if (premiumCreditLimitChoices == null) {
                                                    premiumCreditLimitChoices = CollectionsKt.emptyList();
                                                }
                                                submit(new CreditApplicationDuxo6.LimitRevealPrompt(jLongValue, premiumCreditLimitChoices, creditApplication2.getPremiumCreditLimitExpiresAt()));
                                                break;
                                            case 11:
                                                if (authIdentity == null) {
                                                    submit(CreditApplicationDuxo6.UnexpectedError.INSTANCE);
                                                    break;
                                                } else {
                                                    submit(new CreditApplicationDuxo6.FinalTermsPrompt(authIdentity.getGoldContext().getAnnualFeeMicro()));
                                                    break;
                                                }
                                            case 12:
                                                submit(CreditApplicationDuxo6.SolidGoldDelay.INSTANCE);
                                                break;
                                            case 13:
                                                AddressType residentialAddress = (authIdentity == null || (settings = authIdentity.getSettings()) == null) ? null : settings.getResidentialAddress();
                                                Intrinsics.checkNotNull(residentialAddress);
                                                submit(new CreditApplicationDuxo6.ShippingAddressEntry(residentialAddress, creditApplication2.getServiceLevel() == ServiceLevelType.RH_SOLID_GOLD, this.creditCardEntryPointSourcePref.get()));
                                                break;
                                            case 14:
                                                CreditCardStore creditCardStore5 = this.creditCardStore;
                                                c122301.L$0 = null;
                                                c122301.L$1 = null;
                                                c122301.L$2 = null;
                                                c122301.label = 7;
                                                objAwaitFirst = creditCardStore5.getAppStoreUrl(c122301);
                                                if (objAwaitFirst == coroutine_suspended) {
                                                    break;
                                                }
                                                submit(new CreditApplicationDuxo6.DownloadAppNotice((String) objAwaitFirst));
                                                break;
                                            case 15:
                                                submit(CreditApplicationDuxo6.AdditionalVerificationScreen.INSTANCE);
                                                break;
                                            case 16:
                                                Timber.INSTANCE.mo3356i("[creditapp] received unknown error/unsupported enum, showing update prompt", new Object[0]);
                                                submit(new CreditApplicationDuxo6.PromptUpdate(false));
                                                break;
                                        }
                                    }
                                } else {
                                    this.creditApplicationId.delete();
                                    if (z) {
                                        CreditApplicationsResponse.AuthIdentityObject.CreditCustomer creditCustomer3 = (CreditApplicationsResponse.AuthIdentityObject.CreditCustomer) objectRef.element;
                                        c122301.L$0 = null;
                                        c122301.L$1 = null;
                                        c122301.label = 4;
                                        break;
                                    } else {
                                        submit(CreditApplicationDuxo6.InviteExpired.INSTANCE);
                                    }
                                }
                            } else {
                                List<ValidCreditApplicationInviteResponse.Response.Invite> list2 = invites;
                                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                                    Iterator<T> it2 = list2.iterator();
                                    while (it2.hasNext()) {
                                        Long expiresAt = ((ValidCreditApplicationInviteResponse.Response.Invite) it2.next()).getExpiresAt();
                                        if (expiresAt == null || Instant.now().compareTo(Instant.ofEpochMilli(expiresAt.longValue())) <= 0) {
                                            z = true;
                                            if (authIdentity != null) {
                                                List list3 = listSortedWith;
                                                if (list3 != null) {
                                                    if (creditApplication == null) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    z = false;
                                    if (authIdentity != null) {
                                    }
                                }
                            }
                            applyMutation(new C122324(null));
                            return Unit.INSTANCE;
                        }
                    }
                }
                return coroutine_suspended;
            case 1:
                ResultKt.throwOnFailure(objAwaitFirst);
                id = ((User) objAwaitFirst).getId();
                CreditCardStore creditCardStore6 = this.creditCardStore;
                c122301.L$0 = id;
                c122301.label = 2;
                objAwaitFirst = creditCardStore6.getCreditApplications(c122301);
                if (objAwaitFirst != coroutine_suspended) {
                }
                return coroutine_suspended;
            case 2:
                id = (UUID) c122301.L$0;
                ResultKt.throwOnFailure(objAwaitFirst);
                CreditApplicationsResponse creditApplicationsResponse2 = (CreditApplicationsResponse) objAwaitFirst;
                if (creditApplicationsResponse2 == null) {
                }
                Ref.ObjectRef objectRef32 = new Ref.ObjectRef();
                if ((authIdentity == null ? authIdentity.getId() : null) != null) {
                }
                CreditCardStore creditCardStore22 = this.creditCardStore;
                String string22 = id.toString();
                Intrinsics.checkNotNullExpressionValue(string22, "toString(...)");
                c122301.L$0 = authIdentity;
                c122301.L$1 = objectRef32;
                c122301.label = 3;
                validCreditApplicationInvites = creditCardStore22.getValidCreditApplicationInvites(string22, c122301);
                if (validCreditApplicationInvites != coroutine_suspended) {
                }
                return coroutine_suspended;
            case 3:
                objectRef = (Ref.ObjectRef) c122301.L$1;
                authIdentity = (CreditApplicationsResponse.AuthIdentityObject) c122301.L$0;
                ResultKt.throwOnFailure(objAwaitFirst);
                validCreditApplicationInviteResponse = (ValidCreditApplicationInviteResponse) objAwaitFirst;
                if (validCreditApplicationInviteResponse != null) {
                    z = false;
                    if (authIdentity != null) {
                    }
                    break;
                }
                applyMutation(new C122324(null));
                return Unit.INSTANCE;
            case 4:
            case 8:
                ResultKt.throwOnFailure(objAwaitFirst);
                applyMutation(new C122324(null));
                return Unit.INSTANCE;
            case 5:
                creditApplication2 = (CreditApplicationsResponse.AuthIdentityObject.CreditApplication) c122301.L$2;
                Ref.ObjectRef objectRef4 = (Ref.ObjectRef) c122301.L$1;
                CreditApplicationsResponse.AuthIdentityObject authIdentityObject2 = (CreditApplicationsResponse.AuthIdentityObject) c122301.L$0;
                ResultKt.throwOnFailure(objAwaitFirst);
                objectRef2 = objectRef4;
                authIdentity = authIdentityObject2;
                CreditApplicationPageResponse creditApplicationPageResponse2 = (CreditApplicationPageResponse) objAwaitFirst;
                if (creditApplicationPageResponse2 != null) {
                    this.page = page;
                    switch (page != null ? -1 : WhenMappings.$EnumSwitchMapping$0[page.ordinal()]) {
                    }
                }
                applyMutation(new C122324(null));
                return Unit.INSTANCE;
            case 6:
                authIdentityObject = (CreditApplicationsResponse.AuthIdentityObject) c122301.L$0;
                ResultKt.throwOnFailure(objAwaitFirst);
                apiResponse = (IdentityEditabilityResponse.ApiResponse) objAwaitFirst;
                if (authIdentityObject != null) {
                    firstName = "";
                    if (authIdentityObject != null) {
                        lastName = "";
                        if (authIdentityObject != null) {
                            if (apiResponse != null) {
                                boolean z32 = !((apiResponse != null || (firstName2 = apiResponse.getFirstName()) == null || firstName2.getEditability()) ? false : true);
                                if (apiResponse != null) {
                                    boolean z42 = !((apiResponse != null || (lastName2 = apiResponse.getLastName()) == null || lastName2.getEditability()) ? false : true);
                                    if (apiResponse != null) {
                                        boolean z52 = !((apiResponse != null || (dob = apiResponse.getDob()) == null || dob.getEditability()) ? false : true);
                                        if (apiResponse != null) {
                                            z2 = true;
                                            break;
                                        }
                                        submit(new CreditApplicationDuxo6.IdentityContestEntry(new IdVerificationData(firstName, lastName, str, "", z32, z42, z52, !z2)));
                                        break;
                                    }
                                    break;
                                }
                                break;
                            }
                            break;
                        }
                        break;
                    }
                    break;
                }
                applyMutation(new C122324(null));
                return Unit.INSTANCE;
            case 7:
                ResultKt.throwOnFailure(objAwaitFirst);
                submit(new CreditApplicationDuxo6.DownloadAppNotice((String) objAwaitFirst));
                applyMutation(new C122324(null));
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: CreditApplicationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.CreditApplicationDuxo$loadLatestCreditApplicationPage$4", m3645f = "CreditApplicationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.CreditApplicationDuxo$loadLatestCreditApplicationPage$4 */
    static final class C122324 extends ContinuationImpl7 implements Function2<CreditApplicationViewState, Continuation<? super CreditApplicationViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C122324(Continuation<? super C122324> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C122324 c122324 = new C122324(continuation);
            c122324.L$0 = obj;
            return c122324;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CreditApplicationViewState creditApplicationViewState, Continuation<? super CreditApplicationViewState> continuation) {
            return ((C122324) create(creditApplicationViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return CreditApplicationViewState.copy$default((CreditApplicationViewState) this.L$0, false, false, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object identityPrefill(CreditApplicationsResponse.AuthIdentityObject.CreditCustomer creditCustomer, Continuation<? super Unit> continuation) {
        C122291 c122291;
        CreditApplicationsResponse.AuthIdentityObject.CreditCustomer creditCustomer2;
        CreditApplicationsResponse.AuthIdentityObject.CreditCustomer creditCustomer3;
        Throwable th;
        IdentityDetailsPrefillResponse2 identityDetailsPrefillResponse2;
        IdentityDetailsPrefillResponse2 identityDetailsPrefillResponse22;
        GraphqlValidationType<IdentityDetailsPrefillResponse2> identityDetailsPrefill;
        if (continuation instanceof C122291) {
            c122291 = (C122291) continuation;
            int i = c122291.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c122291.label = i - Integer.MIN_VALUE;
            } else {
                c122291 = new C122291(continuation);
            }
        }
        Object identityDetailsPrefill2 = c122291.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c122291.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(identityDetailsPrefill2);
            IdentityDetailsPrefillResponse2 identityDetailsPrefillResponse23 = new IdentityDetailsPrefillResponse2(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
            try {
                CreditCardStore creditCardStore = this.creditCardStore;
                creditCustomer2 = creditCustomer;
                try {
                    c122291.L$0 = creditCustomer2;
                    c122291.L$1 = identityDetailsPrefillResponse23;
                    c122291.label = 1;
                    identityDetailsPrefill2 = creditCardStore.getIdentityDetailsPrefill(c122291);
                    if (identityDetailsPrefill2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    creditCustomer3 = creditCustomer2;
                    identityDetailsPrefillResponse22 = identityDetailsPrefillResponse23;
                } catch (Throwable th2) {
                    th = th2;
                    creditCustomer3 = creditCustomer2;
                    th = th;
                    identityDetailsPrefillResponse2 = identityDetailsPrefillResponse23;
                    CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 6, null);
                    Timber.INSTANCE.mo3355e(th, "identityDetailsPrefill error", new Object[0]);
                    submit(new CreditApplicationDuxo6.Identity(identityDetailsPrefillResponse2, creditCustomer3));
                    return Unit.INSTANCE;
                }
            } catch (Throwable th3) {
                th = th3;
                creditCustomer2 = creditCustomer;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            identityDetailsPrefillResponse22 = (IdentityDetailsPrefillResponse2) c122291.L$1;
            creditCustomer3 = (CreditApplicationsResponse.AuthIdentityObject.CreditCustomer) c122291.L$0;
            try {
                ResultKt.throwOnFailure(identityDetailsPrefill2);
            } catch (Throwable th4) {
                th = th4;
                identityDetailsPrefillResponse2 = identityDetailsPrefillResponse22;
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 6, null);
                Timber.INSTANCE.mo3355e(th, "identityDetailsPrefill error", new Object[0]);
                submit(new CreditApplicationDuxo6.Identity(identityDetailsPrefillResponse2, creditCustomer3));
                return Unit.INSTANCE;
            }
        }
        IdentityDetailsPrefillResponse identityDetailsPrefillResponse = (IdentityDetailsPrefillResponse) identityDetailsPrefill2;
        if (identityDetailsPrefillResponse == null || (identityDetailsPrefill = identityDetailsPrefillResponse.getIdentityDetailsPrefill()) == null || (identityDetailsPrefillResponse2 = identityDetailsPrefill.getData()) == null) {
            identityDetailsPrefillResponse2 = new IdentityDetailsPrefillResponse2(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        }
        submit(new CreditApplicationDuxo6.Identity(identityDetailsPrefillResponse2, creditCustomer3));
        return Unit.INSTANCE;
    }
}
