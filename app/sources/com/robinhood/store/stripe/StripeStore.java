package com.robinhood.store.stripe;

import android.content.Context;
import com.plaid.internal.EnumC7081g;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.api.bonfire.paymentinstruments.ApiDebitCardDetails;
import com.robinhood.models.api.bonfire.paymentinstruments.ApiLinkDebitCardRequest;
import com.robinhood.models.api.bonfire.paymentinstruments.PaymentInstrumentType;
import com.robinhood.models.api.bonfire.paymentinstruments.PaymentProviderType;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.Stripe;
import com.stripe.android.StripeKtx;
import com.stripe.android.core.exception.APIConnectionException;
import com.stripe.android.core.exception.APIException;
import com.stripe.android.core.exception.AuthenticationException;
import com.stripe.android.core.exception.InvalidRequestException;
import com.stripe.android.exception.CardException;
import com.stripe.android.model.Address;
import com.stripe.android.model.CardParams;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.RadarSession;
import com.stripe.android.model.Token;
import dispatch.core.Suspend;
import io.reactivex.Observable;
import java.util.Arrays;
import java.util.LinkedHashMap;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: StripeStore.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 -2\u00020\u0001:\u0001-BA\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0016\u001a\u00020\u000fH\u0002J\b\u0010\u001b\u001a\u00020\u000fH\u0002J\b\u0010 \u001a\u00020\u000fH\u0002J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0086@¢\u0006\u0002\u0010%J\u0006\u0010&\u001a\u00020'J\u0016\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0086@¢\u0006\u0002\u0010,R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R!\u0010\u000e\u001a\u00020\u000f8BX\u0083\u0084\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R!\u0010\u0017\u001a\u00020\u000f8BX\u0083\u0084\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u0015\u0012\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013R!\u0010\u001c\u001a\u00020\u000f8BX\u0083\u0084\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010\u0015\u0012\u0004\b\u001d\u0010\u0011\u001a\u0004\b\u001e\u0010\u0013¨\u0006."}, m3636d2 = {"Lcom/robinhood/store/stripe/StripeStore;", "Lcom/robinhood/store/Store;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "context", "Landroid/content/Context;", "rhmStripeApiKeyResource", "", "rhsStripeApiKeyResource", "rhyStripeApiKeyResource", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/shared/store/user/UserStore;Landroid/content/Context;IIILcom/robinhood/store/StoreBundle;)V", "lazyRhmStripe", "Lcom/stripe/android/Stripe;", "getLazyRhmStripe$annotations", "()V", "getLazyRhmStripe", "()Lcom/stripe/android/Stripe;", "lazyRhmStripe$delegate", "Lkotlin/Lazy;", "getRhmStripe", "lazyRhsStripe", "getLazyRhsStripe$annotations", "getLazyRhsStripe", "lazyRhsStripe$delegate", "getRhsStripe", "lazyRhyStripe", "getLazyRhyStripe$annotations", "getLazyRhyStripe", "lazyRhyStripe$delegate", "getRhyStripe", "getRadarSessionId", "", "sinkAccountType", "Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;", "(Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initDebitCardConfiguration", "", "getTokenizedDebitCardRequest", "Lcom/robinhood/models/api/bonfire/paymentinstruments/ApiLinkDebitCardRequest;", "cardParams", "Lcom/stripe/android/model/CardParams;", "(Lcom/stripe/android/model/CardParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "lib-store-stripe_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class StripeStore extends Store {
    public static final String userIdMetadataForStripeKey = "rh_user_id";
    private final Context context;

    /* renamed from: lazyRhmStripe$delegate, reason: from kotlin metadata */
    private final Lazy lazyRhmStripe;

    /* renamed from: lazyRhsStripe$delegate, reason: from kotlin metadata */
    private final Lazy lazyRhsStripe;

    /* renamed from: lazyRhyStripe$delegate, reason: from kotlin metadata */
    private final Lazy lazyRhyStripe;
    private final int rhmStripeApiKeyResource;
    private final int rhsStripeApiKeyResource;
    private final int rhyStripeApiKeyResource;
    private final UserStore userStore;

    /* compiled from: StripeStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiTransferAccount.TransferAccountType.values().length];
            try {
                iArr[ApiTransferAccount.TransferAccountType.JOINT_TENANCY_WITH_ROS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.RHS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.RHY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.ACH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.DEBIT_CARD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.IRA_ROTH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.IRA_TRADITIONAL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.RHCE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.SEPA.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.UK_BANK_ACCOUNT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.I18N_BANK_ACCOUNT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.OUTGOING_WIRE_ACCOUNT.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.RHY_BANKING.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.RHUK_ISA_STOCKS_AND_SHARES.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.CUSTODIAL_UGMA.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.CUSTODIAL_UTMA.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.UNKNOWN.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: StripeStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.stripe.StripeStore", m3645f = "StripeStore.kt", m3646l = {131}, m3647m = "getRadarSessionId")
    /* renamed from: com.robinhood.store.stripe.StripeStore$getRadarSessionId$1 */
    static final class C415741 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C415741(Continuation<? super C415741> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return StripeStore.this.getRadarSessionId(null, this);
        }
    }

    @Deprecated
    private static /* synthetic */ void getLazyRhmStripe$annotations() {
    }

    @Deprecated
    private static /* synthetic */ void getLazyRhsStripe$annotations() {
    }

    @Deprecated
    private static /* synthetic */ void getLazyRhyStripe$annotations() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripeStore(UserStore userStore, Context context, @RhmStripeApiKeyResource int i, @RhsStripeApiKeyResource int i2, @RhyStripeApiKeyResource int i3, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.userStore = userStore;
        this.context = context;
        this.rhmStripeApiKeyResource = i;
        this.rhsStripeApiKeyResource = i2;
        this.rhyStripeApiKeyResource = i3;
        Stripe.INSTANCE.setAdvancedFraudSignalsEnabled(true);
        this.lazyRhmStripe = LazyKt.lazy(new Function0() { // from class: com.robinhood.store.stripe.StripeStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StripeStore.lazyRhmStripe_delegate$lambda$0(this.f$0);
            }
        });
        this.lazyRhsStripe = LazyKt.lazy(new Function0() { // from class: com.robinhood.store.stripe.StripeStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StripeStore.lazyRhsStripe_delegate$lambda$1(this.f$0);
            }
        });
        this.lazyRhyStripe = LazyKt.lazy(new Function0() { // from class: com.robinhood.store.stripe.StripeStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StripeStore.lazyRhyStripe_delegate$lambda$2(this.f$0);
            }
        });
    }

    private final Stripe getLazyRhmStripe() {
        return (Stripe) this.lazyRhmStripe.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Stripe lazyRhmStripe_delegate$lambda$0(StripeStore stripeStore) {
        Context context = stripeStore.context;
        return new Stripe(context, PaymentConfiguration.INSTANCE.getInstance(context).getPublishableKey(), null, true, null, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Stripe getRhmStripe() {
        PaymentConfiguration.Companion companion = PaymentConfiguration.INSTANCE;
        Context context = this.context;
        String string2 = context.getString(this.rhmStripeApiKeyResource);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        PaymentConfiguration.Companion.init$default(companion, context, string2, null, 4, null);
        return getLazyRhmStripe();
    }

    private final Stripe getLazyRhsStripe() {
        return (Stripe) this.lazyRhsStripe.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Stripe lazyRhsStripe_delegate$lambda$1(StripeStore stripeStore) {
        Context context = stripeStore.context;
        return new Stripe(context, PaymentConfiguration.INSTANCE.getInstance(context).getPublishableKey(), null, true, null, 16, null);
    }

    private final Stripe getRhsStripe() {
        PaymentConfiguration.Companion companion = PaymentConfiguration.INSTANCE;
        Context context = this.context;
        String string2 = context.getString(this.rhsStripeApiKeyResource);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        PaymentConfiguration.Companion.init$default(companion, context, string2, null, 4, null);
        return getLazyRhsStripe();
    }

    private final Stripe getLazyRhyStripe() {
        return (Stripe) this.lazyRhyStripe.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Stripe lazyRhyStripe_delegate$lambda$2(StripeStore stripeStore) {
        Context context = stripeStore.context;
        return new Stripe(context, PaymentConfiguration.INSTANCE.getInstance(context).getPublishableKey(), null, true, null, 16, null);
    }

    private final Stripe getRhyStripe() {
        PaymentConfiguration.Companion companion = PaymentConfiguration.INSTANCE;
        Context context = this.context;
        String string2 = context.getString(this.rhyStripeApiKeyResource);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        PaymentConfiguration.Companion.init$default(companion, context, string2, null, 4, null);
        return getLazyRhyStripe();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getRadarSessionId(ApiTransferAccount.TransferAccountType transferAccountType, Continuation<? super String> continuation) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        C415741 c415741;
        Stripe rhsStripe;
        if (continuation instanceof C415741) {
            c415741 = (C415741) continuation;
            int i = c415741.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c415741.label = i - Integer.MIN_VALUE;
            } else {
                c415741 = new C415741(continuation);
            }
        }
        Object objCreateRadarSession$default = c415741.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c415741.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCreateRadarSession$default);
            switch (WhenMappings.$EnumSwitchMapping$0[transferAccountType.ordinal()]) {
                case 1:
                case 2:
                    rhsStripe = getRhsStripe();
                    break;
                case 3:
                    rhsStripe = getRhyStripe();
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                    String str = String.format("Unsupported account type %s for radar session id", Arrays.copyOf(new Object[]{transferAccountType}, 1));
                    Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                    throw new IllegalStateException(str.toString());
                default:
                    throw new NoWhenBranchMatchedException();
            }
            c415741.label = 1;
            objCreateRadarSession$default = StripeKtx.createRadarSession$default(rhsStripe, null, c415741, 1, null);
            if (objCreateRadarSession$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCreateRadarSession$default);
        }
        return ((RadarSession) objCreateRadarSession$default).getId();
    }

    public final void initDebitCardConfiguration() {
        getRhmStripe();
    }

    /* compiled from: StripeStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/bonfire/paymentinstruments/ApiLinkDebitCardRequest;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.stripe.StripeStore$getTokenizedDebitCardRequest$2", m3645f = "StripeStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ALERT_WARNING_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE, 167}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.store.stripe.StripeStore$getTokenizedDebitCardRequest$2 */
    static final class C415752 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiLinkDebitCardRequest>, Object> {
        final /* synthetic */ CardParams $cardParams;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C415752(CardParams cardParams, Continuation<? super C415752> continuation) {
            super(2, continuation);
            this.$cardParams = cardParams;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return StripeStore.this.new C415752(this.$cardParams, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiLinkDebitCardRequest> continuation) {
            return ((C415752) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x00b6, code lost:
        
            if (r0 != r7) goto L21;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws CardException, InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
            Object objAwaitFirst;
            Stripe stripe;
            Object objCreateCardToken$default;
            Token token;
            Object objCreatePaymentMethod$default;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StripeStore.this.userStore.refresh(false);
                Observable<User> user = StripeStore.this.userStore.getUser();
                this.label = 1;
                objAwaitFirst = RxAwait3.awaitFirst(user, this);
                if (objAwaitFirst != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
                objAwaitFirst = obj;
            } else {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Token token2 = (Token) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    token = token2;
                    objCreatePaymentMethod$default = obj;
                    PaymentMethod paymentMethod = (PaymentMethod) objCreatePaymentMethod$default;
                    PaymentMethod.Card card = paymentMethod.card;
                    Intrinsics.checkNotNull(card);
                    String str = card.country;
                    Intrinsics.checkNotNull(str);
                    String str2 = card.funding;
                    Intrinsics.checkNotNull(str2);
                    String code = card.brand.getCode();
                    Integer num = card.expiryMonth;
                    Intrinsics.checkNotNull(num);
                    String strValueOf = String.valueOf(num.intValue());
                    Integer num2 = card.expiryYear;
                    Intrinsics.checkNotNull(num2);
                    String strValueOf2 = String.valueOf(num2.intValue());
                    String str3 = card.last4;
                    Intrinsics.checkNotNull(str3);
                    String str4 = paymentMethod.id;
                    Intrinsics.checkNotNull(str4);
                    String id = token.getId();
                    Address address = this.$cardParams.getAddress();
                    Intrinsics.checkNotNull(address);
                    String postalCode = address.getPostalCode();
                    Intrinsics.checkNotNull(postalCode);
                    return new ApiLinkDebitCardRequest(str, new ApiDebitCardDetails(str2, code, strValueOf, strValueOf2, str3, str4, id, postalCode), PaymentInstrumentType.DEBIT_CARD, PaymentProviderType.STRIPE);
                }
                stripe = (Stripe) this.L$0;
                ResultKt.throwOnFailure(obj);
                objCreateCardToken$default = obj;
                token = (Token) objCreateCardToken$default;
                PaymentMethodCreateParams paymentMethodCreateParamsCreateCard = PaymentMethodCreateParams.INSTANCE.createCard(this.$cardParams);
                this.L$0 = token;
                this.label = 3;
                objCreatePaymentMethod$default = StripeKtx.createPaymentMethod$default(stripe, paymentMethodCreateParamsCreateCard, null, null, this, 6, null);
            }
            CardParams cardParams = this.$cardParams;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(StripeStore.userIdMetadataForStripeKey, ((User) objAwaitFirst).getId().toString());
            Unit unit = Unit.INSTANCE;
            CardParams cardParamsCopy$default = CardParams.copy$default(cardParams, null, null, null, 0, 0, null, null, null, "usd", null, linkedHashMap, 767, null);
            Stripe rhmStripe = StripeStore.this.getRhmStripe();
            this.L$0 = rhmStripe;
            this.label = 2;
            stripe = rhmStripe;
            objCreateCardToken$default = StripeKtx.createCardToken$default(stripe, cardParamsCopy$default, null, null, this, 6, null);
            if (objCreateCardToken$default != coroutine_suspended) {
                token = (Token) objCreateCardToken$default;
                PaymentMethodCreateParams paymentMethodCreateParamsCreateCard2 = PaymentMethodCreateParams.INSTANCE.createCard(this.$cardParams);
                this.L$0 = token;
                this.label = 3;
                objCreatePaymentMethod$default = StripeKtx.createPaymentMethod$default(stripe, paymentMethodCreateParamsCreateCard2, null, null, this, 6, null);
            }
            return coroutine_suspended;
        }
    }

    public final Object getTokenizedDebitCardRequest(CardParams cardParams, Continuation<? super ApiLinkDebitCardRequest> continuation) {
        return Suspend.withIO$default(null, new C415752(cardParams, null), continuation, 1, null);
    }
}
