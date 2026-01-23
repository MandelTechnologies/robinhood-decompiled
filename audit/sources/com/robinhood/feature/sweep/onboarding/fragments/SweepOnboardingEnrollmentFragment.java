package com.robinhood.feature.sweep.onboarding.fragments;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.feature.sweep.onboarding.SweepOnboardingEnrollmentDuxo;
import com.robinhood.feature.sweep.onboarding.SweepOnboardingEnrollmentViewState;
import com.robinhood.feature.sweep.onboarding.fragments.SweepOnboardingEnrollmentFragment;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.resource.StringResource;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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

/* compiled from: SweepOnboardingEnrollmentFragment.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0003\u0014\u0015\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0010\u001a\u00020\u0011H\u0017¢\u0006\u0002\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0011H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/feature/sweep/onboarding/fragments/SweepOnboardingEnrollmentFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/feature/sweep/onboarding/SweepOnboardingEnrollmentDuxo;", "getDuxo", "()Lcom/robinhood/feature/sweep/onboarding/SweepOnboardingEnrollmentDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/feature/sweep/onboarding/fragments/SweepOnboardingEnrollmentFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/feature/sweep/onboarding/fragments/SweepOnboardingEnrollmentFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "onStart", "Callbacks", "Args", "Companion", "feature-sweep-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes15.dex */
public final class SweepOnboardingEnrollmentFragment extends GenericComposeFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(SweepOnboardingEnrollmentFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/feature/sweep/onboarding/fragments/SweepOnboardingEnrollmentFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = OldDuxos.oldDuxo(this, SweepOnboardingEnrollmentDuxo.class);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.feature.sweep.onboarding.fragments.SweepOnboardingEnrollmentFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof SweepOnboardingEnrollmentFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* compiled from: SweepOnboardingEnrollmentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/feature/sweep/onboarding/fragments/SweepOnboardingEnrollmentFragment$Callbacks;", "", "onEnrollSuccess", "", "isWithGold", "", "onEnrollIncomplete", "displayMessage", "", "feature-sweep-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onEnrollIncomplete(String displayMessage);

        void onEnrollSuccess(boolean isWithGold);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(SweepOnboardingEnrollmentFragment sweepOnboardingEnrollmentFragment, int i, Composer composer, int i2) {
        sweepOnboardingEnrollmentFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    private final SweepOnboardingEnrollmentDuxo getDuxo() {
        return (SweepOnboardingEnrollmentDuxo) this.duxo.getValue();
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1339891676);
        if ((i & 1) != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1339891676, i, -1, "com.robinhood.feature.sweep.onboarding.fragments.SweepOnboardingEnrollmentFragment.ComposeContent (SweepOnboardingEnrollmentFragment.kt:30)");
            }
            LoadingScreenComposablesKt.GenericHeroLoadingScreenComposable(WindowInsetsPadding_androidKt.navigationBarsPadding(Modifier.INSTANCE), null, true, true, composerStartRestartGroup, 3456, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.feature.sweep.onboarding.fragments.SweepOnboardingEnrollmentFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SweepOnboardingEnrollmentFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        SweepOnboardingEnrollmentDuxo duxo = getDuxo();
        Companion companion = INSTANCE;
        duxo.enrollSweep(((Args) companion.getArgs((Fragment) this)).getAccountNumber(), ((Args) companion.getArgs((Fragment) this)).isWithGold());
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.feature.sweep.onboarding.fragments.SweepOnboardingEnrollmentFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SweepOnboardingEnrollmentFragment.onStart$lambda$1(this.f$0, (SweepOnboardingEnrollmentViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(SweepOnboardingEnrollmentFragment sweepOnboardingEnrollmentFragment, SweepOnboardingEnrollmentViewState viewState) {
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        if (!Intrinsics.areEqual(viewState, SweepOnboardingEnrollmentViewState.Loading.INSTANCE)) {
            if (viewState instanceof SweepOnboardingEnrollmentViewState.Error) {
                AbsErrorHandler.handleError$default(sweepOnboardingEnrollmentFragment.getActivityErrorHandler(), ((SweepOnboardingEnrollmentViewState.Error) viewState).getThrowable(), false, 2, null);
            } else if (Intrinsics.areEqual(viewState, SweepOnboardingEnrollmentViewState.Success.INSTANCE)) {
                sweepOnboardingEnrollmentFragment.getCallbacks().onEnrollSuccess(((Args) INSTANCE.getArgs((Fragment) sweepOnboardingEnrollmentFragment)).isWithGold());
            } else {
                if (!(viewState instanceof SweepOnboardingEnrollmentViewState.Incomplete)) {
                    throw new NoWhenBranchMatchedException();
                }
                Callbacks callbacks = sweepOnboardingEnrollmentFragment.getCallbacks();
                StringResource displayStatusMessage = ((SweepOnboardingEnrollmentViewState.Incomplete) viewState).getDisplayStatusMessage();
                Resources resources = sweepOnboardingEnrollmentFragment.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                callbacks.onEnrollIncomplete(displayStatusMessage.getText(resources).toString());
            }
        }
        return Unit.INSTANCE;
    }

    /* compiled from: SweepOnboardingEnrollmentFragment.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/feature/sweep/onboarding/fragments/SweepOnboardingEnrollmentFragment$Args;", "Landroid/os/Parcelable;", "isWithGold", "", "accountNumber", "", "<init>", "(ZLjava/lang/String;)V", "()Z", "getAccountNumber", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-sweep-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String accountNumber;
        private final boolean isWithGold;

        /* compiled from: SweepOnboardingEnrollmentFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readInt() != 0, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, boolean z, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                z = args.isWithGold;
            }
            if ((i & 2) != 0) {
                str = args.accountNumber;
            }
            return args.copy(z, str);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsWithGold() {
            return this.isWithGold;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final Args copy(boolean isWithGold, String accountNumber) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            return new Args(isWithGold, accountNumber);
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
            return this.isWithGold == args.isWithGold && Intrinsics.areEqual(this.accountNumber, args.accountNumber);
        }

        public int hashCode() {
            return (Boolean.hashCode(this.isWithGold) * 31) + this.accountNumber.hashCode();
        }

        public String toString() {
            return "Args(isWithGold=" + this.isWithGold + ", accountNumber=" + this.accountNumber + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.isWithGold ? 1 : 0);
            dest.writeString(this.accountNumber);
        }

        public Args(boolean z, String accountNumber) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            this.isWithGold = z;
            this.accountNumber = accountNumber;
        }

        public final boolean isWithGold() {
            return this.isWithGold;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }
    }

    /* compiled from: SweepOnboardingEnrollmentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/feature/sweep/onboarding/fragments/SweepOnboardingEnrollmentFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/feature/sweep/onboarding/fragments/SweepOnboardingEnrollmentFragment;", "Lcom/robinhood/feature/sweep/onboarding/fragments/SweepOnboardingEnrollmentFragment$Args;", "<init>", "()V", "feature-sweep-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<SweepOnboardingEnrollmentFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(SweepOnboardingEnrollmentFragment sweepOnboardingEnrollmentFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, sweepOnboardingEnrollmentFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public SweepOnboardingEnrollmentFragment newInstance(Args args) {
            return (SweepOnboardingEnrollmentFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(SweepOnboardingEnrollmentFragment sweepOnboardingEnrollmentFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, sweepOnboardingEnrollmentFragment, args);
        }
    }
}
