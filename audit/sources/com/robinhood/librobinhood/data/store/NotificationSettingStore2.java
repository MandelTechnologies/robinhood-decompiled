package com.robinhood.librobinhood.data.store;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: NotificationSettingStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.NotificationSettingStore", m3645f = "NotificationSettingStore.kt", m3646l = {95}, m3647m = "toggleAndSelectNotificationSettings-hUnOzRk")
/* renamed from: com.robinhood.librobinhood.data.store.NotificationSettingStore$toggleAndSelectNotificationSettings$1, reason: use source file name */
/* loaded from: classes13.dex */
final class NotificationSettingStore2 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NotificationSettingStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationSettingStore2(NotificationSettingStore notificationSettingStore, Continuation<? super NotificationSettingStore2> continuation) {
        super(continuation);
        this.this$0 = notificationSettingStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM22667toggleAndSelectNotificationSettingshUnOzRk = this.this$0.m22667toggleAndSelectNotificationSettingshUnOzRk(null, null, null, null, null, this);
        return objM22667toggleAndSelectNotificationSettingshUnOzRk == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM22667toggleAndSelectNotificationSettingshUnOzRk : Result.m28549boximpl(objM22667toggleAndSelectNotificationSettingshUnOzRk);
    }
}
