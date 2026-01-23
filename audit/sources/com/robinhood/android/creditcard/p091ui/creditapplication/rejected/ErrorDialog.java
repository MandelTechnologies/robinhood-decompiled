package com.robinhood.android.creditcard.p091ui.creditapplication.rejected;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.creditcard.C12201R;
import com.robinhood.android.creditcard.p091ui.creditapplication.loggingUtils;
import com.robinhood.android.creditcard.p091ui.creditapplication.rejected.ErrorDialog;
import com.robinhood.android.models.creditcard.api.graphql.ClaimSolidGoldCashPrizeResponse2;
import com.robinhood.android.regiongate.CreditCardRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.compose.app.GenericComposeDialogFragment;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ErrorDialog.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00102\u00020\u00012\u00020\u0002:\u0002\u000f\u0010B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0005\u001a\u00020\u0006H\u0017¢\u0006\u0002\u0010\u0007J\t\u0010\b\u001a\u00020\tH\u0096\u0001R\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/rejected/ErrorDialog;", "Lcom/robinhood/compose/app/GenericComposeDialogFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Args", "Companion", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class ErrorDialog extends GenericComposeDialogFragment implements RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(CreditCardRegionGate.INSTANCE);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: ErrorDialog.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClaimSolidGoldCashPrizeResponse2.values().length];
            try {
                iArr[ClaimSolidGoldCashPrizeResponse2.ALREADY_CLAIMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClaimSolidGoldCashPrizeResponse2.NOT_SOLID_GOLD_ELIGIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(ErrorDialog errorDialog, int i, Composer composer, int i2) {
        errorDialog.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    @Override // com.robinhood.compose.app.GenericComposeDialogFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1124063535);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1124063535, i2, -1, "com.robinhood.android.creditcard.ui.creditapplication.rejected.ErrorDialog.ComposeContent (ErrorDialog.kt:30)");
            }
            EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            Ref.IntRef intRef = new Ref.IntRef();
            intRef.element = C11048R.string.error_title;
            Ref.IntRef intRef2 = new Ref.IntRef();
            intRef2.element = C11048R.string.error_description_something_went_wrong;
            int i3 = WhenMappings.$EnumSwitchMapping$0[((Args) INSTANCE.getArgs((Fragment) this)).getError().ordinal()];
            if (i3 == 1) {
                intRef.element = C12201R.string.credit_app_solid_gold_offer_error_already_claimed_title;
                intRef2.element = C12201R.string.credit_app_solid_gold_offer_error_already_claimed_message;
            } else if (i3 == 2) {
                intRef.element = C12201R.string.credit_app_solid_gold_offer_error_not_eligible_title;
                intRef2.element = C12201R.string.credit_app_solid_gold_offer_error_not_eligible_message;
            }
            BentoTheme2.BentoTheme(Boolean.FALSE, null, Boolean.TRUE, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-1978746231, true, new C125251(intRef, intRef2, current, this), composerStartRestartGroup, 54), composerStartRestartGroup, 100663686, 250);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.creditapplication.rejected.ErrorDialog$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ErrorDialog.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: ErrorDialog.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.rejected.ErrorDialog$ComposeContent$1 */
    static final class C125251 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Ref.IntRef $body;
        final /* synthetic */ EventLogger $eventLogger;
        final /* synthetic */ Ref.IntRef $title;
        final /* synthetic */ ErrorDialog this$0;

        C125251(Ref.IntRef intRef, Ref.IntRef intRef2, EventLogger eventLogger, ErrorDialog errorDialog) {
            this.$title = intRef;
            this.$body = intRef2;
            this.$eventLogger = eventLogger;
            this.this$0 = errorDialog;
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
                ComposerKt.traceEventStart(-1978746231, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.rejected.ErrorDialog.ComposeContent.<anonymous> (ErrorDialog.kt:47)");
            }
            String strStringResource = StringResources_androidKt.stringResource(this.$title.element, composer, 0);
            BentoAlertDialog2.Body.Text text = new BentoAlertDialog2.Body.Text(StringResources_androidKt.stringResource(this.$body.element, composer, 0));
            String strStringResource2 = StringResources_androidKt.stringResource(C11048R.string.general_label_dismiss, composer, 0);
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.this$0);
            final EventLogger eventLogger = this.$eventLogger;
            final ErrorDialog errorDialog = this.this$0;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.rejected.ErrorDialog$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ErrorDialog.C125251.invoke$lambda$1$lambda$0(eventLogger, errorDialog);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoAlertButton bentoAlertButton = new BentoAlertButton(strStringResource2, (Function0) objRememberedValue);
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(this.this$0);
            final ErrorDialog errorDialog2 = this.this$0;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.rejected.ErrorDialog$ComposeContent$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ErrorDialog.C125251.invoke$lambda$3$lambda$2(errorDialog2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            BentoAlertDialog.BentoAlertDialog(strStringResource, text, bentoAlertButton, null, null, null, false, null, (Function0) objRememberedValue2, composer, (BentoAlertDialog2.Body.Text.$stable << 3) | (BentoAlertButton.$stable << 6), EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(EventLogger eventLogger, ErrorDialog errorDialog) {
            loggingUtils.logDismiss(eventLogger, new Component(Component.ComponentType.ALERT, null, null, 6, null));
            errorDialog.dismiss();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(ErrorDialog errorDialog) {
            errorDialog.dismiss();
            return Unit.INSTANCE;
        }
    }

    /* compiled from: ErrorDialog.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/rejected/ErrorDialog$Args;", "Landroid/os/Parcelable;", "error", "Lcom/robinhood/android/models/creditcard/api/graphql/ClaimSolidGoldCashPrizeError;", "<init>", "(Lcom/robinhood/android/models/creditcard/api/graphql/ClaimSolidGoldCashPrizeError;)V", "getError", "()Lcom/robinhood/android/models/creditcard/api/graphql/ClaimSolidGoldCashPrizeError;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final ClaimSolidGoldCashPrizeResponse2 error;

        /* compiled from: ErrorDialog.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(ClaimSolidGoldCashPrizeResponse2.valueOf(parcel.readString()));
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
            dest.writeString(this.error.name());
        }

        public Args(ClaimSolidGoldCashPrizeResponse2 error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
        }

        public final ClaimSolidGoldCashPrizeResponse2 getError() {
            return this.error;
        }
    }

    /* compiled from: ErrorDialog.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/rejected/ErrorDialog$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/creditcard/ui/creditapplication/rejected/ErrorDialog;", "Lcom/robinhood/android/creditcard/ui/creditapplication/rejected/ErrorDialog$Args;", "<init>", "()V", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<ErrorDialog, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(ErrorDialog errorDialog) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, errorDialog);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public ErrorDialog newInstance(Args args) {
            return (ErrorDialog) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(ErrorDialog errorDialog, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, errorDialog, args);
        }
    }
}
