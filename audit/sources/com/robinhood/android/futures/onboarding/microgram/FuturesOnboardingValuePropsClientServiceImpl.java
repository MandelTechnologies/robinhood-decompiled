package com.robinhood.android.futures.onboarding.microgram;

import android.content.res.Resources;
import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.account.strings.DisplayName;
import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.models.p320db.Account;
import com.robinhood.store.futures.FuturesAccountStore;
import com.robinhood.store.futures.mib.MiBFuturesState;
import com.robinhood.utils.resource.StringResource;
import futures_onboarding_value_props.proto.p463v1.FuturesOnboardingValuePropsClientService;
import futures_onboarding_value_props.proto.p463v1.GetMibFuturesStateRequestDto;
import futures_onboarding_value_props.proto.p463v1.GetMibFuturesStateResponseDto;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesOnboardingValuePropsClientServiceImpl.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0096@¢\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/futures/onboarding/microgram/FuturesOnboardingValuePropsClientServiceImpl;", "Lfutures_onboarding_value_props/proto/v1/FuturesOnboardingValuePropsClientService;", "resources", "Landroid/content/res/Resources;", "futuresAccountStore", "Lcom/robinhood/store/futures/FuturesAccountStore;", "<init>", "(Landroid/content/res/Resources;Lcom/robinhood/store/futures/FuturesAccountStore;)V", "GetMibFuturesState", "Lfutures_onboarding_value_props/proto/v1/GetMibFuturesStateResponseDto;", "request", "Lfutures_onboarding_value_props/proto/v1/GetMibFuturesStateRequestDto;", "(Lfutures_onboarding_value_props/proto/v1/GetMibFuturesStateRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-futures-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class FuturesOnboardingValuePropsClientServiceImpl implements FuturesOnboardingValuePropsClientService {
    public static final int $stable = 8;
    private final FuturesAccountStore futuresAccountStore;
    private final Resources resources;

    /* compiled from: FuturesOnboardingValuePropsClientServiceImpl.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.onboarding.microgram.FuturesOnboardingValuePropsClientServiceImpl", m3645f = "FuturesOnboardingValuePropsClientServiceImpl.kt", m3646l = {20}, m3647m = "GetMibFuturesState")
    /* renamed from: com.robinhood.android.futures.onboarding.microgram.FuturesOnboardingValuePropsClientServiceImpl$GetMibFuturesState$1 */
    static final class C172941 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C172941(Continuation<? super C172941> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FuturesOnboardingValuePropsClientServiceImpl.this.GetMibFuturesState((GetMibFuturesStateRequestDto) null, this);
        }
    }

    public Object GetMibFuturesState(Request<GetMibFuturesStateRequestDto> request, Continuation<? super Response<GetMibFuturesStateResponseDto>> continuation) {
        return FuturesOnboardingValuePropsClientService.DefaultImpls.GetMibFuturesState(this, request, continuation);
    }

    public FuturesOnboardingValuePropsClientServiceImpl(Resources resources, FuturesAccountStore futuresAccountStore) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(futuresAccountStore, "futuresAccountStore");
        this.resources = resources;
        this.futuresAccountStore = futuresAccountStore;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // futures_onboarding_value_props.proto.p463v1.FuturesOnboardingValuePropsClientService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetMibFuturesState(GetMibFuturesStateRequestDto getMibFuturesStateRequestDto, Continuation<? super GetMibFuturesStateResponseDto> continuation) {
        C172941 c172941;
        String string2;
        DisplayName displayName;
        DisplayName.Variants withAccount;
        StringResource inSentence;
        CharSequence text;
        if (continuation instanceof C172941) {
            c172941 = (C172941) continuation;
            int i = c172941.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c172941.label = i - Integer.MIN_VALUE;
            } else {
                c172941 = new C172941(continuation);
            }
        }
        Object objForceGetMibFuturesState = c172941.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c172941.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objForceGetMibFuturesState);
            FuturesAccountStore futuresAccountStore = this.futuresAccountStore;
            c172941.label = 1;
            objForceGetMibFuturesState = futuresAccountStore.forceGetMibFuturesState(c172941);
            if (objForceGetMibFuturesState == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objForceGetMibFuturesState);
        }
        MiBFuturesState miBFuturesState = (MiBFuturesState) objForceGetMibFuturesState;
        boolean hasMultipleRhsAccounts = miBFuturesState.getHasMultipleRhsAccounts();
        Account futuresAllowedRhsAccount = miBFuturesState.getFuturesAllowedRhsAccount();
        if (futuresAllowedRhsAccount == null || (displayName = AccountDisplayNames.getDisplayName(futuresAllowedRhsAccount)) == null || (withAccount = displayName.getWithAccount()) == null || (inSentence = withAccount.getInSentence()) == null || (text = inSentence.getText(this.resources)) == null || (string2 = text.toString()) == null) {
            string2 = "";
        }
        return new GetMibFuturesStateResponseDto(hasMultipleRhsAccounts, string2);
    }
}
