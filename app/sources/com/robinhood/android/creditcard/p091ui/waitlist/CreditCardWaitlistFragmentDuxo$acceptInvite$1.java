package com.robinhood.android.creditcard.p091ui.waitlist;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.creditcard.p091ui.waitlist.CreditCardWaitlistEvent;
import com.robinhood.android.lib.store.creditcard.CreditCardStore;
import com.robinhood.android.models.creditcard.api.graphql.ApplyReferralCodeResponse;
import com.robinhood.android.models.creditcard.api.graphql.ApplyReferralCodeResponse2;
import com.robinhood.android.models.creditcard.api.graphql.GraphqlQueryResponse;
import com.robinhood.android.models.creditcard.api.graphql.GraphqlQueryResponse2;
import com.robinhood.android.models.creditcard.api.graphql.ReferralCodeType;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.utils.logging.CrashReporter;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwait3;
import timber.log.Timber;

/* compiled from: CreditCardWaitlistFragmentDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistFragmentDuxo$acceptInvite$1", m3645f = "CreditCardWaitlistFragmentDuxo.kt", m3646l = {514, EnumC7081g.SDK_ASSET_ILLUSTRATION_ATOMIC_LOGO_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes2.dex */
final class CreditCardWaitlistFragmentDuxo$acceptInvite$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $onSuccess;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ CreditCardWaitlistFragmentDuxo this$0;

    /* compiled from: CreditCardWaitlistFragmentDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApplyReferralCodeResponse2.values().length];
            try {
                iArr[ApplyReferralCodeResponse2.EXHAUSTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApplyReferralCodeResponse2.INELIGIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CreditCardWaitlistFragmentDuxo$acceptInvite$1(CreditCardWaitlistFragmentDuxo creditCardWaitlistFragmentDuxo, Function0<Unit> function0, Continuation<? super CreditCardWaitlistFragmentDuxo$acceptInvite$1> continuation) {
        super(2, continuation);
        this.this$0 = creditCardWaitlistFragmentDuxo;
        this.$onSuccess = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreditCardWaitlistFragmentDuxo$acceptInvite$1(this.this$0, this.$onSuccess, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CreditCardWaitlistFragmentDuxo$acceptInvite$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ab A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:7:0x001b, B:27:0x009b, B:29:0x00a5, B:42:0x00cb, B:44:0x00d4, B:46:0x00da, B:48:0x00e0, B:55:0x00f8, B:56:0x0122, B:57:0x0128, B:59:0x0132, B:61:0x0138, B:63:0x013e, B:65:0x0144, B:66:0x0148, B:52:0x00ec, B:31:0x00ab, B:33:0x00b3, B:35:0x00b9, B:37:0x00bf, B:39:0x00c3, B:67:0x014f, B:14:0x0041, B:23:0x007f, B:17:0x004b, B:19:0x0057), top: B:72:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cb A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:7:0x001b, B:27:0x009b, B:29:0x00a5, B:42:0x00cb, B:44:0x00d4, B:46:0x00da, B:48:0x00e0, B:55:0x00f8, B:56:0x0122, B:57:0x0128, B:59:0x0132, B:61:0x0138, B:63:0x013e, B:65:0x0144, B:66:0x0148, B:52:0x00ec, B:31:0x00ab, B:33:0x00b3, B:35:0x00b9, B:37:0x00bf, B:39:0x00c3, B:67:0x014f, B:14:0x0041, B:23:0x007f, B:17:0x004b, B:19:0x0057), top: B:72:0x0009 }] */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        CreditCardWaitlistFragmentDuxo creditCardWaitlistFragmentDuxo;
        Function0<Unit> function0;
        CreditCardStore creditCardStore;
        String str2;
        String str3;
        Function0<Unit> function02;
        CreditCardWaitlistFragmentDuxo creditCardWaitlistFragmentDuxo2;
        GraphqlQueryResponse graphqlQueryResponse;
        List<GraphqlQueryResponse2> errors;
        List<ApplyReferralCodeResponse2> errors2;
        ApplyReferralCodeResponse.Response applyReferralCode;
        ApplyReferralCodeResponse.Response applyReferralCode2;
        ReferralCodeType data;
        ReferralCodeType.Referrer referrer;
        ApplyReferralCodeResponse.Response applyReferralCode3;
        List<ApplyReferralCodeResponse2> errors3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        String firstName = null;
        try {
        } catch (Throwable th) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 6, null);
            this.this$0.submit(CreditCardWaitlistEvent.Error.INSTANCE);
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            str = this.this$0.creditCardApplicationReferralCode.get();
            if (str != null) {
                CreditCardWaitlistFragmentDuxo creditCardWaitlistFragmentDuxo3 = this.this$0;
                Function0<Unit> function03 = this.$onSuccess;
                CreditCardStore creditCardStore2 = creditCardWaitlistFragmentDuxo3.creditCardStore;
                Observable<User> user = creditCardWaitlistFragmentDuxo3.userStore.getUser();
                this.L$0 = creditCardWaitlistFragmentDuxo3;
                this.L$1 = function03;
                this.L$2 = str;
                this.L$3 = str;
                this.L$4 = creditCardStore2;
                this.label = 1;
                Object objAwaitFirst = RxAwait3.awaitFirst(user, this);
                if (objAwaitFirst == coroutine_suspended) {
                    return coroutine_suspended;
                }
                creditCardWaitlistFragmentDuxo = creditCardWaitlistFragmentDuxo3;
                obj = objAwaitFirst;
                function0 = function03;
                creditCardStore = creditCardStore2;
                str2 = str;
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str3 = (String) this.L$2;
            function02 = (Function0) this.L$1;
            creditCardWaitlistFragmentDuxo2 = (CreditCardWaitlistFragmentDuxo) this.L$0;
            ResultKt.throwOnFailure(obj);
            graphqlQueryResponse = (GraphqlQueryResponse) obj;
            errors = graphqlQueryResponse.getErrors();
            if (errors != null || errors.isEmpty()) {
                ApplyReferralCodeResponse applyReferralCodeResponse = (ApplyReferralCodeResponse) graphqlQueryResponse.getData();
                errors2 = (applyReferralCodeResponse != null || (applyReferralCode = applyReferralCodeResponse.getApplyReferralCode()) == null) ? null : applyReferralCode.getErrors();
                if (errors2 != null || errors2.isEmpty()) {
                    function02.invoke();
                } else {
                    ApplyReferralCodeResponse applyReferralCodeResponse2 = (ApplyReferralCodeResponse) graphqlQueryResponse.getData();
                    ApplyReferralCodeResponse2 applyReferralCodeResponse22 = (applyReferralCodeResponse2 == null || (applyReferralCode3 = applyReferralCodeResponse2.getApplyReferralCode()) == null || (errors3 = applyReferralCode3.getErrors()) == null) ? null : (ApplyReferralCodeResponse2) CollectionsKt.getOrNull(errors3, 0);
                    int i2 = applyReferralCodeResponse22 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[applyReferralCodeResponse22.ordinal()];
                    if (i2 == 1) {
                        ApplyReferralCodeResponse applyReferralCodeResponse3 = (ApplyReferralCodeResponse) graphqlQueryResponse.getData();
                        if (applyReferralCodeResponse3 != null && (applyReferralCode2 = applyReferralCodeResponse3.getApplyReferralCode()) != null && (data = applyReferralCode2.getData()) != null && (referrer = data.getReferrer()) != null) {
                            firstName = referrer.getFirstName();
                        }
                        creditCardWaitlistFragmentDuxo2.submit(new CreditCardWaitlistEvent.CreditApplicationReferralCodeLimitReached(firstName));
                    } else if (i2 == 2) {
                        creditCardWaitlistFragmentDuxo2.submit(CreditCardWaitlistEvent.CreditApplicationReferralAccountIneligible.INSTANCE);
                    } else {
                        Timber.INSTANCE.mo3353e("Error applying referral code(" + str3 + "): " + graphqlQueryResponse.getErrors(), new Object[0]);
                        creditCardWaitlistFragmentDuxo2.submit(CreditCardWaitlistEvent.Error.INSTANCE);
                    }
                }
            }
            return Unit.INSTANCE;
        }
        creditCardStore = (CreditCardStore) this.L$4;
        String str4 = (String) this.L$3;
        String str5 = (String) this.L$2;
        function0 = (Function0) this.L$1;
        creditCardWaitlistFragmentDuxo = (CreditCardWaitlistFragmentDuxo) this.L$0;
        ResultKt.throwOnFailure(obj);
        str2 = str4;
        str = str5;
        String email = ((User) obj).getEmail();
        this.L$0 = creditCardWaitlistFragmentDuxo;
        this.L$1 = function0;
        this.L$2 = str;
        this.L$3 = null;
        this.L$4 = null;
        this.label = 2;
        obj = creditCardStore.applyReferralCode(str2, email, this);
        if (obj != coroutine_suspended) {
            str3 = str;
            function02 = function0;
            creditCardWaitlistFragmentDuxo2 = creditCardWaitlistFragmentDuxo;
            graphqlQueryResponse = (GraphqlQueryResponse) obj;
            errors = graphqlQueryResponse.getErrors();
            if (errors != null) {
                ApplyReferralCodeResponse applyReferralCodeResponse4 = (ApplyReferralCodeResponse) graphqlQueryResponse.getData();
                if (applyReferralCodeResponse4 != null) {
                    errors2 = (applyReferralCodeResponse4 != null || (applyReferralCode = applyReferralCodeResponse4.getApplyReferralCode()) == null) ? null : applyReferralCode.getErrors();
                    if (errors2 != null) {
                    }
                    function02.invoke();
                }
            }
            return Unit.INSTANCE;
        }
        return coroutine_suspended;
    }
}
