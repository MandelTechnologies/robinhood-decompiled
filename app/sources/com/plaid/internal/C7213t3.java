package com.plaid.internal;

import com.plaid.internal.C7186q3;
import com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent;
import com.plaid.internal.workflow.persistence.database.WorkflowDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension
/* renamed from: com.plaid.internal.t3 */
/* loaded from: classes16.dex */
public final class C7213t3 implements InterfaceC7222u3 {

    /* renamed from: a */
    public final InterfaceC5836E7 f3216a;

    public C7213t3(WorkflowDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        this.f3216a = database.mo1640c();
    }

    @Override // com.plaid.internal.InterfaceC7222u3
    /* renamed from: a */
    public final Object mo1616a(ClientEventOuterClass$ClientEvent clientEventOuterClass$ClientEvent, C7186q3.a aVar) {
        InterfaceC5836E7 interfaceC5836E7 = this.f3216a;
        String workflowSessionId = clientEventOuterClass$ClientEvent.getWorkflowSessionId();
        Intrinsics.checkNotNullExpressionValue(workflowSessionId, "getWorkflowSessionId(...)");
        String strValueOf = String.valueOf(clientEventOuterClass$ClientEvent.hashCode());
        byte[] byteArray = clientEventOuterClass$ClientEvent.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
        Object objMo1189a = interfaceC5836E7.mo1189a(workflowSessionId, strValueOf, byteArray, aVar);
        return objMo1189a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo1189a : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.plaid.internal.InterfaceC7222u3
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo1618a(ContinuationImpl continuationImpl) {
        C7204s3 c7204s3;
        if (continuationImpl instanceof C7204s3) {
            c7204s3 = (C7204s3) continuationImpl;
            int i = c7204s3.f3185c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c7204s3.f3185c = i - Integer.MIN_VALUE;
            } else {
                c7204s3 = new C7204s3(this, continuationImpl);
            }
        }
        Object objMo1188a = c7204s3.f3183a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c7204s3.f3185c;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objMo1188a);
            InterfaceC5836E7 interfaceC5836E7 = this.f3216a;
            c7204s3.f3185c = 1;
            objMo1188a = interfaceC5836E7.mo1188a(c7204s3);
            if (objMo1188a == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objMo1188a);
        }
        Iterable iterable = (Iterable) objMo1188a;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(ClientEventOuterClass$ClientEvent.parseFrom(((C5920N7) it.next()).f1572c));
        }
        return arrayList;
    }

    @Override // com.plaid.internal.InterfaceC7222u3
    /* renamed from: a */
    public final Object mo1617a(List list, C7168o3 c7168o3) {
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ClientEventOuterClass$ClientEvent clientEventOuterClass$ClientEvent = (ClientEventOuterClass$ClientEvent) it.next();
            String workflowSessionId = clientEventOuterClass$ClientEvent.getWorkflowSessionId();
            Intrinsics.checkNotNullExpressionValue(workflowSessionId, "getWorkflowSessionId(...)");
            String strValueOf = String.valueOf(clientEventOuterClass$ClientEvent.hashCode());
            byte[] byteArray = clientEventOuterClass$ClientEvent.toByteArray();
            Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
            arrayList.add(new C5920N7(workflowSessionId, strValueOf, byteArray));
        }
        Object objMo1190a = this.f3216a.mo1190a(arrayList, c7168o3);
        return objMo1190a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo1190a : Unit.INSTANCE;
    }
}
