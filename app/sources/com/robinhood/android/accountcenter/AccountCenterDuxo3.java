package com.robinhood.android.accountcenter;

import android.graphics.Bitmap;
import com.robinhood.android.accountcenter.AccountCenterViewState4;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.Throwables;
import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountCenterDuxo.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.accountcenter.AccountCenterDuxo$updatePictureToMediaStore$uploadImageSingle$2, reason: use source file name */
/* loaded from: classes24.dex */
final class AccountCenterDuxo3<T> implements Consumer {
    final /* synthetic */ Bitmap $profilePictureLocal;
    final /* synthetic */ AccountCenterDuxo this$0;

    AccountCenterDuxo3(AccountCenterDuxo accountCenterDuxo, Bitmap bitmap) {
        this.this$0 = accountCenterDuxo;
        this.$profilePictureLocal = bitmap;
    }

    @Override // io.reactivex.functions.Consumer
    public final void accept(final Throwable th) {
        if (Throwables.isNetworkRelated(th)) {
            AccountCenterDuxo accountCenterDuxo = this.this$0;
            final Bitmap bitmap = this.$profilePictureLocal;
            accountCenterDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.accountcenter.AccountCenterDuxo$updatePictureToMediaStore$uploadImageSingle$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AccountCenterDuxo3.accept$lambda$0(bitmap, th, (AccountCenterViewState) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountCenterViewState accept$lambda$0(Bitmap bitmap, Throwable th, AccountCenterViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy((32751 & 1) != 0 ? applyMutation.accountCenterPage : null, (32751 & 2) != 0 ? applyMutation.uiError : null, (32751 & 4) != 0 ? applyMutation.profile : null, (32751 & 8) != 0 ? applyMutation.profilePictureLocal : null, (32751 & 16) != 0 ? applyMutation.updateProfilePictureStatus : new AccountCenterViewState4.FailedMediaUpload(bitmap, new UiEvent(th)), (32751 & 32) != 0 ? applyMutation.removeProfilePictureStatus : null, (32751 & 64) != 0 ? applyMutation.inviteCount : null, (32751 & 128) != 0 ? applyMutation.showSearchInToolbar : false, (32751 & 256) != 0 ? applyMutation.showRewardInProfile : false, (32751 & 512) != 0 ? applyMutation.featureDiscoveryData : null, (32751 & 1024) != 0 ? applyMutation.showFxTooltipButton : false, (32751 & 2048) != 0 ? applyMutation.isRhubarbMember : false, (32751 & 4096) != 0 ? applyMutation.showMcwCurrencySwitcher : false, (32751 & 8192) != 0 ? applyMutation.individualAccountNumber : null, (32751 & 16384) != 0 ? applyMutation.transferAccounts : null);
    }
}
