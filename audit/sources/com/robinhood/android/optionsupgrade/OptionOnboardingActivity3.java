package com.robinhood.android.optionsupgrade;

import androidx.view.result.ActivityResultCaller;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.api.utils.extensions.NetworkThrowables;
import com.robinhood.models.api.ErrorResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OptionOnboardingActivity.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.optionsupgrade.OptionOnboardingActivity$goToNextScreen$newJob$1", m3645f = "OptionOnboardingActivity.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingActivity$goToNextScreen$newJob$1, reason: use source file name */
/* loaded from: classes11.dex */
final class OptionOnboardingActivity3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ScreenArgs $currentScreenArgs;
    final /* synthetic */ ScreenRequest $currentScreenRequest;
    int label;
    final /* synthetic */ OptionOnboardingActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionOnboardingActivity3(OptionOnboardingActivity optionOnboardingActivity, ScreenRequest screenRequest, ScreenArgs screenArgs, Continuation<? super OptionOnboardingActivity3> continuation) {
        super(2, continuation);
        this.this$0 = optionOnboardingActivity;
        this.$currentScreenRequest = screenRequest;
        this.$currentScreenArgs = screenArgs;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OptionOnboardingActivity3(this.this$0, this.$currentScreenRequest, this.$currentScreenArgs, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OptionOnboardingActivity3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) throws ScreenError {
        String strTake;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                OptionOnboardingActivity optionOnboardingActivity = this.this$0;
                ScreenRequest screenRequest = this.$currentScreenRequest;
                ScreenArgs screenArgs = this.$currentScreenArgs;
                this.label = 1;
                if (optionOnboardingActivity.goToNextScreenImpl(screenRequest, screenArgs, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        } catch (Throwable th) {
            ActivityResultCaller currentFragment = this.this$0.getCurrentFragment();
            OptionOnboardingScreens optionOnboardingScreens = currentFragment instanceof OptionOnboardingScreens ? (OptionOnboardingScreens) currentFragment : null;
            if (optionOnboardingScreens != null) {
                optionOnboardingScreens.setLoading(false, this.$currentScreenRequest);
            }
            if (th instanceof ScreenError) {
                this.this$0.handleScreenError(th, this.$currentScreenRequest, this.$currentScreenArgs);
            } else {
                EventLogger eventLogger = this.this$0.getEventLogger();
                ErrorResponse errorResponseExtractErrorResponse = NetworkThrowables.extractErrorResponse(th);
                if (errorResponseExtractErrorResponse == null || (strTake = errorResponseExtractErrorResponse.getDisplayMessage()) == null) {
                    strTake = StringsKt.take(th.toString(), 500);
                }
                OptionOnboardingLoggings.logOptionOnboardingGeneralErrorAppear(eventLogger, strTake, this.$currentScreenArgs, this.$currentScreenRequest, this.this$0.getOptionOnboardingScreenContext());
                if (!AbsErrorHandler.handleError$default(this.this$0.getActivityErrorHandler(), th, false, 2, null)) {
                    throw th;
                }
            }
        }
        return Unit.INSTANCE;
    }
}
