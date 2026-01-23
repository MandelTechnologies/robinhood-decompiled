package com.robinhood.android.transfers.p271ui.p272v2.alerts;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.fragment.app.Fragment;
import bff_money_movement.service.p019v1.TransferActionDto;
import bff_money_movement.service.p019v1.TransferValidationErrorDetailsDto;
import com.robinhood.android.navigation.DialogFragmentResolverWithArgsCompanion;
import com.robinhood.compose.app.GenericComposeDialogFragment;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
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

/* compiled from: ValidationAlertComposeFragment.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\n\u001a\u00020\u000bH\u0017¢\u0006\u0002\u0010\fR\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/v2/alerts/ValidationAlertComposeFragment;", "Lcom/robinhood/compose/app/GenericComposeDialogFragment;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/transfers/ui/v2/alerts/ValidationAlertCallbacks;", "getCallbacks", "()Lcom/robinhood/android/transfers/ui/v2/alerts/ValidationAlertCallbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "Fragment", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class ValidationAlertComposeFragment extends GenericComposeDialogFragment {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(ValidationAlertCallbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.transfers.ui.v2.alerts.ValidationAlertComposeFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ValidationAlertComposeFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/transfers/ui/v2/alerts/ValidationAlertCallbacks;", 0))};

    /* renamed from: Fragment, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$4(ValidationAlertComposeFragment validationAlertComposeFragment, int i, Composer composer, int i2) {
        validationAlertComposeFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    private final ValidationAlertCallbacks getCallbacks() {
        return (ValidationAlertCallbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.compose.app.GenericComposeDialogFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-432729434);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-432729434, i2, -1, "com.robinhood.android.transfers.ui.v2.alerts.ValidationAlertComposeFragment.ComposeContent (ValidationAlertComposeFragment.kt:13)");
            }
            TransferValidationErrorDetailsDto alertInfo = ((ValidationAlertArgs) INSTANCE.getArgs((Fragment) this)).getAlertInfo();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.transfers.ui.v2.alerts.ValidationAlertComposeFragment$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ValidationAlertComposeFragment.ComposeContent$lambda$1$lambda$0(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.transfers.ui.v2.alerts.ValidationAlertComposeFragment$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ValidationAlertComposeFragment.ComposeContent$lambda$3$lambda$2(this.f$0, (TransferActionDto) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            ValidationAlertPopup.ValidationAlertPopup(alertInfo, function0, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.ui.v2.alerts.ValidationAlertComposeFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ValidationAlertComposeFragment.ComposeContent$lambda$4(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1$lambda$0(ValidationAlertComposeFragment validationAlertComposeFragment) {
        validationAlertComposeFragment.dismiss();
        validationAlertComposeFragment.getCallbacks().onDismiss(((ValidationAlertArgs) INSTANCE.getArgs((Fragment) validationAlertComposeFragment)).getLeavingEditMode());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$3$lambda$2(ValidationAlertComposeFragment validationAlertComposeFragment, TransferActionDto action) {
        Intrinsics.checkNotNullParameter(action, "action");
        validationAlertComposeFragment.dismiss();
        validationAlertComposeFragment.getCallbacks().onAlertSelected(((ValidationAlertArgs) INSTANCE.getArgs((Fragment) validationAlertComposeFragment)).getLeavingEditMode(), action);
        return Unit.INSTANCE;
    }

    /* compiled from: ValidationAlertComposeFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/v2/alerts/ValidationAlertComposeFragment$Fragment;", "Lcom/robinhood/android/navigation/DialogFragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/transfers/ui/v2/alerts/ValidationAlertComposeFragment;", "Lcom/robinhood/android/transfers/ui/v2/alerts/ValidationAlertArgs;", "<init>", "()V", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.ui.v2.alerts.ValidationAlertComposeFragment$Fragment, reason: from kotlin metadata */
    public static final class Companion implements DialogFragmentResolverWithArgsCompanion<ValidationAlertComposeFragment, ValidationAlertArgs> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.DialogFragmentResolverWithArgsCompanion, com.robinhood.android.navigation.DialogFragmentResolver
        public ValidationAlertComposeFragment createDialogFragment(ValidationAlertArgs validationAlertArgs) {
            return (ValidationAlertComposeFragment) DialogFragmentResolverWithArgsCompanion.DefaultImpls.createDialogFragment(this, validationAlertArgs);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public ValidationAlertArgs getArgs(ValidationAlertComposeFragment validationAlertComposeFragment) {
            return (ValidationAlertArgs) DialogFragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, validationAlertComposeFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public ValidationAlertComposeFragment newInstance(ValidationAlertArgs validationAlertArgs) {
            return (ValidationAlertComposeFragment) DialogFragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, validationAlertArgs);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(ValidationAlertComposeFragment validationAlertComposeFragment, ValidationAlertArgs validationAlertArgs) {
            DialogFragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, validationAlertComposeFragment, validationAlertArgs);
        }
    }
}
