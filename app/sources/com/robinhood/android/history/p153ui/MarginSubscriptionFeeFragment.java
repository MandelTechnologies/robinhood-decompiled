package com.robinhood.android.history.p153ui;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwner2;
import androidx.lifecycle.RepeatOnLifecycle;
import com.robinhood.android.common.gold.C11182R;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.designsystem.row.RdsDataRowView;
import com.robinhood.android.history.C18359R;
import com.robinhood.android.lib.store.margin.MarginSubscriptionFeeStore;
import com.robinhood.models.p320db.MarginSubscriptionFee;
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

/* compiled from: MarginSubscriptionFeeFragment.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 02\u00020\u0001:\u00010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00052\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u0010\u0010-\u001a\u00020)2\u0006\u0010.\u001a\u00020/H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000f\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\t\u001a\u0004\b\u0010\u0010\rR\u001b\u0010\u0012\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\t\u001a\u0004\b\u0013\u0010\rR\u001b\u0010\u0015\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\t\u001a\u0004\b\u0016\u0010\rR\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\u0014\u0010$\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u00061"}, m3636d2 = {"Lcom/robinhood/android/history/ui/MarginSubscriptionFeeFragment;", "Lcom/robinhood/android/history/ui/BaseDetailFragment;", "<init>", "()V", "hasCreditWrapper", "Landroid/view/View;", "getHasCreditWrapper", "()Landroid/view/View;", "hasCreditWrapper$delegate", "Lkotlin/properties/ReadOnlyProperty;", "totalSection", "Lcom/robinhood/android/designsystem/row/RdsDataRowView;", "getTotalSection", "()Lcom/robinhood/android/designsystem/row/RdsDataRowView;", "totalSection$delegate", "creditSection", "getCreditSection", "creditSection$delegate", "costSection", "getCostSection", "costSection$delegate", "dateSection", "getDateSection", "dateSection$delegate", "marginSubscriptionFeeStore", "Lcom/robinhood/android/lib/store/margin/MarginSubscriptionFeeStore;", "getMarginSubscriptionFeeStore", "()Lcom/robinhood/android/lib/store/margin/MarginSubscriptionFeeStore;", "setMarginSubscriptionFeeStore", "(Lcom/robinhood/android/lib/store/margin/MarginSubscriptionFeeStore;)V", MarginSubscriptionFeeFragment.EXTRA_SUBSCRIPTION_FEE_ID, "Ljava/util/UUID;", "getSubscriptionFeeId", "()Ljava/util/UUID;", "subscriptionFeeId$delegate", "Lkotlin/Lazy;", "revealTransitionName", "", "getRevealTransitionName", "()Ljava/lang/String;", "onViewCreated", "", "view", "savedInstanceState", "Landroid/os/Bundle;", "refreshUi", "marginSubscriptionFee", "Lcom/robinhood/models/db/MarginSubscriptionFee;", "Companion", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class MarginSubscriptionFeeFragment extends BaseDetailFragment {
    private static final String EXTRA_SUBSCRIPTION_FEE_ID = "subscriptionFeeId";

    /* renamed from: costSection$delegate, reason: from kotlin metadata */
    private final Interfaces2 costSection;

    /* renamed from: creditSection$delegate, reason: from kotlin metadata */
    private final Interfaces2 creditSection;

    /* renamed from: dateSection$delegate, reason: from kotlin metadata */
    private final Interfaces2 dateSection;

    /* renamed from: hasCreditWrapper$delegate, reason: from kotlin metadata */
    private final Interfaces2 hasCreditWrapper;
    public MarginSubscriptionFeeStore marginSubscriptionFeeStore;

    /* renamed from: subscriptionFeeId$delegate, reason: from kotlin metadata */
    private final Lazy subscriptionFeeId;

    /* renamed from: totalSection$delegate, reason: from kotlin metadata */
    private final Interfaces2 totalSection;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(MarginSubscriptionFeeFragment.class, "hasCreditWrapper", "getHasCreditWrapper()Landroid/view/View;", 0)), Reflection.property1(new PropertyReference1Impl(MarginSubscriptionFeeFragment.class, "totalSection", "getTotalSection()Lcom/robinhood/android/designsystem/row/RdsDataRowView;", 0)), Reflection.property1(new PropertyReference1Impl(MarginSubscriptionFeeFragment.class, "creditSection", "getCreditSection()Lcom/robinhood/android/designsystem/row/RdsDataRowView;", 0)), Reflection.property1(new PropertyReference1Impl(MarginSubscriptionFeeFragment.class, "costSection", "getCostSection()Lcom/robinhood/android/designsystem/row/RdsDataRowView;", 0)), Reflection.property1(new PropertyReference1Impl(MarginSubscriptionFeeFragment.class, "dateSection", "getDateSection()Lcom/robinhood/android/designsystem/row/RdsDataRowView;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public MarginSubscriptionFeeFragment() {
        super(C18359R.layout.fragment_margin_subscription_fee_detail);
        this.hasCreditWrapper = bindView(C18359R.id.fee_has_credit_wrapper);
        this.totalSection = bindView(C18359R.id.fee_total);
        this.creditSection = bindView(C18359R.id.fee_credit);
        this.costSection = bindView(C18359R.id.fee_cost);
        this.dateSection = bindView(C18359R.id.fee_date);
        this.subscriptionFeeId = Fragments2.argument(this, EXTRA_SUBSCRIPTION_FEE_ID);
    }

    private final View getHasCreditWrapper() {
        return (View) this.hasCreditWrapper.getValue(this, $$delegatedProperties[0]);
    }

    private final RdsDataRowView getTotalSection() {
        return (RdsDataRowView) this.totalSection.getValue(this, $$delegatedProperties[1]);
    }

    private final RdsDataRowView getCreditSection() {
        return (RdsDataRowView) this.creditSection.getValue(this, $$delegatedProperties[2]);
    }

    private final RdsDataRowView getCostSection() {
        return (RdsDataRowView) this.costSection.getValue(this, $$delegatedProperties[3]);
    }

    private final RdsDataRowView getDateSection() {
        return (RdsDataRowView) this.dateSection.getValue(this, $$delegatedProperties[4]);
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
    public final UUID getSubscriptionFeeId() {
        return (UUID) this.subscriptionFeeId.getValue();
    }

    @Override // com.robinhood.android.history.p153ui.BaseDetailFragment
    public String getRevealTransitionName() {
        String string2 = getSubscriptionFeeId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    @Override // com.robinhood.android.history.p153ui.BaseDetailFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getExpandedToolbarTitleTxt().setText(C11182R.string.gold_subscription_label);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwner2.getLifecycleScope(viewLifecycleOwner), null, null, new C183931(null), 3, null);
    }

    /* compiled from: MarginSubscriptionFeeFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.history.ui.MarginSubscriptionFeeFragment$onViewCreated$1", m3645f = "MarginSubscriptionFeeFragment.kt", m3646l = {45}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.history.ui.MarginSubscriptionFeeFragment$onViewCreated$1 */
    static final class C183931 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C183931(Continuation<? super C183931> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MarginSubscriptionFeeFragment.this.new C183931(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C183931) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: MarginSubscriptionFeeFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.history.ui.MarginSubscriptionFeeFragment$onViewCreated$1$1", m3645f = "MarginSubscriptionFeeFragment.kt", m3646l = {47}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.history.ui.MarginSubscriptionFeeFragment$onViewCreated$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ MarginSubscriptionFeeFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(MarginSubscriptionFeeFragment marginSubscriptionFeeFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = marginSubscriptionFeeFragment;
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
                    Flow<MarginSubscriptionFee> marginSubscriptionFee = this.this$0.getMarginSubscriptionFeeStore().getMarginSubscriptionFee(this.this$0.getSubscriptionFeeId());
                    C501781 c501781 = new C501781(this.this$0);
                    this.label = 1;
                    if (FlowKt.collectLatest(marginSubscriptionFee, c501781, this) == coroutine_suspended) {
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

            /* compiled from: MarginSubscriptionFeeFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.history.ui.MarginSubscriptionFeeFragment$onViewCreated$1$1$1, reason: invalid class name and collision with other inner class name */
            /* synthetic */ class C501781 extends AdaptedFunctionReference implements Function2<MarginSubscriptionFee, Continuation<? super Unit>, Object>, ContinuationImpl6 {
                C501781(Object obj) {
                    super(2, obj, MarginSubscriptionFeeFragment.class, "refreshUi", "refreshUi(Lcom/robinhood/models/db/MarginSubscriptionFee;)V", 4);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(MarginSubscriptionFee marginSubscriptionFee, Continuation<? super Unit> continuation) {
                    return AnonymousClass1.invokeSuspend$refreshUi((MarginSubscriptionFeeFragment) this.receiver, marginSubscriptionFee, continuation);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ Object invokeSuspend$refreshUi(MarginSubscriptionFeeFragment marginSubscriptionFeeFragment, MarginSubscriptionFee marginSubscriptionFee, Continuation continuation) {
                marginSubscriptionFeeFragment.refreshUi(marginSubscriptionFee);
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                LifecycleOwner viewLifecycleOwner = MarginSubscriptionFeeFragment.this.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                Lifecycle.State state = Lifecycle.State.RESUMED;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(MarginSubscriptionFeeFragment.this, null);
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
    public final void refreshUi(MarginSubscriptionFee marginSubscriptionFee) {
        if (!marginSubscriptionFee.getCredit().isZero()) {
            getCostSection().setValueText(Money.Adjustment.format$default(marginSubscriptionFee.getCost(), false, null, 3, null));
            getCreditSection().setValueText(Money.format$default(marginSubscriptionFee.getCredit(), null, false, null, false, 0, null, false, null, false, false, 1023, null));
            getHasCreditWrapper().setVisibility(0);
        } else {
            getHasCreditWrapper().setVisibility(8);
        }
        getDateSection().setValueText(InstantFormatter.NATURAL_TIMESTAMP_IN_SYSTEM_ZONE.format((InstantFormatter) marginSubscriptionFee.getInitiatedAt()));
        getTotalSection().setValueText(Money.Adjustment.format$default(marginSubscriptionFee.getAdjustment(), false, null, 3, null));
    }

    /* compiled from: MarginSubscriptionFeeFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/history/ui/MarginSubscriptionFeeFragment$Companion;", "", "<init>", "()V", "EXTRA_SUBSCRIPTION_FEE_ID", "", "newInstance", "Lcom/robinhood/android/history/ui/MarginSubscriptionFeeFragment;", MarginSubscriptionFeeFragment.EXTRA_SUBSCRIPTION_FEE_ID, "Ljava/util/UUID;", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final MarginSubscriptionFeeFragment newInstance(UUID subscriptionFeeId) {
            Intrinsics.checkNotNullParameter(subscriptionFeeId, "subscriptionFeeId");
            MarginSubscriptionFeeFragment marginSubscriptionFeeFragment = new MarginSubscriptionFeeFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable(MarginSubscriptionFeeFragment.EXTRA_SUBSCRIPTION_FEE_ID, subscriptionFeeId);
            marginSubscriptionFeeFragment.setArguments(bundle);
            return marginSubscriptionFeeFragment;
        }
    }
}
