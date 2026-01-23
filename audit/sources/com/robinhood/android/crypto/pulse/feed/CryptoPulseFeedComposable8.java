package com.robinhood.android.crypto.pulse.feed;

import androidx.compose.foundation.ScrollState;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.LayoutCoordinates2;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.SnapshotState;
import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: CryptoPulseFeedComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.crypto.pulse.feed.CryptoPulseFeedComposableKt$CryptoPulseFeedComposable$1$3$1$1", m3645f = "CryptoPulseFeedComposable.kt", m3646l = {192}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.crypto.pulse.feed.CryptoPulseFeedComposableKt$CryptoPulseFeedComposable$1$3$1$1, reason: use source file name */
/* loaded from: classes2.dex */
final class CryptoPulseFeedComposable8 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CoroutineScope $coroutineScope;
    final /* synthetic */ Density $density;
    final /* synthetic */ SnapshotState<Boolean> $isExpanded$delegate;
    final /* synthetic */ LayoutCoordinates $layoutCoordinates;
    final /* synthetic */ ScrollState $scrollState;
    final /* synthetic */ float $topPadding;
    final /* synthetic */ float $totalExpandedHeight;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoPulseFeedComposable8(Density density, float f, float f2, ScrollState scrollState, CoroutineScope coroutineScope, LayoutCoordinates layoutCoordinates, SnapshotState<Boolean> snapshotState, Continuation<? super CryptoPulseFeedComposable8> continuation) {
        super(2, continuation);
        this.$density = density;
        this.$totalExpandedHeight = f;
        this.$topPadding = f2;
        this.$scrollState = scrollState;
        this.$coroutineScope = coroutineScope;
        this.$layoutCoordinates = layoutCoordinates;
        this.$isExpanded$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CryptoPulseFeedComposable8(this.$density, this.$totalExpandedHeight, this.$topPadding, this.$scrollState, this.$coroutineScope, this.$layoutCoordinates, this.$isExpanded$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CryptoPulseFeedComposable8) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            float fMo5012toDpu2uoSUM = this.$density.mo5012toDpu2uoSUM(Float.intBitsToFloat((int) (LayoutCoordinates2.positionInRoot(this.$layoutCoordinates) & 4294967295L)));
            float fM7995constructorimpl = C2002Dp.m7995constructorimpl(this.$totalExpandedHeight + this.$topPadding);
            if (C2002Dp.m7994compareTo0680j_4(fMo5012toDpu2uoSUM, fM7995constructorimpl) < 0) {
                BuildersKt__Builders_commonKt.launch$default(this.$coroutineScope, null, null, new C129311(this.$scrollState, RangesKt.coerceAtLeast(this.$scrollState.getValue() - ((int) this.$density.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(fM7995constructorimpl - fMo5012toDpu2uoSUM))), 0), null), 3, null);
                this.label = 1;
                if (DelayKt.delay(100L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        CryptoPulseFeedComposable5.CryptoPulseFeedComposable$lambda$33$lambda$32$lambda$18(this.$isExpanded$delegate, true);
        return Unit.INSTANCE;
    }

    /* compiled from: CryptoPulseFeedComposable.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.pulse.feed.CryptoPulseFeedComposableKt$CryptoPulseFeedComposable$1$3$1$1$1", m3645f = "CryptoPulseFeedComposable.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.pulse.feed.CryptoPulseFeedComposableKt$CryptoPulseFeedComposable$1$3$1$1$1 */
    static final class C129311 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ScrollState $scrollState;
        final /* synthetic */ int $targetScroll;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C129311(ScrollState scrollState, int i, Continuation<? super C129311> continuation) {
            super(2, continuation);
            this.$scrollState = scrollState;
            this.$targetScroll = i;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C129311(this.$scrollState, this.$targetScroll, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C129311) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ScrollState scrollState = this.$scrollState;
                int i2 = this.$targetScroll;
                this.label = 1;
                if (ScrollState.animateScrollTo$default(scrollState, i2, null, this, 2, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }
}
