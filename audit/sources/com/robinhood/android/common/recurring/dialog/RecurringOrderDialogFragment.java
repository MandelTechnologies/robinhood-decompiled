package com.robinhood.android.common.recurring.dialog;

import android.content.Context;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.recurring.trade.confirmation.RecurringOrderConfirmationFragment;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.common.util.extensions.Contexts7;
import com.robinhood.android.designsystem.colorscheme.ColorSchemeManager;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.designsystem.style.ColorScheme;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringOrderDialogFragment.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0002\u0011\u0012B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/dialog/RecurringOrderDialogFragment;", "Lcom/robinhood/android/common/ui/RhDialogFragment;", "fromInsights", "", RecurringOrderConfirmationFragment.ARG_IS_BROKERAGE_CASH_TRANSFER, "<init>", "(ZZ)V", "colorSchemeManager", "Lcom/robinhood/android/designsystem/colorscheme/ColorSchemeManager;", "getColorSchemeManager", "()Lcom/robinhood/android/designsystem/colorscheme/ColorSchemeManager;", "setColorSchemeManager", "(Lcom/robinhood/android/designsystem/colorscheme/ColorSchemeManager;)V", "onAttach", "", "context", "Landroid/content/Context;", "RecurringOrderDialogBuilder", "Companion", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class RecurringOrderDialogFragment extends RhDialogFragment {
    public ColorSchemeManager colorSchemeManager;
    private final boolean fromInsights;
    private final boolean isBrokerageCashTransfer;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public RecurringOrderDialogFragment(boolean z, boolean z2) {
        this.fromInsights = z;
        this.isBrokerageCashTransfer = z2;
    }

    public final ColorSchemeManager getColorSchemeManager() {
        ColorSchemeManager colorSchemeManager = this.colorSchemeManager;
        if (colorSchemeManager != null) {
            return colorSchemeManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("colorSchemeManager");
        return null;
    }

    public final void setColorSchemeManager(ColorSchemeManager colorSchemeManager) {
        Intrinsics.checkNotNullParameter(colorSchemeManager, "<set-?>");
        this.colorSchemeManager = colorSchemeManager;
    }

    @Override // com.robinhood.android.common.p088ui.RhDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, com.robinhood.hammer.android.fragment.HammerDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        if (this.fromInsights) {
            final ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
            ScarletManager scarletManager = ScarletManager2.getScarletManager(scarletContextWrapper);
            AchromaticOverlay achromaticOverlay = AchromaticOverlay.INSTANCE;
            ScarletManager.putOverlay$default(scarletManager, achromaticOverlay, null, 2, null);
            LifecycleHost.DefaultImpls.bind$default(this, Contexts7.requireBaseActivityBaseContext(scarletContextWrapper).getDayNightStyleChanges(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.recurring.dialog.RecurringOrderDialogFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RecurringOrderDialogFragment.onAttach$lambda$2$lambda$0(scarletContextWrapper, (DayNightOverlay) obj);
                }
            });
            LifecycleHost.DefaultImpls.bind$default(this, getColorSchemeManager().getChanges(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.recurring.dialog.RecurringOrderDialogFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RecurringOrderDialogFragment.onAttach$lambda$2$lambda$1(scarletContextWrapper, (Tuples2) obj);
                }
            });
            if (this.isBrokerageCashTransfer) {
                ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(scarletContextWrapper), achromaticOverlay, null, 2, null);
            }
            setScarletContextWrapper(scarletContextWrapper);
            return;
        }
        ScarletContextWrapper scarletContextWrapper2 = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper2);
        if (this.isBrokerageCashTransfer) {
            ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(scarletContextWrapper2), AchromaticOverlay.INSTANCE, null, 2, null);
        }
        setScarletContextWrapper(scarletContextWrapper2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttach$lambda$2$lambda$0(ScarletContextWrapper scarletContextWrapper, DayNightOverlay dayNightOverlay) {
        Intrinsics.checkNotNullParameter(dayNightOverlay, "dayNightOverlay");
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(scarletContextWrapper), dayNightOverlay, null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttach$lambda$2$lambda$1(ScarletContextWrapper scarletContextWrapper, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        ScarletManager2.getScarletManager(scarletContextWrapper).putOverlay((ColorScheme) tuples2.component1(), Boolean.valueOf(!((Boolean) tuples2.component2()).booleanValue()));
        return Unit.INSTANCE;
    }

    /* compiled from: RecurringOrderDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/dialog/RecurringOrderDialogFragment$RecurringOrderDialogBuilder;", "Lcom/robinhood/android/common/ui/RhDialogFragment$Builder;", "context", "Landroid/content/Context;", "fromInsights", "", RecurringOrderConfirmationFragment.ARG_IS_BROKERAGE_CASH_TRANSFER, "<init>", "(Landroid/content/Context;ZZ)V", "createDialogFragment", "Lcom/robinhood/android/common/ui/RhDialogFragment;", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class RecurringOrderDialogBuilder extends RhDialogFragment.Builder {
        public static final int $stable = RhDialogFragment.Builder.$stable;
        private final boolean fromInsights;
        private final boolean isBrokerageCashTransfer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RecurringOrderDialogBuilder(Context context, boolean z, boolean z2) {
            super(context);
            Intrinsics.checkNotNullParameter(context, "context");
            this.fromInsights = z;
            this.isBrokerageCashTransfer = z2;
        }

        @Override // com.robinhood.android.common.ui.RhDialogFragment.Builder
        protected RhDialogFragment createDialogFragment() {
            return new RecurringOrderDialogFragment(this.fromInsights, this.isBrokerageCashTransfer);
        }
    }

    /* compiled from: RecurringOrderDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/dialog/RecurringOrderDialogFragment$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/common/recurring/dialog/RecurringOrderDialogFragment$RecurringOrderDialogBuilder;", "context", "Landroid/content/Context;", "fromInsights", "", RecurringOrderConfirmationFragment.ARG_IS_BROKERAGE_CASH_TRANSFER, "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final RecurringOrderDialogBuilder create(Context context, boolean fromInsights, boolean isBrokerageCashTransfer) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new RecurringOrderDialogBuilder(context, fromInsights, isBrokerageCashTransfer);
        }
    }
}
