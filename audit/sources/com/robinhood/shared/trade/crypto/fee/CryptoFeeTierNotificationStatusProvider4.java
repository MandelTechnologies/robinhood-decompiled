package com.robinhood.shared.trade.crypto.fee;

import com.robinhood.librobinhood.data.store.NotificationSettingStore;
import com.robinhood.models.api.ApiNotificationSettingsItem;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CryptoFeeTierNotificationStatusProvider.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.fee.CryptoFeeTierNotificationStatusProvider$canSkipNotificationPrompt$2$1$emailItemAsync$1", m3645f = "CryptoFeeTierNotificationStatusProvider.kt", m3646l = {57}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.trade.crypto.fee.CryptoFeeTierNotificationStatusProvider$canSkipNotificationPrompt$2$1$emailItemAsync$1, reason: use source file name */
/* loaded from: classes12.dex */
final class CryptoFeeTierNotificationStatusProvider4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ CryptoFeeTierNotificationStatusProvider $this_runCatching;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoFeeTierNotificationStatusProvider4(CryptoFeeTierNotificationStatusProvider cryptoFeeTierNotificationStatusProvider, Continuation<? super CryptoFeeTierNotificationStatusProvider4> continuation) {
        super(2, continuation);
        this.$this_runCatching = cryptoFeeTierNotificationStatusProvider;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CryptoFeeTierNotificationStatusProvider4(this.$this_runCatching, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((CryptoFeeTierNotificationStatusProvider4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        CryptoFeeTierNotificationStatusProvider cryptoFeeTierNotificationStatusProvider;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CryptoFeeTierNotificationStatusProvider cryptoFeeTierNotificationStatusProvider2 = this.$this_runCatching;
            NotificationSettingStore notificationSettingStore = cryptoFeeTierNotificationStatusProvider2.notificationSettingStore;
            this.L$0 = cryptoFeeTierNotificationStatusProvider2;
            this.label = 1;
            Object objFetchNotificationItem = notificationSettingStore.fetchNotificationItem(CryptoFeeTierNotificationStatusProvider.EMAIL_ITEM_ID, this);
            if (objFetchNotificationItem == coroutine_suspended) {
                return coroutine_suspended;
            }
            cryptoFeeTierNotificationStatusProvider = cryptoFeeTierNotificationStatusProvider2;
            obj = objFetchNotificationItem;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cryptoFeeTierNotificationStatusProvider = (CryptoFeeTierNotificationStatusProvider) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        return boxing.boxBoolean(cryptoFeeTierNotificationStatusProvider.isEnabled((ApiNotificationSettingsItem) obj));
    }
}
