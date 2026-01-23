package com.plaid.internal;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@DebugMetadata(m3644c = "com.plaid.core.storage.PlaidDirectoryStorage$listFileNames$2", m3645f = "PlaidDirectoryStorage.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.plaid.internal.X4 */
/* loaded from: classes16.dex */
public final class C6006X4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super List<? extends String>>, Object> {

    /* renamed from: a */
    public final /* synthetic */ C6044b5 f1823a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6006X4(C6044b5 c6044b5, Continuation<? super C6006X4> continuation) {
        super(2, continuation);
        this.f1823a = c6044b5;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C6006X4(this.f1823a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends String>> continuation) {
        return new C6006X4(this.f1823a, continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        List list;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        File[] fileArrListFiles = this.f1823a.f1925a.listFiles();
        if (fileArrListFiles == null || (list = ArraysKt.toList(fileArrListFiles)) == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((File) it.next()).getName());
        }
        return arrayList;
    }
}
