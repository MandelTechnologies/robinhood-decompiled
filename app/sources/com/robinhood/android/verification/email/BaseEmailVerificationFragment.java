package com.robinhood.android.verification.email;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.verification.email.BaseEmailVerificationFragment;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.models.api.GenericErrorResponse;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: BaseEmailVerificationFragment.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001:\u0001\u001eB\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0014H\u0016R\u001b\u0010\u0006\u001a\u00020\u00078TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR!\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/verification/email/BaseEmailVerificationFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "layoutRes", "", "<init>", "(I)V", "callbacks", "Lcom/robinhood/android/verification/email/BaseEmailVerificationFragment$BaseCallbacks;", "getCallbacks", "()Lcom/robinhood/android/verification/email/BaseEmailVerificationFragment$BaseCallbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "errorHandler", "Lcom/robinhood/android/common/util/rx/ActivityErrorHandler;", "Lcom/robinhood/models/db/sheriff/User;", "getErrorHandler", "()Lcom/robinhood/android/common/util/rx/ActivityErrorHandler;", "errorHandler$delegate", "Lkotlin/Lazy;", "onGenericErrorResponse", "", "errorResponse", "Lcom/robinhood/models/api/GenericErrorResponse;", "onLoading", "", "isLoading", "screenDescription", "", "getScreenDescription", "()Ljava/lang/String;", "BaseCallbacks", "feature-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public abstract class BaseEmailVerificationFragment extends BaseFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(BaseEmailVerificationFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/verification/email/BaseEmailVerificationFragment$BaseCallbacks;", 0))};
    public static final int $stable = 8;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: errorHandler$delegate, reason: from kotlin metadata */
    private final Lazy errorHandler;

    /* compiled from: BaseEmailVerificationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/verification/email/BaseEmailVerificationFragment$BaseCallbacks;", "", "handleTooManyRequests", "", "feature-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface BaseCallbacks {
        void handleTooManyRequests();
    }

    public boolean onGenericErrorResponse(GenericErrorResponse errorResponse) {
        Intrinsics.checkNotNullParameter(errorResponse, "errorResponse");
        return false;
    }

    public BaseEmailVerificationFragment(int i) {
        super(i);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(BaseCallbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.verification.email.BaseEmailVerificationFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof BaseEmailVerificationFragment.BaseCallbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.errorHandler = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.verification.email.BaseEmailVerificationFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseEmailVerificationFragment.errorHandler_delegate$lambda$0(this.f$0);
            }
        });
    }

    protected BaseCallbacks getCallbacks() {
        return (BaseCallbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    protected final ActivityErrorHandler<User> getErrorHandler() {
        return (ActivityErrorHandler) this.errorHandler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.robinhood.android.verification.email.BaseEmailVerificationFragment$errorHandler$2$1] */
    public static final BaseEmailVerificationFragment2 errorHandler_delegate$lambda$0(final BaseEmailVerificationFragment baseEmailVerificationFragment) {
        final FragmentActivity fragmentActivityRequireActivity = baseEmailVerificationFragment.requireActivity();
        return new ActivityErrorHandler<User>(fragmentActivityRequireActivity) { // from class: com.robinhood.android.verification.email.BaseEmailVerificationFragment$errorHandler$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(fragmentActivityRequireActivity, true, 0, null, 12, null);
                Intrinsics.checkNotNull(fragmentActivityRequireActivity);
            }

            @Override // com.robinhood.android.common.util.p090rx.ActivityErrorHandler, com.robinhood.android.common.util.p090rx.ContextErrorHandler, com.robinhood.android.util.p275rx.AbsErrorHandler
            protected boolean handleUnknownHttpError(Throwable throwable) {
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                Integer httpStatusCode = Throwables.getHttpStatusCode(throwable);
                if (httpStatusCode != null && httpStatusCode.intValue() == 429) {
                    this.this$0.getCallbacks().handleTooManyRequests();
                    return true;
                }
                return super.handleUnknownHttpError(throwable);
            }

            @Override // com.robinhood.android.util.p275rx.AbsErrorHandler
            public boolean handleErrorResponse(ErrorResponse errorResponse) {
                Intrinsics.checkNotNullParameter(errorResponse, "errorResponse");
                if (errorResponse instanceof GenericErrorResponse) {
                    return this.this$0.onGenericErrorResponse((GenericErrorResponse) errorResponse) || super.handleErrorResponse(errorResponse);
                }
                return super.handleErrorResponse(errorResponse);
            }
        };
    }

    public void onLoading(boolean isLoading) {
        requireToolbar().setLoadingViewVisible(isLoading);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenDescription() {
        return requireBaseActivity().getScreenDescription();
    }
}
