package com.robinhood.android.gold.upgrade.legacy;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.core.view.WindowCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.view.result.ActivityResultCaller;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.gold.contracts.GoldUpgradeContract;
import com.robinhood.android.gold.lib.upgrade.api.ApiGoldUpgradeFlow;
import com.robinhood.compose.app.GenericComposeFragment;
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
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;

/* compiled from: LegacyGoldUpgradeGoldDaysValuePropsFragment.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0002\u0016\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\r\u0010\u0013\u001a\u00020\u0011H\u0017¢\u0006\u0002\u0010\u0014J\b\u0010\u0015\u001a\u00020\u000bH\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u000bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeGoldDaysValuePropsFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/gold/contracts/GoldUpgradeContract$ValuePropCallbacks;", "getCallbacks", "()Lcom/robinhood/android/gold/contracts/GoldUpgradeContract$ValuePropCallbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "excludeFromAnalyticsLogging", "", "getExcludeFromAnalyticsLogging", "()Z", "toolbarVisible", "getToolbarVisible", "onStart", "", "onStop", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onBackPressed", "Args", "Companion", "feature-gold-upgrade_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class LegacyGoldUpgradeGoldDaysValuePropsFragment extends GenericComposeFragment {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(GoldUpgradeContract.ValuePropCallbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeGoldDaysValuePropsFragment$special$$inlined$parentFragmentThenActivityHostCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            ActivityResultCaller parentFragment = CallbacksProperty.getParentFragment();
            if (!(parentFragment instanceof GoldUpgradeContract.ValuePropCallbacks)) {
                parentFragment = null;
            }
            GoldUpgradeContract.ValuePropCallbacks valuePropCallbacks = (GoldUpgradeContract.ValuePropCallbacks) parentFragment;
            if (valuePropCallbacks != null) {
                return valuePropCallbacks;
            }
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof GoldUpgradeContract.ValuePropCallbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });
    private final boolean excludeFromAnalyticsLogging = true;
    private final boolean toolbarVisible;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(LegacyGoldUpgradeGoldDaysValuePropsFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/gold/contracts/GoldUpgradeContract$ValuePropCallbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$2(LegacyGoldUpgradeGoldDaysValuePropsFragment legacyGoldUpgradeGoldDaysValuePropsFragment, int i, Composer composer, int i2) {
        legacyGoldUpgradeGoldDaysValuePropsFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    private final GoldUpgradeContract.ValuePropCallbacks getCallbacks() {
        return (GoldUpgradeContract.ValuePropCallbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public boolean getExcludeFromAnalyticsLogging() {
        return this.excludeFromAnalyticsLogging;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        WindowCompat.setDecorFitsSystemWindows(requireActivity().getWindow(), false);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        WindowCompat.setDecorFitsSystemWindows(requireActivity().getWindow(), true);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-601607596);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-601607596, i2, -1, "com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeGoldDaysValuePropsFragment.ComposeContent (LegacyGoldUpgradeGoldDaysValuePropsFragment.kt:35)");
            }
            Companion companion = INSTANCE;
            ApiGoldUpgradeFlow.ApiGoldDaysValueProps goldDaysValueProps = ((Args) companion.getArgs((Fragment) this)).getGoldDaysValueProps();
            GoldUpgradeContract.ValuePropCallbacks callbacks = getCallbacks();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(callbacks);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new LegacyGoldUpgradeGoldDaysValuePropsFragment2(callbacks);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Function0 function0 = (Function0) ((KFunction) objRememberedValue);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new LegacyGoldUpgradeGoldDaysValuePropsFragment3(this);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            LegacyGoldUpgradeGoldDaysValuePropsComposable.GoldUpgradeGoldDaysValuePropsComposable(goldDaysValueProps, function0, (Function0) objRememberedValue2, null, null, null, ((Args) companion.getArgs((Fragment) this)).getLoggingContext(), composerStartRestartGroup, 0, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeGoldDaysValuePropsFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LegacyGoldUpgradeGoldDaysValuePropsFragment.ComposeContent$lambda$2(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        Fragment parentFragment = getParentFragment();
        BaseFragment baseFragment = parentFragment instanceof BaseFragment ? (BaseFragment) parentFragment : null;
        if (baseFragment != null ? baseFragment.onBackPressed() : false) {
            return true;
        }
        requireActivity().getOnBackPressedDispatcher().onBackPressed();
        return true;
    }

    /* compiled from: LegacyGoldUpgradeGoldDaysValuePropsFragment.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeGoldDaysValuePropsFragment$Args;", "Landroid/os/Parcelable;", "goldDaysValueProps", "Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldDaysValueProps;", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/rosetta/eventlogging/Context;", "<init>", "(Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldDaysValueProps;Lcom/robinhood/rosetta/eventlogging/Context;)V", "getGoldDaysValueProps", "()Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldDaysValueProps;", "getLoggingContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-gold-upgrade_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final ApiGoldUpgradeFlow.ApiGoldDaysValueProps goldDaysValueProps;
        private final com.robinhood.rosetta.eventlogging.Context loggingContext;

        /* compiled from: LegacyGoldUpgradeGoldDaysValuePropsFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((ApiGoldUpgradeFlow.ApiGoldDaysValueProps) parcel.readParcelable(Args.class.getClassLoader()), (com.robinhood.rosetta.eventlogging.Context) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, ApiGoldUpgradeFlow.ApiGoldDaysValueProps apiGoldDaysValueProps, com.robinhood.rosetta.eventlogging.Context context, int i, Object obj) {
            if ((i & 1) != 0) {
                apiGoldDaysValueProps = args.goldDaysValueProps;
            }
            if ((i & 2) != 0) {
                context = args.loggingContext;
            }
            return args.copy(apiGoldDaysValueProps, context);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiGoldUpgradeFlow.ApiGoldDaysValueProps getGoldDaysValueProps() {
            return this.goldDaysValueProps;
        }

        /* renamed from: component2, reason: from getter */
        public final com.robinhood.rosetta.eventlogging.Context getLoggingContext() {
            return this.loggingContext;
        }

        public final Args copy(ApiGoldUpgradeFlow.ApiGoldDaysValueProps goldDaysValueProps, com.robinhood.rosetta.eventlogging.Context loggingContext) {
            Intrinsics.checkNotNullParameter(goldDaysValueProps, "goldDaysValueProps");
            Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
            return new Args(goldDaysValueProps, loggingContext);
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
            return Intrinsics.areEqual(this.goldDaysValueProps, args.goldDaysValueProps) && Intrinsics.areEqual(this.loggingContext, args.loggingContext);
        }

        public int hashCode() {
            return (this.goldDaysValueProps.hashCode() * 31) + this.loggingContext.hashCode();
        }

        public String toString() {
            return "Args(goldDaysValueProps=" + this.goldDaysValueProps + ", loggingContext=" + this.loggingContext + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.goldDaysValueProps, flags);
            dest.writeSerializable(this.loggingContext);
        }

        public Args(ApiGoldUpgradeFlow.ApiGoldDaysValueProps goldDaysValueProps, com.robinhood.rosetta.eventlogging.Context loggingContext) {
            Intrinsics.checkNotNullParameter(goldDaysValueProps, "goldDaysValueProps");
            Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
            this.goldDaysValueProps = goldDaysValueProps;
            this.loggingContext = loggingContext;
        }

        public final ApiGoldUpgradeFlow.ApiGoldDaysValueProps getGoldDaysValueProps() {
            return this.goldDaysValueProps;
        }

        public final com.robinhood.rosetta.eventlogging.Context getLoggingContext() {
            return this.loggingContext;
        }
    }

    /* compiled from: LegacyGoldUpgradeGoldDaysValuePropsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeGoldDaysValuePropsFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeGoldDaysValuePropsFragment;", "Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeGoldDaysValuePropsFragment$Args;", "<init>", "()V", "feature-gold-upgrade_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<LegacyGoldUpgradeGoldDaysValuePropsFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(LegacyGoldUpgradeGoldDaysValuePropsFragment legacyGoldUpgradeGoldDaysValuePropsFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, legacyGoldUpgradeGoldDaysValuePropsFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public LegacyGoldUpgradeGoldDaysValuePropsFragment newInstance(Args args) {
            return (LegacyGoldUpgradeGoldDaysValuePropsFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(LegacyGoldUpgradeGoldDaysValuePropsFragment legacyGoldUpgradeGoldDaysValuePropsFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, legacyGoldUpgradeGoldDaysValuePropsFragment, args);
        }
    }
}
