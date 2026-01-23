package com.robinhood.android.rhymigration.p245ui;

import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.rosetta.eventlogging.AgreementContext;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.RHYContext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyOnboardingLoggingUtils.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a(\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002*\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0000\u001a,\u0010\u0000\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0002*\u00020\b2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0000\u001a,\u0010\u0000\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0002*\u00020\t2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0000¨\u0006\n"}, m3636d2 = {"getEventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "Lcom/robinhood/android/rhymigration/ui/RhyOnboardingActivity;", "agreementContext", "Lcom/robinhood/rosetta/eventlogging/AgreementContext;", "entryPoint", "", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/common/ui/BaseBottomSheetDialogFragment;", "feature-rhy-migration_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.rhymigration.ui.RhyOnboardingLoggingUtilsKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class RhyOnboardingLoggingUtils {
    public static /* synthetic */ Context getEventContext$default(RhyOnboardingActivity rhyOnboardingActivity, AgreementContext agreementContext, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            agreementContext = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return getEventContext(rhyOnboardingActivity, agreementContext, str);
    }

    public static final Context getEventContext(RhyOnboardingActivity rhyOnboardingActivity, AgreementContext agreementContext, String str) {
        Intrinsics.checkNotNullParameter(rhyOnboardingActivity, "<this>");
        return new Context(0, 0, 0, null, null, null, null, Context.ProductTag.RHY_MIGRATION, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, agreementContext, null, null, null, null, null, null, null, null, null, null, null, null, rhyOnboardingActivity.getRhyGlobalLoggingContext().rhyContext(RHYContext.ProductArea.RHY_ONBOARDING, rhyOnboardingActivity.getCardSelectionProductTag$feature_rhy_migration_externalDebug(), str == null ? rhyOnboardingActivity.getSource$feature_rhy_migration_externalDebug() : str), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -129, -1073741825, -2049, -1, -1, -1, 16383, null);
    }

    public static /* synthetic */ Context getEventContext$default(BaseFragment baseFragment, AgreementContext agreementContext, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            agreementContext = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return getEventContext(baseFragment, agreementContext, str);
    }

    public static final Context getEventContext(BaseFragment baseFragment, AgreementContext agreementContext, String str) {
        Intrinsics.checkNotNullParameter(baseFragment, "<this>");
        FragmentActivity activity = baseFragment.getActivity();
        RhyOnboardingActivity rhyOnboardingActivity = activity instanceof RhyOnboardingActivity ? (RhyOnboardingActivity) activity : null;
        if (rhyOnboardingActivity != null) {
            return getEventContext(rhyOnboardingActivity, agreementContext, str);
        }
        return null;
    }

    public static /* synthetic */ Context getEventContext$default(BaseBottomSheetDialogFragment baseBottomSheetDialogFragment, AgreementContext agreementContext, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            agreementContext = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return getEventContext(baseBottomSheetDialogFragment, agreementContext, str);
    }

    public static final Context getEventContext(BaseBottomSheetDialogFragment baseBottomSheetDialogFragment, AgreementContext agreementContext, String str) {
        Intrinsics.checkNotNullParameter(baseBottomSheetDialogFragment, "<this>");
        FragmentActivity activity = baseBottomSheetDialogFragment.getActivity();
        RhyOnboardingActivity rhyOnboardingActivity = activity instanceof RhyOnboardingActivity ? (RhyOnboardingActivity) activity : null;
        if (rhyOnboardingActivity != null) {
            return getEventContext(rhyOnboardingActivity, agreementContext, str);
        }
        return null;
    }
}
