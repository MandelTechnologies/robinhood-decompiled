package com.truelayer.payments.core.store;

import com.truelayer.payments.core.domain.payments.RecentAdditionalInput;
import com.truelayer.payments.core.domain.utils.Outcome;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

/* compiled from: AdditionalInputs.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J6\u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H¦@¢\u0006\u0002\u0010\nJ?\u0010\u000b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u000eH¦@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010JE\u0010\u000b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\r\u001a\u00020\u000eH¦@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0011J\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00060\u0003H¦@¢\u0006\u0002\u0010\u0014J,\u0010\u0015\u001a \u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0016\u0012\u0004\u0012\u00020\u00060\u0003H¦@¢\u0006\u0002\u0010\u0014J(\u0010\u0015\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010\u0007\u001a\u00020\bH¦@¢\u0006\u0002\u0010\u0017J0\u0010\u0018\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\bH\u0096@¢\u0006\u0002\u0010\u001aJ6\u0010\u0018\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u0004H¦@¢\u0006\u0002\u0010\nJ(\u0010\u001c\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010\u0007\u001a\u00020\bH¦@¢\u0006\u0002\u0010\u0017\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, m3636d2 = {"Lcom/truelayer/payments/core/store/AdditionalInputs;", "", "addOrReplace", "Lcom/truelayer/payments/core/domain/utils/Outcome;", "", "Lcom/truelayer/payments/core/domain/payments/RecentAdditionalInput;", "", "providerId", "", "inputs", "(Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addOrUpdate", "input", "maxEntriesPerId", "Lkotlin/UByte;", "addOrUpdate-SpDDLgk", "(Ljava/lang/String;Lcom/truelayer/payments/core/domain/payments/RecentAdditionalInput;BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Ljava/lang/String;Ljava/util/List;BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "erase", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAll", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "remove", "inputId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "inputIds", "removeAll", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public interface AdditionalInputs {
    Object addOrReplace(String str, List<RecentAdditionalInput> list, Continuation<? super Outcome<? extends List<RecentAdditionalInput>, ? extends Throwable>> continuation);

    /* renamed from: addOrUpdate-SpDDLgk, reason: not valid java name */
    Object mo27022addOrUpdateSpDDLgk(String str, RecentAdditionalInput recentAdditionalInput, byte b, Continuation<? super Outcome<? extends List<RecentAdditionalInput>, ? extends Throwable>> continuation);

    /* renamed from: addOrUpdate-SpDDLgk, reason: not valid java name */
    Object mo27023addOrUpdateSpDDLgk(String str, List<RecentAdditionalInput> list, byte b, Continuation<? super Outcome<? extends List<RecentAdditionalInput>, ? extends Throwable>> continuation);

    Object erase(Continuation<? super Outcome<Unit, ? extends Throwable>> continuation);

    Object getAll(String str, Continuation<? super Outcome<? extends List<RecentAdditionalInput>, ? extends Throwable>> continuation);

    Object getAll(Continuation<? super Outcome<? extends Map<String, ? extends List<RecentAdditionalInput>>, ? extends Throwable>> continuation);

    Object remove(String str, String str2, Continuation<? super Outcome<? extends List<RecentAdditionalInput>, ? extends Throwable>> continuation);

    Object remove(String str, List<String> list, Continuation<? super Outcome<? extends List<RecentAdditionalInput>, ? extends Throwable>> continuation);

    Object removeAll(String str, Continuation<? super Outcome<? extends List<RecentAdditionalInput>, ? extends Throwable>> continuation);

    /* compiled from: AdditionalInputs.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        /* renamed from: addOrUpdate-SpDDLgk$default, reason: not valid java name */
        public static /* synthetic */ Object m27025addOrUpdateSpDDLgk$default(AdditionalInputs additionalInputs, String str, List list, byte b, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addOrUpdate-SpDDLgk");
            }
            if ((i & 4) != 0) {
                b = UByte.m28560constructorimpl((byte) 3);
            }
            return additionalInputs.mo27023addOrUpdateSpDDLgk(str, (List<RecentAdditionalInput>) list, b, (Continuation<? super Outcome<? extends List<RecentAdditionalInput>, ? extends Throwable>>) continuation);
        }

        /* renamed from: addOrUpdate-SpDDLgk$default, reason: not valid java name */
        public static /* synthetic */ Object m27024addOrUpdateSpDDLgk$default(AdditionalInputs additionalInputs, String str, RecentAdditionalInput recentAdditionalInput, byte b, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addOrUpdate-SpDDLgk");
            }
            if ((i & 4) != 0) {
                b = UByte.m28560constructorimpl((byte) 3);
            }
            return additionalInputs.mo27022addOrUpdateSpDDLgk(str, recentAdditionalInput, b, (Continuation<? super Outcome<? extends List<RecentAdditionalInput>, ? extends Throwable>>) continuation);
        }

        public static Object remove(AdditionalInputs additionalInputs, String str, String str2, Continuation<? super Outcome<? extends List<RecentAdditionalInput>, ? extends Throwable>> continuation) {
            return additionalInputs.remove(str, CollectionsKt.listOf(str2), continuation);
        }
    }
}
