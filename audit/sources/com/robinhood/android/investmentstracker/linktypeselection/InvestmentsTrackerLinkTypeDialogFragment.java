package com.robinhood.android.investmentstracker.linktypeselection;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.fragment.app.Fragment;
import com.robinhood.android.investmentstracker.linktypeselection.components.InvestmentsTrackerLinkTypeDialogScreen;
import com.robinhood.android.navigation.DialogFragmentResolverWithArgsCompanion;
import com.robinhood.android.transfers.contracts.InvestmentsTrackerLinkTypeKey;
import com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
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

/* compiled from: InvestmentsTrackerLinkTypeDialogFragment.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0002\r\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\n\u001a\u00020\u000bH\u0017¢\u0006\u0002\u0010\fR\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/investmentstracker/linktypeselection/InvestmentsTrackerLinkTypeDialogFragment;", "Lcom/robinhood/compose/app/GenericComposeBottomSheetDialogFragment;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/investmentstracker/linktypeselection/InvestmentsTrackerLinkTypeDialogFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/investmentstracker/linktypeselection/InvestmentsTrackerLinkTypeDialogFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "Callbacks", "Companion", "feature-investments-tracker_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class InvestmentsTrackerLinkTypeDialogFragment extends GenericComposeBottomSheetDialogFragment {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.investmentstracker.linktypeselection.InvestmentsTrackerLinkTypeDialogFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(InvestmentsTrackerLinkTypeDialogFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/investmentstracker/linktypeselection/InvestmentsTrackerLinkTypeDialogFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: InvestmentsTrackerLinkTypeDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/investmentstracker/linktypeselection/InvestmentsTrackerLinkTypeDialogFragment$Callbacks;", "", "typeSelected", "", "linkType", "Lcom/robinhood/android/investmentstracker/linktypeselection/LinkType;", "feature-investments-tracker_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void typeSelected(LinkType linkType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$2(InvestmentsTrackerLinkTypeDialogFragment investmentsTrackerLinkTypeDialogFragment, int i, Composer composer, int i2) {
        investmentsTrackerLinkTypeDialogFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(125570169);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(125570169, i2, -1, "com.robinhood.android.investmentstracker.linktypeselection.InvestmentsTrackerLinkTypeDialogFragment.ComposeContent (InvestmentsTrackerLinkTypeDialogFragment.kt:21)");
            }
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.investmentstracker.linktypeselection.InvestmentsTrackerLinkTypeDialogFragment$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return InvestmentsTrackerLinkTypeDialogFragment.ComposeContent$lambda$1$lambda$0(this.f$0, (LinkType) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            InvestmentsTrackerLinkTypeDialogScreen.InvestmentsTrackerLinkTypeDialogScreen((Function1) objRememberedValue, null, composerStartRestartGroup, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.investmentstracker.linktypeselection.InvestmentsTrackerLinkTypeDialogFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InvestmentsTrackerLinkTypeDialogFragment.ComposeContent$lambda$2(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1$lambda$0(InvestmentsTrackerLinkTypeDialogFragment investmentsTrackerLinkTypeDialogFragment, LinkType type2) {
        Intrinsics.checkNotNullParameter(type2, "type");
        investmentsTrackerLinkTypeDialogFragment.getCallbacks().typeSelected(type2);
        investmentsTrackerLinkTypeDialogFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* compiled from: InvestmentsTrackerLinkTypeDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/investmentstracker/linktypeselection/InvestmentsTrackerLinkTypeDialogFragment$Companion;", "Lcom/robinhood/android/navigation/DialogFragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/investmentstracker/linktypeselection/InvestmentsTrackerLinkTypeDialogFragment;", "Lcom/robinhood/android/transfers/contracts/InvestmentsTrackerLinkTypeKey;", "<init>", "()V", "feature-investments-tracker_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DialogFragmentResolverWithArgsCompanion<InvestmentsTrackerLinkTypeDialogFragment, InvestmentsTrackerLinkTypeKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.DialogFragmentResolverWithArgsCompanion, com.robinhood.android.navigation.DialogFragmentResolver
        public InvestmentsTrackerLinkTypeDialogFragment createDialogFragment(InvestmentsTrackerLinkTypeKey investmentsTrackerLinkTypeKey) {
            return (InvestmentsTrackerLinkTypeDialogFragment) DialogFragmentResolverWithArgsCompanion.DefaultImpls.createDialogFragment(this, investmentsTrackerLinkTypeKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public InvestmentsTrackerLinkTypeKey getArgs(InvestmentsTrackerLinkTypeDialogFragment investmentsTrackerLinkTypeDialogFragment) {
            return (InvestmentsTrackerLinkTypeKey) DialogFragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, investmentsTrackerLinkTypeDialogFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public InvestmentsTrackerLinkTypeDialogFragment newInstance(InvestmentsTrackerLinkTypeKey investmentsTrackerLinkTypeKey) {
            return (InvestmentsTrackerLinkTypeDialogFragment) DialogFragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, investmentsTrackerLinkTypeKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(InvestmentsTrackerLinkTypeDialogFragment investmentsTrackerLinkTypeDialogFragment, InvestmentsTrackerLinkTypeKey investmentsTrackerLinkTypeKey) {
            DialogFragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, investmentsTrackerLinkTypeDialogFragment, investmentsTrackerLinkTypeKey);
        }
    }
}
