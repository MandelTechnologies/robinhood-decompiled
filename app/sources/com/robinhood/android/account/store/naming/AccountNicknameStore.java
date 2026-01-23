package com.robinhood.android.account.store.naming;

import bonfire.proto.idl.accounts.p028v1.AccountsService;
import bonfire.proto.idl.accounts.p028v1.ValidateNicknameRequestDto;
import bonfire.proto.idl.accounts.p028v1.ValidateNicknameResponseDto;
import com.robinhood.android.account.api.AccountApi;
import com.robinhood.android.account.store.naming.NicknameValidationResult;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.models.api.ApiAccount;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountNicknameStore.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001aB!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\"\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0086@¢\u0006\u0002\u0010\u0017J\u001e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0086@¢\u0006\u0002\u0010\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/account/store/naming/AccountNicknameStore;", "Lcom/robinhood/store/Store;", "accountApi", "Lcom/robinhood/android/account/api/AccountApi;", "accountsService", "Lbonfire/proto/idl/accounts/v1/AccountsService;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/account/api/AccountApi;Lbonfire/proto/idl/accounts/v1/AccountsService;Lcom/robinhood/store/StoreBundle;)V", "validateNicknameEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lbonfire/proto/idl/accounts/v1/ValidateNicknameRequestDto;", "Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponseDto;", "updateNicknameEndpoint", "Lcom/robinhood/android/moria/network/PostEndpoint;", "Lcom/robinhood/android/account/store/naming/AccountNicknameStore$SetNicknameParams;", "Lcom/robinhood/models/api/ApiAccount;", "validateNickname", "Lcom/robinhood/android/account/store/naming/NicknameValidationResult;", "nickname", "", "accountNumber", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setNickname", "", "SetNicknameParams", "lib-store-account-naming_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AccountNicknameStore extends Store {
    private final AccountApi accountApi;
    private final AccountsService accountsService;
    private final PostEndpoint<SetNicknameParams, ApiAccount> updateNicknameEndpoint;
    private final Endpoint<ValidateNicknameRequestDto, ValidateNicknameResponseDto> validateNicknameEndpoint;

    /* compiled from: AccountNicknameStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.account.store.naming.AccountNicknameStore", m3645f = "AccountNicknameStore.kt", m3646l = {40}, m3647m = "validateNickname")
    /* renamed from: com.robinhood.android.account.store.naming.AccountNicknameStore$validateNickname$1 */
    static final class C81731 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C81731(Continuation<? super C81731> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AccountNicknameStore.this.validateNickname(null, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountNicknameStore(AccountApi accountApi, AccountsService accountsService, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(accountApi, "accountApi");
        Intrinsics.checkNotNullParameter(accountsService, "accountsService");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.accountApi = accountApi;
        this.accountsService = accountsService;
        this.validateNicknameEndpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new AccountNicknameStore4(accountsService), storeBundle.getLogoutKillswitch(), new AccountNicknameStore5(null), storeBundle.getClock(), null, 16, null);
        this.updateNicknameEndpoint = PostEndpoint.INSTANCE.create(new AccountNicknameStore2(this, null), new AccountNicknameStore3(null));
    }

    public static /* synthetic */ Object validateNickname$default(AccountNicknameStore accountNicknameStore, String str, String str2, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return accountNicknameStore.validateNickname(str, str2, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object validateNickname(String str, String str2, Continuation<? super NicknameValidationResult> continuation) {
        C81731 c81731;
        if (continuation instanceof C81731) {
            c81731 = (C81731) continuation;
            int i = c81731.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c81731.label = i - Integer.MIN_VALUE;
            } else {
                c81731 = new C81731(continuation);
            }
        }
        Object objRaw = c81731.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c81731.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objRaw);
            Endpoint<ValidateNicknameRequestDto, ValidateNicknameResponseDto> endpoint = this.validateNicknameEndpoint;
            ValidateNicknameRequestDto validateNicknameRequestDto = new ValidateNicknameRequestDto(str2, str);
            c81731.label = 1;
            objRaw = endpoint.raw(validateNicknameRequestDto, c81731);
            if (objRaw == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objRaw);
        }
        ValidateNicknameResponseDto validateNicknameResponseDto = (ValidateNicknameResponseDto) objRaw;
        ValidateNicknameResponseDto.WarningDto message = validateNicknameResponseDto.getMessage();
        if (message != null) {
            return new NicknameValidationResult.Error(message.getMessage(), message.getSeverity());
        }
        return new NicknameValidationResult.Valid(validateNicknameResponseDto.getNickname());
    }

    public final Object setNickname(String str, String str2, Continuation<? super Unit> continuation) {
        Object objPost$default = PostEndpoint.DefaultImpls.post$default(this.updateNicknameEndpoint, new SetNicknameParams(str2, str), null, continuation, 2, null);
        return objPost$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPost$default : Unit.INSTANCE;
    }

    /* compiled from: AccountNicknameStore.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/account/store/naming/AccountNicknameStore$SetNicknameParams;", "", "accountNumber", "", "nickname", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "getNickname", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-store-account-naming_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SetNicknameParams {
        private final String accountNumber;
        private final String nickname;

        public static /* synthetic */ SetNicknameParams copy$default(SetNicknameParams setNicknameParams, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = setNicknameParams.accountNumber;
            }
            if ((i & 2) != 0) {
                str2 = setNicknameParams.nickname;
            }
            return setNicknameParams.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final String getNickname() {
            return this.nickname;
        }

        public final SetNicknameParams copy(String accountNumber, String nickname) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(nickname, "nickname");
            return new SetNicknameParams(accountNumber, nickname);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SetNicknameParams)) {
                return false;
            }
            SetNicknameParams setNicknameParams = (SetNicknameParams) other;
            return Intrinsics.areEqual(this.accountNumber, setNicknameParams.accountNumber) && Intrinsics.areEqual(this.nickname, setNicknameParams.nickname);
        }

        public int hashCode() {
            return (this.accountNumber.hashCode() * 31) + this.nickname.hashCode();
        }

        public String toString() {
            return "SetNicknameParams(accountNumber=" + this.accountNumber + ", nickname=" + this.nickname + ")";
        }

        public SetNicknameParams(String accountNumber, String nickname) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(nickname, "nickname");
            this.accountNumber = accountNumber;
            this.nickname = nickname;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final String getNickname() {
            return this.nickname;
        }
    }
}
