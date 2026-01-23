package com.robinhood.android.lib.stepupverification;

import android.os.Bundle;
import com.robinhood.analytics.SharedEventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.models.stepupverification.VerificationWorkflowResult;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.models.p355ui.pathfinder.contexts.UserViewStateResultContext;
import com.robinhood.rosetta.converters.suv.VerificationWorkflowResults2;
import com.robinhood.rosetta.eventlogging.SUVInfo;
import com.robinhood.shared.support.contracts.ContactSupportFragmentKey;
import com.robinhood.utils.extensions.Activity;
import com.robinhood.utils.moshi.jsonadapter.JsonPrimitives;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VerificationWorkflowActivity.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\u000e\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/lib/stepupverification/VerificationWorkflowActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/SharedEventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/SharedEventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/SharedEventLogger;)V", "verificationWorkflow", "Lcom/robinhood/android/lib/stepupverification/VerificationWorkflow;", "getVerificationWorkflow", "()Lcom/robinhood/android/lib/stepupverification/VerificationWorkflow;", "verificationWorkflow$delegate", "Lkotlin/Lazy;", "requiresAuthentication", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "logVerificationWorkflowResult", "result", "Lcom/robinhood/models/ui/pathfinder/contexts/UserViewStateResultContext;", "Companion", "lib-step-up-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class VerificationWorkflowActivity extends BaseActivity {
    public static final String EXTRA_VERIFICATION_WORKFLOW = "extraVerificationWorkflow";
    public SharedEventLogger eventLogger;

    /* renamed from: verificationWorkflow$delegate, reason: from kotlin metadata */
    private final Lazy verificationWorkflow;
    public static final int $stable = 8;

    public VerificationWorkflowActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.verificationWorkflow = Activity.intentExtra(this, EXTRA_VERIFICATION_WORKFLOW);
    }

    public final SharedEventLogger getEventLogger() {
        SharedEventLogger sharedEventLogger = this.eventLogger;
        if (sharedEventLogger != null) {
            return sharedEventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(SharedEventLogger sharedEventLogger) {
        Intrinsics.checkNotNullParameter(sharedEventLogger, "<set-?>");
        this.eventLogger = sharedEventLogger;
    }

    private final VerificationWorkflow getVerificationWorkflow() {
        return (VerificationWorkflow) this.verificationWorkflow.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public boolean requiresAuthentication() {
        return getAuthManagerDoNotUse().isLoggedIn();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, Navigator.DefaultImpls.createFragment$default(getNavigator(), new ContactSupportFragmentKey.Sassy(getVerificationWorkflow().getFlow(), getVerificationWorkflow().getFlowVersion(), MapsKt.mapOf(Tuples4.m3642to(SuvConstants.PARAM_WORKFLOW_ID, JsonPrimitives.toJsonPrimitive(getVerificationWorkflow().getWorkflowId())))), null, 2, null));
        }
    }

    public final void logVerificationWorkflowResult(UserViewStateResultContext result) {
        SUVInfo.SUVStatus suvInfoProtobuf;
        VerificationWorkflowResult result2;
        Intrinsics.checkNotNullParameter(result, "result");
        SharedEventLogger eventLogger = getEventLogger();
        String string2 = getVerificationWorkflow().getWorkflowId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        UserViewStateResultContext.VerificationWorkflowResultContext verificationWorkflowResultContext = result instanceof UserViewStateResultContext.VerificationWorkflowResultContext ? (UserViewStateResultContext.VerificationWorkflowResultContext) result : null;
        if (verificationWorkflowResultContext == null || (result2 = verificationWorkflowResultContext.getResult()) == null || (suvInfoProtobuf = VerificationWorkflowResults2.toSuvInfoProtobuf(result2)) == null) {
            suvInfoProtobuf = SUVInfo.SUVStatus.SUV_STATUS_UNSPECIFIED;
        }
        SharedEventLogger.DefaultImpls.logAccountSecurityEvent$default(eventLogger, null, new SUVInfo(string2, null, suvInfoProtobuf, null, 10, null), null, null, null, 29, null);
    }
}
