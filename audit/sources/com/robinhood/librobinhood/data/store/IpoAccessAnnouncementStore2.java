package com.robinhood.librobinhood.data.store;

import com.robinhood.android.lib.api.directipo.DirectIpoApi;
import com.robinhood.models.api.bonfire.ipoaccess.clarity.ApiIpoAccessAnnouncement;
import com.robinhood.models.p320db.bonfire.IpoAccessAnnouncement;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: IpoAccessAnnouncementStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/db/bonfire/IpoAccessAnnouncement;", "instrumentId", "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.IpoAccessAnnouncementStore$endpoint$1", m3645f = "IpoAccessAnnouncementStore.kt", m3646l = {26}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.IpoAccessAnnouncementStore$endpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class IpoAccessAnnouncementStore2 extends ContinuationImpl7 implements Function2<UUID, Continuation<? super IpoAccessAnnouncement>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ IpoAccessAnnouncementStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IpoAccessAnnouncementStore2(IpoAccessAnnouncementStore ipoAccessAnnouncementStore, Continuation<? super IpoAccessAnnouncementStore2> continuation) {
        super(2, continuation);
        this.this$0 = ipoAccessAnnouncementStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        IpoAccessAnnouncementStore2 ipoAccessAnnouncementStore2 = new IpoAccessAnnouncementStore2(this.this$0, continuation);
        ipoAccessAnnouncementStore2.L$0 = obj;
        return ipoAccessAnnouncementStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UUID uuid, Continuation<? super IpoAccessAnnouncement> continuation) {
        return ((IpoAccessAnnouncementStore2) create(uuid, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            UUID uuid = (UUID) this.L$0;
            DirectIpoApi directIpoApi = this.this$0.api;
            this.label = 1;
            obj = directIpoApi.getIpoAccessAnnouncement(uuid, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return ((ApiIpoAccessAnnouncement) obj).toDbModel();
    }
}
