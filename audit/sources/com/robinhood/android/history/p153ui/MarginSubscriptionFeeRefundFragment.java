package com.robinhood.android.history.p153ui;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwner2;
import androidx.lifecycle.RepeatOnLifecycle;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.designsystem.row.RdsDataRowView;
import com.robinhood.android.history.C18359R;
import com.robinhood.android.lib.store.margin.MarginSubscriptionFeeStore;
import com.robinhood.models.p320db.MarginSubscriptionFeeRefund;
import com.robinhood.models.util.Money;
import com.robinhood.utils.datetime.format.InstantFormatter;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: MarginSubscriptionFeeRefundFragment.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 &2\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u0010\u0010#\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020%H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\u000b\u0010\u0007R\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/history/ui/MarginSubscriptionFeeRefundFragment;", "Lcom/robinhood/android/history/ui/BaseDetailFragment;", "<init>", "()V", "dateSection", "Lcom/robinhood/android/designsystem/row/RdsDataRowView;", "getDateSection", "()Lcom/robinhood/android/designsystem/row/RdsDataRowView;", "dateSection$delegate", "Lkotlin/properties/ReadOnlyProperty;", "amountSection", "getAmountSection", "amountSection$delegate", "marginSubscriptionFeeStore", "Lcom/robinhood/android/lib/store/margin/MarginSubscriptionFeeStore;", "getMarginSubscriptionFeeStore", "()Lcom/robinhood/android/lib/store/margin/MarginSubscriptionFeeStore;", "setMarginSubscriptionFeeStore", "(Lcom/robinhood/android/lib/store/margin/MarginSubscriptionFeeStore;)V", MarginSubscriptionFeeRefundFragment.EXTRA_REFUND_ID, "Ljava/util/UUID;", "getRefundId", "()Ljava/util/UUID;", "refundId$delegate", "Lkotlin/Lazy;", "revealTransitionName", "", "getRevealTransitionName", "()Ljava/lang/String;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "refreshUi", "refund", "Lcom/robinhood/models/db/MarginSubscriptionFeeRefund;", "Companion", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class MarginSubscriptionFeeRefundFragment extends BaseDetailFragment {
    private static final String EXTRA_REFUND_ID = "refundId";

    /* renamed from: amountSection$delegate, reason: from kotlin metadata */
    private final Interfaces2 amountSection;

    /* renamed from: dateSection$delegate, reason: from kotlin metadata */
    private final Interfaces2 dateSection;
    public MarginSubscriptionFeeStore marginSubscriptionFeeStore;

    /* renamed from: refundId$delegate, reason: from kotlin metadata */
    private final Lazy refundId;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(MarginSubscriptionFeeRefundFragment.class, "dateSection", "getDateSection()Lcom/robinhood/android/designsystem/row/RdsDataRowView;", 0)), Reflection.property1(new PropertyReference1Impl(MarginSubscriptionFeeRefundFragment.class, "amountSection", "getAmountSection()Lcom/robinhood/android/designsystem/row/RdsDataRowView;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public MarginSubscriptionFeeRefundFragment() {
        super(C18359R.layout.fragment_margin_subscription_fee_refund_detail);
        this.dateSection = bindView(C18359R.id.margin_refund_detail_date);
        this.amountSection = bindView(C18359R.id.margin_refund_detail_amount);
        this.refundId = Fragments2.argument(this, EXTRA_REFUND_ID);
    }

    private final RdsDataRowView getDateSection() {
        return (RdsDataRowView) this.dateSection.getValue(this, $$delegatedProperties[0]);
    }

    private final RdsDataRowView getAmountSection() {
        return (RdsDataRowView) this.amountSection.getValue(this, $$delegatedProperties[1]);
    }

    public final MarginSubscriptionFeeStore getMarginSubscriptionFeeStore() {
        MarginSubscriptionFeeStore marginSubscriptionFeeStore = this.marginSubscriptionFeeStore;
        if (marginSubscriptionFeeStore != null) {
            return marginSubscriptionFeeStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("marginSubscriptionFeeStore");
        return null;
    }

    public final void setMarginSubscriptionFeeStore(MarginSubscriptionFeeStore marginSubscriptionFeeStore) {
        Intrinsics.checkNotNullParameter(marginSubscriptionFeeStore, "<set-?>");
        this.marginSubscriptionFeeStore = marginSubscriptionFeeStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UUID getRefundId() {
        return (UUID) this.refundId.getValue();
    }

    @Override // com.robinhood.android.history.p153ui.BaseDetailFragment
    public String getRevealTransitionName() {
        String string2 = getRefundId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    @Override // com.robinhood.android.history.p153ui.BaseDetailFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwner2.getLifecycleScope(viewLifecycleOwner), null, null, new C183941(null), 3, null);
    }

    /* compiled from: MarginSubscriptionFeeRefundFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.history.ui.MarginSubscriptionFeeRefundFragment$onViewCreated$1", m3645f = "MarginSubscriptionFeeRefundFragment.kt", m3646l = {40}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.history.ui.MarginSubscriptionFeeRefundFragment$onViewCreated$1 */
    static final class C183941 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C183941(Continuation<? super C183941> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MarginSubscriptionFeeRefundFragment.this.new C183941(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C183941) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: MarginSubscriptionFeeRefundFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.history.ui.MarginSubscriptionFeeRefundFragment$onViewCreated$1$1", m3645f = "MarginSubscriptionFeeRefundFragment.kt", m3646l = {42}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.history.ui.MarginSubscriptionFeeRefundFragment$onViewCreated$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ MarginSubscriptionFeeRefundFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(MarginSubscriptionFeeRefundFragment marginSubscriptionFeeRefundFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = marginSubscriptionFeeRefundFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
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
                    Flow<MarginSubscriptionFeeRefund> marginSubscriptionFeeRefund = this.this$0.getMarginSubscriptionFeeStore().getMarginSubscriptionFeeRefund(this.this$0.getRefundId());
                    C501791 c501791 = new C501791(this.this$0);
                    this.label = 1;
                    if (FlowKt.collectLatest(marginSubscriptionFeeRefund, c501791, this) == coroutine_suspended) {
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

            /* compiled from: MarginSubscriptionFeeRefundFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.history.ui.MarginSubscriptionFeeRefundFragment$onViewCreated$1$1$1, reason: invalid class name and collision with other inner class name */
            /* synthetic */ class C501791 extends AdaptedFunctionReference implements Function2<MarginSubscriptionFeeRefund, Continuation<? super Unit>, Object>, ContinuationImpl6 {
                C501791(Object obj) {
                    super(2, obj, MarginSubscriptionFeeRefundFragment.class, "refreshUi", "refreshUi(Lcom/robinhood/models/db/MarginSubscriptionFeeRefund;)V", 4);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(MarginSubscriptionFeeRefund marginSubscriptionFeeRefund, Continuation<? super Unit> continuation) {
                    return AnonymousClass1.invokeSuspend$refreshUi((MarginSubscriptionFeeRefundFragment) this.receiver, marginSubscriptionFeeRefund, continuation);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ Object invokeSuspend$refreshUi(MarginSubscriptionFeeRefundFragment marginSubscriptionFeeRefundFragment, MarginSubscriptionFeeRefund marginSubscriptionFeeRefund, Continuation continuation) {
                marginSubscriptionFeeRefundFragment.refreshUi(marginSubscriptionFeeRefund);
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                LifecycleOwner viewLifecycleOwner = MarginSubscriptionFeeRefundFragment.this.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                Lifecycle.State state = Lifecycle.State.RESUMED;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(MarginSubscriptionFeeRefundFragment.this, null);
                this.label = 1;
                if (RepeatOnLifecycle.repeatOnLifecycle(viewLifecycleOwner, state, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshUi(MarginSubscriptionFeeRefund refund) {
        getExpandedToolbarTitleTxt().setText(refund.getName());
        getDateSection().setValueText(InstantFormatter.MEDIUM_DATE_IN_SYSTEM_ZONE.format(refund.getCreatedAt()));
        getAmountSection().setValueText(Money.format$default(refund.getAmount(), null, false, null, false, 0, null, false, null, false, false, 1023, null));
    }

    /* compiled from: MarginSubscriptionFeeRefundFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/history/ui/MarginSubscriptionFeeRefundFragment$Companion;", "", "<init>", "()V", "EXTRA_REFUND_ID", "", "newInstance", "Lcom/robinhood/android/history/ui/MarginSubscriptionFeeRefundFragment;", MarginSubscriptionFeeRefundFragment.EXTRA_REFUND_ID, "Ljava/util/UUID;", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final MarginSubscriptionFeeRefundFragment newInstance(UUID refundId) {
            Intrinsics.checkNotNullParameter(refundId, "refundId");
            MarginSubscriptionFeeRefundFragment marginSubscriptionFeeRefundFragment = new MarginSubscriptionFeeRefundFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable(MarginSubscriptionFeeRefundFragment.EXTRA_REFUND_ID, refundId);
            marginSubscriptionFeeRefundFragment.setArguments(bundle);
            return marginSubscriptionFeeRefundFragment;
        }
    }
}
