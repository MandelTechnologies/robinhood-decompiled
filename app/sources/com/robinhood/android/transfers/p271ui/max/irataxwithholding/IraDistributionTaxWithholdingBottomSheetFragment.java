package com.robinhood.android.transfers.p271ui.max.irataxwithholding;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import com.robinhood.android.models.retirement.api.transfers.ApiIraDistributionTaxWithholding;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.RetirementRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.transfers.p271ui.max.irataxwithholding.EditIraDistributionTaxWithholdingActivity;
import com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import io.noties.markwon.Markwon;
import java.math.BigDecimal;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: IraDistributionTaxWithholdingBottomSheetFragment.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 &2\u00020\u00012\u00020\u00022\u00020\u0003:\u0003$%&B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0016\u001a\u00020\u0017H\u0017¢\u0006\u0002\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0014H\u0016J\b\u0010\u001b\u001a\u00020\u0017H\u0016J\b\u0010\u001c\u001a\u00020\u0017H\u0016J\t\u0010\u001d\u001a\u00020\u001eH\u0096\u0001R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0012\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00140\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/irataxwithholding/IraDistributionTaxWithholdingBottomSheetFragment;", "Lcom/robinhood/compose/app/GenericComposeBottomSheetDialogFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/transfers/ui/max/irataxwithholding/IraDistributionTaxWithholdingCallbacks;", "<init>", "()V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "callbacks", "Lcom/robinhood/android/transfers/ui/max/irataxwithholding/IraDistributionTaxWithholdingBottomSheetFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/transfers/ui/max/irataxwithholding/IraDistributionTaxWithholdingBottomSheetFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "editIraDistributionTaxWithholdingLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/robinhood/android/transfers/ui/max/irataxwithholding/EditIraDistributionTaxWithholdingLaunchMode;", "kotlin.jvm.PlatformType", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "onLaunchEditWithholding", "mode", "onDoneClicked", "onEditWithdrawalAmountClicked", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Args", "Companion", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class IraDistributionTaxWithholdingBottomSheetFragment extends GenericComposeBottomSheetDialogFragment implements RegionGated, IraDistributionTaxWithholdingBottomSheet3 {
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(RetirementRegionGate.INSTANCE);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.transfers.ui.max.irataxwithholding.IraDistributionTaxWithholdingBottomSheetFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });
    private final ActivityResultLauncher<EditIraDistributionTaxWithholdingLaunchMode> editIraDistributionTaxWithholdingLauncher;
    public Markwon markwon;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(IraDistributionTaxWithholdingBottomSheetFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/transfers/ui/max/irataxwithholding/IraDistributionTaxWithholdingBottomSheetFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: IraDistributionTaxWithholdingBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\u0003H&¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/irataxwithholding/IraDistributionTaxWithholdingBottomSheetFragment$Callbacks;", "", "onEditIraDistributionTaxWithholding", "", "federalWithholdingPercent", "Ljava/math/BigDecimal;", "stateWithholdingPercent", "onEditIraDistributionWithdrawalAmount", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onEditIraDistributionTaxWithholding(BigDecimal federalWithholdingPercent, BigDecimal stateWithholdingPercent);

        void onEditIraDistributionWithdrawalAmount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(IraDistributionTaxWithholdingBottomSheetFragment iraDistributionTaxWithholdingBottomSheetFragment, int i, Composer composer, int i2) {
        iraDistributionTaxWithholdingBottomSheetFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public IraDistributionTaxWithholdingBottomSheetFragment() {
        ActivityResultLauncher<EditIraDistributionTaxWithholdingLaunchMode> activityResultLauncherRegisterForActivityResult = registerForActivityResult(EditIraDistributionTaxWithholdingActivity.ResultContract.INSTANCE, new ActivityResultCallback() { // from class: com.robinhood.android.transfers.ui.max.irataxwithholding.IraDistributionTaxWithholdingBottomSheetFragment$editIraDistributionTaxWithholdingLauncher$1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(EditIraDistributionTaxWithholdingResult editIraDistributionTaxWithholdingResult) {
                if (editIraDistributionTaxWithholdingResult != null) {
                    this.this$0.getCallbacks().onEditIraDistributionTaxWithholding(editIraDistributionTaxWithholdingResult.getFederalWithholdingPercent(), editIraDistributionTaxWithholdingResult.getStateWithholdingPercent());
                    this.this$0.dismiss();
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.editIraDistributionTaxWithholdingLauncher = activityResultLauncherRegisterForActivityResult;
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

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1608984657);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1608984657, i2, -1, "com.robinhood.android.transfers.ui.max.irataxwithholding.IraDistributionTaxWithholdingBottomSheetFragment.ComposeContent (IraDistributionTaxWithholdingBottomSheetFragment.kt:49)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-818065158, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.max.irataxwithholding.IraDistributionTaxWithholdingBottomSheetFragment.ComposeContent.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-818065158, i3, -1, "com.robinhood.android.transfers.ui.max.irataxwithholding.IraDistributionTaxWithholdingBottomSheetFragment.ComposeContent.<anonymous> (IraDistributionTaxWithholdingBottomSheetFragment.kt:51)");
                    }
                    Companion companion = IraDistributionTaxWithholdingBottomSheetFragment.INSTANCE;
                    IraDistributionTaxWithholdingBottomSheet2.IraDistributionTaxWithholdingBottomSheet(null, ((Args) companion.getArgs((Fragment) IraDistributionTaxWithholdingBottomSheetFragment.this)).getCalculateTaxWithholding(), ((Args) companion.getArgs((Fragment) IraDistributionTaxWithholdingBottomSheetFragment.this)).getUseManagedAccountDisplay(), IraDistributionTaxWithholdingBottomSheetFragment.this, composer2, 0, 1);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.ui.max.irataxwithholding.IraDistributionTaxWithholdingBottomSheetFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return IraDistributionTaxWithholdingBottomSheetFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.android.transfers.p271ui.max.irataxwithholding.IraDistributionTaxWithholdingBottomSheet3
    public void onLaunchEditWithholding(EditIraDistributionTaxWithholdingLaunchMode mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.editIraDistributionTaxWithholdingLauncher.launch(mode);
    }

    @Override // com.robinhood.android.transfers.p271ui.max.irataxwithholding.IraDistributionTaxWithholdingBottomSheet3
    public void onDoneClicked() {
        dismiss();
    }

    @Override // com.robinhood.android.transfers.p271ui.max.irataxwithholding.IraDistributionTaxWithholdingBottomSheet3
    public void onEditWithdrawalAmountClicked() {
        dismiss();
        getCallbacks().onEditIraDistributionWithdrawalAmount();
    }

    /* compiled from: IraDistributionTaxWithholdingBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/irataxwithholding/IraDistributionTaxWithholdingBottomSheetFragment$Args;", "Landroid/os/Parcelable;", "calculateTaxWithholding", "Lcom/robinhood/android/models/retirement/api/transfers/ApiIraDistributionTaxWithholding;", "useManagedAccountDisplay", "", "<init>", "(Lcom/robinhood/android/models/retirement/api/transfers/ApiIraDistributionTaxWithholding;Z)V", "getCalculateTaxWithholding", "()Lcom/robinhood/android/models/retirement/api/transfers/ApiIraDistributionTaxWithholding;", "getUseManagedAccountDisplay", "()Z", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final ApiIraDistributionTaxWithholding calculateTaxWithholding;
        private final boolean useManagedAccountDisplay;

        /* compiled from: IraDistributionTaxWithholdingBottomSheetFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((ApiIraDistributionTaxWithholding) parcel.readParcelable(Args.class.getClassLoader()), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, ApiIraDistributionTaxWithholding apiIraDistributionTaxWithholding, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                apiIraDistributionTaxWithholding = args.calculateTaxWithholding;
            }
            if ((i & 2) != 0) {
                z = args.useManagedAccountDisplay;
            }
            return args.copy(apiIraDistributionTaxWithholding, z);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiIraDistributionTaxWithholding getCalculateTaxWithholding() {
            return this.calculateTaxWithholding;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getUseManagedAccountDisplay() {
            return this.useManagedAccountDisplay;
        }

        public final Args copy(ApiIraDistributionTaxWithholding calculateTaxWithholding, boolean useManagedAccountDisplay) {
            Intrinsics.checkNotNullParameter(calculateTaxWithholding, "calculateTaxWithholding");
            return new Args(calculateTaxWithholding, useManagedAccountDisplay);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return Intrinsics.areEqual(this.calculateTaxWithholding, args.calculateTaxWithholding) && this.useManagedAccountDisplay == args.useManagedAccountDisplay;
        }

        public int hashCode() {
            return (this.calculateTaxWithholding.hashCode() * 31) + Boolean.hashCode(this.useManagedAccountDisplay);
        }

        public String toString() {
            return "Args(calculateTaxWithholding=" + this.calculateTaxWithholding + ", useManagedAccountDisplay=" + this.useManagedAccountDisplay + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.calculateTaxWithholding, flags);
            dest.writeInt(this.useManagedAccountDisplay ? 1 : 0);
        }

        public Args(ApiIraDistributionTaxWithholding calculateTaxWithholding, boolean z) {
            Intrinsics.checkNotNullParameter(calculateTaxWithholding, "calculateTaxWithholding");
            this.calculateTaxWithholding = calculateTaxWithholding;
            this.useManagedAccountDisplay = z;
        }

        public final ApiIraDistributionTaxWithholding getCalculateTaxWithholding() {
            return this.calculateTaxWithholding;
        }

        public final boolean getUseManagedAccountDisplay() {
            return this.useManagedAccountDisplay;
        }
    }

    /* compiled from: IraDistributionTaxWithholdingBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/irataxwithholding/IraDistributionTaxWithholdingBottomSheetFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/transfers/ui/max/irataxwithholding/IraDistributionTaxWithholdingBottomSheetFragment;", "Lcom/robinhood/android/transfers/ui/max/irataxwithholding/IraDistributionTaxWithholdingBottomSheetFragment$Args;", "<init>", "()V", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<IraDistributionTaxWithholdingBottomSheetFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(IraDistributionTaxWithholdingBottomSheetFragment iraDistributionTaxWithholdingBottomSheetFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, iraDistributionTaxWithholdingBottomSheetFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public IraDistributionTaxWithholdingBottomSheetFragment newInstance(Args args) {
            return (IraDistributionTaxWithholdingBottomSheetFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(IraDistributionTaxWithholdingBottomSheetFragment iraDistributionTaxWithholdingBottomSheetFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, iraDistributionTaxWithholdingBottomSheetFragment, args);
        }
    }
}
