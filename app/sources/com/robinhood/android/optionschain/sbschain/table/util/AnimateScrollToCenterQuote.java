package com.robinhood.android.optionschain.sbschain.table.util;

import androidx.compose.foundation.lazy.LazyListState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.DelayKt;

/* compiled from: AnimateScrollToCenterQuote.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\u001a(\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0080@¢\u0006\u0002\u0010\u0007\"\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"animateScrollToCenterQuote", "", "lazyListState", "Landroidx/compose/foundation/lazy/LazyListState;", "quoteIndex", "", "scrollToCenterOffset", "(Landroidx/compose/foundation/lazy/LazyListState;Ljava/lang/Integer;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "DELAY_AFTER_SNAP", "", "OFFSET_BEFORE_QUOTE_VISIBLE", "SNAP_INDEX_BUFFER", "feature-options-chain_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionschain.sbschain.table.util.AnimateScrollToCenterQuoteKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class AnimateScrollToCenterQuote {
    private static final long DELAY_AFTER_SNAP = 100;
    private static final int OFFSET_BEFORE_QUOTE_VISIBLE = 100;
    private static final int SNAP_INDEX_BUFFER = 50;

    /* compiled from: AnimateScrollToCenterQuote.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.util.AnimateScrollToCenterQuoteKt", m3645f = "AnimateScrollToCenterQuote.kt", m3646l = {21, 25, 26, 27, 32, 33, 34}, m3647m = "animateScrollToCenterQuote")
    /* renamed from: com.robinhood.android.optionschain.sbschain.table.util.AnimateScrollToCenterQuoteKt$animateScrollToCenterQuote$1 */
    static final class C246451 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C246451(Continuation<? super C246451> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AnimateScrollToCenterQuote.animateScrollToCenterQuote(null, null, 0, this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b2, code lost:
    
        if (r8.animateScrollToItem(r9.intValue(), -r10, r0) == r1) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f9, code lost:
    
        if (r10.animateScrollToItem(r9.intValue(), -r8, r0) != r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0140, code lost:
    
        if (r10.animateScrollToItem(r9.intValue(), -r8, r0) != r1) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object animateScrollToCenterQuote(LazyListState lazyListState, Integer num, int i, Continuation<? super Unit> continuation) {
        C246451 c246451;
        LazyListState lazyListState2;
        int i2;
        LazyListState lazyListState3;
        int i3;
        if (continuation instanceof C246451) {
            c246451 = (C246451) continuation;
            int i4 = c246451.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c246451.label = i4 - Integer.MIN_VALUE;
            } else {
                c246451 = new C246451(continuation);
            }
        }
        Object obj = c246451.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (c246451.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                if (num == null) {
                    return Unit.INSTANCE;
                }
                int firstVisibleItemIndex = lazyListState.getFirstVisibleItemIndex() - 50;
                int firstVisibleItemIndex2 = lazyListState.getFirstVisibleItemIndex() + lazyListState.getLayoutInfo().getVisibleItemsInfo().size() + 49;
                if (firstVisibleItemIndex <= num.intValue() && num.intValue() <= firstVisibleItemIndex2) {
                    c246451.label = 1;
                    break;
                } else if (num.intValue() < firstVisibleItemIndex) {
                    int iIntValue = num.intValue();
                    c246451.L$0 = lazyListState;
                    c246451.L$1 = num;
                    c246451.I$0 = i;
                    c246451.label = 2;
                    if (lazyListState.scrollToItem(iIntValue, 100, c246451) != coroutine_suspended) {
                        c246451.L$0 = lazyListState;
                        c246451.L$1 = num;
                        c246451.I$0 = i;
                        c246451.label = 3;
                        if (DelayKt.delay(100L, c246451) != coroutine_suspended) {
                            int i5 = i;
                            lazyListState2 = lazyListState;
                            i2 = i5;
                            c246451.L$0 = null;
                            c246451.L$1 = null;
                            c246451.label = 4;
                            break;
                        }
                    }
                } else {
                    if (num.intValue() <= firstVisibleItemIndex2) {
                        return Unit.INSTANCE;
                    }
                    c246451.L$0 = lazyListState;
                    c246451.L$1 = num;
                    c246451.I$0 = i;
                    c246451.label = 5;
                    if (lazyListState.scrollToItem(num.intValue(), (-100) - (i * 2), c246451) != coroutine_suspended) {
                        c246451.L$0 = lazyListState;
                        c246451.L$1 = num;
                        c246451.I$0 = i;
                        c246451.label = 6;
                        if (DelayKt.delay(100L, c246451) != coroutine_suspended) {
                            int i6 = i;
                            lazyListState3 = lazyListState;
                            i3 = i6;
                            c246451.L$0 = null;
                            c246451.L$1 = null;
                            c246451.label = 7;
                            break;
                        }
                    }
                }
                return coroutine_suspended;
            case 1:
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            case 2:
                i = c246451.I$0;
                num = (Integer) c246451.L$1;
                lazyListState = (LazyListState) c246451.L$0;
                ResultKt.throwOnFailure(obj);
                c246451.L$0 = lazyListState;
                c246451.L$1 = num;
                c246451.I$0 = i;
                c246451.label = 3;
                if (DelayKt.delay(100L, c246451) != coroutine_suspended) {
                }
                return coroutine_suspended;
            case 3:
                i2 = c246451.I$0;
                num = (Integer) c246451.L$1;
                lazyListState2 = (LazyListState) c246451.L$0;
                ResultKt.throwOnFailure(obj);
                c246451.L$0 = null;
                c246451.L$1 = null;
                c246451.label = 4;
                break;
            case 4:
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            case 5:
                i = c246451.I$0;
                num = (Integer) c246451.L$1;
                lazyListState = (LazyListState) c246451.L$0;
                ResultKt.throwOnFailure(obj);
                c246451.L$0 = lazyListState;
                c246451.L$1 = num;
                c246451.I$0 = i;
                c246451.label = 6;
                if (DelayKt.delay(100L, c246451) != coroutine_suspended) {
                }
                return coroutine_suspended;
            case 6:
                i3 = c246451.I$0;
                num = (Integer) c246451.L$1;
                lazyListState3 = (LazyListState) c246451.L$0;
                ResultKt.throwOnFailure(obj);
                c246451.L$0 = null;
                c246451.L$1 = null;
                c246451.label = 7;
                break;
            case 7:
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
