package com.robinhood.shared.trade.crypto.fee;

import com.plaid.internal.EnumC7081g;
import com.robinhood.models.api.ApiNotificationSettingsItem;
import com.robinhood.models.api.ApiNotificationSettingsToggleSettingsItem;
import io.reactivex.Single;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: CryptoFeeTierNotificationStatusProvider.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiNotificationSettingsItem;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.fee.CryptoFeeTierNotificationStatusProvider$optIn$2$1$pushAsync$1", m3645f = "CryptoFeeTierNotificationStatusProvider.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.shared.trade.crypto.fee.CryptoFeeTierNotificationStatusProvider$optIn$2$1$pushAsync$1, reason: use source file name */
/* loaded from: classes12.dex */
final class CryptoFeeTierNotificationStatusProvider9 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiNotificationSettingsItem>, Object> {
    final /* synthetic */ CryptoFeeTierNotificationStatusProvider $this_runCatching;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoFeeTierNotificationStatusProvider9(CryptoFeeTierNotificationStatusProvider cryptoFeeTierNotificationStatusProvider, Continuation<? super CryptoFeeTierNotificationStatusProvider9> continuation) {
        super(2, continuation);
        this.$this_runCatching = cryptoFeeTierNotificationStatusProvider;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CryptoFeeTierNotificationStatusProvider9(this.$this_runCatching, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiNotificationSettingsItem> continuation) {
        return ((CryptoFeeTierNotificationStatusProvider9) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        Single<ApiNotificationSettingsItem> single = this.$this_runCatching.notificationSettingStore.toggleNotificationSettings("push", CryptoFeeTierNotificationStatusProvider.PUSH_ITEM_ID, ApiNotificationSettingsToggleSettingsItem.Status.f5427ON);
        this.label = 1;
        Object objAwait = RxAwait3.await(single, this);
        return objAwait == coroutine_suspended ? coroutine_suspended : objAwait;
    }
}
