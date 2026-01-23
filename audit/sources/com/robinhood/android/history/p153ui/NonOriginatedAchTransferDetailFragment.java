package com.robinhood.android.history.p153ui;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.designsystem.row.RdsDataRowView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.history.C18359R;
import com.robinhood.android.history.databinding.FragmentNonOriginatedAchTransferDetailBinding;
import com.robinhood.android.history.extensions.NonOriginatedAchTransfers;
import com.robinhood.models.p320db.NonOriginatedAchTransfer;
import com.robinhood.transfers.gold.GoldDepositBoostTransferDetail;
import com.robinhood.utils.datetime.format.InstantFormatter;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.resource.StringResource;
import io.noties.markwon.Markwon;
import java.util.UUID;
import kotlin.ExceptionsH;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import p479j$.time.Instant;

/* compiled from: NonOriginatedAchTransferDetailFragment.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 $2\u00020\u0001:\u0002#$B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0010\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\"H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/history/ui/NonOriginatedAchTransferDetailFragment;", "Lcom/robinhood/android/history/ui/BaseDetailFragment;", "<init>", "()V", "binding", "Lcom/robinhood/android/history/databinding/FragmentNonOriginatedAchTransferDetailBinding;", "getBinding", "()Lcom/robinhood/android/history/databinding/FragmentNonOriginatedAchTransferDetailBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/history/ui/NonOriginatedAchTransferDetailDuxo;", "getDuxo", "()Lcom/robinhood/android/history/ui/NonOriginatedAchTransferDetailDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "revealTransitionName", "", "getRevealTransitionName", "()Ljava/lang/String;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "bind", "state", "Lcom/robinhood/android/history/ui/NonOriginatedAchTransferDetailViewState;", "Args", "Companion", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class NonOriginatedAchTransferDetailFragment extends BaseDetailFragment {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public Markwon markwon;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(NonOriginatedAchTransferDetailFragment.class, "binding", "getBinding()Lcom/robinhood/android/history/databinding/FragmentNonOriginatedAchTransferDetailBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public NonOriginatedAchTransferDetailFragment() {
        super(C18359R.layout.fragment_non_originated_ach_transfer_detail);
        this.binding = ViewBinding5.viewBinding(this, NonOriginatedAchTransferDetailFragment2.INSTANCE);
        this.duxo = DuxosKt.duxo(this, NonOriginatedAchTransferDetailDuxo.class);
    }

    private final FragmentNonOriginatedAchTransferDetailBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentNonOriginatedAchTransferDetailBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NonOriginatedAchTransferDetailDuxo getDuxo() {
        return (NonOriginatedAchTransferDetailDuxo) this.duxo.getValue();
    }

    public final Markwon getMarkwon() {
        Markwon markwon = this.markwon;
        if (markwon != null) {
            return markwon;
        }
        Intrinsics.throwUninitializedPropertyAccessException("markwon");
        return null;
    }

    public final void setMarkwon(Markwon markwon) {
        Intrinsics.checkNotNullParameter(markwon, "<set-?>");
        this.markwon = markwon;
    }

    @Override // com.robinhood.android.history.p153ui.BaseDetailFragment
    public String getRevealTransitionName() {
        String string2 = ((Args) INSTANCE.getArgs((Fragment) this)).getTransferId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    /* compiled from: NonOriginatedAchTransferDetailFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.history.ui.NonOriginatedAchTransferDetailFragment$onViewCreated$1", m3645f = "NonOriginatedAchTransferDetailFragment.kt", m3646l = {40}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.history.ui.NonOriginatedAchTransferDetailFragment$onViewCreated$1 */
    static final class C184001 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C184001(Continuation<? super C184001> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return NonOriginatedAchTransferDetailFragment.this.new C184001(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C184001) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: NonOriginatedAchTransferDetailFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.history.ui.NonOriginatedAchTransferDetailFragment$onViewCreated$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ NonOriginatedAchTransferDetailFragment $tmp0;

            AnonymousClass1(NonOriginatedAchTransferDetailFragment nonOriginatedAchTransferDetailFragment) {
                this.$tmp0 = nonOriginatedAchTransferDetailFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, NonOriginatedAchTransferDetailFragment.class, "bind", "bind(Lcom/robinhood/android/history/ui/NonOriginatedAchTransferDetailViewState;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(NonOriginatedAchTransferDetailViewState nonOriginatedAchTransferDetailViewState, Continuation<? super Unit> continuation) throws Resources.NotFoundException {
                Object objInvokeSuspend$bind = C184001.invokeSuspend$bind(this.$tmp0, nonOriginatedAchTransferDetailViewState, continuation);
                return objInvokeSuspend$bind == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$bind : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((NonOriginatedAchTransferDetailViewState) obj, (Continuation<? super Unit>) continuation);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<NonOriginatedAchTransferDetailViewState> stateFlow = NonOriginatedAchTransferDetailFragment.this.getDuxo().getStateFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(NonOriginatedAchTransferDetailFragment.this);
                this.label = 1;
                if (stateFlow.collect(anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new ExceptionsH();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$bind(NonOriginatedAchTransferDetailFragment nonOriginatedAchTransferDetailFragment, NonOriginatedAchTransferDetailViewState nonOriginatedAchTransferDetailViewState, Continuation continuation) throws Resources.NotFoundException {
            nonOriginatedAchTransferDetailFragment.bind(nonOriginatedAchTransferDetailViewState);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.history.p153ui.BaseDetailFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C184001(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(NonOriginatedAchTransferDetailViewState state) throws Resources.NotFoundException {
        String titleForHistory;
        CharSequence text;
        CharSequence text2;
        String statusForDetail;
        String detailText;
        Instant updatedAt;
        Instant initiatedAt;
        TextView expandedToolbarTitleTxt = getExpandedToolbarTitleTxt();
        NonOriginatedAchTransfer transfer = state.getTransfer();
        if (transfer != null) {
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            titleForHistory = NonOriginatedAchTransfers.getTitleForHistory(transfer, resources);
        } else {
            titleForHistory = null;
        }
        expandedToolbarTitleTxt.setText(titleForHistory);
        FragmentNonOriginatedAchTransferDetailBinding binding = getBinding();
        binding.nonOrigAchTransferDetailAmount.setValueText(state.getTransferAmountValueText());
        RdsDataRowView rdsDataRowView = binding.nonOrigAchTransferDetailOriginator;
        StringResource transferOriginatorText = state.getTransferOriginatorText();
        if (transferOriginatorText != null) {
            Resources resources2 = getResources();
            Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
            text = transferOriginatorText.getText(resources2);
        } else {
            text = null;
        }
        rdsDataRowView.setVisibilityValueText(text);
        RdsDataRowView rdsDataRowView2 = binding.nonOrigAchTransferDetailReceiver;
        StringResource transferReceiverText = state.getTransferReceiverText();
        if (transferReceiverText != null) {
            Resources resources3 = getResources();
            Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
            text2 = transferReceiverText.getText(resources3);
        } else {
            text2 = null;
        }
        rdsDataRowView2.setVisibilityValueText(text2);
        RdsDataRowView rdsDataRowView3 = binding.nonOrigAchTransferDetailReason;
        NonOriginatedAchTransfer transfer2 = state.getTransfer();
        rdsDataRowView3.setVisibilityValueText(transfer2 != null ? transfer2.getRejectionReasonDisplayName() : null);
        RdsDataRowView rdsDataRowView4 = binding.nonOrigAchTransferDetailStatus;
        NonOriginatedAchTransfer transfer3 = state.getTransfer();
        if (transfer3 != null) {
            Resources resources4 = getResources();
            Intrinsics.checkNotNullExpressionValue(resources4, "getResources(...)");
            statusForDetail = NonOriginatedAchTransfers.getStatusForDetail(transfer3, resources4);
        } else {
            statusForDetail = null;
        }
        rdsDataRowView4.setValueText(statusForDetail);
        binding.nonOrigAchTransferDetailGranted.setValueText(state.getTransferGrantDateValueText());
        RhTextView nonOrigAchTransferDetailAdditionalInfoTxt = binding.nonOrigAchTransferDetailAdditionalInfoTxt;
        Intrinsics.checkNotNullExpressionValue(nonOrigAchTransferDetailAdditionalInfoTxt, "nonOrigAchTransferDetailAdditionalInfoTxt");
        NonOriginatedAchTransfer transfer4 = state.getTransfer();
        TextViewsKt.setVisibilityText(nonOrigAchTransferDetailAdditionalInfoTxt, transfer4 != null ? transfer4.getRejectionReasonDetail() : null);
        RdsDataRowView rdsDataRowView5 = binding.nonOrigAchTransferDetailInitiated;
        NonOriginatedAchTransfer transfer5 = state.getTransfer();
        rdsDataRowView5.setVisibilityValueText((transfer5 == null || (initiatedAt = transfer5.getInitiatedAt()) == null) ? null : InstantFormatter.MEDIUM_DATE_IN_SYSTEM_ZONE.format((InstantFormatter) initiatedAt));
        RdsDataRowView rdsDataRowView6 = binding.nonOrigAchTransferDetailLastUpdated;
        NonOriginatedAchTransfer transfer6 = state.getTransfer();
        rdsDataRowView6.setVisibilityValueText((transfer6 == null || (updatedAt = transfer6.getUpdatedAt()) == null) ? null : InstantFormatter.MEDIUM_DATE_IN_SYSTEM_ZONE.format((InstantFormatter) updatedAt));
        RdsDataRowView rdsDataRowView7 = binding.nonOrigAchGoldDepositBoostSection;
        GoldDepositBoostTransferDetail goldDepositBoost = state.getGoldDepositBoost();
        rdsDataRowView7.setLabelText(goldDepositBoost != null ? goldDepositBoost.getAmountTitle() : null);
        GoldDepositBoostTransferDetail goldDepositBoost2 = state.getGoldDepositBoost();
        rdsDataRowView7.setValueText(goldDepositBoost2 != null ? goldDepositBoost2.getAmountText() : null);
        GoldDepositBoostTransferDetail goldDepositBoost3 = state.getGoldDepositBoost();
        if (goldDepositBoost3 != null && (detailText = goldDepositBoost3.getDetailText()) != null) {
            rdsDataRowView7.setDescriptionText(getMarkwon().toMarkdown(detailText));
        }
        Integer goldDepositBoostIconRes = state.getGoldDepositBoostIconRes();
        if (goldDepositBoostIconRes != null) {
            int iIntValue = goldDepositBoostIconRes.intValue();
            Intrinsics.checkNotNull(rdsDataRowView7);
            rdsDataRowView7.setValueIconRightDrawable(ViewsKt.getDrawable(rdsDataRowView7, iIntValue));
        }
        Intrinsics.checkNotNull(rdsDataRowView7);
        rdsDataRowView7.setVisibility(state.getIsGoldDepositBoostSectionVisible() ? 0 : 8);
    }

    /* compiled from: NonOriginatedAchTransferDetailFragment.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/history/ui/NonOriginatedAchTransferDetailFragment$Args;", "Landroid/os/Parcelable;", "transferId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getTransferId", "()Ljava/util/UUID;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final UUID transferId;

        /* compiled from: NonOriginatedAchTransferDetailFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.transferId);
        }

        public Args(UUID transferId) {
            Intrinsics.checkNotNullParameter(transferId, "transferId");
            this.transferId = transferId;
        }

        public final UUID getTransferId() {
            return this.transferId;
        }
    }

    /* compiled from: NonOriginatedAchTransferDetailFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/history/ui/NonOriginatedAchTransferDetailFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/history/ui/NonOriginatedAchTransferDetailFragment;", "Lcom/robinhood/android/history/ui/NonOriginatedAchTransferDetailFragment$Args;", "<init>", "()V", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<NonOriginatedAchTransferDetailFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(NonOriginatedAchTransferDetailFragment nonOriginatedAchTransferDetailFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, nonOriginatedAchTransferDetailFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public NonOriginatedAchTransferDetailFragment newInstance(Args args) {
            return (NonOriginatedAchTransferDetailFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(NonOriginatedAchTransferDetailFragment nonOriginatedAchTransferDetailFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, nonOriginatedAchTransferDetailFragment, args);
        }
    }
}
