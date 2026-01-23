package com.plaid.internal;

import com.plaid.internal.C5953R5;
import com.plaid.internal.core.crashreporting.internal.models.Crash;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
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

@DebugMetadata(m3644c = "com.plaid.internal.core.crashreporting.internal.CrashStorage$getCrashes$2", m3645f = "CrashStorage.kt", m3646l = {36, 38}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.plaid.internal.d0 */
/* loaded from: classes16.dex */
public final class C7052d0 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super List<? extends Crash>>, Object> {

    /* renamed from: a */
    public C7082g0 f2714a;

    /* renamed from: b */
    public Collection f2715b;

    /* renamed from: c */
    public Iterator f2716c;

    /* renamed from: d */
    public int f2717d;

    /* renamed from: e */
    public final /* synthetic */ C7082g0 f2718e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7052d0(C7082g0 c7082g0, Continuation<? super C7052d0> continuation) {
        super(2, continuation);
        this.f2718e = c7082g0;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C7052d0(this.f2718e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends Crash>> continuation) {
        return new C7052d0(this.f2718e, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        if (r7 == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
    
        if (r7 == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0061, code lost:
    
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0078  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x005f -> B:24:0x0062). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Collection arrayList;
        C7082g0 c7082g0;
        Iterator it;
        List listListOf;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f2717d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C7082g0 c7082g02 = this.f2718e;
            this.f2717d = 1;
            obj = c7082g02.f2786a.m1376a(this);
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f2716c;
            arrayList = this.f2715b;
            c7082g0 = this.f2714a;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th) {
                C5953R5.a.m1301a(C5953R5.f1671a, th);
                listListOf = CollectionsKt.listOf(c7082g0.f2787b.m1364a(th));
            }
            listListOf = (List) obj;
            CollectionsKt.addAll(arrayList, listListOf);
            if (it.hasNext()) {
                return (List) arrayList;
            }
            String str = (String) it.next();
            Type type2 = c7082g0.f2789d;
            this.f2714a = c7082g0;
            this.f2715b = arrayList;
            this.f2716c = it;
            this.f2717d = 2;
            obj = C7082g0.m1509a(c7082g0, str, type2, this);
        }
        C7082g0 c7082g03 = this.f2718e;
        arrayList = new ArrayList();
        c7082g0 = c7082g03;
        it = ((Iterable) obj).iterator();
        if (it.hasNext()) {
        }
    }
}
