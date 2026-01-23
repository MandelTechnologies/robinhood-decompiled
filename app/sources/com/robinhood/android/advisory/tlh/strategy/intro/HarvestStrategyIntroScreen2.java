package com.robinhood.android.advisory.tlh.strategy.intro;

import androidx.compose.runtime.SnapshotIntState2;
import com.plaid.internal.EnumC7081g;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: HarvestStrategyIntroScreen.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.advisory.tlh.strategy.intro.HarvestStrategyIntroScreenKt$HarvestStrategyIntroLoadingScreen$1$1", m3645f = "HarvestStrategyIntroScreen.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.advisory.tlh.strategy.intro.HarvestStrategyIntroScreenKt$HarvestStrategyIntroLoadingScreen$1$1, reason: use source file name */
/* loaded from: classes7.dex */
final class HarvestStrategyIntroScreen2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotIntState2 $titleIndex$delegate;
    final /* synthetic */ List<String> $titles;
    final /* synthetic */ long $totalMs;
    int I$0;
    int I$1;
    long J$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HarvestStrategyIntroScreen2(List<String> list, long j, SnapshotIntState2 snapshotIntState2, Continuation<? super HarvestStrategyIntroScreen2> continuation) {
        super(2, continuation);
        this.$titles = list;
        this.$totalMs = j;
        this.$titleIndex$delegate = snapshotIntState2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HarvestStrategyIntroScreen2(this.$titles, this.$totalMs, this.$titleIndex$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HarvestStrategyIntroScreen2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x005c -> B:17:0x005f). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int size;
        long j;
        int i;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.$titles.isEmpty()) {
                return Unit.INSTANCE;
            }
            this.$titleIndex$delegate.setIntValue(0);
            long jMax = Math.max(1L, this.$totalMs / RangesKt.coerceAtLeast(this.$titles.size(), 1));
            size = this.$titles.size();
            j = jMax;
            i = 1;
            if (i < size) {
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            size = this.I$1;
            i = this.I$0;
            j = this.J$0;
            ResultKt.throwOnFailure(obj);
            this.$titleIndex$delegate.setIntValue(i);
            i++;
            if (i < size) {
                this.J$0 = j;
                this.I$0 = i;
                this.I$1 = size;
                this.label = 1;
                if (DelayKt.delay(j, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                this.$titleIndex$delegate.setIntValue(i);
                i++;
                if (i < size) {
                    return Unit.INSTANCE;
                }
            }
        }
    }
}
