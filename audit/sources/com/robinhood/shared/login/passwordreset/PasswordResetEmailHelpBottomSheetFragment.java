package com.robinhood.shared.login.passwordreset;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.shared.login.passwordreset.PasswordResetEmailHelpBottomSheetFragment;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsAndCallbacksCompanion;
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
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;

/* compiled from: PasswordResetEmailHelpBottomSheetFragment.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0003\r\u000e\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\n\u001a\u00020\u000bH\u0017¢\u0006\u0002\u0010\fR\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/shared/login/passwordreset/PasswordResetEmailHelpBottomSheetFragment;", "Lcom/robinhood/compose/app/GenericComposeBottomSheetDialogFragment;", "<init>", "()V", "callbacks", "Lcom/robinhood/shared/login/passwordreset/PasswordResetEmailHelpBottomSheetFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/shared/login/passwordreset/PasswordResetEmailHelpBottomSheetFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "Callbacks", "Args", "Companion", "feature-login_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class PasswordResetEmailHelpBottomSheetFragment extends GenericComposeBottomSheetDialogFragment {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.shared.login.passwordreset.PasswordResetEmailHelpBottomSheetFragment$special$$inlined$targetFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment targetFragment = CallbacksProperty.getTargetFragment();
            if (targetFragment != null) {
                return targetFragment;
            }
            throw new IllegalStateException("Required value was null.");
        }
    });
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(PasswordResetEmailHelpBottomSheetFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/shared/login/passwordreset/PasswordResetEmailHelpBottomSheetFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: PasswordResetEmailHelpBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/shared/login/passwordreset/PasswordResetEmailHelpBottomSheetFragment$Callbacks;", "", "resendEmail", "", "updateEmailAddress", "suvBottomSheetEnabled", "", "feature-login_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void resendEmail();

        void updateEmailAddress(boolean suvBottomSheetEnabled);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(PasswordResetEmailHelpBottomSheetFragment passwordResetEmailHelpBottomSheetFragment, int i, Composer composer, int i2) {
        passwordResetEmailHelpBottomSheetFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(207440472);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(207440472, i2, -1, "com.robinhood.shared.login.passwordreset.PasswordResetEmailHelpBottomSheetFragment.ComposeContent (PasswordResetEmailHelpBottomSheetFragment.kt:23)");
            }
            BentoThemeOverlays.ElevatedThemeOverlay(ComposableLambda3.rememberComposableLambda(1378837750, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.login.passwordreset.PasswordResetEmailHelpBottomSheetFragment.ComposeContent.1

                /* compiled from: PasswordResetEmailHelpBottomSheetFragment.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.shared.login.passwordreset.PasswordResetEmailHelpBottomSheetFragment$ComposeContent$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ PasswordResetEmailHelpBottomSheetFragment this$0;

                    AnonymousClass1(PasswordResetEmailHelpBottomSheetFragment passwordResetEmailHelpBottomSheetFragment) {
                        this.this$0 = passwordResetEmailHelpBottomSheetFragment;
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
                            ComposerKt.traceEventStart(-471896767, i, -1, "com.robinhood.shared.login.passwordreset.PasswordResetEmailHelpBottomSheetFragment.ComposeContent.<anonymous>.<anonymous> (PasswordResetEmailHelpBottomSheetFragment.kt:26)");
                        }
                        boolean suvBottomSheetEnabled = ((Args) PasswordResetEmailHelpBottomSheetFragment.INSTANCE.getArgs((Fragment) this.this$0)).getSuvBottomSheetEnabled();
                        PasswordResetEmailHelpBottomSheetFragment passwordResetEmailHelpBottomSheetFragment = this.this$0;
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance = composer.changedInstance(passwordResetEmailHelpBottomSheetFragment);
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new PasswordResetEmailHelpBottomSheetFragment2(passwordResetEmailHelpBottomSheetFragment);
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        Function0 function0 = (Function0) ((KFunction) objRememberedValue);
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance2 = composer.changedInstance(this.this$0);
                        final PasswordResetEmailHelpBottomSheetFragment passwordResetEmailHelpBottomSheetFragment2 = this.this$0;
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.login.passwordreset.PasswordResetEmailHelpBottomSheetFragment$ComposeContent$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return PasswordResetEmailHelpBottomSheetFragment.C391671.AnonymousClass1.invoke$lambda$2$lambda$1(passwordResetEmailHelpBottomSheetFragment2);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        Function0 function02 = (Function0) objRememberedValue2;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance3 = composer.changedInstance(this.this$0);
                        final PasswordResetEmailHelpBottomSheetFragment passwordResetEmailHelpBottomSheetFragment3 = this.this$0;
                        Object objRememberedValue3 = composer.rememberedValue();
                        if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function0() { // from class: com.robinhood.shared.login.passwordreset.PasswordResetEmailHelpBottomSheetFragment$ComposeContent$1$1$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return PasswordResetEmailHelpBottomSheetFragment.C391671.AnonymousClass1.invoke$lambda$4$lambda$3(passwordResetEmailHelpBottomSheetFragment3);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue3);
                        }
                        composer.endReplaceGroup();
                        PasswordResetEmailHelpBottomSheetComposable.PasswordResetEmailHelpBottomSheetComposable(suvBottomSheetEnabled, function0, function02, (Function0) objRememberedValue3, null, composer, 0, 16);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$2$lambda$1(PasswordResetEmailHelpBottomSheetFragment passwordResetEmailHelpBottomSheetFragment) {
                        passwordResetEmailHelpBottomSheetFragment.getCallbacks().resendEmail();
                        passwordResetEmailHelpBottomSheetFragment.dismiss();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$4$lambda$3(PasswordResetEmailHelpBottomSheetFragment passwordResetEmailHelpBottomSheetFragment) {
                        passwordResetEmailHelpBottomSheetFragment.getCallbacks().updateEmailAddress(((Args) PasswordResetEmailHelpBottomSheetFragment.INSTANCE.getArgs((Fragment) passwordResetEmailHelpBottomSheetFragment)).getSuvBottomSheetEnabled());
                        passwordResetEmailHelpBottomSheetFragment.dismiss();
                        return Unit.INSTANCE;
                    }
                }

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
                        ComposerKt.traceEventStart(1378837750, i3, -1, "com.robinhood.shared.login.passwordreset.PasswordResetEmailHelpBottomSheetFragment.ComposeContent.<anonymous> (PasswordResetEmailHelpBottomSheetFragment.kt:25)");
                    }
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-471896767, true, new AnonymousClass1(PasswordResetEmailHelpBottomSheetFragment.this), composer2, 54), composer2, 6);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.login.passwordreset.PasswordResetEmailHelpBottomSheetFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PasswordResetEmailHelpBottomSheetFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: PasswordResetEmailHelpBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/shared/login/passwordreset/PasswordResetEmailHelpBottomSheetFragment$Args;", "Landroid/os/Parcelable;", "suvBottomSheetEnabled", "", "<init>", "(Z)V", "getSuvBottomSheetEnabled", "()Z", "component1", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-login_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final boolean suvBottomSheetEnabled;

        /* compiled from: PasswordResetEmailHelpBottomSheetFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = args.suvBottomSheetEnabled;
            }
            return args.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getSuvBottomSheetEnabled() {
            return this.suvBottomSheetEnabled;
        }

        public final Args copy(boolean suvBottomSheetEnabled) {
            return new Args(suvBottomSheetEnabled);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Args) && this.suvBottomSheetEnabled == ((Args) other).suvBottomSheetEnabled;
        }

        public int hashCode() {
            return Boolean.hashCode(this.suvBottomSheetEnabled);
        }

        public String toString() {
            return "Args(suvBottomSheetEnabled=" + this.suvBottomSheetEnabled + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.suvBottomSheetEnabled ? 1 : 0);
        }

        public Args(boolean z) {
            this.suvBottomSheetEnabled = z;
        }

        public final boolean getSuvBottomSheetEnabled() {
            return this.suvBottomSheetEnabled;
        }
    }

    /* compiled from: PasswordResetEmailHelpBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/shared/login/passwordreset/PasswordResetEmailHelpBottomSheetFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsAndCallbacksCompanion;", "Lcom/robinhood/shared/login/passwordreset/PasswordResetEmailHelpBottomSheetFragment;", "Lcom/robinhood/shared/login/passwordreset/PasswordResetEmailHelpBottomSheetFragment$Args;", "Lcom/robinhood/shared/login/passwordreset/PasswordResetEmailHelpBottomSheetFragment$Callbacks;", "<init>", "()V", "feature-login_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsAndCallbacksCompanion<PasswordResetEmailHelpBottomSheetFragment, Args, Callbacks> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(PasswordResetEmailHelpBottomSheetFragment passwordResetEmailHelpBottomSheetFragment) {
            return (Args) FragmentWithArgsAndCallbacksCompanion.DefaultImpls.getArgs(this, passwordResetEmailHelpBottomSheetFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsAndCallbacksCompanion
        public /* bridge */ /* synthetic */ DialogFragment newInstance(Parcelable parcelable, Fragment fragment, int i) {
            return newInstance((Args) parcelable, (Args) fragment, i);
        }

        public <C extends Fragment & Callbacks> PasswordResetEmailHelpBottomSheetFragment newInstance(Args args, C c, int i) {
            return (PasswordResetEmailHelpBottomSheetFragment) FragmentWithArgsAndCallbacksCompanion.DefaultImpls.newInstance(this, args, c, i);
        }
    }
}
