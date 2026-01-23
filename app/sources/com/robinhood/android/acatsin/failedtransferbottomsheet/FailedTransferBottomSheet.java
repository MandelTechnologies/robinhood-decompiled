package com.robinhood.android.acatsin.failedtransferbottomsheet;

import android.content.Context;
import android.net.Uri;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import com.robinhood.android.acatsin.failedtransferbottomsheet.FailedTransferBottomSheet;
import com.robinhood.android.navigation.DialogFragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.api.bonfire.AcatsTransferHubBottomSheetDetails;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FailedTransferBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0004\u001a\u00020\u0005H\u0017¢\u0006\u0002\u0010\u0006¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/acatsin/failedtransferbottomsheet/FailedTransferBottomSheet;", "Lcom/robinhood/compose/app/GenericComposeBottomSheetDialogFragment;", "<init>", "()V", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "Companion", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class FailedTransferBottomSheet extends GenericComposeBottomSheetDialogFragment {
    public static final String DIALOG_TAG = "failed_transfer_bottom_sheet";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = GenericComposeBottomSheetDialogFragment.$stable;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(FailedTransferBottomSheet failedTransferBottomSheet, int i, Composer composer, int i2) {
        failedTransferBottomSheet.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* compiled from: FailedTransferBottomSheet.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.acatsin.failedtransferbottomsheet.FailedTransferBottomSheet$ComposeContent$1 */
    static final class C79371 implements Function2<Composer, Integer, Unit> {
        C79371() {
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
                ComposerKt.traceEventStart(-1214664831, i, -1, "com.robinhood.android.acatsin.failedtransferbottomsheet.FailedTransferBottomSheet.ComposeContent.<anonymous> (FailedTransferBottomSheet.kt:14)");
            }
            AcatsTransferHubBottomSheetDetails details = ((FailedTransferBottomSheetKey) FailedTransferBottomSheet.INSTANCE.getArgs((Fragment) FailedTransferBottomSheet.this)).getDetails();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(FailedTransferBottomSheet.this);
            final FailedTransferBottomSheet failedTransferBottomSheet = FailedTransferBottomSheet.this;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.acatsin.failedtransferbottomsheet.FailedTransferBottomSheet$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return FailedTransferBottomSheet.C79371.invoke$lambda$1$lambda$0(failedTransferBottomSheet, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            FailedTransferBottomSheetComposable.FailedTransferBottomSheetComposable(details, null, (Function1) objRememberedValue, composer, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(FailedTransferBottomSheet failedTransferBottomSheet, String str) {
            if (str == null) {
                failedTransferBottomSheet.dismiss();
            } else {
                Navigator navigator = failedTransferBottomSheet.getNavigator();
                Context contextRequireContext = failedTransferBottomSheet.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, Uri.parse(str), null, null, false, null, 60, null);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1625596268);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(this) : composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1625596268, i2, -1, "com.robinhood.android.acatsin.failedtransferbottomsheet.FailedTransferBottomSheet.ComposeContent (FailedTransferBottomSheet.kt:12)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1214664831, true, new C79371(), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.acatsin.failedtransferbottomsheet.FailedTransferBottomSheet$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FailedTransferBottomSheet.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: FailedTransferBottomSheet.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/acatsin/failedtransferbottomsheet/FailedTransferBottomSheet$Companion;", "Lcom/robinhood/android/navigation/DialogFragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/acatsin/failedtransferbottomsheet/FailedTransferBottomSheet;", "Lcom/robinhood/android/acatsin/failedtransferbottomsheet/FailedTransferBottomSheetKey;", "<init>", "()V", "DIALOG_TAG", "", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DialogFragmentResolverWithArgsCompanion<FailedTransferBottomSheet, FailedTransferBottomSheetKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.DialogFragmentResolverWithArgsCompanion, com.robinhood.android.navigation.DialogFragmentResolver
        public FailedTransferBottomSheet createDialogFragment(FailedTransferBottomSheetKey failedTransferBottomSheetKey) {
            return (FailedTransferBottomSheet) DialogFragmentResolverWithArgsCompanion.DefaultImpls.createDialogFragment(this, failedTransferBottomSheetKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public FailedTransferBottomSheetKey getArgs(FailedTransferBottomSheet failedTransferBottomSheet) {
            return (FailedTransferBottomSheetKey) DialogFragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, failedTransferBottomSheet);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public FailedTransferBottomSheet newInstance(FailedTransferBottomSheetKey failedTransferBottomSheetKey) {
            return (FailedTransferBottomSheet) DialogFragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, failedTransferBottomSheetKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(FailedTransferBottomSheet failedTransferBottomSheet, FailedTransferBottomSheetKey failedTransferBottomSheetKey) {
            DialogFragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, failedTransferBottomSheet, failedTransferBottomSheetKey);
        }
    }
}
