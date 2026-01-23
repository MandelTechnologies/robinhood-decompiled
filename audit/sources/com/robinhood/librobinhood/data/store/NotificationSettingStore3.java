package com.robinhood.librobinhood.data.store;

import com.robinhood.api.retrofit.Midlands;
import com.robinhood.models.api.ApiNotificationSettingsToggleSettingsItem;
import com.robinhood.models.api.SelectNotificationSettingsRequest;
import com.robinhood.models.api.ToggleNotificationSettingsRequest;
import io.reactivex.Completable;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: NotificationSettingStore.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lkotlin/Result;", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.NotificationSettingStore$toggleAndSelectNotificationSettings$2", m3645f = "NotificationSettingStore.kt", m3646l = {98, 102, 165}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.librobinhood.data.store.NotificationSettingStore$toggleAndSelectNotificationSettings$2, reason: use source file name */
/* loaded from: classes13.dex */
final class NotificationSettingStore3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Result<? extends Unit>>, Object> {
    final /* synthetic */ String $selectionItemId;
    final /* synthetic */ Set<String> $selectionValues;
    final /* synthetic */ String $settingsId;
    final /* synthetic */ String $toggleItemId;
    final /* synthetic */ ApiNotificationSettingsToggleSettingsItem.Status $toggleStatus;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ NotificationSettingStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationSettingStore3(NotificationSettingStore notificationSettingStore, String str, ApiNotificationSettingsToggleSettingsItem.Status status, String str2, Set<String> set, String str3, Continuation<? super NotificationSettingStore3> continuation) {
        super(2, continuation);
        this.this$0 = notificationSettingStore;
        this.$toggleItemId = str;
        this.$toggleStatus = status;
        this.$selectionItemId = str2;
        this.$selectionValues = set;
        this.$settingsId = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        NotificationSettingStore3 notificationSettingStore3 = new NotificationSettingStore3(this.this$0, this.$toggleItemId, this.$toggleStatus, this.$selectionItemId, this.$selectionValues, this.$settingsId, continuation);
        notificationSettingStore3.L$0 = obj;
        return notificationSettingStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Unit>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<Unit>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<Unit>> continuation) {
        return ((NotificationSettingStore3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a4, code lost:
    
        if (kotlinx.coroutines.rx2.RxAwait3.await(r13, r12) != r0) goto L31;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objM28550constructorimpl;
        NotificationSettingStore notificationSettingStore;
        String str;
        Set<String> set;
        String str2;
        NotificationSettingStore notificationSettingStore2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Companion companion = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            notificationSettingStore = this.this$0;
            String str3 = this.$toggleItemId;
            ApiNotificationSettingsToggleSettingsItem.Status status = this.$toggleStatus;
            String str4 = this.$selectionItemId;
            Set<String> set2 = this.$selectionValues;
            String str5 = this.$settingsId;
            Result.Companion companion2 = Result.INSTANCE;
            Midlands midlands = notificationSettingStore.midlands;
            ToggleNotificationSettingsRequest toggleNotificationSettingsRequest = new ToggleNotificationSettingsRequest(status);
            this.L$0 = notificationSettingStore;
            this.L$1 = str4;
            this.L$2 = set2;
            this.L$3 = str5;
            this.label = 1;
            if (midlands.toggleNotificationSettings(str3, toggleNotificationSettingsRequest, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            str = str4;
            set = set2;
            str2 = str5;
        } else if (i == 1) {
            str2 = (String) this.L$3;
            set = (Set) this.L$2;
            str = (String) this.L$1;
            NotificationSettingStore notificationSettingStore3 = (NotificationSettingStore) this.L$0;
            ResultKt.throwOnFailure(obj);
            notificationSettingStore = notificationSettingStore3;
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objM28550constructorimpl = Result.m28550constructorimpl(Unit.INSTANCE);
                return Result.m28549boximpl(objM28550constructorimpl);
            }
            str2 = (String) this.L$1;
            notificationSettingStore2 = (NotificationSettingStore) this.L$0;
            ResultKt.throwOnFailure(obj);
            Completable completableRefreshNotifications = notificationSettingStore2.refreshNotifications(str2);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 3;
        }
        Midlands midlands2 = notificationSettingStore.midlands;
        SelectNotificationSettingsRequest selectNotificationSettingsRequest = new SelectNotificationSettingsRequest(CollectionsKt.toList(set));
        this.L$0 = notificationSettingStore;
        this.L$1 = str2;
        this.L$2 = null;
        this.L$3 = null;
        this.label = 2;
        if (midlands2.selectNotificationSettings(str, selectNotificationSettingsRequest, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        notificationSettingStore2 = notificationSettingStore;
        Completable completableRefreshNotifications2 = notificationSettingStore2.refreshNotifications(str2);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 3;
    }
}
