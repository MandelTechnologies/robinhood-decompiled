package com.robinhood.android.gold.upgrade.legacy;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.view.result.ActivityResultCaller;
import com.robinhood.android.gold.lib.upgrade.api.ApiGoldUpgradeFlow;
import com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeExtraAgreementsFragment;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.models.api.bonfire.ApiGoldSweepAgreement;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.NoSuchElementException;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: LegacyGoldUpgradeExtraAgreementsFragment.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0003\r\u000e\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\n\u001a\u00020\u000bH\u0017¢\u0006\u0002\u0010\fR\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeExtraAgreementsFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeExtraAgreementsFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeExtraAgreementsFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "Callbacks", "Args", "Companion", "feature-gold-upgrade_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class LegacyGoldUpgradeExtraAgreementsFragment extends GenericComposeFragment {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeExtraAgreementsFragment$special$$inlined$parentFragmentThenActivityHostCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            ActivityResultCaller parentFragment = CallbacksProperty.getParentFragment();
            if (!(parentFragment instanceof LegacyGoldUpgradeExtraAgreementsFragment.Callbacks)) {
                parentFragment = null;
            }
            LegacyGoldUpgradeExtraAgreementsFragment.Callbacks callbacks = (LegacyGoldUpgradeExtraAgreementsFragment.Callbacks) parentFragment;
            if (callbacks != null) {
                return callbacks;
            }
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof LegacyGoldUpgradeExtraAgreementsFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(LegacyGoldUpgradeExtraAgreementsFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeExtraAgreementsFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: LegacyGoldUpgradeExtraAgreementsFragment.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\"\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH&¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeExtraAgreementsFragment$Callbacks;", "", "onClickFullAgreement", "", "agreement", "Lcom/robinhood/models/api/bonfire/ApiGoldSweepAgreement;", "onClickAgreementsCta", "isSweepChecked", "", "isSlipChecked", "selectedPlanId", "Ljava/util/UUID;", "feature-gold-upgrade_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onClickAgreementsCta(boolean isSweepChecked, boolean isSlipChecked, UUID selectedPlanId);

        void onClickFullAgreement(ApiGoldSweepAgreement agreement);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$4(LegacyGoldUpgradeExtraAgreementsFragment legacyGoldUpgradeExtraAgreementsFragment, int i, Composer composer, int i2) {
        legacyGoldUpgradeExtraAgreementsFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(933788826);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(933788826, i2, -1, "com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeExtraAgreementsFragment.ComposeContent (LegacyGoldUpgradeExtraAgreementsFragment.kt:25)");
            }
            ApiGoldUpgradeFlow.ApiGoldExtraAgreements agreements = ((Args) INSTANCE.getArgs((Fragment) this)).getAgreements();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeExtraAgreementsFragment$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LegacyGoldUpgradeExtraAgreementsFragment.ComposeContent$lambda$1$lambda$0(this.f$0, (ApiGoldSweepAgreement) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function3() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeExtraAgreementsFragment$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return LegacyGoldUpgradeExtraAgreementsFragment.ComposeContent$lambda$3$lambda$2(this.f$0, ((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), (UUID) obj3);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            LegacyGoldUpgradeExtraAgreementsComposable.GoldUpgradeExtraAgreementsComposable(agreements, function1, (Function3) objRememberedValue2, null, null, composerStartRestartGroup, 0, 24);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeExtraAgreementsFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LegacyGoldUpgradeExtraAgreementsFragment.ComposeContent$lambda$4(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1$lambda$0(LegacyGoldUpgradeExtraAgreementsFragment legacyGoldUpgradeExtraAgreementsFragment, ApiGoldSweepAgreement agreement) {
        Intrinsics.checkNotNullParameter(agreement, "agreement");
        legacyGoldUpgradeExtraAgreementsFragment.getCallbacks().onClickFullAgreement(agreement);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$3$lambda$2(LegacyGoldUpgradeExtraAgreementsFragment legacyGoldUpgradeExtraAgreementsFragment, boolean z, boolean z2, UUID uuid) {
        legacyGoldUpgradeExtraAgreementsFragment.getCallbacks().onClickAgreementsCta(z, z2, uuid);
        return Unit.INSTANCE;
    }

    /* compiled from: LegacyGoldUpgradeExtraAgreementsFragment.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeExtraAgreementsFragment$Args;", "Landroid/os/Parcelable;", "agreements", "Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldExtraAgreements;", "<init>", "(Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldExtraAgreements;)V", "getAgreements", "()Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldExtraAgreements;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-gold-upgrade_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final ApiGoldUpgradeFlow.ApiGoldExtraAgreements agreements;

        /* compiled from: LegacyGoldUpgradeExtraAgreementsFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((ApiGoldUpgradeFlow.ApiGoldExtraAgreements) parcel.readParcelable(Args.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, ApiGoldUpgradeFlow.ApiGoldExtraAgreements apiGoldExtraAgreements, int i, Object obj) {
            if ((i & 1) != 0) {
                apiGoldExtraAgreements = args.agreements;
            }
            return args.copy(apiGoldExtraAgreements);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiGoldUpgradeFlow.ApiGoldExtraAgreements getAgreements() {
            return this.agreements;
        }

        public final Args copy(ApiGoldUpgradeFlow.ApiGoldExtraAgreements agreements) {
            Intrinsics.checkNotNullParameter(agreements, "agreements");
            return new Args(agreements);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Args) && Intrinsics.areEqual(this.agreements, ((Args) other).agreements);
        }

        public int hashCode() {
            return this.agreements.hashCode();
        }

        public String toString() {
            return "Args(agreements=" + this.agreements + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.agreements, flags);
        }

        public Args(ApiGoldUpgradeFlow.ApiGoldExtraAgreements agreements) {
            Intrinsics.checkNotNullParameter(agreements, "agreements");
            this.agreements = agreements;
        }

        public final ApiGoldUpgradeFlow.ApiGoldExtraAgreements getAgreements() {
            return this.agreements;
        }
    }

    /* compiled from: LegacyGoldUpgradeExtraAgreementsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeExtraAgreementsFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeExtraAgreementsFragment;", "Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeExtraAgreementsFragment$Args;", "<init>", "()V", "feature-gold-upgrade_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<LegacyGoldUpgradeExtraAgreementsFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(LegacyGoldUpgradeExtraAgreementsFragment legacyGoldUpgradeExtraAgreementsFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, legacyGoldUpgradeExtraAgreementsFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public LegacyGoldUpgradeExtraAgreementsFragment newInstance(Args args) {
            return (LegacyGoldUpgradeExtraAgreementsFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(LegacyGoldUpgradeExtraAgreementsFragment legacyGoldUpgradeExtraAgreementsFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, legacyGoldUpgradeExtraAgreementsFragment, args);
        }
    }
}
