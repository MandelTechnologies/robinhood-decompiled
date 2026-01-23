package com.robinhood.android.margin.upgrade.jointaccounts;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.margin.upgrade.jointaccounts.MarginUpgradeJointAccountCoOwnerValidationFragment;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: MarginUpgradeJointAccountCoOwnerValidationFragment.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0003\u0010\u0011\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\r\u0010\u000e\u001a\u00020\u000bH\u0017¢\u0006\u0002\u0010\u000fR\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/jointaccounts/MarginUpgradeJointAccountCoOwnerValidationFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/margin/upgrade/jointaccounts/MarginUpgradeJointAccountCoOwnerValidationFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/margin/upgrade/jointaccounts/MarginUpgradeJointAccountCoOwnerValidationFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "Callbacks", "Args", "Companion", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class MarginUpgradeJointAccountCoOwnerValidationFragment extends GenericComposeFragment {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.margin.upgrade.jointaccounts.MarginUpgradeJointAccountCoOwnerValidationFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof MarginUpgradeJointAccountCoOwnerValidationFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(MarginUpgradeJointAccountCoOwnerValidationFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/margin/upgrade/jointaccounts/MarginUpgradeJointAccountCoOwnerValidationFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: MarginUpgradeJointAccountCoOwnerValidationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/jointaccounts/MarginUpgradeJointAccountCoOwnerValidationFragment$Callbacks;", "", "onCoOwnerQuestionnaireInvestorProfileValidated", "", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onCoOwnerQuestionnaireInvestorProfileValidated();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(MarginUpgradeJointAccountCoOwnerValidationFragment marginUpgradeJointAccountCoOwnerValidationFragment, int i, Composer composer, int i2) {
        marginUpgradeJointAccountCoOwnerValidationFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setVisibility(8);
    }

    /* compiled from: MarginUpgradeJointAccountCoOwnerValidationFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.margin.upgrade.jointaccounts.MarginUpgradeJointAccountCoOwnerValidationFragment$ComposeContent$1 */
    static final class C211981 implements Function2<Composer, Integer, Unit> {
        C211981() {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-52231729, i, -1, "com.robinhood.android.margin.upgrade.jointaccounts.MarginUpgradeJointAccountCoOwnerValidationFragment.ComposeContent.<anonymous> (MarginUpgradeJointAccountCoOwnerValidationFragment.kt:32)");
            }
            Callbacks callbacks = MarginUpgradeJointAccountCoOwnerValidationFragment.this.getCallbacks();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(MarginUpgradeJointAccountCoOwnerValidationFragment.this);
            final MarginUpgradeJointAccountCoOwnerValidationFragment marginUpgradeJointAccountCoOwnerValidationFragment = MarginUpgradeJointAccountCoOwnerValidationFragment.this;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.margin.upgrade.jointaccounts.MarginUpgradeJointAccountCoOwnerValidationFragment$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MarginUpgradeJointAccountCoOwnerValidationFragment.C211981.invoke$lambda$1$lambda$0(marginUpgradeJointAccountCoOwnerValidationFragment);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(MarginUpgradeJointAccountCoOwnerValidationFragment.this);
            final MarginUpgradeJointAccountCoOwnerValidationFragment marginUpgradeJointAccountCoOwnerValidationFragment2 = MarginUpgradeJointAccountCoOwnerValidationFragment.this;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.margin.upgrade.jointaccounts.MarginUpgradeJointAccountCoOwnerValidationFragment$ComposeContent$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MarginUpgradeJointAccountCoOwnerValidationFragment.C211981.invoke$lambda$3$lambda$2(marginUpgradeJointAccountCoOwnerValidationFragment2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            MarginUpgradeJointAccountCoOwnerValidationComposable3.JointAccountCoOwnerValidationComposable(callbacks, function0, null, (Function0) objRememberedValue2, composer, 0, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(MarginUpgradeJointAccountCoOwnerValidationFragment marginUpgradeJointAccountCoOwnerValidationFragment) {
            marginUpgradeJointAccountCoOwnerValidationFragment.requireActivity().finish();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(MarginUpgradeJointAccountCoOwnerValidationFragment marginUpgradeJointAccountCoOwnerValidationFragment) {
            marginUpgradeJointAccountCoOwnerValidationFragment.requireActivity().onBackPressed();
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-903320291);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-903320291, i2, -1, "com.robinhood.android.margin.upgrade.jointaccounts.MarginUpgradeJointAccountCoOwnerValidationFragment.ComposeContent (MarginUpgradeJointAccountCoOwnerValidationFragment.kt:30)");
            }
            BentoTheme2.BentoTheme(ScarletComposeInterop.themeChangesForCompose(getScarletManager()), null, ComposableLambda3.rememberComposableLambda(-52231729, true, new C211981(), composerStartRestartGroup, 54), composerStartRestartGroup, 384, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.margin.upgrade.jointaccounts.MarginUpgradeJointAccountCoOwnerValidationFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MarginUpgradeJointAccountCoOwnerValidationFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: MarginUpgradeJointAccountCoOwnerValidationFragment.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/jointaccounts/MarginUpgradeJointAccountCoOwnerValidationFragment$Args;", "Landroid/os/Parcelable;", "accountNumber", "", "<init>", "(Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String accountNumber;

        /* compiled from: MarginUpgradeJointAccountCoOwnerValidationFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readString());
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
            dest.writeString(this.accountNumber);
        }

        public Args(String accountNumber) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            this.accountNumber = accountNumber;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }
    }

    /* compiled from: MarginUpgradeJointAccountCoOwnerValidationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/jointaccounts/MarginUpgradeJointAccountCoOwnerValidationFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/margin/upgrade/jointaccounts/MarginUpgradeJointAccountCoOwnerValidationFragment;", "Lcom/robinhood/android/margin/upgrade/jointaccounts/MarginUpgradeJointAccountCoOwnerValidationFragment$Args;", "<init>", "()V", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<MarginUpgradeJointAccountCoOwnerValidationFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(MarginUpgradeJointAccountCoOwnerValidationFragment marginUpgradeJointAccountCoOwnerValidationFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, marginUpgradeJointAccountCoOwnerValidationFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public MarginUpgradeJointAccountCoOwnerValidationFragment newInstance(Args args) {
            return (MarginUpgradeJointAccountCoOwnerValidationFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(MarginUpgradeJointAccountCoOwnerValidationFragment marginUpgradeJointAccountCoOwnerValidationFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, marginUpgradeJointAccountCoOwnerValidationFragment, args);
        }
    }
}
