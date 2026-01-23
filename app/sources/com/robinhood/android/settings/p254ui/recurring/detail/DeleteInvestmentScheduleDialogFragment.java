package com.robinhood.android.settings.p254ui.recurring.detail;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.extensions.Contexts7;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.colorscheme.ColorSchemeManager;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.designsystem.style.ColorScheme;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.settings.p254ui.recurring.C28446R;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.recurring.models.api.ApiAssetType;
import com.robinhood.recurring.models.p365db.InvestmentSchedule;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: DeleteInvestmentScheduleDialogFragment.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 #2\u00020\u0001:\u0004 !\"#B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0017H\u0016J\b\u0010\u001b\u001a\u00020\u0017H\u0014J\b\u0010\u001c\u001a\u00020\u0017H\u0014J\u0010\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001fH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/recurring/detail/DeleteInvestmentScheduleDialogFragment;", "Lcom/robinhood/android/common/ui/RhDialogFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/android/settings/ui/recurring/detail/DeleteInvestmentScheduleDialogDuxo;", "getDuxo", "()Lcom/robinhood/android/settings/ui/recurring/detail/DeleteInvestmentScheduleDialogDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/android/settings/ui/recurring/detail/DeleteInvestmentScheduleDialogFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/settings/ui/recurring/detail/DeleteInvestmentScheduleDialogFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "colorSchemeManager", "Lcom/robinhood/android/designsystem/colorscheme/ColorSchemeManager;", "getColorSchemeManager", "()Lcom/robinhood/android/designsystem/colorscheme/ColorSchemeManager;", "setColorSchemeManager", "(Lcom/robinhood/android/designsystem/colorscheme/ColorSchemeManager;)V", "onAttach", "", "context", "Landroid/content/Context;", "onStart", "onPositiveButtonClick", "onNegativeButtonClick", "setState", "state", "Lcom/robinhood/android/settings/ui/recurring/detail/DeleteInvestmentScheduleDialogViewState;", "Callbacks", "Args", "Builder", "Companion", "feature-recurring-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class DeleteInvestmentScheduleDialogFragment extends RhDialogFragment {
    public ColorSchemeManager colorSchemeManager;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(DeleteInvestmentScheduleDialogFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/settings/ui/recurring/detail/DeleteInvestmentScheduleDialogFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = OldDuxos.oldDuxo(this, DeleteInvestmentScheduleDialogDuxo.class);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.settings.ui.recurring.detail.DeleteInvestmentScheduleDialogFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });

    /* compiled from: DeleteInvestmentScheduleDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/recurring/detail/DeleteInvestmentScheduleDialogFragment$Callbacks;", "", "onInvestmentScheduleDeleted", "", "feature-recurring-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onInvestmentScheduleDeleted();
    }

    /* compiled from: DeleteInvestmentScheduleDialogFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiAssetType.values().length];
            try {
                iArr[ApiAssetType.BROKERAGE_CASH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiAssetType.CRYPTO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiAssetType.EQUITY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ApiAssetType.TOKENIZED_STOCK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final DeleteInvestmentScheduleDialogDuxo getDuxo() {
        return (DeleteInvestmentScheduleDialogDuxo) this.duxo.getValue();
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    public final ColorSchemeManager getColorSchemeManager() {
        ColorSchemeManager colorSchemeManager = this.colorSchemeManager;
        if (colorSchemeManager != null) {
            return colorSchemeManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("colorSchemeManager");
        return null;
    }

    public final void setColorSchemeManager(ColorSchemeManager colorSchemeManager) {
        Intrinsics.checkNotNullParameter(colorSchemeManager, "<set-?>");
        this.colorSchemeManager = colorSchemeManager;
    }

    @Override // com.robinhood.android.common.p088ui.RhDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, com.robinhood.hammer.android.fragment.HammerDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        Companion companion = INSTANCE;
        if (((Args) companion.getArgs((Fragment) this)).getFromInsights()) {
            final ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
            putDesignSystemOverlay(scarletContextWrapper);
            ScarletManager scarletManager = ScarletManager2.getScarletManager(scarletContextWrapper);
            AchromaticOverlay achromaticOverlay = AchromaticOverlay.INSTANCE;
            ScarletManager.putOverlay$default(scarletManager, achromaticOverlay, null, 2, null);
            LifecycleHost.DefaultImpls.bind$default(this, Contexts7.requireBaseActivityBaseContext(scarletContextWrapper).getDayNightStyleChanges(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.settings.ui.recurring.detail.DeleteInvestmentScheduleDialogFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DeleteInvestmentScheduleDialogFragment.onAttach$lambda$2$lambda$0(scarletContextWrapper, (DayNightOverlay) obj);
                }
            });
            LifecycleHost.DefaultImpls.bind$default(this, getColorSchemeManager().getChanges(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.settings.ui.recurring.detail.DeleteInvestmentScheduleDialogFragment$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DeleteInvestmentScheduleDialogFragment.onAttach$lambda$2$lambda$1(scarletContextWrapper, (Tuples2) obj);
                }
            });
            int i = WhenMappings.$EnumSwitchMapping$0[((Args) companion.getArgs((Fragment) this)).getInvestmentSchedule().getInvestmentTarget().getTargetType().ordinal()];
            if (i == 1) {
                ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(scarletContextWrapper), achromaticOverlay, null, 2, null);
            } else if (i != 2 && i != 3 && i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            setScarletContextWrapper(scarletContextWrapper);
            return;
        }
        ScarletContextWrapper scarletContextWrapper2 = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper2);
        int i2 = WhenMappings.$EnumSwitchMapping$0[((Args) companion.getArgs((Fragment) this)).getInvestmentSchedule().getInvestmentTarget().getTargetType().ordinal()];
        if (i2 == 1) {
            ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(scarletContextWrapper2), AchromaticOverlay.INSTANCE, null, 2, null);
        } else if (i2 != 2 && i2 != 3 && i2 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        setScarletContextWrapper(scarletContextWrapper2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttach$lambda$2$lambda$0(ScarletContextWrapper scarletContextWrapper, DayNightOverlay dayNightOverlay) {
        Intrinsics.checkNotNullParameter(dayNightOverlay, "dayNightOverlay");
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(scarletContextWrapper), dayNightOverlay, null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttach$lambda$2$lambda$1(ScarletContextWrapper scarletContextWrapper, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        ScarletManager2.getScarletManager(scarletContextWrapper).putOverlay((ColorScheme) tuples2.component1(), Boolean.valueOf(!((Boolean) tuples2.component2()).booleanValue()));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C284491(this));
    }

    /* compiled from: DeleteInvestmentScheduleDialogFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.settings.ui.recurring.detail.DeleteInvestmentScheduleDialogFragment$onStart$1 */
    /* synthetic */ class C284491 extends FunctionReferenceImpl implements Function1<DeleteInvestmentScheduleDialogViewState, Unit> {
        C284491(Object obj) {
            super(1, obj, DeleteInvestmentScheduleDialogFragment.class, "setState", "setState(Lcom/robinhood/android/settings/ui/recurring/detail/DeleteInvestmentScheduleDialogViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DeleteInvestmentScheduleDialogViewState deleteInvestmentScheduleDialogViewState) {
            invoke2(deleteInvestmentScheduleDialogViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DeleteInvestmentScheduleDialogViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((DeleteInvestmentScheduleDialogFragment) this.receiver).setState(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.RhDialogFragment
    protected void onPositiveButtonClick() {
        getDuxo().deleteInvestmentSchedule();
    }

    @Override // com.robinhood.android.common.p088ui.RhDialogFragment
    protected void onNegativeButtonClick() {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setState(DeleteInvestmentScheduleDialogViewState state) {
        TextView positiveBtn = getPositiveBtn();
        RdsButton rdsButton = positiveBtn instanceof RdsButton ? (RdsButton) positiveBtn : null;
        if (rdsButton != null) {
            rdsButton.setLoading(state.isLoading());
        }
        UiEvent<Unit> investmentScheduleDeletedEvent = state.getInvestmentScheduleDeletedEvent();
        if (investmentScheduleDeletedEvent != null) {
            investmentScheduleDeletedEvent.consumeWith(new Function1() { // from class: com.robinhood.android.settings.ui.recurring.detail.DeleteInvestmentScheduleDialogFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DeleteInvestmentScheduleDialogFragment.setState$lambda$4(this.f$0, (Unit) obj);
                }
            });
        }
        UiEvent<Throwable> toggleErrorEvent = state.getToggleErrorEvent();
        if (toggleErrorEvent != null) {
            toggleErrorEvent.consumeWith(new Function1() { // from class: com.robinhood.android.settings.ui.recurring.detail.DeleteInvestmentScheduleDialogFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DeleteInvestmentScheduleDialogFragment.setState$lambda$5(this.f$0, (Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setState$lambda$4(DeleteInvestmentScheduleDialogFragment deleteInvestmentScheduleDialogFragment, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        deleteInvestmentScheduleDialogFragment.dismiss();
        deleteInvestmentScheduleDialogFragment.getCallbacks().onInvestmentScheduleDeleted();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setState$lambda$5(DeleteInvestmentScheduleDialogFragment deleteInvestmentScheduleDialogFragment, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        deleteInvestmentScheduleDialogFragment.dismiss();
        AbsErrorHandler.handleError$default(Fragments2.getActivityErrorHandler(deleteInvestmentScheduleDialogFragment), it, false, 2, null);
        return Unit.INSTANCE;
    }

    /* compiled from: DeleteInvestmentScheduleDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/recurring/detail/DeleteInvestmentScheduleDialogFragment$Args;", "Landroid/os/Parcelable;", "investmentSchedule", "Lcom/robinhood/recurring/models/db/InvestmentSchedule;", "fromInsights", "", "<init>", "(Lcom/robinhood/recurring/models/db/InvestmentSchedule;Z)V", "getInvestmentSchedule", "()Lcom/robinhood/recurring/models/db/InvestmentSchedule;", "getFromInsights", "()Z", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-recurring-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final boolean fromInsights;
        private final InvestmentSchedule investmentSchedule;

        /* compiled from: DeleteInvestmentScheduleDialogFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((InvestmentSchedule) parcel.readParcelable(Args.class.getClassLoader()), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, InvestmentSchedule investmentSchedule, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                investmentSchedule = args.investmentSchedule;
            }
            if ((i & 2) != 0) {
                z = args.fromInsights;
            }
            return args.copy(investmentSchedule, z);
        }

        /* renamed from: component1, reason: from getter */
        public final InvestmentSchedule getInvestmentSchedule() {
            return this.investmentSchedule;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getFromInsights() {
            return this.fromInsights;
        }

        public final Args copy(InvestmentSchedule investmentSchedule, boolean fromInsights) {
            Intrinsics.checkNotNullParameter(investmentSchedule, "investmentSchedule");
            return new Args(investmentSchedule, fromInsights);
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
            return Intrinsics.areEqual(this.investmentSchedule, args.investmentSchedule) && this.fromInsights == args.fromInsights;
        }

        public int hashCode() {
            return (this.investmentSchedule.hashCode() * 31) + Boolean.hashCode(this.fromInsights);
        }

        public String toString() {
            return "Args(investmentSchedule=" + this.investmentSchedule + ", fromInsights=" + this.fromInsights + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.investmentSchedule, flags);
            dest.writeInt(this.fromInsights ? 1 : 0);
        }

        public Args(InvestmentSchedule investmentSchedule, boolean z) {
            Intrinsics.checkNotNullParameter(investmentSchedule, "investmentSchedule");
            this.investmentSchedule = investmentSchedule;
            this.fromInsights = z;
        }

        public final InvestmentSchedule getInvestmentSchedule() {
            return this.investmentSchedule;
        }

        public final boolean getFromInsights() {
            return this.fromInsights;
        }
    }

    /* compiled from: DeleteInvestmentScheduleDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/recurring/detail/DeleteInvestmentScheduleDialogFragment$Builder;", "Lcom/robinhood/android/common/ui/RhDialogFragment$Builder;", "args", "Lcom/robinhood/android/settings/ui/recurring/detail/DeleteInvestmentScheduleDialogFragment$Args;", "context", "Landroid/content/Context;", "<init>", "(Lcom/robinhood/android/settings/ui/recurring/detail/DeleteInvestmentScheduleDialogFragment$Args;Landroid/content/Context;)V", "createDialogFragment", "Lcom/robinhood/android/common/ui/RhDialogFragment;", "feature-recurring-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class Builder extends RhDialogFragment.Builder {
        private final Args args;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(Args args, Context context) {
            super(context);
            Intrinsics.checkNotNullParameter(args, "args");
            Intrinsics.checkNotNullParameter(context, "context");
            this.args = args;
        }

        @Override // com.robinhood.android.common.ui.RhDialogFragment.Builder
        protected RhDialogFragment createDialogFragment() {
            return (RhDialogFragment) DeleteInvestmentScheduleDialogFragment.INSTANCE.newInstance((Parcelable) this.args);
        }
    }

    /* compiled from: DeleteInvestmentScheduleDialogFragment.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J>\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/recurring/detail/DeleteInvestmentScheduleDialogFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/settings/ui/recurring/detail/DeleteInvestmentScheduleDialogFragment;", "Lcom/robinhood/android/settings/ui/recurring/detail/DeleteInvestmentScheduleDialogFragment$Args;", "<init>", "()V", "show", "", "args", "context", "Landroid/content/Context;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "title", "", "message", "positiveButton", "negativeButton", "feature-recurring-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<DeleteInvestmentScheduleDialogFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(DeleteInvestmentScheduleDialogFragment deleteInvestmentScheduleDialogFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, deleteInvestmentScheduleDialogFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public DeleteInvestmentScheduleDialogFragment newInstance(Args args) {
            return (DeleteInvestmentScheduleDialogFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(DeleteInvestmentScheduleDialogFragment deleteInvestmentScheduleDialogFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, deleteInvestmentScheduleDialogFragment, args);
        }

        public final void show(Args args, Context context, FragmentManager fragmentManager, String title, String message, String positiveButton, String negativeButton) {
            Intrinsics.checkNotNullParameter(args, "args");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(positiveButton, "positiveButton");
            Intrinsics.checkNotNullParameter(negativeButton, "negativeButton");
            RhDialogFragment.Builder.show$default(new Builder(args, context).setTitle(title).setMessage(message).setLayoutRes(C28446R.layout.dialog_confirm_investment_schedule_delete).setUseDesignSystemOverlay(true).setPositiveButton(positiveButton).setNegativeButton(negativeButton), fragmentManager, "deleteInvestmentScheduleDialog", false, 4, null);
        }
    }
}
