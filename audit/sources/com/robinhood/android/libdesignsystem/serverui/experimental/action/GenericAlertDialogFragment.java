package com.robinhood.android.libdesignsystem.serverui.experimental.action;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericAlertDialogFragment;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert;
import com.robinhood.compose.app.GenericComposeDialogFragment;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.models.serverdriven.experimental.api.DeeplinkAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
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

/* compiled from: GenericAlertDialogFragment.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0003\r\u000e\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\n\u001a\u00020\u000bH\u0017¢\u0006\u0002\u0010\fR\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/libdesignsystem/serverui/experimental/action/GenericAlertDialogFragment;", "Lcom/robinhood/compose/app/GenericComposeDialogFragment;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/action/GenericAlertDialogFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/libdesignsystem/serverui/experimental/action/GenericAlertDialogFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "Callbacks", "Args", "Companion", "lib-sdui_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class GenericAlertDialogFragment extends GenericComposeDialogFragment {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericAlertDialogFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(GenericAlertDialogFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/libdesignsystem/serverui/experimental/action/GenericAlertDialogFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: GenericAlertDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/libdesignsystem/serverui/experimental/action/GenericAlertDialogFragment$Callbacks;", "", "handleAction", "", "action", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "lib-sdui_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        boolean handleAction(GenericAction action);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$2(GenericAlertDialogFragment genericAlertDialogFragment, int i, Composer composer, int i2) {
        genericAlertDialogFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.compose.app.GenericComposeDialogFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1924780602);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1924780602, i2, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericAlertDialogFragment.ComposeContent (GenericAlertDialogFragment.kt:25)");
            }
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericAlertDialogFragment$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(GenericAlertDialogFragment.ComposeContent$lambda$1$lambda$0(this.f$0, (GenericAction) obj));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoTheme2.BentoTheme(null, null, null, null, null, Boolean.valueOf(((Args) INSTANCE.getArgs((Fragment) this)).isAchromatic()), null, null, ComposableLambda3.rememberComposableLambda(-567445518, true, new C207071((Function1) objRememberedValue), composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericAlertDialogFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GenericAlertDialogFragment.ComposeContent$lambda$2(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ComposeContent$lambda$1$lambda$0(GenericAlertDialogFragment genericAlertDialogFragment, GenericAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        genericAlertDialogFragment.getCallbacks().handleAction(action);
        return true;
    }

    /* compiled from: GenericAlertDialogFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericAlertDialogFragment$ComposeContent$1 */
    static final class C207071 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Function1<GenericAction, Boolean> $handleAction;

        /* JADX WARN: Multi-variable type inference failed */
        C207071(Function1<? super GenericAction, Boolean> function1) {
            this.$handleAction = function1;
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
                ComposerKt.traceEventStart(-567445518, i, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericAlertDialogFragment.ComposeContent.<anonymous> (GenericAlertDialogFragment.kt:31)");
            }
            SduiAlert sduiAlert = SduiAlert.INSTANCE;
            GenericAlertContent<GenericAction> alert = ((Args) GenericAlertDialogFragment.INSTANCE.getArgs((Fragment) GenericAlertDialogFragment.this)).getAlert();
            GenericAlertDialogFragment2 genericAlertDialogFragment2 = new GenericAlertDialogFragment2(this.$handleAction);
            composer.startReplaceGroup(5004770);
            boolean zChanged = composer.changed(this.$handleAction);
            final Function1<GenericAction, Boolean> function1 = this.$handleAction;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericAlertDialogFragment$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return GenericAlertDialogFragment.C207071.invoke$lambda$1$lambda$0(function1, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function1<? super String, Unit> function12 = (Function1) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(GenericAlertDialogFragment.this);
            final GenericAlertDialogFragment genericAlertDialogFragment = GenericAlertDialogFragment.this;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericAlertDialogFragment$ComposeContent$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GenericAlertDialogFragment.C207071.invoke$lambda$3$lambda$2(genericAlertDialogFragment);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            sduiAlert.Dialog(alert, genericAlertDialogFragment2, function12, (Function0) objRememberedValue2, composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Function1 function1, String uri) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            function1.invoke(new GenericAction.Deeplink(new DeeplinkAction(uri)));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(GenericAlertDialogFragment genericAlertDialogFragment) {
            if (((Args) GenericAlertDialogFragment.INSTANCE.getArgs((Fragment) genericAlertDialogFragment)).isCancelable()) {
                genericAlertDialogFragment.dismiss();
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: GenericAlertDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J7\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\rR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\r¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/libdesignsystem/serverui/experimental/action/GenericAlertDialogFragment$Args;", "Landroid/os/Parcelable;", "alert", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "isCrypto", "", "isAchromatic", "isCancelable", "<init>", "(Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;ZZZ)V", "getAlert", "()Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "()Z", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-sdui_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final GenericAlertContent<GenericAction> alert;
        private final boolean isAchromatic;
        private final boolean isCancelable;
        private final boolean isCrypto;

        /* compiled from: GenericAlertDialogFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((GenericAlertContent) parcel.readParcelable(Args.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Args copy$default(Args args, GenericAlertContent genericAlertContent, boolean z, boolean z2, boolean z3, int i, Object obj) {
            if ((i & 1) != 0) {
                genericAlertContent = args.alert;
            }
            if ((i & 2) != 0) {
                z = args.isCrypto;
            }
            if ((i & 4) != 0) {
                z2 = args.isAchromatic;
            }
            if ((i & 8) != 0) {
                z3 = args.isCancelable;
            }
            return args.copy(genericAlertContent, z, z2, z3);
        }

        public final GenericAlertContent<GenericAction> component1() {
            return this.alert;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsCrypto() {
            return this.isCrypto;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsAchromatic() {
            return this.isAchromatic;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsCancelable() {
            return this.isCancelable;
        }

        public final Args copy(GenericAlertContent<? extends GenericAction> alert, boolean isCrypto, boolean isAchromatic, boolean isCancelable) {
            Intrinsics.checkNotNullParameter(alert, "alert");
            return new Args(alert, isCrypto, isAchromatic, isCancelable);
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
            return Intrinsics.areEqual(this.alert, args.alert) && this.isCrypto == args.isCrypto && this.isAchromatic == args.isAchromatic && this.isCancelable == args.isCancelable;
        }

        public int hashCode() {
            return (((((this.alert.hashCode() * 31) + Boolean.hashCode(this.isCrypto)) * 31) + Boolean.hashCode(this.isAchromatic)) * 31) + Boolean.hashCode(this.isCancelable);
        }

        public String toString() {
            return "Args(alert=" + this.alert + ", isCrypto=" + this.isCrypto + ", isAchromatic=" + this.isAchromatic + ", isCancelable=" + this.isCancelable + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.alert, flags);
            dest.writeInt(this.isCrypto ? 1 : 0);
            dest.writeInt(this.isAchromatic ? 1 : 0);
            dest.writeInt(this.isCancelable ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Args(GenericAlertContent<? extends GenericAction> alert, boolean z, boolean z2, boolean z3) {
            Intrinsics.checkNotNullParameter(alert, "alert");
            this.alert = alert;
            this.isCrypto = z;
            this.isAchromatic = z2;
            this.isCancelable = z3;
        }

        public final GenericAlertContent<GenericAction> getAlert() {
            return this.alert;
        }

        public final boolean isCrypto() {
            return this.isCrypto;
        }

        public final boolean isAchromatic() {
            return this.isAchromatic;
        }

        public final boolean isCancelable() {
            return this.isCancelable;
        }
    }

    /* compiled from: GenericAlertDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/libdesignsystem/serverui/experimental/action/GenericAlertDialogFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/action/GenericAlertDialogFragment;", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/action/GenericAlertDialogFragment$Args;", "<init>", "()V", "lib-sdui_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<GenericAlertDialogFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(GenericAlertDialogFragment genericAlertDialogFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, genericAlertDialogFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public GenericAlertDialogFragment newInstance(Args args) {
            return (GenericAlertDialogFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(GenericAlertDialogFragment genericAlertDialogFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, genericAlertDialogFragment, args);
        }
    }
}
