package com.robinhood.android.maxonboarding;

import com.robinhood.models.api.bonfire.ApiTransferAccount;
import kotlin.Metadata;

/* compiled from: PostSignUpLastKnownContextManager.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/maxonboarding/PostSignUpLastKnownAccountManager;", "", "<init>", "()V", "accountType", "Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;", "getAccountType", "()Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;", "setAccountType", "(Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;)V", "feature-lib-max-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.maxonboarding.PostSignUpLastKnownAccountManager, reason: use source file name */
/* loaded from: classes8.dex */
public final class PostSignUpLastKnownContextManager {
    private static ApiTransferAccount.TransferAccountType accountType;
    public static final PostSignUpLastKnownContextManager INSTANCE = new PostSignUpLastKnownContextManager();
    public static final int $stable = 8;

    private PostSignUpLastKnownContextManager() {
    }

    public final ApiTransferAccount.TransferAccountType getAccountType() {
        return accountType;
    }

    public final void setAccountType(ApiTransferAccount.TransferAccountType transferAccountType) {
        accountType = transferAccountType;
    }
}
