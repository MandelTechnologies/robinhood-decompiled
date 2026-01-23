package com.robinhood.android.cortex.digest.asset.splash;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.cortex.contracts.AssetDigestOnboardingFlowType;
import com.robinhood.compose.app.GenericComposeFragment;
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
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;

/* compiled from: AssetDigestSplashFragment.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0003\u0014\u0015\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u000e\u001a\u00020\u000fH\u0017¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/asset/splash/AssetDigestSplashFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "toolbarVisible", "", "getToolbarVisible", "()Z", "callbacks", "Lcom/robinhood/android/cortex/digest/asset/splash/AssetDigestSplashFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/cortex/digest/asset/splash/AssetDigestSplashFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "onDialogDismissed", "id", "", "Callbacks", "Args", "Companion", "lib-cortex-digest-asset-splash_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class AssetDigestSplashFragment extends GenericComposeFragment {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.cortex.digest.asset.splash.AssetDigestSplashFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AssetDigestSplashFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/cortex/digest/asset/splash/AssetDigestSplashFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: AssetDigestSplashFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/asset/splash/AssetDigestSplashFragment$Callbacks;", "", "onSkipSplash", "", "hasSignedAgreement", "", "hasGoldOrNotRequired", "onContinueClick", "lib-cortex-digest-asset-splash_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onContinueClick(boolean hasSignedAgreement, boolean hasGoldOrNotRequired);

        void onSkipSplash(boolean hasSignedAgreement, boolean hasGoldOrNotRequired);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$6(AssetDigestSplashFragment assetDigestSplashFragment, int i, Composer composer, int i2) {
        assetDigestSplashFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return false;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-671985133);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-671985133, i2, -1, "com.robinhood.android.cortex.digest.asset.splash.AssetDigestSplashFragment.ComposeContent (AssetDigestSplashFragment.kt:28)");
            }
            Args args = (Args) INSTANCE.getArgs((Fragment) this);
            Callbacks callbacks = getCallbacks();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(callbacks);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new AssetDigestSplashFragment2(callbacks);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Function2 function2 = (Function2) ((KFunction) objRememberedValue);
            Callbacks callbacks2 = getCallbacks();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(callbacks2);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new AssetDigestSplashFragment3(callbacks2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            Function2 function22 = (Function2) ((KFunction) objRememberedValue2);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.cortex.digest.asset.splash.AssetDigestSplashFragment$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AssetDigestSplashFragment.ComposeContent$lambda$3$lambda$2(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Function0 function0 = (Function0) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new Function1() { // from class: com.robinhood.android.cortex.digest.asset.splash.AssetDigestSplashFragment$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AssetDigestSplashFragment.ComposeContent$lambda$5$lambda$4(this.f$0, (Throwable) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceGroup();
            AssetDigestSplashComposableKt.AssetDigestSplashComposable(args, function2, function22, function0, (Function1) objRememberedValue4, null, composerStartRestartGroup, 0, 32);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cortex.digest.asset.splash.AssetDigestSplashFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AssetDigestSplashFragment.ComposeContent$lambda$6(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$3$lambda$2(AssetDigestSplashFragment assetDigestSplashFragment) {
        assetDigestSplashFragment.requireBaseActivity().onBackPressed();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$5$lambda$4(AssetDigestSplashFragment assetDigestSplashFragment, Throwable it) throws Throwable {
        Intrinsics.checkNotNullParameter(it, "it");
        ActivityErrorHandler.Companion companion = ActivityErrorHandler.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = assetDigestSplashFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        ActivityErrorHandler.Companion.handle$default(companion, fragmentActivityRequireActivity, it, true, false, 0, null, 56, null);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        if (id == C11048R.id.dialog_id_generic_error) {
            requireActivity().finish();
        } else {
            super.onDialogDismissed(id);
        }
    }

    /* compiled from: AssetDigestSplashFragment.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0015R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/asset/splash/AssetDigestSplashFragment$Args;", "Landroid/os/Parcelable;", "source", "", "flowType", "Lcom/robinhood/android/cortex/contracts/AssetDigestOnboardingFlowType;", "skipVideo", "", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/cortex/contracts/AssetDigestOnboardingFlowType;Z)V", "getSource", "()Ljava/lang/String;", "getFlowType", "()Lcom/robinhood/android/cortex/contracts/AssetDigestOnboardingFlowType;", "getSkipVideo", "()Z", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-cortex-digest-asset-splash_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final AssetDigestOnboardingFlowType flowType;
        private final boolean skipVideo;
        private final String source;

        /* compiled from: AssetDigestSplashFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readString(), AssetDigestOnboardingFlowType.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, String str, AssetDigestOnboardingFlowType assetDigestOnboardingFlowType, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.source;
            }
            if ((i & 2) != 0) {
                assetDigestOnboardingFlowType = args.flowType;
            }
            if ((i & 4) != 0) {
                z = args.skipVideo;
            }
            return args.copy(str, assetDigestOnboardingFlowType, z);
        }

        /* renamed from: component1, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* renamed from: component2, reason: from getter */
        public final AssetDigestOnboardingFlowType getFlowType() {
            return this.flowType;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getSkipVideo() {
            return this.skipVideo;
        }

        public final Args copy(String source, AssetDigestOnboardingFlowType flowType, boolean skipVideo) {
            Intrinsics.checkNotNullParameter(flowType, "flowType");
            return new Args(source, flowType, skipVideo);
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
            return Intrinsics.areEqual(this.source, args.source) && this.flowType == args.flowType && this.skipVideo == args.skipVideo;
        }

        public int hashCode() {
            String str = this.source;
            return ((((str == null ? 0 : str.hashCode()) * 31) + this.flowType.hashCode()) * 31) + Boolean.hashCode(this.skipVideo);
        }

        public String toString() {
            return "Args(source=" + this.source + ", flowType=" + this.flowType + ", skipVideo=" + this.skipVideo + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.source);
            dest.writeString(this.flowType.name());
            dest.writeInt(this.skipVideo ? 1 : 0);
        }

        public Args(String str, AssetDigestOnboardingFlowType flowType, boolean z) {
            Intrinsics.checkNotNullParameter(flowType, "flowType");
            this.source = str;
            this.flowType = flowType;
            this.skipVideo = z;
        }

        public final String getSource() {
            return this.source;
        }

        public /* synthetic */ Args(String str, AssetDigestOnboardingFlowType assetDigestOnboardingFlowType, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? AssetDigestOnboardingFlowType.UNSPECIFIED : assetDigestOnboardingFlowType, (i & 4) != 0 ? false : z);
        }

        public final AssetDigestOnboardingFlowType getFlowType() {
            return this.flowType;
        }

        public final boolean getSkipVideo() {
            return this.skipVideo;
        }
    }

    /* compiled from: AssetDigestSplashFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/asset/splash/AssetDigestSplashFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/cortex/digest/asset/splash/AssetDigestSplashFragment;", "Lcom/robinhood/android/cortex/digest/asset/splash/AssetDigestSplashFragment$Args;", "<init>", "()V", "lib-cortex-digest-asset-splash_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<AssetDigestSplashFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(AssetDigestSplashFragment assetDigestSplashFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, assetDigestSplashFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AssetDigestSplashFragment newInstance(Args args) {
            return (AssetDigestSplashFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AssetDigestSplashFragment assetDigestSplashFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, assetDigestSplashFragment, args);
        }
    }
}
