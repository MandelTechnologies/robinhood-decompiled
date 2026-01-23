package com.robinhood.android.rollover401k.steps.unsupported;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import com.robinhood.android.models.retirement.p194db.UnsupportedInstitutionViewModel;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.RetirementRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UnsupportedInstitutionFragment.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\u00020\u00012\u00020\u0002:\u0002\u0012\u0013B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\t\u001a\u00020\nH\u0017¢\u0006\u0002\u0010\u000bJ\t\u0010\f\u001a\u00020\u0006H\u0096\u0001R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/rollover401k/steps/unsupported/UnsupportedInstitutionFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "toolbarVisible", "", "getToolbarVisible", "()Z", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "UnsupportedInstitutionFragmentKey", "Companion", "feature-rollover-401k_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class UnsupportedInstitutionFragment extends GenericComposeFragment implements RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(RetirementRegionGate.INSTANCE);
    private final boolean toolbarVisible;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(UnsupportedInstitutionFragment unsupportedInstitutionFragment, int i, Composer composer, int i2) {
        unsupportedInstitutionFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1735034188);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1735034188, i2, -1, "com.robinhood.android.rollover401k.steps.unsupported.UnsupportedInstitutionFragment.ComposeContent (UnsupportedInstitutionFragment.kt:21)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(304962303, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.rollover401k.steps.unsupported.UnsupportedInstitutionFragment.ComposeContent.1
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
                        ComposerKt.traceEventStart(304962303, i3, -1, "com.robinhood.android.rollover401k.steps.unsupported.UnsupportedInstitutionFragment.ComposeContent.<anonymous> (UnsupportedInstitutionFragment.kt:23)");
                    }
                    UnsupportedInstitutionScreen7.UnsupportedInstitutionScreen(((UnsupportedInstitutionFragmentKey) UnsupportedInstitutionFragment.INSTANCE.getArgs((Fragment) UnsupportedInstitutionFragment.this)).getUnsupportedInstitutionViewModel(), null, composer2, 0, 2);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rollover401k.steps.unsupported.UnsupportedInstitutionFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UnsupportedInstitutionFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: UnsupportedInstitutionFragment.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/rollover401k/steps/unsupported/UnsupportedInstitutionFragment$UnsupportedInstitutionFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "unsupportedInstitutionViewModel", "Lcom/robinhood/android/models/retirement/db/UnsupportedInstitutionViewModel;", "<init>", "(Lcom/robinhood/android/models/retirement/db/UnsupportedInstitutionViewModel;)V", "getUnsupportedInstitutionViewModel", "()Lcom/robinhood/android/models/retirement/db/UnsupportedInstitutionViewModel;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-rollover-401k_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class UnsupportedInstitutionFragmentKey implements FragmentKey {
        public static final int $stable = 8;
        public static final Parcelable.Creator<UnsupportedInstitutionFragmentKey> CREATOR = new Creator();
        private final UnsupportedInstitutionViewModel unsupportedInstitutionViewModel;

        /* compiled from: UnsupportedInstitutionFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<UnsupportedInstitutionFragmentKey> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UnsupportedInstitutionFragmentKey createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UnsupportedInstitutionFragmentKey((UnsupportedInstitutionViewModel) parcel.readParcelable(UnsupportedInstitutionFragmentKey.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UnsupportedInstitutionFragmentKey[] newArray(int i) {
                return new UnsupportedInstitutionFragmentKey[i];
            }
        }

        public static /* synthetic */ UnsupportedInstitutionFragmentKey copy$default(UnsupportedInstitutionFragmentKey unsupportedInstitutionFragmentKey, UnsupportedInstitutionViewModel unsupportedInstitutionViewModel, int i, Object obj) {
            if ((i & 1) != 0) {
                unsupportedInstitutionViewModel = unsupportedInstitutionFragmentKey.unsupportedInstitutionViewModel;
            }
            return unsupportedInstitutionFragmentKey.copy(unsupportedInstitutionViewModel);
        }

        /* renamed from: component1, reason: from getter */
        public final UnsupportedInstitutionViewModel getUnsupportedInstitutionViewModel() {
            return this.unsupportedInstitutionViewModel;
        }

        public final UnsupportedInstitutionFragmentKey copy(UnsupportedInstitutionViewModel unsupportedInstitutionViewModel) {
            Intrinsics.checkNotNullParameter(unsupportedInstitutionViewModel, "unsupportedInstitutionViewModel");
            return new UnsupportedInstitutionFragmentKey(unsupportedInstitutionViewModel);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UnsupportedInstitutionFragmentKey) && Intrinsics.areEqual(this.unsupportedInstitutionViewModel, ((UnsupportedInstitutionFragmentKey) other).unsupportedInstitutionViewModel);
        }

        public int hashCode() {
            return this.unsupportedInstitutionViewModel.hashCode();
        }

        public String toString() {
            return "UnsupportedInstitutionFragmentKey(unsupportedInstitutionViewModel=" + this.unsupportedInstitutionViewModel + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.unsupportedInstitutionViewModel, flags);
        }

        public UnsupportedInstitutionFragmentKey(UnsupportedInstitutionViewModel unsupportedInstitutionViewModel) {
            Intrinsics.checkNotNullParameter(unsupportedInstitutionViewModel, "unsupportedInstitutionViewModel");
            this.unsupportedInstitutionViewModel = unsupportedInstitutionViewModel;
        }

        public final UnsupportedInstitutionViewModel getUnsupportedInstitutionViewModel() {
            return this.unsupportedInstitutionViewModel;
        }
    }

    /* compiled from: UnsupportedInstitutionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/rollover401k/steps/unsupported/UnsupportedInstitutionFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/rollover401k/steps/unsupported/UnsupportedInstitutionFragment;", "Lcom/robinhood/android/rollover401k/steps/unsupported/UnsupportedInstitutionFragment$UnsupportedInstitutionFragmentKey;", "<init>", "()V", "feature-rollover-401k_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<UnsupportedInstitutionFragment, UnsupportedInstitutionFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(UnsupportedInstitutionFragmentKey unsupportedInstitutionFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, unsupportedInstitutionFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public UnsupportedInstitutionFragmentKey getArgs(UnsupportedInstitutionFragment unsupportedInstitutionFragment) {
            return (UnsupportedInstitutionFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, unsupportedInstitutionFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public UnsupportedInstitutionFragment newInstance(UnsupportedInstitutionFragmentKey unsupportedInstitutionFragmentKey) {
            return (UnsupportedInstitutionFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, unsupportedInstitutionFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(UnsupportedInstitutionFragment unsupportedInstitutionFragment, UnsupportedInstitutionFragmentKey unsupportedInstitutionFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, unsupportedInstitutionFragment, unsupportedInstitutionFragmentKey);
        }
    }
}
