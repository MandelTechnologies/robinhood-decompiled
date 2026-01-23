package com.robinhood.android.rhyrewards.p246ui;

import androidx.compose.runtime.SnapshotIntState2;
import com.robinhood.models.p320db.mcduckling.MerchantOfferV2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: MerchantRewardsOfferDetailsBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsBottomSheet$MerchantRewardsOfferDetailGauge$1$1", m3645f = "MerchantRewardsOfferDetailsBottomSheet.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsBottomSheet$MerchantRewardsOfferDetailGauge$1$1, reason: use source file name */
/* loaded from: classes5.dex */
final class MerchantRewardsOfferDetailsBottomSheet2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotIntState2 $completedSteps$delegate;
    final /* synthetic */ CoroutineScope $coroutineScope;
    final /* synthetic */ MerchantOfferV2.DetailAsset.GaugeV2 $gauge;
    final /* synthetic */ SnapshotIntState2 $pendingSteps$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MerchantRewardsOfferDetailsBottomSheet2(CoroutineScope coroutineScope, MerchantOfferV2.DetailAsset.GaugeV2 gaugeV2, SnapshotIntState2 snapshotIntState2, SnapshotIntState2 snapshotIntState22, Continuation<? super MerchantRewardsOfferDetailsBottomSheet2> continuation) {
        super(2, continuation);
        this.$coroutineScope = coroutineScope;
        this.$gauge = gaugeV2;
        this.$pendingSteps$delegate = snapshotIntState2;
        this.$completedSteps$delegate = snapshotIntState22;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MerchantRewardsOfferDetailsBottomSheet2(this.$coroutineScope, this.$gauge, this.$pendingSteps$delegate, this.$completedSteps$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MerchantRewardsOfferDetailsBottomSheet2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: MerchantRewardsOfferDetailsBottomSheet.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsBottomSheet$MerchantRewardsOfferDetailGauge$1$1$1", m3645f = "MerchantRewardsOfferDetailsBottomSheet.kt", m3646l = {459}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsBottomSheet$MerchantRewardsOfferDetailGauge$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SnapshotIntState2 $completedSteps$delegate;
        final /* synthetic */ MerchantOfferV2.DetailAsset.GaugeV2 $gauge;
        final /* synthetic */ SnapshotIntState2 $pendingSteps$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MerchantOfferV2.DetailAsset.GaugeV2 gaugeV2, SnapshotIntState2 snapshotIntState2, SnapshotIntState2 snapshotIntState22, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$gauge = gaugeV2;
            this.$pendingSteps$delegate = snapshotIntState2;
            this.$completedSteps$delegate = snapshotIntState22;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$gauge, this.$pendingSteps$delegate, this.$completedSteps$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (DelayKt.delay(250L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.$pendingSteps$delegate.setIntValue(this.$gauge.getPendingChunks());
            this.$completedSteps$delegate.setIntValue(this.$gauge.getRedeemedChunks());
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            BuildersKt__Builders_commonKt.launch$default(this.$coroutineScope, null, null, new AnonymousClass1(this.$gauge, this.$pendingSteps$delegate, this.$completedSteps$delegate, null), 3, null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
