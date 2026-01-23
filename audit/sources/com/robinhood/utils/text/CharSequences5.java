package com.robinhood.utils.text;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl5;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceBuilder2;
import kotlin.sequences.SequencesKt;

/* compiled from: CharSequences.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\u001a\u0010\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"graphemeClusters", "Lkotlin/sequences/Sequence;", "", "lib-utils"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.text.CharSequencesKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class CharSequences5 {

    /* compiled from: CharSequences.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.utils.text.CharSequencesKt$graphemeClusters$1", m3645f = "CharSequences.kt", m3646l = {15}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.utils.text.CharSequencesKt$graphemeClusters$1 */
    static final class C420021 extends ContinuationImpl5 implements Function2<SequenceBuilder2<? super CharSequence>, Continuation<? super Unit>, Object> {
        final /* synthetic */ CharSequence $this_graphemeClusters;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C420021(CharSequence charSequence, Continuation<? super C420021> continuation) {
            super(2, continuation);
            this.$this_graphemeClusters = charSequence;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C420021 c420021 = new C420021(this.$this_graphemeClusters, continuation);
            c420021.L$0 = obj;
            return c420021;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SequenceBuilder2<? super CharSequence> sequenceBuilder2, Continuation<? super Unit> continuation) {
            return ((C420021) create(sequenceBuilder2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0067  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x005f -> B:6:0x0019). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            GraphemeClusterIterator graphemeClusterIterator;
            SequenceBuilder2 sequenceBuilder2;
            int i;
            int next;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                SequenceBuilder2 sequenceBuilder22 = (SequenceBuilder2) this.L$0;
                graphemeClusterIterator = new GraphemeClusterIterator();
                GraphemeClusterIterator.replaceText$default(graphemeClusterIterator, this.$this_graphemeClusters, 0, 0, 0, 14, null);
                int iFirst = graphemeClusterIterator.first();
                if (iFirst == -1) {
                    return Unit.INSTANCE;
                }
                sequenceBuilder2 = sequenceBuilder22;
                i = iFirst;
                next = graphemeClusterIterator.next();
                if (next != -1) {
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                next = this.I$0;
                graphemeClusterIterator = (GraphemeClusterIterator) this.L$1;
                sequenceBuilder2 = (SequenceBuilder2) this.L$0;
                ResultKt.throwOnFailure(obj);
                i = next;
                next = graphemeClusterIterator.next();
                if (next != -1) {
                    CharSequence charSequenceSubSequence = this.$this_graphemeClusters.subSequence(i, next);
                    this.L$0 = sequenceBuilder2;
                    this.L$1 = graphemeClusterIterator;
                    this.I$0 = next;
                    this.label = 1;
                    if (sequenceBuilder2.yield(charSequenceSubSequence, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    i = next;
                    next = graphemeClusterIterator.next();
                    if (next != -1) {
                        return Unit.INSTANCE;
                    }
                }
            }
        }
    }

    public static final Sequence<CharSequence> graphemeClusters(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return SequencesKt.sequence(new C420021(charSequence, null));
    }
}
