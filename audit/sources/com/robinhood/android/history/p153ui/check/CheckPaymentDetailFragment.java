package com.robinhood.android.history.p153ui.check;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import com.jakewharton.rxbinding3.view.RxView;
import com.jakewharton.rxbinding3.view.ViewScrollChangeEvent;
import com.robinhood.android.common.p088ui.BindResourcesKt;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.row.RdsDataRowView;
import com.robinhood.android.designsystem.style.ThemeAttributes;
import com.robinhood.android.designsystem.text.ThemableColorSpans3;
import com.robinhood.android.history.C18359R;
import com.robinhood.android.history.databinding.FragmentCheckPaymentDetailBinding;
import com.robinhood.android.history.p153ui.BaseDetailFragment;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.p320db.mcduckling.p321ui.UiCheckPaymentDetails;
import com.robinhood.models.util.Money;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.scarlet.util.resource.ResourceReferences5;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: CheckPaymentDetailFragment.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 )2\u00020\u0001:\u0002()B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010#\u001a\u00020\u001eH\u0016J\u0010\u0010$\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020&H\u0002J\b\u0010'\u001a\u00020\u001eH\u0002R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001a\u0010\u001b¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/history/ui/check/CheckPaymentDetailFragment;", "Lcom/robinhood/android/history/ui/BaseDetailFragment;", "<init>", "()V", "revealTransitionName", "", "getRevealTransitionName", "()Ljava/lang/String;", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "duxo", "Lcom/robinhood/android/history/ui/check/CheckPaymentDetailDuxo;", "getDuxo", "()Lcom/robinhood/android/history/ui/check/CheckPaymentDetailDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/history/databinding/FragmentCheckPaymentDetailBinding;", "getBinding", "()Lcom/robinhood/android/history/databinding/FragmentCheckPaymentDetailBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "cancelButtonElevation", "", "getCancelButtonElevation", "()F", "cancelButtonElevation$delegate", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "bindCheckDetails", "state", "Lcom/robinhood/android/history/ui/check/CheckPaymentDetailViewState;", "elevateBottomButton", "Args", "Companion", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class CheckPaymentDetailFragment extends BaseDetailFragment {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: cancelButtonElevation$delegate, reason: from kotlin metadata */
    private final Interfaces2 cancelButtonElevation;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private final boolean useDesignSystemToolbar;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(CheckPaymentDetailFragment.class, "binding", "getBinding()Lcom/robinhood/android/history/databinding/FragmentCheckPaymentDetailBinding;", 0)), Reflection.property1(new PropertyReference1Impl(CheckPaymentDetailFragment.class, "cancelButtonElevation", "getCancelButtonElevation()F", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public CheckPaymentDetailFragment() {
        super(C18359R.layout.fragment_check_payment_detail);
        this.useDesignSystemToolbar = true;
        this.duxo = OldDuxos.oldDuxo(this, CheckPaymentDetailDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, CheckPaymentDetailFragment2.INSTANCE);
        this.cancelButtonElevation = BindResourcesKt.bindDimen(this, C13997R.dimen.rds_elevation_loose);
    }

    @Override // com.robinhood.android.history.p153ui.BaseDetailFragment
    public String getRevealTransitionName() {
        String string2 = ((LegacyFragmentKey.CheckPaymentDetail) INSTANCE.getArgs((Fragment) this)).getCheckId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    @Override // com.robinhood.android.history.p153ui.BaseDetailFragment, com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    private final CheckPaymentDetailDuxo getDuxo() {
        return (CheckPaymentDetailDuxo) this.duxo.getValue();
    }

    private final FragmentCheckPaymentDetailBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentCheckPaymentDetailBinding) value;
    }

    private final float getCancelButtonElevation() {
        return ((Number) this.cancelButtonElevation.getValue(this, $$delegatedProperties[1])).floatValue();
    }

    @Override // com.robinhood.android.history.p153ui.BaseDetailFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getExpandedToolbarTitleTxt().setText(C18359R.string.check_payment_primary_title);
        setScrollViewForToolbarScrollAnimator(getBinding().scrollView);
        NestedScrollView scrollView = getBinding().scrollView;
        Intrinsics.checkNotNullExpressionValue(scrollView, "scrollView");
        LifecycleHost.DefaultImpls.bind$default(this, RxView.layoutChanges(scrollView), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.history.ui.check.CheckPaymentDetailFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CheckPaymentDetailFragment.onViewCreated$lambda$0(this.f$0, (Unit) obj);
            }
        });
        NestedScrollView scrollView2 = getBinding().scrollView;
        Intrinsics.checkNotNullExpressionValue(scrollView2, "scrollView");
        LifecycleHost.DefaultImpls.bind$default(this, RxView.scrollChangeEvents(scrollView2), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.history.ui.check.CheckPaymentDetailFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CheckPaymentDetailFragment.onViewCreated$lambda$1(this.f$0, (ViewScrollChangeEvent) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(CheckPaymentDetailFragment checkPaymentDetailFragment, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        checkPaymentDetailFragment.elevateBottomButton();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(CheckPaymentDetailFragment checkPaymentDetailFragment, ViewScrollChangeEvent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        checkPaymentDetailFragment.elevateBottomButton();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C184291(this));
    }

    /* compiled from: CheckPaymentDetailFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.history.ui.check.CheckPaymentDetailFragment$onStart$1 */
    /* synthetic */ class C184291 extends FunctionReferenceImpl implements Function1<CheckPaymentDetailViewState, Unit> {
        C184291(Object obj) {
            super(1, obj, CheckPaymentDetailFragment.class, "bindCheckDetails", "bindCheckDetails(Lcom/robinhood/android/history/ui/check/CheckPaymentDetailViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CheckPaymentDetailViewState checkPaymentDetailViewState) {
            invoke2(checkPaymentDetailViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CheckPaymentDetailViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((CheckPaymentDetailFragment) this.receiver).bindCheckDetails(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindCheckDetails(CheckPaymentDetailViewState state) {
        final CheckPaymentDetailFragment checkPaymentDetailFragment;
        Throwable thConsume;
        ResourceReferences4 color_foreground_1;
        final UiCheckPaymentDetails checkDetails = state.getCheckDetails();
        if (checkDetails != null) {
            FragmentCheckPaymentDetailBinding binding = getBinding();
            if (checkDetails.getCheckPayment().isNegative()) {
                color_foreground_1 = ResourceReferences5.toColor(ThemeAttributes.INSTANCE.getCOLOR_NEGATIVE());
            } else {
                color_foreground_1 = ThemeAttributes.INSTANCE.getCOLOR_FOREGROUND_1();
            }
            RdsDataRowView rdsDataRowView = binding.checkPaymentDetailStatus;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            ThemableColorSpans3 themableColorSpans3 = new ThemableColorSpans3(color_foreground_1);
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) checkDetails.getCheckPayment().getStatus());
            spannableStringBuilder.setSpan(themableColorSpans3, length, spannableStringBuilder.length(), 17);
            rdsDataRowView.setValueText(new SpannedString(spannableStringBuilder));
            binding.checkPaymentDetailStatus.setDescriptionText(state.getStatusMessage());
            binding.checkPaymentDetailRecipient.setValueText(checkDetails.getCheckPayee().getName());
            binding.checkPaymentDetailMailingAddress.setValueText(checkDetails.getCheckPayee().getMailingAddress());
            binding.checkPaymentDetailAmount.setValueText(Money.format$default(checkDetails.getCheckPayment().getAmount(), null, false, null, false, 0, null, false, null, false, false, 1023, null));
            binding.checkPaymentDetailSubmitted.setValueText(state.getSubmittedDate());
            binding.checkPaymentDetailEstimatedDates.setValueText(state.getEstimatedDate());
            RdsDataRowView checkPaymentDetailEstimatedDates = binding.checkPaymentDetailEstimatedDates;
            Intrinsics.checkNotNullExpressionValue(checkPaymentDetailEstimatedDates, "checkPaymentDetailEstimatedDates");
            checkPaymentDetailEstimatedDates.setVisibility(state.isEstimatedDateVisible() ? 0 : 8);
            binding.checkPaymentDetailMemo.setValueText(checkDetails.getCheckPayment().getMemo());
            RdsDataRowView checkPaymentDetailMemo = binding.checkPaymentDetailMemo;
            Intrinsics.checkNotNullExpressionValue(checkPaymentDetailMemo, "checkPaymentDetailMemo");
            checkPaymentDetailMemo.setVisibility(state.isMemoVisible() ? 0 : 8);
            FrameLayout checkPaymentDetailCancelContainer = binding.checkPaymentDetailCancelContainer;
            Intrinsics.checkNotNullExpressionValue(checkPaymentDetailCancelContainer, "checkPaymentDetailCancelContainer");
            checkPaymentDetailCancelContainer.setVisibility(checkDetails.getCheckPayment().isCancelable() ? 0 : 8);
            binding.checkPaymentDetailCancel.setLoading(state.isLoading());
            RdsButton checkPaymentDetailCancel = binding.checkPaymentDetailCancel;
            Intrinsics.checkNotNullExpressionValue(checkPaymentDetailCancel, "checkPaymentDetailCancel");
            checkPaymentDetailFragment = this;
            OnClickListeners.onClick(checkPaymentDetailCancel, new Function0() { // from class: com.robinhood.android.history.ui.check.CheckPaymentDetailFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CheckPaymentDetailFragment.bindCheckDetails$lambda$5$lambda$4(this.f$0, checkDetails);
                }
            });
            checkPaymentDetailFragment.elevateBottomButton();
        } else {
            checkPaymentDetailFragment = this;
        }
        UiEvent<Throwable> error = state.getError();
        if (error == null || (thConsume = error.consume()) == null) {
            return;
        }
        AbsErrorHandler.handleError$default(checkPaymentDetailFragment.getActivityErrorHandler(), thConsume, false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindCheckDetails$lambda$5$lambda$4(CheckPaymentDetailFragment checkPaymentDetailFragment, UiCheckPaymentDetails uiCheckPaymentDetails) {
        checkPaymentDetailFragment.getDuxo().cancelCheck(uiCheckPaymentDetails.getCheckPayment().getId());
        return Unit.INSTANCE;
    }

    private final void elevateBottomButton() {
        float cancelButtonElevation;
        boolean zCanScrollVertically = getBinding().scrollView.canScrollVertically(1);
        if (zCanScrollVertically) {
            cancelButtonElevation = getCancelButtonElevation();
        } else {
            if (zCanScrollVertically) {
                throw new NoWhenBranchMatchedException();
            }
            cancelButtonElevation = 0.0f;
        }
        getBinding().checkPaymentDetailCancelContainer.setElevation(cancelButtonElevation);
    }

    /* compiled from: CheckPaymentDetailFragment.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/history/ui/check/CheckPaymentDetailFragment$Args;", "Landroid/os/Parcelable;", "checkId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getCheckId", "()Ljava/util/UUID;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final UUID checkId;

        /* compiled from: CheckPaymentDetailFragment.kt */
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

        public static /* synthetic */ Args copy$default(Args args, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = args.checkId;
            }
            return args.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getCheckId() {
            return this.checkId;
        }

        public final Args copy(UUID checkId) {
            Intrinsics.checkNotNullParameter(checkId, "checkId");
            return new Args(checkId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Args) && Intrinsics.areEqual(this.checkId, ((Args) other).checkId);
        }

        public int hashCode() {
            return this.checkId.hashCode();
        }

        public String toString() {
            return "Args(checkId=" + this.checkId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.checkId);
        }

        public Args(UUID checkId) {
            Intrinsics.checkNotNullParameter(checkId, "checkId");
            this.checkId = checkId;
        }

        public final UUID getCheckId() {
            return this.checkId;
        }
    }

    /* compiled from: CheckPaymentDetailFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/history/ui/check/CheckPaymentDetailFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/history/ui/check/CheckPaymentDetailFragment;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$CheckPaymentDetail;", "<init>", "()V", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<CheckPaymentDetailFragment, LegacyFragmentKey.CheckPaymentDetail> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyFragmentKey.CheckPaymentDetail checkPaymentDetail) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, checkPaymentDetail);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyFragmentKey.CheckPaymentDetail getArgs(CheckPaymentDetailFragment checkPaymentDetailFragment) {
            return (LegacyFragmentKey.CheckPaymentDetail) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, checkPaymentDetailFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public CheckPaymentDetailFragment newInstance(LegacyFragmentKey.CheckPaymentDetail checkPaymentDetail) {
            return (CheckPaymentDetailFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, checkPaymentDetail);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(CheckPaymentDetailFragment checkPaymentDetailFragment, LegacyFragmentKey.CheckPaymentDetail checkPaymentDetail) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, checkPaymentDetailFragment, checkPaymentDetail);
        }
    }
}
