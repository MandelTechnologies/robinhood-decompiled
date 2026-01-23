package com.robinhood.android.api.supportchat;

import com.robinhood.models.api.ApiSupportSalesforceToken;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.logging.EventMetadata;
import com.robinhood.utils.logging.SentryTeam;
import com.salesforce.android.smi.network.api.auth.UserVerificationProvider;
import com.salesforce.android.smi.network.api.auth.UserVerificationToken;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples4;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SalesforceChatTokenRefresher.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/api/supportchat/SalesforceChatTokenRefresher;", "Lcom/salesforce/android/smi/network/api/auth/UserVerificationProvider;", "chatTokenManager", "Lcom/robinhood/android/api/supportchat/SalesforceChatTokenManager;", "<init>", "(Lcom/robinhood/android/api/supportchat/SalesforceChatTokenManager;)V", "userVerificationChallenge", "Lcom/salesforce/android/smi/network/api/auth/UserVerificationToken;", "reason", "Lcom/salesforce/android/smi/network/api/auth/UserVerificationProvider$ChallengeReason;", "(Lcom/salesforce/android/smi/network/api/auth/UserVerificationProvider$ChallengeReason;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-api-supportchat_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class SalesforceChatTokenRefresher implements UserVerificationProvider {
    private final SalesforceChatTokenManager chatTokenManager;

    /* compiled from: SalesforceChatTokenRefresher.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UserVerificationProvider.ChallengeReason.values().length];
            try {
                iArr[UserVerificationProvider.ChallengeReason.INITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UserVerificationProvider.ChallengeReason.RENEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UserVerificationProvider.ChallengeReason.EXPIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[UserVerificationProvider.ChallengeReason.MALFORMED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: SalesforceChatTokenRefresher.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.api.supportchat.SalesforceChatTokenRefresher", m3645f = "SalesforceChatTokenRefresher.kt", m3646l = {23, 29, 43}, m3647m = "userVerificationChallenge")
    /* renamed from: com.robinhood.android.api.supportchat.SalesforceChatTokenRefresher$userVerificationChallenge$1 */
    static final class C95581 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C95581(Continuation<? super C95581> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SalesforceChatTokenRefresher.this.userVerificationChallenge(null, this);
        }
    }

    public SalesforceChatTokenRefresher(SalesforceChatTokenManager chatTokenManager) {
        Intrinsics.checkNotNullParameter(chatTokenManager, "chatTokenManager");
        this.chatTokenManager = chatTokenManager;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x007d, code lost:
    
        if (r14 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0091, code lost:
    
        if (r14 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a1, code lost:
    
        if (r14 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.salesforce.android.smi.network.api.auth.UserVerificationProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object userVerificationChallenge(UserVerificationProvider.ChallengeReason challengeReason, Continuation<? super UserVerificationToken> continuation) {
        C95581 c95581;
        ApiSupportSalesforceToken apiSupportSalesforceToken;
        if (continuation instanceof C95581) {
            c95581 = (C95581) continuation;
            int i = c95581.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c95581.label = i - Integer.MIN_VALUE;
            } else {
                c95581 = new C95581(continuation);
            }
        }
        Object token$default = c95581.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c95581.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(token$default);
            int i3 = WhenMappings.$EnumSwitchMapping$0[challengeReason.ordinal()];
            if (i3 == 1) {
                SalesforceChatTokenManager salesforceChatTokenManager = this.chatTokenManager;
                c95581.label = 1;
                token$default = SalesforceChatTokenManager.getToken$default(salesforceChatTokenManager, false, c95581, 1, null);
            } else if (i3 == 2 || i3 == 3) {
                SalesforceChatTokenManager salesforceChatTokenManager2 = this.chatTokenManager;
                c95581.label = 2;
                token$default = salesforceChatTokenManager2.getToken(true, c95581);
            } else {
                if (i3 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                CrashReporter.INSTANCE.reportNonFatal(new IllegalStateException("Malformed JWT token"), true, new EventMetadata(SentryTeam.SUPPORT_X, MapsKt.mapOf(Tuples4.m3642to("feature", "support_chat")), null, 4, null));
                SalesforceChatTokenManager salesforceChatTokenManager3 = this.chatTokenManager;
                c95581.label = 3;
                token$default = salesforceChatTokenManager3.getToken(true, c95581);
            }
            return coroutine_suspended;
        }
        if (i2 == 1) {
            ResultKt.throwOnFailure(token$default);
            apiSupportSalesforceToken = (ApiSupportSalesforceToken) token$default;
        } else if (i2 == 2) {
            ResultKt.throwOnFailure(token$default);
            apiSupportSalesforceToken = (ApiSupportSalesforceToken) token$default;
        } else {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(token$default);
            apiSupportSalesforceToken = (ApiSupportSalesforceToken) token$default;
        }
        return new UserVerificationToken(UserVerificationToken.UserVerificationType.JWT, apiSupportSalesforceToken.getJwt());
    }
}
