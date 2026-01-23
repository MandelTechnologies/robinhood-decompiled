package com.robinhood.librobinhood.data.store;

import com.plaid.internal.EnumC7081g;
import com.robinhood.api.retrofit.Midlands;
import com.robinhood.models.api.ApiNotificationSettingsItem;
import com.robinhood.models.api.ToggleNotificationSettingsRequest;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: NotificationSettingStore.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiNotificationSettingsItem;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.NotificationSettingStore$toggleOnIposListNotifications$email$1", m3645f = "NotificationSettingStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.NotificationSettingStore$toggleOnIposListNotifications$email$1, reason: use source file name */
/* loaded from: classes13.dex */
final class NotificationSettingStore4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiNotificationSettingsItem>, Object> {
    final /* synthetic */ ToggleNotificationSettingsRequest $toggledOnRequest;
    int label;
    final /* synthetic */ NotificationSettingStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationSettingStore4(NotificationSettingStore notificationSettingStore, ToggleNotificationSettingsRequest toggleNotificationSettingsRequest, Continuation<? super NotificationSettingStore4> continuation) {
        super(2, continuation);
        this.this$0 = notificationSettingStore;
        this.$toggledOnRequest = toggleNotificationSettingsRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NotificationSettingStore4(this.this$0, this.$toggledOnRequest, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiNotificationSettingsItem> continuation) {
        return ((NotificationSettingStore4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
        Midlands midlands = this.this$0.midlands;
        ToggleNotificationSettingsRequest toggleNotificationSettingsRequest = this.$toggledOnRequest;
        this.label = 1;
        Object obj2 = midlands.toggleNotificationSettings(NotificationSettingStore.IPO_LIST_NOTIFICATION_ID_EMAIL, toggleNotificationSettingsRequest, this);
        return obj2 == coroutine_suspended ? coroutine_suspended : obj2;
    }
}
