package com.robinhood.android.equities.taxlots.table;

import com.robinhood.android.equities.taxlots.C14807R;
import com.robinhood.android.equities.taxlots.microgram.TaxLotsCachedService;
import com.robinhood.android.equities.taxlots.utils.TaxLotsStringsHelper;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.utils.resource.StringResource;
import equity_trading_tax_lots.proto.p460v1.StreamTaxLotInformationResponse;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: GainLossCellDuxo.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/equities/taxlots/table/GainLossCellDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/equities/taxlots/table/GainLossViewState;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "taxLotsCachedService", "Lcom/robinhood/android/equities/taxlots/microgram/TaxLotsCachedService;", "<init>", "(Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/equities/taxlots/microgram/TaxLotsCachedService;)V", "bind", "Lkotlinx/coroutines/Job;", "accountNumber", "", "orderId", "Ljava/util/UUID;", "instrumentId", "lotId", "isSelectable", "", "lib-tax-lots_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class GainLossCellDuxo extends BaseDuxo4<GainLossViewState> {
    public static final int $stable = BaseDuxo4.$stable;
    private final TaxLotsCachedService taxLotsCachedService;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GainLossCellDuxo(DuxoBundle duxoBundle, TaxLotsCachedService taxLotsCachedService) {
        super(new GainLossViewState(null, null, 3, null), duxoBundle);
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(taxLotsCachedService, "taxLotsCachedService");
        this.taxLotsCachedService = taxLotsCachedService;
    }

    /* compiled from: GainLossCellDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.table.GainLossCellDuxo$bind$1", m3645f = "GainLossCellDuxo.kt", m3646l = {34}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equities.taxlots.table.GainLossCellDuxo$bind$1 */
    static final class C149501 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ UUID $instrumentId;
        final /* synthetic */ boolean $isSelectable;
        final /* synthetic */ String $lotId;
        final /* synthetic */ UUID $orderId;
        int label;
        final /* synthetic */ GainLossCellDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C149501(boolean z, GainLossCellDuxo gainLossCellDuxo, String str, UUID uuid, UUID uuid2, String str2, Continuation<? super C149501> continuation) {
            super(2, continuation);
            this.$isSelectable = z;
            this.this$0 = gainLossCellDuxo;
            this.$accountNumber = str;
            this.$orderId = uuid;
            this.$instrumentId = uuid2;
            this.$lotId = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C149501(this.$isSelectable, this.this$0, this.$accountNumber, this.$orderId, this.$instrumentId, this.$lotId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C149501) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.$isSelectable) {
                    Flow<StreamTaxLotInformationResponse> flowStreamTaxLotInformation = this.this$0.taxLotsCachedService.streamTaxLotInformation(this.$accountNumber, this.$orderId, this.$instrumentId, this.$lotId);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamTaxLotInformation, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    this.this$0.applyMutation(new AnonymousClass2(null));
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: GainLossCellDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "taxLotInfo", "Lequity_trading_tax_lots/proto/v1/StreamTaxLotInformationResponse;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.table.GainLossCellDuxo$bind$1$1", m3645f = "GainLossCellDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equities.taxlots.table.GainLossCellDuxo$bind$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<StreamTaxLotInformationResponse, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ GainLossCellDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(GainLossCellDuxo gainLossCellDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = gainLossCellDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(StreamTaxLotInformationResponse streamTaxLotInformationResponse, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(streamTaxLotInformationResponse, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: GainLossCellDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equities/taxlots/table/GainLossViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.table.GainLossCellDuxo$bind$1$1$1", m3645f = "GainLossCellDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equities.taxlots.table.GainLossCellDuxo$bind$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C498841 extends ContinuationImpl7 implements Function2<GainLossViewState, Continuation<? super GainLossViewState>, Object> {
                final /* synthetic */ StreamTaxLotInformationResponse $taxLotInfo;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C498841(StreamTaxLotInformationResponse streamTaxLotInformationResponse, Continuation<? super C498841> continuation) {
                    super(2, continuation);
                    this.$taxLotInfo = streamTaxLotInformationResponse;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C498841 c498841 = new C498841(this.$taxLotInfo, continuation);
                    c498841.L$0 = obj;
                    return c498841;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(GainLossViewState gainLossViewState, Continuation<? super GainLossViewState> continuation) {
                    return ((C498841) create(gainLossViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    StringResource stringResourceInvoke;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    GainLossViewState gainLossViewState = (GainLossViewState) this.L$0;
                    if (this.$taxLotInfo.getGain_loss() != null) {
                        stringResourceInvoke = StringResource.INSTANCE.invoke(TaxLotsStringsHelper.INSTANCE.getFormattedGainLoss(this.$taxLotInfo.getGain_loss()));
                    } else {
                        stringResourceInvoke = StringResource.INSTANCE.invoke(C14807R.string.tax_lots_table_empty_text, new Object[0]);
                    }
                    return gainLossViewState.copy(stringResourceInvoke, this.$taxLotInfo.getGain_loss() != null ? boxing.boxBoolean(TaxLotsStringsHelper.INSTANCE.isGain(this.$taxLotInfo.getGain_loss())) : null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C498841((StreamTaxLotInformationResponse) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* compiled from: GainLossCellDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equities/taxlots/table/GainLossViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.table.GainLossCellDuxo$bind$1$2", m3645f = "GainLossCellDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equities.taxlots.table.GainLossCellDuxo$bind$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<GainLossViewState, Continuation<? super GainLossViewState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(GainLossViewState gainLossViewState, Continuation<? super GainLossViewState> continuation) {
                return ((AnonymousClass2) create(gainLossViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ((GainLossViewState) this.L$0).copy(StringResource.INSTANCE.invoke(C14807R.string.tax_lots_table_empty_text, new Object[0]), null);
            }
        }
    }

    public final Job bind(String accountNumber, UUID orderId, UUID instrumentId, String lotId, boolean isSelectable) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(lotId, "lotId");
        return BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C149501(isSelectable, this, accountNumber, orderId, instrumentId, lotId, null), 3, null);
    }
}
