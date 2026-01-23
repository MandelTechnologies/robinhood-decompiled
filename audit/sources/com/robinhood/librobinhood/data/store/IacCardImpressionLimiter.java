package com.robinhood.librobinhood.data.store;

import com.plaid.internal.EnumC7081g;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.utils.Optional;
import io.reactivex.Observable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.rx2.RxAwait3;
import p479j$.time.Clock;
import timber.log.Timber;

/* compiled from: IacCardImpressionLimiter.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\n\u001a\u00020\u000bH\u0007J4\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u001c\u0010\u000f\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010H\u0087@¢\u0006\u0002\u0010\u0012J\b\u0010\u0013\u001a\u00020\tH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/IacCardImpressionLimiter;", "", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "<init>", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;)V", "impressionOccurrenceCache", "", "", "", "reset", "", "performIfAllowed", "card", "Lcom/robinhood/models/card/db/Card;", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "(Lcom/robinhood/models/card/db/Card;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "now", "Companion", "lib-store-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class IacCardImpressionLimiter {
    private final ExperimentsStore experimentsStore;
    private final Map<String, Long> impressionOccurrenceCache;

    /* compiled from: IacCardImpressionLimiter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.IacCardImpressionLimiter", m3645f = "IacCardImpressionLimiter.kt", m3646l = {84, 55, EnumC7081g.SDK_ASSET_ICON_HOME_VALUE}, m3647m = "performIfAllowed")
    /* renamed from: com.robinhood.librobinhood.data.store.IacCardImpressionLimiter$performIfAllowed$1 */
    static final class C338681 extends ContinuationImpl {
        long J$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C338681(Continuation<? super C338681> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return IacCardImpressionLimiter.this.performIfAllowed(null, null, this);
        }
    }

    public IacCardImpressionLimiter(ExperimentsStore experimentsStore) {
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        this.experimentsStore = experimentsStore;
        this.impressionOccurrenceCache = new LinkedHashMap();
    }

    public final void reset() {
        Timber.INSTANCE.mo3350d("Resetting iac card impression limiter cache.", new Object[0]);
        this.impressionOccurrenceCache.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0099, code lost:
    
        if (r6.invoke(r2) == r3) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object performIfAllowed(Card card, Function1<? super Continuation<? super Unit>, ? extends Object> function1, Continuation<? super Unit> continuation) {
        C338681 c338681;
        String str;
        Function1<? super Continuation<? super Unit>, ? extends Object> function12;
        String str2;
        long j;
        Integer intOrNull;
        if (continuation instanceof C338681) {
            c338681 = (C338681) continuation;
            int i = c338681.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c338681.label = i - Integer.MIN_VALUE;
            } else {
                c338681 = new C338681(continuation);
            }
        }
        Object obj = c338681.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c338681.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            String cardId = card.getCardId();
            Observable observableStreamVariation$default = ExperimentsProvider.DefaultImpls.streamVariation$default(this.experimentsStore, Companion.EngagementCardsImpressionLimitExperiment.INSTANCE, false, 2, null);
            c338681.L$0 = function1;
            c338681.L$1 = cardId;
            c338681.label = 1;
            Object objAwaitFirst = RxAwait3.awaitFirst(observableStreamVariation$default, c338681);
            if (objAwaitFirst != coroutine_suspended) {
                str = cardId;
                obj = objAwaitFirst;
                function12 = function1;
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = c338681.J$0;
            str2 = (String) c338681.L$0;
            ResultKt.throwOnFailure(obj);
            this.impressionOccurrenceCache.put(str2, boxing.boxLong(j));
            return Unit.INSTANCE;
        }
        str = (String) c338681.L$1;
        function12 = (Function1) c338681.L$0;
        ResultKt.throwOnFailure(obj);
        String str3 = (String) ((Optional) obj).getOrNull();
        if (((str3 == null || (intOrNull = StringsKt.toIntOrNull(str3)) == null) ? 0 : intOrNull.intValue()) == 0) {
            c338681.L$0 = null;
            c338681.L$1 = null;
            c338681.label = 2;
        } else {
            Long l = this.impressionOccurrenceCache.get(str);
            long jLongValue = l != null ? l.longValue() : 0L;
            long j2 = (r1 * 1000) + jLongValue;
            long jNow = now();
            this.impressionOccurrenceCache.putIfAbsent(str, boxing.boxLong(jNow));
            if (jLongValue == 0 || jNow >= j2) {
                Timber.INSTANCE.mo3350d("Impression for card " + str + " allowed. " + this.impressionOccurrenceCache, new Object[0]);
                c338681.L$0 = str;
                c338681.L$1 = null;
                c338681.J$0 = jNow;
                c338681.label = 3;
                if (function12.invoke(c338681) != coroutine_suspended) {
                    str2 = str;
                    j = jNow;
                    this.impressionOccurrenceCache.put(str2, boxing.boxLong(j));
                    return Unit.INSTANCE;
                }
            } else {
                Timber.INSTANCE.mo3350d("Impression for card " + str + " is not allowed since " + now() + " < " + j2 + ".", new Object[0]);
                return Unit.INSTANCE;
            }
        }
        return coroutine_suspended;
    }

    private final long now() {
        return Clock.systemUTC().millis();
    }
}
