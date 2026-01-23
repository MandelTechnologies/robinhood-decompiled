package com.robinhood.android.cortex.digest.portfolio.detail;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.cortex.digest.common.C12073R;
import com.robinhood.android.cortex.digest.common.feedback.DigestFeedbackItem;
import com.robinhood.android.cortex.digest.common.feedback.DigestFeedbackType;
import com.robinhood.android.cortex.digest.portfolio.PortfolioDigestDestinations4;
import com.robinhood.android.cortex.digest.portfolio.PortfolioDigestDestinations5;
import com.robinhood.android.cortex.digest.portfolio.PortfolioDigestDestinations6;
import com.robinhood.android.cortex.digest.portfolio.feedback.PortfolioDigestFeedbackSheetComposable;
import com.robinhood.android.cortex.models.feedback.DigestFeedback;
import com.robinhood.android.designsystem.snackbar.RdsSnackbar;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.navigation.compose.LifecycleAwareNavigator;
import com.robinhood.android.navigation.compose.destination.DialogDestinationWithArgs;
import com.robinhood.android.navigation.compose.destination.SheetDestinationWithArgs;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PortfolioDigestDetailComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.cortex.digest.portfolio.detail.PortfolioDigestDetailComposableKt$PortfolioDigestDetailComposable$1$1$1$2$1$1$5$1 */
/* loaded from: classes2.dex */
final class C12131xa236dea6 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    final /* synthetic */ PortfolioDigestDestinations4.Args $args;
    final /* synthetic */ Context $context;
    final /* synthetic */ DigestFeedback $feedback;
    final /* synthetic */ LifecycleAwareNavigator $navigator;
    final /* synthetic */ View $view;

    C12131xa236dea6(LifecycleAwareNavigator lifecycleAwareNavigator, Context context, View view, DigestFeedback digestFeedback, PortfolioDigestDestinations4.Args args) {
        this.$navigator = lifecycleAwareNavigator;
        this.$context = context;
        this.$view = view;
        this.$feedback = digestFeedback;
        this.$args = args;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
        invoke(lazyItemScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(LifecycleAwareNavigator lifecycleAwareNavigator, Context context, View view, PortfolioDigestDestinations6.Result result) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(result, "result");
        if (result instanceof PortfolioDigestDestinations6.Result.Error) {
            PortfolioDigestDestinations5 portfolioDigestDestinations5 = PortfolioDigestDestinations5.INSTANCE;
            String string2 = context.getString(C11048R.string.general_error_summary);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            LifecycleAwareNavigator.navigate$default(lifecycleAwareNavigator, (DialogDestinationWithArgs) portfolioDigestDestinations5, (Parcelable) new PortfolioDigestDestinations5.Args.Message(0, string2, 1, null), false, (Function1) null, 12, (Object) null);
        } else {
            if (!(result instanceof PortfolioDigestDestinations6.Result.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            RdsSnackbar.INSTANCE.make(view, C12073R.string.cortex_digest_feedback_success, -1).setLeadingIcon(C20690R.drawable.ic_rds_checkmark_24dp).show();
        }
        return Unit.INSTANCE;
    }

    public final void invoke(LazyItemScope item, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1121868052, i, -1, "com.robinhood.android.cortex.digest.portfolio.detail.PortfolioDigestDetailComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PortfolioDigestDetailComposable.kt:190)");
        }
        composer.startReplaceGroup(-1746271574);
        boolean zChanged = composer.changed(this.$navigator) | composer.changedInstance(this.$context) | composer.changedInstance(this.$view);
        final LifecycleAwareNavigator lifecycleAwareNavigator = this.$navigator;
        final Context context = this.$context;
        final View view = this.$view;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.cortex.digest.portfolio.detail.PortfolioDigestDetailComposableKt$PortfolioDigestDetailComposable$1$1$1$2$1$1$5$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C12131xa236dea6.invoke$lambda$1$lambda$0(lifecycleAwareNavigator, context, view, (PortfolioDigestDestinations6.Result) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        PortfolioDigestFeedbackSheetComposable.ObserveDigestFeedbackSheetResult((Function1) objRememberedValue, composer, 0);
        DigestFeedback digestFeedback = this.$feedback;
        composer.startReplaceGroup(-1633490746);
        boolean zChanged2 = composer.changed(this.$navigator) | composer.changedInstance(this.$args);
        final LifecycleAwareNavigator lifecycleAwareNavigator2 = this.$navigator;
        final PortfolioDigestDestinations4.Args args = this.$args;
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function2() { // from class: com.robinhood.android.cortex.digest.portfolio.detail.PortfolioDigestDetailComposableKt$PortfolioDigestDetailComposable$1$1$1$2$1$1$5$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C12131xa236dea6.invoke$lambda$3$lambda$2(lifecycleAwareNavigator2, args, (DigestFeedbackType) obj, (DigestFeedback) obj2);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        DigestFeedbackItem.DigestFeedbackItem(digestFeedback, (Function2) objRememberedValue2, null, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(LifecycleAwareNavigator lifecycleAwareNavigator, PortfolioDigestDestinations4.Args args, DigestFeedbackType type2, DigestFeedback feedback) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(feedback, "feedback");
        LifecycleAwareNavigator.navigate$default(lifecycleAwareNavigator, (SheetDestinationWithArgs) PortfolioDigestDestinations6.INSTANCE, (Parcelable) new PortfolioDigestDestinations6.Args(feedback, type2, Screen.Name.PORTFOLIO_DIGEST_DETAIL, args.getDigest().getAccountNumber(), args.getDigest().getDigestId(), args.getSource()), false, (Function1) null, 12, (Object) null);
        return Unit.INSTANCE;
    }
}
