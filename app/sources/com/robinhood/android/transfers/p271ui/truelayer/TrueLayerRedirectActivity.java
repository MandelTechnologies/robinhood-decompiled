package com.robinhood.android.transfers.p271ui.truelayer;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.C11839R;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.transfers.contracts.TrueLayerRedirect;
import com.robinhood.android.truelayer.TrueLayerSession;
import com.robinhood.targetbackend.TargetBackend;
import com.robinhood.utils.Either2;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* compiled from: TrueLayerRedirectActivity.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/truelayer/TrueLayerRedirectActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "<init>", "()V", "targetBackend", "Lcom/robinhood/targetbackend/TargetBackend;", "getTargetBackend", "()Lcom/robinhood/targetbackend/TargetBackend;", "setTargetBackend", "(Lcom/robinhood/targetbackend/TargetBackend;)V", "shouldPromptForLockscreen", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class TrueLayerRedirectActivity extends BaseActivity {
    public TargetBackend targetBackend;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public boolean shouldPromptForLockscreen() {
        return false;
    }

    public TrueLayerRedirectActivity() {
        super(C11839R.layout.activity_rds_loading);
    }

    public final TargetBackend getTargetBackend() {
        TargetBackend targetBackend = this.targetBackend;
        if (targetBackend != null) {
            return targetBackend;
        }
        Intrinsics.throwUninitializedPropertyAccessException("targetBackend");
        return null;
    }

    public final void setTargetBackend(TargetBackend targetBackend) {
        Intrinsics.checkNotNullParameter(targetBackend, "<set-?>");
        this.targetBackend = targetBackend;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new TrueLayerRedirectActivity2(new TrueLayerSession(Either2.asRight(this), getTargetBackend()), (TrueLayerRedirect) INSTANCE.getExtras((Activity) this), this, null), 3, null);
    }

    /* compiled from: TrueLayerRedirectActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/truelayer/TrueLayerRedirectActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/transfers/ui/truelayer/TrueLayerRedirectActivity;", "Lcom/robinhood/android/transfers/contracts/TrueLayerRedirect;", "<init>", "()V", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<TrueLayerRedirectActivity, TrueLayerRedirect> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public TrueLayerRedirect getExtras(TrueLayerRedirectActivity trueLayerRedirectActivity) {
            return (TrueLayerRedirect) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, trueLayerRedirectActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, TrueLayerRedirect trueLayerRedirect) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, trueLayerRedirect);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, TrueLayerRedirect trueLayerRedirect) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, trueLayerRedirect);
        }
    }
}
